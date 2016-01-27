package org.lolhens.construct.ast.block

import org.lolhens.construct.ast.expr.Expr
import org.lolhens.construct.ast.tpe.Type

/**
  * Created by LolHens on 18.11.2015.
  */
abstract class Block extends Type with Expr {
  def fields: List[Field] = Nil

  def tpe: Type = Unit

  def isFinal = false
}
