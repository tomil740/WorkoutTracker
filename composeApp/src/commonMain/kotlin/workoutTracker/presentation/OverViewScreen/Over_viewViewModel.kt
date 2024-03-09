package org.example.projectworkoutTracker.presentation.OverViewScreen


import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import org.example.project.workoutTracker.data.localDb.Test1
import org.example.project.workoutTracker.presentation.OverViewScreen.OverViewUIState


class Over_viewViewModel(val test1: Test1)
    :ViewModel() {

    private val uiState = MutableStateFlow(OverViewUIState())

    val state = combine(
        uiState,test1.a
    ){
        _state,data ->
        _state.copy(theTest = "emit", theDb = data)
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), OverViewUIState())



}