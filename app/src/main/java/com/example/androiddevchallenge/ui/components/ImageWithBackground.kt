package com.example.androiddevchallenge.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.labelTextStyle
import com.example.androiddevchallenge.ui.theme.footerModifier
import com.example.androiddevchallenge.ui.theme.logoModifier

@Composable
fun ImageWithBackground(
    painter: Painter,
    @DrawableRes backgroundDrawableResId: Int
) {
    Box(
        Modifier.wrapContentSize(Alignment.TopCenter)
    ) {
        Image(
            painterResource(backgroundDrawableResId),
            contentDescription = "",
            Modifier.offset(y = -55.dp),
            contentScale = ContentScale.Crop,
        )
        Image(
            painter,
            contentDescription = "",
            modifier = logoModifier.align(Alignment.TopCenter)
        )

    }
}

@Composable
fun TextWithBackground(
    text: String,
    @DrawableRes backgroundDrawableResId: Int,
) {
    Box(
        Modifier.wrapContentSize(Alignment.TopCenter)

    ) {
        Image(
            painterResource(backgroundDrawableResId),
            contentDescription = "",
            Modifier.offset(y = 55.dp).fillMaxWidth(),
            contentScale = ContentScale.Crop,
        )
        Text(
            text,
            style = labelTextStyle,
            modifier = footerModifier.align(Alignment.BottomCenter)

        )

    }
}