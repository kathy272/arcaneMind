package com.cc221023.arcanemind

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room

import com.cc221023.arcanemind.data.TarotDatabase
import com.cc221023.arcanemind.ui.MainView
import com.cc221023.arcanemind.ui.MainViewModel
import com.cc221023.arcanemind.ui.theme.ArcaneMindTheme

class MainActivity : ComponentActivity() {
    private val db by lazy {
      Room.databaseBuilder(this, TarotDatabase::class.java, "TarotDatabase.db")
          .build()
    }

    private val mainViewModel by viewModels<MainViewModel>(
        factoryProducer ={
        object: ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return MainViewModel(db.tarotDao()) as T
            }
        }


    }
            )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArcaneMindTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                   // color = MaterialTheme.colorScheme.background
                ) {
                    MainView(mainViewModel)
                }
            }
        }
    }
}

