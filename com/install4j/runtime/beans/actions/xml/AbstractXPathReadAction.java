/*    */ package com.install4j.runtime.beans.actions.xml;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import com.install4j.runtime.installer.helper.XmlHelper;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import org.w3c.dom.Document;
/*    */ import org.w3c.dom.NodeList;
/*    */ 
/*    */ public abstract class AbstractXPathReadAction
/*    */   extends SystemInstallOrUninstallAction
/*    */ {
/*    */   private File file;
/*    */   private String xpathExpression;
/*    */   private String variableName;
/*    */   
/*    */   public File getFile() {
/* 21 */     return (File)replaceWithTextOverride("file", replaceVariables(this.file), File.class);
/*    */   }
/*    */   
/*    */   public void setFile(File file) {
/* 25 */     this.file = file;
/*    */   }
/*    */   
/*    */   public String getXpathExpression() {
/* 29 */     return replaceVariables(replaceVariables(this.xpathExpression));
/*    */   }
/*    */   
/*    */   public void setXpathExpression(String xpathExpression) {
/* 33 */     this.xpathExpression = xpathExpression;
/*    */   }
/*    */   
/*    */   public String getVariableName() {
/* 37 */     return replaceVariables(this.variableName);
/*    */   }
/*    */   
/*    */   public void setVariableName(String variableName) {
/* 41 */     this.variableName = variableName;
/*    */   }
/*    */ 
/*    */   
/*    */   protected abstract boolean handleNodeList(NodeList paramNodeList, Context paramContext);
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 48 */     File usedFile = context.getDestinationFile(getFile());
/*    */     try {
/* 50 */       Document document = XmlHelper.parseFile(usedFile, false, false);
/*    */       
/* 52 */       NodeList nodeList = XmlHelper.getNodeList(document, getXpathExpression());
/* 53 */       return handleNodeList(nodeList, context);
/* 54 */     } catch (IOException e) {
/* 55 */       Logger.getInstance().log(e);
/* 56 */       return false;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 62 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\xml\AbstractXPathReadAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */