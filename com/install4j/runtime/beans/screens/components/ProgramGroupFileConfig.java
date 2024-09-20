/*    */ package com.install4j.runtime.beans.screens.components;
/*    */ 
/*    */ import com.install4j.runtime.installer.InstallerVariables;
/*    */ import java.io.File;
/*    */ 
/*    */ public class ProgramGroupFileConfig
/*    */   extends ProgramGroupWithIconConfig
/*    */ {
/*  9 */   private File target = null;
/* 10 */   private String arguments = "";
/*    */   private boolean runAsAdministrator = false;
/*    */   
/*    */   public File getTarget() {
/* 14 */     return InstallerVariables.replaceVariables(this.target);
/*    */   }
/*    */   
/*    */   public void setTarget(File target) {
/* 18 */     this.target = target;
/*    */   }
/*    */   
/*    */   public String getArguments() {
/* 22 */     return InstallerVariables.replaceVariables(this.arguments);
/*    */   }
/*    */   
/*    */   public void setArguments(String arguments) {
/* 26 */     this.arguments = arguments;
/*    */   }
/*    */   
/*    */   public boolean isRunAsAdministrator() {
/* 30 */     return this.runAsAdministrator;
/*    */   }
/*    */   
/*    */   public void setRunAsAdministrator(boolean runAsAdministrator) {
/* 34 */     this.runAsAdministrator = runAsAdministrator;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 39 */     return "ProgramGroupFileConfig{target=" + 
/* 40 */       getTarget() + ", arguments='" + 
/* 41 */       getArguments() + '\'' + ", runAsAdministrator=" + 
/* 42 */       isRunAsAdministrator() + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\components\ProgramGroupFileConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */