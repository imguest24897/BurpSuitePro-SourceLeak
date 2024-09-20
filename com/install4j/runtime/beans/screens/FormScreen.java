/*     */ package com.install4j.runtime.beans.screens;
/*     */ 
/*     */ import com.install4j.api.beans.Anchor;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.api.screens.FormPanelContainer;
/*     */ import com.install4j.runtime.beans.AnchorUtil;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.frontend.FormPanel;
/*     */ import java.awt.GridBagConstraints;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public class FormScreen
/*     */   extends SystemScreen
/*     */   implements FormPanelContainer, ScrollConfigurable {
/*  19 */   private String title = "";
/*  20 */   private String subTitle = "";
/*     */   
/*     */   private boolean fillHorizontally = true;
/*     */   private boolean fillVertically = true;
/*  24 */   private Anchor horizontalAnchor = Anchor.CENTER;
/*  25 */   private Anchor verticalAnchor = Anchor.CENTER;
/*     */   private boolean scrollable = true;
/*  27 */   private VisibilityForNavigationDirection visibilityForNavigationDirection = VisibilityForNavigationDirection.ALL;
/*     */   
/*     */   private JPanel formPanel;
/*     */   
/*     */   private FormEnvironment formEnvironment;
/*     */   
/*     */   public String getTitle() {
/*  34 */     return replaceVariables(replaceVariables(this.title, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*     */   }
/*     */   
/*     */   public void setTitle(String title) {
/*  38 */     this.title = title;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSubTitle() {
/*  43 */     return replaceVariables(replaceVariables(this.subTitle, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*     */   }
/*     */   
/*     */   public void setSubTitle(String subTitle) {
/*  47 */     this.subTitle = subTitle;
/*     */   }
/*     */   
/*     */   public boolean isFillHorizontally() {
/*  51 */     return replaceWithTextOverride("fillHorizontally", this.fillHorizontally);
/*     */   }
/*     */   
/*     */   public void setFillHorizontally(boolean fillHorizontally) {
/*  55 */     this.fillHorizontally = fillHorizontally;
/*     */   }
/*     */   
/*     */   public boolean isFillVertically() {
/*  59 */     return replaceWithTextOverride("fillVertically", this.fillVertically);
/*     */   }
/*     */   
/*     */   public void setFillVertically(boolean fillVertically) {
/*  63 */     this.fillVertically = fillVertically;
/*     */   }
/*     */   
/*     */   public Anchor getHorizontalAnchor() {
/*  67 */     return (Anchor)replaceWithTextOverride("horizontalAnchor", this.horizontalAnchor, Anchor.class);
/*     */   }
/*     */   
/*     */   public void setHorizontalAnchor(Anchor horizontalAnchor) {
/*  71 */     this.horizontalAnchor = horizontalAnchor;
/*     */   }
/*     */   
/*     */   public Anchor getVerticalAnchor() {
/*  75 */     return (Anchor)replaceWithTextOverride("verticalAnchor", this.verticalAnchor, Anchor.class);
/*     */   }
/*     */   
/*     */   public void setVerticalAnchor(Anchor verticalAnchor) {
/*  79 */     this.verticalAnchor = verticalAnchor;
/*     */   }
/*     */ 
/*     */   
/*     */   public Anchor getAnchor() {
/*  84 */     return AnchorUtil.getAnchor(getHorizontalAnchor(), getVerticalAnchor());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillHorizontal() {
/*  89 */     return isFillHorizontally();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillVertical() {
/*  94 */     return isFillVertically();
/*     */   }
/*     */ 
/*     */   
/*     */   public void resetFormComponents() {
/*  99 */     if (this.formPanel != null) {
/* 100 */       ((FormPanel)this.formPanel).previous();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isScrollable() {
/* 106 */     return replaceWithTextOverride("scrollable", this.scrollable);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setScrollable(boolean scrollable) {
/* 111 */     this.scrollable = scrollable;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormPanel(JPanel formPanel, FormEnvironment formEnvironment) {
/* 116 */     this.formPanel = formPanel;
/* 117 */     this.formEnvironment = formEnvironment;
/*     */   }
/*     */   
/*     */   public VisibilityForNavigationDirection getVisibilityForNavigationDirection() {
/* 121 */     return (VisibilityForNavigationDirection)replaceWithTextOverride("visibilityForNavigationDirection", this.visibilityForNavigationDirection, VisibilityForNavigationDirection.class);
/*     */   }
/*     */   
/*     */   public void setVisibilityForNavigationDirection(VisibilityForNavigationDirection visibilityForNavigationDirection) {
/* 125 */     this.visibilityForNavigationDirection = visibilityForNavigationDirection;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isHiddenForPrevious() {
/* 130 */     return (getVisibilityForNavigationDirection() == VisibilityForNavigationDirection.NEXT_ONLY);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isHiddenForNext() {
/* 135 */     return (getVisibilityForNavigationDirection() == VisibilityForNavigationDirection.BACK_ONLY);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isScrollFormPanel() {
/* 140 */     return isScrollable();
/*     */   }
/*     */ 
/*     */   
/*     */   public FormEnvironment getFormEnvironment() {
/* 145 */     return this.formEnvironment;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void addScreenContent(JPanel panel, GridBagConstraints gc) {
/* 150 */     gc.weightx = gc.weighty = 1.0D;
/* 151 */     gc.fill = 1;
/* 152 */     panel.add(this.formPanel, gc);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 157 */     if (!super.handleConsole(console)) {
/* 158 */       return false;
/*     */     }
/* 160 */     String subTitle = getSubTitle();
/* 161 */     if (!subTitle.isEmpty()) {
/* 162 */       console.println(subTitle);
/* 163 */     } else if (hasConsoleScreenChangeHandler()) {
/* 164 */       console.println(getTitle());
/*     */     } 
/* 166 */     return this.formEnvironment.handleConsole(console);
/*     */   }
/*     */   
/*     */   private boolean hasConsoleScreenChangeHandler() {
/* 170 */     ScriptProperty consoleScreenChangeHandler = InstallerConfig.getCurrentApplication().getConsoleScreenChangeHandler();
/* 171 */     return (consoleScreenChangeHandler == null || consoleScreenChangeHandler.getValue() == null || consoleScreenChangeHandler.getValue().isEmpty());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\FormScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */