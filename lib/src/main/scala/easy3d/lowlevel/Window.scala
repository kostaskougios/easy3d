package easy3d.lowlevel

import org.lwjgl.glfw.GLFW._
import org.lwjgl.system.MemoryStack.stackPush
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

  def windowSize(window: Long): (Int, Int) =
    val stack = stackPush()
    try {
      val pWidth = stack.mallocInt(1) // int*
      val pHeight = stack.mallocInt(1)
      // Get the window size passed to glfwCreateWindow
      glfwGetWindowSize(window, pWidth, pHeight)
      (pWidth.get(0), pHeight.get(0))
    } finally {
      if (stack != null) stack.close()
    }

