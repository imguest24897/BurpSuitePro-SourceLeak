/*     */ package com.install4j.runtime.beans.actions.xml;
/*     */ 
/*     */ import com.install4j.api.beans.ExternalFile;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.XmlHelper;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.DocumentFragment;
/*     */ import org.w3c.dom.Element;
/*     */ import org.w3c.dom.Node;
/*     */ import org.w3c.dom.NodeList;
/*     */ 
/*     */ public class InsertXmlFragmentAction extends AbstractModifyMultipleXmlFilesAction {
/*  17 */   private FragmentSource fragmentSource = FragmentSource.DIRECT; private String xpathExpression;
/*  18 */   private String fragmentText = "";
/*     */   
/*     */   private ExternalFile fragmentFile;
/*  21 */   private FragmentInsertMode fragmentInsertMode = FragmentInsertMode.FIRST_CHILD;
/*     */   
/*     */   public String getXpathExpression() {
/*  24 */     return replaceVariables(replaceVariables(this.xpathExpression));
/*     */   }
/*     */   
/*     */   public void setXpathExpression(String xpathExpression) {
/*  28 */     this.xpathExpression = xpathExpression;
/*     */   }
/*     */   
/*     */   public FragmentSource getFragmentSource() {
/*  32 */     return (FragmentSource)replaceWithTextOverride("fragmentSource", this.fragmentSource, FragmentSource.class);
/*     */   }
/*     */   
/*     */   public void setFragmentSource(FragmentSource fragmentSource) {
/*  36 */     this.fragmentSource = fragmentSource;
/*     */   }
/*     */   
/*     */   public String getFragmentText() {
/*  40 */     return replaceVariables(replaceVariables(this.fragmentText));
/*     */   }
/*     */   
/*     */   public void setFragmentText(String fragmentText) {
/*  44 */     this.fragmentText = fragmentText;
/*     */   }
/*     */   
/*     */   public FragmentInsertMode getFragmentInsertMode() {
/*  48 */     return (FragmentInsertMode)replaceWithTextOverride("fragmentInsertMode", this.fragmentInsertMode, FragmentInsertMode.class);
/*     */   }
/*     */   
/*     */   public void setFragmentFile(ExternalFile fragmentFile) {
/*  52 */     this.fragmentFile = fragmentFile;
/*     */   }
/*     */   
/*     */   public void setFragmentInsertMode(FragmentInsertMode fragmentInsertMode) {
/*  56 */     this.fragmentInsertMode = fragmentInsertMode;
/*     */   }
/*     */   
/*     */   public ExternalFile getFragmentFile() {
/*  60 */     return (ExternalFile)replaceWithTextOverride("fragmentFile", this.fragmentFile, ExternalFile.class);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean fileMustExist() {
/*  65 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean modifyFile(File file, Context context) throws IOException, UserCanceledException {
/*  71 */     Document document = parseFile(file);
/*  72 */     NodeList nodeList = applyXpath(document, getXpathExpression());
/*  73 */     if (nodeList == null) {
/*  74 */       return false;
/*     */     }
/*     */     
/*  77 */     DocumentFragment documentFragment = createDocumentFragment(context, document);
/*  78 */     if (documentFragment == null) {
/*  79 */       return false;
/*     */     }
/*     */     
/*  82 */     if (!modifyDocument(documentFragment, nodeList)) {
/*  83 */       return false;
/*     */     }
/*     */     
/*  86 */     XmlHelper.writeFile(file, document);
/*     */     
/*  88 */     return true;
/*     */   }
/*     */   
/*     */   private boolean modifyDocument(DocumentFragment documentFragment, NodeList nodeList) {
/*  92 */     for (int i = 0; i < nodeList.getLength(); i++) {
/*  93 */       Node nextSibling; DocumentFragment fragmentCopy = (DocumentFragment)documentFragment.cloneNode(true);
/*  94 */       Node node = nodeList.item(i);
/*  95 */       switch (getFragmentInsertMode()) {
/*     */         case DIRECT:
/*  97 */           node.insertBefore(fragmentCopy, node.getFirstChild());
/*     */           break;
/*     */         case FILE:
/* 100 */           node.appendChild(fragmentCopy);
/*     */           break;
/*     */         case null:
/* 103 */           node.getParentNode().insertBefore(fragmentCopy, node);
/*     */           break;
/*     */         case null:
/* 106 */           nextSibling = node.getNextSibling();
/* 107 */           if (nextSibling == null) {
/* 108 */             node.getParentNode().appendChild(fragmentCopy); break;
/*     */           } 
/* 110 */           node.getParentNode().insertBefore(fragmentCopy, nextSibling);
/*     */           break;
/*     */         
/*     */         case null:
/* 114 */           node.getParentNode().replaceChild(fragmentCopy, node);
/*     */           break;
/*     */         default:
/* 117 */           throw new RuntimeException(getFragmentInsertMode().name());
/*     */       } 
/*     */     } 
/* 120 */     return true;
/*     */   }
/*     */   
/*     */   private DocumentFragment createDocumentFragment(Context context, Document targetDocument) throws IOException {
/* 124 */     Document document = createFragmentDocument(context);
/* 125 */     if (document == null) {
/* 126 */       return null;
/*     */     }
/* 128 */     DocumentFragment documentFragment = document.createDocumentFragment();
/* 129 */     Element rootElement = document.getDocumentElement();
/* 130 */     while (rootElement.hasChildNodes()) {
/* 131 */       documentFragment.appendChild(rootElement.getFirstChild());
/*     */     }
/* 133 */     return (DocumentFragment)targetDocument.importNode(documentFragment, true);
/*     */   }
/*     */   
/*     */   private Document createFragmentDocument(Context context) throws IOException {
/* 137 */     switch (getFragmentSource()) {
/*     */       case DIRECT:
/* 139 */         return createDirectFragmentDocument();
/*     */       case FILE:
/* 141 */         return createFileFragmentDocument(context);
/*     */     } 
/* 143 */     throw new RuntimeException(getFragmentSource().name());
/*     */   }
/*     */ 
/*     */   
/*     */   private Document createDirectFragmentDocument() throws IOException {
/* 148 */     StringBuilder buffer = new StringBuilder();
/* 149 */     buffer.append("<root>");
/* 150 */     buffer.append(getFragmentText());
/* 151 */     buffer.append("</root>");
/* 152 */     return XmlHelper.parseString(buffer.toString(), false, false);
/*     */   }
/*     */   
/*     */   private Document createFileFragmentDocument(Context context) throws IOException {
/* 156 */     File file = context.getExternalFile(getFragmentFile(), false);
/* 157 */     if (!file.exists()) {
/* 158 */       Logger.getInstance().log(this, "Fragment file " + file + " does not exist", false);
/* 159 */       return null;
/*     */     } 
/* 161 */     return XmlHelper.parseFile(file, false, false);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\xml\InsertXmlFragmentAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */