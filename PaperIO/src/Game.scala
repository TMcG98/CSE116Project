import javafx.event.ActionEvent
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.paint.Color
import scalafx.scene.paint.Color._
import scalafx.scene.shape.Rectangle

class Game {
  var color = new Color(0, 0, 0)
  // Selects a random color to assign to the player
  def pickColor(): Color = {
    val c = scala.util.Random
    val r = c.nextInt(8)
    if(r == 0) {
      color = Red
    } else if (r == 1) {
      color = Blue
    } else if (r == 2) {
      color = Cyan
    } else if (r == 3) {
      color = SeaGreen
    } else if (r == 4) {
      color = DarkOrange
    } else if (r == 5) {
      color = AntiqueWhite
    } else if (r == 6) {
      color = Fuchsia
    } else if (r == 7) {
      color = Gold
    }
    color
  }
}
