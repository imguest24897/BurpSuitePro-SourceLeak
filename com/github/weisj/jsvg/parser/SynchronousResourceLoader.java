/*    */ package com.github.weisj.jsvg.parser;
/*    */ 
/*    */ import com.github.weisj.jsvg.util.ResourceUtil;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.io.IOException;
/*    */ import java.net.URI;
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
/*    */ public final class SynchronousResourceLoader
/*    */   implements ResourceLoader
/*    */ {
/*    */   @NotNull
/*    */   public UIFuture<BufferedImage> loadImage(@NotNull URI uri) throws IOException {
/* 35 */     return new ValueUIFuture<>(ResourceUtil.loadImage(uri));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\SynchronousResourceLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */