package com.oatau.vhdl.parser.psi

/**
 * User: Michael
 * Date: 18/03/13
 * Time: 14:28
 */
trait VScope {
  def signals : Seq[VNamedElement]
}
