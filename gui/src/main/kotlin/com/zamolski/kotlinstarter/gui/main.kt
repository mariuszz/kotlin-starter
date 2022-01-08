package com.zamolski.kotlinstarter.gui

import com.zamolski.kotlinstarter.core.info
import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.BorderPane
import javafx.stage.Stage

class Main : Application() {

	override fun start(primaryStage: Stage?) {

		val borderPane = BorderPane()
		borderPane.center = Label(info())

		val scene = Scene(borderPane, 640.0, 480.0)
		primaryStage?.run {
			primaryStage.title = info()
			setScene(scene)
			show()
		}
	}
}
	
	
fun main() = Application.launch(Main::class.java)

