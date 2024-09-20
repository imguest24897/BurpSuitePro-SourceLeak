/*     */ package com.install4j.api;
/*     */ 
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.installer.helper.Install4jClassLoader;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.LoggerImpl;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchIntAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import com.install4j.runtime.installer.helper.content.ContentInstaller;
/*     */ import com.install4j.runtime.installer.platform.UserInfo;
/*     */ import java.awt.Window;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.net.URL;
/*     */ import java.util.Objects;
/*     */ import org.jetbrains.annotations.Nls;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Util
/*     */ {
/*     */   public static String getUserHome() {
/*  42 */     String userHome = InstallerVariables.getStringVariable("sys.userHome");
/*  43 */     if (userHome == null) {
/*  44 */       return System.getProperty("user.home");
/*     */     }
/*  46 */     return userHome;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isSolaris() {
/*  56 */     return InstallerUtil.isSolaris();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isLinux() {
/*  65 */     return InstallerUtil.isLinux();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isWindows() {
/*  74 */     return InstallerUtil.isWindows();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static boolean isWindows9X() {
/*  85 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static boolean isWindowsNT() {
/*  95 */     return InstallerUtil.isWindowsNT();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isAtLeastWindowsVista() {
/* 104 */     return InstallerUtil.isAtLeastWindowsVista();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isAtLeastWindows7() {
/* 113 */     return InstallerUtil.isAtLeastWindows7();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static boolean isAtLeastWindowsXP() {
/* 123 */     return isWindows();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isWindowsVista() {
/* 132 */     return InstallerUtil.isWindowsVista();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isWindows7() {
/* 141 */     return InstallerUtil.isWindows7();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isWindows8() {
/* 150 */     return InstallerUtil.isWindows8();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isWindows10() {
/* 159 */     return InstallerUtil.isWindows10();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isAtLeastWindows10() {
/* 168 */     return InstallerUtil.isAtLeastWindows10();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isWindowsXP() {
/* 177 */     return InstallerUtil.isWindowsXP();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isWindows2000() {
/* 186 */     return InstallerUtil.isWindows2000();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isWindows2003() {
/* 195 */     return InstallerUtil.isWindows2003();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isWindows2008() {
/* 204 */     return InstallerUtil.isWindows2008();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isWindows2012() {
/* 213 */     return InstallerUtil.isWindows2012();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isWindows2016() {
/* 222 */     return InstallerUtil.isWindows2016();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean is64BitWindows() {
/* 238 */     return (isWindows() && (!InstallerUtil.is32BitJVM() || InstallerUtil.is64BitWindows()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isMacOS() {
/* 247 */     return InstallerUtil.isMacOS();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isHpux() {
/* 256 */     return InstallerUtil.isHpux();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isAix() {
/* 265 */     return InstallerUtil.isAix();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isWindowsInstaller() {
/* 274 */     return Objects.equals(InstallerUtil.getInstallerType(), "windows");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isUnixInstaller() {
/* 283 */     return Objects.equals(InstallerUtil.getInstallerType(), "unix");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isMacosInstaller() {
/* 292 */     return Objects.equals(InstallerUtil.getInstallerType(), "macos");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getStandardApplicationsDirectory() {
/* 301 */     return InstallerUtil.getStandardApplicationsDirectory(false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isArchive() {
/* 310 */     return InstallerUtil.isArchive();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void showUrl(final URL url) {
/* 325 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 328 */             GUIHelper.showURL(url.toExternalForm());
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void showMessage(@Nls final String message, final int messageType) {
/* 342 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 345 */             GUIHelper.showMessage(null, message, messageType);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void showMessage(@Nls String message) {
/* 374 */     showMessage(message, 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void showErrorMessage(@Nls String message) {
/* 388 */     showMessage(message, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void showWarningMessage(@Nls String message) {
/* 402 */     showMessage(message, 2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int showOptionDialog(@Nls final String message, @Nls final String[] options, final int messageType) throws UserCanceledException {
/*     */     try {
/* 423 */       return HelperCommunication.getInstance().fetchIntChecked(ExecutionContext.UNELEVATED, new FetchIntAction()
/*     */           {
/*     */             protected int fetchValue(Context context) throws UserCanceledException {
/* 426 */               return GUIHelper.showOptionDialog(null, message, null, options, messageType);
/*     */             }
/*     */           });
/* 429 */     } catch (IOException e) {
/* 430 */       throw new RuntimeException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void fatalError(final Throwable t) {
/*     */     try {
/* 444 */       HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */           {
/*     */             protected void run(Context context) throws Exception {
/* 447 */               InstallerUtil.reportException(t);
/* 448 */               InstallerUtil.exit(1);
/*     */             }
/*     */           });
/* 451 */     } catch (Throwable throwable) {
/* 452 */       throwable.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static Window getParentWindow() {
/* 462 */     return UiUtil.getParentWindow();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void logInfo(Object source, String message) {
/* 474 */     Logger.getInstance().info(source, message);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void logError(Object source, String message) {
/* 486 */     Logger.getInstance().error(source, message);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void log(Throwable t) {
/* 495 */     Logger.getInstance().log(t);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void dumpVariables(Context context) {
/* 506 */     System.err.println();
/* 507 */     System.err.println("Defined installer variables:");
/* 508 */     System.err.println("----------------------------");
/* 509 */     for (String variableName : context.getVariableNames()) {
/* 510 */       Object value = context.getVariable(variableName);
/* 511 */       System.err.println(InstallerUtil.getVerboseVariableDefinition(variableName, value));
/*     */     } 
/* 513 */     System.err.println("----------------------------");
/* 514 */     System.err.println();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static boolean isAdminUser() {
/* 530 */     return UserInfo.isAdminUser();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isAdminGroup() {
/* 544 */     return UserInfo.isAdminGroup();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean hasFullAdminRights() {
/* 557 */     return UserInfo.hasFullAdminRights();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getAnnotatedStackTrace(Throwable t) {
/* 569 */     return InstallerUtil.getAnnotatedStackTrace(t);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void printAnnotatedStackTrace(Throwable t) {
/* 579 */     System.err.print(getAnnotatedStackTrace(t));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void showPath(final String path) {
/* 588 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 591 */             GUIHelper.showPath(path);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isDirectoryWritable(final File directory) {
/* 603 */     return HelperCommunication.getInstance().fetchBoolean(ContentInstaller.getExecutionContext(), new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws UserCanceledException {
/* 606 */             return InstallerUtil.checkWritable(directory);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static File getLogFile() {
/* 621 */     return (File)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<File>()
/*     */         {
/*     */           protected File fetchValue(Context context) {
/* 624 */             return ((LoggerImpl)LoggerImpl.getInstance()).getLogFile();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void moveLogFile(final File newLogFile) {
/* 636 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) throws Exception {
/* 639 */             ((LoggerImpl)LoggerImpl.getInstance()).moveLogFile(newLogFile, true);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void loadNativeFromResources(String fileName) {
/* 656 */     String absoluteFileName = InstallerVariables.getStringVariable("sys.resourceDir") + File.separator + fileName;
/*     */     try {
/* 658 */       Install4jClassLoader.invokeInCustomClassLoader(System.class.getMethod("load", new Class[] { String.class }), null, new Object[] { absoluteFileName });
/* 659 */     } catch (Throwable t) {
/* 660 */       throw new RuntimeException(t);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\Util.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */