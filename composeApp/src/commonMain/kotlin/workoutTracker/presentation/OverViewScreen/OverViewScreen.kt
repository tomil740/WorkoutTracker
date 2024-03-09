package org.example.project.workoutTracker.presentation.OverViewScreen

import androidx.compose.material.Text
import androidx.compose.runtime.Composable


@Composable
fun OverViewScreen(uiState: OverViewUIState) {

    Text("the uiState is : ${uiState.theDb} and the flow val : ${uiState.theTest}")

}