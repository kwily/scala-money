package com.kwily.money

import scala.math.{ScalaNumber, ScalaNumericConversions}

case class Money[C <: Currency](amount: BigDecimal)
    extends ScalaNumber
    with ScalaNumericConversions
    with Serializable
    with Ordered[Money[C]] {

  def +(other: Money[C]): Money[C] = Money[C](amount + other.amount)
  def -(other: Money[C]): Money[C] = Money[C](amount - other.amount)
  def *(other: Money[C]): Money[C] = Money[C](amount * other.amount)
  def /(other: Money[C]): Money[C] = Money[C](amount / other.amount)
  def unary_- : Money[C]           = Money[C](-amount)

  override def isWhole: Boolean      = amount.isWhole
  override def underlying(): AnyRef  = amount.underlying
  override def longValue(): Long     = amount.longValue
  override def intValue(): Int       = amount.intValue
  override def floatValue(): Float   = amount.floatValue
  override def doubleValue(): Double = amount.doubleValue
  override def byteValue(): Byte     = amount.byteValue()

  override def compare(that: Money[C]): Int = amount.compare(that.amount)
}
