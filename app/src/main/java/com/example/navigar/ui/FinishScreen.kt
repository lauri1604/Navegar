package com.example.navigar.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigar.R
import com.example.navigar.ui.theme.NavigarTheme

@Composable
fun FinishScreen(
    modifier: Modifier = Modifier,
    onBack: () -> Unit = {},
    onFinish: () -> Unit = {}
) {
    NavigationScreen(
        modifier = modifier,
        title = stringResource(R.string.finish_title),
        backLabel = stringResource(R.string.back_action),
        onBack = onBack,
        primaryLabel = stringResource(R.string.finish_action),
        onNext = onFinish
    )
}

@Preview(name = "FinishScreen", showBackground = true)
@Composable
private fun FinishScreenPreview() {
    NavigarTheme {
        FinishScreen()
    }
}
