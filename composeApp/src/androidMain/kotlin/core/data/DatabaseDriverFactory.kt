package org.example.project.core.data

import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver
import org.example.project.AppAndroid
import org.example.project.sqlDelight.database.Workouts

actual class DatabaseDriverFactory {
     actual fun create(): SqlDriver {
        return AndroidSqliteDriver(
            Workouts.Schema,
            context = AppAndroid.applicationContext(),
            "contact.db"
        )
    }
}



