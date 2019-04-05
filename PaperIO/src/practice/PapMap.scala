package practice

import javafx.scene.input.{KeyCode, KeyEvent}
import scalafx.animation.AnimationTimer
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.paint.Color._
import scalafx.scene.shape.Rectangle
import scalafx.scene.{Group, Scene}

object PapMap extends JFXApp {
  var color = Red

  val windowWidth = 1280
  val windowHeight = 720

  var xdir = 0
  var ydir = 0
  var playerSpeed = 5
  val rectLength = 40
  val name = "Player"

  var allPlayers: List[Rectangle] = List()
  var playerTerritory: List[Rectangle] = List()
  var sceneGraphics: Group = new Group{}

  val player: Rectangle = new Rectangle {
    x = windowWidth/2
    y = windowHeight/2
    width = rectLength
    height = rectLength
    fill = color
  }
  sceneGraphics.children.add(player)

  def keyPressed(keyCode: KeyCode): Unit = {
    keyCode.getName match {
      case "W" => ydir = -1 * playerSpeed; xdir = 0
      case "A" => xdir = -1 * playerSpeed; ydir = 0
      case "S" => ydir = playerSpeed; xdir = 0
      case "D" => xdir = playerSpeed; ydir = 0
      case _ => println(keyCode.getName + " pressed with no action")
    }
  }

  this.stage = new PrimaryStage {
    title.value = "CSE.io"
    scene = new Scene(windowWidth, windowHeight) {
      fill = LightGreen
      content = List(sceneGraphics)

      addEventHandler(KeyEvent.KEY_PRESSED, (event: KeyEvent) => keyPressed(event.getCode))
      }

    val update: Long => Unit = (time: Long) => {
        player.translateX.value += xdir
        player.translateY.value += ydir
    }

    // Start Animations. Calls update 60 times per second (takes update as an argument)
    AnimationTimer(update).start()
    }
}

