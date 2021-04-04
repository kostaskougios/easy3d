package g3d

import easy3d.LibModule
import easy3d.model._
import easy3d.model.drawables.ClearWindow

/**
 * @author kostas.kougios
 *         04/04/2021 - 00:48
 */
@main def exampleApp(): Unit =
  new LibModule :
    mainLoopService.mainLoop(FullScreenWindow(Monitor.primaryMonitor, "hello there")) {
      mc =>
        val t = mc.time
        println(t)
        if (t > 50)
          MainResult(exit = true)
          else
          MainResult(draw = Seq(ClearWindow(Color(t / 100f, t / 100f, t / 100f, 0))))
    }
