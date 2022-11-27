package com.uxstate.launchpad.presentation.screens.details_screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.uxstate.launchpad.domain.model.Launch
import com.uxstate.launchpad.presentation.screens.common.TimeBoardWidget

@Composable
fun LaunchBottomSheet(modifier: Modifier = Modifier, probability: Int, launch: Launch) {
    Row(modifier = modifier.fillMaxWidth()) {

        //name
        Text(
                text = launch.name,
                style = MaterialTheme.typography.h5,
                fontWeight = FontWeight.Bold
        )
        
        Row() {
            //c1 - Probability Circle

            Column() {

            }
            //c2 - Timeboard
            
            Column() {
                TimeBoardWidget(timeBoard = )
            }
        }
       

        //status

    }
}