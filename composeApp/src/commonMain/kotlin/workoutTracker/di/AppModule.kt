package org.example.project.workoutTracker.di


import org.example.project.core.data.DatabaseDriverFactory
import org.example.project.sqlDelight.database.Workouts
import org.example.project.workoutTracker.data.localDb.Test1
import org.example.projectworkoutTracker.presentation.OverViewScreen.Over_viewViewModel
import org.koin.core.qualifier.qualifier
import org.koin.dsl.module

val AppModule = module {

    single(createdAtStart = true) {
        Over_viewViewModel(get())
    }
    single() {

        Workouts(DatabaseDriverFactory().create())

    }

    single(createdAtStart = true) {
        Test1(get())
    }


}