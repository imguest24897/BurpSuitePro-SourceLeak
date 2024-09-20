/*     */ package com.install4j.runtime.beans.screens;
/*     */ 
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.io.File;
/*     */ import java.util.List;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTextPane;
/*     */ 
/*     */ 
/*     */ public class UninstallFailureScreen
/*     */   extends SystemScreen
/*     */ {
/*     */   private JTextPane txaInfo;
/*     */   private JScrollPane scpInfo;
/*     */   private boolean failure;
/*     */   private boolean showDirectories = false;
/*     */   
/*     */   public boolean isPreviousVisible() {
/*  25 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isHidden() {
/*  30 */     return InstallerUtil.isWindows();
/*     */   }
/*     */   
/*     */   public boolean isShowDirectories() {
/*  34 */     return replaceWithTextOverride("showDirectories", this.showDirectories);
/*     */   }
/*     */   
/*     */   public void setShowDirectories(boolean showDirectories) {
/*  38 */     this.showDirectories = showDirectories;
/*     */   }
/*     */ 
/*     */   
/*     */   public void activated() {
/*  43 */     this.failure = checkFailure();
/*  44 */     if (this.failure) {
/*  45 */       super.activated();
/*     */     } else {
/*  47 */       getContext().goForward(1, true, true);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void deactivated() {
/*  53 */     if (this.failure) {
/*  54 */       System.exit(1);
/*     */     } else {
/*  56 */       super.deactivated();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/*  62 */     if (!super.handleConsole(console)) {
/*  63 */       return false;
/*     */     }
/*  65 */     setupControls();
/*  66 */     if (checkFailure()) {
/*  67 */       console.println(getMessage(".UninstallFailureLabel"));
/*  68 */       console.println(this.txaInfo.getText());
/*  69 */       System.exit(1);
/*     */     } else {
/*  71 */       getUninstallerContext().goForward(1, true, false);
/*     */     } 
/*  73 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setupControls() {
/*  79 */     super.setupControls();
/*     */     
/*  81 */     this.txaInfo = new JTextPane();
/*  82 */     this.txaInfo.setEditable(false);
/*  83 */     this.scpInfo = new JScrollPane(this.txaInfo);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void addScreenContent(JPanel panel, GridBagConstraints gc) {
/*  89 */     String headerMessage = getMessage(".UninstallFailureLabel");
/*  90 */     if (headerMessage.trim().length() > 0) {
/*  91 */       addDisplayTextArea(headerMessage, panel, gc);
/*     */     }
/*  93 */     gc.insets.top = 5;
/*     */     
/*  95 */     gc.weighty = 1.0D;
/*  96 */     gc.fill = 1;
/*  97 */     gc.insets.bottom = 10;
/*  98 */     panel.add(this.scpInfo, gc);
/*  99 */     gc.gridy++;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTitle() {
/* 105 */     return getMessage(".UninstallFailureTitle");
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSubTitle() {
/* 110 */     return Messages.format(getMessage(".UninstallFailureSubTitle"), new Object[] { getApplicationName() });
/*     */   }
/*     */   
/*     */   private boolean checkFailure() {
/* 114 */     if (InstallerUtil.isWindows()) {
/* 115 */       return false;
/*     */     }
/*     */     
/* 118 */     List<File> stillUndeleted = FileInstaller.getInstance().deleteUndeleted();
/*     */     
/* 120 */     StringBuffer buffer = new StringBuffer();
/* 121 */     if (stillUndeleted.size() > 0) {
/* 122 */       addFailureText(stillUndeleted, buffer);
/*     */     }
/*     */     
/* 125 */     String failureText = buffer.toString();
/* 126 */     if (failureText.length() > 0) {
/* 127 */       this.txaInfo.setText(failureText);
/* 128 */       return true;
/*     */     } 
/*     */     
/* 131 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private void addFailureText(List<File> files, StringBuffer buffer) {
/* 136 */     for (File file : files) {
/* 137 */       if (isShowDirectories() || file.isFile()) {
/* 138 */         buffer.append(file.getPath());
/* 139 */         buffer.append("\n");
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\UninstallFailureScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */