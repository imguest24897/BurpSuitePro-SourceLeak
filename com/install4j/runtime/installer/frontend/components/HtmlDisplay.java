/*     */ package com.install4j.runtime.installer.frontend.components;
/*     */ 
/*     */ import com.install4j.api.beans.LocalizedExternalFile;
/*     */ import com.install4j.api.beans.ReplacementMode;
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.beans.screens.components.TextSource;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.util.HtmlTextHelper;
/*     */ import com.install4j.runtime.util.HtmlTextPane;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.event.AdjustmentEvent;
/*     */ import java.util.Objects;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollBar;
/*     */ import javax.swing.JScrollPane;
/*     */ 
/*     */ public class HtmlDisplay
/*     */   extends JPanel {
/*     */   private HtmlTextProvider htmlTextProvider;
/*     */   private HtmlTextPane.CaretTarget caretTarget;
/*     */   private HtmlTextPane htmlTextPane;
/*     */   
/*     */   public HtmlDisplay(HtmlTextProvider htmlTextProvider, HtmlTextPane.CaretTarget caretTarget) {
/*  33 */     this.htmlTextProvider = htmlTextProvider;
/*  34 */     this.caretTarget = caretTarget;
/*  35 */     setupControls();
/*  36 */     setupEventHandlers();
/*  37 */     setupComponent();
/*     */   }
/*     */   private JScrollPane scpInfo; private String actualText; private boolean allRead = false; private Context context;
/*     */   public void setPreferredHeight(int preferredHeight) {
/*  41 */     this.scpInfo.setPreferredSize(new Dimension(100, preferredHeight));
/*     */   }
/*     */   
/*     */   public String getActualText() {
/*  45 */     return this.actualText;
/*     */   }
/*     */   
/*     */   public boolean isAllRead() {
/*  49 */     return this.allRead;
/*     */   }
/*     */   
/*     */   public void setContext(Context context) {
/*  53 */     this.context = context;
/*     */   }
/*     */   
/*     */   public HtmlTextPane getHtmlTextPane() {
/*  57 */     return this.htmlTextPane;
/*     */   }
/*     */   
/*     */   private void setupControls() {
/*  61 */     this.htmlTextPane = new HtmlTextPane(this.caretTarget);
/*  62 */     this.scpInfo = new JScrollPane((Component)this.htmlTextPane);
/*  63 */     this.scpInfo.getViewport().setBackground(Color.WHITE);
/*     */   }
/*     */   
/*     */   private void setupEventHandlers() {
/*  67 */     this.scpInfo.getVerticalScrollBar().addAdjustmentListener(e -> checkAllRead());
/*     */   }
/*     */   
/*     */   private void setupComponent() {
/*  71 */     setLayout(new BorderLayout());
/*  72 */     add(this.scpInfo, "Center");
/*     */   }
/*     */   
/*     */   private void checkAllRead() {
/*  76 */     JScrollBar scrollBar = this.scpInfo.getVerticalScrollBar();
/*  77 */     if (isShowing() && scrollBar.getValue() + scrollBar.getModel().getExtent() == scrollBar.getMaximum()) {
/*  78 */       this.allRead = true;
/*     */     }
/*     */   }
/*     */   
/*     */   public void handleConsole(Console console) throws UserCanceledException {
/*  83 */     String originalText = HtmlTextHelper.formatTextWithoutHtmlTags(getOrLoadText());
/*  84 */     console.println();
/*  85 */     console.more(originalText);
/*  86 */     console.println();
/*     */     
/*  88 */     this.actualText = originalText;
/*     */   }
/*     */   
/*     */   public void updateText() {
/*  92 */     String newText = getOrLoadText();
/*  93 */     if (!Objects.equals(newText, this.actualText)) {
/*  94 */       this.actualText = newText;
/*  95 */       this.htmlTextPane.updateText(this.actualText);
/*  96 */       this.allRead = false;
/*  97 */       checkAllRead();
/*     */     } 
/*     */   }
/*     */   
/*     */   private String getOrLoadText() {
/*     */     String originalText;
/* 103 */     if (this.htmlTextProvider.getTextSource() == TextSource.FILE) {
/* 104 */       originalText = InstallerUtil.loadFile(this.context.getExternalFile(this.htmlTextProvider.getDisplayedTextFile(), false), this.context.getLanguageId());
/* 105 */       if (originalText == null) {
/* 106 */         originalText = "";
/*     */       }
/*     */     } else {
/* 109 */       originalText = this.htmlTextProvider.getRawDisplayedText();
/*     */     } 
/* 111 */     this.htmlTextProvider.getFormEnvironment().bindTextWithVariables(originalText, (JComponent)getHtmlTextPane());
/* 112 */     return InstallerVariables.replaceVariables(originalText, ReplacementMode.PLAIN, VariableErrorHandlingDescriptor.ALWAYS_IGNORE);
/*     */   }
/*     */   
/*     */   public static interface HtmlTextProvider {
/*     */     TextSource getTextSource();
/*     */     
/*     */     LocalizedExternalFile getDisplayedTextFile();
/*     */     
/*     */     String getRawDisplayedText();
/*     */     
/*     */     FormEnvironment getFormEnvironment();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\components\HtmlDisplay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */