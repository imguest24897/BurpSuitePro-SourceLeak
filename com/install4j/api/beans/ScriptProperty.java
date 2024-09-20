/*    */ package com.install4j.api.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Objects;
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
/*    */ public class ScriptProperty
/*    */   implements Serializable
/*    */ {
/*    */   private String value;
/*    */   
/*    */   public ScriptProperty() {}
/*    */   
/*    */   public ScriptProperty(String value) {
/* 32 */     this.value = value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getValue() {
/* 39 */     return this.value;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setValue(String value) {
/* 46 */     this.value = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 51 */     return this.value;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 56 */     if (this == o) {
/* 57 */       return true;
/*    */     }
/* 59 */     if (o == null || getClass() != o.getClass()) {
/* 60 */       return false;
/*    */     }
/*    */     
/* 63 */     ScriptProperty other = (ScriptProperty)o;
/*    */     
/* 65 */     if (!Objects.equals(this.value, other.value)) {
/* 66 */       return false;
/*    */     }
/*    */     
/* 69 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 74 */     return (this.value != null) ? this.value.hashCode() : 0;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beans\ScriptProperty.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */