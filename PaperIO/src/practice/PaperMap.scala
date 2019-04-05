package practice

import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.paint.Color._
import scalafx.scene.shape.Rectangle

class PaperMap extends JFXApp {
  val c = scala.util.Random
  c.nextInt(100)
  stage = new JFXApp.PrimaryStage {
    title.value = "CSE.io"
    width = 10
    height = 10
    scene = new Scene {
      fill = LightGreen
      content = new Rectangle {
        x = 25
        y = 25
        width = 10
        height = 10
        fill = Red
      }
    }
  }
}
