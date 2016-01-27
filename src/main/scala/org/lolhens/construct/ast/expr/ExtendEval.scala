package org.lolhens.construct.ast.expr

import org.lolhens.construct.ast.block.Block
import org.lolhens.construct.ast.tpe.Type

/**
  * Created by Pierre on 27.01.2016.
  */
class ExtendEval(val block: Block) extends Expr { //a, b?
  override def tpe: Type = block.tpe
}
