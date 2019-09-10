package io.indrian.aboutofkutai.screens.main.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.github.ajalt.timberkt.Timber.d

import io.indrian.aboutofkutai.R
import io.indrian.aboutofkutai.screens.detail.DetailActivity
import io.indrian.aboutofkutai.screens.main.adapter.AboutKutaiAdapter
import io.indrian.aboutofkutai.utils.toGone
import io.indrian.aboutofkutai.utils.toVisible
import kotlinx.android.synthetic.main.fragment_abouts_kutai.*
import org.koin.android.ext.android.inject

class AboutsKutaiFragment : Fragment(), AboutKutaiAdapter.OnClickItemListener, SwipeRefreshLayout.OnRefreshListener {

    private val viewModel: AboutsKutaiVM by inject()
    private val mAdapter = AboutKutaiAdapter(this)
    private val stateObserver = Observer<AboutsKutaiState> { state ->

        when (state) {

            is AboutsKutaiState.Loading -> {

                d { "AboutKutaiState: Loading" }
                swipeLayout.isRefreshing = true
                rvAbouts.toGone()
                textError.toGone()
                mAdapter.clear()
            }

            is AboutsKutaiState.LoadedAbouts -> {

                d { "AboutKutaiState: Loaded" }
                swipeLayout.isRefreshing = false
                rvAbouts.toVisible()
                textError.toGone()
                mAdapter.add(state.abouts)
            }

            is AboutsKutaiState.Error -> {

                d { "AboutKutaiState: Error ${state.throwable.message}" }
                swipeLayout.isRefreshing = false
                rvAbouts.toGone()
                textError.toVisible()
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_abouts_kutai, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
        viewModel.aboutsKutaiState.observe(this, stateObserver)
        viewModel.getAbouts()
    }

    private fun setupView() {


        rvAbouts.apply {

            layoutManager = LinearLayoutManager(context)
            adapter = mAdapter
            setHasFixedSize(true)
        }
        swipeLayout.setOnRefreshListener { onRefresh() }
    }

    override fun onRefresh() {

        viewModel.getAbouts()
    }

    override fun onClickItem(id: Int) {

        d { "click $id" }

        val intent = Intent(context, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_ID, id)
        startActivity(intent)
    }

    override fun onDestroy() {

        viewModel.aboutsKutaiState.removeObserver(stateObserver)
        super.onDestroy()
    }
}
