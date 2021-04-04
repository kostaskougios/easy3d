package easy3d.service

import org.lwjgl.glfw.GLFW._
import org.lwjgl.glfw._
import org.lwjgl.opengl.GL

/**
 * @author kostas.kougios
 *         04/04/2021 - 00:46
 */
class InitService:
  def init(): Unit =
    GLFWErrorCallback.createPrint(System.err).set()
    if (!glfwInit())
      throw new IllegalStateException("Unable to initialize GLFW")

  def swapInterval(interval: Int) = glfwSwapInterval(interval)

  def createCapabilities() = GL.createCapabilities()


trait InitServiceBeans:
  lazy val initService = new InitService()