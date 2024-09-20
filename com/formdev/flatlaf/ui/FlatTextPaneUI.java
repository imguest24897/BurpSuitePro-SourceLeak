/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.util.HiDPIUtils;
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
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
/*     */ import javax.swing.plaf.basic.BasicTextPaneUI;
/*     */ import javax.swing.text.Caret;
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
/*     */ public class FlatTextPaneUI
/*     */   extends BasicTextPaneUI
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
/*  83 */     return new FlatTextPaneUI();
/*     */   }
/*     */ 
/*     */   
/*     */   public void installUI(JComponent c) {
/*  88 */     super.installUI(c);
/*     */     
/*  90 */     installStyle();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installDefaults() {
/*  95 */     super.installDefaults();
/*     */     
/*  97 */     String prefix = getPropertyPrefix();
/*  98 */     this.minimumWidth = UIManager.getInt("Component.minimumWidth");
/*  99 */     this.background = UIManager.getColor(prefix + ".background");
/* 100 */     this.disabledBackground = UIManager.getColor(prefix + ".disabledBackground");
/* 101 */     this.inactiveBackground = UIManager.getColor(prefix + ".inactiveBackground");
/* 102 */     this.focusedBackground = UIManager.getColor(prefix + ".focusedBackground");
/*     */     
/* 104 */     this.defaultMargin = UIManager.getInsets(prefix + ".margin");
/*     */ 
/*     */     
/* 107 */     this.oldHonorDisplayProperties = getComponent().getClientProperty("JEditorPane.honorDisplayProperties");
/* 108 */     getComponent().putClientProperty("JEditorPane.honorDisplayProperties", Boolean.valueOf(true));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallDefaults() {
/* 113 */     super.uninstallDefaults();
/*     */     
/* 115 */     this.background = null;
/* 116 */     this.disabledBackground = null;
/* 117 */     this.inactiveBackground = null;
/* 118 */     this.focusedBackground = null;
/*     */     
/* 120 */     this.oldDisabledBackground = null;
/* 121 */     this.oldInactiveBackground = null;
/*     */     
/* 123 */     this.oldStyleValues = null;
/*     */     
/* 125 */     getComponent().putClientProperty("JEditorPane.honorDisplayProperties", this.oldHonorDisplayProperties);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installListeners() {
/* 130 */     super.installListeners();
/*     */ 
/*     */     
/* 133 */     this.focusListener = new FlatUIUtils.RepaintFocusListener(getComponent(), c -> (this.focusedBackground != null));
/* 134 */     getComponent().addFocusListener(this.focusListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallListeners() {
/* 139 */     super.uninstallListeners();
/*     */     
/* 141 */     getComponent().removeFocusListener(this.focusListener);
/* 142 */     this.focusListener = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Caret createCaret() {
/* 147 */     return new FlatCaret(null, false);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void propertyChange(PropertyChangeEvent e) {
/* 153 */     String propertyName = e.getPropertyName();
/* 154 */     if ("editable".equals(propertyName) || "enabled".equals(propertyName)) {
/* 155 */       updateBackground();
/*     */     }
/* 157 */     super.propertyChange(e);
/* 158 */     FlatEditorPaneUI.propertyChange(getComponent(), e, this::installStyle);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installStyle() {
/*     */     try {
/* 164 */       applyStyle(FlatStylingSupport.getResolvedStyle(getComponent(), "TextPane"));
/* 165 */     } catch (RuntimeException ex) {
/* 166 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void applyStyle(Object style) {
/* 172 */     this.oldDisabledBackground = this.disabledBackground;
/* 173 */     this.oldInactiveBackground = this.inactiveBackground;
/*     */     
/* 175 */     this.oldStyleValues = FlatStylingSupport.parseAndApply(this.oldStyleValues, style, this::applyStyleProperty);
/*     */     
/* 177 */     updateBackground();
/*     */   }
/*     */ 
/*     */   
/*     */   protected Object applyStyleProperty(String key, Object value) {
/* 182 */     return FlatStylingSupport.applyToAnnotatedObjectOrComponent(this, getComponent(), key, value);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Class<?>> getStyleableInfos(JComponent c) {
/* 188 */     return FlatStylingSupport.getAnnotatedStyleableInfos(this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getStyleableValue(JComponent c, String key) {
/* 194 */     return FlatStylingSupport.getAnnotatedStyleableValue(this, key);
/*     */   }
/*     */   
/*     */   private void updateBackground() {
/* 198 */     FlatTextFieldUI.updateBackground(getComponent(), this.background, this.disabledBackground, this.inactiveBackground, this.oldDisabledBackground, this.oldInactiveBackground);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Dimension getPreferredSize(JComponent c) {
/* 205 */     return FlatEditorPaneUI.applyMinimumWidth(c, super.getPreferredSize(c), this.minimumWidth, this.defaultMargin);
/*     */   }
/*     */ 
/*     */   
/*     */   public Dimension getMinimumSize(JComponent c) {
/* 210 */     return FlatEditorPaneUI.applyMinimumWidth(c, super.getMinimumSize(c), this.minimumWidth, this.defaultMargin);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void paintSafely(Graphics g) {
/* 215 */     super.paintSafely(HiDPIUtils.createGraphicsTextYCorrection((Graphics2D)g));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void paintBackground(Graphics g) {
/* 220 */     FlatEditorPaneUI.paintBackground(g, getComponent(), this.focusedBackground);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatTextPaneUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */