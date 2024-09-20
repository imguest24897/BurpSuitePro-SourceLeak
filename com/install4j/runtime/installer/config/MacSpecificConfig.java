/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ public class MacSpecificConfig
/*    */   extends AbstractConfig
/*    */ {
/*  8 */   private String runtimeDirParent = "";
/*    */   private boolean singleBundle = false;
/* 10 */   private String singleBundleName = "";
/* 11 */   private String singleBundleLauncherId = "";
/*    */   
/*    */   public String getRuntimeDirParent() {
/* 14 */     return this.runtimeDirParent;
/*    */   }
/*    */   
/*    */   public boolean isSingleBundle() {
/* 18 */     return this.singleBundle;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void read(Element element) {
/* 23 */     this.runtimeDirParent = readAttribute(element, "runtimeDirParent", this.runtimeDirParent);
/* 24 */     this.singleBundle = readAttribute(element, "singleBundle", this.singleBundle);
/* 25 */     this.singleBundleName = readAttribute(element, "singleBundleName", this.singleBundleName);
/* 26 */     this.singleBundleLauncherId = readAttribute(element, "singleBundleLauncherId", this.singleBundleLauncherId);
/*    */   }
/*    */   
/*    */   public String getSingleBundleName() {
/* 30 */     return this.singleBundleName;
/*    */   }
/*    */   
/*    */   public void setSingleBundleName(String singleBundleName) {
/* 34 */     this.runtimeDirParent = this.runtimeDirParent.replace(this.singleBundleName, singleBundleName);
/* 35 */     this.singleBundleName = singleBundleName;
/*    */   }
/*    */   
/*    */   public String getSingleBundleLauncherId() {
/* 39 */     return this.singleBundleLauncherId;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\MacSpecificConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */