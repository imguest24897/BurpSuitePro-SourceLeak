/*    */ package com.install4j.runtime.beans.screens.components;
/*    */ 
/*    */ import com.install4j.runtime.installer.InstallerVariables;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public abstract class ProgramGroupEntryConfig
/*    */   implements Serializable
/*    */ {
/*  9 */   private String name = "";
/*    */   
/*    */   public String getName() {
/* 12 */     return InstallerVariables.replaceVariables(this.name);
/*    */   }
/*    */   
/*    */   public void setName(String name) {
/* 16 */     this.name = name;
/*    */   }
/*    */   
/*    */   public String getSimpleName() {
/* 20 */     String name = getName();
/* 21 */     int index = Math.max(name.lastIndexOf('\\'), name.lastIndexOf('/'));
/* 22 */     if (index > -1) {
/* 23 */       name = name.substring(index + 1);
/*    */     }
/* 25 */     return name;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\components\ProgramGroupEntryConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */