package easy3d.lowlevel

import org.lwjgl.glfw.GLFW.{glfwGetPrimaryMonitor, glfwGetVideoMode}
import org.lwjgl.glfw.GLFWVidMode

/**
 * @author kostas.kougios
 *         03/04/2021 - 01:11
 */
object Screen:
  def primaryMonitor: Long = glfwGetPrimaryMonitor

  def primaryMonitorVideoMode: GLFWVidMode = videoMode(primaryMonitor)

  def videoMode(monitor: Long) = glfwGetVideoMode(monitor)

