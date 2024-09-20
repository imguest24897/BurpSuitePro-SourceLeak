/*     */ package com.nimbusds.jose;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class KeyLengthException
/*     */   extends KeyException
/*     */ {
/*     */   private final int expectedLength;
/*     */   private final Algorithm alg;
/*     */   
/*     */   public KeyLengthException(String message) {
/*  49 */     super(message);
/*  50 */     this.expectedLength = 0;
/*  51 */     this.alg = null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public KeyLengthException(Algorithm alg) {
/*  62 */     this(0, alg);
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
/*     */   public KeyLengthException(int expectedLength, Algorithm alg) {
/*  76 */     super((
/*  77 */         (expectedLength > 0) ? ("The expected key length is " + expectedLength + " bits") : "Unexpected key length") + (
/*  78 */         (alg != null) ? (" (for " + alg + " algorithm)") : ""));
/*     */ 
/*     */     
/*  81 */     this.expectedLength = expectedLength;
/*  82 */     this.alg = alg;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getExpectedKeyLength() {
/*  93 */     return this.expectedLength;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Algorithm getAlgorithm() {
/* 104 */     return this.alg;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\KeyLengthException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */