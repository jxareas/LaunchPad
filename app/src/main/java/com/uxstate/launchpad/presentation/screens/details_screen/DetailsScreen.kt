package com.uxstate.launchpad.presentation.screens.details_screen

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.ramcosta.composedestinations.annotation.Destination
import com.uxstate.launchpad.domain.model.Launch
import com.uxstate.launchpad.domain.model.TimerState
import com.uxstate.launchpad.presentation.screens.details_screen.components.DetailsImage

@RequiresApi(Build.VERSION_CODES.O)
@Destination
@Composable
fun DetailsScreen(launch: Launch, viewModel: DetailsViewModel = hiltViewModel()) {

    val timeFlow by viewModel.runTimer(launch)
        .collectAsState(initial = 0)

    DetailsImage(
        launch = launch,
        timerText = TimerState(timeFlow).toString()
    )
}