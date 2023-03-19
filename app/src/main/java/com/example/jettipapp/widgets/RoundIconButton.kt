package com.example.jettipapp.widgets

import android.graphics.Color
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val IconButtonSizeModifer = Modifier.size(40.dp)

@Composable
fun RoundIConButton(
    modifier: Modifier = Modifier,
    imageVector: ImageVector,
    onclick: () -> Unit,
    tint: androidx.compose.ui.graphics.Color = androidx.compose.ui.graphics.Color.Black.copy(alpha = 0.8f),
    backgroundColor: androidx.compose.ui.graphics.Color = MaterialTheme.colors.background,
    elevation: Dp = 4.dp
) {

    Card(
        modifier = modifier
            .padding(all = 4.dp)
            .clickable { onclick.invoke() }
            .then(IconButtonSizeModifer),
        shape = CircleShape,
        backgroundColor = backgroundColor,
        elevation = elevation
    ) {
        Icon(
            imageVector = imageVector, contentDescription = "Plus or Minus",
            tint = tint
        )
    }

}