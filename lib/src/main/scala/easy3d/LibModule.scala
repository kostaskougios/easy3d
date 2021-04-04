package easy3d

import easy3d.service.{InitServiceBeans, MainLoopServiceBeans, MonitorServiceBeans, WindowServiceBeans}

/**
 * @author kostas.kougios
 *         04/04/2021 - 00:45
 */
trait LibModule extends InitServiceBeans
  with MonitorServiceBeans
  with WindowServiceBeans
  with MainLoopServiceBeans
