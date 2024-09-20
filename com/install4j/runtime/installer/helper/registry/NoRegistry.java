/*    */ package com.install4j.runtime.installer.helper.registry;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class NoRegistry
/*    */   implements RegistryInterface
/*    */ {
/*    */   public void setValue(String name, String value) {}
/*    */   
/*    */   public void deleteValue(String name) {}
/*    */   
/*    */   public String getValue(String name) {
/* 14 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getOtherBitnessValue(String valueName) {
/* 19 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\registry\NoRegistry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */