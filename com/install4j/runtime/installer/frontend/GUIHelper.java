/*     */ package com.install4j.runtime.installer.frontend;
/*     */ import com.ejt.internal.util.CommonStringUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.alert.Alert;
/*     */ import com.install4j.runtime.alert.AlertOptionPane;
/*     */ import com.install4j.runtime.alert.AlertResult;
/*     */ import com.install4j.runtime.alert.AlertType;
/*     */ import com.install4j.runtime.beans.LazyColor;
/*     */ import com.install4j.runtime.beans.LazyUiManagerColor;
/*     */ import com.install4j.runtime.beans.LightOrDarkColor;
/*     */ import com.install4j.runtime.beans.applications.Application;
/*     */ import com.install4j.runtime.beans.applications.CustomApplication;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.console.ConsoleImpl;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchDescriptor;
/*     */ import com.install4j.runtime.util.StringUtil;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Desktop;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.Window;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.util.HashMap;
/*     */ import java.util.LinkedList;
/*     */ import java.util.Locale;
/*     */ import java.util.Objects;
/*     */ import java.util.concurrent.Callable;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JSeparator;
/*     */ import javax.swing.UIDefaults;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.plaf.basic.BasicSeparatorUI;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ public class GUIHelper {
/*  46 */   public static final Color CONTENT_BACKGROUND_COLOR = (Color)new LightOrDarkColor(Color.WHITE, new Color(69, 73, 74)); public static final int BASELINE_LEADING = 512;
/*  47 */   private static final LazyColor SEPARATOR_COLOR = (LazyColor)new LazyUiManagerColor("Separator.foreground");
/*     */   
/*  49 */   private static String browserExecutable = "";
/*     */   
/*     */   public static String getBrowserExecutable() {
/*  52 */     return browserExecutable;
/*     */   }
/*     */   
/*     */   public static void setBrowserExecutable(String browserExecutable) {
/*  56 */     GUIHelper.browserExecutable = browserExecutable;
/*     */   }
/*     */   
/*     */   public static void setLanguage(String languageId) {
/*  60 */     HelperCommunication.helperUnsupported();
/*     */     
/*  62 */     if (InstallerUtil.isInProcess()) {
/*  63 */       LookAndFeelHelper.setLookAndFeel();
/*     */       return;
/*     */     } 
/*  66 */     if (languageId != null) {
/*  67 */       String country; int index = languageId.indexOf("_");
/*     */       
/*  69 */       if (index > -1) {
/*  70 */         country = languageId.substring(index + 1);
/*  71 */         languageId = languageId.substring(0, index);
/*     */       } else {
/*  73 */         country = "";
/*     */       } 
/*     */       try {
/*  76 */         Locale.setDefault(new Locale(languageId, country));
/*  77 */       } catch (Exception exception) {}
/*     */     } else {
/*     */       
/*  80 */       languageId = Locale.getDefault().getLanguage();
/*     */     } 
/*     */     
/*  83 */     LookAndFeelHelper.setLookAndFeel();
/*     */     
/*  85 */     if (Objects.equals(languageId, "ja") || Objects.equals(languageId, "ko") || languageId.startsWith("zh")) {
/*  86 */       Font font = UIManager.getFont("Label.font");
/*  87 */       UIManager.put("OptionPane.font", font);
/*  88 */       UIManager.put("OptionPane.messageFont", font);
/*  89 */       UIManager.put("OptionPane.buttonFont", font);
/*     */     } 
/*     */     
/*  92 */     String fontOffset = System.getProperty("install4j.font.offset");
/*  93 */     String javaVersion = System.getProperty("java.version");
/*  94 */     if (fontOffset != null) {
/*  95 */       adjustFontSize(Integer.parseInt(fontOffset));
/*  96 */     } else if (Objects.equals(languageId, "zh_TW") && javaVersion.startsWith("1.4")) {
/*  97 */       adjustFontSize(2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static void adjustFontSize(int adjustment) {
/* 103 */     HelperCommunication.helperUnsupported();
/*     */     
/* 105 */     UIDefaults defaults = UIManager.getDefaults();
/* 106 */     LinkedList<Object> newDefaults = new LinkedList();
/* 107 */     HashMap<Font, Font> newFonts = new HashMap<>();
/*     */     
/* 109 */     for (Object key : defaults.keySet()) {
/* 110 */       Object value = defaults.get(key);
/* 111 */       if (value instanceof Font) {
/* 112 */         Font oldFont = (Font)value;
/* 113 */         Font newFont = newFonts.get(oldFont);
/* 114 */         if (newFont == null) {
/* 115 */           newFont = new Font(oldFont.getName(), oldFont.getStyle(), oldFont.getSize() + adjustment);
/* 116 */           newFonts.put(oldFont, newFont);
/*     */         } 
/* 118 */         newDefaults.add(key);
/* 119 */         newDefaults.add(newFont);
/*     */       } 
/*     */     } 
/* 122 */     defaults.putDefaults(newDefaults.toArray());
/*     */   }
/*     */   
/*     */   public static int showOptionDialog(Component parent, String mainMessage, String contentMessage, String[] options, int messageType) throws UserCanceledException {
/* 126 */     String[] keys = new String[options.length];
/* 127 */     for (int i = 0; i < options.length; i++) {
/* 128 */       String option = options[i];
/* 129 */       int index = option.indexOf('&');
/* 130 */       if (index > -1 && index < option.length() - 1) {
/* 131 */         keys[i] = option.substring(index + 1, index + 2).toLowerCase(Locale.ENGLISH);
/*     */       } else {
/* 133 */         String key = option.substring(0, 1).toLowerCase(Locale.ENGLISH);
/* 134 */         boolean found = false;
/* 135 */         for (int j = 0; j < i; j++) {
/* 136 */           if (Objects.equals(keys[j], key)) {
/* 137 */             found = true;
/*     */             break;
/*     */           } 
/*     */         } 
/* 141 */         if (!found) {
/* 142 */           keys[i] = key;
/*     */         } else {
/* 144 */           keys[i] = String.valueOf(i);
/*     */         } 
/*     */       } 
/* 147 */       options[i] = option.replaceAll("&", "");
/*     */     } 
/*     */     
/* 150 */     if (InstallerUtil.isUnattendedWithoutAlerts())
/* 151 */       return -1; 
/* 152 */     if (InstallerUtil.isConsole()) {
/* 153 */       return ConsoleImpl.getInstance().askOption(toSingleAlertMessage(mainMessage, contentMessage), options, keys, 0);
/*     */     }
/* 155 */     LookAndFeelHelper.setLookAndFeel();
/*     */     
/* 157 */     Component nonNullParent = getNonNullParent(parent);
/*     */     try {
/* 159 */       return ((Integer)invokeOnEDT(() -> Integer.valueOf(showOptionDialogInternal(nonNullParent, mainMessage, contentMessage, messageType, options)))).intValue();
/* 160 */     } catch (Exception e) {
/* 161 */       InstallerUtil.reportException(e);
/* 162 */       return -1;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static String toSingleAlertMessage(String mainMessage, String contentMessage) {
/* 168 */     return (contentMessage == null) ? mainMessage : contentMessage;
/*     */   }
/*     */   
/*     */   private static int showOptionDialogInternal(Component parent, String mainMessage, String contentMessage, int messageType, String[] options) {
/* 172 */     HelperCommunication.helperUnsupported();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 178 */     Alert<String> alert = Alert.create(parent, Messages.getString(".SetupAppTitle"), mainMessage, contentMessage).addButtons((Object[])options).defaultButton(options[0]).cancelButton(options[options.length - 1]).alertType(AlertType.fromOptionType(messageType, AlertType.QUESTION));
/*     */     
/* 180 */     AlertResult<String> alertResult = alert.show();
/* 181 */     return alertResult.getSelectedIndex();
/*     */   }
/*     */   
/*     */   public static Window getParentWindow() {
/* 185 */     if (InstallerUtil.isUnattendedWithoutAlerts() || InstallerUtil.isConsole()) {
/* 186 */       return null;
/*     */     }
/* 188 */     HelperCommunication.helperUnsupported();
/*     */     
/* 190 */     Window[] windows = Window.getWindows();
/* 191 */     if (windows != null) {
/* 192 */       Window showingWindow = null;
/* 193 */       Window nonTempFrame = null;
/* 194 */       for (Window window : windows) {
/* 195 */         if (isDialogOrFrame(window)) {
/*     */ 
/*     */           
/* 198 */           if (window.isShowing()) {
/* 199 */             showingWindow = window;
/* 200 */             if (window.isActive()) {
/* 201 */               return window;
/*     */             }
/*     */           } 
/* 204 */           if (!(window instanceof AlertOptionPane.TempFrame))
/* 205 */             nonTempFrame = window; 
/*     */         } 
/*     */       } 
/* 208 */       if (showingWindow != null)
/* 209 */         return showingWindow; 
/* 210 */       if (nonTempFrame != null) {
/* 211 */         return nonTempFrame;
/*     */       }
/*     */     } 
/* 214 */     return null;
/*     */   }
/*     */   
/*     */   private static boolean isDialogOrFrame(Window window) {
/* 218 */     return (window instanceof java.awt.Dialog || window instanceof java.awt.Frame);
/*     */   }
/*     */   
/*     */   public static void showMessage(Component parent, String message, int messageType) {
/* 222 */     showMessage(parent, message, null, messageType);
/*     */   }
/*     */   
/*     */   public static void showMessage(Component parent, String message, String contentMessage, int messageType) {
/* 226 */     if (InstallerUtil.isUnattendedWithoutAlerts()) {
/* 227 */       Logger.getInstance().log(null, message, (messageType != 0));
/* 228 */       ConsoleImpl.getInstance().println(message);
/* 229 */     } else if (InstallerUtil.isConsole()) {
/* 230 */       ConsoleImpl.getInstance().println(message);
/*     */     } else {
/* 232 */       LookAndFeelHelper.setLookAndFeel();
/*     */       
/* 234 */       Component nonNullParent = getNonNullParent(parent);
/*     */       try {
/* 236 */         invokeOnEDT(() -> showMessageInternal(nonNullParent, message, contentMessage, messageType));
/* 237 */       } catch (Exception e) {
/* 238 */         InstallerUtil.reportException(e);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static Component getNonNullParent(@Nullable Component parent) {
/* 245 */     if (parent != null) {
/* 246 */       return parent;
/*     */     }
/* 248 */     Window parentWindow = getParentWindow();
/* 249 */     if (parentWindow != null) {
/* 250 */       return parentWindow;
/*     */     }
/* 252 */     return (Component)new AlertOptionPane.TempFrame();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void showMessageInternal(Component parent, String mainMessage, String contentMessage, int messageType) {
/* 258 */     HelperCommunication.helperUnsupported();
/*     */     
/* 260 */     Alert alert = Alert.create(parent, Messages.getString(".SetupAppTitle"), mainMessage, contentMessage).alertType(AlertType.fromOptionType(messageType, AlertType.INFORMATION));
/* 261 */     alert.show();
/*     */   }
/*     */   
/*     */   public static boolean showURL(String urlSpec) {
/* 265 */     if (InstallerUtil.isUnattendedWithoutAlerts() || InstallerUtil.isConsole()) {
/* 266 */       return true;
/*     */     }
/*     */     
/* 269 */     Window window = getParentWindow();
/*     */     try {
/* 271 */       if (!showUrlWithDesktop(urlSpec)) {
/* 272 */         showBrowserError(window);
/* 273 */         return false;
/*     */       } 
/* 275 */     } catch (IOException e) {
/* 276 */       showBrowserError(window);
/* 277 */       return false;
/*     */     } 
/* 279 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean showUrlWithDesktop(String urlSpec) throws IOException {
/* 283 */     if (!Desktop.isDesktopSupported()) {
/* 284 */       return false;
/*     */     }
/* 286 */     Desktop desktop = Desktop.getDesktop();
/* 287 */     if (!desktop.isSupported(Desktop.Action.BROWSE)) {
/* 288 */       return false;
/*     */     }
/*     */     try {
/* 291 */       desktop.browse(new URI(CommonStringUtil.encodeUrlSpaces(urlSpec)));
/* 292 */       return true;
/* 293 */     } catch (IOException e) {
/* 294 */       Logger.getInstance().error(null, "The URI " + urlSpec + " cannot be shown.");
/* 295 */       Logger.getInstance().log(e);
/* 296 */       throw e;
/* 297 */     } catch (Throwable t) {
/* 298 */       Logger.getInstance().error(null, "The URI " + urlSpec + " cannot be shown.");
/* 299 */       Logger.getInstance().log(t);
/* 300 */       throw new IOException(t);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static Color getSeparatorColor() {
/* 305 */     HelperCommunication.helperUnsupported();
/* 306 */     return (Color)SEPARATOR_COLOR;
/*     */   }
/*     */   
/*     */   public static boolean confirmCancel(Component parent) {
/* 310 */     HelperCommunication.helperUnsupported();
/* 311 */     int result = 0;
/*     */     try {
/* 313 */       String message = null;
/* 314 */       Application application = InstallerConfig.getCurrentApplication();
/* 315 */       if (application instanceof com.install4j.runtime.beans.applications.InstallerApplication) {
/* 316 */         message = Messages.getString(".ExitSetupMessage");
/* 317 */       } else if (application instanceof com.install4j.runtime.beans.applications.UninstallerApplication) {
/* 318 */         message = Messages.getString(".ExitUninstallerMessage");
/* 319 */       } else if (application instanceof CustomApplication) {
/* 320 */         CustomApplication customApplication = (CustomApplication)application;
/* 321 */         if (customApplication.isShowCancelMessage()) {
/* 322 */           message = customApplication.getCancelMessage();
/*     */         }
/*     */       } else {
/* 325 */         message = Messages.getString(".ExitApplication");
/*     */       } 
/* 327 */       if (message != null) {
/* 328 */         result = showOptionDialog(parent, message, null, new String[] {
/*     */ 
/*     */ 
/*     */               
/* 332 */               Messages.getString(".ButtonExit"), Messages.getString(".ButtonContinue") }, 3);
/*     */       
/*     */       }
/*     */     }
/* 336 */     catch (UserCanceledException userCanceledException) {}
/*     */ 
/*     */     
/* 339 */     return (result == 0);
/*     */   }
/*     */   
/*     */   private static void showBrowserError(Window window) {
/* 343 */     if (!Boolean.getBoolean("install4j.noBrowserError")) {
/* 344 */       showMessage(window, Messages.getString(".ErrorStartingBrowser"), 0);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void makeTransparent(JComponent component) {
/* 349 */     HelperCommunication.helperUnsupported();
/*     */ 
/*     */     
/* 352 */     if (component.getBackground() instanceof javax.swing.plaf.UIResource && (component instanceof javax.swing.JPanel || component instanceof javax.swing.JRadioButton || component instanceof javax.swing.JCheckBox || component instanceof javax.swing.JSlider || component instanceof javax.swing.JSplitPane || component instanceof javax.swing.JButton))
/*     */     {
/* 354 */       if (!LookAndFeelHelper.getLookAndFeelHandler().isPreventTransparency(component))
/*     */       {
/* 356 */         component.setOpaque(false);
/*     */       }
/*     */     }
/* 359 */     int componentCount = component.getComponentCount();
/* 360 */     for (int i = 0; i < componentCount; i++) {
/* 361 */       Component child = component.getComponent(i);
/* 362 */       if (child instanceof JComponent) {
/* 363 */         makeTransparent((JComponent)child);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void invokeLater(Runnable runnable) {
/* 369 */     HelperCommunication.helperUnsupported();
/* 370 */     if (EventQueue.isDispatchThread()) {
/* 371 */       runnable.run();
/*     */     } else {
/* 373 */       EventQueue.invokeLater(runnable);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void showPath(String path) {
/* 379 */     if (InstallerUtil.isUnattendedWithoutAlerts() || InstallerUtil.isConsole()) {
/*     */       return;
/*     */     }
/*     */     
/* 383 */     File file = new File(path);
/* 384 */     boolean directory = file.isDirectory();
/*     */     
/* 386 */     if (InstallerUtil.isMacOS()) {
/* 387 */       (new String[1])[0] = file.getAbsolutePath(); (new String[2])[0] = "-R"; (new String[2])[1] = file.getAbsolutePath(); LaunchHelper.launchApplication((new LaunchDescriptor(new File("/usr/bin/open"))).arguments(directory ? new String[1] : new String[2]));
/*     */     } else {
/*     */       String[] commandArray;
/* 390 */       File workingDirectory = null;
/* 391 */       if (InstallerUtil.isWindows()) {
/* 392 */         if (path.indexOf(' ') > -1) {
/* 393 */           path = FolderInfo.getShortPathName(path);
/*     */         }
/* 395 */         commandArray = new String[] { "explorer.exe", (directory ? "" : "/select,") + path };
/*     */       } else {
/*     */         
/* 398 */         commandArray = new String[] { "/bin/sh", "-c", "xdg-open .;  if [ $? -ne 0 ]; then xterm; fi" };
/* 399 */         workingDirectory = directory ? file : file.getParentFile();
/*     */       } 
/*     */       
/*     */       try {
/* 403 */         (new ProcessBuilder(commandArray)).directory(workingDirectory).start();
/* 404 */       } catch (IOException e) {
/* 405 */         e.printStackTrace();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static JSeparator createHorizontalSeparator() {
/* 411 */     JSeparator separator = new JSeparator(0);
/* 412 */     if (Util.isMacOS()) {
/* 413 */       separator.setUI(new BasicSeparatorUI());
/*     */     }
/* 415 */     return separator;
/*     */   }
/*     */   
/*     */   public static void setEmptyBorder(JComponent component, int top, int left, int bottom, int right) {
/* 419 */     component.setBorder(BorderFactory.createEmptyBorder(top, left, bottom, right));
/* 420 */     component.addPropertyChangeListener(event -> {
/*     */           if (Objects.equals(event.getPropertyName(), "componentOrientation")) {
/*     */             boolean leftToRight = component.getComponentOrientation().isLeftToRight();
/*     */             component.setBorder(BorderFactory.createEmptyBorder(top, leftToRight ? left : right, bottom, leftToRight ? right : left));
/*     */           } 
/*     */         });
/*     */   }
/*     */   
/*     */   public static void applyComponentOrientation(Component c) {
/* 429 */     c.applyComponentOrientation(ComponentOrientation.getOrientation(Locale.getDefault()));
/*     */   }
/*     */   
/*     */   public static void invokeOnEDT(Runnable runnable) {
/* 433 */     HelperCommunication.helperUnsupported();
/* 434 */     HelperCommunication.checkEdtWaiting();
/*     */     
/* 436 */     if (EventQueue.isDispatchThread()) {
/* 437 */       runnable.run();
/*     */     } else {
/*     */       try {
/* 440 */         EventQueue.invokeAndWait(runnable);
/* 441 */       } catch (InterruptedException e) {
/* 442 */         e.printStackTrace();
/* 443 */       } catch (InvocationTargetException e) {
/* 444 */         throw new RuntimeException(e);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static <V> V invokeOnEDT(Callable<V> callable) {
/* 451 */     HelperCommunication.helperUnsupported();
/* 452 */     HelperCommunication.checkEdtWaiting();
/*     */     
/* 454 */     if (EventQueue.isDispatchThread()) {
/*     */       try {
/* 456 */         return callable.call();
/* 457 */       } catch (Throwable e) {
/* 458 */         throw new RuntimeException(e);
/*     */       } 
/*     */     }
/* 461 */     Throwable[] throwable = new Throwable[1];
/* 462 */     Object[] result = new Object[1];
/*     */     try {
/* 464 */       EventQueue.invokeAndWait(() -> {
/*     */             try {
/*     */               result[0] = callable.call();
/* 467 */             } catch (Throwable t) {
/*     */               throwable[0] = t;
/*     */             } 
/*     */           });
/* 471 */     } catch (Exception e) {
/* 472 */       throw new RuntimeException(e);
/*     */     } 
/* 474 */     if (throwable[0] != null) {
/* 475 */       throw new RuntimeException(throwable[0]);
/*     */     }
/* 477 */     return (V)result[0];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getHexValue(Color color) {
/* 483 */     StringBuffer buffer = new StringBuffer();
/* 484 */     appendComponent(buffer, color.getRed());
/* 485 */     appendComponent(buffer, color.getGreen());
/* 486 */     appendComponent(buffer, color.getBlue());
/* 487 */     return buffer.toString();
/*     */   }
/*     */   
/*     */   private static void appendComponent(StringBuffer buffer, int component) {
/* 491 */     buffer.append(StringUtil.padLeft(Integer.toHexString(component), '0', 2));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\GUIHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */