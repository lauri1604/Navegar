package com.example.navigar.ui
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavegarApp() {
    val navController = rememberNavController()
    val navegarViewModel: NavegarViewModel = viewModel()

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = NavegarRoute.Start,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(NavegarRoute.Start) {
                StartScreen(
                    onNext = {
                        navegarViewModel.incrementarContador()
                        navController.navigate(NavegarRoute.First)
                    }
                )
            }

            composable(NavegarRoute.First) {
                FirstScreen(
                    onBack = { navController.popBackStack() },
                    onNext = {
                        navegarViewModel.incrementarContador()
                        navController.navigate(NavegarRoute.Second)
                    }
                )
            }

            composable(NavegarRoute.Second) {
                SecondScreen(
                    onBack = { navController.popBackStack() },
                    onNext = {
                        navegarViewModel.incrementarContador()
                        navController.navigate(NavegarRoute.Finish)
                    }
                )
            }

            composable(NavegarRoute.Finish) {
                FinishScreen(
                    onBack = { navController.popBackStack() },
                    onFinish = {
                        navegarViewModel.reiniciarContador()
                        navController.navigate(NavegarRoute.Start) {
                            popUpTo(NavegarRoute.Start) {
                                inclusive = true
                            }
                        }
                    }
                )
            }
        }
    }
}

private object NavegarRoute {
    const val Start = "start"
    const val First = "first"
    const val Second = "second"
    const val Finish = "finish"
}
