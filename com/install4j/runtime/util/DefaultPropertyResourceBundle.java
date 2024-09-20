/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.IOException;
/*    */ import java.util.PropertyResourceBundle;
/*    */ import java.util.ResourceBundle;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class DefaultPropertyResourceBundle
/*    */   extends PropertyResourceBundle {
/*    */   public static final String EXTENSION_PROPERTIES = "properties";
/*    */   
/*    */   public static DefaultPropertyResourceBundle create(File file, ResourceBundle parent) throws IOException {
/* 15 */     FileInputStream in = new FileInputStream(file); 
/* 16 */     try { DefaultPropertyResourceBundle defaultPropertyResourceBundle = new DefaultPropertyResourceBundle(in, parent);
/* 17 */       in.close(); return defaultPropertyResourceBundle; }
/*    */     catch (Throwable throwable) { try { in.close(); }
/*    */       catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }
/*    */        throw throwable; }
/* 21 */      } private DefaultPropertyResourceBundle(FileInputStream in, ResourceBundle parent) throws IOException { super(in);
/* 22 */     setParent(parent); }
/*    */ 
/*    */ 
/*    */   
/*    */   public Object handleGetObject(@NotNull String key) {
/* 27 */     if (key.startsWith(".")) {
/* 28 */       String keyWithoutLeadingDot = key.substring(1);
/* 29 */       Object o = super.handleGetObject(keyWithoutLeadingDot);
/* 30 */       if (o != null) {
/* 31 */         return o;
/*    */       }
/*    */     } 
/* 34 */     return super.handleGetObject(key);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\DefaultPropertyResourceBundle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */