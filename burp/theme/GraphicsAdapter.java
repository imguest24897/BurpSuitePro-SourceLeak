package burp.theme;

import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class GraphicsAdapter extends Graphics2D {
  private final Graphics2D graphics;
  
  public GraphicsAdapter(Graphics2D paramGraphics2D) {
    this.graphics = paramGraphics2D;
  }
  
  public Graphics create() {
    return this.graphics.create();
  }
  
  public void translate(int paramInt1, int paramInt2) {
    this.graphics.translate(paramInt1, paramInt2);
  }
  
  public void translate(double paramDouble1, double paramDouble2) {
    this.graphics.translate(paramDouble1, paramDouble2);
  }
  
  public void rotate(double paramDouble) {
    this.graphics.rotate(paramDouble);
  }
  
  public void rotate(double paramDouble1, double paramDouble2, double paramDouble3) {
    this.graphics.rotate(paramDouble1, paramDouble2, paramDouble3);
  }
  
  public void scale(double paramDouble1, double paramDouble2) {
    this.graphics.scale(paramDouble1, paramDouble2);
  }
  
  public void shear(double paramDouble1, double paramDouble2) {
    this.graphics.shear(paramDouble1, paramDouble2);
  }
  
  public void transform(AffineTransform paramAffineTransform) {
    this.graphics.transform(paramAffineTransform);
  }
  
  public void setTransform(AffineTransform paramAffineTransform) {
    this.graphics.setTransform(paramAffineTransform);
  }
  
  public AffineTransform getTransform() {
    return this.graphics.getTransform();
  }
  
  public Paint getPaint() {
    return this.graphics.getPaint();
  }
  
  public Composite getComposite() {
    return this.graphics.getComposite();
  }
  
  public void setBackground(Color paramColor) {
    this.graphics.setBackground(paramColor);
  }
  
  public Color getBackground() {
    return this.graphics.getBackground();
  }
  
  public Stroke getStroke() {
    return this.graphics.getStroke();
  }
  
  public void clip(Shape paramShape) {
    this.graphics.clip(paramShape);
  }
  
  public FontRenderContext getFontRenderContext() {
    return this.graphics.getFontRenderContext();
  }
  
  public Color getColor() {
    return this.graphics.getColor();
  }
  
  public void setColor(Color paramColor) {
    this.graphics.setColor(paramColor);
  }
  
  public void setPaintMode() {
    this.graphics.setPaintMode();
  }
  
  public void setXORMode(Color paramColor) {
    this.graphics.setXORMode(paramColor);
  }
  
  public Font getFont() {
    return this.graphics.getFont();
  }
  
  public void setFont(Font paramFont) {
    this.graphics.setFont(paramFont);
  }
  
  public FontMetrics getFontMetrics(Font paramFont) {
    return this.graphics.getFontMetrics(paramFont);
  }
  
  public Rectangle getClipBounds() {
    return this.graphics.getClipBounds();
  }
  
  public void clipRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.graphics.clipRect(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setClip(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.graphics.setClip(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public Shape getClip() {
    return this.graphics.getClip();
  }
  
  public void setClip(Shape paramShape) {
    this.graphics.setClip(paramShape);
  }
  
  public void copyArea(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.graphics.copyArea(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  public void drawLine(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.graphics.drawLine(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void fillRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.graphics.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void clearRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.graphics.clearRect(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void drawRoundRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.graphics.drawRoundRect(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  public void fillRoundRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.graphics.fillRoundRect(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  public void drawOval(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.graphics.drawOval(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void fillOval(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.graphics.fillOval(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void drawArc(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.graphics.drawArc(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  public void fillArc(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.graphics.fillArc(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  public void drawPolyline(int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt) {
    this.graphics.drawPolyline(paramArrayOfint1, paramArrayOfint2, paramInt);
  }
  
  public void drawPolygon(int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt) {
    this.graphics.drawPolygon(paramArrayOfint1, paramArrayOfint2, paramInt);
  }
  
  public void fillPolygon(int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt) {
    this.graphics.fillPolygon(paramArrayOfint1, paramArrayOfint2, paramInt);
  }
  
  public void draw(Shape paramShape) {
    this.graphics.draw(paramShape);
  }
  
  public boolean drawImage(Image paramImage, AffineTransform paramAffineTransform, ImageObserver paramImageObserver) {
    return this.graphics.drawImage(paramImage, paramAffineTransform, paramImageObserver);
  }
  
  public void drawImage(BufferedImage paramBufferedImage, BufferedImageOp paramBufferedImageOp, int paramInt1, int paramInt2) {
    this.graphics.drawImage(paramBufferedImage, paramBufferedImageOp, paramInt1, paramInt2);
  }
  
  public void drawRenderedImage(RenderedImage paramRenderedImage, AffineTransform paramAffineTransform) {
    this.graphics.drawRenderedImage(paramRenderedImage, paramAffineTransform);
  }
  
  public void drawRenderableImage(RenderableImage paramRenderableImage, AffineTransform paramAffineTransform) {
    this.graphics.drawRenderableImage(paramRenderableImage, paramAffineTransform);
  }
  
  public void drawString(@NotNull String paramString, int paramInt1, int paramInt2) {
    this.graphics.drawString(paramString, paramInt1, paramInt2);
  }
  
  public void drawString(String paramString, float paramFloat1, float paramFloat2) {
    this.graphics.drawString(paramString, paramFloat1, paramFloat2);
  }
  
  public void drawString(AttributedCharacterIterator paramAttributedCharacterIterator, int paramInt1, int paramInt2) {
    this.graphics.drawString(paramAttributedCharacterIterator, paramInt1, paramInt2);
  }
  
  public void drawString(AttributedCharacterIterator paramAttributedCharacterIterator, float paramFloat1, float paramFloat2) {
    this.graphics.drawString(paramAttributedCharacterIterator, paramFloat1, paramFloat2);
  }
  
  public void drawGlyphVector(GlyphVector paramGlyphVector, float paramFloat1, float paramFloat2) {
    this.graphics.drawGlyphVector(paramGlyphVector, paramFloat1, paramFloat2);
  }
  
  public void fill(Shape paramShape) {
    this.graphics.fill(paramShape);
  }
  
  public boolean hit(Rectangle paramRectangle, Shape paramShape, boolean paramBoolean) {
    return this.graphics.hit(paramRectangle, paramShape, paramBoolean);
  }
  
  public GraphicsConfiguration getDeviceConfiguration() {
    return this.graphics.getDeviceConfiguration();
  }
  
  public void setComposite(Composite paramComposite) {
    this.graphics.setComposite(paramComposite);
  }
  
  public void setPaint(Paint paramPaint) {
    this.graphics.setPaint(paramPaint);
  }
  
  public void setStroke(Stroke paramStroke) {
    this.graphics.setStroke(paramStroke);
  }
  
  public void setRenderingHint(RenderingHints.Key paramKey, Object paramObject) {
    this.graphics.setRenderingHint(paramKey, paramObject);
  }
  
  public Object getRenderingHint(RenderingHints.Key paramKey) {
    return this.graphics.getRenderingHint(paramKey);
  }
  
  public void setRenderingHints(Map<?, ?> paramMap) {
    this.graphics.setRenderingHints(paramMap);
  }
  
  public void addRenderingHints(Map<?, ?> paramMap) {
    this.graphics.addRenderingHints(paramMap);
  }
  
  public RenderingHints getRenderingHints() {
    return this.graphics.getRenderingHints();
  }
  
  public boolean drawImage(Image paramImage, int paramInt1, int paramInt2, ImageObserver paramImageObserver) {
    return this.graphics.drawImage(paramImage, paramInt1, paramInt2, paramImageObserver);
  }
  
  public boolean drawImage(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, ImageObserver paramImageObserver) {
    return this.graphics.drawImage(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramImageObserver);
  }
  
  public boolean drawImage(Image paramImage, int paramInt1, int paramInt2, Color paramColor, ImageObserver paramImageObserver) {
    return this.graphics.drawImage(paramImage, paramInt1, paramInt2, paramColor, paramImageObserver);
  }
  
  public boolean drawImage(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Color paramColor, ImageObserver paramImageObserver) {
    return this.graphics.drawImage(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramColor, paramImageObserver);
  }
  
  public boolean drawImage(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, ImageObserver paramImageObserver) {
    return this.graphics.drawImage(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramImageObserver);
  }
  
  public boolean drawImage(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Color paramColor, ImageObserver paramImageObserver) {
    return this.graphics.drawImage(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramColor, paramImageObserver);
  }
  
  public void dispose() {
    this.graphics.dispose();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\GraphicsAdapter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */