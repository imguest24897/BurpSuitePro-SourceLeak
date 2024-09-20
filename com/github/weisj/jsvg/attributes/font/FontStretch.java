/*    */ package com.github.weisj.jsvg.attributes.font;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.HasMatchName;
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
/*    */ 
/*    */ 
/*    */ public enum FontStretch
/*    */   implements HasMatchName
/*    */ {
/* 29 */   Normal(1.0F),
/* 30 */   UltraCondensed(0.5F, "ultra-condensed"),
/* 31 */   ExtraCondensed(0.625F, "extra-condensed"),
/* 32 */   Condensed(0.75F, "condensed"),
/* 33 */   SemiCondensed(0.875F, "semi-condensed"),
/* 34 */   SemiExpanded(1.125F, "semi-expanded"),
/* 35 */   Expanded(1.25F),
/* 36 */   ExtraExpanded(1.5F, "extra-expanded"),
/* 37 */   UltraExpanded(2.0F, "ultra-expanded"),
/*    */ 
/*    */ 
/*    */   
/* 41 */   Percentage(-1.0F);
/*    */   private final float percentage;
/*    */   @NotNull
/*    */   private final String matchName;
/*    */   
/*    */   FontStretch(float percentage, String matchName) {
/* 47 */     this.percentage = percentage;
/* 48 */     this.matchName = matchName;
/*    */   }
/*    */   
/*    */   FontStretch(float percentage) {
/* 52 */     this.percentage = percentage;
/* 53 */     this.matchName = name();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String matchName() {
/* 58 */     return this.matchName;
/*    */   }
/*    */   
/*    */   public float percentage() {
/* 62 */     if (this == Percentage) {
/* 63 */       throw new UnsupportedOperationException("Percentage needs to be computed manually");
/*    */     }
/* 65 */     return this.percentage;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\font\FontStretch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */