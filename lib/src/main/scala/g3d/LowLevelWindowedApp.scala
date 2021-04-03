package g3d

import easy3d.lowlevel.{Init, Screen, Window}
import org.lwjgl._
import org.lwjgl.glfw.Callbacks._
import org.lwjgl.glfw.GLFW._
import org.lwjgl.glfw._
import org.lwjgl.opengl.GL11._
import org.lwjgl.opengl._
import org.lwjgl.system.MemoryStack._
import org.lwjgl.system.MemoryUtil._
import org.lwjgl.system._

import java.nio._

/**
 * https://www.lwjgl.org/guide
 */
@main def lowLevelWindowedApp(): Unit =
  init()

  def init(): Unit =
    println("init")
    Init.init()

    // Get the resolution of the primary monitor
    val vidmode = Screen.primaryMonitorVideoMode

    // Configure GLFW
    val window = Window.createWindow(600, 600, "Hello World!", NULL)

    val (windowWidth, windowHeight) = Window.windowSize(window)
    glfwSetWindowPos(window, (vidmode.width - windowWidth) / 2, (vidmode.height - windowHeight) / 2)

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
      
    