/*    */ package com.github.weisj.jsvg.geometry.size;
/*    */ 
/*    */ import java.util.Locale;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum AngleUnit
/*    */ {
/* 31 */   Deg,
/* 32 */   Grad,
/* 33 */   Rad,
/* 34 */   Turn,
/* 35 */   Raw(""); private static final AngleUnit[] units;
/*    */   static {
/* 37 */     units = values();
/*    */   }
/*    */   private static final double GRADIANS_TO_RADIANS = 0.015707962916848627D; @NotNull
/*    */   private final String suffix;
/*    */   public static AngleUnit[] units() {
/* 42 */     return units;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   AngleUnit(String suffix) {
/* 48 */     this.suffix = suffix;
/*    */   }
/*    */   
/*    */   AngleUnit() {
/* 52 */     this.suffix = name().toLowerCase(Locale.ENGLISH);
/*    */   }
/*    */   @NotNull
/*    */   public String suffix() {
/* 56 */     return this.suffix;
/*    */   }
/*    */   
/*    */   public float toRadians(float value, @NotNull AngleUnit rawReplacement) {
/* 60 */     if (rawReplacement == Raw) throw new IllegalArgumentException("Cant replace raw unit with raw"); 
/* 61 */     switch (this) {
/*    */       case Deg:
/* 63 */         return (float)Math.toRadians(value);
/*    */       case Grad:
/* 65 */         return (float)(value * 0.015707962916848627D);
/*    */       case Rad:
/* 67 */         return value;
/*    */       case Turn:
/* 69 */         return (float)(value * Math.PI * 2.0D);
/*    */       case Raw:
/* 71 */         return rawReplacement.toRadians(value, rawReplacement);
/*    */     } 
/* 73 */     throw new IllegalArgumentException("Unknown angle unit " + this);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\size\AngleUnit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */