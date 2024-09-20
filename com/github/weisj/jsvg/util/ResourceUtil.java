/*    */ package com.github.weisj.jsvg.util;
/*    */ 
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.io.ByteArrayInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.net.URI;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ import java.util.Arrays;
/*    */ import java.util.Iterator;
/*    */ import java.util.Locale;
/*    */ import java.util.Set;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ import java.util.stream.Collectors;
/*    */ import javax.imageio.ImageIO;
/*    */ import javax.imageio.ImageReadParam;
/*    */ import javax.imageio.ImageReader;
/*    */ import javax.imageio.ImageTypeSpecifier;
/*    */ import javax.imageio.stream.ImageInputStream;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ public final class ResourceUtil
/*    */ {
/* 45 */   private static final Logger LOGGER = Logger.getLogger(ResourceUtil.class.getName());
/*    */ 
/*    */   
/*    */   private static final Set<String> SUPPORTED_MIME_TYPES;
/*    */ 
/*    */   
/*    */   static {
/* 52 */     SUPPORTED_MIME_TYPES = (Set<String>)Arrays.<String>stream(ImageIO.getReaderFormatNames()).map(s -> "image/" + s.toLowerCase(Locale.ENGLISH)).collect(Collectors.toSet());
/*    */   } @Nullable
/*    */   public static BufferedImage loadImage(@NotNull URI uri) throws IOException {
/* 55 */     String scheme = uri.getScheme();
/* 56 */     if ("data".equals(scheme)) {
/* 57 */       DataUri dataUri = DataUri.parse(uri.toString(), StandardCharsets.UTF_8);
/* 58 */       if (!isSupportedMimeType(dataUri.mime())) throw new IOException("Unsupported Mime type " + dataUri.mime()); 
/* 59 */       ByteArrayInputStream in = new ByteArrayInputStream(dataUri.data()); 
/* 60 */       try { BufferedImage bufferedImage = readPossiblyCorruptedFile(in);
/* 61 */         in.close(); return bufferedImage; } catch (Throwable throwable) { try { in.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }
/*    */     
/* 63 */     }  return ImageIO.read(uri.toURL());
/*    */   }
/*    */   
/*    */   private static boolean isSupportedMimeType(@NotNull String mimeType) {
/* 67 */     return SUPPORTED_MIME_TYPES.contains(mimeType.toLowerCase(Locale.ENGLISH));
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   private static BufferedImage readPossiblyCorruptedFile(@NotNull InputStream inputStream) throws IOException {
/* 72 */     ImageInputStream input = ImageIO.createImageInputStream(inputStream);
/* 73 */     Iterator<ImageReader> readers = ImageIO.getImageReaders(input);
/* 74 */     if (!readers.hasNext()) return null;
/*    */     
/* 76 */     ImageReader reader = readers.next();
/* 77 */     reader.setInput(input);
/*    */ 
/*    */     
/* 80 */     ImageReadParam param = reader.getDefaultReadParam();
/*    */     
/* 82 */     BufferedImage image = ((ImageTypeSpecifier)reader.getImageTypes(0).next()).createBufferedImage(reader.getWidth(0), reader.getHeight(0));
/* 83 */     param.setDestination(image);
/*    */     
/*    */     try {
/* 86 */       image = reader.read(0, param);
/*    */     }
/* 88 */     catch (Exception e) {
/*    */       
/* 90 */       LOGGER.log(Level.SEVERE, e.getMessage(), e);
/*    */     } 
/* 92 */     return image;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsv\\util\ResourceUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */