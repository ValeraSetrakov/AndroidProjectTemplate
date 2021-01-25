package com.template.app.features.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.postDelayed
import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.ConcatAdapter
import com.template.library.client.screen.BaseFragment
import com.template.screen_marvel.databinding.FragmentListBinding
import javax.inject.Inject

class ListFragment @Inject constructor(
    viewModelFactory: ViewModelProvider.Factory,
    fragmentFactory: FragmentFactory
) : BaseFragment<FragmentListBinding, ListFragmentViewModel>(viewModelFactory, fragmentFactory) {

    override val viewModelClazz: Class<ListFragmentViewModel> = ListFragmentViewModel::class.java

    override fun createBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        attachToRoot: Boolean
    ): FragmentListBinding {
        return FragmentListBinding.inflate(
            inflater,
            container,
            attachToRoot
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.items.observe {
            val items1 = it.first
            val items2 = it.second
            val item1Adapter = Item1Adapter(items1)
            val item2Adapter = Item2Adapter(items2)
            val adapter = ConcatAdapter(item1Adapter, item2Adapter)
            binding.list.adapter = adapter
        }

        binding.list.postDelayed(3_000) {
            viewModel.generateItems()
        }
    }
}