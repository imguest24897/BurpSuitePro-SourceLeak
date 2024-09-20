/*     */ package com.install4j.runtime.installer.frontend;
/*     */ import com.ejt.internal.gui.HiDPIUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.util.AlphaTriStateCheckBox;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.GraphicsEnvironment;
/*     */ import java.util.Locale;
/*     */ import java.util.Objects;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.UIManager;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public class NativeLookAndFeelHandler implements LookAndFeelHandler {
/*  17 */   public static final Color WINDOWS_TITLE_COLOR = new Color(0, 51, 153); private static Font alertFont; private static String[] availableFontFamilyNames; private Boolean dark;
/*     */   
/*     */   private static boolean isGtkLaF() {
/*  20 */     return Objects.equals(UIManager.getLookAndFeel().getID(), "GTK");
/*     */   }
/*     */   
/*     */   private static boolean isWindowsLaF() {
/*  24 */     return Objects.equals(UIManager.getLookAndFeel().getID(), "Windows");
/*     */   }
/*     */   
/*     */   private static boolean isWindowsClassicLaF() {
/*  28 */     return (isWindowsLaF() && (!Objects.equals(Boolean.TRUE, Toolkit.getDefaultToolkit().getDesktopProperty("win.xpstyle.themeActive")) || Boolean.getBoolean("swing.noxp") || UIManager.getLookAndFeel().getClass().getName().endsWith("WindowsClassicLookAndFeel")));
/*     */   }
/*     */   
/*     */   public static boolean isDarkMode() {
/*  32 */     return !isDarkColor(UIManager.getColor("Label.foreground"));
/*     */   }
/*     */   
/*     */   private static boolean isDarkColor(Color color) {
/*  36 */     return ((30 * color.getRed() + 59 * color.getGreen() + 11 * color.getBlue()) / 100 < 130);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static String getAlertFontName() {
/*  41 */     Locale locale = Locale.getDefault();
/*  42 */     if (locale.equals(new Locale("zh", "CN")))
/*  43 */       return "Microsoft YaHei UI"; 
/*  44 */     if (locale.equals(new Locale("zh", "TW")))
/*  45 */       return "Microsoft JhengHei UI"; 
/*  46 */     if (locale.getLanguage().equals((new Locale("ko")).getLanguage()))
/*  47 */       return "Malgun Gothic"; 
/*  48 */     if (locale.getLanguage().equals((new Locale("ja")).getLanguage())) {
/*  49 */       return "Meiryo UI";
/*     */     }
/*  51 */     return "Segoe UI";
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean isFontInstalled(@NotNull String familyName) {
/*  56 */     if (availableFontFamilyNames == null) {
/*  57 */       GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
/*  58 */       availableFontFamilyNames = g.getAvailableFontFamilyNames();
/*     */     } 
/*  60 */     for (String name : availableFontFamilyNames) {
/*  61 */       if (name.equals(familyName)) {
/*  62 */         return true;
/*     */       }
/*     */     } 
/*  65 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void applyLookAndFeel(boolean darkDesktop) throws Exception {
/*  74 */     if (Util.isWindows() || Util.isMacOS() || HiDPIUtil.getDefaultDeviceScaleFactor() == 1.0D) {
/*  75 */       if (!InstallerUtil.isJava9Plus()) {
/*  76 */         System.setProperty("jdk.gtk.version", "2");
/*     */       }
/*  78 */       UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
/*  79 */       if (isGtkLaF()) {
/*  80 */         UIManager.put("Button.margin", new Insets(1, 9, 1, 9));
/*  81 */         this.dark = Boolean.valueOf(isDarkMode());
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isDark() {
/*  88 */     return (this.dark != null) ? this.dark.booleanValue() : super.isDark();
/*     */   }
/*     */ 
/*     */   
/*     */   public Color getTitleColor() {
/*  93 */     if (Util.isWindows()) {
/*  94 */       return WINDOWS_TITLE_COLOR;
/*     */     }
/*  96 */     return super.getTitleColor();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isWideTreeSelection() {
/* 102 */     return isGtkLaF();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isPreventTransparency(JComponent component) {
/* 107 */     return (component instanceof javax.swing.JButton && isWindowsClassicLaF());
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public JCheckBox createTriStateCheckBox() {
/* 113 */     if (Util.isMacOS() || isWindowsClassicLaF()) {
/* 114 */       return (JCheckBox)new AlphaTriStateCheckBox(0.5F);
/*     */     }
/* 116 */     return super.createTriStateCheckBox();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public Font getAlertFont() {
/* 123 */     if (Util.isWindows()) {
/* 124 */       if (alertFont == null) {
/* 125 */         String fontName = getAlertFontName();
/* 126 */         if (Util.isWindows() && isFontInstalled(fontName)) {
/* 127 */           alertFont = new Font(fontName, 0, 12);
/*     */         } else {
/* 129 */           alertFont = UIManager.getFont("Label.font");
/*     */         } 
/*     */       } 
/* 132 */       return alertFont;
/*     */     } 
/* 134 */     return super.getAlertFont();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getFileChooserLowerAccessoryInset() {
/* 140 */     return isWindowsLaF() ? 100 : super.getFileChooserLowerAccessoryInset();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\NativeLookAndFeelHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */