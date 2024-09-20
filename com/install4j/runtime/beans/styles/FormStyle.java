/*     */ package com.install4j.runtime.beans.styles;
/*     */ 
/*     */ import com.install4j.api.beans.Anchor;
/*     */ import com.install4j.api.context.ControlButtonType;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.FormPanelContainer;
/*     */ import com.install4j.api.styles.ControlButton;
/*     */ import com.install4j.api.styles.ControlButtonContainer;
/*     */ import com.install4j.api.styles.StyleContext;
/*     */ import com.install4j.api.styles.StyleContextReceiver;
/*     */ import com.install4j.runtime.beans.AnchorUtil;
/*     */ import com.install4j.runtime.beans.screens.SystemStyle;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public class FormStyle
/*     */   extends SystemStyle
/*     */   implements FormPanelContainer {
/*     */   private JPanel formPanel;
/*     */   private FormEnvironment formEnvironment;
/*     */   private boolean fillHorizontal = true;
/*     */   private boolean fillVertical = true;
/*  26 */   private Anchor horizontalAnchor = Anchor.CENTER;
/*  27 */   private Anchor verticalAnchor = Anchor.CENTER;
/*     */   private boolean standalone = true;
/*     */   private StyleContext lastStyleContext;
/*  30 */   private List<Runnable> deferredRunnables = new ArrayList<>();
/*     */ 
/*     */   
/*     */   public boolean isFillHorizontal() {
/*  34 */     return replaceWithTextOverride("fillHorizontal", this.fillHorizontal);
/*     */   }
/*     */   
/*     */   public void setFillHorizontal(boolean fillHorizontal) {
/*  38 */     this.fillHorizontal = fillHorizontal;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillVertical() {
/*  43 */     return replaceWithTextOverride("fillVertical", this.fillVertical);
/*     */   }
/*     */   
/*     */   public void setFillVertical(boolean fillVertical) {
/*  47 */     this.fillVertical = fillVertical;
/*     */   }
/*     */   
/*     */   public Anchor getHorizontalAnchor() {
/*  51 */     return (Anchor)replaceWithTextOverride("horizontalAnchor", this.horizontalAnchor, Anchor.class);
/*     */   }
/*     */   
/*     */   public void setHorizontalAnchor(Anchor horizontalAnchor) {
/*  55 */     this.horizontalAnchor = horizontalAnchor;
/*     */   }
/*     */   
/*     */   public Anchor getVerticalAnchor() {
/*  59 */     return (Anchor)replaceWithTextOverride("verticalAnchor", this.verticalAnchor, Anchor.class);
/*     */   }
/*     */   
/*     */   public void setVerticalAnchor(Anchor verticalAnchor) {
/*  63 */     this.verticalAnchor = verticalAnchor;
/*     */   }
/*     */ 
/*     */   
/*     */   public Anchor getAnchor() {
/*  68 */     return AnchorUtil.getAnchor(getHorizontalAnchor(), getVerticalAnchor());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isStandalone() {
/*  73 */     return replaceWithTextOverride("standalone", this.standalone);
/*     */   }
/*     */   
/*     */   public void setStandalone(boolean standalone) {
/*  77 */     this.standalone = standalone;
/*     */   }
/*     */ 
/*     */   
/*     */   public void willActivate() {
/*  82 */     super.willActivate();
/*  83 */     if (getFormEnvironment() != null) {
/*  84 */       for (Runnable runnable : this.deferredRunnables) {
/*     */         try {
/*  86 */           runnable.run();
/*  87 */         } catch (Exception e) {
/*  88 */           e.printStackTrace();
/*     */         } 
/*     */       } 
/*  91 */       this.deferredRunnables.clear();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setControlButtonEnabled(ControlButtonType controlButtonType, boolean enabled) {
/*  97 */     visitControlButtons(controlButtonType, controlButton -> ((FormComponent)controlButton).setEnabled(enabled));
/*  98 */     visitControlButtonContainers(controlButtonContainer -> controlButtonContainer.setControlButtonEnabled(controlButtonType, enabled));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setControlButtonVisible(ControlButtonType controlButtonType, boolean visible) {
/* 103 */     visitControlButtons(controlButtonType, controlButton -> ((FormComponent)controlButton).setVisible(visible));
/* 104 */     visitControlButtonContainers(controlButtonContainer -> controlButtonContainer.setControlButtonVisible(controlButtonType, visible));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setControlButtonText(ControlButtonType controlButtonType, String text) {
/* 109 */     visitControlButtons(controlButtonType, controlButton -> controlButton.setControlButtonText(text));
/* 110 */     visitControlButtonContainers(controlButtonContainer -> controlButtonContainer.setControlButtonText(controlButtonType, text));
/*     */   }
/*     */ 
/*     */   
/*     */   public void focusControlButton(ControlButtonType controlButtonType) {
/* 115 */     visitControlButtons(controlButtonType, ControlButton::focusControlButton);
/* 116 */     visitControlButtonContainers(controlButtonContainer -> controlButtonContainer.focusControlButton(controlButtonType));
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createComponent() {
/* 121 */     return this.formPanel;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStyleContext(StyleContext styleContext) {
/* 126 */     this.lastStyleContext = styleContext;
/* 127 */     if (getFormEnvironment() != null) {
/* 128 */       setStyleContext();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormPanel(JPanel formPanel, FormEnvironment formEnvironment) {
/* 134 */     this.formPanel = formPanel;
/* 135 */     AnchorUtil.setAlignments(formPanel, getAnchor());
/* 136 */     setFormEnvironment(formEnvironment);
/* 137 */     if (this.lastStyleContext != null) {
/* 138 */       setStyleContext();
/*     */     }
/*     */   }
/*     */   
/*     */   private void setStyleContext() {
/* 143 */     if (this.lastStyleContext != null) {
/* 144 */       StyleContextReceiver[] styleContextReceivers = (StyleContextReceiver[])getFormEnvironment().getFormComponents(StyleContextReceiver.class);
/* 145 */       for (StyleContextReceiver styleContextReceiver : styleContextReceivers) {
/* 146 */         styleContextReceiver.setStyleContext(this.lastStyleContext);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isScrollFormPanel() {
/* 153 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public FormEnvironment getFormEnvironment() {
/* 158 */     return (FormEnvironment)replaceWithTextOverride("formEnvironment", this.formEnvironment, FormEnvironment.class);
/*     */   }
/*     */   
/*     */   private void visitControlButtons(ControlButtonType controlButtonType, ControlButtonVisitor visitor) {
/* 162 */     if (getFormEnvironment() != null) {
/* 163 */       ControlButton[] formComponents = (ControlButton[])getFormEnvironment().getFormComponents(ControlButton.class);
/* 164 */       for (ControlButton controlButton : formComponents) {
/* 165 */         if (controlButton.getControlButtonType() == controlButtonType) {
/* 166 */           visitor.visit(controlButton);
/*     */         }
/*     */       } 
/*     */     } else {
/* 170 */       this.deferredRunnables.add(() -> visitControlButtons(controlButtonType, visitor));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void visitControlButtonContainers(ControlButtonContainerVisitor visitor) {
/* 175 */     if (getFormEnvironment() != null) {
/* 176 */       ControlButtonContainer[] formComponents = (ControlButtonContainer[])getFormEnvironment().getFormComponents(ControlButtonContainer.class);
/* 177 */       for (ControlButtonContainer controlButtonContainer : formComponents) {
/* 178 */         visitor.visit(controlButtonContainer);
/*     */       }
/*     */     } else {
/* 181 */       this.deferredRunnables.add(() -> visitControlButtonContainers(visitor));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/* 186 */     this.formEnvironment = formEnvironment;
/*     */   }
/*     */   
/*     */   private static interface ControlButtonContainerVisitor {
/*     */     void visit(ControlButtonContainer param1ControlButtonContainer);
/*     */   }
/*     */   
/*     */   private static interface ControlButtonVisitor {
/*     */     void visit(ControlButton param1ControlButton);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\styles\FormStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */