package io.indrian.aboutofkutai.screens.detail

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.github.ajalt.timberkt.Timber.d
import io.indrian.aboutofkutai.R
import io.indrian.aboutofkutai.di.GlideApp
import io.indrian.aboutofkutai.utils.toGone
import io.indrian.aboutofkutai.utils.toVisible
import kotlinx.android.synthetic.main.activity_detail.*
import org.koin.android.ext.android.inject

class DetailActivity : AppCompatActivity() {

    companion object {

        const val EXTRA_ID = "extra_id"
    }

    private val viewModel: DetailVM by inject()

    @SuppressLint("SetTextI18n")
    private val detailStateObserver = Observer<DetailState> { state ->

        when (state) {

            is DetailState.Loading -> {

                d { "DetailState: Loading" }
                progressBar.toVisible()
                tvTitle.text = ""
                tvBody.text = ""
            }

            is DetailState.Loaded -> {

                d { "DetailState: Loaded" }
                progressBar.toGone()
                tvTitle.text = state.aboutKutai.title
                tvBody.text = state.aboutKutai.body
                GlideApp.with(this)
                    .load(state.aboutKutai.imageUrl)
                    .into(aboutImage)
                continueRead(state.aboutKutai.source)
            }

            is DetailState.Error -> {

                d { "DetailState: Error" }
                progressBar.toGone()
                tvTitle.text = "Error"
                tvBody.text = "Error"
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        setupToolbar()

        viewModel.detailState.observe(this, detailStateObserver)
        viewModel.getAbout(intent.getIntExtra(EXTRA_ID, 0))

    }

    private fun setupToolbar() {

        supportActionBar?.run {

            title = getString(R.string.detail)
            setDisplayHomeAsUpEnabled(true)
        }

    }

    private fun continueRead(source: String) {

        btnRead.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(source))
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {

        finish()
        return true
    }

    override fun onDestroy() {

        viewModel.detailState.removeObserver(detailStateObserver)
        super.onDestroy()
    }
}
