package org.lolhens.construct.ast.tpe

import org.lolhens.construct.ast.block.Block

/**
  * Created by Pierre on 27.01.2016.
  */
abstract class Type(val superTpe: Type = Any) {
  //def isType(block: Block): Boolean
}
