/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import com.formdev.flatlaf.util.UIScale;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.FocusTraversalPolicy;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Insets;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.event.ContainerEvent;
/*     */ import java.awt.event.ContainerListener;
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Map;
/*     */ import javax.swing.AbstractButton;
/*     */ import javax.swing.ButtonGroup;
/*     */ import javax.swing.ButtonModel;
/*     */ import javax.swing.DefaultButtonModel;
/*     */ import javax.swing.InputMap;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JToolBar;
/*     */ import javax.swing.LayoutFocusTraversalPolicy;
/*     */ import javax.swing.RootPaneContainer;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.border.Border;
/*     */ import javax.swing.plaf.ComponentUI;
/*     */ import javax.swing.plaf.basic.BasicToolBarUI;
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
/*     */ public class FlatToolBarUI
/*     */   extends BasicToolBarUI
/*     */   implements FlatStylingSupport.StyleableUI
/*     */ {
/*     */   @Styleable
/*     */   protected boolean focusableButtons;
/*     */   @Styleable
/*     */   protected boolean arrowKeysOnlyNavigation;
/*     */   @Styleable
/*     */   protected int hoverButtonGroupArc;
/*     */   @Styleable
/*     */   protected Color hoverButtonGroupBackground;
/*     */   @Styleable
/*     */   protected Insets borderMargins;
/*     */   @Styleable
/*     */   protected Color gripColor;
/*     */   private FocusTraversalPolicy focusTraversalPolicy;
/*     */   private Boolean oldFloatable;
/*     */   private Map<String, Object> oldStyleValues;
/*     */   
/*     */   public static ComponentUI createUI(JComponent c) {
/* 101 */     return new FlatToolBarUI();
/*     */   }
/*     */ 
/*     */   
/*     */   public void installUI(JComponent c) {
/* 106 */     super.installUI(c);
/*     */     
/* 108 */     installFocusTraversalPolicy();
/*     */     
/* 110 */     installStyle();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 115 */     if (!this.focusableButtons) {
/* 116 */       setButtonsFocusable(false);
/*     */     }
/*     */   }
/*     */   
/*     */   public void uninstallUI(JComponent c) {
/* 121 */     super.uninstallUI(c);
/*     */ 
/*     */     
/* 124 */     if (!this.focusableButtons) {
/* 125 */       setButtonsFocusable(true);
/*     */     }
/* 127 */     uninstallFocusTraversalPolicy();
/*     */     
/* 129 */     this.oldStyleValues = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installDefaults() {
/* 134 */     super.installDefaults();
/*     */     
/* 136 */     this.focusableButtons = UIManager.getBoolean("ToolBar.focusableButtons");
/* 137 */     this.arrowKeysOnlyNavigation = UIManager.getBoolean("ToolBar.arrowKeysOnlyNavigation");
/* 138 */     this.hoverButtonGroupArc = UIManager.getInt("ToolBar.hoverButtonGroupArc");
/* 139 */     this.hoverButtonGroupBackground = UIManager.getColor("ToolBar.hoverButtonGroupBackground");
/*     */ 
/*     */     
/* 142 */     if (!UIManager.getBoolean("ToolBar.floatable")) {
/* 143 */       this.oldFloatable = Boolean.valueOf(this.toolBar.isFloatable());
/* 144 */       this.toolBar.setFloatable(false);
/*     */     } else {
/* 146 */       this.oldFloatable = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void uninstallDefaults() {
/* 151 */     super.uninstallDefaults();
/*     */     
/* 153 */     this.hoverButtonGroupBackground = null;
/*     */     
/* 155 */     if (this.oldFloatable != null) {
/* 156 */       this.toolBar.setFloatable(this.oldFloatable.booleanValue());
/* 157 */       this.oldFloatable = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected RootPaneContainer createFloatingWindow(JToolBar toolbar) {
/* 163 */     RootPaneContainer floatingWindow = super.createFloatingWindow(toolbar);
/* 164 */     floatingWindow.getRootPane().putClientProperty("Window.style", "small");
/* 165 */     return floatingWindow;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ContainerListener createToolBarContListener() {
/* 170 */     return new BasicToolBarUI.ToolBarContListener()
/*     */       {
/*     */         public void componentAdded(ContainerEvent e) {
/* 173 */           super.componentAdded(e);
/*     */           
/* 175 */           if (!FlatToolBarUI.this.focusableButtons) {
/* 176 */             FlatToolBarUI.this.setButtonFocusable(e.getChild(), false);
/*     */           }
/*     */         }
/*     */         
/*     */         public void componentRemoved(ContainerEvent e) {
/* 181 */           super.componentRemoved(e);
/*     */           
/* 183 */           if (!FlatToolBarUI.this.focusableButtons) {
/* 184 */             FlatToolBarUI.this.setButtonFocusable(e.getChild(), true);
/*     */           }
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   protected PropertyChangeListener createPropertyListener() {
/* 191 */     return FlatStylingSupport.createPropertyChangeListener(this.toolBar, this::installStyle, super.createPropertyListener());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installStyle() {
/*     */     try {
/* 197 */       applyStyle(FlatStylingSupport.getResolvedStyle(this.toolBar, "ToolBar"));
/* 198 */     } catch (RuntimeException ex) {
/* 199 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void applyStyle(Object style) {
/* 205 */     boolean oldFocusableButtons = this.focusableButtons;
/* 206 */     boolean oldArrowKeysOnlyNavigation = this.arrowKeysOnlyNavigation;
/*     */     
/* 208 */     this.oldStyleValues = FlatStylingSupport.parseAndApply(this.oldStyleValues, style, this::applyStyleProperty);
/*     */     
/* 210 */     if (this.focusableButtons != oldFocusableButtons)
/* 211 */       setButtonsFocusable(this.focusableButtons); 
/* 212 */     if (this.arrowKeysOnlyNavigation != oldArrowKeysOnlyNavigation || this.focusableButtons != oldFocusableButtons) {
/* 213 */       if (this.arrowKeysOnlyNavigation) {
/* 214 */         installFocusTraversalPolicy();
/*     */       } else {
/* 216 */         uninstallFocusTraversalPolicy();
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   protected Object applyStyleProperty(String key, Object value) {
/* 222 */     return FlatStylingSupport.applyToAnnotatedObjectOrComponent(this, this.toolBar, key, value);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Class<?>> getStyleableInfos(JComponent c) {
/* 228 */     return FlatStylingSupport.getAnnotatedStyleableInfos(this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getStyleableValue(JComponent c, String key) {
/* 234 */     return FlatStylingSupport.getAnnotatedStyleableValue(this, key);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void setButtonsFocusable(boolean focusable) {
/* 239 */     for (Component c : this.toolBar.getComponents())
/* 240 */       setButtonFocusable(c, focusable); 
/*     */   }
/*     */   
/*     */   private void setButtonFocusable(Component c, boolean focusable) {
/* 244 */     if (c instanceof AbstractButton && focusable != c.isFocusable()) {
/* 245 */       c.setFocusable(focusable);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void installFocusTraversalPolicy() {
/* 250 */     if (!this.arrowKeysOnlyNavigation || !this.focusableButtons || this.toolBar.getFocusTraversalPolicy() != null) {
/*     */       return;
/*     */     }
/* 253 */     this.focusTraversalPolicy = createFocusTraversalPolicy();
/* 254 */     if (this.focusTraversalPolicy != null) {
/* 255 */       this.toolBar.setFocusTraversalPolicy(this.focusTraversalPolicy);
/* 256 */       this.toolBar.setFocusTraversalPolicyProvider(true);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallFocusTraversalPolicy() {
/* 262 */     if (this.focusTraversalPolicy != null && this.toolBar.getFocusTraversalPolicy() == this.focusTraversalPolicy) {
/* 263 */       this.toolBar.setFocusTraversalPolicy((FocusTraversalPolicy)null);
/* 264 */       this.toolBar.setFocusTraversalPolicyProvider(false);
/*     */     } 
/* 266 */     this.focusTraversalPolicy = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected FocusTraversalPolicy createFocusTraversalPolicy() {
/* 271 */     return new FlatToolBarFocusTraversalPolicy();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void navigateFocusedComp(int direction) {
/* 280 */     int add, count = this.toolBar.getComponentCount();
/*     */     
/* 282 */     if (this.focusedCompIndex < 0 || this.focusedCompIndex >= count) {
/*     */       return;
/*     */     }
/*     */     
/* 286 */     switch (direction) { case 3: case 5:
/* 287 */         add = 1; break;
/* 288 */       case 1: case 7: add = -1; break;
/*     */       default:
/*     */         return; }
/*     */     
/* 292 */     int i = this.focusedCompIndex;
/*     */     while (true) {
/* 294 */       i += add;
/* 295 */       if (i < 0) {
/* 296 */         i = count - 1;
/* 297 */       } else if (i >= count) {
/* 298 */         i = 0;
/* 299 */       }  if (i == this.focusedCompIndex) {
/*     */         break;
/*     */       }
/* 302 */       Component c = this.toolBar.getComponentAtIndex(i);
/* 303 */       if (canBeFocusOwner(c)) {
/* 304 */         c.requestFocus();
/*     */         return;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   protected void setBorderToRollover(Component c) {}
/*     */   
/*     */   private static boolean canBeFocusOwner(Component c) {
/* 312 */     if (c == null || !c.isEnabled() || !c.isVisible() || !c.isDisplayable() || !c.isFocusable()) {
/* 313 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 317 */     if (c instanceof JComboBox) {
/* 318 */       JComboBox<?> comboBox = (JComboBox)c;
/* 319 */       return comboBox.getUI().isFocusTraversable(comboBox);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 325 */     if (c instanceof JComponent) {
/* 326 */       InputMap inputMap = ((JComponent)c).getInputMap(0);
/* 327 */       while (inputMap != null && inputMap.size() == 0)
/* 328 */         inputMap = inputMap.getParent(); 
/* 329 */       if (inputMap == null) {
/* 330 */         return false;
/*     */       }
/*     */     } 
/* 333 */     return true;
/*     */   }
/*     */   protected void setBorderToNonRollover(Component c) {}
/*     */   protected void setBorderToNormal(Component c) {}
/*     */   protected void installRolloverBorders(JComponent c) {}
/*     */   protected void installNonRolloverBorders(JComponent c) {}
/*     */   
/*     */   protected void installNormalBorders(JComponent c) {}
/*     */   
/*     */   protected Border createRolloverBorder() {
/* 343 */     return null; } protected Border createNonRolloverBorder() {
/* 344 */     return null;
/*     */   }
/*     */   
/*     */   public void setOrientation(int orientation) {
/* 348 */     if (orientation != this.toolBar.getOrientation()) {
/*     */       
/* 350 */       Insets margin = this.toolBar.getMargin();
/* 351 */       Insets newMargin = new Insets(margin.left, margin.top, margin.right, margin.bottom);
/* 352 */       if (!newMargin.equals(margin)) {
/* 353 */         this.toolBar.setMargin(newMargin);
/*     */       }
/*     */     } 
/* 356 */     super.setOrientation(orientation);
/*     */   }
/*     */ 
/*     */   
/*     */   public void paint(Graphics g, JComponent c) {
/* 361 */     super.paint(g, c);
/*     */     
/* 363 */     paintButtonGroup(g);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void paintButtonGroup(Graphics g) {
/* 368 */     if (this.hoverButtonGroupBackground == null) {
/*     */       return;
/*     */     }
/*     */     
/* 372 */     ButtonGroup group = null;
/* 373 */     for (Component b : this.toolBar.getComponents()) {
/* 374 */       if (b instanceof AbstractButton && ((AbstractButton)b).getModel().isRollover()) {
/* 375 */         group = getButtonGroup((AbstractButton)b);
/* 376 */         if (group != null)
/*     */           break; 
/*     */       } 
/*     */     } 
/* 380 */     if (group == null) {
/*     */       return;
/*     */     }
/*     */     
/* 384 */     ArrayList<Rectangle> rects = new ArrayList<>();
/* 385 */     Enumeration<AbstractButton> e = group.getElements();
/* 386 */     while (e.hasMoreElements()) {
/* 387 */       AbstractButton gb = e.nextElement();
/* 388 */       if (gb.getParent() == this.toolBar) {
/* 389 */         rects.add(gb.getBounds());
/*     */       }
/*     */     } 
/*     */     
/* 393 */     boolean horizontal = (this.toolBar.getOrientation() == 0);
/* 394 */     rects.sort((r1, r2) -> horizontal ? (r1.x - r2.x) : (r1.y - r2.y));
/*     */     
/* 396 */     Object[] oldRenderingHints = FlatUIUtils.setRenderingHints(g);
/* 397 */     g.setColor(FlatUIUtils.deriveColor(this.hoverButtonGroupBackground, this.toolBar.getBackground()));
/*     */ 
/*     */     
/* 400 */     int maxSepWidth = UIScale.scale(10);
/* 401 */     Rectangle gr = null;
/* 402 */     for (Rectangle r : rects) {
/* 403 */       if (gr == null) {
/*     */         
/* 405 */         gr = r; continue;
/* 406 */       }  if (horizontal ? (gr.x + gr.width + maxSepWidth >= r.x) : (gr.y + gr.height + maxSepWidth >= r.y)) {
/*     */         
/* 408 */         gr = gr.union(r);
/*     */         continue;
/*     */       } 
/* 411 */       FlatUIUtils.paintComponentBackground((Graphics2D)g, gr.x, gr.y, gr.width, gr.height, 0.0F, UIScale.scale(this.hoverButtonGroupArc));
/* 412 */       gr = r;
/*     */     } 
/*     */     
/* 415 */     if (gr != null) {
/* 416 */       FlatUIUtils.paintComponentBackground((Graphics2D)g, gr.x, gr.y, gr.width, gr.height, 0.0F, UIScale.scale(this.hoverButtonGroupArc));
/*     */     }
/* 418 */     FlatUIUtils.resetRenderingHints(g, oldRenderingHints);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void repaintButtonGroup(AbstractButton b) {
/* 423 */     if (this.hoverButtonGroupBackground == null) {
/*     */       return;
/*     */     }
/* 426 */     ButtonGroup group = getButtonGroup(b);
/* 427 */     if (group == null) {
/*     */       return;
/*     */     }
/*     */     
/* 431 */     Rectangle gr = null;
/* 432 */     Enumeration<AbstractButton> e = group.getElements();
/* 433 */     while (e.hasMoreElements()) {
/* 434 */       AbstractButton gb = e.nextElement();
/* 435 */       Container parent = gb.getParent();
/* 436 */       if (parent == this.toolBar) {
/* 437 */         gr = (gr != null) ? gr.union(gb.getBounds()) : gb.getBounds();
/*     */       }
/*     */     } 
/*     */     
/* 441 */     if (gr != null)
/* 442 */       this.toolBar.repaint(gr); 
/*     */   }
/*     */   
/*     */   private ButtonGroup getButtonGroup(AbstractButton b) {
/* 446 */     ButtonModel model = b.getModel();
/* 447 */     return (model instanceof DefaultButtonModel) ? (
/* 448 */       (DefaultButtonModel)model).getGroup() : 
/* 449 */       null;
/*     */   }
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
/*     */   protected class FlatToolBarFocusTraversalPolicy
/*     */     extends LayoutFocusTraversalPolicy
/*     */   {
/*     */     public Component getComponentAfter(Container aContainer, Component aComponent) {
/* 472 */       if (!(aComponent instanceof AbstractButton)) {
/* 473 */         return super.getComponentAfter(aContainer, aComponent);
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 478 */       Component c = aComponent;
/* 479 */       while ((c = super.getComponentAfter(aContainer, c)) != null) {
/* 480 */         if (!(c instanceof AbstractButton)) {
/* 481 */           return c;
/*     */         }
/*     */       } 
/*     */       
/* 485 */       return null;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Component getComponentBefore(Container aContainer, Component aComponent) {
/* 492 */       if (!(aComponent instanceof AbstractButton)) {
/* 493 */         return super.getComponentBefore(aContainer, aComponent);
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 498 */       Component c = aComponent;
/* 499 */       while ((c = super.getComponentBefore(aContainer, c)) != null) {
/* 500 */         if (!(c instanceof AbstractButton)) {
/* 501 */           return c;
/*     */         }
/*     */       } 
/*     */       
/* 505 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     public Component getFirstComponent(Container aContainer) {
/* 510 */       return getRecentComponent(aContainer, true);
/*     */     }
/*     */ 
/*     */     
/*     */     public Component getLastComponent(Container aContainer) {
/* 515 */       return getRecentComponent(aContainer, false);
/*     */     }
/*     */ 
/*     */     
/*     */     private Component getRecentComponent(Container aContainer, boolean first) {
/* 520 */       if (FlatToolBarUI.this.focusedCompIndex >= 0 && FlatToolBarUI.this.focusedCompIndex < FlatToolBarUI.this.toolBar.getComponentCount()) {
/* 521 */         return FlatToolBarUI.this.toolBar.getComponent(FlatToolBarUI.this.focusedCompIndex);
/*     */       }
/* 523 */       return first ? 
/* 524 */         super.getFirstComponent(aContainer) : 
/* 525 */         super.getLastComponent(aContainer);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatToolBarUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */