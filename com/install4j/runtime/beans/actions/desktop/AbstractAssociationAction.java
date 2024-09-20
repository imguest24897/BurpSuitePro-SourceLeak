/*     */ package com.install4j.runtime.beans.actions.desktop;
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.config.LauncherConfig;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.MenuHelper;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintWriter;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ public abstract class AbstractAssociationAction extends SystemAutoUninstallInstallAction {
/*  20 */   private static final Map<File, UnixAssociationInfo> executableToUnixAssociationInfo = new HashMap<>();
/*     */   
/*     */   protected static final String PROP_EXECUTABLE = "executable";
/*     */   
/*  24 */   private String launcherId = "";
/*     */   
/*     */   public String getLauncherId() {
/*  27 */     return replaceVariables(this.launcherId);
/*     */   }
/*     */   
/*     */   public void setLauncherId(String launcherId) {
/*  31 */     this.launcherId = launcherId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollback(InstallerContext context) {
/*  36 */     super.rollback(context);
/*  37 */     if (InstallerUtil.isWindows()) {
/*  38 */       Registry.changeNotifyAssociations();
/*     */     }
/*     */   }
/*     */   
/*     */   protected File getExecutableFile(Context context) {
/*  43 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/*     */     
/*  45 */     LauncherConfig launcher = config.getLauncherConfigById(getLauncherId());
/*  46 */     if (launcher == null) {
/*  47 */       return null;
/*     */     }
/*  49 */     return context.getDestinationFile(launcher.getFile());
/*     */   }
/*     */   
/*     */   protected static File getBundleDir(Context context, String launcherId) {
/*  53 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/*     */     
/*  55 */     File bundleDir = null;
/*  56 */     if (config.getMacSpecificConfig().isSingleBundle()) {
/*  57 */       bundleDir = context.getDestinationFile(config.getMacSpecificConfig().getSingleBundleName());
/*     */     } else {
/*  59 */       LauncherConfig launcher = config.getLauncherConfigById(launcherId);
/*  60 */       if (launcher != null) {
/*  61 */         bundleDir = context.getDestinationFile(launcher.getFile());
/*     */       }
/*     */     } 
/*  64 */     return bundleDir;
/*     */   }
/*     */   
/*     */   protected static boolean addMimeTypeToDesktopFile(File desktopFile, String mimeType) throws IOException {
/*  68 */     String[] lines = FileUtil.readTextFile(desktopFile, "UTF-8").split("\\r?\\n");
/*  69 */     boolean found = false;
/*  70 */     int execLine = -1;
/*  71 */     for (int i = 0; i < lines.length && !found; i++) {
/*  72 */       if (lines[i].startsWith("MimeType=")) {
/*  73 */         if (!lines[i].contains(mimeType)) {
/*  74 */           if (!lines[i].endsWith(";")) {
/*  75 */             lines[i] = lines[i] + ";";
/*     */           }
/*  77 */           lines[i] = lines[i] + mimeType + ";";
/*  78 */           found = true;
/*     */         } 
/*  80 */       } else if (execLine == -1 && lines[i].startsWith("Exec=")) {
/*  81 */         execLine = i;
/*     */       } 
/*     */     } 
/*  84 */     if (!found) {
/*  85 */       if (execLine == -1) {
/*  86 */         Logger.getInstance().error(null, "did not find Exec entry in " + desktopFile);
/*  87 */         return false;
/*     */       } 
/*  89 */       List<String> newLines = new ArrayList<>(Arrays.asList(lines));
/*  90 */       newLines.add(execLine + 1, "MimeType=" + mimeType + ";");
/*  91 */       lines = newLines.<String>toArray(new String[0]);
/*     */     } 
/*     */ 
/*     */     
/*  95 */     PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(desktopFile), StandardCharsets.UTF_8)); 
/*  96 */     try { for (String line : lines) {
/*  97 */         pw.println(line);
/*     */       }
/*  99 */       pw.close(); } catch (Throwable throwable) { try { pw.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }
/* 100 */      MenuHelper.installDesktopFile(desktopFile);
/* 101 */     MenuHelper.execute("xdg-mime", new String[] { "default", desktopFile.getName(), mimeType });
/* 102 */     return true;
/*     */   }
/*     */   
/*     */   public static void registerDesktopFile(File executableFile, File desktopFile) throws IOException, UserCanceledException {
/* 106 */     getUnixAssociationInfo(executableFile).registerDesktopFile(desktopFile);
/*     */   }
/*     */   
/*     */   protected static UnixAssociationInfo getUnixAssociationInfo(File executableFile) {
/* 110 */     executableFile = FileUtil.getCanonicalFile(executableFile);
/* 111 */     UnixAssociationInfo ret = executableToUnixAssociationInfo.get(executableFile);
/* 112 */     if (ret == null) {
/* 113 */       ret = new UnixAssociationInfo();
/* 114 */       executableToUnixAssociationInfo.put(executableFile, ret);
/*     */     } 
/* 116 */     return ret;
/*     */   }
/*     */   
/*     */   public static void logUnhandledUnixAssociations() {
/* 120 */     for (Map.Entry<File, UnixAssociationInfo> entry : executableToUnixAssociationInfo.entrySet()) {
/* 121 */       for (HandlerState handlerState : (entry.getValue()).actions.values()) {
/* 122 */         if (!handlerState.executedAtLeastOnce)
/* 123 */           Logger.getInstance().error(null, "A file association or url handler for " + entry.getKey() + " was not registered because no desktop file was created with a 'Create program group' or 'Create start menu entry' action."); 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected static interface DesktopFileHandler
/*     */   {
/*     */     void handle(File param1File) throws IOException, UserCanceledException;
/*     */   }
/*     */   
/*     */   private static class HandlerState {
/*     */     private final AbstractAssociationAction.DesktopFileHandler handler;
/*     */     private volatile boolean executedAtLeastOnce;
/*     */     
/*     */     public HandlerState(AbstractAssociationAction.DesktopFileHandler handler, boolean executedAtLeastOnce) {
/* 138 */       this.handler = handler;
/* 139 */       this.executedAtLeastOnce = executedAtLeastOnce;
/*     */     }
/*     */   }
/*     */   
/*     */   static class UnixAssociationInfo {
/* 144 */     private final Set<File> desktopFiles = new HashSet<>();
/* 145 */     private final Map<AbstractAssociationAction, AbstractAssociationAction.HandlerState> actions = new IdentityHashMap<>();
/*     */     
/*     */     public void registerDesktopFile(File desktopFile) throws IOException, UserCanceledException {
/* 148 */       for (AbstractAssociationAction.HandlerState handlerState : this.actions.values()) {
/* 149 */         handlerState.executedAtLeastOnce = true;
/* 150 */         handlerState.handler.handle(desktopFile);
/*     */       } 
/* 152 */       this.desktopFiles.add(desktopFile);
/*     */     }
/*     */     
/*     */     public void addAction(AbstractAssociationAction associationAction, boolean executedAtLeastOnce, AbstractAssociationAction.DesktopFileHandler desktopFileHandler) {
/* 156 */       this.actions.put(associationAction, new AbstractAssociationAction.HandlerState(desktopFileHandler, executedAtLeastOnce));
/*     */     }
/*     */     
/*     */     public Set<File> getDesktopFiles() {
/* 160 */       return this.desktopFiles;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\desktop\AbstractAssociationAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */