/*    */ package com.install4j.runtime.filechooser;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.runtime.alert.Alert;
/*    */ import com.install4j.runtime.util.I4jLibraryHelper;
/*    */ import java.io.File;
/*    */ import java.util.Collection;
/*    */ import java.util.Collections;
/*    */ 
/*    */ public abstract class DirectoryChooser
/*    */   extends AbstractFileSystemChooser<DirectoryChooser> {
/*    */   protected boolean allowFilesOnMac;
/*    */   
/*    */   public static DirectoryChooser create() {
/* 15 */     if (Alert.isNoNativeDialogs())
/* 16 */       return new SwingDirectoryChooser(); 
/* 17 */     if (Util.isMacOS())
/* 18 */       return new MacosDirectoryChooser(); 
/* 19 */     if (Util.isAtLeastWindowsVista() && I4jLibraryHelper.isI4jLibraryAvailable()) {
/* 20 */       return new WindowsDirectoryChooser();
/*    */     }
/* 22 */     return new SwingDirectoryChooser();
/*    */   }
/*    */ 
/*    */   
/*    */   protected abstract File getSelectedDirectoryInternal();
/*    */   
/*    */   public DirectoryChooser allowFilesOnMac(boolean allowFilesOnMac) {
/* 29 */     this.allowFilesOnMac = allowFilesOnMac;
/* 30 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Collection<File> getAllFiles() {
/* 35 */     return Collections.singleton(getSelectedDirectory());
/*    */   }
/*    */ 
/*    */   
/*    */   public File getSelectedFile() {
/* 40 */     return getSelectedDirectory();
/*    */   }
/*    */   
/*    */   public File getSelectedDirectory() {
/* 44 */     checkSelected();
/* 45 */     return getSelectedDirectoryInternal();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\DirectoryChooser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */