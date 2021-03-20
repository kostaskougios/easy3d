package g3d

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
 * @author kostas.kougios
 *         20/03/2021 - 01:39
 */

@main def exampleApp(): Unit =
  println("hi")

def init(): Unit =
  GLFWErrorCallback.createPrint(System.err).set()
  if (!glfwInit())
    throw new IllegalStateException("Unable to initialize GLFW")
  // Configure GLFW
  glfwDefaultWindowHints() // optional, the current window hints are already the default
  glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE) // the window will stay hidden after creation
  glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE) // the window will be resizable

  val window = glfwCreateWindow(300, 300, "Hello World!", NULL, NULL)
  if (window == NULL) throw new RuntimeException("Failed to create the GLFW window")
  