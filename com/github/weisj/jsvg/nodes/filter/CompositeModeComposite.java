/*     */ package com.github.weisj.jsvg.nodes.filter;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.filter.CompositeMode;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import java.awt.AlphaComposite;
/*     */ import java.awt.Composite;
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
/*     */ public final class CompositeModeComposite
/*     */ {
/*     */   @NotNull
/*     */   private final Composite composite;
/*     */   
/*     */   public CompositeModeComposite(@NotNull AttributeNode attributeNode) {
/*  36 */     this.composite = createComposite(attributeNode);
/*     */   }
/*     */   @NotNull
/*     */   public Composite composite() {
/*  40 */     return this.composite;
/*     */   }
/*     */   @NotNull
/*     */   private static Composite createComposite(@NotNull AttributeNode attributeNode) {
/*  44 */     CompositeMode compositeMode = (CompositeMode)attributeNode.getEnum("operator", (Enum)CompositeMode.Over);
/*  45 */     switch (compositeMode) {
/*     */       case Over:
/*  47 */         return AlphaComposite.SrcOver;
/*     */       case In:
/*  49 */         return AlphaComposite.SrcIn;
/*     */       case Out:
/*  51 */         return AlphaComposite.SrcOut;
/*     */       case Atop:
/*  53 */         return AlphaComposite.SrcAtop;
/*     */       case Xor:
/*  55 */         return AlphaComposite.Xor;
/*     */       case Lighter:
/*  57 */         return new LighterComposite();
/*     */       case Arithmetic:
/*  59 */         return new ArithmeticComposite(attributeNode
/*  60 */             .getInt("k1", 0), attributeNode
/*  61 */             .getInt("k2", 0), attributeNode
/*  62 */             .getInt("k3", 0), attributeNode
/*  63 */             .getInt("k4", 0));
/*     */     } 
/*  65 */     throw new IllegalStateException();
/*     */   }
/*     */   
/*     */   private static final class ArithmeticComposite
/*     */     extends AbstractBlendComposite
/*     */     implements AbstractBlendComposite.Blender
/*     */   {
/*     */     private final int k1;
/*     */     private final int k2;
/*     */     private final int k3;
/*     */     private final int k4;
/*     */     
/*     */     private ArithmeticComposite(int k1, int k2, int k3, int k4) {
/*  78 */       this.k1 = k1;
/*  79 */       this.k2 = k2;
/*  80 */       this.k3 = k3;
/*  81 */       this.k4 = k4;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     protected AbstractBlendComposite.Blender blender() {
/*  86 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public void blend(int[] src, int[] dst, int[] result) {
/*  91 */       result[0] = Math.max(0, Math.min(255, this.k1 * src[0] * dst[0] + this.k2 * src[0] + this.k3 * dst[0] + this.k4));
/*  92 */       result[1] = Math.max(0, Math.min(255, this.k1 * src[1] * dst[1] + this.k2 * src[1] + this.k3 * dst[1] + this.k4));
/*  93 */       result[2] = Math.max(0, Math.min(255, this.k1 * src[2] * dst[2] + this.k2 * src[2] + this.k3 * dst[2] + this.k4));
/*  94 */       result[3] = Math.max(0, Math.min(255, this.k1 * src[3] * dst[3] + this.k2 * src[3] + this.k3 * dst[3] + this.k4));
/*     */     }
/*     */   }
/*     */   
/*     */   private static final class LighterComposite extends AbstractBlendComposite implements AbstractBlendComposite.Blender {
/*     */     private LighterComposite() {}
/*     */     
/*     */     @NotNull
/*     */     protected AbstractBlendComposite.Blender blender() {
/* 103 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public void blend(int[] src, int[] dst, int[] result) {
/* 108 */       result[0] = Math.min(255, src[0] + dst[0]);
/* 109 */       result[1] = Math.min(255, src[1] + dst[1]);
/* 110 */       result[2] = Math.min(255, src[2] + dst[2]);
/* 111 */       result[3] = Math.min(255, src[3] + dst[3]);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\CompositeModeComposite.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */