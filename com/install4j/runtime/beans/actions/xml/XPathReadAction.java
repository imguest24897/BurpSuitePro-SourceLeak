/*    */ package com.install4j.runtime.beans.actions.xml;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import org.w3c.dom.Node;
/*    */ import org.w3c.dom.NodeList;
/*    */ 
/*    */ public class XPathReadAction
/*    */   extends AbstractXPathReadAction {
/* 10 */   private String nodeVariableName = "";
/*    */   
/*    */   public String getNodeVariableName() {
/* 13 */     return replaceVariables(this.nodeVariableName);
/*    */   }
/*    */   
/*    */   public void setNodeVariableName(String nodeVariableName) {
/* 17 */     this.nodeVariableName = nodeVariableName;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean handleNodeList(NodeList nodeList, Context context) {
/* 22 */     if (nodeList == null) {
/* 23 */       return false;
/*    */     }
/*    */     
/* 26 */     if (nodeList.getLength() == 0) {
/* 27 */       Logger.getInstance().log(this, "No nodes found for XPath " + getXpathExpression(), false);
/* 28 */       return false;
/*    */     } 
/*    */     
/* 31 */     Node node = nodeList.item(0);
/* 32 */     String nodeVariableName = getNodeVariableName();
/* 33 */     if (nodeVariableName.length() > 0) {
/* 34 */       context.setVariable(nodeVariableName, node);
/*    */     }
/* 36 */     context.setVariable(getVariableName(), node.getNodeValue());
/* 37 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\xml\XPathReadAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */