/*    */ package com.github.weisj.jsvg.parser;
/*    */ 
/*    */ import com.github.weisj.jsvg.util.ResourceUtil;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.io.IOException;
/*    */ import java.net.URI;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ 
/*    */ public final class AsynchronousResourceLoader
/*    */   implements ResourceLoader
/*    */ {
/* 36 */   private static final Logger LOGGER = Logger.getLogger(AsynchronousResourceLoader.class.getName());
/*    */   
/*    */   @NotNull
/*    */   public UIFuture<BufferedImage> loadImage(@NotNull URI uri) {
/* 40 */     return new SwingUIFuture<>(() -> {
/*    */           try {
/*    */             return ResourceUtil.loadImage(uri);
/* 43 */           } catch (IOException e) {
/*    */             LOGGER.log(Level.SEVERE, e.getMessage(), e);
/*    */             return null;
/*    */           } 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\AsynchronousResourceLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */