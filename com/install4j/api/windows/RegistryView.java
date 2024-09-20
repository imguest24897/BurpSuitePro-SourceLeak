/*    */ package com.install4j.api.windows;
/*    */ 
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum RegistryView
/*    */ {
/* 18 */   DEFAULT(0, "Default"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 23 */   BIT32(512, "32-bit view"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 28 */   BIT64(256, "64-bit view");
/*    */   
/*    */   private final transient int type;
/*    */   private final transient String name;
/*    */   
/*    */   RegistryView(int type, String name) {
/* 34 */     this.type = type;
/* 35 */     this.name = name;
/*    */   }
/*    */   
/*    */   int getUsedType() {
/* 39 */     if (InstallerUtil.isWindows()) {
/* 40 */       return this.type;
/*    */     }
/* 42 */     return DEFAULT.type;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 48 */     return this.name;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\RegistryView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */