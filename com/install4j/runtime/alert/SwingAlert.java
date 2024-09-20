/*    */ package com.install4j.runtime.alert;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ class SwingAlert<E>
/*    */   extends Alert<E>
/*    */ {
/*    */   protected Alert.InternalAlertResult showInternal(List<String> buttonTitles, String defaultButtonTitle, String cancelButtonTitle) {
/* 11 */     int answer = AlertOptionPane.showOptionDialogWithSuppression(
/* 12 */         getParent(), 
/* 13 */         getCombinedMessage(), 
/* 14 */         getTitle(), 0, 
/*    */         
/* 16 */         getAlertType().getOptionType(), null, buttonTitles
/*    */         
/* 18 */         .toArray(), defaultButtonTitle, cancelButtonTitle, 
/*    */ 
/*    */         
/* 21 */         isSuppressionShown());
/*    */ 
/*    */     
/* 24 */     return new Alert.InternalAlertResult(answer, (isSuppressionShown() && AlertOptionPane.isDontShowAgain()));
/*    */   }
/*    */   
/*    */   private String getCombinedMessage() {
/* 28 */     String contentMessage = getContentMessage();
/* 29 */     if (isNonEmpty(contentMessage)) {
/* 30 */       if (isMainMessageRedundant()) {
/* 31 */         return contentMessage;
/*    */       }
/* 33 */       return getMainMessage() + "\n\n" + contentMessage;
/*    */     } 
/*    */     
/* 36 */     return getMainMessage();
/*    */   }
/*    */ 
/*    */   
/*    */   private boolean isNonEmpty(String contentMessage) {
/* 41 */     return (contentMessage != null && !contentMessage.isEmpty());
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\alert\SwingAlert.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */