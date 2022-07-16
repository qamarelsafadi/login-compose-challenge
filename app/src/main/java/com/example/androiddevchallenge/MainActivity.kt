/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Sell
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.VerifiedUser
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import androidx.core.content.ContextCompat
import com.example.androiddevchallenge.ui.components.EditText
import com.example.androiddevchallenge.ui.components.ImageWithBackground
import com.example.androiddevchallenge.ui.components.TextWithBackground
import com.example.androiddevchallenge.ui.theme.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            this.window.statusBarColor = ContextCompat.getColor(this,R.color.white)
            MyTheme {
                MyApp()
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp() {
    Surface(color = MaterialTheme.colors.background) {
        Column(
            Modifier
                .background(bg)
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            ImageWithBackground(
                painter = painterResource(id = R.drawable.logo),
                backgroundDrawableResId = R.drawable.bg_art
            )
            Text(
                text = "Sign in",
                style = textStyle,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(48.dp))
            val (title, setTitle) = remember { mutableStateOf("") }
            EditText(
                title,
                setTitle,
                "johnsondoe",
                R.drawable.ic_person_outline_24px,
                false
            )
            Spacer(modifier = Modifier.height(10.dp))
            val (password, setPassword) = remember { mutableStateOf("") }
            EditText(
                password,
                setPassword,
                "password",
                R.drawable.ic_lock_outline_24px,
                true
            )
            Spacer(modifier = Modifier.height(22.dp))
            Button(
                onClick = { /* ... */ },
                Modifier.defaultMinSize(
                    minWidth = 280.dp,
                    minHeight = (60.dp)
                ),
                colors = ButtonDefaults.buttonColors(backgroundColor = purple200),
                shape = RoundedCornerShape(50),
                // Uses ButtonDefaults.ContentPadding by default
                contentPadding = PaddingValues(
                    start = 20.dp,
                    top = 12.dp,
                    end = 20.dp,
                    bottom = 12.dp
                )
            ) {
                Icon(
                    Icons.Filled.Send,
                    contentDescription = "Favorite",
                    modifier = Modifier.size(ButtonDefaults.IconSize),
                    tint = Color.White
                )
            }

            Spacer(modifier = Modifier.weight(1f))
            TextWithBackground(
                "I am new here, i need an accountz",
                R.drawable.footer_art,
            )
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp()
    }
}
