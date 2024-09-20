/*    */ package com.install4j.runtime.beans.screens.components;
/*    */ 
/*    */ import com.install4j.api.beans.ExternalFile;
/*    */ 
/*    */ public abstract class ProgramGroupWithIconConfig
/*    */   extends ProgramGroupEntryConfig {
/*  7 */   private ExternalFile iconFile = null;
/*    */   
/*    */   public ExternalFile getIconFile() {
/* 10 */     return this.iconFile;
/*    */   }
/*    */   
/*    */   public void setIconFile(ExternalFile iconFile) {
/* 14 */     this.iconFile = iconFile;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\components\ProgramGroupWithIconConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */