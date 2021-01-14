package com.template.client.screen

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
import com.template.client.di.injector.Injector
import com.template.client.di.injector.InjectorProvider
import com.template.client.di.injector.InjectorTarget
import com.template.client.screen.viewmodel.FragmentBaseViewModel

/**
 * Base class for all fragments
 */
abstract class BaseFragment<BINDING : ViewBinding, VIEW_MODEL : FragmentBaseViewModel, INJECTOR_TARGET : InjectorTarget,
        INJECTOR : Injector<INJECTOR_TARGET>>(
    private val viewModelFactory: ViewModelProvider.Factory,
    private val fragmentFactory: FragmentFactory
) : Fragment(), ViewModelBindingScreenWithInjector<BINDING, VIEW_MODEL, INJECTOR_TARGET, INJECTOR>,
    InjectorTarget, ViewModelCreator<VIEW_MODEL> {

    override lateinit var binding: BINDING
    override lateinit var viewModel: VIEW_MODEL
    override var injector: INJECTOR? = null

    protected abstract fun createBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        attachToRoot: Boolean
    ): BINDING

    override fun onCreate(savedInstanceState: Bundle?) {
        inject()
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

    private fun inject() {
        inject(requireContext().applicationContext as? InjectorProvider)
    }

    private fun createViewModel(): VIEW_MODEL = createViewModel(viewModelStore, viewModelFactory)

    override fun onDestroy() {
        super.onDestroy()
        injector = null
    }

    fun <T> LiveData<T>.observe(observer: (T) -> Unit) {
        observe(viewLifecycleOwner, Observer { observer(it) })
    }
}