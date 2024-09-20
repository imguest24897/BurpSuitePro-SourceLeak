/*     */ package com.install4j.runtime.installer.helper.versionspecific;
/*     */ import com.install4j.api.launcher.StartupNotification;
/*     */ import com.install4j.runtime.alert.AlertType;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.awt.Desktop;
/*     */ import java.awt.Image;
/*     */ import java.awt.desktop.AboutEvent;
/*     */ import java.awt.desktop.OpenFilesEvent;
/*     */ import java.awt.desktop.OpenURIEvent;
/*     */ import java.awt.desktop.QuitEvent;
/*     */ import java.awt.desktop.QuitResponse;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.awt.image.MultiResolutionImage;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.net.URI;
/*     */ import java.util.Optional;
/*     */ import javafx.stage.Window;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UnsupportedLookAndFeelException;
/*     */ 
/*     */ public class Java9Helper extends NoHelper {
/*  24 */   private static boolean JETBRAINS_WORKAROUND = (JavaVersionUtil.JETBRAINS_JRE && !VersionCheck.checkJavaVersionCompatible("11.0.12", System.getProperty("java.version")));
/*     */ 
/*     */   
/*     */   public void requestForeground() {
/*  28 */     if (Desktop.isDesktopSupported()) {
/*  29 */       Desktop desktop = Desktop.getDesktop();
/*  30 */       if (desktop.isSupported(Desktop.Action.APP_REQUEST_FOREGROUND)) {
/*  31 */         desktop.requestForeground(true);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMacStartupListener(StartupNotification.Listener startupListener) {
/*  38 */     if (JETBRAINS_WORKAROUND) {
/*  39 */       super.setMacStartupListener(startupListener);
/*     */     } else {
/*  41 */       Desktop desktop = Desktop.getDesktop();
/*  42 */       if (startupListener != null) {
/*  43 */         if (desktop.isSupported(Desktop.Action.APP_OPEN_FILE)) {
/*  44 */           desktop.setOpenFileHandler(e -> {
/*     */                 for (File file : e.getFiles()) {
/*     */                   startupListener.startupPerformed(file.getAbsolutePath());
/*     */                 }
/*     */               });
/*     */         }
/*  50 */         if (desktop.isSupported(Desktop.Action.APP_OPEN_URI)) {
/*  51 */           desktop.setOpenURIHandler(openURIEvent -> {
/*     */                 URI uri = openURIEvent.getURI();
/*     */                 if (uri != null) {
/*     */                   startupListener.startupPerformed(uri.toString());
/*     */                 }
/*     */               });
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMacHandleQuit(boolean handleQuit) {
/*  64 */     if (JETBRAINS_WORKAROUND) {
/*  65 */       super.setMacHandleQuit(handleQuit);
/*     */     } else {
/*  67 */       Desktop desktop = Desktop.getDesktop();
/*  68 */       if (desktop.isSupported(Desktop.Action.APP_QUIT_HANDLER)) {
/*  69 */         desktop.setQuitHandler((e, response) -> {
/*     */               if (handleQuit) {
/*     */                 response.performQuit();
/*     */               } else {
/*     */                 response.cancelQuit();
/*     */               } 
/*     */             });
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMacQuitHandler(Runnable runnable) {
/*  82 */     if (JETBRAINS_WORKAROUND) {
/*  83 */       super.setMacQuitHandler(runnable);
/*     */     } else {
/*  85 */       Desktop desktop = Desktop.getDesktop();
/*  86 */       if (runnable != null && desktop.isSupported(Desktop.Action.APP_QUIT_HANDLER)) {
/*  87 */         desktop.setQuitHandler((e, response) -> {
/*     */               response.cancelQuit();
/*     */               runnable.run();
/*     */             });
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMacAboutHandler(Runnable runnable) {
/*  97 */     if (JETBRAINS_WORKAROUND) {
/*  98 */       super.setMacAboutHandler(runnable);
/*     */     } else {
/* 100 */       Desktop desktop = Desktop.getDesktop();
/* 101 */       if (runnable != null && desktop.isSupported(Desktop.Action.APP_ABOUT)) {
/* 102 */         desktop.setAboutHandler(e -> runnable.run());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMacPreferencesHandler(Runnable runnable) {
/* 109 */     if (JETBRAINS_WORKAROUND) {
/* 110 */       super.setMacPreferencesHandler(runnable);
/*     */     } else {
/* 112 */       Desktop desktop = Desktop.getDesktop();
/* 113 */       if (runnable != null && desktop.isSupported(Desktop.Action.APP_PREFERENCES)) {
/* 114 */         desktop.setPreferencesHandler(e -> runnable.run());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void addReads(String moduleName) {
/*     */     try {
/* 122 */       Optional<Module> optionalModule = ModuleLayer.boot().findModule(moduleName);
/* 123 */       optionalModule.ifPresent(module -> Java9Helper.class.getModule().addReads(module));
/* 124 */     } catch (Throwable t) {
/* 125 */       Logger.getInstance().log(t);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public long getPid() {
/*     */     try {
/* 132 */       return ((ProcessHandle)ProcessHandle.class.getMethod("current", new Class[0]).invoke(null, new Object[0])).pid();
/* 133 */     } catch (Throwable e) {
/* 134 */       return super.getPid();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isJavaFxWindowShown() {
/*     */     try {
/* 141 */       return Window.getWindows().stream().anyMatch(Window::isShowing);
/* 142 */     } catch (Throwable t) {
/* 143 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, IOException {
/* 148 */     UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
/* 149 */     for (AlertType alertType : AlertType.values()) {
/* 150 */       ImageIcon icon = (ImageIcon)(new CustomOptionPaneUI()).getIconForType(alertType.getOptionType());
/* 151 */       Image sourceImage = icon.getImage();
/* 152 */       if (sourceImage instanceof MultiResolutionImage) {
/*     */         
/* 154 */         BufferedImage image = (BufferedImage)((MultiResolutionImage)sourceImage).getResolutionVariant(64.0D, 64.0D);
/* 155 */         writeImage(alertType, "@2x", image);
/*     */       } else {
/* 157 */         writeImage(alertType, "", (BufferedImage)sourceImage);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void writeImage(AlertType alertType, String postFix, BufferedImage image) throws IOException {
/* 163 */     ImageIO.write(image, "png", new File("C:\\Users\\ingo\\projects\\install4j\\modules\\install4j_runtime\\resources\\com\\install4j\\runtime\\installer\\frontend\\icons", "alert_windows_" + alertType.name().toLowerCase(Locale.ENGLISH) + postFix + ".png"));
/*     */   }
/*     */   
/*     */   private static class CustomOptionPaneUI
/*     */     extends BasicOptionPaneUI {
/*     */     private CustomOptionPaneUI() {
/* 169 */       installUI(new JOptionPane());
/*     */     }
/*     */ 
/*     */     
/*     */     protected Icon getIconForType(int messageType) {
/* 174 */       return super.getIconForType(messageType);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAccessibilityProviderName() {
/* 180 */     return super.getAccessibilityProviderName();
/*     */   }
/*     */   
/*     */   public static class EmptyAccessibilityProvider
/*     */     extends AccessibilityProvider {
/*     */     public String getName() {
/* 186 */       return "com.install4j.runtime.EmptyAccessibilityProvider";
/*     */     }
/*     */     
/*     */     public void activate() {}
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\versionspecific\Java9Helper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */