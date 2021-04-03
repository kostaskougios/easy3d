package g3d

import easy3d.lowlevel.{Init, Screen, Window}
import org.lwjgl.glfw.GLFW._
import org.lwjgl.glfw.GLFWErrorCallback
import org.lwjgl.opengl.GL
import org.lwjgl.opengl.GL11._
import org.lwjgl.system.MemoryUtil.NULL

/**
 * @author kostas.kougios
 *         03/04/2021 - 22:35
 */

@main def lowLevelFullScreenWindowApp(): Unit =
  init()

  def init(): Unit =
    println("init")
    Init.init()
    // Configure GLFW
    val window = Window.createFullScreenWindow("Hello World!", Screen.primaryMonitor)

    // Make the OpenGL context current
    glfwMakeContextCurrent(window)
    // Enable v-sync
    glfwSwapInterval(1)

    // Make the window visible
    glfwShowWindow(window)
    GL.createCapabilities
    glClearColor(0.5f, 0.0f, 0.0f, 0.0f)
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    glfwSwapBuffers(window)
    Thread.sleep(2000)
    println("done")