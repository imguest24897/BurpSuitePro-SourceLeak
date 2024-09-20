/*    */ package com.sun.javafx.binding;
/*    */ 
/*    */ import java.util.function.Predicate;
/*    */ import javafx.beans.WeakListener;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ExpressionHelperBase
/*    */ {
/*    */   protected static int trim(int paramInt, Object[] paramArrayOfObject) {
/* 34 */     Predicate<Object> predicate = paramObject -> (paramObject instanceof WeakListener && ((WeakListener)paramObject).wasGarbageCollected());
/*    */     
/* 36 */     byte b = 0;
/* 37 */     for (; b < paramInt && 
/* 38 */       !predicate.test(paramArrayOfObject[b]); b++);
/*    */ 
/*    */ 
/*    */     
/* 42 */     if (b < paramInt) {
/* 43 */       int i; for (i = b + 1; i < paramInt; i++) {
/* 44 */         if (!predicate.test(paramArrayOfObject[i])) {
/* 45 */           paramArrayOfObject[b++] = paramArrayOfObject[i];
/*    */         }
/*    */       } 
/* 48 */       i = paramInt;
/* 49 */       paramInt = b;
/* 50 */       for (; b < i; b++) {
/* 51 */         paramArrayOfObject[b] = null;
/*    */       }
/*    */     } 
/*    */     
/* 55 */     return paramInt;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\ExpressionHelperBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */