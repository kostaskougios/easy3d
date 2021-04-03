package easy3d.service

import easy3d.model.{Monitor, MonitorInstance}
import org.lwjgl.glfw.GLFW.{glfwGetPrimaryMonitor, glfwGetVideoMode}

/**
 * @author kostas.kougios
 *         04/04/2021 - 00:30
 */
class MonitorService:
  def create(monitor: Monitor): MonitorInstance =
    val handler = if (monitor.isPrimary)
      glfwGetPrimaryMonitor
    else ???
    val v = glfwGetVideoMode(handler)
    MonitorInstance(monitor.id, handler, v.width, v.height)
  
