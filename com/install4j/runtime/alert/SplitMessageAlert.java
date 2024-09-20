/*    */ package com.install4j.runtime.alert;
/*    */ 
/*    */ public abstract class SplitMessageAlert<E>
/*    */   extends Alert<E>
/*    */ {
/*    */   protected void messagesSet() {
/*  7 */     super.messagesSet();
/*    */     
/*  9 */     String mainMessage = getMainMessage();
/* 10 */     String contentMessage = getContentMessage();
/* 11 */     if (contentMessage == null && mainMessage.contains("\n")) {
/*    */       
/* 13 */       int splitPosition, firstDotPosition = mainMessage.indexOf(". ");
/* 14 */       int firstLineBreakPosition = mainMessage.indexOf('\n');
/*    */ 
/*    */       
/* 17 */       if (firstDotPosition > 0 && firstDotPosition < firstLineBreakPosition) {
/* 18 */         splitPosition = firstDotPosition + 1;
/*    */       } else {
/* 20 */         splitPosition = firstLineBreakPosition;
/*    */       } 
/* 22 */       contentMessage(mainMessage.substring(splitPosition).trim());
/* 23 */       mainMessage(mainMessage.substring(0, splitPosition));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\alert\SplitMessageAlert.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */