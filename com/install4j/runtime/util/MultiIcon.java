/*     */ package com.install4j.runtime.util;
/*     */ import com.ejt.internal.gui.HiDPIUtil;
/*     */ import java.awt.Component;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Image;
/*     */ import java.io.File;
/*     */ import java.net.URL;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.UIManager;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ public class MultiIcon implements Icon {
/*     */   static {
/*  18 */     URL_LOADER = (fileName -> {
/*     */         URL iconUrl = IconHelper.getIconUrl(fileName);
/*     */ 
/*     */         
/*     */         return (iconUrl != null) ? new ImageIcon(iconUrl) : null;
/*     */       });
/*     */ 
/*     */     
/*  26 */     FILE_LOADER = (filename -> (new File(filename)).exists() ? new ImageIcon(filename) : null);
/*     */   }
/*     */ 
/*     */   
/*     */   private static final ImageIconLoader URL_LOADER;
/*     */   
/*     */   private static final ImageIconLoader FILE_LOADER;
/*     */   
/*     */   @NotNull
/*     */   private ImageIcon lowResLightIcon;
/*     */   
/*     */   @Nullable
/*     */   private ImageIcon highResLightIcon;
/*     */   
/*     */   @Nullable
/*     */   private ImageIcon lowResDarkIcon;
/*     */   @Nullable
/*     */   private ImageIcon highResDarkIcon;
/*     */   
/*     */   public MultiIcon(String fileName) {
/*  46 */     loadUrl(fileName);
/*     */   }
/*     */   
/*     */   public MultiIcon(File file) {
/*  50 */     String path = file.getPath();
/*  51 */     if (path.startsWith("icon:")) {
/*  52 */       loadUrl(path);
/*     */     } else {
/*  54 */       load(path, FILE_LOADER);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void loadUrl(String fileName) {
/*  59 */     load(fileName, URL_LOADER);
/*  60 */     if (this.lowResDarkIcon == null) {
/*  61 */       this.lowResDarkIcon = IconHelper.darkenIcon(this.lowResLightIcon);
/*     */     }
/*  63 */     if (this.highResLightIcon != null && this.highResDarkIcon == null) {
/*  64 */       this.highResDarkIcon = IconHelper.darkenIcon(this.highResLightIcon);
/*     */     }
/*     */   }
/*     */   
/*     */   private void load(String fileName, ImageIconLoader loader) {
/*  69 */     this.lowResLightIcon = loadNonNullIcon(fileName, loader);
/*  70 */     this.lowResDarkIcon = loader.loadIcon(IconHelper.toDarkFileName(fileName));
/*  71 */     String highResFileName = IconHelper.toHighResFileName(fileName);
/*  72 */     this.highResLightIcon = loader.loadIcon(highResFileName);
/*  73 */     this.highResDarkIcon = loader.loadIcon(IconHelper.toDarkFileName(highResFileName));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private ImageIcon loadNonNullIcon(String fileName, ImageIconLoader loader) {
/*  78 */     ImageIcon icon = loader.loadIcon(fileName);
/*  79 */     if (icon == null)
/*     */     {
/*  81 */       throw new RuntimeException("Icon " + fileName + " could not be loaded");
/*     */     }
/*  83 */     return icon;
/*     */   }
/*     */ 
/*     */   
/*     */   public void paintIcon(Component c, Graphics g, int x, int y) {
/*  88 */     boolean hiDPI = HiDPIUtil.isHiDPI((Graphics2D)g);
/*  89 */     ImageIcon icon = resolveEnabledOrDisabledIcon(hiDPI, c);
/*  90 */     if (hiDPI && (icon == this.highResLightIcon || icon == this.highResDarkIcon)) {
/*  91 */       HiDPIUtil.paintScaledIcon(icon.getImage(), icon.getImageObserver(), c, g, x, y);
/*     */     } else {
/*  93 */       icon.paintIcon(c, g, x, y);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int getIconWidth() {
/*  99 */     return this.lowResLightIcon.getIconWidth();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getIconHeight() {
/* 104 */     return this.lowResLightIcon.getIconHeight();
/*     */   }
/*     */   
/*     */   private ImageIcon resolveEnabledOrDisabledIcon(boolean hiDPI, Component c) {
/* 108 */     ImageIcon icon = resolveIcon(hiDPI);
/* 109 */     if (!c.isEnabled()) {
/* 110 */       Icon disabledIcon = UIManager.getLookAndFeel().getDisabledIcon((JComponent)c, icon);
/* 111 */       if (disabledIcon instanceof ImageIcon) {
/* 112 */         return (ImageIcon)disabledIcon;
/*     */       }
/*     */     } 
/* 115 */     return icon;
/*     */   }
/*     */   
/*     */   private ImageIcon resolveIcon(boolean hiDPI) {
/* 119 */     boolean dark = UiUtil.isDarkUi();
/* 120 */     if (hiDPI) {
/* 121 */       if (dark) {
/* 122 */         return IconHelper.coalesce(this.highResDarkIcon, this.lowResDarkIcon, this.highResLightIcon, this.lowResLightIcon);
/*     */       }
/* 124 */       return IconHelper.coalesce(this.highResLightIcon, this.lowResLightIcon);
/*     */     } 
/*     */     
/* 127 */     if (dark) {
/* 128 */       return IconHelper.coalesce(this.lowResDarkIcon, this.lowResLightIcon);
/*     */     }
/* 130 */     return this.lowResLightIcon;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Image getImage() {
/* 136 */     return this.lowResLightIcon.getImage();
/*     */   }
/*     */   
/*     */   private static interface ImageIconLoader {
/*     */     @Nullable
/*     */     ImageIcon loadIcon(String param1String);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\MultiIcon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */