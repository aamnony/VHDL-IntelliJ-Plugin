package com.oatau.vhdl.parser.psi.impl

import com.oatau.vhdl.parser.psi.{VSignal, VNamedElement, VEntity}
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.codeInsight.lookup.{LookupElementBuilder, LookupElement}
import com.oatau.vhdl.lexer.VhdlTypes
import com.intellij.util.PlatformIcons

/**
 * User: Michael
 * Date: 16/03/13
 * Time: 14:20
 */
class VEntityImpl(node:ASTNode) extends ScalaPsiElement(node) with VEntity {
  def getLookupElement: LookupElement = LookupElementBuilder.create(this).withIcon(PlatformIcons.INTERFACE_ICON)
  def setName(p1: String): PsiElement = null

  override def getName: String = childByType(VhdlTypes.ID).map(_.getText).getOrElse(null)

  def signals: Seq[VNamedElement] = childrenByClass[VSignal]
}
