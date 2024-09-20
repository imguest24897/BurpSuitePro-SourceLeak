/*    */ package com.install4j.runtime.beans.actions.xml;
/*    */ 
/*    */ import com.install4j.api.beans.ExternalFile;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import com.install4j.runtime.installer.helper.XmlHelper;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import javax.xml.transform.Transformer;
/*    */ import javax.xml.transform.TransformerException;
/*    */ import javax.xml.transform.TransformerFactory;
/*    */ import javax.xml.transform.stream.StreamSource;
/*    */ import org.w3c.dom.Document;
/*    */ 
/*    */ public class XsltAction
/*    */   extends AbstractModifyXmlFileAction
/*    */ {
/*    */   private File file;
/*    */   private File sourceFile;
/*    */   private ExternalFile xlstFile;
/*    */   
/*    */   public File getFile() {
/* 24 */     return (File)replaceWithTextOverride("file", replaceVariables(this.file), File.class);
/*    */   }
/*    */   
/*    */   public void setFile(File file) {
/* 28 */     this.file = file;
/*    */   }
/*    */   
/*    */   public File getSourceFile() {
/* 32 */     return (File)replaceWithTextOverride("sourceFile", replaceVariables(this.sourceFile), File.class);
/*    */   }
/*    */   
/*    */   public void setSourceFile(File sourceFile) {
/* 36 */     this.sourceFile = sourceFile;
/*    */   }
/*    */   
/*    */   public ExternalFile getXlstFile() {
/* 40 */     return (ExternalFile)replaceWithTextOverride("xlstFile", this.xlstFile, ExternalFile.class);
/*    */   }
/*    */   
/*    */   public void setXlstFile(ExternalFile xlstFile) {
/* 44 */     this.xlstFile = xlstFile;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 49 */     return executeForSingleFile(context, getFile());
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean modifyFile(File file, Context context) throws IOException {
/*    */     try {
/* 55 */       Document doc = parseFile(context.getDestinationFile(getSourceFile()));
/*    */       
/* 57 */       Transformer transformer = TransformerFactory.newInstance().newTransformer(new StreamSource(context
/* 58 */             .getExternalFile(getXlstFile(), false)));
/*    */       
/* 60 */       XmlHelper.writeFile(file, doc, transformer);
/* 61 */       return true;
/* 62 */     } catch (TransformerException e) {
/* 63 */       Logger.getInstance().log(e);
/*    */       
/* 65 */       return false;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\xml\XsltAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */