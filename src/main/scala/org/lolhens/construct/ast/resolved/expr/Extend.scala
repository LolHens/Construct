package org.lolhens.construct.ast.expr

import org.lolhens.construct.ast.block.Block

/**
  * Created by Pierre on 27.01.2016.
  */
class Extend(val a: Block,
             val b: Block) extends Expr {
  //ITSELF A BLOCK?? NOOOOO Dynamic!!!
  override def returnType: Block = ???
}
