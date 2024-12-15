package com.example.materialdesign.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF3600CE), // Cor principal (para botões, por exemplo)
    onPrimary = Color.White, // Cor do texto ou ícones sobre a cor primária
    secondary = Color(0xFF76B2FF), // Cor secundária
    onSecondary = Color.Black,
    background = Color(0xFFFFFFFF), // Fundo padrão da aplicação
    surface = Color(0xFFFFFFFF), // Fundo dos cards ou superfícies elevadas
    onSurface = Color.Black // Texto ou ícones em superfícies
)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF6000D9),
    onPrimary = Color.Black,
    secondary = Color(0xFF00BCD4),
    onSecondary = Color.Black,
    background = Color(0xFF121212),
    surface = Color(0xFF1E1E1E),
    onSurface = Color.White
)

@Composable
fun MaterialDesignTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}