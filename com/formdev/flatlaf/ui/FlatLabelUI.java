/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.FlatLaf;
/*     */ import com.formdev.flatlaf.util.HiDPIUtils;
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import com.formdev.flatlaf.util.UIScale;
/*     */ import java.awt.Color;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Rectangle;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.util.Arrays;
/*     */ import java.util.HashSet;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.plaf.ComponentUI;
/*     */ import javax.swing.plaf.basic.BasicHTML;
/*     */ import javax.swing.plaf.basic.BasicLabelUI;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlatLabelUI
/*     */   extends BasicLabelUI
/*     */   implements FlatStylingSupport.StyleableUI
/*     */ {
/*     */   @Styleable
/*     */   protected Color disabledForeground;
/*     */   private final boolean shared;
/*     */   private boolean defaults_initialized = false;
/*     */   private Map<String, Object> oldStyleValues;
/*     */   private static Set<String> tagsUseFontSizeSet;
/*     */   
/*     */   public static ComponentUI createUI(JComponent c) {
/*  72 */     return FlatUIUtils.canUseSharedUI(c) ? 
/*  73 */       FlatUIUtils.createSharedUI(FlatLabelUI.class, () -> new FlatLabelUI(true)) : 
/*  74 */       new FlatLabelUI(false);
/*     */   }
/*     */ 
/*     */   
/*     */   protected FlatLabelUI(boolean shared) {
/*  79 */     this.shared = shared;
/*     */   }
/*     */ 
/*     */   
/*     */   public void installUI(JComponent c) {
/*  84 */     super.installUI(c);
/*     */     
/*  86 */     installStyle((JLabel)c);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installDefaults(JLabel c) {
/*  91 */     super.installDefaults(c);
/*     */     
/*  93 */     if (!this.defaults_initialized) {
/*  94 */       this.disabledForeground = UIManager.getColor("Label.disabledForeground");
/*     */       
/*  96 */       this.defaults_initialized = true;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallDefaults(JLabel c) {
/* 102 */     super.uninstallDefaults(c);
/*     */     
/* 104 */     this.defaults_initialized = false;
/* 105 */     this.oldStyleValues = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installComponents(JLabel c) {
/* 110 */     super.installComponents(c);
/*     */ 
/*     */     
/* 113 */     updateHTMLRenderer(c, c.getText(), false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void propertyChange(PropertyChangeEvent e) {
/* 118 */     String name = e.getPropertyName();
/* 119 */     if (name == "text" || name == "font" || name == "foreground") {
/* 120 */       JLabel label = (JLabel)e.getSource();
/* 121 */       updateHTMLRenderer(label, label.getText(), true);
/* 122 */     } else if (name.equals("FlatLaf.style") || name.equals("FlatLaf.styleClass")) {
/* 123 */       JLabel label = (JLabel)e.getSource();
/* 124 */       if (this.shared && FlatStylingSupport.hasStyleProperty(label)) {
/*     */ 
/*     */         
/* 127 */         label.updateUI();
/*     */       } else {
/* 129 */         installStyle(label);
/* 130 */       }  label.revalidate();
/* 131 */       label.repaint();
/*     */     } else {
/* 133 */       super.propertyChange(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void installStyle(JLabel c) {
/*     */     try {
/* 139 */       applyStyle(c, FlatStylingSupport.getResolvedStyle(c, "Label"));
/* 140 */     } catch (RuntimeException ex) {
/* 141 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void applyStyle(JLabel c, Object style) {
/* 147 */     this.oldStyleValues = FlatStylingSupport.parseAndApply(this.oldStyleValues, style, (key, value) -> applyStyleProperty(c, key, value));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected Object applyStyleProperty(JLabel c, String key, Object value) {
/* 153 */     return FlatStylingSupport.applyToAnnotatedObjectOrComponent(this, c, key, value);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Class<?>> getStyleableInfos(JComponent c) {
/* 159 */     return FlatStylingSupport.getAnnotatedStyleableInfos(this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getStyleableValue(JComponent c, String key) {
/* 165 */     return FlatStylingSupport.getAnnotatedStyleableValue(this, key);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static void updateHTMLRenderer(JComponent c, String text, boolean always) {
/* 176 */     if (BasicHTML.isHTMLString(text) && c
/* 177 */       .getClientProperty("html.disable") != Boolean.TRUE && 
/* 178 */       needsFontBaseSize(text)) {
/*     */       int insertIndex;
/*     */       
/* 181 */       String style = "<style>BASE_SIZE " + c.getFont().getSize() + "</style>";
/*     */       
/* 183 */       String lowerText = text.toLowerCase(Locale.ENGLISH);
/*     */ 
/*     */       
/*     */       int headIndex;
/*     */       
/* 188 */       if ((headIndex = lowerText.indexOf("<head>")) >= 0)
/*     */       
/* 190 */       { insertIndex = headIndex + "<head>".length(); }
/* 191 */       else { int styleIndex; if ((styleIndex = lowerText.indexOf("<style>")) >= 0) {
/*     */           
/* 193 */           insertIndex = styleIndex;
/*     */         } else {
/*     */           
/* 196 */           style = "<head>" + style + "</head>";
/* 197 */           insertIndex = "<html>".length();
/*     */         }  }
/*     */ 
/*     */ 
/*     */       
/* 202 */       text = text.substring(0, insertIndex) + style + text.substring(insertIndex);
/* 203 */     } else if (!always) {
/*     */       return;
/*     */     } 
/* 206 */     BasicHTML.updateRenderer(c, text);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean needsFontBaseSize(String text) {
/* 212 */     if (tagsUseFontSizeSet == null)
/*     */     {
/* 214 */       tagsUseFontSizeSet = new HashSet<>(Arrays.asList(new String[] { "h1", "h2", "h3", "h4", "h5", "h6", "code", "kbd", "big", "small", "samp" }));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 219 */     int textLength = text.length();
/* 220 */     for (int i = 6; i < textLength - 1; i++) {
/* 221 */       if (text.charAt(i) == '<') {
/* 222 */         int tagBegin; switch (text.charAt(i + 1)) { case 'B': case 'C': case 'H': case 'K':
/*     */           case 'S':
/*     */           case 'b':
/*     */           case 'c':
/*     */           case 'h':
/*     */           case 'k':
/*     */           case 's':
/* 229 */             tagBegin = i + 1;
/* 230 */             for (i += 2; i < textLength; i++) {
/* 231 */               if (!Character.isLetterOrDigit(text.charAt(i))) {
/* 232 */                 String tag = text.substring(tagBegin, i).toLowerCase(Locale.ENGLISH);
/* 233 */                 if (tagsUseFontSizeSet.contains(tag)) {
/* 234 */                   return true;
/*     */                 }
/*     */                 break;
/*     */               } 
/*     */             } 
/*     */             break; }
/*     */ 
/*     */       
/*     */       } 
/*     */     } 
/* 244 */     return false;
/*     */   }
/*     */   
/*     */   static Graphics createGraphicsHTMLTextYCorrection(Graphics g, JComponent c) {
/* 248 */     return (c.getClientProperty("html") != null) ? 
/* 249 */       HiDPIUtils.createGraphicsTextYCorrection((Graphics2D)g) : 
/* 250 */       g;
/*     */   }
/*     */ 
/*     */   
/*     */   public void paint(Graphics g, JComponent c) {
/* 255 */     super.paint(createGraphicsHTMLTextYCorrection(g, c), c);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void paintEnabledText(JLabel l, Graphics g, String s, int textX, int textY) {
/* 260 */     int mnemIndex = FlatLaf.isShowMnemonics() ? l.getDisplayedMnemonicIndex() : -1;
/* 261 */     g.setColor(l.getForeground());
/* 262 */     FlatUIUtils.drawStringUnderlineCharAt(l, g, s, mnemIndex, textX, textY);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void paintDisabledText(JLabel l, Graphics g, String s, int textX, int textY) {
/* 267 */     int mnemIndex = FlatLaf.isShowMnemonics() ? l.getDisplayedMnemonicIndex() : -1;
/* 268 */     g.setColor(this.disabledForeground);
/* 269 */     FlatUIUtils.drawStringUnderlineCharAt(l, g, s, mnemIndex, textX, textY);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String layoutCL(JLabel label, FontMetrics fontMetrics, String text, Icon icon, Rectangle viewR, Rectangle iconR, Rectangle textR) {
/* 279 */     return SwingUtilities.layoutCompoundLabel(label, fontMetrics, text, icon, label
/* 280 */         .getVerticalAlignment(), label.getHorizontalAlignment(), label
/* 281 */         .getVerticalTextPosition(), label.getHorizontalTextPosition(), viewR, iconR, textR, 
/*     */         
/* 283 */         UIScale.scale(label.getIconTextGap()));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatLabelUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */