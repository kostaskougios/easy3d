package easy3d.service

import easy3d.model.{MainContext, MainResult, Window}

/**
 * @author kostas.kougios
 *         04/04/2021 - 23:50
 */
class MainLoopService(
                       initService: InitService,
                       windowService: WindowService
                     ):
  def mainLoop(window: Window)(main: MainContext => MainResult): Unit =
    initService.init()
    val w = windowService.create(window)
    w.makeContextCurrent()
    initService.createCapabilities()
    initService.swapInterval(1)
    w.showWindow()
    var time = 0L
    while
      time += 1
      val r = main(MainContext(time))
      !r.exit
    do w.swapBuffers()


trait MainLoopServiceBeans extends InitServiceBeans
  with WindowServiceBeans :
  lazy val mainLoopService = new MainLoopService(initService, windowService)