/*    */ package com.install4j.api.windows;
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
/*    */ public enum RegistryRoot
/*    */ {
/* 15 */   HKEY_CLASSES_ROOT(1, "HKEY_CLASSES_ROOT"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 20 */   HKEY_LOCAL_MACHINE(3, "HKEY_LOCAL_MACHINE"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 25 */   HKEY_CURRENT_USER(2, "HKEY_CURRENT_USER"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 30 */   HKEY_USERS(4, "HKEY_USERS"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 35 */   HKEY_CURRENT_CONFIG(5, "HKEY_CURRENT_CONFIG");
/*    */   
/*    */   private final transient int type;
/*    */   private final transient String name;
/*    */   
/*    */   RegistryRoot(int type, String name) {
/* 41 */     this.type = type;
/* 42 */     this.name = name;
/*    */   }
/*    */   
/*    */   int getType() {
/* 46 */     return this.type;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 51 */     return this.name;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\RegistryRoot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */