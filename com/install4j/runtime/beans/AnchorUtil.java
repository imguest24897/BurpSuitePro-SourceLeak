/*     */ package com.install4j.runtime.beans;
/*     */ 
/*     */ import com.install4j.api.beans.Anchor;
/*     */ import javax.swing.JComponent;
/*     */ 
/*     */ 
/*     */ public class AnchorUtil
/*     */ {
/*   9 */   private static final Anchor[][] ANCHOR_MATRIX = new Anchor[][] { { Anchor.NORTHWEST, Anchor.NORTH, Anchor.NORTHEAST }, { Anchor.WEST, Anchor.CENTER, Anchor.EAST }, { Anchor.SOUTHWEST, Anchor.SOUTH, Anchor.SOUTHEAST } };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Anchor getAnchor(Anchor horizontalAnchor, Anchor verticalAnchor) {
/*  16 */     return ANCHOR_MATRIX[getVerticalIndex(verticalAnchor)][getHorizontalIndex(horizontalAnchor)];
/*     */   }
/*     */   
/*     */   private static int getHorizontalIndex(Anchor horizontalAnchor) {
/*  20 */     switch (horizontalAnchor) {
/*     */       case WEST:
/*  22 */         return 0;
/*     */       case CENTER:
/*  24 */         return 1;
/*     */       case EAST:
/*  26 */         return 2;
/*     */     } 
/*  28 */     throw new IllegalStateException(horizontalAnchor.name());
/*     */   }
/*     */ 
/*     */   
/*     */   private static int getVerticalIndex(Anchor verticalAnchor) {
/*  33 */     switch (verticalAnchor) {
/*     */       case NORTH:
/*  35 */         return 0;
/*     */       case CENTER:
/*  37 */         return 1;
/*     */       case SOUTH:
/*  39 */         return 2;
/*     */     } 
/*  41 */     throw new IllegalStateException(verticalAnchor.name());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void setAlignments(JComponent component, Anchor anchor) {
/*  46 */     component.setAlignmentX(getAlignmentX(anchor));
/*  47 */     component.setAlignmentY(getAlignmentY(anchor));
/*     */   }
/*     */   
/*     */   private static float getAlignmentX(Anchor anchor) {
/*  51 */     switch (anchor) {
/*     */       case WEST:
/*     */       case NORTHWEST:
/*     */       case SOUTHWEST:
/*  55 */         return 0.0F;
/*     */       case CENTER:
/*     */       case NORTH:
/*     */       case SOUTH:
/*  59 */         return 0.5F;
/*     */       case EAST:
/*     */       case NORTHEAST:
/*     */       case SOUTHEAST:
/*  63 */         return 1.0F;
/*     */     } 
/*  65 */     throw new IllegalArgumentException(anchor.name());
/*     */   }
/*     */ 
/*     */   
/*     */   private static float getAlignmentY(Anchor anchor) {
/*  70 */     switch (anchor) {
/*     */       case NORTH:
/*     */       case NORTHWEST:
/*     */       case NORTHEAST:
/*  74 */         return 0.0F;
/*     */       case WEST:
/*     */       case CENTER:
/*     */       case EAST:
/*  78 */         return 0.5F;
/*     */       case SOUTH:
/*     */       case SOUTHWEST:
/*     */       case SOUTHEAST:
/*  82 */         return 1.0F;
/*     */     } 
/*  84 */     throw new IllegalArgumentException(anchor.name());
/*     */   }
/*     */ 
/*     */   
/*     */   public static int getAnchor(JComponent component) {
/*  89 */     int verticalIndex = getAnchorIndex(component.getAlignmentY());
/*  90 */     int horizontalIndex = getAnchorIndex(component.getAlignmentX());
/*  91 */     return ANCHOR_MATRIX[verticalIndex][horizontalIndex].getValue();
/*     */   }
/*     */   
/*     */   private static int getAnchorIndex(float alignment) {
/*  95 */     if (alignment < 0.5F)
/*  96 */       return 0; 
/*  97 */     if (alignment > 0.5F) {
/*  98 */       return 2;
/*     */     }
/* 100 */     return 1;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\AnchorUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */