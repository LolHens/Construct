package org.lolhens.construct.ast.unresolved

/**
  * Created by Pierre on 26.02.2016.
  */
class Definition(val name: String,
                 val value: Value,
                 val mutable: Boolean) {

}

object Definition {
  def apply(name: String, value: Value): Boolean => Definition = { mutable =>
    new Definition(name, value, mutable)
  }
}