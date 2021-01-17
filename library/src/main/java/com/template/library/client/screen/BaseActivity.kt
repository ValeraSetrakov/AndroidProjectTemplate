package com.template.library.client.screen

import android.os.Bundle
import android.view.LayoutInflater
import androidx.annotation.CallSuper
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.template.library.client.di.injector.Injector
import com.template.library.client.di.injector.InjectorProvider
import com.template.library.client.di.injector.InjectorTarget
import com.template.library.client.screen.viewmodel.ActivityBaseViewModel
import javax.inject.Inject

/**
 * Base class for all activities
 */
abstract class BaseActivity<
        BINDING : ViewBinding,
        VIEW_MODEL : ActivityBaseViewModel,
        INJECTOR_TARGET : InjectorTarget,
        INJECTOR : Injector<INJECTOR_TARGET>> :
    AppCompatActivity(),
    ViewModelBindingScreenWithInjector<BINDING, VIEW_MODEL, INJECTOR_TARGET, INJECTOR>,
    ViewModelCreator<VIEW_MODEL>,
    InjectorTarget {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    @Inject
    lateinit var fragmentFactory: FragmentFactory
    override lateinit var viewModel: VIEW_MODEL
    override lateinit var binding: BINDING
    override var injector: INJECTOR? = null

    protected abstract fun createBinding(inflater: LayoutInflater): BINDING

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        inject()
        supportFragmentManager.fragmentFactory = this.fragmentFactory
        super.onCreate(savedInstanceState)
        viewModel = createViewModel()
        binding = createBinding()
        setContentView(binding.root)
        if (savedInstanceState == null) {
            onFirstCreate()
        }
    }

    private fun inject() = inject(application as? InjectorProvider)

    private fun createViewModel(): VIEW_MODEL {
        return createViewModel(viewModelStore, viewModelFactory)
    }

    private fun createBinding(): BINDING {
        return createBinding(inflater = layoutInflater)
    }

    /**
     * Called when activity first create (if savedInstanceState == null)
     */
    protected open fun onFirstCreate() {}

    @CallSuper
    override fun onDestroy() {
        super.onDestroy()
        freeInjector()
    }
}