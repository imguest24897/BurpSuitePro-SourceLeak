/*    */ package com.install4j.runtime.beans.actions.xml;
/*    */ 
/*    */ import com.install4j.runtime.beans.actions.files.AbstractModifyFileAction;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import com.install4j.runtime.installer.helper.XmlHelper;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import org.w3c.dom.Document;
/*    */ import org.w3c.dom.NodeList;
/*    */ 
/*    */ public abstract class AbstractModifyXmlFileAction
/*    */   extends AbstractModifyFileAction
/*    */ {
/*    */   private boolean downloadExternalEntities = false;
/*    */   private boolean validating = false;
/*    */   
/*    */   public boolean isDownloadExternalEntities() {
/* 18 */     return replaceWithTextOverride("downloadExternalEntities", this.downloadExternalEntities);
/*    */   }
/*    */   
/*    */   public void setDownloadExternalEntities(boolean downloadExternalEntities) {
/* 22 */     this.downloadExternalEntities = downloadExternalEntities;
/*    */   }
/*    */   
/*    */   public boolean isValidating() {
/* 26 */     return replaceWithTextOverride("validating", this.validating);
/*    */   }
/*    */   
/*    */   public void setValidating(boolean validating) {
/* 30 */     this.validating = validating;
/*    */   }
/*    */   
/*    */   protected Document parseFile(File file) throws IOException {
/* 34 */     return XmlHelper.parseFile(file, isValidating(), isDownloadExternalEntities());
/*    */   }
/*    */   
/*    */   protected NodeList applyXpath(Document doc, String xpathExpression) {
/* 38 */     NodeList nodeList = XmlHelper.getNodeList(doc, xpathExpression);
/* 39 */     if (nodeList == null) {
/* 40 */       return null;
/*    */     }
/*    */     
/* 43 */     if (nodeList.getLength() == 0) {
/* 44 */       Logger.getInstance().log(this, "No nodes found for XPath " + xpathExpression, false);
/* 45 */       return null;
/*    */     } 
/* 47 */     return nodeList;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\xml\AbstractModifyXmlFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */