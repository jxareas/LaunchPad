package com.uxstate.launchpad.presentation.screens.details_screen.compents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.uxstate.launchpad.R
import com.uxstate.launchpad.domain.model.Launch
import com.uxstate.launchpad.util.LocalSpacing

@Composable
fun DetailsImage(launch: Launch) {
    val spacing = LocalSpacing.current
    val context = LocalContext.current
    val painter = rememberAsyncImagePainter(
            model = ImageRequest.Builder(context)
                    .data(launch.imageUrl)
                    .crossfade(true)
                    .placeholder(R.drawable.placeholder_image)
                    .build()


    )
    Image(
            painter = painter,
            contentDescription = launch.name,
            modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(5f / 4f),
            contentScale = ContentScale.Crop
    )

    Text(text = launch.name)
    

}