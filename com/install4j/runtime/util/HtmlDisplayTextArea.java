/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import java.awt.Font;
/*    */ import java.awt.Insets;
/*    */ import javax.swing.JTextPane;
/*    */ import javax.swing.UIManager;
/*    */ import javax.swing.text.Document;
/*    */ import javax.swing.text.html.HTMLDocument;
/*    */ import javax.swing.text.html.HTMLEditorKit;
/*    */ import javax.swing.text.html.StyleSheet;
/*    */ 
/*    */ public class HtmlDisplayTextArea extends JTextPane {
/* 15 */   private static final Insets NO_MARGIN = new Insets(0, 0, 0, 0);
/*    */   
/*    */   public HtmlDisplayTextArea() {
/* 18 */     setEditable(false);
/* 19 */     setBackground(UIManager.getColor("Label.background"));
/* 20 */     setRequestFocusEnabled(false);
/*    */     
/* 22 */     setMargin(NO_MARGIN);
/* 23 */     setEditorKit(new HTMLEditorKit());
/* 24 */     updateUI();
/* 25 */     setOpaque(false);
/* 26 */     setFocusable(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setText(String text) {
/* 31 */     text = InstallerUtil.sanitizeHTML(text);
/* 32 */     super.setText(text);
/*    */   }
/*    */ 
/*    */   
/*    */   public void updateUI() {
/* 37 */     super.updateUI();
/*    */     
/* 39 */     Document document = getDocument();
/* 40 */     if (document instanceof HTMLDocument) {
/* 41 */       StyleSheet css = ((HTMLDocument)document).getStyleSheet();
/* 42 */       Font font = UIManager.getFont("Label.font");
/*    */       
/* 44 */       css.addRule("body {color : #" + GUIHelper.getHexValue(UIManager.getColor("Label.foreground")) + " }");
/* 45 */       css.addRule("body {font-size : " + font.getSize() + "pt; }");
/* 46 */       css.addRule("body {font-family :" + font.getFontName() + "; }");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\HtmlDisplayTextArea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */