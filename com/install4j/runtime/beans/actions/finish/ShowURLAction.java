/*    */ package com.install4j.runtime.beans.actions.finish;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*    */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*    */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*    */ import java.net.MalformedURLException;
/*    */ import java.net.URL;
/*    */ 
/*    */ public class ShowURLAction
/*    */   extends SystemInstallOrUninstallAction
/*    */ {
/*    */   private String urlSpec;
/*    */   
/*    */   public String getUrlSpec() {
/* 18 */     return replaceVariables(this.urlSpec);
/*    */   }
/*    */   
/*    */   public void setUrlSpec(String urlSpec) {
/* 22 */     this.urlSpec = urlSpec;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) {
/*    */     try {
/* 28 */       return executeUnelevated(new URL(replaceVariables(getUrlSpec())));
/* 29 */     } catch (MalformedURLException e) {
/* 30 */       e.printStackTrace();
/* 31 */       return false;
/*    */     } 
/*    */   }
/*    */   
/*    */   private static boolean executeUnelevated(final URL url) {
/* 36 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*    */         {
/*    */           protected boolean fetchValue(Context context) throws Exception {
/* 39 */             return GUIHelper.showURL(url.toExternalForm());
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 46 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\finish\ShowURLAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */