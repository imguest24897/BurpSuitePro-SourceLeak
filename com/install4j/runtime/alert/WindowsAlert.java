/*    */ package com.install4j.runtime.alert;
/*    */ 
/*    */ import com.install4j.runtime.installer.platform.win32.VistaTaskDialog;
/*    */ import com.install4j.runtime.util.SecondaryLoopHelper;
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ public class WindowsAlert<E>
/*    */   extends SplitMessageAlert<E>
/*    */ {
/*    */   protected Alert.InternalAlertResult showInternal(List<String> buttonTitles, String defaultButtonTitle, String cancelButtonTitle) {
/* 13 */     if (this.useSecondaryLoop) {
/* 14 */       return (Alert.InternalAlertResult)SecondaryLoopHelper.executeWithSecondaryLoop(() -> showDirect(buttonTitles, defaultButtonTitle, cancelButtonTitle));
/*    */     }
/* 16 */     return showDirect(buttonTitles, defaultButtonTitle, cancelButtonTitle);
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private Alert.InternalAlertResult showDirect(List<String> buttonTitles, String defaultButtonTitle, String cancelButtonTitle) {
/* 22 */     int flags = 8;
/* 23 */     String contentMessage = getContentMessage();
/* 24 */     if (contentMessage != null && NO_WRAP_PATTERN.matcher(contentMessage).find()) {
/* 25 */       flags |= 0x1000000;
/*    */     }
/* 27 */     VistaTaskDialog.Selection selection = VistaTaskDialog.show(getParent(), getTitle(), getMainMessage(), contentMessage, flags, 
/*    */         
/* 29 */         VistaTaskDialog.getFromOptionPaneType(getAlertType().getOptionType()), 0, 
/*    */         
/* 31 */         isSuppressionShown() ? AlertOptionPane.getDontShowAgainMessage() : null, 
/* 32 */         getButtonIndex(buttonTitles, defaultButtonTitle), 
/* 33 */         getButtonIndex(buttonTitles, cancelButtonTitle), buttonTitles
/* 34 */         .<String>toArray(new String[0]));
/* 35 */     return new Alert.InternalAlertResult(selection.getButton(), selection.isCheckboxSelected());
/*    */   }
/*    */   
/*    */   private static int getButtonIndex(List<String> buttonTitles, String title) {
/* 39 */     for (int i = 0; i < buttonTitles.size(); i++) {
/* 40 */       if (((String)buttonTitles.get(i)).equals(title)) {
/* 41 */         return i;
/*    */       }
/*    */     } 
/* 44 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   protected String transformMessageText(String text) {
/* 49 */     return toWrappingText(super.transformMessageText(text));
/*    */   }
/*    */ 
/*    */   
/*    */   public void initDependencies() {
/* 54 */     super.initDependencies();
/* 55 */     if (!isNoNativeDialogs())
/* 56 */       VistaTaskDialog.initDependencies(); 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\alert\WindowsAlert.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */