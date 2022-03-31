package com.geeksforgeeks.jcnestedscrolling

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // Creating a Simple Scaffold Layout for the application
            Scaffold(

                // Creating a Top Bar
                topBar = { TopAppBar(title = { Text("GFG | Nested Scrolling", color = Color.White) }, backgroundColor = Color(0xff0f9d58)) },

                // Creating Content
                content = {

                    // Creating a Column Layout
                    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

                        // Creating a Scrollable Box
                        Box(modifier = Modifier.background(Color.LightGray).verticalScroll(rememberScrollState()).padding(32.dp)) {
                            Column {

                                // Create 6 Scrollable Boxes
                                repeat(6) {
                                    Box(modifier = Modifier.height(128.dp).verticalScroll(rememberScrollState())) {

                                        // Creating a Text in each Box
                                        Text(
                                            "Scroll here",
                                            modifier = Modifier
                                                .border(12.dp, Color.DarkGray)
                                                .padding(24.dp)
                                                .height(150.dp)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            )
        }
    }
}
