package com.comic.client.screen

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.comic.client.di.injector.Injector
import com.comic.client.di.injector.InjectorProvider
import com.comic.client.di.injector.InjectorTarget
import com.comic.client.screen.viewmodel.ActivityComicViewModel
import javax.inject.Inject

/**
 * Base class for all activities
 */
abstract class ComicActivity<
        BINDING : ViewBinding,
        VIEW_MODEL : ActivityComicViewModel,
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

    override fun onCreate(savedInstanceState: Bundle?) {
        inject()
        supportFragmentManager.fragmentFactory = this.fragmentFactory
        super.onCreate(savedInstanceState)
        viewModel = createViewModel()
        binding = createBinding(inflater = layoutInflater)
        setContentView(binding.root)
    }

    private fun inject() = inject(application as? InjectorProvider)

    private fun createViewModel(): VIEW_MODEL =
        createViewModel(viewModelStore, viewModelFactory)

    override fun onDestroy() {
        super.onDestroy()
        injector = null
    }
}