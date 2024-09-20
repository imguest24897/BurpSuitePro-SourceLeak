/*     */ package com.github.weisj.jsvg.attributes;
/*     */ 
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Shape;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.util.EnumSet;
/*     */ import java.util.Set;
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
/*     */ public enum VectorEffect
/*     */   implements HasMatchName
/*     */ {
/*  37 */   None(0),
/*  38 */   NonScalingStroke("non-scaling-stroke", 0),
/*  39 */   NonScalingSize("non-scaling-size", 1),
/*  40 */   NonRotation("non-rotation", 2),
/*  41 */   FixedPosition("fixed-position", 4);
/*     */   
/*     */   @NotNull
/*     */   private final String matchName;
/*     */   private final int flag;
/*     */   
/*     */   VectorEffect(int flag) {
/*  48 */     this.matchName = name();
/*  49 */     this.flag = flag;
/*     */   }
/*     */   
/*     */   VectorEffect(String matchName, int flag) {
/*  53 */     this.matchName = matchName;
/*  54 */     this.flag = flag;
/*     */   }
/*     */   @NotNull
/*     */   public static Set<VectorEffect> parse(@NotNull AttributeNode attributeNode) {
/*  58 */     String[] vectorEffectsRaw = attributeNode.getStringList("vector-effect");
/*  59 */     EnumSet<VectorEffect> vectorEffects = EnumSet.noneOf(VectorEffect.class);
/*  60 */     for (String effect : vectorEffectsRaw) {
/*  61 */       vectorEffects.add(attributeNode.parser().<VectorEffect>parseEnum(effect, None));
/*     */     }
/*  63 */     return vectorEffects;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String matchName() {
/*  68 */     return this.matchName;
/*     */   }
/*     */   
/*     */   private static int flags(@NotNull Set<VectorEffect> effects) {
/*  72 */     int flag = 0;
/*  73 */     for (VectorEffect effect : effects) {
/*  74 */       flag |= effect.flag;
/*     */     }
/*  76 */     return flag;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void applyEffects(@NotNull Set<VectorEffect> effects, @NotNull Graphics2D g, @NotNull RenderContext context, @Nullable AffineTransform elementTransform) {
/*  81 */     int flags = flags(effects);
/*  82 */     if (flags == 0)
/*     */       return; 
/*  84 */     AffineTransform shapeTransform = new AffineTransform(context.userSpaceTransform());
/*     */     
/*  86 */     double x0 = (elementTransform != null) ? elementTransform.getTranslateX() : 0.0D;
/*  87 */     double y0 = (elementTransform != null) ? elementTransform.getTranslateY() : 0.0D;
/*     */     
/*  89 */     updateTransformForFlags(flags, shapeTransform, x0, y0);
/*     */     
/*  91 */     g.setTransform(context.rootTransform());
/*  92 */     g.transform(shapeTransform);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static Shape applyNonScalingStroke(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Shape shape) {
/*  99 */     g.setTransform(context.rootTransform());
/* 100 */     return context.userSpaceTransform().createTransformedShape(shape);
/*     */   } private static void updateTransformForFlags(int flags, @NotNull AffineTransform transform, double x0, double y0) {
/*     */     double detRoot;
/*     */     double detRootInv;
/* 104 */     switch (flags) {
/*     */       case 1:
/* 106 */         detRoot = Math.sqrt(Math.abs(transform.getDeterminant()));
/* 107 */         if (detRoot == 0.0D)
/* 108 */           return;  detRootInv = 1.0D / detRoot;
/* 109 */         transform.setTransform(transform
/* 110 */             .getScaleX() * detRootInv, transform.getShearY() * detRootInv, transform
/* 111 */             .getShearX() * detRootInv, transform.getScaleY() * detRootInv, transform
/* 112 */             .getTranslateX(), transform
/* 113 */             .getTranslateY());
/*     */         break;
/*     */       
/*     */       case 2:
/* 117 */         detRoot = Math.sqrt(Math.abs(transform.getDeterminant()));
/* 118 */         transform.setTransform(detRoot, 0.0D, 0.0D, detRoot, transform
/*     */             
/* 120 */             .getTranslateX(), transform
/* 121 */             .getTranslateY());
/*     */         break;
/*     */       
/*     */       case 3:
/* 125 */         transform.setTransform(1.0D, 0.0D, 0.0D, 1.0D, transform
/*     */             
/* 127 */             .getTranslateX(), transform
/* 128 */             .getTranslateY());
/*     */         break;
/*     */       
/*     */       case 4:
/* 132 */         transform.setTransform(transform
/* 133 */             .getScaleX(), transform.getShearY(), transform
/* 134 */             .getShearX(), transform.getScaleY(), x0, y0);
/*     */         break;
/*     */ 
/*     */ 
/*     */       
/*     */       case 5:
/* 140 */         detRoot = Math.sqrt(Math.abs(transform.getDeterminant()));
/* 141 */         if (detRoot == 0.0D)
/* 142 */           return;  detRootInv = 1.0D / detRoot;
/* 143 */         transform.setTransform(transform
/* 144 */             .getScaleX() * detRootInv, transform.getShearY() * detRootInv, transform
/* 145 */             .getShearX() * detRootInv, transform.getScaleY() * detRootInv, x0, y0);
/*     */         break;
/*     */ 
/*     */ 
/*     */       
/*     */       case 6:
/* 151 */         detRoot = Math.sqrt(Math.abs(transform.getDeterminant()));
/* 152 */         transform.setTransform(detRoot, 0.0D, 0.0D, detRoot, x0, y0);
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 7:
/* 159 */         transform.setTransform(1.0D, 0.0D, 0.0D, 1.0D, x0, y0);
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final class Flags {
/*     */     private static final int NON_SCALING_SIZE = 1;
/*     */     private static final int NON_ROTATING = 2;
/*     */     private static final int FIXED_POSITION = 4;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\VectorEffect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */