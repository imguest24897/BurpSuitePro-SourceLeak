/*     */ package com.github.weisj.jsvg.nodes.mesh;
/*     */ 
/*     */ import com.github.weisj.jsvg.geometry.mesh.Bezier;
/*     */ import com.github.weisj.jsvg.geometry.mesh.CoonPatch;
/*     */ import com.github.weisj.jsvg.geometry.path.BezierPathCommand;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.nodes.SVGNode;
/*     */ import com.github.weisj.jsvg.nodes.Stop;
/*     */ import java.awt.geom.Point2D;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
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
/*     */ final class MeshBuilder
/*     */ {
/*     */   static void buildMesh(@NotNull MeshGradient meshGradient, @NotNull Point2D.Float origin) {
/*  40 */     Point2D.Float start = origin;
/*     */     
/*  42 */     int patchCount = -1;
/*  43 */     List<? extends SVGNode> rows = meshGradient.children();
/*     */     
/*  45 */     for (int rowIndex = 0, rowCount = rows.size(); rowIndex < rowCount; rowIndex++) {
/*  46 */       SVGNode child = rows.get(rowIndex);
/*  47 */       MeshRow row = (MeshRow)child;
/*  48 */       int rowPatchCount = row.children().size();
/*  49 */       if (patchCount == -1) patchCount = rowPatchCount; 
/*  50 */       if (rowPatchCount != patchCount) {
/*  51 */         throw new IllegalStateException("Every mesh row needs to specify the same amount of patched");
/*     */       }
/*  53 */       List<? extends SVGNode> patchesInRow = row.children();
/*  54 */       for (int patchIndex = 0; patchIndex < rowPatchCount; patchIndex++) {
/*  55 */         SVGNode node = patchesInRow.get(patchIndex);
/*  56 */         MeshPatch patch = (MeshPatch)node;
/*     */         
/*  58 */         List<? extends SVGNode> stops = patch.children();
/*  59 */         int stopCount = stops.size();
/*  60 */         int requiredStops = stopsForPatchPosition(rowIndex, patchIndex);
/*  61 */         if (stopCount < requiredStops) {
/*  62 */           throw new IllegalStateException("Not enough stops specified");
/*     */         }
/*  64 */         int offset = offsetForPatchPosition(rowIndex);
/*  65 */         stopCount = requiredStops;
/*     */         
/*  67 */         MeshPatch patchAbove = null;
/*  68 */         if (offset == 1) {
/*  69 */           patchAbove = ((MeshRow)rows.get(rowIndex - 1)).children().get(patchIndex);
/*  70 */           patch.coonPatch.north = patchAbove.coonPatch.south.inverse();
/*  71 */           patch.north = patchAbove.west;
/*     */         } 
/*     */         
/*  74 */         MeshPatch patchLeft = null;
/*  75 */         if (offset + stopCount < 4) {
/*  76 */           patchLeft = (MeshPatch)patchesInRow.get(patchIndex - 1);
/*  77 */           patch.coonPatch.west = patchLeft.coonPatch.east.inverse();
/*  78 */           patch.west = patchLeft.south;
/*  79 */         } else if (patchIndex > 0) {
/*  80 */           patchLeft = (MeshPatch)patchesInRow.get(patchIndex - 1);
/*     */         } 
/*     */         
/*  83 */         for (int stopIndex = 0; stopIndex < stopCount; stopIndex++) {
/*  84 */           Stop stop = (Stop)stops.get(stopIndex);
/*  85 */           switch (stopIndex + offset) {
/*     */             case 0:
/*  87 */               patch.coonPatch
/*  88 */                 .north = ((BezierPathCommand)Objects.<BezierPathCommand>requireNonNull(stop.bezierCommand())).createBezier(start);
/*  89 */               start = patch.coonPatch.north.d;
/*  90 */               patch.north = (patchIndex > 0) ? ((MeshPatch)Objects.requireNonNull((T)patchLeft)).east : stop.color();
/*     */               break;
/*     */             case 1:
/*  93 */               patch.coonPatch
/*  94 */                 .east = ((BezierPathCommand)Objects.<BezierPathCommand>requireNonNull(stop.bezierCommand())).createBezier(patch.coonPatch.north.d);
/*  95 */               patch.east = (offset == 1) ? ((MeshPatch)Objects.requireNonNull((T)patchAbove)).south : stop.color();
/*     */               break;
/*     */             case 2:
/*  98 */               patch.coonPatch
/*  99 */                 .south = ((BezierPathCommand)Objects.<BezierPathCommand>requireNonNull(stop.bezierCommand())).createBezier(patch.coonPatch.east.d);
/* 100 */               patch.south = stop.color();
/*     */               break;
/*     */             case 3:
/* 103 */               patch.coonPatch
/* 104 */                 .west = ((BezierPathCommand)Objects.<BezierPathCommand>requireNonNull(stop.bezierCommand())).createBezier(patch.coonPatch.south.d);
/* 105 */               patch.coonPatch.west.d.setLocation(patch.coonPatch.north.a);
/* 106 */               patch.west = stop.color();
/*     */               break;
/*     */             default:
/*     */               assert false;
/*     */               break;
/*     */           } 
/*     */         } 
/* 113 */         if (offset + stopCount < 4) {
/* 114 */           assert patchLeft != null;
/* 115 */           patch.coonPatch.south.d.setLocation(patchLeft.coonPatch.east.d);
/*     */         } 
/*     */         
/*     */         try {
/* 119 */           assertPatchDefined(patch.coonPatch);
/* 120 */         } catch (IllegalStateException e) {
/* 121 */           throw new IllegalStateException(rowIndex + "," + patchIndex + " " + patch.coonPatch, e);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static int stopsForPatchPosition(int rowIndex, int patchIndex) {
/* 128 */     if (rowIndex > 0) {
/* 129 */       if (patchIndex > 0) {
/* 130 */         return 2;
/*     */       }
/* 132 */       return 3;
/*     */     } 
/*     */     
/* 135 */     if (patchIndex > 0) {
/* 136 */       return 3;
/*     */     }
/* 138 */     return 4;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static int offsetForPatchPosition(int rowIndex) {
/* 144 */     if (rowIndex > 0) {
/* 145 */       return 1;
/*     */     }
/* 147 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void assertPatchDefined(@NotNull CoonPatch coonPatch) {
/* 152 */     if (coonPatch.north == null) throw new IllegalStateException("North path is null"); 
/* 153 */     if (coonPatch.east == null) throw new IllegalStateException("East path is null"); 
/* 154 */     if (coonPatch.south == null) throw new IllegalStateException("South path is null"); 
/* 155 */     if (coonPatch.west == null) throw new IllegalStateException("West path is null"); 
/* 156 */     if (hasUnspecifiedPoint(coonPatch.north))
/* 157 */       throw new IllegalStateException("North path has unspecified point"); 
/* 158 */     if (hasUnspecifiedPoint(coonPatch.east))
/* 159 */       throw new IllegalStateException("East path has unspecified point"); 
/* 160 */     if (hasUnspecifiedPoint(coonPatch.south))
/* 161 */       throw new IllegalStateException("South path has unspecified point"); 
/* 162 */     if (hasUnspecifiedPoint(coonPatch.west))
/* 163 */       throw new IllegalStateException("West path has unspecified point"); 
/*     */   }
/*     */   
/*     */   private static boolean hasUnspecifiedPoint(Bezier bezier) {
/* 167 */     if (isUnspecified(bezier.a)) return true; 
/* 168 */     if (isUnspecified(bezier.b)) return true; 
/* 169 */     if (isUnspecified(bezier.c)) return true; 
/* 170 */     return isUnspecified(bezier.d);
/*     */   }
/*     */   
/*     */   private static boolean isUnspecified(@NotNull Point2D.Float p) {
/* 174 */     return (!Length.isSpecified(p.x) || !Length.isSpecified(p.y));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\mesh\MeshBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */