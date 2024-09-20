/*    */ package com.install4j.runtime.beans.actions.desktop;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*    */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.FetchStringAction;
/*    */ import com.install4j.runtime.installer.helper.launching.DirectOutputRedirection;
/*    */ import com.install4j.runtime.installer.helper.launching.LaunchDescriptor;
/*    */ import com.install4j.runtime.installer.helper.launching.LaunchHelper;
/*    */ import com.install4j.runtime.installer.helper.launching.OutputRedirection;
/*    */ import com.install4j.runtime.util.StringUtil;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class GSettingsHelper
/*    */ {
/* 18 */   public static final File G_SETTINGS_EXECUTABLE = new File("/usr/bin/gsettings");
/*    */   
/*    */   public static boolean isAvailable() {
/* 21 */     return G_SETTINGS_EXECUTABLE.isFile();
/*    */   }
/*    */   
/*    */   public static String getString(final String schema, final String key) throws UserCanceledException, IOException {
/* 25 */     if (isAvailable()) {
/* 26 */       return HelperCommunication.getInstance().fetchStringChecked(ExecutionContext.UNELEVATED, new FetchStringAction()
/*    */           {
/*    */             protected String fetchValue(Context context) throws Exception {
/* 29 */               LaunchHelper.LaunchResult launchResult = LaunchHelper.launchApplicationWithResult((new LaunchDescriptor(GSettingsHelper.G_SETTINGS_EXECUTABLE))
/* 30 */                   .arguments(new String[] { "get", this.val$schema, this.val$key }).wait(true).waitForStreams(true).stdoutRedirection((OutputRedirection)new DirectOutputRedirection()));
/* 31 */               if (launchResult == null)
/* 32 */                 throw new IOException("could not execute gsettings"); 
/* 33 */               if (launchResult.getReturnCode() != 0)
/* 34 */                 return null; 
/* 35 */               if (launchResult.getOutput() == null) {
/* 36 */                 throw new IOException("gsettings returned no output");
/*    */               }
/* 38 */               for (String line : StringUtil.getLines(launchResult.getOutput())) {
/* 39 */                 String trimmed = line.trim();
/* 40 */                 if (trimmed.startsWith("'") && trimmed.endsWith("'")) {
/* 41 */                   return trimmed.substring(1, trimmed.length() - 1);
/*    */                 }
/*    */               } 
/* 44 */               return null;
/*    */             }
/*    */           });
/*    */     }
/*    */     
/* 49 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\desktop\GSettingsHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */