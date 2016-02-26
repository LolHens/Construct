package org.lolhens.construct.parser

import org.lolhens.construct.ast.unresolved.{UnitVal, Reference, Definition, Value}
import org.lolhens.parser.ParserUtils

/**
  * Created by Pierre on 17.02.2016.
  */
object ConstructParser extends ParserUtils {
  def insn: Parser[Any] = Insn.decl | Insn.expr

  object Insn {
    def decl: Parser[Definition] = Decl.`val` | Decl.`var`

    object Decl {
      def `val`: Parser[Definition] = "val" ~~> `assign` ^^ {
        case e => e(false)
      }

      def `var`: Parser[Definition] = "var" ~~> `assign` ^^ {
        case e => e(true)
      }

      private def `assign`: Parser[(Boolean) => Definition] = wordType ~?~ ("=" ~?> expr) ^^ {
        case name ~ value => Definition(name, value.asInstanceOf[Value]) // TODO
      }

      def `type`: Parser[Unit] = ???
    }

    def insnList: Parser[List[Any]] = opt(rep1sep(insn, ";" | "\n")) ^^ {
      case Some(exprList) => exprList
      case None => List(UnitVal)
    }

    def expr: Parser[Any] = Expr.ref | Expr.`def`

    object Expr {
      def ref: Parser[Reference] = wordType ^^ {
        case e => Reference(e)
      }

      def `def`: Parser[Any] = Def.block | Def.eval

      object Def {
        def block: Parser[Any] = "{" ~?> insnList <?~ "}"

        def eval: Parser[Any] = "(" ~?> insnList <?~ ")"
      }

      def impl: Parser[Unit] = Impl.block | Impl.eval

      object Impl {
        def block: Parser[Unit] = ???

        def eval: Parser[Unit] = ???
      }
    }

  }


  def `type`: Parser[Unit] = ???

  object Type {

  }


  def block: Parser[Unit] = blockDef | blockRef

  def blockDef: Parser[Unit] =

  def blockDefEval: Parser[Unit] = "(" ~> exprList <~ ")"


}
