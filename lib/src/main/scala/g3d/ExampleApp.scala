package g3d

import easy3d.LibModule
import easy3d.model.{FullScreenWindow, Monitor}

/**
 * @author kostas.kougios
 *         04/04/2021 - 00:48
 */
@main def exampleApp(): Unit =
  new LibModule :
    initService.init()
    val w = windowService.create(FullScreenWindow(Monitor.primaryMonitor, "hello there"))
    w.makeContextCurrent()
    initService.swapInterval(1)
    w.showWindow()
