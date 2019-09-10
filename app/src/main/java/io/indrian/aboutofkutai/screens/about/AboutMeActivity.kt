package io.indrian.aboutofkutai.screens.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.indrian.aboutofkutai.R
import io.indrian.aboutofkutai.di.GlideApp
import kotlinx.android.synthetic.main.activity_about_me.*

class AboutMeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        setupToolbar()

        GlideApp.with(this)
            .load("https://www.dicoding.com/images/small/avatar/20180416174705e83b17c2d731f0c6c2a083628e917482.jpg")
            .into(imgUser)
    }

    private fun setupToolbar() {

        supportActionBar?.run {

            title = getString(R.string.about_me)
            setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {

        finish()
        return true
    }
}
