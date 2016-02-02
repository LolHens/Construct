package org.lolhens.construct.ast.expr

import org.lolhens.construct.ast.block.Block
import org.lolhens.construct.ast.block.Unit


/**
  * Created by Pierre on 27.01.2016.
  */
class Field(val name: String,
            val tpe: Block,
            val block: Option[Block] = None) extends Expr {
  override def returnType: Block = Unit
}
