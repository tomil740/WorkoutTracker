package org.example.project

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import org.example.project.workoutTracker.presentation.OverViewScreen.OverViewScreen
import org.example.project.workoutTracker.presentation.components.DailyWorkoutItem
import org.example.projectworkoutTracker.presentation.OverViewScreen.Over_viewViewModel
import org.koin.compose.koinInject


@Composable
fun App() {

    MaterialTheme {

        val a  = koinInject<Over_viewViewModel>()
        val b by a.state.collectAsState()

        OverViewScreen(b)

        }
}