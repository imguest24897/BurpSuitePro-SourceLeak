/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.util.HiDPIUtils;
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import com.formdev.flatlaf.util.UIScale;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.FocusListener;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.util.Map;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.plaf.ComponentUI;
/*     */ import javax.swing.plaf.basic.BasicEditorPaneUI;
/*     */ import javax.swing.text.Caret;
/*     */ import javax.swing.text.JTextComponent;
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
/*     */ public class FlatEditorPaneUI
/*     */   extends BasicEditorPaneUI
/*     */   implements FlatStylingSupport.StyleableUI
/*     */ {
/*     */   @Styleable
/*     */   protected int minimumWidth;
/*     */   private Color background;
/*     */   @Styleable
/*     */   protected Color disabledBackground;
/*     */   @Styleable
/*     */   protected Color inactiveBackground;
/*     */   @Styleable
/*     */   protected Color focusedBackground;
/*     */   private Color oldDisabledBackground;
/*     */   private Color oldInactiveBackground;
/*     */   private Insets defaultMargin;
/*     */   private Object oldHonorDisplayProperties;
/*     */   private FocusListener focusListener;
/*     */   private Map<String, Object> oldStyleValues;
/*     */   
/*     */   public static ComponentUI createUI(JComponent c) {
/*  86 */     return new FlatEditorPaneUI();
/*     */   }
/*     */ 
/*     */   
/*     */   public void installUI(JComponent c) {
/*  91 */     super.installUI(c);
/*     */     
/*  93 */     installStyle();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installDefaults() {
/*  98 */     super.installDefaults();
/*     */     
/* 100 */     String prefix = getPropertyPrefix();
/* 101 */     this.minimumWidth = UIManager.getInt("Component.minimumWidth");
/* 102 */     this.background = UIManager.getColor(prefix + ".background");
/* 103 */     this.disabledBackground = UIManager.getColor(prefix + ".disabledBackground");
/* 104 */     this.inactiveBackground = UIManager.getColor(prefix + ".inactiveBackground");
/* 105 */     this.focusedBackground = UIManager.getColor(prefix + ".focusedBackground");
/*     */     
/* 107 */     this.defaultMargin = UIManager.getInsets(prefix + ".margin");
/*     */ 
/*     */     
/* 110 */     this.oldHonorDisplayProperties = getComponent().getClientProperty("JEditorPane.honorDisplayProperties");
/* 111 */     getComponent().putClientProperty("JEditorPane.honorDisplayProperties", Boolean.valueOf(true));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallDefaults() {
/* 116 */     super.uninstallDefaults();
/*     */     
/* 118 */     this.background = null;
/* 119 */     this.disabledBackground = null;
/* 120 */     this.inactiveBackground = null;
/* 121 */     this.focusedBackground = null;
/*     */     
/* 123 */     this.oldDisabledBackground = null;
/* 124 */     this.oldInactiveBackground = null;
/*     */     
/* 126 */     this.oldStyleValues = null;
/*     */     
/* 128 */     getComponent().putClientProperty("JEditorPane.honorDisplayProperties", this.oldHonorDisplayProperties);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installListeners() {
/* 133 */     super.installListeners();
/*     */ 
/*     */     
/* 136 */     this.focusListener = new FlatUIUtils.RepaintFocusListener(getComponent(), c -> (this.focusedBackground != null));
/* 137 */     getComponent().addFocusListener(this.focusListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallListeners() {
/* 142 */     super.uninstallListeners();
/*     */     
/* 144 */     getComponent().removeFocusListener(this.focusListener);
/* 145 */     this.focusListener = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Caret createCaret() {
/* 150 */     return new FlatCaret(null, false);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void propertyChange(PropertyChangeEvent e) {
/* 156 */     String propertyName = e.getPropertyName();
/* 157 */     if ("editable".equals(propertyName) || "enabled".equals(propertyName)) {
/* 158 */       updateBackground();
/*     */     }
/* 160 */     super.propertyChange(e);
/* 161 */     propertyChange(getComponent(), e, this::installStyle);
/*     */   }
/*     */   
/*     */   static void propertyChange(JTextComponent c, PropertyChangeEvent e, Runnable installStyle) {
/* 165 */     switch (e.getPropertyName()) {
/*     */       case "JComponent.minimumWidth":
/* 167 */         c.revalidate();
/*     */         break;
/*     */       
/*     */       case "FlatLaf.style":
/*     */       case "FlatLaf.styleClass":
/* 172 */         installStyle.run();
/* 173 */         c.revalidate();
/* 174 */         c.repaint();
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installStyle() {
/*     */     try {
/* 182 */       applyStyle(FlatStylingSupport.getResolvedStyle(getComponent(), "EditorPane"));
/* 183 */     } catch (RuntimeException ex) {
/* 184 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void applyStyle(Object style) {
/* 190 */     this.oldDisabledBackground = this.disabledBackground;
/* 191 */     this.oldInactiveBackground = this.inactiveBackground;
/*     */     
/* 193 */     this.oldStyleValues = FlatStylingSupport.parseAndApply(this.oldStyleValues, style, this::applyStyleProperty);
/*     */     
/* 195 */     updateBackground();
/*     */   }
/*     */ 
/*     */   
/*     */   protected Object applyStyleProperty(String key, Object value) {
/* 200 */     return FlatStylingSupport.applyToAnnotatedObjectOrComponent(this, getComponent(), key, value);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Class<?>> getStyleableInfos(JComponent c) {
/* 206 */     return FlatStylingSupport.getAnnotatedStyleableInfos(this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getStyleableValue(JComponent c, String key) {
/* 212 */     return FlatStylingSupport.getAnnotatedStyleableValue(this, key);
/*     */   }
/*     */   
/*     */   private void updateBackground() {
/* 216 */     FlatTextFieldUI.updateBackground(getComponent(), this.background, this.disabledBackground, this.inactiveBackground, this.oldDisabledBackground, this.oldInactiveBackground);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Dimension getPreferredSize(JComponent c) {
/* 223 */     return applyMinimumWidth(c, super.getPreferredSize(c), this.minimumWidth, this.defaultMargin);
/*     */   }
/*     */ 
/*     */   
/*     */   public Dimension getMinimumSize(JComponent c) {
/* 228 */     return applyMinimumWidth(c, super.getMinimumSize(c), this.minimumWidth, this.defaultMargin);
/*     */   }
/*     */ 
/*     */   
/*     */   static Dimension applyMinimumWidth(JComponent c, Dimension size, int minimumWidth, Insets defaultMargin) {
/* 233 */     if (!FlatTextFieldUI.hasDefaultMargins(c, defaultMargin)) {
/* 234 */       return size;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 240 */     minimumWidth = FlatUIUtils.minimumWidth(c, minimumWidth);
/* 241 */     size.width = Math.max(size.width, UIScale.scale(minimumWidth) - UIScale.scale(1) * 2);
/* 242 */     return size;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void paintSafely(Graphics g) {
/* 247 */     super.paintSafely(HiDPIUtils.createGraphicsTextYCorrection((Graphics2D)g));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void paintBackground(Graphics g) {
/* 252 */     paintBackground(g, getComponent(), this.focusedBackground);
/*     */   }
/*     */   
/*     */   static void paintBackground(Graphics g, JTextComponent c, Color focusedBackground) {
/* 256 */     g.setColor(FlatTextFieldUI.getBackground(c, focusedBackground));
/* 257 */     g.fillRect(0, 0, c.getWidth(), c.getHeight());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatEditorPaneUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */