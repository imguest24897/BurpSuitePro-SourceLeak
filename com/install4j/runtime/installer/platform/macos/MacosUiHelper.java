/*     */ package com.install4j.runtime.installer.platform.macos;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import java.awt.Component;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.SecondaryLoop;
/*     */ import java.awt.Window;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CountDownLatch;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JOptionPane;
/*     */ 
/*     */ public class MacosUiHelper {
/*     */   static {
/*  26 */     Common.init();
/*     */   }
/*     */ 
/*     */   
/*     */   public static final int DIALOG_TYPE_OPEN = 1;
/*     */   public static final int DIALOG_TYPE_OPEN_MULTIPLE = 2;
/*     */   public static final int DIALOG_TYPE_SAVE = 3;
/*     */   public static final int DIALOG_TYPE_DIRECTORY = 4;
/*     */   public static final int DIALOG_TYPE_FILE_OR_DIRECTORY = 5;
/*  35 */   private static Executor executor = Executors.newSingleThreadExecutor();
/*  36 */   private static Map<Integer, byte[]> iconBytes = (Map)Collections.synchronizedMap(new HashMap<>());
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static MacosAlertResult showAlert(String title, String message, String[] buttonTitles, String defaultButtonTitle, String cancelButtonTitle, int type, Icon icon, boolean suppressionShown, boolean useSecondaryLoop) {
/*  68 */     List<String> originalButtonTitles = Arrays.asList(buttonTitles);
/*  69 */     List<String> unorderedButtonTitles = new ArrayList<>(originalButtonTitles);
/*  70 */     List<String> reorderedButtonTitles = new ArrayList<>();
/*  71 */     if (unorderedButtonTitles.remove(defaultButtonTitle)) {
/*  72 */       reorderedButtonTitles.add(defaultButtonTitle);
/*     */     }
/*  74 */     if (unorderedButtonTitles.remove(cancelButtonTitle)) {
/*  75 */       reorderedButtonTitles.add(cancelButtonTitle);
/*     */     }
/*  77 */     reorderedButtonTitles.addAll(unorderedButtonTitles);
/*     */     
/*  79 */     byte[] iconBytes = (icon != null) ? getIconBytes(icon) : getIcon(Integer.valueOf(type));
/*     */     
/*  81 */     SecondaryLoop loop = useSecondaryLoop ? createSecondaryLoop() : null;
/*  82 */     String[] buttonArray = reorderedButtonTitles.<String>toArray(new String[0]);
/*  83 */     AlertCallbackImpl callback = new AlertCallbackImpl(reorderedButtonTitles, originalButtonTitles, loop);
/*  84 */     if (loop != null) {
/*  85 */       runWithSecondaryLoop(loop, callback.countDownLatch, () -> {
/*     */             restoreFocus();
/*     */             showAlert0(title, message, buttonArray, cancelButtonTitle, iconBytes, type, suppressionShown, true, callback);
/*     */           });
/*     */     } else {
/*  90 */       showAlert0(title, message, buttonArray, cancelButtonTitle, iconBytes, type, suppressionShown, false, callback);
/*  91 */       callback.await();
/*     */     } 
/*  93 */     return callback.getResult();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void restoreFocus() {
/*     */     try {
/* 100 */       EventQueue.invokeAndWait(() -> {
/*     */           
/*     */           });
/* 103 */       EventQueue.invokeAndWait(() -> { 
/*     */           });
/* 105 */     } catch (InterruptedException|java.lang.reflect.InvocationTargetException e) {
/* 106 */       e.printStackTrace();
/*     */     } 
/* 108 */     final Window window = getTopLevelWindow();
/* 109 */     if (window != null) {
/* 110 */       final Component focusOwner = window.getFocusOwner();
/*     */       
/* 112 */       window.addWindowListener(new WindowAdapter()
/*     */           {
/*     */             public void windowActivated(WindowEvent e) {
/* 115 */               if (focusOwner != null) {
/* 116 */                 focusOwner.requestFocus();
/*     */               }
/* 118 */               window.removeWindowListener(this);
/*     */             }
/*     */           });
/*     */     } 
/*     */   }
/*     */   
/*     */   private static Window getTopLevelWindow() {
/* 125 */     for (Window window : Window.getWindows()) {
/* 126 */       if (window.isActive()) {
/* 127 */         return window;
/*     */       }
/*     */     } 
/* 130 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static byte[] getIcon(Integer type) {
/* 136 */     if (Boolean.getBoolean("ejt.deployed") && (type.intValue() == 1 || type.intValue() == 3 || type.intValue() == -1)) {
/* 137 */       return null;
/*     */     }
/*     */     
/* 140 */     byte[] bytes = iconBytes.get(type);
/* 141 */     if (bytes == null) {
/* 142 */       JOptionPane optionPane = new JOptionPane();
/* 143 */       CustomOptionPaneUI optionPaneUI = new CustomOptionPaneUI();
/* 144 */       optionPane.setUI(optionPaneUI);
/* 145 */       Icon icon = optionPaneUI.getIconForType(type.intValue());
/* 146 */       bytes = getIconBytes(icon);
/* 147 */       if (bytes != null) {
/* 148 */         iconBytes.put(type, bytes);
/*     */       }
/*     */     } 
/* 151 */     return bytes;
/*     */   }
/*     */   
/*     */   private static byte[] getIconBytes(Icon icon) {
/* 155 */     double scaleFactor = HiDPIUtil.getScaleFactor(getGraphicsConfiguration());
/* 156 */     int sizeFactor = (icon.getIconWidth() == 32 && scaleFactor > 1.0D) ? 2 : 1;
/* 157 */     BufferedImage image = new BufferedImage(icon.getIconWidth() * sizeFactor, icon.getIconHeight() * sizeFactor, 6);
/* 158 */     Graphics2D g = image.createGraphics();
/* 159 */     g.scale(sizeFactor, sizeFactor);
/* 160 */     icon.paintIcon(new JPanel(), g, 0, 0);
/* 161 */     ByteArrayOutputStream out = new ByteArrayOutputStream();
/*     */     try {
/* 163 */       ImageIO.write(image, "png", out);
/* 164 */       return out.toByteArray();
/* 165 */     } catch (IOException e) {
/* 166 */       e.printStackTrace();
/* 167 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static GraphicsConfiguration getGraphicsConfiguration() {
/* 172 */     Window window = getTopLevelWindow();
/* 173 */     if (window != null) {
/* 174 */       return window.getGraphicsConfiguration();
/*     */     }
/* 176 */     return GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Result showFileChooser(int dialogType, String title, String currentDirectory, String approveButtonText, String defaultSelectedFileName, boolean fileHidingEnabled, String[][] suffixes, String[] descriptions, int fileFilterIndex, boolean[] exactNames, String[] questions, boolean[] questionPresets) {
/* 211 */     Result[] results = new Result[1];
/*     */     
/* 213 */     SecondaryLoop loop = createSecondaryLoop();
/* 214 */     CountDownLatch countDownLatch = new CountDownLatch(1);
/* 215 */     runWithSecondaryLoop(loop, countDownLatch, () -> {
/*     */           restoreFocus();
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
/*     */           showFileChooser0(dialogType, title, currentDirectory, approveButtonText, defaultSelectedFileName, fileHidingEnabled, suffixes, descriptions, fileFilterIndex, exactNames, questions, questionPresets, ());
/*     */         });
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
/* 240 */     return results[0];
/*     */   }
/*     */   
/*     */   private static void runWithSecondaryLoop(SecondaryLoop loop, CountDownLatch countDownLatch, Runnable runnable) {
/* 244 */     disableReordering0();
/*     */     try {
/* 246 */       executor.execute(runnable);
/* 247 */       loop.enter();
/*     */       try {
/* 249 */         countDownLatch.await();
/* 250 */       } catch (InterruptedException e) {
/* 251 */         e.printStackTrace();
/*     */       } 
/*     */     } finally {
/* 254 */       enableReordering0();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static SecondaryLoop createSecondaryLoop() {
/* 259 */     return Toolkit.getDefaultToolkit().getSystemEventQueue().createSecondaryLoop();
/*     */   }
/*     */   
/*     */   public static void prepareNonEdtError() {
/* 263 */     getIcon(Integer.valueOf(0));
/*     */   }
/*     */   
/*     */   public static void initDependencies() {
/* 267 */     new AlertCallbackImpl(Collections.emptyList(), Collections.emptyList(), null);
/* 268 */     init0();
/*     */   }
/*     */   
/*     */   public static boolean isDarkMode() {
/* 272 */     return (InstallerUtil.isMacOS() && isDarkMode0());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void setDarkMode(boolean darkMode) {
/* 277 */     if (InstallerUtil.isMacOS()) {
/* 278 */       if (EventQueue.isDispatchThread()) {
/* 279 */         setDarkMode0(darkMode);
/*     */       } else {
/*     */         try {
/* 282 */           EventQueue.invokeAndWait(() -> setDarkMode0(darkMode));
/* 283 */         } catch (Exception e) {
/* 284 */           e.printStackTrace();
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public static void addThemeChangedListener(Runnable runnable) {
/* 291 */     if (InstallerUtil.isMacOS()) {
/* 292 */       Thread thread = new Thread(() -> runThemeChangedListener0(runnable), "ThemeChangedListener");
/* 293 */       thread.setDaemon(true);
/* 294 */       thread.start();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Result
/*     */   {
/*     */     private String[] selectedPaths;
/*     */ 
/*     */ 
/*     */     
/*     */     private boolean[] answers;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Result(String[] selectedPaths, boolean[] answers) {
/* 313 */       this.selectedPaths = selectedPaths;
/* 314 */       this.answers = answers;
/*     */     }
/*     */     
/*     */     public String[] getSelectedPaths() {
/* 318 */       return this.selectedPaths;
/*     */     }
/*     */     
/*     */     public boolean[] getAnswers() {
/* 322 */       return this.answers;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 327 */       return "Result{selectedPaths=" + 
/* 328 */         Arrays.toString((Object[])this.selectedPaths) + ", answers=" + 
/* 329 */         Arrays.toString(this.answers) + '}';
/*     */     }
/*     */   }
/*     */   
/*     */   private static class CustomOptionPaneUI extends BasicOptionPaneUI {
/*     */     private CustomOptionPaneUI() {}
/*     */     
/*     */     protected Icon getIconForType(int messageType) {
/* 337 */       return super.getIconForType(messageType);
/*     */     }
/*     */   }
/*     */   
/*     */   private static class AlertCallbackImpl
/*     */     implements AlertCallback {
/*     */     private MacosUiHelper.MacosAlertResult result;
/*     */     private final List<String> reorderedButtonTitles;
/*     */     private final List<String> originalButtonTitles;
/*     */     private final SecondaryLoop loop;
/* 347 */     private final CountDownLatch countDownLatch = new CountDownLatch(1);
/*     */     
/*     */     public AlertCallbackImpl(List<String> reorderedButtonTitles, List<String> originalButtonTitles, SecondaryLoop loop) {
/* 350 */       this.reorderedButtonTitles = reorderedButtonTitles;
/* 351 */       this.originalButtonTitles = originalButtonTitles;
/* 352 */       this.loop = loop;
/*     */     }
/*     */     
/*     */     public synchronized MacosUiHelper.MacosAlertResult getResult() {
/* 356 */       return this.result;
/*     */     }
/*     */ 
/*     */     
/*     */     public synchronized void callback(int answer, boolean suppressionChecked) {
/* 361 */       String selectedButtonTitle = this.reorderedButtonTitles.get(answer);
/* 362 */       int selectedIndex = this.originalButtonTitles.indexOf(selectedButtonTitle);
/* 363 */       this.result = new MacosUiHelper.MacosAlertResult(selectedIndex, suppressionChecked);
/* 364 */       if (this.loop != null) {
/* 365 */         this.loop.exit();
/*     */       }
/* 367 */       this.countDownLatch.countDown();
/*     */     }
/*     */     
/*     */     public void await() {
/*     */       try {
/* 372 */         this.countDownLatch.await();
/* 373 */       } catch (InterruptedException e) {
/* 374 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public static class MacosAlertResult {
/*     */     private int answer;
/*     */     private boolean suppressionChecked;
/*     */     
/*     */     public MacosAlertResult(int answer, boolean suppressionChecked) {
/* 384 */       this.answer = answer;
/* 385 */       this.suppressionChecked = suppressionChecked;
/*     */     }
/*     */     
/*     */     public int getAnswer() {
/* 389 */       return this.answer;
/*     */     }
/*     */     
/*     */     public boolean isSuppressionChecked() {
/* 393 */       return this.suppressionChecked;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 398 */       return "MacosAlertResult{answer=" + this.answer + ", suppressionChecked=" + this.suppressionChecked + '}';
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/* 407 */     MacosAlertResult alertResult = showAlert("Test alert", "Do you really want to exit?\nNext line", new String[] { "Option 1", "Option 2", "Yes", "No" }, "Yes", "No", 0, null, true, false);
/* 408 */     System.err.println("selectedOption = " + alertResult);
/* 409 */     SwingUtilities.invokeLater(() -> {
/*     */           JFrame frame = new JFrame("test");
/*     */           
/*     */           frame.setBounds(200, 200, 1000, 800);
/*     */           
/*     */           frame.setDefaultCloseOperation(3);
/*     */           frame.setVisible(true);
/*     */           JDialog dialog = new JDialog(frame);
/*     */           dialog.setTitle("Dialog");
/*     */           dialog.setModal(true);
/*     */           dialog.setBounds(400, 400, 800, 600);
/*     */           dialog.addWindowListener(new WindowAdapter()
/*     */               {
/*     */                 public void windowOpened(WindowEvent e)
/*     */                 {
/* 424 */                   MacosUiHelper.MacosAlertResult alertResult1 = MacosUiHelper.showAlert("Test alert", "Do you really want to exit?\nNext line", new String[] { "Option 1", "Option 2", "Yes", "No" }, "Yes", "No", 0, null, true, true);
/* 425 */                   System.err.println("selectedOption = " + alertResult1);
/*     */                   
/* 427 */                   alertResult1 = MacosUiHelper.showAlert("Test alert", "Do you really want to exit?\nNext line", new String[] { "Option 1", "Option 2", "Yes", "No" }, "Yes", "No", 0, null, true, false);
/* 428 */                   System.err.println("selectedOption = " + alertResult1);
/*     */                 }
/*     */               });
/*     */           
/*     */           dialog.setVisible(true);
/*     */           
/*     */           File selectedFile = null;
/*     */           try {
/*     */             selectedFile = File.createTempFile("test", ".txt");
/*     */             selectedFile.deleteOnExit();
/* 438 */           } catch (IOException e) {
/*     */             e.printStackTrace();
/*     */           } 
/*     */           Result result = showFileChooser(1, "Choose snapshot", (selectedFile == null) ? null : selectedFile.getParent(), "Translate", (selectedFile == null) ? null : selectedFile.getName(), true, new String[][] { { "jps" }, , { "hprof", "hpz" }, , { "test.txt" },  }, new String[] { "JProfiler snapshots dasdjhg dhjasgjhdgajhsgd jahgsdj aghjdhgsd", "HPROF snapshots", "test.txt" }, 1, new boolean[] { false, false, true }, new String[] { "Customize options", "Open exported file" }, new boolean[] { false, true });
/*     */           System.err.println("result = " + result);
/*     */         });
/*     */   }
/*     */   
/*     */   private static native void disableReordering0();
/*     */   
/*     */   private static native void enableReordering0();
/*     */   
/*     */   private static native boolean isDarkMode0();
/*     */   
/*     */   private static native boolean setDarkMode0(boolean paramBoolean);
/*     */   
/*     */   private static native void runThemeChangedListener0(Runnable paramRunnable);
/*     */   
/*     */   private static native void init0();
/*     */   
/*     */   private static native void showAlert0(String paramString1, String paramString2, String[] paramArrayOfString, String paramString3, byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean1, boolean paramBoolean2, AlertCallback paramAlertCallback);
/*     */   
/*     */   private static native void showFileChooser0(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, String[][] paramArrayOfString, String[] paramArrayOfString1, int paramInt2, boolean[] paramArrayOfboolean1, String[] paramArrayOfString2, boolean[] paramArrayOfboolean2, FileSelectionCallback paramFileSelectionCallback);
/*     */   
/*     */   public static interface FileSelectionCallback {
/*     */     void callback(String[] param1ArrayOfString, boolean[] param1ArrayOfboolean);
/*     */   }
/*     */   
/*     */   public static interface AlertCallback {
/*     */     void callback(int param1Int, boolean param1Boolean);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\MacosUiHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */