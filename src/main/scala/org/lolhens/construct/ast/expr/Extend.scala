package org.lolhens.construct.ast.expr

import org.lolhens.construct.ast.block.Block
import org.lolhens.construct.ast.tpe.Type

/**
  * Created by Pierre on 27.01.2016.
  */
class Extend(a: Block, b: Block) extends Expr { //ITSELF A BLOCK??
  override def tpe: Type = b
}
