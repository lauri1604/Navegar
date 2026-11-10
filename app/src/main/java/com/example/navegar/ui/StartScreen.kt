package com.example.navegar.ui
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.navegar.R
import com.example.navegar.ui.theme.NavegarTheme

@Composable
fun StartScreen(
    modifier: Modifier = Modifier,
    message: String = "",
    onNext: () -> Unit = {}
) {
    NavigationScreen(
        modifier = modifier,
        title = stringResource(R.string.start_title),
        message = message,
        primaryLabel = stringResource(R.string.start_action),
        onNext = onNext
    )
}

@Preview(name = "StartScreen", showBackground = true)
@Composable
private fun StartScreenPreview() {
    NavegarTheme {
        StartScreen()
    }
}
