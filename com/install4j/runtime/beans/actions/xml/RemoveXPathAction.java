/*    */ package com.install4j.runtime.beans.actions.xml;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.helper.XmlHelper;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import org.w3c.dom.Attr;
/*    */ import org.w3c.dom.Document;
/*    */ import org.w3c.dom.Node;
/*    */ import org.w3c.dom.NodeList;
/*    */ 
/*    */ public class RemoveXPathAction
/*    */   extends AbstractModifyMultipleXmlFilesAction
/*    */ {
/*    */   private String xpathExpression;
/*    */   
/*    */   public String getXpathExpression() {
/* 19 */     return replaceVariables(replaceVariables(this.xpathExpression));
/*    */   }
/*    */   
/*    */   public void setXpathExpression(String xpathExpression) {
/* 23 */     this.xpathExpression = xpathExpression;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean modifyFile(File file, Context context) throws IOException, UserCanceledException {
/* 28 */     Document document = parseFile(file);
/* 29 */     NodeList nodeList = applyXpath(document, getXpathExpression());
/* 30 */     if (nodeList == null) {
/* 31 */       return false;
/*    */     }
/*    */     
/* 34 */     for (int i = 0; i < nodeList.getLength(); i++) {
/* 35 */       Node node = nodeList.item(i);
/* 36 */       if (node.getNodeType() == 2) {
/* 37 */         Attr attr = (Attr)node;
/* 38 */         attr.getOwnerElement().removeAttributeNode(attr);
/*    */       } else {
/* 40 */         Node parentNode = node.getParentNode();
/* 41 */         if (parentNode != null) {
/* 42 */           parentNode.removeChild(node);
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 47 */     XmlHelper.writeFile(file, document);
/*    */     
/* 49 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\xml\RemoveXPathAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */