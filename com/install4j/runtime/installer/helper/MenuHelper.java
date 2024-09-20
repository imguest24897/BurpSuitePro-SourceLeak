/*     */ package com.install4j.runtime.installer.helper;
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.FileOptions;
/*     */ import com.install4j.api.context.LauncherSetup;
/*     */ import com.install4j.api.context.OverwriteMode;
/*     */ import com.install4j.api.context.UninstallMode;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.unix.UnixFileSystem;
/*     */ import com.install4j.runtime.beans.actions.desktop.AbstractAssociationAction;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchDescriptor;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchHelper;
/*     */ import com.install4j.runtime.installer.helper.launching.OutputRedirection;
/*     */ import com.install4j.runtime.installer.platform.unix.DesktopFile;
/*     */ import com.install4j.runtime.installer.platform.win32.ShellLink;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.io.PrintWriter;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Arrays;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.zip.CRC32;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ public class MenuHelper {
/*     */   public static final String DESKTOP_SUFFIX = ".desktop";
/*     */   public static final String XDG_DESKTOP_MENU = "xdg-desktop-menu";
/*     */   public static final String COMMAND_INSTALL = "install";
/*     */   public static final String COMMAND_UNINSTALL = "uninstall";
/*     */   
/*     */   public static void installWindowsMenu(ExecutionContext executionContext, File menuFile, File shortcutTo, File iconFile) throws IOException, UserCanceledException {
/*  48 */     installWindowsMenu(executionContext, menuFile, shortcutTo, iconFile, null, false, null);
/*     */   } public static final String MODE_PARAMETER = "--mode"; public static final String MODE_SYSTEM = "system"; public static final String MODE_USER = "user"; public static final String VARNAME_TOP_LEVEL_DESKTOP_FILES = "topLevelDesktopFiles"; public static final boolean DEFAULT_TOP_LEVEL_DESKTOP_FILES = true;
/*     */   public static void installWindowsMenu(ExecutionContext executionContext, File menuFile, File shortcutTo, File iconFile, String arguments, boolean runAsAdministrator, String description) throws IOException, UserCanceledException {
/*  51 */     installWindowsMenu(executionContext, menuFile, shortcutTo, iconFile, arguments, runAsAdministrator, description, null);
/*     */   }
/*     */   
/*     */   public static void installWindowsMenu(ExecutionContext executionContext, final File menuFile, final File shortcutTo, final File iconFile, final String arguments, final boolean runAsAdministrator, final String description, final File startIn) throws IOException, UserCanceledException {
/*  55 */     HelperCommunication.getInstance().executeActionChecked(executionContext, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) throws Exception {
/*  58 */             MenuHelper.createWindowsMenuInt(menuFile, shortcutTo, iconFile, arguments, runAsAdministrator, description, startIn);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private static void createWindowsMenuInt(File menuFile, File shortcutTo, File iconFile, String arguments, boolean runAsAdministrator, String description, File startIn) throws IOException, UserCanceledException {
/*  64 */     if (!shortcutTo.exists()) {
/*     */       return;
/*     */     }
/*     */     
/*  68 */     if (arguments != null && arguments.trim().length() == 0) {
/*  69 */       arguments = null;
/*     */     }
/*     */ 
/*     */     
/*  73 */     if (shortcutTo.getName().endsWith(".url")) {
/*  74 */       File urlFile = new File(menuFile.getAbsolutePath() + ".url");
/*  75 */       if (iconFile != null) {
/*  76 */         File tempUrlFile = File.createTempFile("i4j", ".url");
/*  77 */         if (FileUtil.copyFile(shortcutTo, tempUrlFile)) {
/*     */           
/*  79 */           BufferedWriter out = new BufferedWriter(new FileWriter(tempUrlFile, true)); 
/*  80 */           try { out.newLine();
/*  81 */             out.write("IconIndex=0");
/*  82 */             out.newLine();
/*  83 */             out.write("IconFile=" + iconFile);
/*  84 */             out.close(); } catch (Throwable throwable) { try { out.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }
/*  85 */            FileInstaller.getInstance().install(tempUrlFile, urlFile, new FileOptions(shortcutTo.lastModified(), "644", OverwriteMode.ALWAYS, false, UninstallMode.ALWAYS));
/*     */         } 
/*  87 */         tempUrlFile.delete();
/*     */       } else {
/*  89 */         FileInstaller.getInstance().install(shortcutTo, urlFile, new FileOptions(shortcutTo.lastModified(), "644", OverwriteMode.ALWAYS, false, UninstallMode.ALWAYS));
/*     */       } 
/*     */       
/*  92 */       ShellLink.changeNotify(urlFile);
/*     */     } else {
/*  94 */       File lnkFile = new File(menuFile.getAbsolutePath() + ".lnk");
/*  95 */       File pifFile = new File(menuFile.getAbsolutePath() + ".pif");
/*     */       
/*  97 */       File tempLnkFile = File.createTempFile("i4j", ".lnk");
/*  98 */       File tempPifFile = new File(tempLnkFile.getAbsolutePath().substring(0, tempLnkFile.getAbsolutePath().length() - 3) + "pif");
/*     */       
/* 100 */       ShellLink.create(tempLnkFile, shortcutTo, iconFile, arguments, runAsAdministrator, description, startIn, 1);
/*     */ 
/*     */       
/* 103 */       if (tempLnkFile.exists()) {
/* 104 */         FileInstaller.getInstance().install(tempLnkFile, lnkFile, new FileOptions(tempLnkFile.lastModified(), "644", OverwriteMode.ALWAYS, false, UninstallMode.ALWAYS));
/* 105 */         pifFile.delete();
/* 106 */       } else if (tempPifFile.exists()) {
/* 107 */         FileInstaller.getInstance().install(tempPifFile, pifFile, new FileOptions(tempPifFile.lastModified(), "644", OverwriteMode.ALWAYS, false, UninstallMode.ALWAYS));
/* 108 */         lnkFile.delete();
/*     */       } 
/*     */       
/* 111 */       tempLnkFile.delete();
/* 112 */       tempPifFile.delete();
/*     */       
/* 114 */       ShellLink.changeNotify(lnkFile);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static File installUnixDesktopFile(File installationDir, File destinationDirectory, String fileName, File execFile, String name, String categories, String arguments, File iconFile, String description, List<String> additionalEntries) throws IOException, UserCanceledException {
/* 119 */     if (execFile == null || !execFile.exists()) {
/* 120 */       return null;
/*     */     }
/*     */     
/* 123 */     DesktopFile desktopFile = new DesktopFile(name, getDesktopExecutable(execFile) + ((arguments == null) ? "" : (" " + arguments)) + " %U");
/*     */     
/* 125 */     if (description != null && !description.isEmpty()) {
/* 126 */       desktopFile.addToMain("Comment", description);
/*     */     }
/* 128 */     if (iconFile == null) {
/* 129 */       iconFile = new File(installationDir, ".install4j/" + execFile.getName() + ".png");
/*     */     }
/* 131 */     if (iconFile.exists()) {
/* 132 */       desktopFile.addToMain("Icon", iconFile.getAbsolutePath());
/*     */     }
/* 134 */     if (categories != null) {
/* 135 */       desktopFile.addToMain("Categories", categories + (!categories.trim().endsWith(";") ? ";" : ""));
/*     */     }
/* 137 */     desktopFile.addContent(additionalEntries);
/*     */     
/* 139 */     File file = new File(destinationDirectory, fileName + ".desktop");
/* 140 */     File tempFile = File.createTempFile("i4j", null);
/* 141 */     PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(tempFile), StandardCharsets.UTF_8)); 
/* 142 */     try { desktopFile.print(pw);
/* 143 */       pw.close(); } catch (Throwable throwable) { try { pw.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }
/* 144 */      FileInstaller.getInstance().install(tempFile, file, new FileOptions((new Date()).getTime(), "755", OverwriteMode.ALWAYS, false, UninstallMode.ALWAYS));
/* 145 */     tempFile.delete();
/*     */     
/* 147 */     return file;
/*     */   }
/*     */   
/*     */   private static String getDesktopExecutable(File execFile) throws IOException {
/* 151 */     String posixFilePermissions = FileAttributesHelper.getPosixFilePermissions(execFile);
/* 152 */     StringBuilder buffer = new StringBuilder();
/* 153 */     if (posixFilePermissions.length() < 9 || posixFilePermissions.charAt(2) != 'x') {
/* 154 */       buffer.append("/bin/sh ");
/*     */     }
/* 156 */     buffer.append('"').append(execFile.getAbsolutePath()).append('"');
/* 157 */     return buffer.toString();
/*     */   }
/*     */   
/*     */   public static void installUnixMenu(File installationDirectory, File execFile, String name, String categories, String arguments, File iconFile, String description, List<String> additionalEntries, boolean excludeUninstallerFromMenu) throws IOException, UserCanceledException {
/* 161 */     File desktopFile = installUnixDesktopFile(installationDirectory, new File(installationDirectory, ".install4j"), getRelativeDesktopFileName(FileUtil.getCanonicalPath(installationDirectory), execFile.getName()), execFile, name, categories, arguments, iconFile, description, additionalEntries);
/* 162 */     if (desktopFile != null) {
/* 163 */       if (CompilerVariableHelper.getCompilerExtensionVariable((Context)ContextImpl.getSingleContextInt(), "topLevelDesktopFiles", true)) {
/* 164 */         File topLevelDesktopFile = new File(installationDirectory, name + ".desktop");
/* 165 */         topLevelDesktopFile.delete();
/* 166 */         UnixFileSystem.createLink(".install4j/" + desktopFile.getName(), topLevelDesktopFile);
/* 167 */         FileInstaller.getInstance().registerUninstallFile(topLevelDesktopFile);
/*     */       } 
/* 169 */       if ((!excludeUninstallerFromMenu || !Objects.equals(execFile.getCanonicalPath(), (new File(installationDirectory, InstallerConfig.getCurrentInstance().getUninstallerPath())).getCanonicalPath())) && 
/* 170 */         installDesktopFile(desktopFile)) {
/* 171 */         AbstractAssociationAction.registerDesktopFile(execFile, desktopFile);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static String getRelativeDesktopFileName(String canonicalInstallationPath, String execFileName) {
/* 179 */     return getVendorPrefix(canonicalInstallationPath) + execFileName.replace(" ", "_");
/*     */   }
/*     */   
/*     */   public static boolean installDesktopFile(File desktopFile) {
/* 183 */     if (execute(desktopFile.getParentFile(), "xdg-desktop-menu", new String[] { "install", "--mode", getMode(), desktopFile.getName() })) {
/* 184 */       FileInstaller.getInstance().registerPreUninstallCommand(desktopFile, "xdg-desktop-menu", new String[] { "uninstall", "--mode", getMode(), desktopFile.getAbsolutePath() });
/* 185 */       return true;
/*     */     } 
/* 187 */     return false;
/*     */   }
/*     */   public static void createUrlLink(File tempFile, String urlSpec, File iconFile, boolean favicon) {
/*     */     
/* 191 */     try { PrintWriter pw = new PrintWriter(new FileOutputStream(tempFile)); 
/* 192 */       try { pw.println("[InternetShortcut]");
/* 193 */         pw.print("URL=");
/* 194 */         pw.println(urlSpec);
/* 195 */         if (favicon) {
/*     */           try {
/* 197 */             URL url = new URL(urlSpec);
/* 198 */             pw.print("IconFile=");
/* 199 */             pw.print(url.getProtocol());
/* 200 */             pw.print("://");
/* 201 */             pw.print(url.getHost());
/* 202 */             pw.println("/favicon.ico");
/* 203 */             pw.println("IconIndex=1");
/* 204 */           } catch (MalformedURLException e) {
/* 205 */             e.printStackTrace();
/*     */           } 
/* 207 */         } else if (iconFile != null) {
/* 208 */           pw.print("IconFile=");
/* 209 */           pw.println(iconFile.getPath());
/* 210 */           pw.println("IconIndex=0");
/* 211 */           pw.println("HotKey=0");
/*     */         } 
/* 213 */         pw.close(); } catch (Throwable throwable) { try { pw.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }  } catch (IOException e)
/* 214 */     { e.printStackTrace(); }
/*     */   
/*     */   }
/*     */   
/*     */   public static void installUrlLink(ExecutionContext executionContext, String url, File targetFile, File iconFile, boolean useFavicon) throws IOException, UserCanceledException {
/* 219 */     File tempFile = File.createTempFile("i4j", ".url");
/* 220 */     createUrlLink(tempFile, url, iconFile, useFavicon);
/* 221 */     installWindowsMenu(executionContext, targetFile, tempFile, null, null, false, null);
/* 222 */     tempFile.delete();
/*     */   }
/*     */   
/*     */   public static LauncherSetup getLauncherWithUnixPath(Context context, File path) {
/*     */     try {
/* 227 */       path = path.getCanonicalFile();
/* 228 */     } catch (IOException e) {
/* 229 */       path = path.getAbsoluteFile();
/*     */     } 
/* 231 */     for (LauncherSetup launcherSetup : context.getLaunchers()) {
/*     */       try {
/* 233 */         File launcherPath = context.getDestinationFile(launcherSetup.getRelativeFileName()).getCanonicalFile();
/* 234 */         if (launcherPath.equals(path)) {
/* 235 */           return launcherSetup;
/*     */         }
/* 237 */       } catch (IOException e) {
/* 238 */         Logger.getInstance().log(e);
/*     */       } 
/*     */     } 
/* 241 */     return null;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static List<String> getAdditionalEntries(@Nullable LauncherSetup launcherSetup) {
/* 246 */     if (launcherSetup == null) {
/* 247 */       return Collections.emptyList();
/*     */     }
/* 249 */     return Arrays.asList(InstallerVariables.replaceVariables(((ContextImpl.LauncherSetupImpl)launcherSetup).getLauncherConfig().getAdditionalStartFileEntries().toArray(), VariableErrorHandlingDescriptor.DEFAULT));
/*     */   }
/*     */ 
/*     */   
/*     */   public static void updateDesktopDatabase() {
/* 254 */     Integer result = LaunchHelper.launchApplication((new LaunchDescriptor(new File("update-desktop-database"))).wait(true).timeout(20).terminate(false));
/* 255 */     if (!Objects.equals(result, Integer.valueOf(0))) {
/* 256 */       Logger.getInstance().error(null, "update-desktop-database returned " + result);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static String getMode() {
/* 262 */     return Util.hasFullAdminRights() ? "system" : "user";
/*     */   }
/*     */   
/*     */   public static boolean execute(String command, String... arguments) {
/* 266 */     return execute(null, command, arguments);
/*     */   }
/*     */   
/*     */   public static boolean execute(File workingDir, String command, String... arguments) {
/* 270 */     LaunchDescriptor launchDescriptor = (new LaunchDescriptor(new File(command))).arguments(arguments).wait(true).timeout(60).terminate(false);
/* 271 */     if (workingDir != null) {
/* 272 */       launchDescriptor.workingDirectory(workingDir.getAbsoluteFile());
/*     */     }
/*     */     
/* 275 */     if (Boolean.getBoolean("install4j.debugMenuHelper")) {
/* 276 */       launchDescriptor.stdoutRedirection(new OutputRedirection(OutputRedirectionMode.LOG_FILE, "", false, null, false));
/* 277 */       launchDescriptor.redirectErrorStream(true);
/*     */     } 
/*     */     
/* 280 */     Integer result = LaunchHelper.launchApplication(launchDescriptor);
/* 281 */     if (!Objects.equals(result, Integer.valueOf(0))) {
/* 282 */       Logger.getInstance().error(null, command + " returned " + result);
/* 283 */       return false;
/*     */     } 
/* 285 */     return true;
/*     */   }
/*     */   
/*     */   public static String getVendorPrefix(String installationDir) {
/* 289 */     CRC32 crc = new CRC32();
/* 290 */     crc.update(installationDir.getBytes(StandardCharsets.UTF_8));
/* 291 */     return "install4j_" + Long.toString(crc.getValue(), 36) + "-";
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\MenuHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */