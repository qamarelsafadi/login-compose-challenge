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
import com.example.androiddevchallenge.ui.theme.paddingBottom
import com.example.androiddevchallenge.ui.theme.paddingTop

@Composable
fun ImageWithBackground(
    painter: Painter,
    @DrawableRes backgroundDrawableResId: Int,
    modifier: Modifier = Modifier,
    alignment: Alignment = Alignment.Center,
    contentScale: ContentScale = ContentScale.Fit,
    alpha: Float = DefaultAlpha,
    colorFilter: ColorFilter? = null
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
            modifier = paddingTop.align(Alignment.TopCenter)
        )

    }
}

@Composable
fun TextWithBackground(
    text: String,
    @DrawableRes backgroundDrawableResId: Int,
    modifier: Modifier = Modifier,
    alignment: Alignment = Alignment.Center,
    contentScale: ContentScale = ContentScale.Fit,
    alpha: Float = DefaultAlpha,
    colorFilter: ColorFilter? = null
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
            modifier = paddingBottom.align(Alignment.BottomCenter)

        )

    }
}