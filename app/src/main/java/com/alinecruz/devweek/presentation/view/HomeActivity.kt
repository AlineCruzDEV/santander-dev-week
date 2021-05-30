package com.alinecruz.devweek.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alinecruz.devweek.R
import com.alinecruz.devweek.di.SetupGlobalDependencies

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //SetupGlobalDependencies(this).init()
    }

}