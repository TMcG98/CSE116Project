import javafx.event.ActionEvent
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

  def buttonPressed(): Unit = {
    val name: String = inputDisplay.text.value
    //this.Player.setName(name)
  }

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

  this.stage = new PrimaryStage {
    title = "CSE.io"
    scene = new Scene() {
      content = List(
        new VBox() {
          children = List(inputDisplay, button, outputDisplay)
        }
      )
    }
  }
}
