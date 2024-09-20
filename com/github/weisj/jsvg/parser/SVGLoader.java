/*    */ package com.github.weisj.jsvg.parser;
/*    */ 
/*    */ import com.github.weisj.jsvg.SVGDocument;
/*    */ import java.io.BufferedInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.net.URL;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ import java.util.zip.GZIPInputStream;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class SVGLoader
/*    */ {
/* 41 */   static final Logger LOGGER = Logger.getLogger(SVGLoader.class.getName()); @NotNull
/* 42 */   private static final NodeSupplier NODE_SUPPLIER = new NodeSupplier();
/* 43 */   private final StaxSVGLoader loader = new StaxSVGLoader(NODE_SUPPLIER);
/*    */   @Nullable
/*    */   public SVGDocument load(@NotNull URL xmlBase) {
/* 46 */     return load(xmlBase, new DefaultParserProvider());
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public SVGDocument load(@NotNull URL xmlBase, @NotNull ParserProvider parserProvider) {
/*    */     try {
/* 52 */       return load(xmlBase.openStream(), parserProvider);
/* 53 */     } catch (IOException e) {
/* 54 */       LOGGER.log(Level.WARNING, "Could not read " + xmlBase, e);
/*    */       
/* 56 */       return null;
/*    */     } 
/*    */   } @Nullable
/*    */   public SVGDocument load(@NotNull InputStream inputStream) {
/* 60 */     return load(inputStream, new DefaultParserProvider());
/*    */   }
/*    */   @Nullable
/*    */   public SVGDocument load(@NotNull InputStream inputStream, @NotNull ParserProvider parserProvider) {
/* 64 */     return load(inputStream, parserProvider, new SynchronousResourceLoader());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public SVGDocument load(@NotNull InputStream inputStream, @NotNull ParserProvider parserProvider, @NotNull ResourceLoader resourceLoader) {
/*    */     try {
/* 72 */       return this.loader.load(createDocumentInputStream(inputStream), parserProvider, resourceLoader);
/* 73 */     } catch (Throwable e) {
/* 74 */       LOGGER.log(Level.WARNING, "Could not load SVG ", e);
/*    */       
/* 76 */       return null;
/*    */     } 
/*    */   } @Nullable
/*    */   private InputStream createDocumentInputStream(@NotNull InputStream is) {
/*    */     try {
/* 81 */       BufferedInputStream bin = new BufferedInputStream(is);
/* 82 */       bin.mark(2);
/* 83 */       int b0 = bin.read();
/* 84 */       int b1 = bin.read();
/* 85 */       bin.reset();
/*    */ 
/*    */       
/* 88 */       if ((b1 << 8 | b0) == 35615) {
/* 89 */         return new GZIPInputStream(bin);
/*    */       }
/*    */       
/* 92 */       return bin;
/*    */     }
/* 94 */     catch (IOException e) {
/* 95 */       LOGGER.log(Level.SEVERE, e.getMessage(), e);
/*    */       
/* 97 */       return null;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\SVGLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */