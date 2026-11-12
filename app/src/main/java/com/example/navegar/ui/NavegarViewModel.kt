package com.example.navegar.ui
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class NavegarViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(NavegarUIState())
    val uiState: StateFlow<NavegarUIState> = _uiState.asStateFlow()

    fun incrementarContador() {
        _uiState.update { currentState ->
            currentState.copy(numPantalla = currentState.numPantalla + 1)
        }
    }
}
