package easy3d.model

import org.lwjgl.glfw.GLFW._

/**
 * @author kostas.kougios
 *         04/04/2021 - 00:40
 */
case class WindowInstance(
                           monitor: MonitorInstance,
                           handler: Long,
                           width: Int,
                           height: Int
                         ) {
  def makeContextCurrent(): Unit = glfwMakeContextCurrent(handler)

  def showWindow(): Unit = glfwShowWindow(handler)
}
