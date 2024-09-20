/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ public class ScriptClassOrigin
/*    */   extends AbstractConfig
/*    */ {
/*    */   private String className;
/*  9 */   private String beanType = "";
/* 10 */   private String beanName = "";
/* 11 */   private String propertyName = "";
/* 12 */   private String parentScreen = "";
/* 13 */   private int scriptLineCount = 0;
/* 14 */   private int importLineCount = 0;
/* 15 */   private int headerLineCount = 0;
/*    */ 
/*    */   
/*    */   public ScriptClassOrigin() {}
/*    */ 
/*    */   
/*    */   public ScriptClassOrigin(String className, String beanType, String beanName, String propertyName, String parentScreen) {
/* 22 */     this.className = className;
/* 23 */     this.beanType = beanType;
/* 24 */     this.beanName = beanName;
/* 25 */     this.propertyName = propertyName;
/* 26 */     this.parentScreen = parentScreen;
/*    */   }
/*    */   
/*    */   public void setLineCounts(int importLineCount, int headerLineCount, int scriptLineCount) {
/* 30 */     this.importLineCount = importLineCount;
/* 31 */     this.headerLineCount = headerLineCount;
/* 32 */     this.scriptLineCount = scriptLineCount;
/*    */   }
/*    */   
/*    */   public int getScriptLineCount() {
/* 36 */     return this.scriptLineCount;
/*    */   }
/*    */   
/*    */   public int getPackageLineCount() {
/* 40 */     return this.className.contains(".") ? 1 : 0;
/*    */   }
/*    */   
/*    */   public int getImportLineCount() {
/* 44 */     return this.importLineCount;
/*    */   }
/*    */   
/*    */   public int getHeaderLineCount() {
/* 48 */     return this.headerLineCount;
/*    */   }
/*    */   
/*    */   public String getClassName() {
/* 52 */     return this.className;
/*    */   }
/*    */   
/*    */   public String getBeanType() {
/* 56 */     return this.beanType;
/*    */   }
/*    */   
/*    */   public String getBeanName() {
/* 60 */     return this.beanName;
/*    */   }
/*    */   
/*    */   public String getPropertyName() {
/* 64 */     return this.propertyName;
/*    */   }
/*    */   
/*    */   public String getParentScreen() {
/* 68 */     return this.parentScreen;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void read(Element element) {
/* 73 */     this.className = readAttribute(element, "className", this.className);
/* 74 */     this.beanType = readAttribute(element, "beanType", this.beanType);
/* 75 */     this.beanName = readAttribute(element, "beanName", this.beanName);
/* 76 */     this.propertyName = readAttribute(element, "propertyName", this.propertyName);
/* 77 */     this.parentScreen = readAttribute(element, "parentScreen", this.parentScreen);
/* 78 */     this.importLineCount = readAttribute(element, "importLineCount", this.importLineCount);
/* 79 */     this.headerLineCount = readAttribute(element, "headerLineCount", this.headerLineCount);
/* 80 */     this.scriptLineCount = readAttribute(element, "scriptLineCount", this.scriptLineCount);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 85 */     return "ScriptClassOrigin{className='" + this.className + '\'' + ", beanType='" + this.beanType + '\'' + ", beanName='" + this.beanName + '\'' + ", propertyName='" + this.propertyName + '\'' + ", parentScreen='" + this.parentScreen + '\'' + ", scriptLineCount=" + this.scriptLineCount + ", importLineCount=" + this.importLineCount + ", headerLineCount=" + this.headerLineCount + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\ScriptClassOrigin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */