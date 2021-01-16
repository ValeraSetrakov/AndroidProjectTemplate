package com.template.library.client.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.template.library.client.di.injector.InjectorTarget
import com.template.library.client.screen.viewmodel.FragmentBaseViewModel

/**
 * Base class for all fragments
 */
abstract class BaseFragment<BINDING : ViewBinding, VIEW_MODEL : FragmentBaseViewModel>(
    private val viewModelFactory: ViewModelProvider.Factory,
    private val fragmentFactory: FragmentFactory
) : Fragment(), ViewModelBindingScreen<BINDING, VIEW_MODEL>,
    InjectorTarget, ViewModelCreator<VIEW_MODEL> {

    override lateinit var binding: BINDING
    override lateinit var viewModel: VIEW_MODEL

    protected abstract fun createBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        attachToRoot: Boolean
    ): BINDING

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = createViewModel()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = createBinding(inflater, container, false)
        return binding.root
    }

    private fun createViewModel(): VIEW_MODEL = createViewModel(viewModelStore, viewModelFactory)

    fun <T> LiveData<T>.observe(observer: (T) -> Unit) {
        observe(viewLifecycleOwner, Observer { observer(it) })
    }
}