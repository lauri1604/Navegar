package com.example.navegar.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.navegar.R
import com.example.navegar.ui.theme.NavegarTheme

@Composable
fun FinishScreen(
    modifier: Modifier = Modifier,
    message: String = "",
    onBack: () -> Unit = {},
    onFinish: () -> Unit = {}
) {
    NavigationScreen(
        modifier = modifier,
        title = stringResource(R.string.finish_title),
        message = message,
        backLabel = stringResource(R.string.back_action),
        onBack = onBack,
        primaryLabel = stringResource(R.string.finish_action),
        onNext = onFinish
    )
}

@Preview(name = "FinishScreen", showBackground = true)
@Composable
private fun FinishScreenPreview() {
    NavegarTheme {
        FinishScreen()
    }
}
