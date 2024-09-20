/*     */ package com.github.weisj.jsvg.attributes.text;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.HasMatchName;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ public enum DominantBaseline
/*     */   implements HasMatchName
/*     */ {
/*  47 */   Auto,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  54 */   Ideographic,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  60 */   Alphabetic,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   Hanging,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  72 */   Mathematical,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  79 */   Central,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  86 */   Middle,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  93 */   TextAfterEdge("text-after-edge"),
/*  94 */   TextBottom("text-bottom"),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 101 */   TextBeforeEdge("text-before-edge"),
/*     */ 
/*     */ 
/*     */   
/* 105 */   TextTop("text-top");
/*     */   @NotNull
/*     */   private final String matchName;
/*     */   
/*     */   DominantBaseline(String matchName) {
/* 110 */     this.matchName = matchName;
/*     */   }
/*     */   
/*     */   DominantBaseline() {
/* 114 */     this.matchName = name();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String matchName() {
/* 119 */     return this.matchName;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\text\DominantBaseline.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */