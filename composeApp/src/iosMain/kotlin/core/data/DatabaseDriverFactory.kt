package org.example.project.core.data

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver
import org.example.project.sqlDelight.database.Workouts


actual class DatabaseDriverFactory {
    actual fun create(): SqlDriver {
        return NativeSqliteDriver(Workouts.Schema, "theDb.db")
    }
}



