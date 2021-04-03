package easy3d.lowlevel

import org.lwjgl.glfw.GLFW.glfwInit
import org.lwjgl.glfw.GLFWErrorCallback

/**
 * @author kostas.kougios
 *         03/04/2021 - 22:43
 */
object Init {
  def init(): Unit = {
    GLFWErrorCallback.createPrint(System.err).set()
    if (!glfwInit())
      throw new IllegalStateException("Unable to initialize GLFW")
  }
}
