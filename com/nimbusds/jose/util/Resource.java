/*    */ package com.nimbusds.jose.util;
/*    */ 
/*    */ import net.jcip.annotations.Immutable;
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
/*    */ @Immutable
/*    */ public class Resource
/*    */ {
/*    */   private final String content;
/*    */   private final String contentType;
/*    */   
/*    */   public Resource(String content, String contentType) {
/* 53 */     if (content == null) {
/* 54 */       throw new IllegalArgumentException("The resource content must not be null");
/*    */     }
/*    */     
/* 57 */     this.content = content;
/* 58 */     this.contentType = contentType;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getContent() {
/* 69 */     return this.content;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getContentType() {
/* 80 */     return this.contentType;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jos\\util\Resource.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */