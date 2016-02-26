package org.lolhens.construct.ast

/**
  * Created by Pierre on 05.02.2016.
  */
class Block(val fields: List[Field],
            val body: List[EXPR OR BLOCK ?!?]) {

}

class Field

class Expr