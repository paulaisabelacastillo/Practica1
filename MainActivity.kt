package com.example.practica1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize().padding(10.dp)) {
                Row(modifier = Modifier.fillMaxWidth().weight(1f)) {
                    Caja("Rojo", Color(0xFFC62828), Modifier.weight(1f).fillMaxHeight())
                    Caja("Azul", Color(0xFF1565C0), Modifier.weight(1f).fillMaxHeight())
                    Caja("Verde", Color(0xFF2E7D32), Modifier.weight(1f).fillMaxHeight())
                    Caja("Amarillo", Color(0xFFFBC02D), Modifier.weight(1f).fillMaxHeight())
                }

                Spacer(modifier = Modifier.height(10.dp))

                Column(modifier = Modifier.fillMaxWidth().weight(1f)) {
                    Caja("Rojo", Color(0xFFC62828), Modifier.fillMaxWidth().weight(1f))
                    Caja("Azul", Color(0xFF1565C0), Modifier.fillMaxWidth().weight(1f))
                    Caja("Verde", Color(0xFF2E7D32), Modifier.fillMaxWidth().weight(1f))
                    Caja("Amarillo", Color(0xFFFBC02D), Modifier.fillMaxWidth().weight(1f))
                }
            }
        }
    }
}

@Composable
fun Caja(nombre: String, color: Color, mod: Modifier) {
    Box(
        modifier = mod.background(color),
        contentAlignment = Alignment.Center
    ) {
        Text(text = nombre, color = Color.White)
    }
}
