/*     */ package com.install4j.runtime.beans.actions.xml;
/*     */ 
/*     */ import com.install4j.api.beans.PropertyLoggingInterceptor;
/*     */ import com.install4j.api.beans.ReplacementMode;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.XmlHelper;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Node;
/*     */ import org.w3c.dom.NodeList;
/*     */ 
/*     */ public class XPathReplaceAction
/*     */   extends AbstractModifyMultipleXmlFilesAction
/*     */   implements PropertyLoggingInterceptor {
/*     */   private String xpathExpression;
/*  18 */   private String regex = ".*";
/*     */   private String replacement;
/*     */   private boolean replaceAll = false;
/*     */   private boolean quoteVariables = true;
/*     */   private boolean logReplacement = true;
/*     */   
/*     */   public String getXpathExpression() {
/*  25 */     return replaceVariables(replaceVariables(this.xpathExpression));
/*     */   }
/*     */   
/*     */   public void setXpathExpression(String xpathExpression) {
/*  29 */     this.xpathExpression = xpathExpression;
/*     */   }
/*     */   
/*     */   public String getRegex() {
/*  33 */     return replaceVariables(replaceVariables(this.regex, isQuoteVariables() ? ReplacementMode.REGEXP_MATCH : ReplacementMode.PLAIN));
/*     */   }
/*     */   
/*     */   public void setRegex(String regex) {
/*  37 */     this.regex = regex;
/*     */   }
/*     */   
/*     */   public String getReplacement() {
/*  41 */     return replaceVariables(replaceVariables(this.replacement, isQuoteVariables() ? ReplacementMode.REGEXP_REPLACEMENT : ReplacementMode.PLAIN));
/*     */   }
/*     */   
/*     */   public void setReplacement(String replacement) {
/*  45 */     this.replacement = replacement;
/*     */   }
/*     */   
/*     */   public boolean isReplaceAll() {
/*  49 */     return replaceWithTextOverride("replaceAll", this.replaceAll);
/*     */   }
/*     */   
/*     */   public void setReplaceAll(boolean replaceAll) {
/*  53 */     this.replaceAll = replaceAll;
/*     */   }
/*     */   
/*     */   public boolean isQuoteVariables() {
/*  57 */     return replaceWithTextOverride("quoteVariables", this.quoteVariables);
/*     */   }
/*     */   
/*     */   public void setQuoteVariables(boolean quoteVariables) {
/*  61 */     this.quoteVariables = quoteVariables;
/*     */   }
/*     */   
/*     */   public boolean isLogReplacement() {
/*  65 */     return replaceWithTextOverride("logReplacement", this.logReplacement);
/*     */   }
/*     */   
/*     */   public void setLogReplacement(boolean logReplacement) {
/*  69 */     this.logReplacement = logReplacement;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getLogValueForProperty(String propertyName, Object propertyValue) {
/*  74 */     return maybeFilterLogReplacement(propertyName, "replacement", propertyValue, isLogReplacement());
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean modifyFile(File file, Context context) throws IOException {
/*  79 */     Document doc = parseFile(file);
/*  80 */     if (((!modifyDirect(doc) ? 1 : 0) & (!modifyEmpty(doc) ? 1 : 0)) != 0) {
/*  81 */       Logger.getInstance().log(this, "No nodes found for XPath " + getXpathExpression(), false);
/*  82 */       return false;
/*     */     } 
/*  84 */     XmlHelper.writeFile(file, doc);
/*  85 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean modifyDirect(Document doc) {
/*  90 */     NodeList nodeList = XmlHelper.getNodeList(doc, getXpathExpression());
/*  91 */     if (nodeList == null || nodeList.getLength() == 0) {
/*  92 */       return false;
/*     */     }
/*  94 */     for (int i = 0; i < nodeList.getLength(); i++) {
/*  95 */       Node node = nodeList.item(i);
/*  96 */       String nodeValue = node.getNodeValue();
/*  97 */       if (nodeValue == null) {
/*  98 */         return false;
/*     */       }
/* 100 */       node.setNodeValue(replaceNodeValue(nodeValue));
/*     */     } 
/* 102 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean modifyEmpty(Document doc) {
/* 107 */     if (getXpathExpression().endsWith("/text()")) {
/* 108 */       NodeList nodeList = XmlHelper.getNodeList(doc, getXpathExpression().substring(0, getXpathExpression().length() - "/text()".length()));
/* 109 */       if (nodeList == null || nodeList.getLength() == 0) {
/* 110 */         return false;
/*     */       }
/* 112 */       for (int i = 0; i < nodeList.getLength(); i++) {
/* 113 */         Node node = nodeList.item(i);
/* 114 */         if (node.getNodeType() == 1 && !node.hasChildNodes()) {
/* 115 */           String nodeValue = replaceNodeValue("");
/* 116 */           if (!nodeValue.isEmpty()) {
/* 117 */             node.appendChild(doc.createTextNode(nodeValue));
/*     */           }
/*     */         } 
/*     */       } 
/* 121 */       return true;
/*     */     } 
/*     */     
/* 124 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private String replaceNodeValue(String nodeValue) {
/* 129 */     if (isReplaceAll()) {
/* 130 */       return nodeValue.replaceAll(getRegex(), getReplacement());
/*     */     }
/* 132 */     return nodeValue.replaceFirst(getRegex(), getReplacement());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\xml\XPathReplaceAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */