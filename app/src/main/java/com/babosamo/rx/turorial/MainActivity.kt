package com.babosamo.rx.turorial

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var viewStatus: ViewStatus = ViewStatus.HOME
        set(value) {
            updateUi(value)
            field = value
        }


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                viewStatus = ViewStatus.HOME
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_observable-> {
                viewStatus = ViewStatus.OBSERVABLE
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_operator -> {
                viewStatus = ViewStatus.OPERATOR
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private fun updateUi(viewStatus: ViewStatus) {
        when (viewStatus) {
            ViewStatus.HOME -> {
                view_home.visibility = View.VISIBLE
                view_observable.visibility = View.GONE
                view_operator.visibility = View.GONE
            }
            ViewStatus.OBSERVABLE -> {
                view_home.visibility = View.GONE
                view_observable.visibility = View.VISIBLE
                view_operator.visibility = View.GONE
            }
            ViewStatus.OPERATOR -> {
                view_home.visibility = View.GONE
                view_observable.visibility = View.GONE
                view_operator.visibility = View.VISIBLE

            }
        }
    }
}
