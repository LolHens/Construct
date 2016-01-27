package org.lolhens.construct.ast.block

import org.lolhens.construct.ast.tpe.Type

/**
  * Created by Pierre on 27.01.2016.
  */
class Field(val name: String,
            val tpe: Type,
            val block: Option[Block] = None) {
}
