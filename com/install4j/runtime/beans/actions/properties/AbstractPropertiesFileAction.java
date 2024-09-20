/*    */ package com.install4j.runtime.beans.actions.properties;
/*    */ 
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ import java.io.File;
/*    */ 
/*    */ public abstract class AbstractPropertiesFileAction
/*    */   extends SystemInstallOrUninstallAction
/*    */ {
/*    */   private File file;
/* 10 */   private PropertiesFileEncoding encoding = PropertiesFileEncoding.UTF8;
/* 11 */   private String charsetName = "";
/*    */   
/*    */   public File getFile() {
/* 14 */     return (File)replaceWithTextOverride("file", replaceVariables(this.file), File.class);
/*    */   }
/*    */   
/*    */   public void setFile(File file) {
/* 18 */     this.file = file;
/*    */   }
/*    */   
/*    */   public PropertiesFileEncoding getEncoding() {
/* 22 */     return (PropertiesFileEncoding)replaceWithTextOverride("encoding", this.encoding, PropertiesFileEncoding.class);
/*    */   }
/*    */   
/*    */   public void setEncoding(PropertiesFileEncoding encoding) {
/* 26 */     this.encoding = encoding;
/*    */   }
/*    */   
/*    */   public String getCharsetName() {
/* 30 */     return replaceVariables(replaceVariables(this.charsetName));
/*    */   }
/*    */   
/*    */   public void setCharsetName(String charsetName) {
/* 34 */     this.charsetName = charsetName;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\properties\AbstractPropertiesFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */