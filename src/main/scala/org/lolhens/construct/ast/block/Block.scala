package org.lolhens.construct.ast.block

import org.lolhens.construct.ast.expr.{Expr, Field}
import org.lolhens.construct.ast.tpe.Type

/**
  * Created by LolHens on 18.11.2015.
  */
abstract class Block extends Expr {
  val fields: List[Field] = Nil

  val body: List[Block] = Nil

  def returnType: Block = body.lastOption.getOrElse(Unit)

  def isFinal = false
}
