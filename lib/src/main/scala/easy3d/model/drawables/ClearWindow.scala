package easy3d.model.drawables

import easy3d.model.Color
import org.lwjgl.opengl.GL11._

/**
 * @author kostas.kougios
 *         05/04/2021 - 00:36
 */
case class ClearWindow(color: Color) extends Drawable :
  override def draw() =
    glClearColor(color.red, color.green, color.blue, color.alpha)
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)


