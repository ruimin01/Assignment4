package com.example.assignment4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assignment4.ui.theme.Assignment4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp(){
    val appModifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    val inputMargin = Modifier.padding(start = 16.dp)
    Column (
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        Text(text = "My Title",
            style = MaterialTheme.typography.titleLarge,
            modifier = appModifier)
        OutlinedTextField(value = "", onValueChange = {}, modifier = inputMargin )
        Button(onClick = { /*TODO*/ },
            modifier = appModifier,

            ) {
            Text(text = "Finish")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment4Theme {
        MyApp()
    }
}