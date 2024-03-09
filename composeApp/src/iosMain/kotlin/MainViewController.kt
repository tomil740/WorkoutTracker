import androidx.compose.ui.window.ComposeUIViewController
import org.example.project.App
import org.example.project.workoutTracker.di.AppModule
import org.koin.core.context.startKoin

fun MainViewController() = ComposeUIViewController { App() }

fun InitKoin() {
    startKoin {
        modules(AppModule)
    }
}