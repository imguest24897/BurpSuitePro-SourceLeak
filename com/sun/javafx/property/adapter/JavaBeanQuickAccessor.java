/*    */ package com.sun.javafx.property.adapter;
/*    */ 
/*    */ import javafx.beans.property.adapter.ReadOnlyJavaBeanObjectProperty;
/*    */ import javafx.beans.property.adapter.ReadOnlyJavaBeanObjectPropertyBuilder;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class JavaBeanQuickAccessor
/*    */ {
/*    */   public static <T> ReadOnlyJavaBeanObjectProperty<T> createReadOnlyJavaBeanObjectProperty(Object paramObject, String paramString) throws NoSuchMethodException {
/* 37 */     return ReadOnlyJavaBeanObjectPropertyBuilder.create().bean(paramObject).name(paramString).build();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\property\adapter\JavaBeanQuickAccessor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */