/*    */ package com.install4j.api.beaninfo;
/*    */ 
/*    */ import javax.swing.Icon;
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
/*    */ public class EnumerationMapEntry
/*    */ {
/*    */   private String name;
/*    */   private Object object;
/*    */   private Icon icon;
/*    */   
/*    */   public EnumerationMapEntry(String name, Object object) {
/* 22 */     this(name, object, null);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public EnumerationMapEntry(String name, Object object, Icon icon) {
/* 32 */     this.name = name;
/* 33 */     this.object = object;
/* 34 */     this.icon = icon;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getName() {
/* 42 */     return this.name;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object getObject() {
/* 50 */     return this.object;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Icon getIcon() {
/* 58 */     return this.icon;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\EnumerationMapEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */