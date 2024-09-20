/*     */ package com.github.weisj.jsvg.renderer;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.MarkerOrientation;
/*     */ import com.github.weisj.jsvg.attributes.PaintOrder;
/*     */ import com.github.weisj.jsvg.attributes.VectorEffect;
/*     */ import com.github.weisj.jsvg.attributes.paint.SVGPaint;
/*     */ import com.github.weisj.jsvg.geometry.size.FloatSize;
/*     */ import com.github.weisj.jsvg.nodes.Marker;
/*     */ import com.github.weisj.jsvg.nodes.SVGNode;
/*     */ import com.github.weisj.jsvg.nodes.ShapeNode;
/*     */ import com.github.weisj.jsvg.nodes.prototype.Instantiator;
/*     */ import com.github.weisj.jsvg.util.GraphicsResetHelper;
/*     */ import java.awt.BasicStroke;
/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Shape;
/*     */ import java.awt.Stroke;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.geom.Path2D;
/*     */ import java.awt.geom.PathIterator;
/*     */ import java.awt.geom.Rectangle2D;
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
/*     */ public final class ShapeRenderer
/*     */ {
/*     */   private static final boolean DEBUG_MARKERS = false;
/*     */   
/*     */   private static final class PaintWithOpacity
/*     */   {
/*     */     @NotNull
/*     */     private final SVGPaint paint;
/*     */     private final float opacity;
/*     */     
/*     */     private PaintWithOpacity(@NotNull SVGPaint paint, float opacity) {
/*  54 */       this.paint = paint;
/*  55 */       this.opacity = opacity;
/*     */     }
/*     */     
/*     */     boolean isVisible() {
/*  59 */       return (this.opacity > 0.0F && this.paint.isVisible());
/*     */     } }
/*     */   
/*     */   public static final class PaintShape { @NotNull
/*     */     private final Shape shape;
/*     */     @Nullable
/*     */     private final Rectangle2D bounds;
/*     */     
/*     */     public PaintShape(@NotNull Shape shape, @Nullable Rectangle2D bounds) {
/*  68 */       this.shape = shape;
/*  69 */       this.bounds = bounds;
/*     */     } }
/*     */   public static final class ShapePaintContext { @NotNull
/*     */     private final RenderContext context;
/*     */     @NotNull
/*     */     private final Set<VectorEffect> vectorEffects;
/*     */     @NotNull
/*     */     private final Stroke stroke;
/*     */     @Nullable
/*     */     private final AffineTransform transform;
/*     */     
/*     */     public ShapePaintContext(@NotNull RenderContext context, @NotNull Set<VectorEffect> vectorEffects, @NotNull Stroke stroke, @Nullable AffineTransform transform) {
/*  81 */       this.context = context;
/*  82 */       this.vectorEffects = vectorEffects;
/*  83 */       this.stroke = stroke;
/*  84 */       this.transform = transform;
/*     */     } }
/*     */   public static final class ShapeMarkerInfo { @NotNull
/*     */     private final ShapeNode node;
/*     */     @Nullable
/*     */     private final Marker markerStart;
/*     */     @Nullable
/*     */     private final Marker markerMid;
/*     */     @Nullable
/*     */     private final Marker markerEnd;
/*     */     private final boolean shouldPaintStartEndMarkersInMiddle;
/*     */     
/*     */     public ShapeMarkerInfo(@NotNull ShapeNode node, @Nullable Marker markerStart, @Nullable Marker markerMid, @Nullable Marker markerEnd, boolean shouldPaintStartEndMarkersInMiddle) {
/*  97 */       this.node = node;
/*  98 */       this.markerStart = markerStart;
/*  99 */       this.markerMid = markerMid;
/* 100 */       this.markerEnd = markerEnd;
/* 101 */       this.shouldPaintStartEndMarkersInMiddle = shouldPaintStartEndMarkersInMiddle;
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void renderWithPaintOrder(@NotNull Graphics2D g, boolean canBeFilledHint, @NotNull PaintOrder paintOrder, @NotNull ShapePaintContext shapePaintContext, @NotNull PaintShape paintShape, @Nullable ShapeMarkerInfo markerInfo) {
/* 108 */     Set<VectorEffect> vectorEffects = shapePaintContext.vectorEffects;
/* 109 */     VectorEffect.applyEffects(shapePaintContext.vectorEffects, g, shapePaintContext
/* 110 */         .context, shapePaintContext.transform);
/* 111 */     GraphicsResetHelper resetHelper = new GraphicsResetHelper(g);
/*     */     
/* 113 */     for (PaintOrder.Phase phase : paintOrder.phases()) {
/* 114 */       Shape strokeShape; RenderContext phaseContext = shapePaintContext.context.deriveForChildGraphics();
/* 115 */       switch (phase) {
/*     */         case FILL:
/* 117 */           if (canBeFilledHint) {
/* 118 */             renderShapeFill(phaseContext, resetHelper.graphics(), paintShape);
/*     */           }
/*     */           break;
/*     */         case STROKE:
/* 122 */           strokeShape = paintShape.shape;
/* 123 */           if (vectorEffects.contains(VectorEffect.NonScalingStroke) && 
/* 124 */             !vectorEffects.contains(VectorEffect.NonScalingSize))
/*     */           {
/* 126 */             strokeShape = VectorEffect.applyNonScalingStroke(resetHelper.graphics(), phaseContext, strokeShape);
/*     */           }
/* 128 */           renderShapeStroke(phaseContext, resetHelper.graphics(), new PaintShape(strokeShape, paintShape
/* 129 */                 .bounds), shapePaintContext.stroke);
/*     */           break;
/*     */         case MARKERS:
/* 132 */           if (markerInfo != null) renderMarkers(resetHelper.graphics(), phaseContext, paintShape, markerInfo); 
/*     */           break;
/*     */       } 
/* 135 */       resetHelper.reset();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static void renderMarkers(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull PaintShape paintShape, @NotNull ShapeMarkerInfo markerInfo) {
/* 141 */     if (markerInfo.markerStart == null && markerInfo.markerMid == null && markerInfo.markerEnd == null)
/* 142 */       return;  renderMarkersImpl(g, context, paintShape.shape.getPathIterator(null), markerInfo);
/*     */   }
/*     */ 
/*     */   
/*     */   private static void renderShapeStroke(@NotNull RenderContext context, @NotNull Graphics2D g, @NotNull PaintShape paintShape, @Nullable Stroke stroke) {
/* 147 */     PaintWithOpacity paintWithOpacity = new PaintWithOpacity(context.strokePaint(), context.strokeOpacity());
/* 148 */     if (stroke == null || !paintWithOpacity.isVisible())
/* 149 */       return;  g.setComposite(GraphicsUtil.deriveComposite(g, paintWithOpacity.opacity));
/* 150 */     g.setStroke(stroke);
/* 151 */     paintWithOpacity.paint.drawShape(g, context, paintShape.shape, paintShape.bounds);
/*     */   }
/*     */ 
/*     */   
/*     */   private static void renderShapeFill(@NotNull RenderContext context, @NotNull Graphics2D g, @NotNull PaintShape paintShape) {
/* 156 */     PaintWithOpacity paintWithOpacity = new PaintWithOpacity(context.fillPaint(), context.fillOpacity());
/* 157 */     if (!paintWithOpacity.isVisible())
/* 158 */       return;  g.setComposite(GraphicsUtil.deriveComposite(g, paintWithOpacity.opacity));
/* 159 */     paintWithOpacity.paint.fillShape(g, context, paintShape.shape, paintShape.bounds);
/*     */   }
/*     */ 
/*     */   
/*     */   private static void renderMarkersImpl(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull PathIterator iterator, @NotNull ShapeMarkerInfo markerInfo) {
/* 164 */     float[] args = new float[6];
/*     */     
/* 166 */     float x = 0.0F;
/* 167 */     float y = 0.0F;
/* 168 */     float xStart = 0.0F;
/* 169 */     float yStart = 0.0F;
/*     */     
/* 171 */     float dxIn = 0.0F;
/* 172 */     float dyIn = 0.0F;
/*     */ 
/*     */ 
/*     */     
/* 176 */     Marker start = markerInfo.markerStart;
/* 177 */     Marker mid = markerInfo.markerMid;
/* 178 */     Marker end = markerInfo.markerEnd;
/*     */     
/* 180 */     boolean onlyFirst = (mid == null && end == null);
/*     */     
/* 182 */     Marker markerToPaint = null;
/* 183 */     MarkerOrientation.MarkerType markerToPaintType = null;
/*     */     
/* 185 */     while (!iterator.isDone()) {
/* 186 */       float dxOut, dyOut; int type = iterator.currentSegment(args);
/* 187 */       iterator.next();
/*     */ 
/*     */ 
/*     */       
/* 191 */       Marker nextMarker = iterator.isDone() ? end : mid;
/*     */ 
/*     */       
/* 194 */       MarkerOrientation.MarkerType nextMarkerType = iterator.isDone() ? MarkerOrientation.MarkerType.END : MarkerOrientation.MarkerType.MID;
/*     */       
/* 196 */       float xPaint = x;
/* 197 */       float yPaint = y;
/* 198 */       float dx = dxIn;
/* 199 */       float dy = dyIn;
/*     */       
/* 201 */       switch (type) {
/*     */         case 0:
/* 203 */           dxIn = 0.0F;
/* 204 */           dyIn = 0.0F;
/* 205 */           x = xStart = args[0];
/* 206 */           y = yStart = args[1];
/* 207 */           if (markerInfo.shouldPaintStartEndMarkersInMiddle || markerToPaint == null) {
/* 208 */             nextMarker = start;
/* 209 */             nextMarkerType = MarkerOrientation.MarkerType.START;
/*     */           } 
/* 211 */           if (markerToPaint != null) {
/* 212 */             paintSingleMarker(markerInfo.node, context, g, markerToPaintType, markerToPaint, xPaint, yPaint, 0.0F, 0.0F, dx, dy);
/*     */             
/* 214 */             if (onlyFirst)
/*     */               return; 
/* 216 */           }  markerToPaint = nextMarker;
/* 217 */           markerToPaintType = nextMarkerType;
/*     */           continue;
/*     */         case 1:
/* 220 */           dxOut = dxIn = args[0] - x;
/* 221 */           dyOut = dyIn = args[1] - y;
/* 222 */           x = args[0];
/* 223 */           y = args[1];
/*     */           break;
/*     */         case 2:
/* 226 */           dxOut = args[0] - x;
/* 227 */           dyOut = args[1] - y;
/* 228 */           dxIn = args[2] - args[0];
/* 229 */           dyIn = args[3] - args[1];
/* 230 */           x = args[2];
/* 231 */           y = args[3];
/*     */           break;
/*     */         case 3:
/* 234 */           dxOut = args[0] - x;
/* 235 */           dyOut = args[1] - y;
/* 236 */           dxIn = args[4] - args[2];
/* 237 */           dyIn = args[5] - args[3];
/* 238 */           x = args[4];
/* 239 */           y = args[5];
/*     */           break;
/*     */         case 4:
/* 242 */           dxOut = dxIn = xStart - x;
/* 243 */           dyOut = dyIn = yStart - y;
/* 244 */           x = xStart;
/* 245 */           y = yStart;
/* 246 */           if (markerInfo.shouldPaintStartEndMarkersInMiddle) {
/* 247 */             nextMarker = end;
/* 248 */             nextMarkerType = MarkerOrientation.MarkerType.END;
/*     */           } 
/*     */           break;
/*     */         default:
/* 252 */           throw new IllegalStateException();
/*     */       } 
/*     */       
/* 255 */       paintSingleMarker(markerInfo.node, context, g, markerToPaintType, markerToPaint, xPaint, yPaint, dx, dy, dxOut, dyOut);
/*     */       
/* 257 */       if (onlyFirst)
/*     */         return; 
/* 259 */       markerToPaint = nextMarker;
/* 260 */       markerToPaintType = nextMarkerType;
/*     */     } 
/* 262 */     paintSingleMarker(markerInfo.node, context, g, markerToPaintType, markerToPaint, x, y, dxIn, dyIn, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void paintSingleMarker(@NotNull ShapeNode shapeNode, @NotNull RenderContext context, @NotNull Graphics2D g, @Nullable MarkerOrientation.MarkerType type, @Nullable Marker marker, float x, float y, float dxIn, float dyIn, float dxOut, float dyOut) {
/* 269 */     if (marker == null)
/* 270 */       return;  assert type != null;
/*     */     
/* 272 */     MarkerOrientation orientation = marker.orientation();
/* 273 */     float rotation = orientation.orientationFor(type, dxIn, dyIn, dxOut, dyOut);
/*     */     
/* 275 */     Graphics2D markerGraphics = (Graphics2D)g.create();
/* 276 */     RenderContext markerContext = context.deriveForChildGraphics();
/*     */     
/* 278 */     markerContext.translate(markerGraphics, x, y);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 285 */     markerContext.rotate(markerGraphics, rotation);
/*     */     
/* 287 */     NodeRenderer.Info info = NodeRenderer.createRenderInfo((SVGNode)marker, markerContext, markerGraphics, (Instantiator)shapeNode); 
/* 288 */     try { if (info != null) info.renderable.render(info.context, info.graphics()); 
/* 289 */       if (info != null) info.close();  } catch (Throwable throwable) { if (info != null)
/*     */         try { info.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }   throw throwable; }
/* 291 */      markerGraphics.dispose();
/*     */   }
/*     */ 
/*     */   
/*     */   private static void paintDebugMarker(@NotNull RenderContext context, @NotNull Graphics2D g, @NotNull Marker marker, float rotation) {
/* 296 */     FloatSize size = marker.size(context);
/*     */     
/* 298 */     Path2D p = new Path2D.Float();
/* 299 */     p.moveTo(0.0D, (size.height / 2.0F));
/* 300 */     p.lineTo(size.width, (size.height / 2.0F));
/* 301 */     p.moveTo(0.8D * size.width, (0.35F * size.height));
/* 302 */     p.lineTo(size.width, (size.height / 2.0F));
/* 303 */     p.lineTo(0.8D * size.width, (0.65F * size.height));
/*     */     
/* 305 */     g.setStroke(new BasicStroke(0.5F));
/*     */     
/* 307 */     g.setColor(Color.MAGENTA.darker().darker());
/* 308 */     g.draw(new Rectangle2D.Float(0.0F, 0.0F, size.width, size.height));
/* 309 */     g.draw(p);
/*     */     
/* 311 */     g.rotate(rotation);
/*     */     
/* 313 */     g.setColor(Color.MAGENTA);
/* 314 */     g.draw(new Rectangle2D.Float(0.0F, 0.0F, size.width, size.height));
/* 315 */     g.draw(p);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\renderer\ShapeRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */