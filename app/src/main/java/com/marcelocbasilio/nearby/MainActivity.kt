package com.marcelocbasilio.nearby

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.marcelocbasilio.nearby.ui.screen.HomeScreen
import com.marcelocbasilio.nearby.ui.screen.SplashScreen
import com.marcelocbasilio.nearby.ui.screen.WelcomeScreen
import com.marcelocbasilio.nearby.ui.theme.NearbyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NearbyTheme {
//                SplashScreen(onNavigateToWelcome = {})
//                WelcomeScreen(onNavigateToHome = {})
                HomeScreen(onNavigateToMarketDetails = {})
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NearbyTheme {
        Greeting("Android")
    }
}