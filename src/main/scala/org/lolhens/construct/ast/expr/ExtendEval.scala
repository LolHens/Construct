package org.lolhens.construct.ast.expr

import org.lolhens.construct.ast.block.Block
import org.lolhens.construct.ast.tpe.Type

/**
  * Created by Pierre on 27.01.2016.
  */
class ExtendEval(val a: Block,
                 val b: Block) extends Expr { //a, b? Not itself a block. not determined in the compiler (maybe...)
  override def returnType: Block = ???
}
