package com.example.navigar.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigar.R
import com.example.navigar.ui.theme.NavigarTheme

@Composable
fun FirstScreen(
    modifier: Modifier = Modifier,
    onBack: () -> Unit = {},
    onNext: () -> Unit = {}
) {
    NavigationScreen(
        modifier = modifier,
        title = stringResource(R.string.first_title),
        backLabel = stringResource(R.string.back_action),
        onBack = onBack,
        primaryLabel = stringResource(R.string.continue_action),
        onNext = onNext
    )
}

@Preview(name = "FirstScreen", showBackground = true)
@Composable
private fun FirstScreenPreview() {
    NavigarTheme {
        FirstScreen()
    }
}
