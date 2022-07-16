package com.example.androiddevchallenge.ui.screens.login

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.components.EditText
import com.example.androiddevchallenge.ui.components.ImageWithBackground
import com.example.androiddevchallenge.ui.components.TextWithBackground
import com.example.androiddevchallenge.ui.theme.columnModifier
import com.example.androiddevchallenge.ui.theme.purple200
import com.example.androiddevchallenge.ui.theme.textStyle

@Composable
fun LoginScreen() {
    Surface(color = MaterialTheme.colors.background) {
        Column(
            columnModifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            ImageWithBackground(
                painter = painterResource(id = R.drawable.logo),
                backgroundDrawableResId = R.drawable.bg_art
            )
            Text(
                text = stringResource(R.string.sign_in),
                style = textStyle,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(48.dp))
            val (title, setTitle) = remember { mutableStateOf("") }
            EditText(
                title,
                setTitle,
                stringResource(R.string.temp_user),
                R.drawable.ic_person_outline_24px,
                false
            )
            Spacer(modifier = Modifier.height(10.dp))
            val (password, setPassword) = remember { mutableStateOf("") }
            EditText(
                password,
                setPassword,
                stringResource(R.string.password),
                R.drawable.ic_lock_outline_24px,
                true
            )
            Spacer(modifier = Modifier.height(22.dp))
            Button(
                onClick = { },
                Modifier.defaultMinSize(
                    minWidth = 280.dp,
                    minHeight = (60.dp)
                ),
                colors = ButtonDefaults.buttonColors(backgroundColor = purple200),
                shape = RoundedCornerShape(50),
                contentPadding = PaddingValues(
                    start = 20.dp,
                    top = 12.dp,
                    end = 20.dp,
                    bottom = 12.dp
                )
            ) {
                Icon(
                    Icons.Filled.Send,
                    contentDescription = "send",
                    modifier = Modifier.size(ButtonDefaults.IconSize),
                    tint = Color.White
                )
            }

            Spacer(modifier = Modifier.weight(1f))
            TextWithBackground(
                stringResource(R.string.new_account_lbl),
                R.drawable.footer_art,
            )
        }
    }
}