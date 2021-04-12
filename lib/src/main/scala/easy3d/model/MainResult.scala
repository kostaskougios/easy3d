package easy3d.model

import easy3d.model.drawables.Drawable

/**
 * @author kostas.kougios
 *         05/04/2021 - 00:04
 */
case class MainResult(
  exit: Boolean = false,
  draw: Seq[Drawable] = Nil
)
