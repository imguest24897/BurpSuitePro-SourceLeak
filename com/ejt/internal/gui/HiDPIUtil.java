/*    */ package com.ejt.internal.gui;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.GraphicsConfiguration;
/*    */ import java.awt.GraphicsEnvironment;
/*    */ import java.awt.Image;
/*    */ import java.awt.RenderingHints;
/*    */ import java.awt.image.ImageObserver;
/*    */ import java.lang.reflect.Field;
/*    */ 
/*    */ public class HiDPIUtil {
/* 11 */   public static final RenderingHints.Key KEY_HIDPI = new RenderingHints.Key(0)
/*    */     {
/*    */       public boolean isCompatibleValue(Object val) {
/* 14 */         return val instanceof Boolean;
/*    */       }
/*    */     };
/* 17 */   private static final boolean JETBRAINS_JRE = System.getProperty("java.vendor").toLowerCase().contains("jetbrains");
/*    */   
/*    */   private static Double cachedScaleFactor;
/*    */   
/*    */   public static boolean isIntegerScaleFactor(Graphics2D g) {
/* 22 */     double scaleFactor = getScaleFactor(g);
/* 23 */     return (Math.floor(scaleFactor) == scaleFactor);
/*    */   }
/*    */   
/*    */   public static double getScaleFactor(Graphics2D g) {
/* 27 */     if (g == null) {
/* 28 */       throw new NullPointerException("graphics is null");
/*    */     }
/* 30 */     GraphicsConfiguration deviceConfiguration = g.getDeviceConfiguration();
/* 31 */     if (deviceConfiguration == null) {
/* 32 */       throw new NullPointerException("deviceConfiguration is null");
/*    */     }
/* 34 */     return getScaleFactor(deviceConfiguration);
/*    */   }
/*    */   
/*    */   public static double getDefaultDeviceScaleFactor() {
/* 38 */     return getScaleFactor(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration());
/*    */   }
/*    */   
/*    */   public static double getScaleFactor(GraphicsConfiguration deviceConfiguration) {
/* 42 */     double scale = deviceConfiguration.getDefaultTransform().getScaleX();
/* 43 */     if (CommonPlatformUtil.isMacOS() && scale == 1.0D && !JETBRAINS_JRE) {
/* 44 */       if (cachedScaleFactor == null) {
/* 45 */         initCachedScaleFactor();
/*    */       }
/* 47 */       return cachedScaleFactor.doubleValue();
/*    */     } 
/*    */     
/* 50 */     return scale;
/*    */   }
/*    */   
/*    */   private static void initCachedScaleFactor() {
/* 54 */     GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
/* 55 */     cachedScaleFactor = Double.valueOf(1.0D);
/*    */     try {
/* 57 */       GraphicsDevice device = graphicsEnvironment.getDefaultScreenDevice();
/* 58 */       Field field = device.getClass().getDeclaredField("scale");
/* 59 */       field.setAccessible(true);
/* 60 */       Object scaleValue = field.get(device);
/* 61 */       if (scaleValue instanceof Integer && ((Integer)scaleValue).intValue() == 2) {
/* 62 */         cachedScaleFactor = Double.valueOf(2.0D);
/*    */       }
/* 64 */     } catch (Exception exception) {}
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean isHiDPI(Graphics2D g) {
/* 69 */     return (Boolean.TRUE.equals(g.getRenderingHint(KEY_HIDPI)) || getScaleFactor(g) > 1.0D);
/*    */   }
/*    */   
/*    */   public static void paintScaledIcon(Image iconImage, @Nullable ImageObserver observer, Component c, Graphics g, int x, int y) {
/* 73 */     if (observer == null) {
/* 74 */       observer = c;
/*    */     }
/*    */     
/* 77 */     int width = iconImage.getWidth(observer);
/* 78 */     int height = iconImage.getHeight(observer);
/* 79 */     Graphics2D g2d = (Graphics2D)g.create(x, y, width, height);
/*    */     
/* 81 */     g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
/* 82 */     g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
/* 83 */     g2d.scale(0.5D, 0.5D);
/* 84 */     g2d.drawImage(iconImage, 0, 0, observer);
/* 85 */     g2d.scale(1.0D, 1.0D);
/* 86 */     g2d.dispose();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\internal\gui\HiDPIUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */