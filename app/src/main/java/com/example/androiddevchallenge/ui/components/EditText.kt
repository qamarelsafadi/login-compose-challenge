package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.bg
import com.example.androiddevchallenge.ui.theme.textEditTextStyle
import com.example.androiddevchallenge.ui.theme.txtColor

@Composable
fun EditText(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String? = "",
    icon: Int,
    isPassword: Boolean
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        shape = RoundedCornerShape(50),
        modifier = Modifier
            .border(
                BorderStroke(width = 1.dp, color = bg)
            ),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        textStyle = textEditTextStyle,
        placeholder = {
            Text(
                text = placeholder!!,
                style = textEditTextStyle
            )
        },
        leadingIcon = {
            Icon(
                painterResource(id = icon),
                "",
                tint = txtColor
            )
        },
        visualTransformation = if (!isPassword) VisualTransformation.None else PasswordVisualTransformation(),
        singleLine = true
    )
}