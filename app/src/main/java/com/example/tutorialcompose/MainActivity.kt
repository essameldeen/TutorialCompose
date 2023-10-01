package com.example.tutorialcompose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink
import com.example.tutorialcompose.deep_link.SecondScreen
import com.example.tutorialcompose.deep_link.StartScreen
import com.example.tutorialcompose.navigation_drawer.NavigationDrawerScreen
import com.example.tutorialcompose.paging.ScreenPaging

import com.example.tutorialcompose.ui.theme.TutorialComposeTheme
import com.example.tutorialcompose.vertical_grid.VerticalGridScreen

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TutorialComposeTheme {
                //ScreenPaging()
                //ScreenBottomSheet()
                //NavigationDrawerScreen()
                //VerticalGridScreen()

                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "home") {

                    composable("home") {
                        StartScreen(navController)
                    }
                    composable("secondScreen", deepLinks = listOf(
                        navDeepLink {
                            uriPattern = "https://pl-coding.com/{id}"
                            action = Intent.ACTION_VIEW
                        }
                    ),
                        arguments = listOf(
                            navArgument("id") {
                                type = NavType.IntType
                                defaultValue = -1
                            }
                        )
                    ) { entry ->
                        val id = entry.arguments?.getInt("id")
                        SecondScreen(navController,id)
                    }


                }
            }
        }
    }
}

