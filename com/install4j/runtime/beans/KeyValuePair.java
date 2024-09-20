/*    */ package com.install4j.runtime.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class KeyValuePair
/*    */   implements Serializable, Cloneable {
/*    */   private String key;
/*    */   private String value;
/*    */   
/*    */   public KeyValuePair(String key, String value) {
/* 11 */     this.key = key;
/* 12 */     this.value = value;
/*    */   }
/*    */   
/*    */   public KeyValuePair() {
/* 16 */     this.key = this.value = "";
/*    */   }
/*    */   
/*    */   public String getKey() {
/* 20 */     return this.key;
/*    */   }
/*    */   
/*    */   public void setKey(String key) {
/* 24 */     this.key = key;
/*    */   }
/*    */   
/*    */   public String getValue() {
/* 28 */     return this.value;
/*    */   }
/*    */   
/*    */   public void setValue(String value) {
/* 32 */     this.value = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public KeyValuePair clone() {
/*    */     try {
/* 38 */       return (KeyValuePair)super.clone();
/* 39 */     } catch (CloneNotSupportedException e) {
/*    */       
/* 41 */       e.printStackTrace();
/* 42 */       return null;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 48 */     return "MapEntry{key='" + this.key + '\'' + ", value='" + this.value + '\'' + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\KeyValuePair.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */