/*     */ package com.github.weisj.jsvg.geometry.mesh;
/*     */ 
/*     */ import com.github.weisj.jsvg.geometry.util.GeometryUtil;
/*     */ import java.awt.Shape;
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
/*     */ public final class CoonPatch
/*     */ {
/*     */   public Bezier north;
/*     */   public Bezier east;
/*     */   public Bezier south;
/*     */   public Bezier west;
/*     */   @NotNull
/*     */   public final CoonValues coonValues;
/*     */   
/*     */   CoonPatch(Bezier north, Bezier east, Bezier south, Bezier west) {
/*  42 */     this(north, east, south, west, new CoonValues(
/*  43 */           MeshUtil.p(0.0F, 0.0F), MeshUtil.p(1.0F, 0.0F), MeshUtil.p(1.0F, 1.0F), MeshUtil.p(0.0F, 1.0F)));
/*     */   }
/*     */   @NotNull
/*     */   public static CoonPatch createUninitialized() {
/*  47 */     return new CoonPatch(null, null, null, null);
/*     */   }
/*     */   
/*     */   CoonPatch(Bezier north, Bezier east, Bezier south, Bezier west, @NotNull CoonValues coonValues) {
/*  51 */     this.north = north;
/*  52 */     this.east = east;
/*  53 */     this.south = south;
/*  54 */     this.west = west;
/*  55 */     this.coonValues = coonValues;
/*     */   }
/*     */   @NotNull
/*     */   public Shape toShape() {
/*  59 */     Path2D p = new Path2D.Float(0);
/*  60 */     p.moveTo(this.north.a.x, this.north.a.y);
/*  61 */     this.north.appendTo(p);
/*  62 */     this.east.appendTo(p);
/*  63 */     this.south.appendTo(p);
/*  64 */     this.west.appendTo(p);
/*  65 */     p.closePath();
/*  66 */     return p;
/*     */   }
/*     */   
/*     */   public Subdivided<CoonPatch> subdivide() {
/*  70 */     Point2D.Float midNorthLinear = GeometryUtil.midPoint(this.north.a, this.north.d);
/*  71 */     Point2D.Float midSouthLinear = GeometryUtil.midPoint(this.south.d, this.south.a);
/*  72 */     Point2D.Float midWestLinear = GeometryUtil.midPoint(this.north.a, this.south.d);
/*  73 */     Point2D.Float midEastLinear = GeometryUtil.midPoint(this.north.d, this.south.a);
/*     */     
/*  75 */     Split<Bezier> northSplit = this.north.split();
/*  76 */     Split<Bezier> southSplit = this.south.split();
/*  77 */     Split<Bezier> westSplit = this.west.split();
/*  78 */     Split<Bezier> eastSplit = this.east.split();
/*     */     
/*  80 */     Bezier northLeft = (Bezier)northSplit.left;
/*  81 */     Bezier northRight = (Bezier)northSplit.right;
/*     */     
/*  83 */     Bezier southLeft = (Bezier)southSplit.right;
/*  84 */     Bezier southRight = (Bezier)southSplit.left;
/*     */     
/*  86 */     Bezier westBottom = (Bezier)westSplit.left;
/*  87 */     Bezier westTop = (Bezier)westSplit.right;
/*     */     
/*  89 */     Bezier eastTop = (Bezier)eastSplit.left;
/*  90 */     Bezier eastBottom = (Bezier)eastSplit.right;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  96 */     Bezier midNorthSouth = new Bezier(GeometryUtil.midPoint(this.north.a, this.south.d), GeometryUtil.midPoint(this.north.b, this.south.c), GeometryUtil.midPoint(this.north.c, this.south.b), GeometryUtil.midPoint(this.north.d, this.south.a));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 101 */     Bezier midEastWest = new Bezier(GeometryUtil.midPoint(this.east.a, this.west.d), GeometryUtil.midPoint(this.east.b, this.west.c), GeometryUtil.midPoint(this.east.c, this.west.b), GeometryUtil.midPoint(this.east.d, this.west.a));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 106 */     Split<Bezier> splitNorthSouth = Bezier.combine(midEastWest, Bezier.straightLine(northLeft.d, southLeft.a), Bezier.straightLine(midNorthLinear, midSouthLinear)).split();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 111 */     Split<Bezier> splitWestEast = Bezier.combine(midNorthSouth, Bezier.straightLine(westTop.a, eastTop.d), Bezier.straightLine(midWestLinear, midEastLinear)).split();
/*     */     
/* 113 */     Point2D.Float midNorthValue = GeometryUtil.midPoint(this.coonValues.north, this.coonValues.east);
/* 114 */     Point2D.Float midWestValue = GeometryUtil.midPoint(this.coonValues.north, this.coonValues.west);
/* 115 */     Point2D.Float midSouthValue = GeometryUtil.midPoint(this.coonValues.west, this.coonValues.south);
/* 116 */     Point2D.Float midEastValue = GeometryUtil.midPoint(this.coonValues.east, this.coonValues.south);
/*     */     
/* 118 */     Point2D.Float gridMidValue = GeometryUtil.midPoint(midSouthValue, midNorthValue);
/* 119 */     CoonValues northWestWeights = new CoonValues(this.coonValues.north, midNorthValue, gridMidValue, midWestValue);
/* 120 */     CoonValues northEastWeights = new CoonValues(midNorthValue, this.coonValues.east, midEastValue, gridMidValue);
/* 121 */     CoonValues southWestWeights = new CoonValues(midWestValue, gridMidValue, midSouthValue, this.coonValues.west);
/* 122 */     CoonValues southEastWeights = new CoonValues(gridMidValue, midEastValue, this.coonValues.south, midSouthValue);
/*     */ 
/*     */     
/* 125 */     CoonPatch northWest = new CoonPatch(northLeft, (Bezier)splitNorthSouth.left, ((Bezier)splitWestEast.left).inverse(), westTop, northWestWeights);
/*     */ 
/*     */     
/* 128 */     CoonPatch northEast = new CoonPatch(northRight, eastTop, ((Bezier)splitWestEast.right).inverse(), ((Bezier)splitNorthSouth.left).inverse(), northEastWeights);
/*     */     
/* 130 */     CoonPatch southWest = new CoonPatch((Bezier)splitWestEast.left, (Bezier)splitNorthSouth.right, southLeft, westBottom, southWestWeights);
/*     */ 
/*     */ 
/*     */     
/* 134 */     CoonPatch southEast = new CoonPatch((Bezier)splitWestEast.right, eastBottom, southRight, ((Bezier)splitNorthSouth.right).inverse(), southEastWeights);
/*     */     
/* 136 */     return new Subdivided<>(northWest, northEast, southWest, southEast);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 141 */     return "CoonPatch{north=" + this.north + ", east=" + this.east + ", south=" + this.south + ", west=" + this.west + ", coonValues=" + this.coonValues + '}';
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\mesh\CoonPatch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */