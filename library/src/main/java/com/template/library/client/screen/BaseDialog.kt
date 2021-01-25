package com.template.library.client.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.template.library.client.di.injector.InjectorTarget
import com.template.library.client.screen.viewmodel.DialogBaseViewModel

/**
 * Base class for all dialogs
 */
abstract class BaseDialog<BINDING : ViewBinding, VIEW_MODEL : DialogBaseViewModel>(
        private val viewModelFactory: ViewModelProvider.Factory
) : DialogFragment(), ViewModelBindingScreen<BINDING, VIEW_MODEL>,
        InjectorTarget, ViewModelCreator<VIEW_MODEL> {

    override lateinit var binding: BINDING
    override lateinit var viewModel: VIEW_MODEL

    protected abstract fun createBinding(
            inflater: LayoutInflater,
            container: ViewGroup?,
            attachToRoot: Boolean
    ): BINDING

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = createViewModel()
    }

    @CallSuper
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
        observe(viewLifecycleOwner) { observer(it) }
    }
}