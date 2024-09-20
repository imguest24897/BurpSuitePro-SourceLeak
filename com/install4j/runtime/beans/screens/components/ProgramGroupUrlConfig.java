/*    */ package com.install4j.runtime.beans.screens.components;
/*    */ 
/*    */ import com.install4j.runtime.installer.InstallerVariables;
/*    */ 
/*    */ public class ProgramGroupUrlConfig
/*    */   extends ProgramGroupWithIconConfig {
/*  7 */   private String url = "";
/*    */   private boolean favicon;
/*    */   
/*    */   public String getUrl() {
/* 11 */     return InstallerVariables.replaceVariables(this.url);
/*    */   }
/*    */   
/*    */   public void setUrl(String url) {
/* 15 */     this.url = url;
/*    */   }
/*    */   
/*    */   public boolean isFavicon() {
/* 19 */     return this.favicon;
/*    */   }
/*    */   
/*    */   public void setFavicon(boolean favicon) {
/* 23 */     this.favicon = favicon;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\components\ProgramGroupUrlConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */