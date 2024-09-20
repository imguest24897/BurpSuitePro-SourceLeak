/*    */ package META-INF.versions.9.com.formdev.flatlaf.util;
/*    */ 
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Image;
/*    */ import java.awt.image.BaseMultiResolutionImage;
/*    */ import java.awt.image.MultiResolutionImage;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import java.util.function.Function;
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
/*    */ public class MultiResolutionImageSupport
/*    */ {
/*    */   public static boolean isAvailable() {
/* 50 */     return true;
/*    */   }
/*    */   
/*    */   public static boolean isMultiResolutionImage(Image image) {
/* 54 */     return image instanceof MultiResolutionImage;
/*    */   }
/*    */   
/*    */   public static Image create(int baseImageIndex, Image... resolutionVariants) {
/* 58 */     return new BaseMultiResolutionImage(baseImageIndex, resolutionVariants);
/*    */   }
/*    */   
/*    */   public static Image create(int baseImageIndex, Dimension[] dimensions, Function<Dimension, Image> producer) {
/* 62 */     return (Image)new ProducerMultiResolutionImage(dimensions, producer);
/*    */   }
/*    */   
/*    */   public static Image map(Image image, Function<Image, Image> mapper) {
/* 66 */     return (image instanceof MultiResolutionImage) ? 
/* 67 */       (Image)new MappedMultiResolutionImage(image, mapper) : 
/* 68 */       mapper.apply(image);
/*    */   }
/*    */   
/*    */   public static Image getResolutionVariant(Image image, int destImageWidth, int destImageHeight) {
/* 72 */     return (image instanceof MultiResolutionImage) ? (
/* 73 */       (MultiResolutionImage)image).getResolutionVariant(destImageWidth, destImageHeight) : 
/* 74 */       image;
/*    */   }
/*    */   
/*    */   public static List<Image> getResolutionVariants(Image image) {
/* 78 */     return (image instanceof MultiResolutionImage) ? (
/* 79 */       (MultiResolutionImage)image).getResolutionVariants() : 
/* 80 */       Collections.<Image>singletonList(image);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\com\formdev\flatla\\util\MultiResolutionImageSupport.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */