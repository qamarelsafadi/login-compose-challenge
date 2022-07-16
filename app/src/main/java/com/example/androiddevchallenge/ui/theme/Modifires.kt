package com.example.androiddevchallenge.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

val logoModifier =
    Modifier.wrapContentSize(
        Alignment.Center,
        false
    ).padding(top = 26.dp)

val footerModifier =
    Modifier.wrapContentSize(
        Alignment.Center,
        false
    ).padding(bottom = 16.dp)

val columnModifier = Modifier
    .background(bg)
    .fillMaxHeight()



