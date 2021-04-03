package easy3d.model

/**
 * @author kostas.kougios
 *         04/04/2021 - 00:15
 */
trait Window:
  def monitor: Monitor

  def title: String

case class FullScreenWindow(monitor: Monitor, title: String) extends Window

object Window:
  def fullScreen(monitor: Monitor, title: String): Window = FullScreenWindow(monitor, title)
