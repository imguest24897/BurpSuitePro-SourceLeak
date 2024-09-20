/*     */ package com.github.weisj.jsvg.geometry.path;
/*     */ 
/*     */ import java.awt.Shape;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.Arc2D;
/*     */ import java.awt.geom.Path2D;
/*     */ import java.awt.geom.Point2D;
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
/*     */ final class Arc
/*     */   extends PathCommand
/*     */ {
/*     */   private final float rx;
/*     */   private final float ry;
/*     */   private final float xAxisRot;
/*     */   private final boolean largeArc;
/*     */   private final boolean sweep;
/*     */   private final float x;
/*     */   private final float y;
/*     */   
/*     */   public Arc(boolean isRelative, float rx, float ry, float xAxisRot, boolean largeArc, boolean sweep, float x, float y) {
/*  56 */     super(isRelative, 6);
/*  57 */     this.rx = rx;
/*  58 */     this.ry = ry;
/*  59 */     this.xAxisRot = xAxisRot;
/*  60 */     this.largeArc = largeArc;
/*  61 */     this.sweep = sweep;
/*  62 */     this.x = x;
/*  63 */     this.y = y;
/*     */   }
/*     */ 
/*     */   
/*     */   public void appendPath(@NotNull Path2D path, @NotNull BuildHistory hist) {
/*  68 */     Point2D.Float offset = offset(hist);
/*     */     
/*  70 */     arcTo(path, this.rx, this.ry, this.xAxisRot, this.largeArc, this.sweep, this.x + offset.x, this.y + offset.y, hist.lastPoint.x, hist.lastPoint.y);
/*     */ 
/*     */     
/*  73 */     hist.setLastPoint(path.getCurrentPoint());
/*  74 */     hist.setLastKnot(path.getCurrentPoint());
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
/*     */   private void arcTo(@NotNull Path2D path, float rx, float ry, float angle, boolean largeArcFlag, boolean sweepFlag, float x, float y, float x0, float y0) {
/* 111 */     if (rx == 0.0F || ry == 0.0F) {
/* 112 */       path.lineTo(x, y);
/*     */       
/*     */       return;
/*     */     } 
/* 116 */     if (x0 == x && y0 == y) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 122 */     Arc2D arc = computeRawArc(x0, y0, rx, ry, angle, largeArcFlag, sweepFlag, x, y);
/*     */     
/* 124 */     AffineTransform t = AffineTransform.getRotateInstance(
/* 125 */         Math.toRadians(angle), arc.getCenterX(), arc.getCenterY());
/* 126 */     Shape s = t.createTransformedShape(arc);
/* 127 */     path.append(s, true);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static Arc2D computeRawArc(double x0, double y0, double rx, double ry, double angle, boolean largeArcFlag, boolean sweepFlag, double x, double y) {
/* 163 */     double dx2 = (x0 - x) / 2.0D;
/* 164 */     double dy2 = (y0 - y) / 2.0D;
/*     */     
/* 166 */     angle = Math.toRadians(angle % 360.0D);
/* 167 */     double cosAngle = Math.cos(angle);
/* 168 */     double sinAngle = Math.sin(angle);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 173 */     double x1 = cosAngle * dx2 + sinAngle * dy2;
/* 174 */     double y1 = -sinAngle * dx2 + cosAngle * dy2;
/*     */     
/* 176 */     rx = Math.abs(rx);
/* 177 */     ry = Math.abs(ry);
/* 178 */     double Prx = rx * rx;
/* 179 */     double Pry = ry * ry;
/* 180 */     double Px1 = x1 * x1;
/* 181 */     double Py1 = y1 * y1;
/*     */     
/* 183 */     double radiiCheck = Px1 / Prx + Py1 / Pry;
/* 184 */     if (radiiCheck > 1.0D) {
/* 185 */       rx = Math.sqrt(radiiCheck) * rx;
/* 186 */       ry = Math.sqrt(radiiCheck) * ry;
/* 187 */       Prx = rx * rx;
/* 188 */       Pry = ry * ry;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 194 */     double sign = (largeArcFlag == sweepFlag) ? -1.0D : 1.0D;
/* 195 */     double sq = (Prx * Pry - Prx * Py1 - Pry * Px1) / (Prx * Py1 + Pry * Px1);
/* 196 */     sq = (sq < 0.0D) ? 0.0D : sq;
/* 197 */     double coefficient = sign * Math.sqrt(sq);
/* 198 */     double cx1 = coefficient * rx * y1 / ry;
/* 199 */     double cy1 = coefficient * -(ry * x1 / rx);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 204 */     double sx2 = (x0 + x) / 2.0D;
/* 205 */     double sy2 = (y0 + y) / 2.0D;
/* 206 */     double cx = sx2 + cosAngle * cx1 - sinAngle * cy1;
/* 207 */     double cy = sy2 + sinAngle * cx1 + cosAngle * cy1;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 212 */     double ux = (x1 - cx1) / rx;
/* 213 */     double uy = (y1 - cy1) / ry;
/* 214 */     double vx = (-x1 - cx1) / rx;
/* 215 */     double vy = (-y1 - cy1) / ry;
/*     */ 
/*     */     
/* 218 */     double n = Math.sqrt(ux * ux + uy * uy);
/* 219 */     double p = ux;
/* 220 */     sign = (uy < 0.0D) ? -1.0D : 1.0D;
/* 221 */     double angleStart = Math.toDegrees(sign * Math.acos(p / n));
/*     */ 
/*     */     
/* 224 */     n = Math.sqrt((ux * ux + uy * uy) * (vx * vx + vy * vy));
/* 225 */     p = ux * vx + uy * vy;
/* 226 */     sign = (ux * vy - uy * vx < 0.0D) ? -1.0D : 1.0D;
/* 227 */     double angleExtent = Math.toDegrees(sign * Math.acos(p / n));
/* 228 */     if (!sweepFlag && angleExtent > 0.0D) {
/* 229 */       angleExtent -= 360.0D;
/* 230 */     } else if (sweepFlag && angleExtent < 0.0D) {
/* 231 */       angleExtent += 360.0D;
/*     */     } 
/* 233 */     angleExtent %= 360.0D;
/* 234 */     angleStart %= 360.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 239 */     Arc2D.Double arc = new Arc2D.Double();
/* 240 */     arc.x = cx - rx;
/* 241 */     arc.y = cy - ry;
/* 242 */     arc.width = rx * 2.0D;
/* 243 */     arc.height = ry * 2.0D;
/* 244 */     arc.start = -angleStart;
/* 245 */     arc.extent = -angleExtent;
/*     */     
/* 247 */     return arc;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 252 */     return "A " + this.rx + " " + this.ry + " " + this.xAxisRot + " " + this.largeArc + " " + this.sweep + " " + this.x + " " + this.y;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\path\Arc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */