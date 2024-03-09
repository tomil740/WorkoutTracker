import SwiftUI
import ComposeApp



@main
struct iOSApp: App {
    
    init() {
       MainViewControllerKt.InitKoin()
        }
    
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
