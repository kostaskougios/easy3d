package easy3d.service

import easy3d.lowlevel.Monitor
import easy3d.model.{FullScreenWindow, MonitorInstance, Window, WindowInstance}
import org.lwjgl.glfw.GLFW._
import org.lwjgl.system.MemoryUtil.NULL

/**
 * @author kostas.kougios
 *         04/04/2021 - 00:26
 */
class WindowService(monitorService: MonitorService):
  def create(window: Window): WindowInstance =
    window match
      case FullScreenWindow(monitor, title) =>
        val m = monitorService.create(monitor)
        val w = createFullScreenWindow(m, title)
        WindowInstance(m, w, m.width, m.height)

  private def createFullScreenWindow(
                                      monitor: MonitorInstance,
                                      title: String
                                    ): Long =
    glfwDefaultWindowHints() // optional, the current window hints are already the default
    glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE) // the window will stay hidden after creation
    glfwWindowHint(GLFW_FLOATING, GLFW_TRUE)
    glfwWindowHint(GLFW_DECORATED, GLFW_FALSE)
    val window = glfwCreateWindow(monitor.width, monitor.height, title, monitor.handler, NULL)
    if (window == NULL) throw new RuntimeException("Failed to create the GLFW window")
    window

trait WindowServiceBeans extends MonitorServiceBeans :
  lazy val windowService = new WindowService(monitorService)