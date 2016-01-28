package org.lolhens.construct.ast.block

import org.lolhens.construct.ast.expr.Field
import org.lolhens.construct.ast.tpe.Type

/**
  * Created by Pierre on 27.01.2016.
  */
class Object extends Block {
  val body: List[Block] = ???

  override def tpe: Type = body.last.tpe

  override def fields: List[Field] = ???
}
