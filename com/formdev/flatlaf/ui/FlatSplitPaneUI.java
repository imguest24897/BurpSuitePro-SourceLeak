/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import com.formdev.flatlaf.util.UIScale;
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.util.Map;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JSplitPane;
/*     */ import javax.swing.ToolTipManager;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.plaf.ComponentUI;
/*     */ import javax.swing.plaf.basic.BasicSplitPaneDivider;
/*     */ import javax.swing.plaf.basic.BasicSplitPaneUI;
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
/*     */ public class FlatSplitPaneUI
/*     */   extends BasicSplitPaneUI
/*     */   implements FlatStylingSupport.StyleableUI
/*     */ {
/*     */   @Styleable
/*     */   protected String arrowType;
/*     */   @Styleable
/*     */   protected Color oneTouchArrowColor;
/*     */   @Styleable
/*     */   protected Color oneTouchHoverArrowColor;
/*     */   @Styleable
/*     */   protected Color oneTouchPressedArrowColor;
/*     */   private Map<String, Object> oldStyleValues;
/*     */   
/*     */   public static ComponentUI createUI(JComponent c) {
/*  93 */     return new FlatSplitPaneUI();
/*     */   }
/*     */ 
/*     */   
/*     */   public void installUI(JComponent c) {
/*  98 */     super.installUI(c);
/*     */     
/* 100 */     installStyle();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installDefaults() {
/* 105 */     this.arrowType = UIManager.getString("Component.arrowType");
/*     */ 
/*     */ 
/*     */     
/* 109 */     this.oneTouchArrowColor = UIManager.getColor("SplitPaneDivider.oneTouchArrowColor");
/* 110 */     this.oneTouchHoverArrowColor = UIManager.getColor("SplitPaneDivider.oneTouchHoverArrowColor");
/* 111 */     this.oneTouchPressedArrowColor = UIManager.getColor("SplitPaneDivider.oneTouchPressedArrowColor");
/*     */     
/* 113 */     super.installDefaults();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallDefaults() {
/* 118 */     super.uninstallDefaults();
/*     */     
/* 120 */     this.oneTouchArrowColor = null;
/* 121 */     this.oneTouchHoverArrowColor = null;
/* 122 */     this.oneTouchPressedArrowColor = null;
/*     */     
/* 124 */     this.oldStyleValues = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected PropertyChangeListener createPropertyChangeListener() {
/* 129 */     return FlatStylingSupport.createPropertyChangeListener(this.splitPane, this::installStyle, super
/* 130 */         .createPropertyChangeListener());
/*     */   }
/*     */ 
/*     */   
/*     */   public BasicSplitPaneDivider createDefaultDivider() {
/* 135 */     return new FlatSplitPaneDivider(this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installStyle() {
/*     */     try {
/* 141 */       applyStyle(FlatStylingSupport.getResolvedStyle(this.splitPane, "SplitPane"));
/* 142 */     } catch (RuntimeException ex) {
/* 143 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void applyStyle(Object style) {
/* 149 */     this.oldStyleValues = FlatStylingSupport.parseAndApply(this.oldStyleValues, style, this::applyStyleProperty);
/*     */     
/* 151 */     if (this.divider instanceof FlatSplitPaneDivider) {
/* 152 */       ((FlatSplitPaneDivider)this.divider).updateStyle();
/*     */     }
/*     */   }
/*     */   
/*     */   protected Object applyStyleProperty(String key, Object value) {
/*     */     try {
/* 158 */       if (this.divider instanceof FlatSplitPaneDivider)
/* 159 */         return ((FlatSplitPaneDivider)this.divider).applyStyleProperty(key, value); 
/* 160 */     } catch (UnknownStyleException unknownStyleException) {}
/*     */ 
/*     */     
/* 163 */     return FlatStylingSupport.applyToAnnotatedObjectOrComponent(this, this.splitPane, key, value);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Class<?>> getStyleableInfos(JComponent c) {
/* 169 */     Map<String, Class<?>> infos = FlatStylingSupport.getAnnotatedStyleableInfos(this);
/* 170 */     if (this.divider instanceof FlatSplitPaneDivider)
/* 171 */       infos.putAll(((FlatSplitPaneDivider)this.divider).getStyleableInfos()); 
/* 172 */     return infos;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getStyleableValue(JComponent c, String key) {
/* 178 */     if (this.divider instanceof FlatSplitPaneDivider) {
/* 179 */       Object value = ((FlatSplitPaneDivider)this.divider).getStyleableValue(key);
/* 180 */       if (value != null)
/* 181 */         return value; 
/*     */     } 
/* 183 */     return FlatStylingSupport.getAnnotatedStyleableValue(this, key);
/*     */   }
/*     */ 
/*     */   
/*     */   protected class FlatSplitPaneDivider
/*     */     extends BasicSplitPaneDivider
/*     */   {
/*     */     @Styleable
/* 191 */     protected String style = UIManager.getString("SplitPaneDivider.style"); @Styleable
/* 192 */     protected Color gripColor = UIManager.getColor("SplitPaneDivider.gripColor"); @Styleable
/* 193 */     protected int gripDotCount = FlatUIUtils.getUIInt("SplitPaneDivider.gripDotCount", 3); @Styleable
/* 194 */     protected int gripDotSize = FlatUIUtils.getUIInt("SplitPaneDivider.gripDotSize", 3); @Styleable
/* 195 */     protected int gripGap = FlatUIUtils.getUIInt("SplitPaneDivider.gripGap", 2);
/*     */     
/*     */     protected FlatSplitPaneDivider(BasicSplitPaneUI ui) {
/* 198 */       super(ui);
/*     */       
/* 200 */       setLayout(new FlatDividerLayout());
/*     */     }
/*     */ 
/*     */     
/*     */     protected Object applyStyleProperty(String key, Object value) {
/* 205 */       return FlatStylingSupport.applyToAnnotatedObject(this, key, value);
/*     */     }
/*     */ 
/*     */     
/*     */     public Map<String, Class<?>> getStyleableInfos() {
/* 210 */       return FlatStylingSupport.getAnnotatedStyleableInfos(this);
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getStyleableValue(String key) {
/* 215 */       return FlatStylingSupport.getAnnotatedStyleableValue(this, key);
/*     */     }
/*     */     
/*     */     void updateStyle() {
/* 219 */       if (this.leftButton instanceof FlatOneTouchButton)
/* 220 */         ((FlatOneTouchButton)this.leftButton).updateStyle(); 
/* 221 */       if (this.rightButton instanceof FlatOneTouchButton) {
/* 222 */         ((FlatOneTouchButton)this.rightButton).updateStyle();
/*     */       }
/*     */     }
/*     */     
/*     */     public void setDividerSize(int newSize) {
/* 227 */       super.setDividerSize(UIScale.scale(newSize));
/*     */     }
/*     */ 
/*     */     
/*     */     protected JButton createLeftOneTouchButton() {
/* 232 */       return new FlatOneTouchButton(true);
/*     */     }
/*     */ 
/*     */     
/*     */     protected JButton createRightOneTouchButton() {
/* 237 */       return new FlatOneTouchButton(false);
/*     */     }
/*     */ 
/*     */     
/*     */     public void propertyChange(PropertyChangeEvent e) {
/* 242 */       super.propertyChange(e);
/*     */       
/* 244 */       switch (e.getPropertyName()) {
/*     */         
/*     */         case "dividerLocation":
/* 247 */           doLayout();
/*     */           break;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void paint(Graphics g) {
/* 254 */       super.paint(g);
/*     */       
/* 256 */       if ("plain".equals(this.style)) {
/*     */         return;
/*     */       }
/* 259 */       Object[] oldRenderingHints = FlatUIUtils.setRenderingHints(g);
/*     */       
/* 261 */       g.setColor(this.gripColor);
/* 262 */       paintGrip(g, 0, 0, getWidth(), getHeight());
/*     */       
/* 264 */       FlatUIUtils.resetRenderingHints(g, oldRenderingHints);
/*     */     }
/*     */     
/*     */     protected void paintGrip(Graphics g, int x, int y, int width, int height) {
/* 268 */       FlatUIUtils.paintGrip(g, x, y, width, height, 
/* 269 */           (this.splitPane.getOrientation() == 0), this.gripDotCount, this.gripDotSize, this.gripGap, true);
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean isLeftCollapsed() {
/* 274 */       int location = this.splitPane.getDividerLocation();
/* 275 */       Insets insets = this.splitPane.getInsets();
/* 276 */       return (this.orientation == 0) ? (
/* 277 */         (location == insets.top)) : (
/* 278 */         (location == insets.left));
/*     */     }
/*     */     
/*     */     protected boolean isRightCollapsed() {
/* 282 */       int location = this.splitPane.getDividerLocation();
/* 283 */       Insets insets = this.splitPane.getInsets();
/* 284 */       return (this.orientation == 0) ? (
/* 285 */         (location == this.splitPane.getHeight() - getHeight() - insets.bottom)) : (
/* 286 */         (location == this.splitPane.getWidth() - getWidth() - insets.right));
/*     */     }
/*     */ 
/*     */     
/*     */     protected class FlatOneTouchButton
/*     */       extends FlatArrowButton
/*     */     {
/*     */       protected final boolean left;
/*     */ 
/*     */       
/*     */       protected FlatOneTouchButton(boolean left) {
/* 297 */         super(1, FlatSplitPaneUI.this.arrowType, FlatSplitPaneUI.this.oneTouchArrowColor, (Color)null, FlatSplitPaneUI.this.oneTouchHoverArrowColor, (Color)null, FlatSplitPaneUI.this.oneTouchPressedArrowColor, (Color)null);
/*     */         
/* 299 */         setCursor(Cursor.getPredefinedCursor(0));
/* 300 */         ToolTipManager.sharedInstance().registerComponent(this);
/*     */         
/* 302 */         this.left = left;
/*     */       }
/*     */       
/*     */       protected void updateStyle() {
/* 306 */         updateStyle(FlatSplitPaneUI.this.arrowType, FlatSplitPaneUI.this.oneTouchArrowColor, (Color)null, FlatSplitPaneUI.this.oneTouchHoverArrowColor, (Color)null, FlatSplitPaneUI.this.oneTouchPressedArrowColor, (Color)null);
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public int getDirection() {
/* 312 */         return (FlatSplitPaneUI.FlatSplitPaneDivider.this.orientation == 0) ? (
/* 313 */           this.left ? 1 : 5) : (
/* 314 */           this.left ? 7 : 3);
/*     */       }
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
/*     */       public String getToolTipText(MouseEvent e) {
/* 333 */         String key = (FlatSplitPaneUI.FlatSplitPaneDivider.this.orientation == 0) ? (this.left ? (FlatSplitPaneUI.FlatSplitPaneDivider.this.isRightCollapsed() ? "SplitPaneDivider.expandBottomToolTipText" : "SplitPaneDivider.collapseTopToolTipText") : (FlatSplitPaneUI.FlatSplitPaneDivider.this.isLeftCollapsed() ? "SplitPaneDivider.expandTopToolTipText" : "SplitPaneDivider.collapseBottomToolTipText")) : (this.left ? (FlatSplitPaneUI.FlatSplitPaneDivider.this.isRightCollapsed() ? "SplitPaneDivider.expandRightToolTipText" : "SplitPaneDivider.collapseLeftToolTipText") : (FlatSplitPaneUI.FlatSplitPaneDivider.this.isLeftCollapsed() ? "SplitPaneDivider.expandLeftToolTipText" : "SplitPaneDivider.collapseRightToolTipText"));
/*     */ 
/*     */         
/* 336 */         Object value = FlatSplitPaneUI.FlatSplitPaneDivider.this.splitPane.getClientProperty(key);
/* 337 */         if (value instanceof String) {
/* 338 */           return (String)value;
/*     */         }
/*     */         
/* 341 */         return UIManager.getString(key, getLocale());
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     protected class FlatDividerLayout
/*     */       extends BasicSplitPaneDivider.DividerLayout
/*     */     {
/*     */       public void layoutContainer(Container c) {
/* 352 */         super.layoutContainer(c);
/*     */         
/* 354 */         if (FlatSplitPaneUI.FlatSplitPaneDivider.this.leftButton == null || FlatSplitPaneUI.FlatSplitPaneDivider.this.rightButton == null || !FlatSplitPaneUI.FlatSplitPaneDivider.this.splitPane.isOneTouchExpandable()) {
/*     */           return;
/*     */         }
/*     */ 
/*     */         
/* 359 */         int extraSize = UIScale.scale(4);
/* 360 */         if (FlatSplitPaneUI.FlatSplitPaneDivider.this.orientation == 0) {
/* 361 */           FlatSplitPaneUI.FlatSplitPaneDivider.this.leftButton.setSize(FlatSplitPaneUI.FlatSplitPaneDivider.this.leftButton.getWidth() + extraSize, FlatSplitPaneUI.FlatSplitPaneDivider.this.leftButton.getHeight());
/* 362 */           FlatSplitPaneUI.FlatSplitPaneDivider.this.rightButton.setBounds(FlatSplitPaneUI.FlatSplitPaneDivider.this.leftButton.getX() + FlatSplitPaneUI.FlatSplitPaneDivider.this.leftButton.getWidth(), FlatSplitPaneUI.FlatSplitPaneDivider.this.rightButton.getY(), FlatSplitPaneUI.FlatSplitPaneDivider.this
/* 363 */               .rightButton.getWidth() + extraSize, FlatSplitPaneUI.FlatSplitPaneDivider.this.rightButton.getHeight());
/*     */         } else {
/* 365 */           FlatSplitPaneUI.FlatSplitPaneDivider.this.leftButton.setSize(FlatSplitPaneUI.FlatSplitPaneDivider.this.leftButton.getWidth(), FlatSplitPaneUI.FlatSplitPaneDivider.this.leftButton.getHeight() + extraSize);
/* 366 */           FlatSplitPaneUI.FlatSplitPaneDivider.this.rightButton.setBounds(FlatSplitPaneUI.FlatSplitPaneDivider.this.rightButton.getX(), FlatSplitPaneUI.FlatSplitPaneDivider.this.leftButton.getY() + FlatSplitPaneUI.FlatSplitPaneDivider.this.leftButton.getHeight(), FlatSplitPaneUI.FlatSplitPaneDivider.this
/* 367 */               .rightButton.getWidth(), FlatSplitPaneUI.FlatSplitPaneDivider.this.rightButton.getHeight() + extraSize);
/*     */         } 
/*     */ 
/*     */         
/* 371 */         boolean leftCollapsed = FlatSplitPaneUI.FlatSplitPaneDivider.this.isLeftCollapsed();
/* 372 */         boolean rightCollapsed = FlatSplitPaneUI.FlatSplitPaneDivider.this.isRightCollapsed();
/* 373 */         if (leftCollapsed || rightCollapsed) {
/* 374 */           FlatSplitPaneUI.FlatSplitPaneDivider.this.leftButton.setVisible(!leftCollapsed);
/* 375 */           FlatSplitPaneUI.FlatSplitPaneDivider.this.rightButton.setVisible(!rightCollapsed);
/*     */         } else {
/* 377 */           Object expandableSide = FlatSplitPaneUI.FlatSplitPaneDivider.this.splitPane.getClientProperty("JSplitPane.expandableSide");
/* 378 */           FlatSplitPaneUI.FlatSplitPaneDivider.this.leftButton.setVisible((expandableSide == null || !"left".equals(expandableSide)));
/* 379 */           FlatSplitPaneUI.FlatSplitPaneDivider.this.rightButton.setVisible((expandableSide == null || !"right".equals(expandableSide)));
/*     */         } 
/*     */ 
/*     */         
/* 383 */         if (!FlatSplitPaneUI.FlatSplitPaneDivider.this.leftButton.isVisible())
/* 384 */           FlatSplitPaneUI.FlatSplitPaneDivider.this.rightButton.setLocation(FlatSplitPaneUI.FlatSplitPaneDivider.this.leftButton.getLocation()); 
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatSplitPaneUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */