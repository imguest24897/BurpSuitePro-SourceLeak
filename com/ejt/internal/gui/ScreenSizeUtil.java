/*     */ package com.ejt.internal.gui;
/*     */ import java.awt.GraphicsConfiguration;
/*     */ import java.awt.GraphicsDevice;
/*     */ import java.awt.Insets;
/*     */ import java.awt.Rectangle;
/*     */ 
/*     */ public class ScreenSizeUtil {
/*   8 */   private static final boolean DEBUG_SCREEN_SIZE = Boolean.getBoolean("ejt.debugScreenSize");
/*     */ 
/*     */   
/*     */   private static GraphicsDevice overrideGraphicsDevice;
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static Rectangle getFrameBounds(Dimension size, Window parentWindow) {
/*  16 */     return getFrameBounds(size.width, size.height, parentWindow);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static Rectangle getFrameBounds(int width, int height, Window parentWindow) {
/*     */     Rectangle bounds;
/*  22 */     if (parentWindow != null && parentWindow.isVisible()) {
/*  23 */       bounds = parentWindow.getBounds();
/*     */     } else {
/*  25 */       bounds = new Rectangle(getScreenDevice().getDefaultConfiguration().getBounds());
/*     */     } 
/*     */     
/*  28 */     int deltaX = bounds.width - width;
/*  29 */     int deltaY = bounds.height - height;
/*  30 */     bounds.x += deltaX / 2;
/*  31 */     bounds.width -= deltaX;
/*  32 */     bounds.y += deltaY / 2;
/*  33 */     bounds.height -= deltaY;
/*     */     
/*  35 */     adjustBoundsToScreenSize(bounds);
/*     */     
/*  37 */     return bounds;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void adjustBoundsToScreenSize(Rectangle bounds) {
/*  42 */     if (GraphicsEnvironment.isHeadless()) {
/*     */       return;
/*     */     }
/*     */     
/*  46 */     GraphicsConfiguration graphicsConfiguration = getGraphicsConfiguration(bounds);
/*     */     
/*  48 */     Rectangle screenBounds = getScreenBoundsWithInsets(graphicsConfiguration);
/*  49 */     if (DEBUG_SCREEN_SIZE) {
/*  50 */       System.err.println("original bounds = " + bounds);
/*  51 */       System.err.println("screen bounds for original bounds = " + screenBounds);
/*     */     } 
/*     */ 
/*     */     
/*  55 */     if (screenBounds.width <= 0 || screenBounds.height <= 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  60 */     if (bounds.x < screenBounds.x) {
/*  61 */       bounds.translate(screenBounds.x - bounds.x, 0);
/*     */     }
/*  63 */     if (bounds.y < screenBounds.y) {
/*  64 */       bounds.translate(0, screenBounds.y - bounds.y);
/*     */     }
/*     */ 
/*     */     
/*  68 */     if (bounds.x + bounds.width > screenBounds.x + screenBounds.width) {
/*  69 */       bounds.translate(screenBounds.x + screenBounds.width - bounds.x + bounds.width, 0);
/*     */     }
/*  71 */     if (bounds.y + bounds.height > screenBounds.y + screenBounds.height) {
/*  72 */       bounds.translate(0, screenBounds.y + screenBounds.height - bounds.y + bounds.height);
/*     */     }
/*     */ 
/*     */     
/*  76 */     if (bounds.x < screenBounds.x) {
/*  77 */       bounds.x = screenBounds.x;
/*  78 */       bounds.width = screenBounds.width;
/*     */     } 
/*  80 */     if (bounds.y < screenBounds.y) {
/*  81 */       bounds.y = screenBounds.y;
/*  82 */       bounds.height = screenBounds.height;
/*     */     } 
/*     */     
/*  85 */     if (DEBUG_SCREEN_SIZE) {
/*  86 */       System.err.println("corrected bounds = " + bounds);
/*     */     }
/*     */   }
/*     */   
/*     */   public static GraphicsConfiguration getGraphicsConfiguration(Rectangle bounds) {
/*  91 */     GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
/*  92 */     GraphicsDevice[] graphicsDevices = graphicsEnvironment.getScreenDevices();
/*  93 */     GraphicsConfiguration maxAreaConfiguration = null;
/*  94 */     int maxArea = 0;
/*  95 */     for (GraphicsDevice graphicsDevice : graphicsDevices) {
/*  96 */       GraphicsConfiguration[] graphicsConfigurations = graphicsDevice.getConfigurations();
/*  97 */       for (GraphicsConfiguration graphicsConfiguration : graphicsConfigurations) {
/*  98 */         Rectangle graphicsConfigurationBounds = graphicsConfiguration.getBounds();
/*  99 */         if (graphicsConfigurationBounds.contains(bounds.getLocation())) {
/* 100 */           return graphicsConfiguration;
/*     */         }
/* 102 */         Rectangle intersection = graphicsConfigurationBounds.intersects(bounds) ? graphicsConfigurationBounds.intersection(bounds) : new Rectangle();
/* 103 */         int area = intersection.width * intersection.height;
/* 104 */         if (area > maxArea) {
/* 105 */           maxArea = area;
/* 106 */           maxAreaConfiguration = graphicsConfiguration;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 111 */     return (maxAreaConfiguration != null) ? maxAreaConfiguration : getScreenDevice().getDefaultConfiguration();
/*     */   }
/*     */   
/*     */   public static Rectangle getScreenBoundsWithInsets(GraphicsConfiguration graphicsConfiguration) {
/* 115 */     if (graphicsConfiguration == null) {
/* 116 */       graphicsConfiguration = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
/*     */     }
/* 118 */     Rectangle screenBounds = graphicsConfiguration.getBounds();
/* 119 */     Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(graphicsConfiguration);
/* 120 */     screenBounds.x += screenInsets.left;
/* 121 */     screenBounds.y += screenInsets.top;
/* 122 */     screenBounds.width -= screenInsets.left + screenInsets.right;
/* 123 */     screenBounds.height -= screenInsets.bottom + screenInsets.top;
/*     */     
/* 125 */     if (DEBUG_SCREEN_SIZE) {
/* 126 */       System.err.println("screen bounds = " + screenBounds);
/* 127 */       System.err.println("screen insets = " + screenInsets);
/*     */     } 
/* 129 */     screenBounds.width = Math.max(screenBounds.width, 1000);
/* 130 */     screenBounds.height = Math.max(screenBounds.height, 800);
/*     */     
/* 132 */     return screenBounds;
/*     */   }
/*     */   
/*     */   public static GraphicsDevice getScreenDevice() {
/* 136 */     if (overrideGraphicsDevice != null) {
/* 137 */       return overrideGraphicsDevice;
/*     */     }
/* 139 */     return GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
/*     */   }
/*     */ 
/*     */   
/*     */   public static GraphicsDevice getOverrideGraphicsDevice() {
/* 144 */     return overrideGraphicsDevice;
/*     */   }
/*     */   
/*     */   public static void checkOverrideScreenDevice() {
/* 148 */     String testDisplay = System.getenv().get("TEST_DISPLAY");
/* 149 */     if (testDisplay != null)
/* 150 */       for (GraphicsDevice screenDevice : GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()) {
/* 151 */         if (screenDevice.getIDstring().equals(testDisplay)) {
/* 152 */           overrideGraphicsDevice = screenDevice;
/*     */           return;
/*     */         } 
/*     */       }  
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\internal\gui\ScreenSizeUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */