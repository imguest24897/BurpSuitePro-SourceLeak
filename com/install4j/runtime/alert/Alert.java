/*     */ package com.install4j.runtime.alert;
/*     */ 
/*     */ import com.ejt.internal.CommonApplicationServices;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.platform.macos.MacosUiHelper;
/*     */ import com.install4j.runtime.util.I4jLibraryHelper;
/*     */ import java.awt.Component;
/*     */ import java.awt.Window;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.regex.Pattern;
/*     */ import javax.swing.SwingUtilities;
/*     */ import org.jetbrains.annotations.Nls;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class Alert<E>
/*     */ {
/*     */   private static final String PROPERTY_NO_NATIVE_DIALOGS_LEGACY = "ejt.noNativeDialogs";
/*  24 */   public static final Pattern NO_WRAP_PATTERN = Pattern.compile("[^\n ]{50,}");
/*  25 */   private static final Pattern WRAPPING_PATTERN = Pattern.compile("(?<![\n\t])\n(?!\n)"); public static final String RAW_MODIFIER = "(?raw)"; private Window parent;
/*     */   
/*     */   public static <E> Alert<E> create(Component parent, @Nls String title, @Nls String mainMessage, @Nls String contentMessage) {
/*     */     Alert<E> alert;
/*  29 */     if (mainMessage == null) {
/*  30 */       throw new IllegalArgumentException("main message must not be null");
/*     */     }
/*     */     
/*  33 */     if (isNoNativeDialogs()) {
/*  34 */       alert = new SwingAlert<>();
/*  35 */     } else if (Util.isMacOS()) {
/*  36 */       alert = new MacosAlert<>();
/*  37 */     } else if (Util.isAtLeastWindowsVista() && Boolean.getBoolean("ejt.nativeWindowsAlert") && I4jLibraryHelper.isI4jLibraryAvailable()) {
/*  38 */       alert = new WindowsAlert<>();
/*  39 */     } else if (isFrameworkParentWindow(parent) && !Boolean.getBoolean("ejt.forceSwingAlert")) {
/*  40 */       alert = new DefaultAlert<>();
/*     */     } else {
/*  42 */       alert = new SwingAlert<>();
/*     */     } 
/*  44 */     alert.parent(parent).title(title).mainMessage(mainMessage).contentMessage(contentMessage);
/*  45 */     alert.messagesSet();
/*  46 */     return alert;
/*     */   }
/*     */   private String title; private String mainMessage;
/*     */   public static String replaceTabs(String text) {
/*  50 */     if (text == null) {
/*  51 */       return null;
/*     */     }
/*  53 */     return text.replaceAll("\t\n", "\n").replaceAll("\t", "    ");
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean isNoNativeDialogs() {
/*  58 */     return (Boolean.getBoolean("install4j.noNativeDialogs") || Boolean.getBoolean("ejt.noNativeDialogs"));
/*     */   }
/*     */   
/*     */   public static void prepareNonEdtError() {
/*  62 */     if (!isNoNativeDialogs() && Util.isMacOS()) {
/*  63 */       MacosUiHelper.prepareNonEdtError();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void messagesSet() {}
/*     */ 
/*     */   
/*     */   public void initDependencies() {
/*  72 */     new InternalAlertResult(0, true);
/*  73 */     new AlertResult(new Object(), 0, true);
/*  74 */     AlertOptionPane.isDontShowAgain();
/*     */   }
/*     */   
/*     */   public static String conserveSingleLineBreaks(String contentMessage) {
/*  78 */     return contentMessage.replaceAll("\n", "\t\n");
/*     */   }
/*     */   
/*     */   private static boolean isFrameworkParentWindow(Component parent) {
/*  82 */     CommonApplicationServices applicationServices = CommonApplicationServices.getInstance();
/*  83 */     if (applicationServices == null) {
/*  84 */       return true;
/*     */     }
/*  86 */     Window window = getWindow(parent);
/*  87 */     return (window == null || applicationServices.isFrameworkWindow(window));
/*     */   }
/*     */ 
/*     */   
/*     */   protected static Window getWindow(Component parent) {
/*  92 */     if (parent == null)
/*  93 */       return null; 
/*  94 */     if (parent instanceof Window) {
/*  95 */       return (Window)parent;
/*     */     }
/*  97 */     return SwingUtilities.getWindowAncestor(parent);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean mainMessageRedundant = true;
/*     */   
/*     */   private String contentMessage;
/*     */   
/*     */   private boolean rawMode;
/*     */   
/* 107 */   private List<E> buttons = new ArrayList<>();
/*     */   private E defaultButton;
/*     */   private E cancelButton;
/* 110 */   private AlertType alertType = AlertType.INFORMATION; private boolean suppressionShown;
/*     */   protected boolean useSecondaryLoop = true;
/*     */   
/*     */   protected abstract InternalAlertResult showInternal(List<String> paramList, String paramString1, String paramString2);
/*     */   
/*     */   public AlertResult<E> show() {
/*     */     E selectedButton;
/* 117 */     if (this.parent != null) {
/* 118 */       this.parent.toFront();
/*     */     }
/*     */     
/* 121 */     List<String> buttonTitles = getButtonsTitles();
/* 122 */     InternalAlertResult internalAlertResult = showInternal(buttonTitles, getDefaultButtonTitle(), getCancelButtonTitle());
/* 123 */     AlertOptionPane.disposeTempFrame(this.parent);
/* 124 */     int answer = internalAlertResult.answer;
/*     */     
/* 126 */     if (answer >= 0 && answer < this.buttons.size()) {
/* 127 */       selectedButton = this.buttons.get(answer);
/*     */     } else {
/* 129 */       selectedButton = this.cancelButton;
/*     */     } 
/* 131 */     return new AlertResult<>(selectedButton, answer, internalAlertResult.suppressionSelected);
/*     */   }
/*     */   
/*     */   public Window getParent() {
/* 135 */     return this.parent;
/*     */   }
/*     */   
/*     */   public Alert<E> parent(Component parent) {
/* 139 */     this.parent = getWindow(parent);
/* 140 */     return this;
/*     */   }
/*     */   
/*     */   public String getTitle() {
/* 144 */     return this.title;
/*     */   }
/*     */   
/*     */   public Alert<E> title(@Nls String title) {
/* 148 */     this.title = title;
/* 149 */     return this;
/*     */   }
/*     */   
/*     */   public String getMainMessage() {
/* 153 */     return this.mainMessage;
/*     */   }
/*     */   
/*     */   public Alert<E> mainMessage(@Nls String mainMessage) {
/* 157 */     this.mainMessage = maybeTransformMessageText(mainMessage);
/* 158 */     return this;
/*     */   }
/*     */   
/*     */   public boolean isMainMessageRedundant() {
/* 162 */     return this.mainMessageRedundant;
/*     */   }
/*     */   
/*     */   public Alert<E> mainMessageRedundant(boolean mainMessageRedundant) {
/* 166 */     this.mainMessageRedundant = mainMessageRedundant;
/* 167 */     return this;
/*     */   }
/*     */   
/*     */   public String getContentMessage() {
/* 171 */     return this.contentMessage;
/*     */   }
/*     */   
/*     */   public Alert<E> contentMessage(@Nls String contentMessage) {
/* 175 */     this.contentMessage = maybeTransformMessageText(contentMessage);
/* 176 */     return this;
/*     */   }
/*     */   
/*     */   public boolean isRawMode() {
/* 180 */     return this.rawMode;
/*     */   }
/*     */   
/*     */   public Alert<E> rawMode(boolean rawMode) {
/* 184 */     this.rawMode = rawMode;
/* 185 */     return this;
/*     */   }
/*     */   
/*     */   private String maybeTransformMessageText(String messageText) {
/* 189 */     if (this.rawMode)
/* 190 */       return messageText; 
/* 191 */     if (messageText != null && messageText.startsWith("(?raw)")) {
/* 192 */       this.rawMode = true;
/* 193 */       return messageText.substring("(?raw)".length());
/*     */     } 
/* 195 */     return transformMessageText(messageText);
/*     */   }
/*     */ 
/*     */   
/*     */   public List<E> getButtons() {
/* 200 */     return this.buttons;
/*     */   }
/*     */   
/*     */   public Alert<E> buttons(List<E> buttons) {
/* 204 */     this.buttons = buttons;
/* 205 */     return this;
/*     */   }
/*     */   
/*     */   public Alert<E> addButton(E button) {
/* 209 */     this.buttons.add(button);
/* 210 */     return this;
/*     */   }
/*     */   
/*     */   public Alert<E> addButtons(E[] buttonArray) {
/* 214 */     this.buttons.addAll(Arrays.asList(buttonArray));
/* 215 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public Alert<E> addEnumButtons(E enumValue) {
/* 220 */     addButtons((E[])enumValue.getClass().getEnumConstants());
/* 221 */     return this;
/*     */   }
/*     */   
/*     */   public Alert<E> addDefaultButton(E button) {
/* 225 */     this.buttons.add(button);
/* 226 */     return defaultButton(button);
/*     */   }
/*     */   
/*     */   public Alert<E> addCancelButton(E button) {
/* 230 */     this.buttons.add(button);
/* 231 */     return cancelButton(button);
/*     */   }
/*     */   
/*     */   public E getDefaultButton() {
/* 235 */     return this.defaultButton;
/*     */   }
/*     */   
/*     */   public Alert<E> defaultButton(E defaultButton) {
/* 239 */     this.defaultButton = defaultButton;
/* 240 */     return this;
/*     */   }
/*     */   
/*     */   public E getCancelButton() {
/* 244 */     return this.cancelButton;
/*     */   }
/*     */   
/*     */   public Alert<E> cancelButton(E cancelButton) {
/* 248 */     this.cancelButton = cancelButton;
/* 249 */     return this;
/*     */   }
/*     */   
/*     */   public AlertType getAlertType() {
/* 253 */     return this.alertType;
/*     */   }
/*     */   
/*     */   public Alert<E> alertType(@NotNull AlertType alertType) {
/* 257 */     this.alertType = alertType;
/* 258 */     return this;
/*     */   }
/*     */   
/*     */   public boolean isSuppressionShown() {
/* 262 */     return this.suppressionShown;
/*     */   }
/*     */   
/*     */   public Alert<E> suppressionShown(boolean suppressionShown) {
/* 266 */     this.suppressionShown = suppressionShown;
/* 267 */     return this;
/*     */   }
/*     */   
/*     */   public Alert<E> useSecondaryLoop(boolean useSecondaryLoop) {
/* 271 */     this.useSecondaryLoop = useSecondaryLoop;
/* 272 */     return this;
/*     */   }
/*     */   
/*     */   private List<String> getButtonsTitles() {
/* 276 */     List<String> buttonTitles = new ArrayList<>();
/* 277 */     for (E button : this.buttons) {
/* 278 */       buttonTitles.add(button.toString());
/*     */     }
/* 280 */     if (buttonTitles.isEmpty()) {
/* 281 */       buttonTitles.add(Messages.getString(".ButtonOK"));
/*     */     }
/* 283 */     return buttonTitles;
/*     */   }
/*     */   
/*     */   private String getDefaultButtonTitle() {
/* 287 */     if (this.defaultButton != null) {
/* 288 */       return this.defaultButton.toString();
/*     */     }
/* 290 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private String getCancelButtonTitle() {
/* 295 */     if (this.cancelButton != null) {
/* 296 */       return this.cancelButton.toString();
/*     */     }
/* 298 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected String transformMessageText(String text) {
/* 303 */     return removeHtml(text);
/*     */   }
/*     */   
/*     */   protected String removeHtml(String text) {
/* 307 */     if (text != null && text.startsWith("<html>")) {
/* 308 */       text = text.replace("<html>|<\\?b>", "");
/* 309 */       text = text.replace("<br\\?>", "\n");
/*     */     } 
/* 311 */     return text;
/*     */   }
/*     */   
/*     */   protected String toWrappingText(String text) {
/* 315 */     if (text == null) {
/* 316 */       return null;
/*     */     }
/* 318 */     return replaceTabs(WRAPPING_PATTERN.matcher(text.replace("\r\n", "\n")).replaceAll(" "));
/*     */   }
/*     */   
/*     */   protected static class InternalAlertResult
/*     */   {
/*     */     private int answer;
/*     */     private boolean suppressionSelected;
/*     */     
/*     */     public InternalAlertResult(int answer, boolean suppressionSelected) {
/* 327 */       this.answer = answer;
/* 328 */       this.suppressionSelected = suppressionSelected;
/*     */     }
/*     */     
/*     */     public int getAnswer() {
/* 332 */       return this.answer;
/*     */     }
/*     */     
/*     */     public boolean isSuppressionSelected() {
/* 336 */       return this.suppressionSelected;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/* 342 */     create(null, "Title", "Main message", "This is the content message").addButtons(new Object[] { "OK", "Cancel" }).suppressionShown(true).show();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\alert\Alert.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */