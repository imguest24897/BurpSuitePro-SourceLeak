/*    */ package com.install4j.runtime.installer.helper.content;
/*    */ import com.exe4j.runtime.util.FileUtil;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.ProgressInterface;
/*    */ import com.install4j.runtime.beans.actions.net.HttpUploadMethod;
/*    */ import java.io.BufferedInputStream;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class Uploader extends TransferFileHandler {
/* 13 */   private HttpUploadMethod uploadMethod = HttpUploadMethod.POST;
/*    */   
/*    */   public Uploader(Context context, ProgressInterface progressInterface) {
/* 16 */     super(context, progressInterface);
/*    */   }
/*    */   
/*    */   public Uploader(int mode, ProgressInterface progressInterface) {
/* 20 */     super(mode, progressInterface);
/*    */   }
/*    */   
/*    */   public void setUploadMethod(HttpUploadMethod uploadMethod) {
/* 24 */     this.uploadMethod = uploadMethod;
/*    */   }
/*    */ 
/*    */   
/*    */   public int upload(String urlString, File file) throws IOException, UserCanceledException {
/* 29 */     setFileSize(file.length());
/*    */     
/* 31 */     connect(urlString, connection -> {
/*    */           connection.setRequestMethod(this.uploadMethod.getMethodName()); connection.setRequestProperty("Content-Type", "application/octet-stream"); connection.setRequestProperty("Accept", "application/octet-stream"); connection.setRequestProperty("User-Agent", "Transport"); connection.setRequestProperty("Cache-Control", "no-cache"); connection.setDoOutput(getFileSize());
/*    */           OutputStream out = connection.getOutputStream();
/*    */           
/*    */           try { BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
/*    */             
/*    */             try { FileUtil.pumpStream(in, getFileSize(), true, out, (), false);
/*    */               in.close(); }
/* 39 */             catch (Throwable throwable) { try { in.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }  if (out != null) out.close();  } catch (Throwable throwable) { if (out != null) try { out.close(); } catch (Throwable throwable1)
/*    */               { throwable.addSuppressed(throwable1); }
/*    */             
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/*    */             throw throwable; }
/*    */         
/*    */         });
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 55 */     return getConnection().getResponseCode();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\Uploader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */