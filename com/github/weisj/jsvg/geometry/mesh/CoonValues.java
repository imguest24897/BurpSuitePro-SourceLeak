/*    */ package com.github.weisj.jsvg.geometry.mesh;
/*    */ 
/*    */ import java.awt.geom.Point2D;
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
/*    */ public final class CoonValues
/*    */ {
/*    */   public final Point2D.Float north;
/*    */   public final Point2D.Float east;
/*    */   public final Point2D.Float south;
/*    */   public final Point2D.Float west;
/*    */   
/*    */   public CoonValues(Point2D.Float north, Point2D.Float east, Point2D.Float south, Point2D.Float west) {
/* 33 */     this.north = north;
/* 34 */     this.east = east;
/* 35 */     this.south = south;
/* 36 */     this.west = west;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 41 */     return "CoonValues{north=" + this.north + ", east=" + this.east + ", south=" + this.south + ", west=" + this.west + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\mesh\CoonValues.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */