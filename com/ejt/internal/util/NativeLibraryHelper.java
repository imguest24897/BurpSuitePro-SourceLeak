/*    */ package com.ejt.internal.util;
/*    */ 
/*    */ import java.io.File;
/*    */ 
/*    */ 
/*    */ public class NativeLibraryHelper
/*    */ {
/*    */   public static final String SYSPROP_NO_NATIVE_LIBS = "ejt.noNativeLibs";
/*    */   public static File nativeLibDirectory;
/*    */   public static LibraryLoader libraryLoader;
/*    */   private static boolean librariesLoaded = false;
/*    */   
/*    */   public static void setLibraryLoader(LibraryLoader libraryLoader) {
/* 14 */     NativeLibraryHelper.libraryLoader = libraryLoader;
/*    */   }
/*    */   
/*    */   public static void setNativeLibDirectory(File nativeLibDirectory) {
/* 18 */     NativeLibraryHelper.nativeLibDirectory = nativeLibDirectory;
/*    */   }
/*    */   
/*    */   public static File getNativeLibDirectory() {
/* 22 */     return nativeLibDirectory;
/*    */   }
/*    */   
/*    */   public static synchronized void loadLibraries() {
/* 26 */     if (libraryLoader != null && !librariesLoaded) {
/* 27 */       libraryLoader.loadLibraries();
/* 28 */       librariesLoaded = true;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static interface LibraryLoader {
/*    */     void loadLibraries();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\interna\\util\NativeLibraryHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */