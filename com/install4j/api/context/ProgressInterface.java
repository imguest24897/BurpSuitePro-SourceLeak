/*     */ package com.install4j.api.context;
/*     */ 
/*     */ import java.io.File;
/*     */ import org.jetbrains.annotations.Nls;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface ProgressInterface
/*     */ {
/*     */   public static final int OVERWRITE_NO = 1;
/*     */   public static final int OVERWRITE_YES = 2;
/*     */   public static final int OVERWRITE_ALL = 3;
/*     */   public static final int OVERWRITE_NEVER = 4;
/*     */   public static final int RETRY_NO = 1;
/*     */   public static final int RETRY_YES = 2;
/*     */   public static final int RETRY_CANCEL = 3;
/*     */   
/*     */   void setStatusMessage(@Nls String paramString);
/*     */   
/*     */   void setDetailMessage(@Nls String paramString);
/*     */   
/*     */   void setPercentCompleted(int paramInt);
/*     */   
/*     */   int getPercentCompleted();
/*     */   
/*     */   void setSecondaryPercentCompleted(int paramInt);
/*     */   
/*     */   void setIndeterminateProgress(boolean paramBoolean);
/*     */   
/*     */   void showFailure(String paramString);
/*     */   
/*     */   int askOverwrite(File paramFile) throws UserCanceledException;
/*     */   
/*     */   int askRetry(File paramFile) throws UserCanceledException;
/*     */   
/*     */   boolean askContinue(File paramFile) throws UserCanceledException;
/*     */   
/*     */   default boolean isUnattendedProgressDialog() {
/* 138 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default boolean isAlertsShown() {
/* 147 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\context\ProgressInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */