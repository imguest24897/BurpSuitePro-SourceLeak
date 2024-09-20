/*    */ package com.github.weisj.jsvg.nodes.filter;
/*    */ 
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Image;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.awt.image.ImageFilter;
/*    */ import java.awt.image.ImageProducer;
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
/*    */ public interface Channel
/*    */ {
/*    */   @NotNull
/*    */   ImageProducer producer();
/*    */   
/*    */   @NotNull
/*    */   default Image toImage(@NotNull RenderContext context) {
/* 39 */     return context.createImage(producer());
/*    */   }
/*    */   @NotNull
/*    */   default BufferedImage toBufferedImageNonAliased(@NotNull RenderContext context) {
/* 43 */     return makeNonAliased(toImage(context));
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   static BufferedImage makeNonAliased(@NotNull Image img) {
/* 49 */     BufferedImage bufferedImage = new BufferedImage(img.getWidth(null), img.getHeight(null), 2);
/*    */     
/* 51 */     Graphics imageGraphics = bufferedImage.getGraphics();
/* 52 */     imageGraphics.drawImage(img, 0, 0, null);
/* 53 */     imageGraphics.dispose();
/* 54 */     return bufferedImage;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   Channel applyFilter(@NotNull ImageFilter paramImageFilter);
/*    */   
/*    */   @NotNull
/*    */   PixelProvider pixels(@NotNull RenderContext paramRenderContext);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\Channel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */