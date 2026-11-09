# MEMORY.md — Navegar
Memoria del proyecto entre sesiones. Máximo ~50 líneas: resume o elimina lo que ya no
aporte.
## Estado actual
- Proyecto Android con Jetpack Compose; paquete base `com.example.navigar`.
- El nombre del proyecto Gradle y el nombre visible de la app son `Navegar`; el identificador técnico permanece como `com.example.navigar`.
- Estructura inicial: `docs`, `model`, `ui` (incluye `ui.theme`) y `MainActivity`.
- `MainActivity` conserva el punto de entrada; el contenido Compose está en `ui/NavegarApp.kt`.
- La app tiene `StartScreen.kt`, `FirstScreen.kt`, `SecondScreen.kt` y `FinishScreen.kt`, cada una con su preview individual.
- `NavigationScreen.kt` contiene el diseño común; `NavegarApp` conecta las rutas con Navigation Compose y el `NavegarViewModel`.
- Las pantallas muestran solo los títulos simples `Pantalla`, `Pantalla 1`, `Pantalla 2` y `Pantalla final`.
## Decisiones
- Mantener `theme` como subpaquete de `ui`, separado del composable principal.
- `model` queda preparado como paquete, sin lógica hasta definir la app.
- Los botones Next incrementan el contador del ViewModel y navegan; Back usa `popBackStack()`.
- Mantener los textos de interfaz en `strings.xml`.