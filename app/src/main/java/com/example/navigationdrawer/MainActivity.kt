package com.example.navigationdrawer

import android.app.Notification.Action
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var toggle : ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        val navigationView = findViewById<NavigationView>(R.id.navigationView)

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navigationView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.mItemOne -> Toast.makeText(this, "One", Toast.LENGTH_SHORT).show()
                R.id.mItemTwo -> Toast.makeText(this, "Two", Toast.LENGTH_SHORT).show()
                R.id.mItemThree -> Toast.makeText(this, "Three", Toast.LENGTH_SHORT).show()
                R.id.mItemFour -> Toast.makeText(this, "Four", Toast.LENGTH_SHORT).show()
                R.id.mItemFive -> Toast.makeText(this, "five", Toast.LENGTH_SHORT).show()
                R.id.mItemSix -> Toast.makeText(this, "six", Toast.LENGTH_SHORT).show()
            }
            true
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
         if(toggle.onOptionsItemSelected(item)){
            return true
        }

        return super.onOptionsItemSelected(item)

    }
}