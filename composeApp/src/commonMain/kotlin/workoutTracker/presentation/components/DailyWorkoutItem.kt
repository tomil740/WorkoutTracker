package org.example.project.workoutTracker.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DailyWorkoutItem(
    //those value in the production app will be different , the domain object will send as a parameter
     workoutName : String = "Untitled" , time : Float = 0f , mucelasesLst:List<String?> = listOf() , modifier: Modifier
) {

    Column(modifier.height(500.dp).width(250.dp)) {

        Text(workoutName, fontSize = 16.sp,textAlign = TextAlign.Center, modifier = modifier.padding(start = 24.dp))

        val theTime = "Time is : $time minutes"

        Text(theTime, fontSize = 12.sp,textAlign = TextAlign.Start, modifier = modifier.padding(bottom = 1.dp, start = 2.dp))

        if(mucelasesLst.isEmpty()){

            Spacer(modifier.height(4.dp))

            Text("No muscles has been mentioned tho this workout ", fontSize = 4.sp,textAlign = TextAlign.Center, modifier = modifier.padding(4.dp))

        }else{
            var extra = 0
            for (i in 0..mucelasesLst.size){
                val index = i+extra
                if(index+1 < mucelasesLst.size){
                    Row {
                        Text( mucelasesLst.get(index)!!, fontSize = 9.sp,textAlign = TextAlign.Start, color = Color.Green, modifier = modifier.padding(start = 24.dp))
                        Spacer(modifier.width(4.dp))
                        Text( mucelasesLst.get(index+1)!!, fontSize = 9.sp,textAlign = TextAlign.Start, color = Color.Blue, modifier = modifier.padding(start = 24.dp))
                        extra+=1
                    }
                }else{
                    if(index < mucelasesLst.size)
                       Text( mucelasesLst.get(index)!!, fontSize = 9.sp,textAlign = TextAlign.Center, color = Color.Green, modifier = modifier.padding(start = 24.dp))
                }


            }
        }


    }

}
