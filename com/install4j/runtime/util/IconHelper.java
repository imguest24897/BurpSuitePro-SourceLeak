/*     */ package com.install4j.runtime.util;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.ExternalFile;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.runtime.beans.applications.Application;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.installer.helper.Install4jClassLoader;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Image;
/*     */ import java.awt.Window;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.awt.image.ImageObserver;
/*     */ import java.awt.image.WritableRaster;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.net.URL;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.imageio.ImageIO;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.ImageIcon;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ public class IconHelper {
/*  32 */   public static final Icon DEFAULT_ICON_FRAME_16 = loadIcon("install4j_icon_16.png");
/*  33 */   public static final Icon DEFAULT_ICON_FRAME_32 = loadIcon("install4j_icon_32.png");
/*  34 */   public static final Icon ICON_FOLDER_OPEN = loadIcon("folder_open_16.png");
/*  35 */   public static final Icon ICON_FOLDER_CLOSED = loadIcon("folder_closed_16.png");
/*     */   
/*     */   private static final String ICONS_DIRECTORY = "icons/";
/*     */   
/*  39 */   private static Map<File, Icon> iconCache = new HashMap<>();
/*     */   
/*     */   public static URL getIconUrl(String fileName) {
/*  42 */     if (fileName.startsWith("icon:")) {
/*  43 */       fileName = fileName.substring("icon:".length());
/*     */     }
/*     */     
/*  46 */     String fileNameWithDirectory = "icons/" + fileName;
/*  47 */     Class<GUIHelper> builtinClass = GUIHelper.class;
/*  48 */     String resourcePath = builtinClass.getPackage().getName().replace('.', '/') + "/" + fileNameWithDirectory;
/*  49 */     URL resource = Install4jClassLoader.getInstance().getResourceWithoutParent(resourcePath);
/*  50 */     if (resource != null)
/*     */     {
/*  52 */       return resource;
/*     */     }
/*  54 */     return builtinClass.getResource(fileNameWithDirectory);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static ImageIcon coalesce(@Nullable ImageIcon icon1, @NotNull ImageIcon icon2) {
/*  60 */     if (icon1 != null) {
/*  61 */       return icon1;
/*     */     }
/*  63 */     return icon2;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static ImageIcon coalesce(@Nullable ImageIcon icon1, @Nullable ImageIcon icon2, @Nullable ImageIcon icon3, @NotNull ImageIcon icon4) {
/*  69 */     if (icon1 != null)
/*  70 */       return icon1; 
/*  71 */     if (icon2 != null)
/*  72 */       return icon2; 
/*  73 */     if (icon3 != null) {
/*  74 */       return icon3;
/*     */     }
/*  76 */     return icon4;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static String toHighResFileName(String fileName) {
/*  82 */     return substringBeforeLastDot(fileName) + "@2x" + substringFromLastDot(fileName);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static String toDarkFileName(String fileName) {
/*  87 */     return substringBeforeLastDot(fileName) + "_dark" + substringFromLastDot(fileName);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static String substringBeforeLastDot(@NotNull String fileName) {
/*  92 */     int index = fileName.lastIndexOf('.');
/*  93 */     if (index > -1) {
/*  94 */       return fileName.substring(0, index);
/*     */     }
/*  96 */     return fileName;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static String substringFromLastDot(@NotNull String fileName) {
/* 102 */     int index = fileName.lastIndexOf('.');
/* 103 */     if (index > -1) {
/* 104 */       return fileName.substring(index);
/*     */     }
/* 106 */     return "";
/*     */   }
/*     */ 
/*     */   
/*     */   public static Image getImage(@NotNull Icon icon) {
/* 111 */     if (icon instanceof MultiIcon)
/* 112 */       return ((MultiIcon)icon).getImage(); 
/* 113 */     if (icon instanceof ImageIcon) {
/* 114 */       return ((ImageIcon)icon).getImage();
/*     */     }
/* 116 */     throw new IllegalArgumentException("Cannot get image of icon class " + icon.getClass());
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static Icon loadIcon(String fileName) {
/* 122 */     HelperCommunication.helperUnsupported();
/* 123 */     return new MultiIcon(fileName);
/*     */   }
/*     */   
/*     */   public static void withIcon(ExternalFile file, Context context, IconConsumer<?> iconConsumer) {
/* 127 */     withIcon(file, null, context, iconConsumer);
/*     */   }
/*     */   
/*     */   public static <T> T withIcon(ExternalFile file, T defaultReturnValue, Context context, IconConsumer<T> iconConsumer) {
/* 131 */     File actualFile = context.getExternalFile(file, false);
/* 132 */     Icon imageIcon = (actualFile != null) ? loadIcon(actualFile) : null;
/* 133 */     if (imageIcon != null) {
/* 134 */       return iconConsumer.call(imageIcon);
/*     */     }
/* 136 */     return defaultReturnValue;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static Icon loadIcon(@NotNull File file) {
/* 142 */     HelperCommunication.helperUnsupported();
/*     */     
/* 144 */     Icon icon = iconCache.get(file);
/* 145 */     if (icon == null) {
/*     */       try {
/* 147 */         icon = new MultiIcon(file);
/* 148 */       } catch (Exception e) {
/* 149 */         Util.printAnnotatedStackTrace(e);
/* 150 */         Logger.getInstance().log(e);
/*     */       } 
/* 152 */       iconCache.put(file, icon);
/*     */     } 
/* 154 */     return icon;
/*     */   }
/*     */   
/*     */   public static List<Image> getFrameIconImages() {
/* 158 */     HelperCommunication.helperUnsupported();
/* 159 */     List<Image> icons = new ArrayList<>();
/* 160 */     Application currentApplication = InstallerConfig.getCurrentApplication();
/* 161 */     if (currentApplication != null && currentApplication.isUseCustomIcon()) {
/*     */       try {
/* 163 */         for (ExternalFile iconFile : currentApplication.getCustomIconImageFiles()) {
/* 164 */           Icon icon = loadIcon(InstallerUtil.getInstallerFile(iconFile.getPath()));
/* 165 */           if (icon != null && icon.getIconWidth() > 0) {
/* 166 */             icons.add(getImage(icon));
/*     */           }
/*     */         } 
/* 169 */       } catch (Exception ex) {
/* 170 */         ex.printStackTrace();
/*     */       } 
/*     */     }
/* 173 */     if (icons.size() == 0) {
/* 174 */       icons.add(getImage(DEFAULT_ICON_FRAME_16));
/* 175 */       icons.add(getImage(loadIcon("install4j_icon_24@n.png")));
/* 176 */       icons.add(getImage(DEFAULT_ICON_FRAME_32));
/* 177 */       icons.add(getImage(loadIcon("install4j_icon_48@n.png")));
/* 178 */       icons.add(getImage(loadIcon("install4j_icon_64@n.png")));
/* 179 */       icons.add(getImage(loadIcon("install4j_icon_128@n.png")));
/*     */     } 
/*     */     
/* 182 */     return icons;
/*     */   }
/*     */   
/*     */   public static void setIconImages(Window window) {
/* 186 */     HelperCommunication.helperUnsupported();
/* 187 */     window.setIconImages(getFrameIconImages());
/*     */   }
/*     */   
/*     */   public static int getIconSize(File file) throws IOException {
/* 191 */     BufferedImage image = ImageIO.read(file);
/* 192 */     int width = image.getWidth();
/* 193 */     int height = image.getHeight();
/* 194 */     if (width != height) {
/* 195 */       throw new IOException(file + " is not square: " + width + " != " + height);
/*     */     }
/* 197 */     return width;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static ImageIcon darkenIcon(@NotNull ImageIcon icon) {
/* 202 */     return new ImageIcon(darkenImage(icon.getImage(), 0.8F));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static BufferedImage darkenImage(@NotNull Image image, float scaleFactor) {
/* 208 */     BufferedImage bufferedImage = toBufferedImage(image);
/* 209 */     WritableRaster wr = bufferedImage.getRaster();
/* 210 */     int[] pixel = new int[4];
/*     */     
/* 212 */     for (int i = 0; i < wr.getWidth(); i++) {
/* 213 */       for (int j = 0; j < wr.getHeight(); j++) {
/* 214 */         wr.getPixel(i, j, pixel);
/* 215 */         pixel[0] = (int)(pixel[0] * scaleFactor);
/* 216 */         pixel[1] = (int)(pixel[1] * scaleFactor);
/* 217 */         pixel[2] = (int)(pixel[2] * scaleFactor);
/* 218 */         wr.setPixel(i, j, pixel);
/*     */       } 
/*     */     } 
/* 221 */     return bufferedImage;
/*     */   }
/*     */   
/*     */   private static BufferedImage toBufferedImage(@NotNull Image image) {
/* 225 */     BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), 2);
/* 226 */     Graphics2D g = bufferedImage.createGraphics();
/* 227 */     g.drawImage(image, 0, 0, (ImageObserver)null);
/* 228 */     g.dispose();
/* 229 */     return bufferedImage;
/*     */   }
/*     */   
/*     */   public static interface IconConsumer<T> {
/*     */     T call(@NotNull Icon param1Icon);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\IconHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */