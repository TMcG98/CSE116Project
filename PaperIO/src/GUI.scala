import javafx.event.{ActionEvent, EventHandler}
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.control.{Button, TextField}
import scalafx.scene.layout.VBox
import scalafx.scene.paint.Color
import scalafx.scene.paint.Color._
import scalafx.scene.shape.Rectangle

object GUI extends JFXApp {

  var game = new Game()

  val inputDisplay: TextField = new TextField {
    style = "-fx-font: 18 ariel;"
  }

  val outputDisplay: TextField = new TextField {
    editable = false
    style = "-fx-font: 18 ariel;"
    this.text.value = "Enter your name to start!"
  }

  val button: Button = new Button {
    minWidth = 100
    minHeight = 30
    style = "-fx-font: 28 ariel;"
    text = "Set Name"
    onAction = (event: ActionEvent) => buttonPressed()
  }

  def buttonPressed(): Unit = {
    val name: String = inputDisplay.text.value
    onAction = new EventHandler[ActionEvent]{
      override def handle(event: ActionEvent): Unit = {
        var player = new Player(name, game.pickColor())
      }
    }
  }

  this.stage = new PrimaryStage {
    title = "CSE.io"
    width = 600
    height = 600
    scene = new Scene() {
      fill = LightGreen
      content = List(
        new VBox() {
          children = List(inputDisplay, button, outputDisplay)
        }
      )
    }
  }
}
