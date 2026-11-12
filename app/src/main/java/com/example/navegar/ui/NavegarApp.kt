package com.example.navegar.ui
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.res.stringResource
import com.example.navegar.R

@Composable
fun NavegarApp() {
    val navController = rememberNavController()
    val navegarViewModel: NavegarViewModel = viewModel()
    val uiState by navegarViewModel.uiState.collectAsStateWithLifecycle()
    val message = stringResource(
        when (uiState.numPantalla) {
            0 -> R.string.message_initial
            1 -> R.string.message_second
            2 -> R.string.message_third
            else -> R.string.message_final
        }
    )

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = NavegarRoute.Start,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(NavegarRoute.Start) {
                StartScreen(
                    message = message,
                    onNext = {
                        navegarViewModel.incrementarContador()
                        navController.navigate(NavegarRoute.First)
                    }
                )
            }

            composable(NavegarRoute.First) {
                FirstScreen(
                    message = message,
                    onBack = { navController.popBackStack() },
                    onNext = {
                        navegarViewModel.incrementarContador()
                        navController.navigate(NavegarRoute.Second)
                    }
                )
            }

            composable(NavegarRoute.Second) {
                SecondScreen(
                    message = message,
                    onBack = { navController.popBackStack() },
                    onNext = {
                        navegarViewModel.incrementarContador()
                        navController.navigate(NavegarRoute.Finish)
                    }
                )
            }

            composable(NavegarRoute.Finish) {
                FinishScreen(
                    message = message,
                    onBack = { navController.popBackStack() },
                    onFinish = {
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
