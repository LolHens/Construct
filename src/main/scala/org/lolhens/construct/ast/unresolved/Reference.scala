package org.lolhens.construct.ast.unresolved

/**
  * Created by Pierre on 26.02.2016.
  */
class Reference(val name: String) extends Value {

}

object Reference {
  def apply(name: String) = new Reference(name)
}