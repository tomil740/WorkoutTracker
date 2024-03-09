package org.example.project.workoutTracker.data.localDb

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import org.example.project.sqlDelight.database.Workouts

class Test1(theDb : Workouts) {

    val a = MutableStateFlow<String>("0")

    init {
        var b = 1
        CoroutineScope(Dispatchers.Main).launch{

            val dao = theDb.workoutsQueries
            dao.insertExerciseEntity(null,"wokllk;rking")

            while (true) {
                delay(1000)
                a.emit("the value is $b")
                b +=1
            }
        }
    }



}