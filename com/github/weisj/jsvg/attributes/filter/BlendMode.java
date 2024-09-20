/*     */ package com.github.weisj.jsvg.attributes.filter;
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
/*     */ public enum BlendMode
/*     */   implements HasMatchName
/*     */ {
/*  33 */   Normal,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  39 */   Multiply,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  45 */   Screen,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  51 */   Overlay,
/*     */ 
/*     */ 
/*     */   
/*  55 */   Darken,
/*     */ 
/*     */ 
/*     */   
/*  59 */   Lighten,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   ColorDodge("color-dodge"),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  74 */   ColorBurn("color-burn"),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  80 */   HardLight("hard-light"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  85 */   SoftLight("soft-light"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  90 */   Difference,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  95 */   Exclusion,
/*     */ 
/*     */ 
/*     */   
/*  99 */   Hue,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 104 */   Saturation,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 109 */   Color,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 114 */   Luminosity;
/*     */   @NotNull
/*     */   private final String matchName;
/*     */   
/*     */   BlendMode(String matchName) {
/* 119 */     this.matchName = matchName;
/*     */   }
/*     */   
/*     */   BlendMode() {
/* 123 */     this.matchName = name();
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String matchName() {
/* 129 */     return this.matchName;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\filter\BlendMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */