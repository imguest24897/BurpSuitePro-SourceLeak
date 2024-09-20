/*    */ package com.github.weisj.jsvg.attributes.filter;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ public interface FilterChannelKey
/*    */ {
/*    */   @NotNull
/*    */   Object key();
/*    */   
/*    */   public static class StringKey
/*    */     implements FilterChannelKey
/*    */   {
/*    */     @NotNull
/*    */     private final String key;
/*    */     
/*    */     public StringKey(@NotNull String key) {
/* 35 */       this.key = key;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Object key() {
/* 40 */       return this.key;
/*    */     }
/*    */ 
/*    */     
/*    */     public String toString() {
/* 45 */       return "StringKey{key='" + this.key + '\'' + '}';
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\filter\FilterChannelKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */