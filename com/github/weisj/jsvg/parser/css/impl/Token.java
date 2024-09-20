/*    */ package com.github.weisj.jsvg.parser.css.impl;
/*    */ 
/*    */ import com.google.errorprone.annotations.Immutable;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ public final class Token
/*    */ {
/*    */   @NotNull
/*    */   private final TokenType type;
/*    */   @Nullable
/*    */   private final String data;
/*    */   
/*    */   public Token(@NotNull TokenType type) {
/* 35 */     this(type, null);
/*    */   }
/*    */   
/*    */   public Token(@NotNull TokenType type, @Nullable String data) {
/* 39 */     this.type = type;
/* 40 */     this.data = data;
/*    */   }
/*    */   @NotNull
/*    */   public TokenType type() {
/* 44 */     return this.type;
/*    */   }
/*    */   @Nullable
/*    */   public String data() {
/* 48 */     return this.data;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 53 */     return "Token{type=" + this.type + ", data='" + this.data + '\'' + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\css\impl\Token.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */