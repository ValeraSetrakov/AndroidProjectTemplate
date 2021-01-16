package com.template.library.client.screen

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.viewbinding.ViewBinding
import com.template.library.client.di.injector.Injector
import com.template.library.client.di.injector.InjectorProvider
import com.template.library.client.di.injector.InjectorTarget
import com.template.library.client.screen.viewmodel.BaseViewModel

/**
 * Base interface for screen with view biding
 */
interface BindingScreen<BINDING : ViewBinding> {
    var binding: BINDING
}

/**
 * Base interface for screen with view model
 */
interface ViewModelScreen<VIEW_MODEL : BaseViewModel> {
    var viewModel: VIEW_MODEL
}

/**
 * interface for marker class that can create view models
 */
interface ViewModelCreator<VIEW_MODEL : BaseViewModel> {
    val viewModelClazz: Class<VIEW_MODEL>

    fun createViewModel(
        store: ViewModelStore,
        factory: ViewModelProvider.Factory
    ): VIEW_MODEL = createViewModel(store, factory, viewModelClazz)

    fun <T : BaseViewModel> createViewModel(
        store: ViewModelStore,
        factory: ViewModelProvider.Factory,
        viewModelClazz: Class<T>
    ): T = ViewModelProvider(store, factory)[viewModelClazz]
}

/**
 * Base interface for screen with injector
 */
interface InjectableScreen<INJECTOR_TARGET : InjectorTarget, INJECTOR : Injector<INJECTOR_TARGET>> {
    var injector: INJECTOR?

    fun inject(injectorProvider: InjectorProvider?) {
        injectorProvider?.let {
            injector = it.provide(this::class.java as Class<INJECTOR_TARGET>)
            injector?.inject(this as INJECTOR_TARGET)
        }
    }

    fun freeInjector() {
        injector = null
    }
}

/**
 * Combination of view model and binding screen interface
 */
interface ViewModelBindingScreen<BINDING : ViewBinding, VIEW_MODEL : BaseViewModel> :
    BindingScreen<BINDING>, ViewModelScreen<VIEW_MODEL>

/**
 * Combination of view model, binding and injector screen interface
 */
interface ViewModelBindingScreenWithInjector<BINDING : ViewBinding, VIEW_MODEL : BaseViewModel,
        INJECTOR_TARGET : InjectorTarget, INJECTOR : Injector<INJECTOR_TARGET>> :
    ViewModelBindingScreen<BINDING, VIEW_MODEL>, InjectableScreen<INJECTOR_TARGET, INJECTOR>