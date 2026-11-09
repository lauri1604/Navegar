package com.example.navigar.ui
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigar.R
import com.example.navigar.ui.theme.NavigarTheme

@Composable
fun StartScreen(
    modifier: Modifier = Modifier,
    onNext: () -> Unit = {}
) {
    NavigationScreen(
        modifier = modifier,
        title = stringResource(R.string.start_title),
        primaryLabel = stringResource(R.string.start_action),
        onNext = onNext
    )
}

@Preview(name = "StartScreen", showBackground = true)
@Composable
private fun StartScreenPreview() {
    NavigarTheme {
        StartScreen()
    }
}
