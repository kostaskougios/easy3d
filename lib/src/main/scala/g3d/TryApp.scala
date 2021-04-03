package g3d

import easy3d.init.Screen
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
@main def exampleApp(): Unit =
  init()

def init(): Unit =
  println("init")
  GLFWErrorCallback.createPrint(System.err).set()
  if (!glfwInit())
    throw new IllegalStateException("Unable to initialize GLFW")

  // Get the resolution of the primary monitor
  val vidmode = Screen.primaryMonitorVideoMode

  // Configure GLFW
  glfwDefaultWindowHints() // optional, the current window hints are already the default
  glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE) // the window will stay hidden after creation
  glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE) // the window will be resizable


  val window = glfwCreateWindow(300, 300, "Hello World!", NULL, NULL)
  if (window == NULL) throw new RuntimeException("Failed to create the GLFW window")

  val stack = stackPush()
  try {
    val pWidth = stack.mallocInt(1) // int*
    val pHeight = stack.mallocInt(1)
    // Get the window size passed to glfwCreateWindow
    glfwGetWindowSize(window, pWidth, pHeight)
    // Center the window
    glfwSetWindowPos(window, (vidmode.width - pWidth.get(0)) / 2, (vidmode.height - pHeight.get(0)) / 2)
  } finally {
    if (stack != null) stack.close()
  }

  // Make the OpenGL context current// Make the OpenGL context current

  glfwMakeContextCurrent(window)
  // Enable v-sync
  glfwSwapInterval(1)

  // Make the window visible
  glfwShowWindow(window)
  Thread.sleep(2000)
  println("done")
		
  