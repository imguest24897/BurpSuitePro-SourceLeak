/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ 
/*     */ import com.install4j.api.beans.LocalizedExternalFile;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.beans.AllowDirectFieldAccess;
/*     */ import com.install4j.runtime.beans.screens.components.TextSource;
/*     */ import com.install4j.runtime.installer.frontend.components.HtmlDisplay;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JTextPane;
/*     */ 
/*     */ public class HtmlDisplayFormComponent extends LeadingLabelComponent implements HtmlDisplay.HtmlTextProvider {
/*  15 */   private TextSource textSource = TextSource.FILE;
/*  16 */   private LocalizedExternalFile displayedTextFile = new LocalizedExternalFile();
/*  17 */   private String displayedText = "";
/*  18 */   private int height = 100;
/*     */   private boolean fillVertical = false;
/*  20 */   private String variableName = "";
/*  21 */   private DocumentUpdateCaretPosition documentUpdateCaretPosition = DocumentUpdateCaretPosition.UNCHANGED;
/*     */   
/*     */   private HtmlDisplay htmlDisplay;
/*     */ 
/*     */   
/*     */   public TextSource getTextSource() {
/*  27 */     return (TextSource)replaceWithTextOverride("textSource", this.textSource, TextSource.class);
/*     */   }
/*     */   
/*     */   public void setTextSource(TextSource textSource) {
/*  31 */     this.textSource = textSource;
/*     */   }
/*     */ 
/*     */   
/*     */   public LocalizedExternalFile getDisplayedTextFile() {
/*  36 */     return (LocalizedExternalFile)replaceWithTextOverride("displayedTextFile", this.displayedTextFile, LocalizedExternalFile.class);
/*     */   }
/*     */   
/*     */   public void setDisplayedTextFile(LocalizedExternalFile displayedTextFile) {
/*  40 */     this.displayedTextFile = displayedTextFile;
/*     */   }
/*     */   
/*     */   public String getDisplayedText() {
/*  44 */     return replaceVariables(this.displayedText);
/*     */   }
/*     */ 
/*     */   
/*     */   @AllowDirectFieldAccess
/*     */   public String getRawDisplayedText() {
/*  50 */     return this.displayedText;
/*     */   }
/*     */   
/*     */   public void setDisplayedText(String displayedText) {
/*  54 */     this.displayedText = displayedText;
/*     */   }
/*     */   
/*     */   public int getHeight() {
/*  58 */     return replaceWithTextOverride("height", this.height);
/*     */   }
/*     */   
/*     */   public void setHeight(int height) {
/*  62 */     this.height = height;
/*     */   }
/*     */   
/*     */   public boolean isFillVertical() {
/*  66 */     return replaceWithTextOverride("fillVertical", this.fillVertical);
/*     */   }
/*     */   
/*     */   public void setFillVertical(boolean fillVertical) {
/*  70 */     this.fillVertical = fillVertical;
/*     */   }
/*     */   
/*     */   public String getVariableName() {
/*  74 */     return replaceVariables(this.variableName);
/*     */   }
/*     */   
/*     */   public void setVariableName(String variableName) {
/*  78 */     this.variableName = variableName;
/*     */   }
/*     */   
/*     */   public DocumentUpdateCaretPosition getDocumentUpdateCaretPosition() {
/*  82 */     return (DocumentUpdateCaretPosition)replaceWithTextOverride("documentUpdateCaretPosition", this.documentUpdateCaretPosition, DocumentUpdateCaretPosition.class);
/*     */   }
/*     */   
/*     */   public void setDocumentUpdateCaretPosition(DocumentUpdateCaretPosition documentUpdateCaretPosition) {
/*  86 */     this.documentUpdateCaretPosition = documentUpdateCaretPosition;
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/*  91 */     initHtmlDisplay();
/*  92 */     return (JComponent)this.htmlDisplay;
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/*  97 */     return JTextPane.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public JTextPane getConfigurationObject() {
/* 102 */     return (JTextPane)this.htmlDisplay.getHtmlTextPane();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterVertical() {
/* 112 */     return isFillVertical();
/*     */   }
/*     */ 
/*     */   
/*     */   public void formWillActivate() {
/* 117 */     super.formWillActivate();
/* 118 */     this.htmlDisplay.setContext(getContext());
/* 119 */     updateText();
/*     */   }
/*     */   
/*     */   public void updateText() {
/* 123 */     this.htmlDisplay.updateText();
/*     */   }
/*     */   
/*     */   public boolean isAllRead() {
/* 127 */     return this.htmlDisplay.isAllRead();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/* 132 */     super.setFormEnvironment(formEnvironment);
/* 133 */     if (this.htmlDisplay != null && formEnvironment != null) {
/* 134 */       this.htmlDisplay.getHtmlTextPane().setName(formEnvironment.getId((FormComponent)this));
/*     */     }
/*     */   }
/*     */   
/*     */   private void initHtmlDisplay() {
/* 139 */     this.htmlDisplay = new HtmlDisplay(this, getDocumentUpdateCaretPosition().getCaretTarget());
/* 140 */     this.htmlDisplay.setPreferredHeight(getHeight());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 145 */     initHtmlDisplay();
/* 146 */     this.htmlDisplay.setContext(getContext());
/* 147 */     this.htmlDisplay.handleConsole(console);
/* 148 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public JTextPane getTextPane() {
/* 153 */     return (JTextPane)this.htmlDisplay.getHtmlTextPane();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/* 158 */     if (getVariableName().length() > 0) {
/* 159 */       getContext().setVariable(getVariableName(), getActualText());
/*     */     }
/*     */     
/* 162 */     return super.checkCompleted();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getActualText() {
/* 167 */     return this.htmlDisplay.getActualText();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\HtmlDisplayFormComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */