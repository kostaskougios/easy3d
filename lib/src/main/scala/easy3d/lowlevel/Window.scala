package easy3d.lowlevel

import org.lwjgl.glfw.GLFW._
import org.lwjgl.system.MemoryUtil.NULL

/**
 * @author kostas.kougios
 *         03/04/2021 - 01:20
 */
object Window:
  def createWindow(
                    width: Int,
                    height: Int,
                    title: String,
                    monitor: Long
                  ): Long =
    glfwDefaultWindowHints() // optional, the current window hints are already the default
    glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE) // the window will stay hidden after creation
    glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE) // the window will be resizable

    val window = glfwCreateWindow(width, height, title, monitor, NULL)
    if (window == NULL) throw new RuntimeException("Failed to create the GLFW window")
    window

