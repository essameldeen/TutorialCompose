package com.example.tutorialcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.Scaffold
import com.example.tutorialcompose.bottom_sheet.ScreenBottomSheet
import com.example.tutorialcompose.navigation_drawer.NavigationDrawerScreen
import com.example.tutorialcompose.paging.ScreenPaging

import com.example.tutorialcompose.ui.theme.TutorialComposeTheme
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TutorialComposeTheme {
                //ScreenPaging()
                //ScreenBottomSheet()
                NavigationDrawerScreen()

            }
        }
    }
}

