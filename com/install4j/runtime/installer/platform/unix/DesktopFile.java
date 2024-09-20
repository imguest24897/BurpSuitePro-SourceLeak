/*    */ package com.install4j.runtime.installer.platform.unix;
/*    */ 
/*    */ import java.io.PrintWriter;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ public class DesktopFile
/*    */   extends UnixConfigFile
/*    */ {
/*    */   private static final String GROUP_NAME_MAIN = "Desktop Entry";
/*    */   public static final String STARTUP_WM_CLASS = "StartupWMClass";
/*    */   public static final String MIME_TYPE = "MimeType";
/*    */   public static final String TYPE = "Type";
/*    */   public static final String APPLICATION = "Application";
/*    */   public static final String NAME = "Name";
/*    */   public static final String EXEC = "Exec";
/*    */   public static final String COMMENT = "Comment";
/*    */   public static final String ICON = "Icon";
/*    */   public static final String CATEGORIES = "Categories";
/*    */   
/*    */   public DesktopFile() {
/* 22 */     getMainGroup();
/*    */   }
/*    */   
/*    */   public DesktopFile(@NotNull String name, @NotNull String exec) {
/* 26 */     this();
/* 27 */     addToMain("Type", "Application");
/* 28 */     addToMain("Name", name);
/* 29 */     addToMain("Exec", exec);
/*    */   }
/*    */   
/*    */   public void addToMain(@NotNull String key, @Nullable String value) {
/* 33 */     add("Desktop Entry", key, value);
/*    */   }
/*    */ 
/*    */   
/*    */   public void print(PrintWriter pw) {
/* 38 */     pw.println("#!/usr/bin/env xdg-open");
/* 39 */     super.print(pw);
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   protected UnixConfigFile.Group getMainGroup() {
/* 45 */     return getOrAddGroup("Desktop Entry");
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean isUniqueKeys() {
/* 50 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platfor\\unix\DesktopFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */