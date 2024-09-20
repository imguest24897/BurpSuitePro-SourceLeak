/*     */ package com.formdev.flatlaf.extras.components;
/*     */ 
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface FlatStyleableComponent
/*     */ {
/*     */   default String getStyle() {
/*  41 */     return (String)getClientProperty("FlatLaf.style");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default void setStyle(String style) {
/*  57 */     putClientProperty("FlatLaf.style", style);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default Map<String, Object> getStyleMap() {
/*  69 */     return (Map<String, Object>)getClientProperty("FlatLaf.style");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default void setStyleMap(Map<String, Object> styleMap) {
/*  83 */     putClientProperty("FlatLaf.style", styleMap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default String getStyleClass() {
/*  94 */     return (String)getClientProperty("FlatLaf.styleClass");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default void setStyleClass(String styleClass) {
/* 103 */     putClientProperty("FlatLaf.styleClass", styleClass);
/*     */   }
/*     */   
/*     */   Object getClientProperty(Object paramObject);
/*     */   
/*     */   void putClientProperty(Object paramObject1, Object paramObject2);
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\extras\components\FlatStyleableComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */