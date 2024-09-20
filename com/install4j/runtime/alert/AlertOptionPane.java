/*     */ package com.install4j.runtime.alert;
/*     */ import com.ejt.internal.CommonApplicationServices;
/*     */ import com.install4j.api.Util;
/*     */ import java.awt.Component;
/*     */ import java.awt.Window;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.UIManager;
/*     */ import org.jetbrains.annotations.Nls;
/*     */ 
/*     */ public class AlertOptionPane extends JOptionPane {
/*     */   @Deprecated
/*  16 */   public static final String DONT_SHOW_AGAIN_MESSAGE = getDontShowAgainMessage();
/*     */   
/*     */   @Nls
/*     */   public static String getDontShowAgainMessage() {
/*  20 */     return Messages.getString(".AlertDontShowAgainLabel");
/*     */   }
/*     */   private static boolean overrideDontShowAgain = false;
/*     */   private static boolean externalDontShowAgain = false;
/*     */   private static JCheckBox chkDontShowAgain;
/*     */   
/*     */   public static boolean isOverrideDontShowAgain() {
/*  27 */     return overrideDontShowAgain;
/*     */   }
/*     */   
/*     */   public static void setOverrideDontShowAgain(boolean overrideDontShowAgain) {
/*  31 */     AlertOptionPane.overrideDontShowAgain = overrideDontShowAgain;
/*     */   }
/*     */   
/*     */   public static boolean isExternalDontShowAgain() {
/*  35 */     return externalDontShowAgain;
/*     */   }
/*     */   
/*     */   public static void setExternalDontShowAgain(boolean externalDontShowAgain) {
/*  39 */     AlertOptionPane.externalDontShowAgain = externalDontShowAgain;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void showMessageDialog(Component parentComponent, Object message, String title, int messageType, Icon icon) {
/*  50 */     showMessageDialog(parentComponent, message, title, messageType, icon, false);
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
/*     */   public static void showMessageDialog(Component parentComponent, Object message, String title, int messageType, Icon icon, boolean dontShowAgainOption) {
/*  65 */     showOptionDialogWithSuppression(parentComponent, message, title, -1, messageType, icon, null, null, null, dontShowAgainOption);
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
/*     */   public static int showOptionDialog(Component parentComponent, Object message, String title, int optionType, int messageType, Icon icon, Object[] options, Object initialValue, Object closedValue) {
/*  88 */     return showOptionDialogWithSuppression(parentComponent, message, title, optionType, messageType, icon, options, initialValue, closedValue, false);
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
/*     */   public static <E extends Enum<E>> E selectOption(Component parentComponent, Object message, String title, int optionType, int messageType, Icon icon, E initialSelection, E closedSelection, boolean dontShowAgainOption) {
/* 113 */     Enum[] arrayOfEnum = (Enum[])initialSelection.getClass().getEnumConstants();
/*     */     
/* 115 */     int result = showOptionDialogWithSuppression(parentComponent, message, title, optionType, messageType, icon, (Object[])arrayOfEnum, initialSelection, closedSelection, dontShowAgainOption);
/* 116 */     if (result == -1) {
/* 117 */       return closedSelection;
/*     */     }
/* 119 */     return (E)arrayOfEnum[result];
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
/*     */   public static int showOptionDialogWithSuppression(Component parentComponent, Object message, String title, int optionType, int messageType, Icon icon, Object[] options, Object initialValue, Object closedValue, boolean dontShowAgainOption) {
/* 135 */     overrideDontShowAgain = false;
/* 136 */     Window parentWindow = getOptionPaneParent(parentComponent);
/*     */     
/* 138 */     if (dontShowAgainOption) {
/* 139 */       message = new Object[] { message, createDontShowAgainCheckbox() };
/*     */     }
/*     */     
/* 142 */     JOptionPane pane = new JOptionPane(message, messageType, optionType, icon, options, initialValue);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 149 */     pane.setInitialValue(initialValue);
/*     */     
/* 151 */     JDialog dialog = pane.createDialog(parentWindow, title);
/* 152 */     dialog.setBackground(UIManager.getColor("control"));
/* 153 */     if (Util.isMacOS()) {
/* 154 */       ((JComponent)dialog.getContentPane()).setBorder(BorderFactory.createEmptyBorder(0, 0, 11, 0));
/*     */     }
/* 156 */     dialog.pack();
/*     */     
/* 158 */     pane.selectInitialValue();
/* 159 */     dialog.setVisible(true);
/* 160 */     disposeTempFrame(parentWindow);
/*     */     
/* 162 */     Object selectedValue = pane.getValue();
/* 163 */     int closedIndex = (options != null) ? Arrays.<Object>asList(options).indexOf(closedValue) : -1;
/*     */     
/* 165 */     if (selectedValue == null) {
/* 166 */       return closedIndex;
/*     */     }
/* 168 */     if (options == null) {
/* 169 */       if (selectedValue instanceof Integer) {
/* 170 */         return ((Integer)selectedValue).intValue();
/*     */       }
/* 172 */       return closedIndex;
/*     */     } 
/* 174 */     for (int i = 0, optionsCount = options.length; i < optionsCount; i++) {
/* 175 */       if (options[i].equals(selectedValue)) {
/* 176 */         return i;
/*     */       }
/*     */     } 
/* 179 */     return closedIndex;
/*     */   }
/*     */ 
/*     */   
/*     */   public static Window getOptionPaneParent(Component parentComponent) {
/* 184 */     Window parentWindow = null;
/* 185 */     if (parentComponent == null && Util.isWindows()) {
/* 186 */       parentWindow = new TempFrame();
/* 187 */     } else if (parentComponent instanceof Window) {
/* 188 */       parentWindow = (Window)parentComponent;
/* 189 */     } else if (parentComponent != null) {
/* 190 */       parentWindow = (Window)SwingUtilities.getAncestorOfClass(Window.class, parentComponent);
/*     */     } 
/* 192 */     CommonApplicationServices applicationServices = CommonApplicationServices.getInstance();
/* 193 */     if (applicationServices != null) {
/* 194 */       applicationServices.beforeAlertOn(parentWindow);
/*     */     }
/* 196 */     return parentWindow;
/*     */   }
/*     */   
/*     */   public static void disposeTempFrame(Window parentWindow) {
/* 200 */     if (parentWindow instanceof TempFrame) {
/* 201 */       parentWindow.dispose();
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean isDontShowAgain() {
/* 206 */     if (overrideDontShowAgain) {
/* 207 */       return externalDontShowAgain;
/*     */     }
/* 209 */     return (chkDontShowAgain != null && chkDontShowAgain.isSelected());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static JCheckBox createDontShowAgainCheckbox() {
/* 217 */     chkDontShowAgain = new JCheckBox(getDontShowAgainMessage());
/* 218 */     chkDontShowAgain.setFont(UIManager.getFont("OptionPane.font"));
/* 219 */     chkDontShowAgain.setSelected(false);
/* 220 */     chkDontShowAgain.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
/*     */     
/* 222 */     return chkDontShowAgain;
/*     */   }
/*     */   
/*     */   public static void clearDontShowAgainCheckbox() {
/* 226 */     chkDontShowAgain = null;
/*     */   }
/*     */   public static interface ParentWindowHandler {
/*     */     void handleParentWindow(Window param1Window); }
/*     */   public static class TempFrame extends JFrame { public TempFrame() {
/* 231 */       super(getApplicationName());
/* 232 */       setUndecorated(true);
/* 233 */       setVisible(true);
/* 234 */       setLocationRelativeTo(null);
/* 235 */       CommonApplicationServices applicationServices = CommonApplicationServices.getInstance();
/* 236 */       if (applicationServices != null) {
/* 237 */         setIconImages(applicationServices.getWindowImageIcons());
/*     */       }
/*     */     }
/*     */     
/*     */     private static String getApplicationName() {
/* 242 */       CommonApplicationServices applicationServices = CommonApplicationServices.getInstance();
/* 243 */       return (applicationServices != null) ? applicationServices.getApplicationName() : "";
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\alert\AlertOptionPane.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */