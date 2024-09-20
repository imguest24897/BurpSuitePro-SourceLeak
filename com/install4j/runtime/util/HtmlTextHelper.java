/*     */ package com.install4j.runtime.util;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.Reader;
/*     */ import java.io.StringReader;
/*     */ import java.util.Stack;
/*     */ import javax.swing.text.MutableAttributeSet;
/*     */ import javax.swing.text.html.HTML;
/*     */ import javax.swing.text.html.HTMLEditorKit;
/*     */ import javax.swing.text.html.parser.ParserDelegator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class HtmlTextHelper
/*     */ {
/*     */   public static String formatTextWithoutHtmlTags(String s) {
/*  18 */     if (s == null)
/*  19 */       return null; 
/*  20 */     if (s.contains("<html")) {
/*  21 */       return convertHtmlToText(s);
/*     */     }
/*  23 */     return s;
/*     */   }
/*     */ 
/*     */   
/*     */   private static String convertHtmlToText(String html) {
/*  28 */     final StringBuffer textBuffer = new StringBuffer();
/*  29 */     final Stack<IndentedTag> tagStack = new Stack<>();
/*     */     
/*  31 */     HTMLEditorKit.ParserCallback parserCallback = new HTMLEditorKit.ParserCallback()
/*     */       {
/*     */         public void handleStartTag(HTML.Tag tag, MutableAttributeSet a, int pos) {
/*  34 */           if (tag.equals(HTML.Tag.TITLE)) {
/*  35 */             tagStack.push(new HtmlTextHelper.IndentedTag(tag, 0));
/*  36 */           } else if (HtmlTextHelper.isTagNeedsNewlineBefore(tag)) {
/*  37 */             if (textBuffer.length() > 0 && textBuffer.charAt(textBuffer.length() - 1) != '\n') {
/*  38 */               newLine();
/*     */             }
/*  40 */             newLine();
/*  41 */           } else if (tag.equals(HTML.Tag.DL) || tag
/*  42 */             .equals(HTML.Tag.DT)) {
/*  43 */             newLine();
/*  44 */           } else if (tag.equals(HTML.Tag.OL) || tag
/*  45 */             .equals(HTML.Tag.UL) || tag
/*  46 */             .equals(HTML.Tag.BLOCKQUOTE) || tag
/*  47 */             .equals(HTML.Tag.DD)) {
/*  48 */             tagStack.push(new HtmlTextHelper.IndentedTag(tag));
/*  49 */             newLine();
/*  50 */           } else if (tag.equals(HTML.Tag.LI)) {
/*  51 */             HtmlTextHelper.IndentedTag parent = tagStack.peek();
/*  52 */             if (parent.getTag().equals(HTML.Tag.OL)) {
/*  53 */               String order = parent.nextOrder() + ".";
/*  54 */               textBuffer.append(order);
/*  55 */               for (int i = 0; i < 3 - order.length(); i++) {
/*  56 */                 textBuffer.append(" ");
/*     */               }
/*     */             } else {
/*  59 */               textBuffer.append("*  ");
/*     */             } 
/*  61 */             tagStack.push(new HtmlTextHelper.IndentedTag(tag));
/*     */           } 
/*     */         }
/*     */         
/*     */         private void newLine() {
/*  66 */           textBuffer.append('\n');
/*  67 */           for (HtmlTextHelper.IndentedTag indentedTag : tagStack) {
/*  68 */             for (int j = 0; j < indentedTag.getIndentation(); j++) {
/*  69 */               textBuffer.append(" ");
/*     */             }
/*     */           } 
/*     */         }
/*     */ 
/*     */         
/*     */         public void handleEndTag(HTML.Tag tag, int pos) {
/*  76 */           if (HtmlTextHelper.isTagNeedsNewlineBefore(tag))
/*  77 */             newLine(); 
/*  78 */           if (tag.equals(HTML.Tag.TD)) {
/*  79 */             textBuffer.append(" ");
/*  80 */           } else if (tag.equals(HTML.Tag.OL) || tag
/*  81 */             .equals(HTML.Tag.UL) || tag
/*  82 */             .equals(HTML.Tag.LI) || tag
/*  83 */             .equals(HTML.Tag.BLOCKQUOTE)) {
/*  84 */             tagStack.pop();
/*  85 */             newLine();
/*  86 */           } else if (tag.equals(HTML.Tag.DD) || tag
/*  87 */             .equals(HTML.Tag.TITLE)) {
/*  88 */             tagStack.pop();
/*     */           } 
/*     */         }
/*     */ 
/*     */         
/*     */         public void handleSimpleTag(HTML.Tag tag, MutableAttributeSet a, int pos) {
/*  94 */           if (tag.equals(HTML.Tag.BR)) {
/*  95 */             newLine();
/*     */           }
/*     */         }
/*     */ 
/*     */         
/*     */         public void handleText(char[] text, int pos) {
/* 101 */           if (tagStack.size() == 0 || ((HtmlTextHelper.IndentedTag)tagStack.peek()).getTag() != HTML.Tag.TITLE) {
/* 102 */             textBuffer.append(text);
/*     */           }
/*     */         }
/*     */       };
/*     */     
/* 107 */     Reader in = new StringReader(html);
/* 108 */     ParserDelegator delegator = new ParserDelegator();
/*     */     try {
/* 110 */       delegator.parse(in, parserCallback, true);
/* 111 */       return textBuffer.toString();
/* 112 */     } catch (IOException ex) {
/* 113 */       return html;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static boolean isTagNeedsNewlineBefore(HTML.Tag tag) {
/* 118 */     return (tag.equals(HTML.Tag.P) || tag
/* 119 */       .equals(HTML.Tag.H1) || tag
/* 120 */       .equals(HTML.Tag.H2) || tag
/* 121 */       .equals(HTML.Tag.H3) || tag
/* 122 */       .equals(HTML.Tag.H4) || tag
/* 123 */       .equals(HTML.Tag.H5) || tag
/* 124 */       .equals(HTML.Tag.H6) || tag
/* 125 */       .equals(HTML.Tag.TH) || tag
/* 126 */       .equals(HTML.Tag.TR));
/*     */   }
/*     */   
/*     */   private static class IndentedTag {
/*     */     private HTML.Tag tag;
/*     */     private int indentation;
/*     */     private int order;
/*     */     
/*     */     public IndentedTag(HTML.Tag tag) {
/* 135 */       this.tag = tag;
/* 136 */       this.order = 0;
/*     */     }
/*     */     
/*     */     public IndentedTag(HTML.Tag tag, int indentation) {
/* 140 */       this.tag = tag;
/* 141 */       this.indentation = indentation;
/* 142 */       this.order = 0;
/*     */     }
/*     */     
/*     */     public int nextOrder() {
/* 146 */       return ++this.order;
/*     */     }
/*     */     
/*     */     public HTML.Tag getTag() {
/* 150 */       return this.tag;
/*     */     }
/*     */     
/*     */     public int getIndentation() {
/* 154 */       return this.indentation;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\HtmlTextHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */