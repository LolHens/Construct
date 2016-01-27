package org.lolhens.construct.ast.block

import org.lolhens.construct.ast.tpe.Type

/**
  * Created by Pierre on 27.01.2016.
  */
object Any extends Block {
  override def fields: List[Field] = Nil

  override def tpe: Type = Unit
}
