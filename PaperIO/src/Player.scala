import javafx.event.ActionEvent
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.paint.Color._
import scalafx.scene.shape.Rectangle

class Player(val name: String) {

  var color = Red

  def pickColor(): Unit = {
    val c = scala.util.Random
    val r = c.nextInt(8)
    print(r)
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
  }

}
