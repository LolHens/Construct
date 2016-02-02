package org.lolhens.construct.ast.block

import org.lolhens.construct.ast.expr.Field

/**
  * Created by Pierre on 27.01.2016.
  */
class Object extends Block {


  override def returnType: Block = body.last.returnType

  override val fields: List[Field] = ???
}
