package org.lolhens.construct.ast.expr

import org.lolhens.construct.ast.tpe.Type

/**
  * Created by Pierre on 27.01.2016.
  */
abstract class Expr {
  def tpe: Type
}
