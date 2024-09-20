/*    */ package com.install4j.runtime.beans.actions.xml;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import org.w3c.dom.NodeList;
/*    */ 
/*    */ 
/*    */ public class XPathCountAction
/*    */   extends AbstractXPathReadAction
/*    */ {
/*    */   protected boolean handleNodeList(NodeList nodeList, Context context) {
/* 11 */     int count = (nodeList == null) ? 0 : nodeList.getLength();
/* 12 */     context.setVariable(getVariableName(), Integer.valueOf(count));
/* 13 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\xml\XPathCountAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */