// This is a generated file. Not intended for manual editing.
package com.jivesoftware.robot.intellij.plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.jivesoftware.robot.intellij.plugin.parser.RobotTypes.*;
import com.jivesoftware.robot.intellij.plugin.elements.references.RobotNamedElementImpl;
import com.jivesoftware.robot.intellij.plugin.psi.*;
import com.jivesoftware.robot.intellij.plugin.elements.RobotImplUtil;
import com.intellij.navigation.ItemPresentation;

public class RobotKeywordDefImpl extends RobotNamedElementImpl implements RobotKeywordDef {

  public RobotKeywordDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotVisitor) ((RobotVisitor)visitor).visitKeywordDef(this);
    else super.accept(visitor);
  }

  public String getName() {
    return RobotImplUtil.getName(this);
  }

  public PsiElement setName(String newName) {
    return RobotImplUtil.setName(this, newName);
  }

  public PsiElement getNameIdentifier() {
    return RobotImplUtil.getNameIdentifier(this);
  }

  public ItemPresentation getPresentation() {
    return RobotImplUtil.getPresentation(this);
  }

}