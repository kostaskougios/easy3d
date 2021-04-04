package g3d

import easy3d.LibModule
import easy3d.model.{Context, FullScreenWindow, MainResult, Monitor}

/**
 * @author kostas.kougios
 *         04/04/2021 - 00:48
 */
@main def exampleApp(): Unit =
  new LibModule :
    mainLoopService.mainLoop(FullScreenWindow(Monitor.primaryMonitor, "hello there")) {
      mc =>
        println(mc.time)
        if (mc.time > 50)
          MainResult(exit = true)
          else
          MainResult()
    }
