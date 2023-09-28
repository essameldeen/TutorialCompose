package com.example.tutorialcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.tutorialcompose.paging.ScreenPaging

import com.example.tutorialcompose.ui.theme.TutorialComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TutorialComposeTheme {
                ScreenPaging()
            }
        }
    }
}

