/*     */ package com.install4j.runtime.installer.frontend;
/*     */ import com.ejt.internal.util.JavaVersionUtil;
/*     */ import com.install4j.api.UiUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.laf.LookAndFeelHandler;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.config.InstallerLookAndFeelConfig;
/*     */ import com.install4j.runtime.installer.config.laf.LookAndFeelType;
/*     */ import com.install4j.runtime.installer.helper.Install4jClassLoader;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.platform.macos.MacosUiHelper;
/*     */ import com.install4j.runtime.installer.platform.win32.WinDarkModeDetector;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.Window;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import javax.swing.JRootPane;
/*     */ import javax.swing.LookAndFeel;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.UIManager;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public class LookAndFeelHelper {
/*     */   private static boolean lookAndFeelSet = false;
/*     */   
/*     */   @NotNull
/*     */   public static LookAndFeelHandler getLookAndFeelHandler() {
/*  29 */     if (lookAndFeelHandler == null) {
/*  30 */       lookAndFeelHandler = detectLookAndFeelHandler();
/*     */     }
/*  32 */     return lookAndFeelHandler;
/*     */   }
/*     */   private static LookAndFeelHandler lookAndFeelHandler; private static boolean otherDarkDesktop;
/*     */   @NotNull
/*     */   private static LookAndFeelHandler detectLookAndFeelHandler() {
/*  37 */     if (!InstallerUtil.isConsole() && !InstallerUtil.isUnattended()) {
/*  38 */       LookAndFeel lookAndFeel = UIManager.getLookAndFeel();
/*  39 */       String id = lookAndFeel.getID();
/*  40 */       if (lookAndFeel.getClass().getName().equals(UIManager.getSystemLookAndFeelClassName()))
/*  41 */         return new NativeLookAndFeelHandler(); 
/*  42 */       if (id.equals("IntelliJ"))
/*  43 */         return new IntelliJLookAndFeelHandler(false); 
/*  44 */       if (id.equals("Darcula"))
/*  45 */         return new IntelliJLookAndFeelHandler(true); 
/*  46 */       if (id.contains("FlatLaf")) {
/*  47 */         return new ExternalFlatLafLookAndFeelHandler();
/*     */       }
/*     */     } 
/*  50 */     return new NoLookAndFeelHandler();
/*     */   }
/*     */   
/*     */   public static void setLookAndFeel() {
/*  54 */     if (!InstallerUtil.isInProcess() || InstallerUtil.isBlockingLauncherIntegration()) {
/*  55 */       setLookAndFeelUnconditional();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void setLookAndFeelUnconditional() {
/*  60 */     HelperCommunication.helperUnsupported();
/*     */     
/*  62 */     if (!lookAndFeelSet) {
/*  63 */       lookAndFeelSet = true;
/*  64 */       if (!Boolean.getBoolean("install4j.nolaf") && !Boolean.getBoolean("java.awt.headless") && System.getProperty("swing.defaultlaf") == null) {
/*     */         try {
/*  66 */           lookAndFeelHandler = createLookAndFeelHandler();
/*  67 */           lookAndFeelHandler.applyLookAndFeel(isDarkDesktop());
/*  68 */           if (lookAndFeelHandler.isDarkModeSwitchingSupported()) {
/*  69 */             if (Util.isMacOS()) {
/*  70 */               MacosUiHelper.addThemeChangedListener(LookAndFeelHelper::syncDarkMode);
/*  71 */             } else if (Util.isAtLeastWindows10() && JavaVersionUtil.JETBRAINS_JRE) {
/*     */ 
/*     */               
/*  74 */               Toolkit.getDefaultToolkit().addPropertyChangeListener("win.lightTheme.on", e -> syncDarkMode());
/*     */             } 
/*     */           }
/*  77 */           if (Util.isMacOS() && lookAndFeelHandler.isDark()) {
/*  78 */             MacosUiHelper.setDarkMode(true);
/*     */           }
/*  80 */         } catch (Exception ex) {
/*  81 */           Util.logError(null, "Error setting the look and feel");
/*  82 */           Util.log(ex);
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void syncDarkMode() {
/*  89 */     EventQueue.invokeLater(() -> UiUtil.setDarkUi(UiUtil.isDarkDesktop()));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static LookAndFeelHandler createLookAndFeelHandler() throws Exception {
/*  94 */     if (!Util.isWindows() && !Util.isMacOS()) {
/*     */       try {
/*  96 */         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
/*  97 */         otherDarkDesktop = NativeLookAndFeelHandler.isDarkMode();
/*  98 */       } catch (Throwable throwable) {}
/*     */     }
/*     */     
/* 101 */     InstallerLookAndFeelConfig lookAndFeelConfig = InstallerConfig.getCurrentInstance().getLookAndFeelConfig();
/* 102 */     LookAndFeelType type = LookAndFeelType.getByName(System.getProperty("install4j.laf"), lookAndFeelConfig.getType());
/* 103 */     switch (type) {
/*     */       case CROSS_PLATFORM:
/* 105 */         return instantiateLookAndFeelHandler("com.install4j.runtime.flatlaf.FlatLafLookAndFeelHandler");
/*     */       case NATIVE:
/* 107 */         return new NativeLookAndFeelHandler();
/*     */       case CUSTOM:
/* 109 */         return instantiateLookAndFeelHandler(lookAndFeelConfig.getLookAndFeelHandlerClassName());
/*     */     } 
/* 111 */     throw new IllegalStateException(type.name());
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static LookAndFeelHandler instantiateLookAndFeelHandler(String className) throws Exception {
/* 117 */     Install4jClassLoader classLoader = Install4jClassLoader.getInstance();
/* 118 */     UIManager.put("ClassLoader", classLoader);
/* 119 */     return Class.forName(className, true, (ClassLoader)classLoader).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
/*     */   }
/*     */   
/*     */   public static boolean isDarkDesktop() {
/* 123 */     if (Util.isMacOS())
/* 124 */       return MacosUiHelper.isDarkMode(); 
/* 125 */     if (Util.isWindows()) {
/* 126 */       return WinDarkModeDetector.isDarkMode();
/*     */     }
/* 128 */     return otherDarkDesktop;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void setDarkUi(boolean dark) {
/* 133 */     if (InstallerUtil.isConsole() || InstallerUtil.isUnattended()) {
/*     */       return;
/*     */     }
/* 136 */     LookAndFeelHandler lookAndFeelHandler = getLookAndFeelHandler();
/* 137 */     if (lookAndFeelHandler.isDarkModeSwitchingSupported()) {
/* 138 */       MacosUiHelper.setDarkMode(dark);
/* 139 */       lookAndFeelHandler.setDark(dark);
/* 140 */       for (Window window : Window.getWindows()) {
/*     */         try {
/* 142 */           if (!(window instanceof com.install4j.runtime.wizard.CustomFrame) && !(window instanceof com.install4j.runtime.util.CustomDialog)) {
/* 143 */             SwingUtilities.updateComponentTreeUI(window);
/*     */           }
/* 145 */           if (window instanceof RootPaneContainer && JavaVersionUtil.JETBRAINS_JRE) {
/* 146 */             JRootPane rootPane = ((RootPaneContainer)window).getRootPane();
/*     */             
/* 148 */             rootPane.putClientProperty("jetbrains.awt.windowDarkAppearance", Boolean.valueOf(dark));
/*     */           } 
/* 150 */         } catch (Exception e) {
/* 151 */           e.printStackTrace();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\LookAndFeelHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */