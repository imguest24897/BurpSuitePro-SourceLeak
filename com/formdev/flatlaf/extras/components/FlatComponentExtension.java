/*    */ package com.formdev.flatlaf.extras.components;
/*    */ 
/*    */ import com.formdev.flatlaf.util.LoggingFacade;
/*    */ import java.awt.Color;
/*    */ import java.awt.Insets;
/*    */ import javax.swing.UIManager;
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
/*    */ 
/*    */ 
/*    */ public interface FlatComponentExtension
/*    */ {
/*    */   Object getClientProperty(Object paramObject);
/*    */   
/*    */   void putClientProperty(Object paramObject1, Object paramObject2);
/*    */   
/*    */   default boolean getClientPropertyBoolean(Object key, String defaultValueKey) {
/* 45 */     Object value = getClientProperty(key);
/* 46 */     return (value instanceof Boolean) ? ((Boolean)value).booleanValue() : UIManager.getBoolean(defaultValueKey);
/*    */   }
/*    */   
/*    */   default boolean getClientPropertyBoolean(Object key, boolean defaultValue) {
/* 50 */     Object value = getClientProperty(key);
/* 51 */     return (value instanceof Boolean) ? ((Boolean)value).booleanValue() : defaultValue;
/*    */   }
/*    */   
/*    */   default void putClientPropertyBoolean(Object key, boolean value, boolean defaultValue) {
/* 55 */     putClientProperty(key, (value != defaultValue) ? Boolean.valueOf(value) : null);
/*    */   }
/*    */ 
/*    */   
/*    */   default int getClientPropertyInt(Object key, String defaultValueKey) {
/* 60 */     Object value = getClientProperty(key);
/* 61 */     return (value instanceof Integer) ? ((Integer)value).intValue() : UIManager.getInt(defaultValueKey);
/*    */   }
/*    */   
/*    */   default int getClientPropertyInt(Object key, int defaultValue) {
/* 65 */     Object value = getClientProperty(key);
/* 66 */     return (value instanceof Integer) ? ((Integer)value).intValue() : defaultValue;
/*    */   }
/*    */ 
/*    */   
/*    */   default Color getClientPropertyColor(Object key, String defaultValueKey) {
/* 71 */     Object value = getClientProperty(key);
/* 72 */     return (value instanceof Color) ? (Color)value : UIManager.getColor(defaultValueKey);
/*    */   }
/*    */   
/*    */   default Insets getClientPropertyInsets(Object key, String defaultValueKey) {
/* 76 */     Object value = getClientProperty(key);
/* 77 */     return (value instanceof Insets) ? (Insets)value : UIManager.getInsets(defaultValueKey);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   default <T extends Enum<T>> T getClientPropertyEnumString(Object key, Class<T> enumType, String defaultValueKey, T defaultValue) {
/* 84 */     Object value = getClientProperty(key);
/* 85 */     if (!(value instanceof String) && defaultValueKey != null)
/* 86 */       value = UIManager.getString(defaultValueKey); 
/* 87 */     if (value instanceof String) {
/*    */       try {
/* 89 */         return Enum.valueOf(enumType, (String)value);
/* 90 */       } catch (IllegalArgumentException ex) {
/* 91 */         LoggingFacade.INSTANCE.logSevere("FlatLaf: Unknown enum value '" + value + "' in enum '" + enumType.getName() + "'.", ex);
/*    */       } 
/*    */     }
/* 94 */     return defaultValue;
/*    */   }
/*    */   
/*    */   default <T extends Enum<T>> void putClientPropertyEnumString(Object key, Enum<T> value) {
/* 98 */     putClientProperty(key, (value != null) ? value.toString() : null);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\extras\components\FlatComponentExtension.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */