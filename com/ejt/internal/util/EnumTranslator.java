/*    */ package com.ejt.internal.util;
/*    */ 
/*    */ public class EnumTranslator<E extends Enum<E>>
/*    */ {
/*    */   private E[] values;
/*    */   private String[] names;
/*    */   
/*    */   public EnumTranslator(E[] values) {
/*  9 */     this.values = values;
/*    */   }
/*    */   
/*    */   public String[] getNames() {
/* 13 */     if (this.names == null) {
/* 14 */       this.names = new String[this.values.length];
/* 15 */       for (int i = 0; i < this.values.length; i++) {
/* 16 */         this.names[i] = this.values[i].toString();
/*    */       }
/*    */     } 
/* 19 */     return this.names;
/*    */   }
/*    */   
/*    */   public E getByIndex(int index) {
/* 23 */     if (index >= 0 && index < this.values.length) {
/* 24 */       return this.values[index];
/*    */     }
/* 26 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public E getByName(String name) {
/* 31 */     for (E value : this.values) {
/* 32 */       if (value.toString().equals(name)) {
/* 33 */         return value;
/*    */       }
/*    */     } 
/* 36 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\interna\\util\EnumTranslator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */