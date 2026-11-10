package com.example.navegar.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.navegar.R
import com.example.navegar.ui.theme.NavegarTheme

@Composable
fun SecondScreen(
    modifier: Modifier = Modifier,
    message: String = "",
    onBack: () -> Unit = {},
    onNext: () -> Unit = {}
) {
    NavigationScreen(
        modifier = modifier,
        title = stringResource(R.string.second_title),
        message = message,
        backLabel = stringResource(R.string.back_action),
        onBack = onBack,
        primaryLabel = stringResource(R.string.continue_action),
        onNext = onNext
    )
}

@Preview(name = "SecondScreen", showBackground = true)
@Composable
private fun SecondScreenPreview() {
    NavegarTheme {
        SecondScreen()
    }
}
