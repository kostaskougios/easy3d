package g3d

import easy3d.lowlevel.{Screen, Window}
import org.lwjgl.glfw.GLFW._
import org.lwjgl.glfw.GLFWErrorCallback
import org.lwjgl.system.MemoryUtil.NULL

/**
 * @author kostas.kougios
 *         03/04/2021 - 22:35
 */

@main def lowLevelFullScreenWindowApp(): Unit =
  init()

  def init(): Unit =
    println("init")
    GLFWErrorCallback.createPrint(System.err).set()
    if (!glfwInit())
      throw new IllegalStateException("Unable to initialize GLFW")

    // Configure GLFW
    val window = Window.createFullScreenWindow("Hello World!", Screen.primaryMonitor)

    // Make the OpenGL context current
    glfwMakeContextCurrent(window)
    // Enable v-sync
    glfwSwapInterval(1)

    // Make the window visible
    glfwShowWindow(window)
    Thread.sleep(2000)
    println("done")
      
    