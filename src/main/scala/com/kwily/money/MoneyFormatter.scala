package com.kwily.money

import java.text.DecimalFormat

import scala.reflect.ClassTag

trait MoneyFormatter[A] {
  def format(a: A): String
}

object MoneyFormatter {

  implicit def currencyFormatter[C <: Currency] = new MoneyFormatter[C] {
    override def format(a: C): String = s"${a.symbol} 0." + "".padTo(a.minorUnit, "0").mkString
  }

  implicit def moneyFormatter[C <: Currency](implicit currencyFormatter: MoneyFormatter[C],
                                             classTag: ClassTag[C]): MoneyFormatter[Money[C]] =
    new MoneyFormatter[Money[C]] {
      private val currencyFormat = new DecimalFormat(
        currencyFormatter.format(classTag.runtimeClass.newInstance().asInstanceOf[C])
      )

      override def format(a: Money[C]): String = currencyFormat.format(a.amount)
    }

  implicit class MoneyFormatterOps[A <: Money[_]](val a: A) extends AnyVal {
    def format(implicit ev: MoneyFormatter[A]): String =
      implicitly[MoneyFormatter[A]].format(a)
  }
}
