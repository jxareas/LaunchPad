package com.uxstate.launchpad.presentation.screens.full_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.uxstate.launchpad.R
import com.uxstate.launchpad.domain.model.Launch
import com.uxstate.launchpad.presentation.screens.common.LaunchTopBar
import com.uxstate.launchpad.util.LocalSpacing

@Destination
@Composable
fun FullScreen(launch: Launch, navigator: DestinationsNavigator) {

    val spacing = LocalSpacing.current
    val context = LocalContext.current
    val painter = rememberAsyncImagePainter(
        model = ImageRequest.Builder(context)
            .data(launch.imageUrl)
            .crossfade(true)
            .placeholder(R.drawable.placeholder_image)
            .build()
    )

    Scaffold(topBar = {
        LaunchTopBar(
            text = launch.name,
            onClickBackArrow = { navigator.navigateUp() }
        )
    }) { paddingValues ->
        Image(
            painter = painter, contentDescription = launch.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .aspectRatio(1f / 2f)
                .padding(paddingValues = paddingValues)
        )
    }
}
