/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ public class ServiceConfig
/*    */   extends LauncherConfig
/*    */ {
/*  8 */   private String startupType = "";
/*  9 */   private String dependencies = "";
/*    */   
/*    */   public String getStartupType() {
/* 12 */     return this.startupType;
/*    */   }
/*    */   
/*    */   public void setStartupType(String startupType) {
/* 16 */     this.startupType = startupType;
/*    */   }
/*    */   
/*    */   public String getDependencies() {
/* 20 */     return this.dependencies;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void read(Element element) {
/* 25 */     super.read(element);
/* 26 */     this.startupType = readAttribute(element, "startupType", this.startupType);
/* 27 */     this.dependencies = readAttribute(element, "dependencies", this.dependencies);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\ServiceConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */