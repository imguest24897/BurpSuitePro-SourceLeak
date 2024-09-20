/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ 
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.installer.frontend.components.ProgressDisplay;
/*     */ import com.install4j.runtime.installer.platform.win32.WinTaskBar;
/*     */ import java.io.File;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JProgressBar;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public class ProgressComponent
/*     */   extends SystemFormComponent implements ProgressInterface {
/*     */   private boolean hideInitially = false;
/*  20 */   private String initialStatusMessage = ""; private boolean statusVisible = true; private boolean detailVisible = true;
/*  21 */   private String initialDetailMessage = "";
/*     */   
/*     */   private ProgressDisplay progressDisplay;
/*     */   
/*     */   public boolean isHideInitially() {
/*  26 */     return replaceWithTextOverride("hideInitially", this.hideInitially);
/*     */   }
/*     */   
/*     */   public void setHideInitially(boolean hideInitially) {
/*  30 */     this.hideInitially = hideInitially;
/*     */   }
/*     */   
/*     */   public String getInitialStatusMessage() {
/*  34 */     return replaceVariables(replaceFormVariables(this.initialStatusMessage));
/*     */   }
/*     */   
/*     */   public void setInitialStatusMessage(String initialStatusMessage) {
/*  38 */     this.initialStatusMessage = initialStatusMessage;
/*     */   }
/*     */   
/*     */   public String getInitialDetailMessage() {
/*  42 */     return replaceVariables(this.initialDetailMessage);
/*     */   }
/*     */   
/*     */   public void setInitialDetailMessage(String initialDetailMessage) {
/*  46 */     this.initialDetailMessage = initialDetailMessage;
/*     */   }
/*     */   
/*     */   public boolean isStatusVisible() {
/*  50 */     return replaceWithTextOverride("statusVisible", this.statusVisible);
/*     */   }
/*     */   
/*     */   public void setStatusVisible(boolean statusVisible) {
/*  54 */     this.statusVisible = statusVisible;
/*     */   }
/*     */   
/*     */   public boolean isDetailVisible() {
/*  58 */     return replaceWithTextOverride("detailVisible", this.detailVisible);
/*     */   }
/*     */   
/*     */   public void setDetailVisible(boolean detailVisible) {
/*  62 */     this.detailVisible = detailVisible;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/*  67 */     super.setFormEnvironment(formEnvironment);
/*  68 */     if (this.progressDisplay != null && formEnvironment != null) {
/*  69 */       this.progressDisplay.getProgressBar().setName(formEnvironment.getId((FormComponent)this));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/*  75 */     this.progressDisplay = new ProgressDisplay();
/*  76 */     if (getFormEnvironment().isDesignTime()) {
/*  77 */       if (isHideInitially()) {
/*     */         
/*  79 */         JLabel label = new JLabel("[Initially hidden progress display]");
/*  80 */         label.setEnabled(false);
/*  81 */         return label;
/*     */       } 
/*     */       
/*  84 */       this.progressDisplay.setStatusMessage("[Status line]");
/*  85 */       this.progressDisplay.setDetailMessage("[Detail line]");
/*  86 */       this.progressDisplay.setTextLinesEnabled(false);
/*  87 */       this.progressDisplay.setPercentCompleted(50);
/*     */     } else {
/*  89 */       this.progressDisplay.setStatusMessage(getInitialStatusMessage());
/*  90 */       this.progressDisplay.setDetailMessage(getInitialDetailMessage());
/*     */     } 
/*  92 */     this.progressDisplay.setDetailVisible(isDetailVisible());
/*  93 */     this.progressDisplay.setStatusVisible(isStatusVisible());
/*     */     
/*  95 */     return (JComponent)this.progressDisplay;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getConfigurationObject() {
/* 100 */     return this.progressDisplay.getProgressBar();
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/* 105 */     return JProgressBar.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/* 110 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void formWillActivate() {
/* 115 */     if (isHideInitially()) {
/* 116 */       if (getFormEnvironment().isDesignTime()) {
/* 117 */         setEnabled(false);
/*     */       } else {
/* 119 */         setVisible(false);
/*     */       } 
/*     */     }
/* 122 */     super.formWillActivate();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatusMessage(String statusMessage) {
/* 129 */     checkVisible();
/* 130 */     this.progressDisplay.setStatusMessage(statusMessage);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDetailMessage(String detailMessage) {
/* 135 */     checkVisible();
/* 136 */     this.progressDisplay.setDetailMessage(detailMessage);
/*     */   }
/*     */ 
/*     */   
/*     */   public int getPercentCompleted() {
/* 141 */     return replaceWithTextOverride("percentCompleted", this.progressDisplay.getPercentCompleted());
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSecondaryPercentCompleted(int percentCompleted) {
/* 146 */     checkVisible();
/* 147 */     this.progressDisplay.setSecondaryPercentCompleted(percentCompleted);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPercentCompleted(int percentCompleted) {
/* 152 */     checkVisible();
/* 153 */     this.progressDisplay.setPercentCompleted(percentCompleted);
/* 154 */     WinTaskBar taskBar = getTaskBar();
/* 155 */     taskBar.setProgressState(WinTaskBar.ProgressState.NORMAL);
/* 156 */     taskBar.setProgress(percentCompleted, 100L);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setIndeterminateProgress(boolean indeterminateProgress) {
/* 161 */     checkVisible();
/* 162 */     this.progressDisplay.setIndeterminateProgress(indeterminateProgress);
/* 163 */     getTaskBar().setProgressState(WinTaskBar.ProgressState.INDETERMINATE);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private WinTaskBar getTaskBar() {
/* 168 */     return WinTaskBar.getTaskBar(GUIHelper.getParentWindow());
/*     */   }
/*     */ 
/*     */   
/*     */   public void showFailure(String message) {
/* 173 */     getDefaultProgressInterface().showFailure(message);
/*     */   }
/*     */ 
/*     */   
/*     */   public int askOverwrite(File file) throws UserCanceledException {
/* 178 */     return getDefaultProgressInterface().askOverwrite(file);
/*     */   }
/*     */ 
/*     */   
/*     */   public int askRetry(File file) throws UserCanceledException {
/* 183 */     return getDefaultProgressInterface().askRetry(file);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean askContinue(File file) throws UserCanceledException {
/* 188 */     return getDefaultProgressInterface().askContinue(file);
/*     */   }
/*     */   
/*     */   public ProgressInterface getDefaultProgressInterface() {
/* 192 */     return ((ContextImpl)ContextImpl.getSingleContextInt()).getDefaultProgressInterface();
/*     */   }
/*     */   
/*     */   private void checkVisible() {
/* 196 */     if (!isVisible()) {
/* 197 */       GUIHelper.invokeLater(() -> setVisible(true));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hasUserInput() {
/* 203 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\ProgressComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */