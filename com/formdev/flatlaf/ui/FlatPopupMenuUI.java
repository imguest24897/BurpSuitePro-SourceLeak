/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.GraphicsConfiguration;
/*     */ import java.awt.GraphicsDevice;
/*     */ import java.awt.GraphicsEnvironment;
/*     */ import java.awt.Insets;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.Point;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.MouseListener;
/*     */ import java.awt.event.MouseWheelEvent;
/*     */ import java.awt.event.MouseWheelListener;
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.atomic.AtomicBoolean;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JMenuItem;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JPopupMenu;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JViewport;
/*     */ import javax.swing.MenuElement;
/*     */ import javax.swing.MenuSelectionManager;
/*     */ import javax.swing.Popup;
/*     */ import javax.swing.PopupFactory;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.Timer;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.border.Border;
/*     */ import javax.swing.event.MenuKeyEvent;
/*     */ import javax.swing.event.MenuKeyListener;
/*     */ import javax.swing.event.PopupMenuEvent;
/*     */ import javax.swing.event.PopupMenuListener;
/*     */ import javax.swing.plaf.ButtonUI;
/*     */ import javax.swing.plaf.ComponentUI;
/*     */ import javax.swing.plaf.basic.BasicMenuItemUI;
/*     */ import javax.swing.plaf.basic.BasicPopupMenuUI;
/*     */ import javax.swing.plaf.basic.DefaultMenuLayout;
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
/*     */ public class FlatPopupMenuUI
/*     */   extends BasicPopupMenuUI
/*     */   implements FlatStylingSupport.StyleableUI
/*     */ {
/*     */   @Styleable
/*     */   protected String arrowType;
/*     */   @Styleable
/*     */   protected Color scrollArrowColor;
/*     */   @Styleable
/*     */   protected Color hoverScrollArrowBackground;
/*     */   private PropertyChangeListener propertyChangeListener;
/*     */   private Map<String, Object> oldStyleValues;
/*     */   private AtomicBoolean borderShared;
/*     */   
/*     */   public static ComponentUI createUI(JComponent c) {
/* 106 */     return new FlatPopupMenuUI();
/*     */   }
/*     */ 
/*     */   
/*     */   public void installUI(JComponent c) {
/* 111 */     super.installUI(c);
/*     */     
/* 113 */     installStyle();
/*     */   }
/*     */ 
/*     */   
/*     */   public void uninstallUI(JComponent c) {
/* 118 */     super.uninstallUI(c);
/*     */     
/* 120 */     this.oldStyleValues = null;
/* 121 */     this.borderShared = null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void installDefaults() {
/* 126 */     super.installDefaults();
/*     */     
/* 128 */     this.arrowType = UIManager.getString("Component.arrowType");
/* 129 */     this.scrollArrowColor = UIManager.getColor("PopupMenu.scrollArrowColor");
/* 130 */     this.hoverScrollArrowBackground = UIManager.getColor("PopupMenu.hoverScrollArrowBackground");
/*     */     
/* 132 */     LayoutManager layout = this.popupMenu.getLayout();
/* 133 */     if (layout == null || layout instanceof javax.swing.plaf.UIResource) {
/* 134 */       this.popupMenu.setLayout(new FlatPopupMenuLayout(this.popupMenu, 1));
/*     */     }
/*     */   }
/*     */   
/*     */   protected void uninstallDefaults() {
/* 139 */     super.uninstallDefaults();
/*     */     
/* 141 */     this.scrollArrowColor = null;
/* 142 */     this.hoverScrollArrowBackground = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installListeners() {
/* 147 */     super.installListeners();
/*     */     
/* 149 */     this.propertyChangeListener = FlatStylingSupport.createPropertyChangeListener(this.popupMenu, this::installStyle, null);
/* 150 */     this.popupMenu.addPropertyChangeListener(this.propertyChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallListeners() {
/* 155 */     super.uninstallListeners();
/*     */     
/* 157 */     this.popupMenu.removePropertyChangeListener(this.propertyChangeListener);
/* 158 */     this.propertyChangeListener = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installStyle() {
/*     */     try {
/* 164 */       applyStyle(FlatStylingSupport.getResolvedStyle(this.popupMenu, "PopupMenu"));
/* 165 */     } catch (RuntimeException ex) {
/* 166 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void applyStyle(Object style) {
/* 172 */     this.oldStyleValues = FlatStylingSupport.parseAndApply(this.oldStyleValues, style, this::applyStyleProperty);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Object applyStyleProperty(String key, Object value) {
/* 177 */     if (this.borderShared == null)
/* 178 */       this.borderShared = new AtomicBoolean(true); 
/* 179 */     return FlatStylingSupport.applyToAnnotatedObjectOrBorder(this, key, value, this.popupMenu, this.borderShared);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Class<?>> getStyleableInfos(JComponent c) {
/* 185 */     return FlatStylingSupport.getAnnotatedStyleableInfos(this, this.popupMenu.getBorder());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getStyleableValue(JComponent c, String key) {
/* 191 */     return FlatStylingSupport.getAnnotatedStyleableValue(this, this.popupMenu.getBorder(), key);
/*     */   }
/*     */ 
/*     */   
/*     */   public Popup getPopup(JPopupMenu popup, int x, int y) {
/* 196 */     Dimension popupSize = popup.getPreferredSize();
/* 197 */     Rectangle screenBounds = getScreenBoundsAt(x, y);
/*     */ 
/*     */     
/* 200 */     if (x + popupSize.width > screenBounds.x + screenBounds.width)
/* 201 */       x = screenBounds.x + screenBounds.width - popupSize.width; 
/* 202 */     if (y + popupSize.height > screenBounds.y + screenBounds.height)
/* 203 */       y = screenBounds.y + screenBounds.height - popupSize.height; 
/* 204 */     if (x < screenBounds.x)
/* 205 */       x = screenBounds.x; 
/* 206 */     if (y < screenBounds.y) {
/* 207 */       y = screenBounds.y;
/*     */     }
/*     */     
/* 210 */     if (popup instanceof javax.swing.plaf.basic.BasicComboPopup || (popup
/* 211 */       .getComponentCount() > 0 && popup.getComponent(0) instanceof JScrollPane)) {
/* 212 */       return super.getPopup(popup, x, y);
/*     */     }
/*     */     
/* 215 */     if (popupSize.height <= screenBounds.height) {
/* 216 */       return super.getPopup(popup, x, y);
/*     */     }
/*     */     
/* 219 */     FlatPopupScroller scroller = new FlatPopupScroller(popup);
/* 220 */     scroller.setPreferredSize(new Dimension(popupSize.width, screenBounds.height));
/*     */ 
/*     */     
/* 223 */     PopupFactory popupFactory = PopupFactory.getSharedInstance();
/* 224 */     return popupFactory.getPopup(popup.getInvoker(), scroller, x, y);
/*     */   }
/*     */ 
/*     */   
/*     */   private Rectangle getScreenBoundsAt(int x, int y) {
/* 229 */     GraphicsConfiguration gc = null;
/* 230 */     for (GraphicsDevice device : GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()) {
/* 231 */       if (device.getType() == 0) {
/* 232 */         GraphicsConfiguration dgc = device.getDefaultConfiguration();
/* 233 */         if (dgc.getBounds().contains(x, y)) {
/* 234 */           gc = dgc;
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/* 239 */     if (gc == null && this.popupMenu.getInvoker() != null) {
/* 240 */       gc = this.popupMenu.getInvoker().getGraphicsConfiguration();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 245 */     Toolkit toolkit = Toolkit.getDefaultToolkit();
/* 246 */     Rectangle screenBounds = (gc != null) ? gc.getBounds() : new Rectangle(toolkit.getScreenSize());
/* 247 */     Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(gc);
/* 248 */     return FlatUIUtils.subtractInsets(screenBounds, screenInsets);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static class FlatPopupMenuLayout
/*     */     extends DefaultMenuLayout
/*     */   {
/*     */     public FlatPopupMenuLayout(Container target, int axis) {
/* 260 */       super(target, axis);
/*     */     }
/*     */ 
/*     */     
/*     */     public Dimension preferredLayoutSize(Container target) {
/* 265 */       FlatMenuItemRenderer.clearClientProperties(target);
/*     */       
/* 267 */       return super.preferredLayoutSize(target);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private class FlatPopupScroller
/*     */     extends JPanel
/*     */     implements MouseWheelListener, PopupMenuListener, MenuKeyListener
/*     */   {
/*     */     private final JPopupMenu popup;
/*     */     
/*     */     private final JScrollPane scrollPane;
/*     */     
/*     */     private final JButton scrollUpButton;
/*     */     private final JButton scrollDownButton;
/*     */     private int unitIncrement;
/*     */     
/*     */     FlatPopupScroller(JPopupMenu popup) {
/* 285 */       super(new BorderLayout());
/* 286 */       this.popup = popup;
/*     */ 
/*     */ 
/*     */       
/* 290 */       JPanel view = new JPanel(new BorderLayout());
/* 291 */       view.add(popup, "Center");
/*     */       
/* 293 */       this.scrollPane = new JScrollPane(view, 21, 31);
/* 294 */       this.scrollPane.setBorder((Border)null);
/*     */       
/* 296 */       this.scrollUpButton = new ArrowButton(1);
/* 297 */       this.scrollDownButton = new ArrowButton(5);
/*     */       
/* 299 */       add(this.scrollPane, "Center");
/* 300 */       add(this.scrollUpButton, "North");
/* 301 */       add(this.scrollDownButton, "South");
/*     */       
/* 303 */       setBackground(popup.getBackground());
/* 304 */       setBorder(popup.getBorder());
/* 305 */       popup.setBorder((Border)null);
/*     */       
/* 307 */       popup.addPopupMenuListener(this);
/* 308 */       popup.addMouseWheelListener(this);
/* 309 */       popup.addMenuKeyListener(this);
/*     */       
/* 311 */       updateArrowButtons();
/*     */       
/* 313 */       putClientProperty("Popup.borderCornerRadius", 
/* 314 */           Integer.valueOf(UIManager.getInt("PopupMenu.borderCornerRadius")));
/*     */     }
/*     */     
/*     */     void scroll(int unitsToScroll) {
/* 318 */       if (this.unitIncrement == 0) {
/* 319 */         this.unitIncrement = ((new JMenuItem("X")).getPreferredSize()).height;
/*     */       }
/* 321 */       JViewport viewport = this.scrollPane.getViewport();
/* 322 */       Point viewPosition = viewport.getViewPosition();
/* 323 */       int newY = viewPosition.y + this.unitIncrement * unitsToScroll;
/* 324 */       if (newY < 0) {
/* 325 */         newY = 0;
/*     */       } else {
/* 327 */         newY = Math.min(newY, (viewport.getViewSize()).height - (viewport.getExtentSize()).height);
/* 328 */       }  viewport.setViewPosition(new Point(viewPosition.x, newY));
/*     */       
/* 330 */       updateArrowButtons();
/*     */     }
/*     */     
/*     */     void updateArrowButtons() {
/* 334 */       JViewport viewport = this.scrollPane.getViewport();
/* 335 */       Point viewPosition = viewport.getViewPosition();
/*     */       
/* 337 */       this.scrollUpButton.setVisible((viewPosition.y > 0));
/* 338 */       this.scrollDownButton.setVisible((viewPosition.y < (viewport.getViewSize()).height - (viewport.getExtentSize()).height));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
/* 346 */       this.popup.setBorder(getBorder());
/*     */       
/* 348 */       this.popup.removePopupMenuListener(this);
/* 349 */       this.popup.removeMouseWheelListener(this);
/* 350 */       this.popup.removeMenuKeyListener(this);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void popupMenuWillBecomeVisible(PopupMenuEvent e) {}
/*     */ 
/*     */ 
/*     */     
/*     */     public void popupMenuCanceled(PopupMenuEvent e) {}
/*     */ 
/*     */ 
/*     */     
/*     */     public void mouseWheelMoved(MouseWheelEvent e) {
/* 364 */       Point mouseLocation = SwingUtilities.convertPoint((Component)e.getSource(), e.getPoint(), this);
/*     */ 
/*     */       
/* 367 */       scroll(e.getUnitsToScroll());
/*     */ 
/*     */       
/* 370 */       Component c = SwingUtilities.getDeepestComponentAt(this, mouseLocation.x, mouseLocation.y);
/* 371 */       if (c instanceof JMenuItem) {
/* 372 */         ButtonUI ui = ((JMenuItem)c).getUI();
/* 373 */         if (ui instanceof BasicMenuItemUI) {
/* 374 */           MenuSelectionManager.defaultManager().setSelectedPath(((BasicMenuItemUI)ui).getPath());
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 379 */       e.consume();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void menuKeyPressed(MenuKeyEvent e) {
/* 391 */       EventQueue.invokeLater(() -> {
/*     */             if (!isDisplayable()) {
/*     */               return;
/*     */             }
/*     */             MenuElement[] path = MenuSelectionManager.defaultManager().getSelectedPath();
/*     */             if (path.length == 0) {
/*     */               return;
/*     */             }
/*     */             Component c = path[path.length - 1].getComponent();
/*     */             JViewport viewport = this.scrollPane.getViewport();
/*     */             Point pt = SwingUtilities.convertPoint(c, 0, 0, viewport);
/*     */             viewport.scrollRectToVisible(new Rectangle(pt, c.getSize()));
/*     */             boolean upVisible = this.scrollUpButton.isVisible();
/*     */             updateArrowButtons();
/*     */             if (!upVisible && this.scrollUpButton.isVisible()) {
/*     */               Point viewPosition = viewport.getViewPosition();
/*     */               int newY = viewPosition.y + (this.scrollUpButton.getPreferredSize()).height;
/*     */               viewport.setViewPosition(new Point(viewPosition.x, newY));
/*     */             } 
/*     */           });
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void menuKeyTyped(MenuKeyEvent e) {}
/*     */ 
/*     */     
/*     */     public void menuKeyReleased(MenuKeyEvent e) {}
/*     */ 
/*     */     
/*     */     private class ArrowButton
/*     */       extends FlatArrowButton
/*     */       implements MouseListener, ActionListener
/*     */     {
/*     */       private Timer timer;
/*     */ 
/*     */       
/*     */       ArrowButton(int direction) {
/* 429 */         super(direction, FlatPopupMenuUI.this.arrowType, FlatPopupMenuUI.this.scrollArrowColor, (Color)null, (Color)null, FlatPopupMenuUI.this.hoverScrollArrowBackground, (Color)null, (Color)null);
/*     */         
/* 431 */         addMouseListener(this);
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public void paint(Graphics g) {
/* 437 */         g.setColor(FlatPopupMenuUI.FlatPopupScroller.this.popup.getBackground());
/* 438 */         g.fillRect(0, 0, getWidth(), getHeight());
/*     */         
/* 440 */         super.paint(g);
/*     */       }
/*     */ 
/*     */       
/*     */       public void mouseClicked(MouseEvent e) {}
/*     */       
/*     */       public void mousePressed(MouseEvent e) {}
/*     */       
/*     */       public void mouseReleased(MouseEvent e) {}
/*     */       
/*     */       public void mouseEntered(MouseEvent e) {
/* 451 */         if (this.timer == null)
/* 452 */           this.timer = new Timer(50, this); 
/* 453 */         this.timer.start();
/*     */       }
/*     */ 
/*     */       
/*     */       public void mouseExited(MouseEvent e) {
/* 458 */         if (this.timer != null) {
/* 459 */           this.timer.stop();
/*     */         }
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public void actionPerformed(ActionEvent e) {
/* 466 */         if (this.timer != null && !isDisplayable()) {
/* 467 */           this.timer.stop();
/*     */           
/*     */           return;
/*     */         } 
/* 471 */         FlatPopupMenuUI.FlatPopupScroller.this.scroll((this.direction == 1) ? -1 : 1);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatPopupMenuUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */