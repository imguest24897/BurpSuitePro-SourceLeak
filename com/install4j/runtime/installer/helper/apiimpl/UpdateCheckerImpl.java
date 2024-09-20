/*    */ package com.install4j.runtime.installer.helper.apiimpl;
/*    */ 
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.api.update.UpdateCheckRequest;
/*    */ import com.install4j.api.update.UpdateDescriptor;
/*    */ import com.install4j.runtime.installer.config.update.UpdateDescriptorImpl;
/*    */ import com.install4j.runtime.installer.helper.content.Downloader;
/*    */ import com.install4j.runtime.launcher.integration.UpdateLog;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.net.URL;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UpdateCheckerImpl
/*    */ {
/*    */   public static UpdateDescriptor getUpdateDescriptor(UpdateCheckRequest request) throws UserCanceledException, IOException {
/* 18 */     Downloader downloader = new Downloader(request.getApplicationDisplayMode().getIntValue(), null); try {
/* 19 */       downloader.setAcceptAllCertificates(request.isAcceptAllCertificates());
/* 20 */       downloader.setConnectTimeout(request.getConnectTimeout());
/* 21 */       downloader.setReadTimeout(request.getReadTimeout());
/* 22 */       downloader.setErrorHandlingCallback(request.getErrorHandlingCallback());
/* 23 */       downloader.setRequestHeaders(request.getRequestHeaders());
/*    */       
/* 25 */       File tempFile = null;
/*    */       
/* 27 */       try { UpdateLog.log(10, "checking update at " + request.getUrlSpec());
/* 28 */         String urlSpec = request.getUrlSpec();
/*    */         
/* 30 */         tempFile = File.createTempFile("i4jupd", ".xml");
/* 31 */         downloader.connect(urlSpec).download(tempFile, -1L, true);
/*    */         
/* 33 */         UpdateDescriptorImpl updateDescriptor = new UpdateDescriptorImpl();
/* 34 */         updateDescriptor.read(tempFile, new URL(urlSpec));
/* 35 */         UpdateDescriptorImpl updateDescriptorImpl1 = updateDescriptor;
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 40 */         if (!Boolean.getBoolean("install4j.keepUpdateDescriptor") && tempFile != null)
/* 41 */           tempFile.delete();  return (UpdateDescriptor)updateDescriptorImpl1; } catch (Exception e) { UpdateLog.log(10, e); throw e; } finally { if (!Boolean.getBoolean("install4j.keepUpdateDescriptor") && tempFile != null) tempFile.delete();  }
/*    */     
/*    */     } catch (Throwable throwable) {
/*    */       try {
/*    */         downloader.close();
/*    */       } catch (Throwable throwable1) {
/*    */         throwable.addSuppressed(throwable1);
/*    */       } 
/*    */       throw throwable;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\apiimpl\UpdateCheckerImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */