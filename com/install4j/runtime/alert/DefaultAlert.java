/*    */ package com.install4j.runtime.alert;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ public class DefaultAlert<E>
/*    */   extends SplitMessageAlert<E> {
/*    */   protected Alert.InternalAlertResult showInternal(List<String> buttonTitles, String defaultButtonTitle, String cancelButtonTitle) {
/*  8 */     int defaultButtonIndex = buttonTitles.indexOf(defaultButtonTitle);
/*  9 */     int cancelButtonIndex = buttonTitles.indexOf(cancelButtonTitle);
/*    */     
/* 11 */     int answer = DefaultAlertDialog.show(
/* 12 */         getParent(), 
/* 13 */         getAlertType(), 
/* 14 */         getTitle(), 
/* 15 */         getMainMessage(), 
/* 16 */         getContentMessage(), buttonTitles, defaultButtonIndex, cancelButtonIndex, 
/*    */ 
/*    */ 
/*    */         
/* 20 */         isSuppressionShown(), 
/* 21 */         isRawMode());
/*    */     
/* 23 */     return new Alert.InternalAlertResult(answer, (isSuppressionShown() && DefaultAlertDialog.isDoNotShowAgain()));
/*    */   }
/*    */ 
/*    */   
/*    */   protected String transformMessageText(String text) {
/* 28 */     return toWrappingText(super.transformMessageText(text));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\alert\DefaultAlert.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */