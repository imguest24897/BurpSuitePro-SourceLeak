/*     */ package com.github.weisj.jsvg.attributes.font;
/*     */ 
/*     */ import java.awt.geom.AffineTransform;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ abstract class FontStyle
/*     */ {
/*     */   private FontStyle() {}
/*     */   
/*     */   @Nullable
/*     */   public AffineTransform transform() {
/*  39 */     return null;
/*     */   }
/*     */   @NotNull
/*     */   public static FontStyle normal() {
/*  43 */     return Normal.INSTANCE;
/*     */   }
/*     */   @NotNull
/*     */   public static FontStyle italic() {
/*  47 */     return Italic.INSTANCE;
/*     */   }
/*     */   @NotNull
/*     */   public static FontStyle oblique() {
/*  51 */     return Oblique.DEFAULT;
/*     */   }
/*     */   @NotNull
/*     */   public static FontStyle oblique(float angle) {
/*  55 */     return new Oblique(angle);
/*     */   }
/*     */   
/*     */   static final class Normal extends FontStyle { @NotNull
/*  59 */     private static final Normal INSTANCE = new Normal();
/*     */ 
/*     */     
/*     */     public String toString() {
/*  63 */       return "Normal";
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object obj) {
/*  68 */       return obj instanceof Normal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/*  73 */       return Normal.class.hashCode();
/*     */     } }
/*     */   
/*     */   static final class Italic extends FontStyle {
/*     */     @NotNull
/*  78 */     private static final Italic INSTANCE = new Italic();
/*     */ 
/*     */     
/*     */     public String toString() {
/*  82 */       return "Italic";
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object obj) {
/*  87 */       return obj instanceof Italic;
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/*  92 */       return Italic.class.hashCode();
/*     */     }
/*     */   }
/*     */   
/*     */   static final class Oblique extends FontStyle {
/*  97 */     public static final float DEFAULT_ANGLE = (float)Math.toRadians(14.0D); @NotNull
/*  98 */     public static final Oblique DEFAULT = new Oblique(DEFAULT_ANGLE);
/*     */     
/*     */     private final float angle;
/*     */     
/*     */     public Oblique(float angle) {
/* 103 */       this.angle = angle;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public AffineTransform transform() {
/* 108 */       return AffineTransform.getShearInstance(-this.angle, 0.0D);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 113 */       return "Oblique{" + this.angle + '}';
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object o) {
/* 118 */       if (this == o) return true; 
/* 119 */       if (!(o instanceof Oblique)) return false; 
/* 120 */       Oblique that = (Oblique)o;
/* 121 */       return (Float.compare(that.angle, this.angle) == 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 126 */       return Float.hashCode(this.angle);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\font\FontStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */