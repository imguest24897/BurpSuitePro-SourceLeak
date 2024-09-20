/*    */ package com.install4j.runtime.util;
/*    */ import com.install4j.runtime.beans.LazyUiManagerColor;
/*    */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import java.awt.Color;
/*    */ import java.awt.Font;
/*    */ import java.awt.Rectangle;
/*    */ import java.util.Locale;
/*    */ import java.util.Objects;
/*    */ import javax.swing.JTextPane;
/*    */ import javax.swing.UIManager;
/*    */ import javax.swing.event.HyperlinkEvent;
/*    */ import javax.swing.text.DefaultCaret;
/*    */ import javax.swing.text.Document;
/*    */ import javax.swing.text.StyledEditorKit;
/*    */ import javax.swing.text.html.HTMLDocument;
/*    */ import javax.swing.text.html.HTMLEditorKit;
/*    */ import javax.swing.text.html.StyleSheet;
/*    */ 
/*    */ public class HtmlTextPane extends JTextPane {
/* 21 */   private static final Color BACKGROUND_COLOR = (Color)new LazyUiManagerColor("TextArea.background");
/*    */   
/*    */   private CaretTarget caretTarget;
/*    */   
/*    */   public HtmlTextPane(CaretTarget caretTarget) {
/* 26 */     this.caretTarget = caretTarget;
/* 27 */     setBackground(BACKGROUND_COLOR);
/* 28 */     setEditable(false);
/* 29 */     addHyperlinkListener(event -> {
/*    */           if (event.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
/*    */             GUIHelper.showURL(event.getURL().toExternalForm());
/*    */           }
/*    */         });
/* 34 */     DefaultCaret caret = (DefaultCaret)getCaret();
/* 35 */     if (caretTarget == CaretTarget.UNCHANGED) {
/* 36 */       caret.setUpdatePolicy(1);
/*    */     }
/*    */   }
/*    */   
/*    */   public void updateText(String originalText) {
/* 41 */     String newText, text = InstallerUtil.sanitizeHTML(originalText);
/*    */     
/*    */     try {
/* 44 */       newText = getText();
/* 45 */     } catch (Exception e) {
/* 46 */       newText = "";
/*    */     } 
/* 48 */     if (!Objects.equals(newText, text)) {
/* 49 */       boolean html = text.toLowerCase(Locale.ENGLISH).contains("<html");
/* 50 */       if (html) {
/* 51 */         if (getEditorKit().getClass() != HTMLEditorKit.class) {
/* 52 */           setEditorKit(new HTMLEditorKit());
/* 53 */           Font font = UIManager.getFont("TextField.font");
/* 54 */           StyleSheet css = ((HTMLDocument)getDocument()).getStyleSheet();
/* 55 */           css.addRule("body {font-size : " + font.getSize() + "pt; }");
/* 56 */           css.addRule("body {font-family :" + font.getFontName() + "; }");
/* 57 */           addColorRules(css);
/*    */         } 
/*    */       } else {
/* 60 */         if (getEditorKit().getClass() != StyledEditorKit.class) {
/* 61 */           setEditorKit(new StyledEditorKit());
/*    */         }
/* 63 */         setFont(UIManager.getFont("TextField.font"));
/*    */       } 
/* 65 */       setText(text);
/* 66 */       if (this.caretTarget == CaretTarget.START) {
/* 67 */         setCaretPosition(0);
/* 68 */         scrollRectToVisible(new Rectangle(0, 0, 0, 0));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void updateUI() {
/* 75 */     super.updateUI();
/*    */     
/* 77 */     Document document = getDocument();
/* 78 */     if (document instanceof HTMLDocument) {
/* 79 */       StyleSheet css = ((HTMLDocument)document).getStyleSheet();
/* 80 */       addColorRules(css);
/*    */     } 
/*    */   }
/*    */   
/*    */   private void addColorRules(StyleSheet css) {
/* 85 */     css.addRule("body {color : #" + GUIHelper.getHexValue(UIManager.getColor("TextArea.foreground")) + " }");
/* 86 */     css.addRule("body {background-color : #" + GUIHelper.getHexValue(UIManager.getColor("TextArea.background")) + "}");
/*    */   }
/*    */   
/*    */   public enum CaretTarget {
/* 90 */     START, END, UNCHANGED;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\HtmlTextPane.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */