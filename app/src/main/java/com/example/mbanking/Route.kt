package com.example.mbanking

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "LoginPage") {
        composable ("LoginPage") { LoginPage (navController = navController) }
        composable ("transfer") {Transfer (navController = navController) }
        composable ("TransferBSI") {TransferBSI (navController = navController) }
        composable ("TransferAntarBank") { TransferAntarBank (navController = navController) }
        composable ("confirmation") { Confirmation (navController = navController) }
        composable ("Success") { Success (navController = navController) }
    }
}