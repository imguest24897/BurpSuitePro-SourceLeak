/*     */ package com.github.weisj.jsvg.geometry.util;
/*     */ 
/*     */ import java.awt.geom.IllegalPathStateException;
/*     */ import java.awt.geom.PathIterator;
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
/*     */ public final class ReversePathIterator
/*     */   implements PathIterator
/*     */ {
/*     */   private final int windingRule;
/*     */   private final double[] coordinates;
/*     */   private final int[] segmentTypes;
/*  44 */   private int coordIndex = 0;
/*     */   
/*  46 */   private int segmentIndex = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReversePathIterator(PathIterator original) {
/*  53 */     this(original, original.getWindingRule());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReversePathIterator(PathIterator original, int windingRule) {
/*  62 */     this.windingRule = windingRule;
/*     */     
/*  64 */     double[] coords = new double[16];
/*  65 */     int coordPos = 0;
/*  66 */     int[] segTypes = new int[8];
/*  67 */     int segPos = 0;
/*  68 */     boolean first = true;
/*     */     
/*  70 */     double[] temp = new double[6];
/*  71 */     while (!original.isDone()) {
/*  72 */       if (segPos == segTypes.length) {
/*     */         
/*  74 */         int[] dummy = new int[2 * segPos];
/*  75 */         System.arraycopy(segTypes, 0, dummy, 0, segPos);
/*  76 */         segTypes = dummy;
/*     */       } 
/*  78 */       int segType = segTypes[segPos++] = original.currentSegment(temp);
/*  79 */       if (first) {
/*  80 */         if (segType != 0) {
/*  81 */           throw new IllegalPathStateException("missing initial moveto in path definition");
/*     */         }
/*  83 */         first = false;
/*     */       } 
/*  85 */       int copy = coordinatesForSegmentType(segType);
/*  86 */       if (copy > 0) {
/*  87 */         if (coordPos + copy > coords.length) {
/*     */           
/*  89 */           double[] dummy = new double[coords.length * 2];
/*  90 */           System.arraycopy(coords, 0, dummy, 0, coords.length);
/*  91 */           coords = dummy;
/*     */         } 
/*  93 */         for (int c = 0; c < copy; c++) {
/*  94 */           coords[coordPos++] = temp[c];
/*     */         }
/*     */       } 
/*  97 */       original.next();
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 102 */     this.coordinates = new double[coordPos];
/* 103 */     for (int p = coordPos / 2 - 1; p >= 0; p--) {
/* 104 */       this.coordinates[2 * p] = coords[coordPos - 2 * p - 2];
/* 105 */       this.coordinates[2 * p + 1] = coords[coordPos - 2 * p - 1];
/*     */     } 
/*     */ 
/*     */     
/* 109 */     this.segmentTypes = new int[segPos];
/* 110 */     if (segPos > 0) {
/* 111 */       boolean pendingClose = false;
/* 112 */       int sr = 0;
/* 113 */       this.segmentTypes[sr++] = 0;
/* 114 */       for (int s = segPos - 1; s > 0; s--) {
/* 115 */         switch (segTypes[s]) {
/*     */           case 0:
/* 117 */             if (pendingClose) {
/* 118 */               pendingClose = false;
/* 119 */               this.segmentTypes[sr++] = 4;
/*     */             } 
/* 121 */             this.segmentTypes[sr++] = 0;
/*     */             break;
/*     */           case 4:
/* 124 */             pendingClose = true;
/*     */             break;
/*     */           default:
/* 127 */             this.segmentTypes[sr++] = segTypes[s];
/*     */             break;
/*     */         } 
/*     */       } 
/* 131 */       if (pendingClose) {
/* 132 */         this.segmentTypes[sr] = 4;
/*     */       }
/*     */     } 
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
/*     */   public int getWindingRule() {
/* 147 */     return this.windingRule;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int coordinatesForSegmentType(int segtype) {
/* 156 */     switch (segtype) {
/*     */       case 0:
/*     */       case 1:
/* 159 */         return 2;
/*     */       case 2:
/* 161 */         return 4;
/*     */       case 3:
/* 163 */         return 6;
/*     */     } 
/* 165 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void next() {
/* 176 */     this.coordIndex += coordinatesForSegmentType(this.segmentTypes[this.segmentIndex++]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isDone() {
/* 187 */     return (this.segmentIndex >= this.segmentTypes.length);
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
/*     */   public int currentSegment(double[] coords) {
/* 214 */     int segmentType = this.segmentTypes[this.segmentIndex];
/* 215 */     int copy = coordinatesForSegmentType(segmentType);
/* 216 */     if (copy > 0) {
/* 217 */       System.arraycopy(this.coordinates, this.coordIndex, coords, 0, copy);
/*     */     }
/* 219 */     return segmentType;
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
/*     */   public int currentSegment(float[] coords) {
/* 246 */     int segmentType = this.segmentTypes[this.segmentIndex];
/* 247 */     int copy = coordinatesForSegmentType(segmentType);
/* 248 */     if (copy > 0) {
/* 249 */       for (int c = 0; c < copy; c++) {
/* 250 */         coords[c] = (float)this.coordinates[this.coordIndex + c];
/*     */       }
/*     */     }
/* 253 */     return segmentType;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometr\\util\ReversePathIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */