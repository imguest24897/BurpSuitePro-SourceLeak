/*    */ package com.install4j.runtime.alert;
/*    */ 
/*    */ import com.install4j.runtime.installer.platform.macos.MacosUiHelper;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class MacosAlert<E>
/*    */   extends SplitMessageAlert<E>
/*    */ {
/*    */   protected Alert.InternalAlertResult showInternal(List<String> buttonTitles, String defaultButtonTitle, String cancelButtonTitle) {
/* 11 */     MacosUiHelper.MacosAlertResult result = MacosUiHelper.showAlert(
/* 12 */         getMainMessage(), 
/* 13 */         getContentMessage(), buttonTitles
/* 14 */         .<String>toArray(new String[0]), defaultButtonTitle, cancelButtonTitle, 
/*    */ 
/*    */         
/* 17 */         getAlertType().getOptionType(), null, 
/*    */         
/* 19 */         isSuppressionShown(), this.useSecondaryLoop);
/*    */ 
/*    */     
/* 22 */     return new Alert.InternalAlertResult(result.getAnswer(), result.isSuppressionChecked());
/*    */   }
/*    */ 
/*    */   
/*    */   protected String transformMessageText(String text) {
/* 27 */     return toWrappingText(super.transformMessageText(text));
/*    */   }
/*    */ 
/*    */   
/*    */   public void initDependencies() {
/* 32 */     super.initDependencies();
/* 33 */     if (!isNoNativeDialogs())
/* 34 */       MacosUiHelper.initDependencies(); 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\alert\MacosAlert.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */