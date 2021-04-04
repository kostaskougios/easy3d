package easy3d.model

import org.lwjgl.glfw.GLFW.glfwMakeContextCurrent
import org.lwjgl.opengl.GL11._

/**
 * @author kostas.kougios
 *         04/04/2021 - 17:08
 */
object Context:
  def clearColor(red: Float, green: Float, blue: Float, alpha: Float) = glClearColor(red, green, blue, alpha)

  def clear() = glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)