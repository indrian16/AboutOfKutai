package io.indrian.aboutofkutai.screens.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import io.indrian.aboutofkutai.R
import io.indrian.aboutofkutai.screens.about.AboutMeActivity
import io.indrian.aboutofkutai.screens.main.fragments.AboutsKutaiFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupToolbar()
        supportFragmentManager.beginTransaction()
            .add(R.id.mainFrame, AboutsKutaiFragment())
            .commit()
    }

    private fun setupToolbar() {

        setSupportActionBar(toolbar).apply {

            title = getString(R.string.app_name)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when (item?.itemId) {

            R.id.menuAbout -> {

                startActivity(Intent(this, AboutMeActivity::class.java))
            }
        }

        return super.onOptionsItemSelected(item)
    }
}
