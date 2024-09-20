/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ 
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.util.MinimumSizeTextArea;
/*     */ import com.install4j.runtime.util.TextAreaScrollPane;
/*     */ import java.io.File;
/*     */ import java.nio.charset.Charset;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.text.BadLocationException;
/*     */ import javax.swing.text.Document;
/*     */ import javax.swing.text.Element;
/*     */ import javax.swing.text.PlainDocument;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public class LogFileViewerComponent extends LeadingLabelComponent implements LogFileTailer.TailListener {
/*  20 */   private String encoding = ""; private File file;
/*  21 */   private int rows = 5;
/*     */   private boolean fillVertical = false;
/*     */   private boolean useLabelFont = false;
/*  24 */   private int maxLines = 1000;
/*     */   
/*     */   private JTextArea textArea;
/*     */   private LogFileTailer logFileTailer;
/*     */   
/*     */   public File getFile() {
/*  30 */     return (File)replaceWithTextOverride("file", replaceVariables(this.file), File.class);
/*     */   }
/*     */   
/*     */   public void setFile(File file) {
/*  34 */     this.file = file;
/*     */   }
/*     */   
/*     */   public String getEncoding() {
/*  38 */     return replaceVariables(replaceVariables(this.encoding));
/*     */   }
/*     */   
/*     */   public void setEncoding(String encoding) {
/*  42 */     this.encoding = encoding;
/*     */   }
/*     */   
/*     */   public int getRows() {
/*  46 */     return replaceWithTextOverride("rows", this.rows);
/*     */   }
/*     */   
/*     */   public void setRows(int rows) {
/*  50 */     this.rows = rows;
/*     */   }
/*     */   
/*     */   public boolean isFillVertical() {
/*  54 */     return replaceWithTextOverride("fillVertical", this.fillVertical);
/*     */   }
/*     */   
/*     */   public void setFillVertical(boolean fillVertical) {
/*  58 */     this.fillVertical = fillVertical;
/*     */   }
/*     */   
/*     */   public boolean isUseLabelFont() {
/*  62 */     return replaceWithTextOverride("useLabelFont", this.useLabelFont);
/*     */   }
/*     */   
/*     */   public void setUseLabelFont(boolean useLabelFont) {
/*  66 */     this.useLabelFont = useLabelFont;
/*     */   }
/*     */   
/*     */   public int getMaxLines() {
/*  70 */     return replaceWithTextOverride("maxLines", this.maxLines);
/*     */   }
/*     */   
/*     */   public void setMaxLines(int maxLines) {
/*  74 */     this.maxLines = maxLines;
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/*  79 */     this.textArea = (JTextArea)new MinimumSizeTextArea();
/*  80 */     this.textArea.setEditable(false);
/*  81 */     if (getRows() > 0) {
/*  82 */       this.textArea.setRows(getRows());
/*     */     }
/*  84 */     if (isUseLabelFont()) {
/*  85 */       this.textArea.setFont(UIManager.getFont("Label.font"));
/*     */     }
/*  87 */     return (JComponent)new TextAreaScrollPane(this.textArea, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/*  92 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterVertical() {
/*  97 */     return isFillVertical();
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/* 102 */     return JTextArea.class;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean isLeadingLabelTopAligned() {
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void formWillActivate() {
/* 112 */     super.formWillActivate();
/* 113 */     this.logFileTailer = new LogFileTailer(getContext().getDestinationFile(getFile()), getCharset(), getMaxLines(), this);
/* 114 */     this.logFileTailer.start();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private Charset getCharset() {
/* 119 */     return getEncoding().isEmpty() ? Charset.defaultCharset() : Charset.forName(getEncoding());
/*     */   }
/*     */ 
/*     */   
/*     */   public void formDeactivated() {
/* 124 */     super.formDeactivated();
/* 125 */     if (this.logFileTailer != null) {
/* 126 */       this.logFileTailer.interrupt();
/* 127 */       this.logFileTailer = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/* 133 */     super.setFormEnvironment(formEnvironment);
/* 134 */     if (this.textArea != null && formEnvironment != null) {
/* 135 */       this.textArea.setName(formEnvironment.getId((FormComponent)this));
/*     */     }
/*     */   }
/*     */   
/*     */   private File getUsedFile() {
/* 140 */     return getContext().getDestinationFile(getFile());
/*     */   }
/*     */ 
/*     */   
/*     */   public void setText(@NotNull String text) {
/* 145 */     GUIHelper.invokeLater(() -> {
/*     */           this.textArea.setText(text);
/*     */           scrollToBottom();
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void addText(@NotNull String text) {
/* 153 */     GUIHelper.invokeLater(() -> {
/*     */           Document document = this.textArea.getDocument();
/*     */           try {
/*     */             document.insertString(document.getLength(), text, null);
/*     */             scrollToBottom();
/* 158 */           } catch (BadLocationException e) {
/*     */             throw new RuntimeException(e);
/*     */           } 
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeFirstLine() {
/* 166 */     GUIHelper.invokeLater(() -> {
/*     */           PlainDocument document = (PlainDocument)this.textArea.getDocument();
/*     */           Element firstLine = document.getDefaultRootElement().getElement(0);
/*     */           try {
/*     */             document.remove(firstLine.getStartOffset(), firstLine.getEndOffset());
/* 171 */           } catch (BadLocationException e) {
/*     */             throw new RuntimeException(e);
/*     */           } 
/*     */         });
/*     */   }
/*     */   
/*     */   private void scrollToBottom() {
/* 178 */     this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\LogFileViewerComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */