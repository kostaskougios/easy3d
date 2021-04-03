package easy3d.model

/**
 * @author kostas.kougios
 *         04/04/2021 - 00:08
 */
case class Monitor(id: Int):
  def isPrimary: Boolean = id == 0


object Monitor:
  def primaryMonitor: Monitor = Monitor(0)