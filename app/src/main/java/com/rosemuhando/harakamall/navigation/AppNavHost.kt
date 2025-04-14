package com.rosemuhando.harakamall.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rosemuhando.harakamall.ui.screens.contact.ContactScreen
import com.rosemuhando.harakamall.ui.screens.dashboard.DashboardScreen
import com.rosemuhando.harakamall.ui.screens.form.FormScreen
import com.rosemuhando.harakamall.ui.screens.home.HomeScreen
import com.rosemuhando.harakamall.ui.screens.intent.IntentScreen
import com.rosemuhando.harakamall.ui.screens.item.ItemScreen
import com.rosemuhando.harakamall.ui.screens.service.ServiceScreen
import com.rosemuhando.harakamall.ui.screens.splash.SplashScreen
import com.rosemuhando.harakamall.ui.screens.start.StartScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }

            composable(ROUT_SPLASH) {
                SplashScreen(navController)
            }
        composable(ROUT_FORM) {
            FormScreen(navController)
        }
    }
}

@Composable
fun AboutScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}