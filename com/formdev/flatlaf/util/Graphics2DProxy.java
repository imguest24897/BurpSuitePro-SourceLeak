/*     */ package com.formdev.flatlaf.util;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Composite;
/*     */ import java.awt.Font;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.GraphicsConfiguration;
/*     */ import java.awt.Image;
/*     */ import java.awt.Paint;
/*     */ import java.awt.Polygon;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.Shape;
/*     */ import java.awt.Stroke;
/*     */ import java.awt.font.FontRenderContext;
/*     */ import java.awt.font.GlyphVector;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.awt.image.BufferedImageOp;
/*     */ import java.awt.image.ImageObserver;
/*     */ import java.awt.image.RenderedImage;
/*     */ import java.awt.image.renderable.RenderableImage;
/*     */ import java.text.AttributedCharacterIterator;
/*     */ import java.util.Map;
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
/*     */ public class Graphics2DProxy
/*     */   extends Graphics2D
/*     */ {
/*     */   private final Graphics2D delegate;
/*     */   
/*     */   public Graphics2DProxy(Graphics2D delegate) {
/*  55 */     this.delegate = delegate;
/*     */   }
/*     */ 
/*     */   
/*     */   public Graphics create() {
/*  60 */     return this.delegate.create();
/*     */   }
/*     */ 
/*     */   
/*     */   public Graphics create(int x, int y, int width, int height) {
/*  65 */     return this.delegate.create(x, y, width, height);
/*     */   }
/*     */ 
/*     */   
/*     */   public Color getColor() {
/*  70 */     return this.delegate.getColor();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setColor(Color c) {
/*  75 */     this.delegate.setColor(c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPaintMode() {
/*  80 */     this.delegate.setPaintMode();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setXORMode(Color c1) {
/*  85 */     this.delegate.setXORMode(c1);
/*     */   }
/*     */ 
/*     */   
/*     */   public Font getFont() {
/*  90 */     return this.delegate.getFont();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFont(Font font) {
/*  95 */     this.delegate.setFont(font);
/*     */   }
/*     */ 
/*     */   
/*     */   public FontMetrics getFontMetrics() {
/* 100 */     return this.delegate.getFontMetrics();
/*     */   }
/*     */ 
/*     */   
/*     */   public FontMetrics getFontMetrics(Font f) {
/* 105 */     return this.delegate.getFontMetrics(f);
/*     */   }
/*     */ 
/*     */   
/*     */   public Rectangle getClipBounds() {
/* 110 */     return this.delegate.getClipBounds();
/*     */   }
/*     */ 
/*     */   
/*     */   public void clipRect(int x, int y, int width, int height) {
/* 115 */     this.delegate.clipRect(x, y, width, height);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setClip(int x, int y, int width, int height) {
/* 120 */     this.delegate.setClip(x, y, width, height);
/*     */   }
/*     */ 
/*     */   
/*     */   public Shape getClip() {
/* 125 */     return this.delegate.getClip();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setClip(Shape clip) {
/* 130 */     this.delegate.setClip(clip);
/*     */   }
/*     */ 
/*     */   
/*     */   public void copyArea(int x, int y, int width, int height, int dx, int dy) {
/* 135 */     this.delegate.copyArea(x, y, width, height, dx, dy);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawLine(int x1, int y1, int x2, int y2) {
/* 140 */     this.delegate.drawLine(x1, y1, x2, y2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void fillRect(int x, int y, int width, int height) {
/* 145 */     this.delegate.fillRect(x, y, width, height);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawRect(int x, int y, int width, int height) {
/* 150 */     this.delegate.drawRect(x, y, width, height);
/*     */   }
/*     */ 
/*     */   
/*     */   public void clearRect(int x, int y, int width, int height) {
/* 155 */     this.delegate.clearRect(x, y, width, height);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
/* 160 */     this.delegate.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
/*     */   }
/*     */ 
/*     */   
/*     */   public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
/* 165 */     this.delegate.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawOval(int x, int y, int width, int height) {
/* 170 */     this.delegate.drawOval(x, y, width, height);
/*     */   }
/*     */ 
/*     */   
/*     */   public void fillOval(int x, int y, int width, int height) {
/* 175 */     this.delegate.fillOval(x, y, width, height);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
/* 180 */     this.delegate.drawArc(x, y, width, height, startAngle, arcAngle);
/*     */   }
/*     */ 
/*     */   
/*     */   public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
/* 185 */     this.delegate.fillArc(x, y, width, height, startAngle, arcAngle);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
/* 190 */     this.delegate.drawPolyline(xPoints, yPoints, nPoints);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
/* 195 */     this.delegate.drawPolygon(xPoints, yPoints, nPoints);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawPolygon(Polygon p) {
/* 200 */     this.delegate.drawPolygon(p);
/*     */   }
/*     */ 
/*     */   
/*     */   public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
/* 205 */     this.delegate.fillPolygon(xPoints, yPoints, nPoints);
/*     */   }
/*     */ 
/*     */   
/*     */   public void fillPolygon(Polygon p) {
/* 210 */     this.delegate.fillPolygon(p);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawChars(char[] data, int offset, int length, int x, int y) {
/* 215 */     this.delegate.drawChars(data, offset, length, x, y);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawBytes(byte[] data, int offset, int length, int x, int y) {
/* 220 */     this.delegate.drawBytes(data, offset, length, x, y);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
/* 225 */     return this.delegate.drawImage(img, x, y, observer);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
/* 230 */     return this.delegate.drawImage(img, x, y, width, height, observer);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
/* 235 */     return this.delegate.drawImage(img, x, y, bgcolor, observer);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
/* 240 */     return this.delegate.drawImage(img, x, y, width, height, bgcolor, observer);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
/* 245 */     return this.delegate.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, observer);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
/* 250 */     return this.delegate.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, bgcolor, observer);
/*     */   }
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 255 */     this.delegate.dispose();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 260 */     return this.delegate.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Rectangle getClipRect() {
/* 266 */     return this.delegate.getClipRect();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hitClip(int x, int y, int width, int height) {
/* 271 */     return this.delegate.hitClip(x, y, width, height);
/*     */   }
/*     */ 
/*     */   
/*     */   public Rectangle getClipBounds(Rectangle r) {
/* 276 */     return this.delegate.getClipBounds(r);
/*     */   }
/*     */ 
/*     */   
/*     */   public void draw3DRect(int x, int y, int width, int height, boolean raised) {
/* 281 */     this.delegate.draw3DRect(x, y, width, height, raised);
/*     */   }
/*     */ 
/*     */   
/*     */   public void fill3DRect(int x, int y, int width, int height, boolean raised) {
/* 286 */     this.delegate.fill3DRect(x, y, width, height, raised);
/*     */   }
/*     */ 
/*     */   
/*     */   public void draw(Shape s) {
/* 291 */     this.delegate.draw(s);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean drawImage(Image img, AffineTransform xform, ImageObserver obs) {
/* 296 */     return this.delegate.drawImage(img, xform, obs);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawImage(BufferedImage img, BufferedImageOp op, int x, int y) {
/* 301 */     this.delegate.drawImage(img, op, x, y);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawRenderedImage(RenderedImage img, AffineTransform xform) {
/* 306 */     this.delegate.drawRenderedImage(img, xform);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawRenderableImage(RenderableImage img, AffineTransform xform) {
/* 311 */     this.delegate.drawRenderableImage(img, xform);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawString(String str, int x, int y) {
/* 316 */     this.delegate.drawString(str, x, y);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawString(String str, float x, float y) {
/* 321 */     this.delegate.drawString(str, x, y);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawString(AttributedCharacterIterator iterator, int x, int y) {
/* 326 */     this.delegate.drawString(iterator, x, y);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawString(AttributedCharacterIterator iterator, float x, float y) {
/* 331 */     this.delegate.drawString(iterator, x, y);
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawGlyphVector(GlyphVector g, float x, float y) {
/* 336 */     this.delegate.drawGlyphVector(g, x, y);
/*     */   }
/*     */ 
/*     */   
/*     */   public void fill(Shape s) {
/* 341 */     this.delegate.fill(s);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hit(Rectangle rect, Shape s, boolean onStroke) {
/* 346 */     return this.delegate.hit(rect, s, onStroke);
/*     */   }
/*     */ 
/*     */   
/*     */   public GraphicsConfiguration getDeviceConfiguration() {
/* 351 */     return this.delegate.getDeviceConfiguration();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setComposite(Composite comp) {
/* 356 */     this.delegate.setComposite(comp);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPaint(Paint paint) {
/* 361 */     this.delegate.setPaint(paint);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStroke(Stroke s) {
/* 366 */     this.delegate.setStroke(s);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderingHint(RenderingHints.Key hintKey, Object hintValue) {
/* 371 */     this.delegate.setRenderingHint(hintKey, hintValue);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getRenderingHint(RenderingHints.Key hintKey) {
/* 376 */     return this.delegate.getRenderingHint(hintKey);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRenderingHints(Map<?, ?> hints) {
/* 381 */     this.delegate.setRenderingHints(hints);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addRenderingHints(Map<?, ?> hints) {
/* 386 */     this.delegate.addRenderingHints(hints);
/*     */   }
/*     */ 
/*     */   
/*     */   public RenderingHints getRenderingHints() {
/* 391 */     return this.delegate.getRenderingHints();
/*     */   }
/*     */ 
/*     */   
/*     */   public void translate(int x, int y) {
/* 396 */     this.delegate.translate(x, y);
/*     */   }
/*     */ 
/*     */   
/*     */   public void translate(double tx, double ty) {
/* 401 */     this.delegate.translate(tx, ty);
/*     */   }
/*     */ 
/*     */   
/*     */   public void rotate(double theta) {
/* 406 */     this.delegate.rotate(theta);
/*     */   }
/*     */ 
/*     */   
/*     */   public void rotate(double theta, double x, double y) {
/* 411 */     this.delegate.rotate(theta, x, y);
/*     */   }
/*     */ 
/*     */   
/*     */   public void scale(double sx, double sy) {
/* 416 */     this.delegate.scale(sx, sy);
/*     */   }
/*     */ 
/*     */   
/*     */   public void shear(double shx, double shy) {
/* 421 */     this.delegate.shear(shx, shy);
/*     */   }
/*     */ 
/*     */   
/*     */   public void transform(AffineTransform Tx) {
/* 426 */     this.delegate.transform(Tx);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTransform(AffineTransform Tx) {
/* 431 */     this.delegate.setTransform(Tx);
/*     */   }
/*     */ 
/*     */   
/*     */   public AffineTransform getTransform() {
/* 436 */     return this.delegate.getTransform();
/*     */   }
/*     */ 
/*     */   
/*     */   public Paint getPaint() {
/* 441 */     return this.delegate.getPaint();
/*     */   }
/*     */ 
/*     */   
/*     */   public Composite getComposite() {
/* 446 */     return this.delegate.getComposite();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setBackground(Color color) {
/* 451 */     this.delegate.setBackground(color);
/*     */   }
/*     */ 
/*     */   
/*     */   public Color getBackground() {
/* 456 */     return this.delegate.getBackground();
/*     */   }
/*     */ 
/*     */   
/*     */   public Stroke getStroke() {
/* 461 */     return this.delegate.getStroke();
/*     */   }
/*     */ 
/*     */   
/*     */   public void clip(Shape s) {
/* 466 */     this.delegate.clip(s);
/*     */   }
/*     */ 
/*     */   
/*     */   public FontRenderContext getFontRenderContext() {
/* 471 */     return this.delegate.getFontRenderContext();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\util\Graphics2DProxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */