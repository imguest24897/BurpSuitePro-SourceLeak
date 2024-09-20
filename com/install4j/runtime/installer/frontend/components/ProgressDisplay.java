/*     */ package com.install4j.runtime.installer.frontend.components;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JProgressBar;
/*     */ 
/*     */ public class ProgressDisplay extends JPanel {
/*     */   private JLabel lblStatus;
/*     */   private JLabel lblDetail;
/*     */   private JProgressBar progressBar;
/*     */   private GridBagConstraints gc;
/*  17 */   private int percentCompleted = 0;
/*  18 */   private int secondaryPercentCompleted = 0;
/*     */   private String lastDetailMessage;
/*     */   private boolean progressBarSizeWorkaround;
/*     */   
/*     */   public ProgressDisplay() {
/*  23 */     setupControls();
/*  24 */     setupComponent();
/*     */   }
/*     */   
/*     */   public void setStatusMessage(String statusMessage) {
/*  28 */     GUIHelper.invokeLater(() -> this.lblStatus.setText((statusMessage.length() == 0) ? " " : statusMessage));
/*     */   }
/*     */   
/*     */   public void setDetailMessage(String detailMessage) {
/*  32 */     this.lastDetailMessage = detailMessage;
/*  33 */     GUIHelper.invokeLater(() -> this.lblDetail.setText((detailMessage.length() == 0) ? " " : detailMessage));
/*     */   }
/*     */   
/*     */   public void setStatusVisible(boolean visible) {
/*  37 */     GUIHelper.invokeLater(() -> this.lblStatus.setVisible(visible));
/*     */   }
/*     */   
/*     */   public void setDetailVisible(boolean visible) {
/*  41 */     GUIHelper.invokeLater(() -> this.lblDetail.setVisible(visible));
/*     */   }
/*     */   
/*     */   public void setPercentCompleted(int percentCompleted) {
/*  45 */     if (this.percentCompleted == percentCompleted) {
/*     */       return;
/*     */     }
/*  48 */     this.percentCompleted = Math.min(percentCompleted, 100);
/*  49 */     GUIHelper.invokeLater(() -> this.progressBar.setValue(percentCompleted));
/*     */   }
/*     */   
/*     */   public int getPercentCompleted() {
/*  53 */     return this.percentCompleted;
/*     */   }
/*     */   
/*     */   public JProgressBar getProgressBar() {
/*  57 */     return this.progressBar;
/*     */   }
/*     */ 
/*     */   
/*     */   private void setupControls() {
/*  62 */     this.lblStatus = new JLabel(" ");
/*  63 */     this.lblDetail = new JLabel(" ");
/*  64 */     this.progressBar = new JProgressBar(0, 0, 100);
/*  65 */     this.progressBarSizeWorkaround = (Boolean.getBoolean("install4j.progressBarWorkaround") || Util.isWindows2012() || Util.isWindows2016());
/*  66 */     if (this.progressBarSizeWorkaround) {
/*  67 */       this.progressBar.setPreferredSize(new Dimension(100, 15));
/*  68 */       this.progressBar.setMinimumSize(new Dimension(100, 15));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEnabled(boolean enabled) {
/*  74 */     GUIHelper.invokeLater(() -> setTextLinesEnabled(enabled));
/*     */   }
/*     */   
/*     */   public void setTextLinesEnabled(boolean enabled) {
/*  78 */     GUIHelper.invokeLater(() -> {
/*     */           this.lblStatus.setEnabled(enabled);
/*     */           this.lblDetail.setEnabled(enabled);
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private void setupComponent() {
/*  86 */     setLayout(new GridBagLayout());
/*     */     
/*  88 */     this.gc = new GridBagConstraints();
/*  89 */     this.gc.gridx = 0;
/*  90 */     this.gc.gridy = 0;
/*  91 */     this.gc.weightx = 1.0D;
/*  92 */     this.gc.fill = 2;
/*     */     
/*  94 */     add(this.lblStatus, this.gc);
/*  95 */     this.gc.gridy++;
/*  96 */     add(this.lblDetail, this.gc);
/*  97 */     this.gc.gridy++;
/*  98 */     this.gc.insets.top = 3;
/*  99 */     this.gc.insets.bottom = 3;
/* 100 */     add(this.progressBar, this.gc);
/* 101 */     this.gc.gridy++;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIndeterminateProgress(boolean indeterminateProgress) {
/* 108 */     GUIHelper.invokeLater(() -> setIndeterminateInternal(indeterminateProgress));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void setIndeterminateInternal(boolean indeterminateProgress) {
/* 114 */     if (!this.progressBarSizeWorkaround) {
/*     */       
/* 116 */       this.progressBar.setPreferredSize((Dimension)null);
/* 117 */       if (indeterminateProgress) {
/* 118 */         Dimension size = this.progressBar.getPreferredSize();
/* 119 */         size.height--;
/* 120 */         this.progressBar.setPreferredSize(size);
/*     */       } 
/* 122 */       this.progressBar.invalidate();
/* 123 */       validate();
/*     */     } 
/* 125 */     this.progressBar.setIndeterminate(indeterminateProgress);
/*     */   }
/*     */ 
/*     */   
/*     */   public void activate() {}
/*     */   
/*     */   public void setSecondaryPercentCompleted(int percentCompleted) {
/* 132 */     if (this.secondaryPercentCompleted == percentCompleted || percentCompleted < 0) {
/*     */       return;
/*     */     }
/* 135 */     this.secondaryPercentCompleted = percentCompleted;
/* 136 */     GUIHelper.invokeLater(() -> {
/*     */           if (!this.lblDetail.isVisible())
/*     */             setDetailVisible(true); 
/*     */           StringBuilder buffer = new StringBuilder();
/*     */           if (this.lastDetailMessage != null && this.lastDetailMessage.trim().length() > 0) {
/*     */             buffer.append(this.lastDetailMessage);
/*     */             buffer.append(' ');
/*     */           } 
/*     */           buffer.append("(");
/*     */           buffer.append(percentCompleted);
/*     */           buffer.append(" %)");
/*     */           this.lblDetail.setText(buffer.toString());
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\components\ProgressDisplay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */