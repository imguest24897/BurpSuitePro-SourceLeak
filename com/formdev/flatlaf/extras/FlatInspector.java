/*     */ package com.formdev.flatlaf.extras;
/*     */ 
/*     */ import com.formdev.flatlaf.ui.FlatUIUtils;
/*     */ import com.formdev.flatlaf.ui.MigLayoutVisualPadding;
/*     */ import com.formdev.flatlaf.util.SystemInfo;
/*     */ import com.formdev.flatlaf.util.UIScale;
/*     */ import java.awt.AWTEvent;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Insets;
/*     */ import java.awt.KeyboardFocusManager;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.MouseInfo;
/*     */ import java.awt.Point;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.Window;
/*     */ import java.awt.event.AWTEventListener;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.MouseMotionAdapter;
/*     */ import java.awt.event.MouseMotionListener;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.awt.event.WindowListener;
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.beans.PropertyChangeSupport;
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.Method;
/*     */ import javax.swing.AbstractButton;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLayeredPane;
/*     */ import javax.swing.JMenuBar;
/*     */ import javax.swing.JRootPane;
/*     */ import javax.swing.JToolBar;
/*     */ import javax.swing.JToolTip;
/*     */ import javax.swing.KeyStroke;
/*     */ import javax.swing.Popup;
/*     */ import javax.swing.PopupFactory;
/*     */ import javax.swing.RootPaneContainer;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.border.Border;
/*     */ import javax.swing.border.EmptyBorder;
/*     */ import javax.swing.border.LineBorder;
/*     */ import javax.swing.plaf.UIResource;
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
/*     */ public class FlatInspector
/*     */ {
/*  95 */   private static final Integer HIGHLIGHT_LAYER = Integer.valueOf(JLayeredPane.POPUP_LAYER.intValue() - 1);
/*     */ 
/*     */   
/*     */   private static final int KEY_MODIFIERS_MASK = 960;
/*     */   
/*     */   private final JRootPane rootPane;
/*     */   
/*     */   private final MouseMotionListener mouseMotionListener;
/*     */   
/*     */   private final AWTEventListener keyListener;
/*     */   
/* 106 */   private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
/*     */   
/*     */   private final WindowListener windowListener;
/*     */   
/*     */   private Window window;
/*     */   
/*     */   private boolean enabled;
/*     */   
/*     */   private Object oldGlassPaneFullHeight;
/*     */   
/*     */   private Component lastComponent;
/*     */   
/*     */   private int lastX;
/*     */   
/*     */   private int lastY;
/*     */   
/*     */   private int inspectParentLevel;
/*     */   private boolean wasModifierKeyPressed;
/*     */   private boolean showClassHierarchy;
/*     */   private long lastWhen;
/*     */   private JComponent highlightFigure;
/*     */   private Popup popup;
/*     */   
/*     */   public static void install(String activationKeys) {
/* 130 */     KeyStroke keyStroke = KeyStroke.getKeyStroke(activationKeys);
/* 131 */     Toolkit.getDefaultToolkit().addAWTEventListener(e -> { if (e.getID() == 402 && ((KeyEvent)e).getKeyCode() == keyStroke.getKeyCode() && (((KeyEvent)e).getModifiersEx() & 0x3C0) == (keyStroke.getModifiers() & 0x3C0)) { Window activeWindow = KeyboardFocusManager.getCurrentKeyboardFocusManager().getActiveWindow(); RootPaneContainer rootPaneContainer = null; if (activeWindow instanceof RootPaneContainer) { rootPaneContainer = (RootPaneContainer)activeWindow; } else { for (Component child : activeWindow.getComponents()) { if (child instanceof RootPaneContainer) { rootPaneContainer = (RootPaneContainer)child; break; }  }  }  if (rootPaneContainer != null) { JRootPane rootPane = rootPaneContainer.getRootPane(); FlatInspector inspector = (FlatInspector)rootPane.getClientProperty(FlatInspector.class); if (inspector == null) { inspector = new FlatInspector(rootPane); rootPane.putClientProperty(FlatInspector.class, inspector); inspector.setEnabled(true); } else { inspector.setEnabled(false); rootPane.putClientProperty(FlatInspector.class, null); }  }  }  }8L);
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
/*     */   public FlatInspector(JRootPane rootPane) {
/* 168 */     this.rootPane = rootPane;
/*     */     
/* 170 */     this.mouseMotionListener = new MouseMotionAdapter()
/*     */       {
/*     */         public void mouseMoved(MouseEvent e) {
/* 173 */           FlatInspector.this.lastX = e.getX();
/* 174 */           FlatInspector.this.lastY = e.getY();
/* 175 */           FlatInspector.this.inspect(FlatInspector.this.lastX, FlatInspector.this.lastY);
/*     */         }
/*     */       };
/*     */     
/* 179 */     this.keyListener = (e -> {
/*     */         KeyEvent keyEvent = (KeyEvent)e;
/*     */         
/*     */         int keyCode = keyEvent.getKeyCode();
/*     */         
/*     */         int id = e.getID();
/*     */         
/*     */         if (id == 401) {
/*     */           if (keyCode == 17 || keyCode == 16 || keyCode == 18) {
/*     */             this.wasModifierKeyPressed = true;
/*     */           }
/*     */         } else if (id == 402 && this.wasModifierKeyPressed) {
/*     */           if (keyEvent.getWhen() - this.lastWhen <= 5L) {
/*     */             return;
/*     */           }
/*     */           
/*     */           this.lastWhen = keyEvent.getWhen();
/*     */           
/*     */           if (keyCode == 17) {
/*     */             this.inspectParentLevel++;
/*     */             
/*     */             int parentLevel = inspect(this.lastX, this.lastY);
/*     */             
/*     */             if (this.inspectParentLevel > parentLevel) {
/*     */               this.inspectParentLevel = parentLevel;
/*     */             }
/*     */           } else if (keyCode == 16 && this.inspectParentLevel > 0) {
/*     */             this.inspectParentLevel--;
/*     */             
/*     */             int parentLevel = inspect(this.lastX, this.lastY);
/*     */             
/*     */             if (this.inspectParentLevel > parentLevel) {
/*     */               this.inspectParentLevel = Math.max(parentLevel - 1, 0);
/*     */               inspect(this.lastX, this.lastY);
/*     */             } 
/*     */           } else if (keyCode == 18 && this.lastComponent != null) {
/*     */             this.showClassHierarchy = !this.showClassHierarchy;
/*     */             showToolTip(this.lastComponent, this.lastX, this.lastY, this.inspectParentLevel);
/*     */           } 
/*     */         } 
/*     */         if (keyCode == 27) {
/*     */           keyEvent.consume();
/*     */           if (id == 401) {
/*     */             setEnabled(false);
/*     */             FlatInspector inspector = (FlatInspector)rootPane.getClientProperty(FlatInspector.class);
/*     */             if (inspector == this) {
/*     */               rootPane.putClientProperty(FlatInspector.class, null);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       });
/* 230 */     this.windowListener = new WindowAdapter()
/*     */       {
/*     */         public void windowActivated(WindowEvent e) {
/* 233 */           FlatInspector.this.update();
/*     */         }
/*     */ 
/*     */         
/*     */         public void windowDeactivated(WindowEvent e) {
/* 238 */           FlatInspector.this.hidePopup();
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */   
/*     */   public void addPropertyChangeListener(PropertyChangeListener l) {
/* 245 */     this.propertyChangeSupport.addPropertyChangeListener(l);
/*     */   }
/*     */   
/*     */   public void removePropertyChangeListener(PropertyChangeListener l) {
/* 249 */     this.propertyChangeSupport.removePropertyChangeListener(l);
/*     */   }
/*     */   
/*     */   public boolean isEnabled() {
/* 253 */     return this.enabled;
/*     */   }
/*     */   
/*     */   public void setEnabled(boolean enabled) {
/* 257 */     if (this.enabled == enabled) {
/*     */       return;
/*     */     }
/* 260 */     this.enabled = enabled;
/*     */ 
/*     */     
/* 263 */     if (enabled) {
/* 264 */       this.oldGlassPaneFullHeight = this.rootPane.getClientProperty("JRootPane.glassPaneFullHeight");
/* 265 */       this.rootPane.putClientProperty("JRootPane.glassPaneFullHeight", Boolean.valueOf(true));
/* 266 */       this.rootPane.validate();
/*     */     } else {
/* 268 */       this.rootPane.putClientProperty("JRootPane.glassPaneFullHeight", this.oldGlassPaneFullHeight);
/*     */     } 
/*     */     
/* 271 */     ((JComponent)this.rootPane.getGlassPane()).setOpaque(false);
/*     */     
/* 273 */     this.rootPane.getGlassPane().setVisible(enabled);
/*     */ 
/*     */     
/* 276 */     Toolkit toolkit = Toolkit.getDefaultToolkit();
/* 277 */     if (enabled) {
/* 278 */       toolkit.addAWTEventListener(this.keyListener, 8L);
/*     */     } else {
/* 280 */       toolkit.removeAWTEventListener(this.keyListener);
/*     */     } 
/*     */     
/* 283 */     if (enabled) {
/* 284 */       this.rootPane.getGlassPane().addMouseMotionListener(this.mouseMotionListener);
/*     */     } else {
/* 286 */       this.rootPane.getGlassPane().removeMouseMotionListener(this.mouseMotionListener);
/*     */     } 
/*     */     
/* 289 */     if (enabled) {
/* 290 */       this.window = SwingUtilities.windowForComponent(this.rootPane);
/* 291 */       if (this.window != null) {
/* 292 */         this.window.addWindowListener(this.windowListener);
/*     */       }
/* 294 */     } else if (this.window != null) {
/* 295 */       this.window.removeWindowListener(this.windowListener);
/* 296 */       this.window = null;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 301 */     if (enabled) {
/* 302 */       Point pt = new Point(MouseInfo.getPointerInfo().getLocation());
/* 303 */       SwingUtilities.convertPointFromScreen(pt, this.rootPane);
/*     */       
/* 305 */       this.lastX = pt.x;
/* 306 */       this.lastY = pt.y;
/* 307 */       inspect(this.lastX, this.lastY);
/*     */     } else {
/* 309 */       this.lastComponent = null;
/* 310 */       this.inspectParentLevel = 0;
/*     */       
/* 312 */       if (this.highlightFigure != null)
/* 313 */         this.highlightFigure.getParent().remove(this.highlightFigure); 
/* 314 */       this.highlightFigure = null;
/*     */       
/* 316 */       hidePopup();
/*     */     } 
/*     */     
/* 319 */     this.propertyChangeSupport.firePropertyChange("enabled", !enabled, enabled);
/*     */   }
/*     */   
/*     */   private void hidePopup() {
/* 323 */     if (this.popup != null) {
/* 324 */       this.popup.hide();
/* 325 */       this.popup = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void update() {
/* 330 */     if (!this.rootPane.getGlassPane().isVisible()) {
/*     */       return;
/*     */     }
/* 333 */     EventQueue.invokeLater(() -> {
/*     */           setEnabled(false);
/*     */           setEnabled(true);
/*     */           inspect(this.lastX, this.lastY);
/*     */         });
/*     */   }
/*     */   
/*     */   private int inspect(int x, int y) {
/* 341 */     Point pt = SwingUtilities.convertPoint(this.rootPane.getGlassPane(), x, y, this.rootPane);
/* 342 */     Component c = getDeepestComponentAt(this.rootPane, pt.x, pt.y);
/* 343 */     int parentLevel = 0;
/* 344 */     for (int i = 0; i < this.inspectParentLevel && c != null; i++) {
/* 345 */       Container parent = c.getParent();
/* 346 */       if (parent == null) {
/*     */         break;
/*     */       }
/* 349 */       c = parent;
/* 350 */       parentLevel++;
/*     */     } 
/*     */     
/* 353 */     if (c == this.lastComponent) {
/* 354 */       return parentLevel;
/*     */     }
/* 356 */     this.lastComponent = c;
/*     */     
/* 358 */     highlight(c);
/* 359 */     showToolTip(c, x, y, parentLevel);
/*     */     
/* 361 */     return parentLevel;
/*     */   }
/*     */   
/*     */   private Component getDeepestComponentAt(Component parent, int x, int y) {
/* 365 */     if (!parent.contains(x, y)) {
/* 366 */       return null;
/*     */     }
/* 368 */     if (parent instanceof Container)
/* 369 */       for (Component child : ((Container)parent).getComponents()) {
/* 370 */         if (child != null && child.isVisible()) {
/*     */ 
/*     */           
/* 373 */           int cx = x - child.getX();
/* 374 */           int cy = y - child.getY();
/*     */ 
/*     */           
/* 377 */           Component c = (child instanceof Container) ? getDeepestComponentAt(child, cx, cy) : child.getComponentAt(cx, cy);
/* 378 */           if (c != null && c.isVisible())
/*     */           {
/*     */ 
/*     */             
/* 382 */             if (c != this.highlightFigure)
/*     */             {
/*     */ 
/*     */               
/* 386 */               if (!(c.getParent() instanceof JRootPane) || c != ((JRootPane)c.getParent()).getGlassPane())
/*     */               {
/*     */                 
/* 389 */                 if (!"com.formdev.flatlaf.ui.FlatWindowResizer".equals(c.getClass().getName()))
/*     */                 {
/*     */                   
/* 392 */                   return c; }  }  } 
/*     */           }
/*     */         } 
/*     */       }  
/* 396 */     return parent;
/*     */   }
/*     */   
/*     */   private void highlight(Component c) {
/* 400 */     if (this.highlightFigure == null) {
/* 401 */       this.highlightFigure = createHighlightFigure();
/* 402 */       this.rootPane.getLayeredPane().add(this.highlightFigure, HIGHLIGHT_LAYER);
/*     */     } 
/*     */     
/* 405 */     this.highlightFigure.setVisible((c != null));
/*     */     
/* 407 */     if (c != null) {
/* 408 */       Insets insets = this.rootPane.getInsets();
/* 409 */       this.highlightFigure.setBounds(new Rectangle(
/* 410 */             SwingUtilities.convertPoint(c, -insets.left, -insets.top, this.rootPane), c
/* 411 */             .getSize()));
/*     */     } 
/*     */   }
/*     */   
/*     */   private JComponent createHighlightFigure() {
/* 416 */     JComponent c = new JComponent()
/*     */       {
/*     */         protected void paintComponent(Graphics g) {
/* 419 */           g.setColor(getBackground());
/* 420 */           g.fillRect(0, 0, getWidth(), getHeight());
/*     */         }
/*     */ 
/*     */         
/*     */         protected void paintBorder(Graphics g) {
/* 425 */           Object[] oldRenderingHints = FlatUIUtils.setRenderingHints(g);
/* 426 */           super.paintBorder(g);
/* 427 */           FlatUIUtils.resetRenderingHints(g, oldRenderingHints);
/*     */         }
/*     */       };
/* 430 */     c.setBackground(new Color(255, 0, 0, 32));
/* 431 */     c.setBorder(new LineBorder(Color.red));
/* 432 */     return c;
/*     */   }
/*     */   
/*     */   private void showToolTip(Component c, int x, int y, int parentLevel) {
/* 436 */     hidePopup();
/*     */     
/* 438 */     if (c == null || (this.window != null && !this.window.isActive())) {
/*     */       return;
/*     */     }
/* 441 */     JToolTip tip = new JToolTip();
/* 442 */     tip.setTipText(buildToolTipText(c, parentLevel, this.showClassHierarchy));
/* 443 */     tip.putClientProperty("Popup.forceHeavyWeight", Boolean.valueOf(true));
/*     */     
/* 445 */     Point pt = new Point(x, y);
/* 446 */     SwingUtilities.convertPointToScreen(pt, this.rootPane.getGlassPane());
/* 447 */     int tx = pt.x + UIScale.scale(8);
/* 448 */     int ty = pt.y + UIScale.scale(16);
/*     */     
/* 450 */     Dimension size = tip.getPreferredSize();
/*     */ 
/*     */     
/* 453 */     Rectangle visibleRect = this.rootPane.getGraphicsConfiguration().getBounds();
/* 454 */     if (tx + size.width > visibleRect.x + visibleRect.width)
/* 455 */       tx -= size.width + UIScale.scale(16); 
/* 456 */     if (ty + size.height > visibleRect.y + visibleRect.height)
/* 457 */       ty -= size.height + UIScale.scale(32); 
/* 458 */     if (tx < visibleRect.x)
/* 459 */       tx = visibleRect.x; 
/* 460 */     if (ty < visibleRect.y) {
/* 461 */       ty = visibleRect.y;
/*     */     }
/* 463 */     PopupFactory popupFactory = PopupFactory.getSharedInstance();
/* 464 */     this.popup = popupFactory.getPopup(c, tip, tx, ty);
/* 465 */     this.popup.show();
/*     */   }
/*     */   
/*     */   private static String buildToolTipText(Component c, int parentLevel, boolean classHierarchy) {
/* 469 */     StringBuilder buf = new StringBuilder(1500);
/* 470 */     buf.append("<html><style>");
/* 471 */     buf.append("td { padding: 0 10 0 0; }");
/* 472 */     buf.append("</style><table>");
/*     */     
/* 474 */     appendRow(buf, "Class", toString(c.getClass(), classHierarchy));
/* 475 */     appendRow(buf, "Size", c.getWidth() + ", " + c.getHeight() + "&nbsp;&nbsp; @ " + c.getX() + ", " + c.getY());
/*     */     
/* 477 */     if (c instanceof Container) {
/* 478 */       appendRow(buf, "Insets", toString(((Container)c).getInsets()));
/*     */     }
/* 480 */     Insets margin = null;
/* 481 */     if (c instanceof AbstractButton) {
/* 482 */       margin = ((AbstractButton)c).getMargin();
/* 483 */     } else if (c instanceof JTextComponent) {
/* 484 */       margin = ((JTextComponent)c).getMargin();
/* 485 */     } else if (c instanceof JMenuBar) {
/* 486 */       margin = ((JMenuBar)c).getMargin();
/* 487 */     } else if (c instanceof JToolBar) {
/* 488 */       margin = ((JToolBar)c).getMargin();
/*     */     } 
/* 490 */     if (margin != null) {
/* 491 */       appendRow(buf, "Margin", toString(margin));
/*     */     }
/* 493 */     if (c instanceof JComponent) {
/* 494 */       Object value = ((JComponent)c).getClientProperty(MigLayoutVisualPadding.VISUAL_PADDING_PROPERTY);
/*     */ 
/*     */       
/* 497 */       Insets visualPadding = (value instanceof int[]) ? new Insets(((int[])value)[0], ((int[])value)[1], ((int[])value)[2], ((int[])value)[3]) : ((value instanceof Insets) ? (Insets)value : null);
/* 498 */       if (visualPadding != null) {
/* 499 */         appendRow(buf, "Mig visual padding", toString(visualPadding));
/*     */       }
/*     */     } 
/* 502 */     Dimension prefSize = c.getPreferredSize();
/* 503 */     Dimension minSize = c.getMinimumSize();
/* 504 */     Dimension maxSize = c.getMaximumSize();
/* 505 */     appendRow(buf, "Pref size", prefSize.width + ", " + prefSize.height);
/* 506 */     appendRow(buf, "Min size", minSize.width + ", " + minSize.height);
/* 507 */     appendRow(buf, "Max size", maxSize.width + ", " + maxSize.height);
/*     */     
/* 509 */     if (c instanceof JComponent) {
/* 510 */       appendRow(buf, "Border", toString(((JComponent)c).getBorder(), classHierarchy));
/*     */     }
/* 512 */     appendRow(buf, "Background", toString(c.getBackground()) + (c.isBackgroundSet() ? "" : "  NOT SET"));
/* 513 */     appendRow(buf, "Foreground", toString(c.getForeground()) + (c.isForegroundSet() ? "" : "  NOT SET"));
/* 514 */     appendRow(buf, "Font", toString(c.getFont()) + (c.isFontSet() ? "" : "  NOT SET"));
/*     */     
/* 516 */     if (c instanceof JComponent) {
/*     */       try {
/*     */         Object ui;
/* 519 */         if (SystemInfo.isJava_9_orLater) {
/*     */           
/* 521 */           Method m = JComponent.class.getMethod("getUI", new Class[0]);
/* 522 */           ui = m.invoke(c, new Object[0]);
/*     */         } else {
/*     */           
/* 525 */           Field f = JComponent.class.getDeclaredField("ui");
/* 526 */           f.setAccessible(true);
/* 527 */           ui = f.get(c);
/*     */         } 
/* 529 */         appendRow(buf, "UI", (ui != null) ? toString(ui.getClass(), classHierarchy) : "null");
/* 530 */       } catch (Exception exception) {}
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 535 */     if (c instanceof Container) {
/* 536 */       LayoutManager layout = ((Container)c).getLayout();
/* 537 */       if (layout != null) {
/* 538 */         appendRow(buf, "Layout", toString(layout.getClass(), classHierarchy));
/*     */       }
/*     */     } 
/* 541 */     appendRow(buf, "Enabled", String.valueOf(c.isEnabled()));
/* 542 */     appendRow(buf, "Opaque", String.valueOf(c.isOpaque()) + ((
/* 543 */         c instanceof JComponent && FlatUIUtils.hasOpaqueBeenExplicitlySet((JComponent)c)) ? " EXPLICIT" : ""));
/* 544 */     if (c instanceof AbstractButton)
/* 545 */       appendRow(buf, "ContentAreaFilled", String.valueOf(((AbstractButton)c).isContentAreaFilled())); 
/* 546 */     appendRow(buf, "Focusable", String.valueOf(c.isFocusable()));
/* 547 */     appendRow(buf, "Left-to-right", String.valueOf(c.getComponentOrientation().isLeftToRight()));
/* 548 */     appendRow(buf, "Parent", (c.getParent() != null) ? toString(c.getParent().getClass(), classHierarchy) : "null");
/*     */ 
/*     */     
/* 551 */     buf.append("<tr><td colspan=\"2\">");
/* 552 */     if (parentLevel > 0) {
/* 553 */       buf.append("<br>Parent level: " + parentLevel);
/*     */     }
/*     */     
/* 556 */     buf.append("<br>(")
/* 557 */       .append((parentLevel > 0) ? 
/* 558 */         "press <b>Ctrl/Shift</b> to increase/decrease level" : 
/* 559 */         "press <b>Ctrl</b> key to inspect parent")
/* 560 */       .append("; &nbsp;")
/* 561 */       .append(classHierarchy ? 
/* 562 */         "press <b>Alt</b> key to hide class hierarchy" : 
/* 563 */         "press <b>Alt</b> key to show class hierarchy")
/* 564 */       .append(')');
/*     */     
/* 566 */     buf.append("</td></tr>");
/* 567 */     buf.append("</table></html>");
/*     */     
/* 569 */     return buf.toString();
/*     */   }
/*     */   
/*     */   private static void appendRow(StringBuilder buf, String key, String value) {
/* 573 */     buf.append("<tr><td valign=\"top\">")
/* 574 */       .append(key)
/* 575 */       .append(":</td><td>")
/* 576 */       .append(value)
/* 577 */       .append("</td></tr>");
/*     */   }
/*     */   
/*     */   private static String toString(Class<?> cls, boolean classHierarchy) {
/* 581 */     StringBuilder buf = new StringBuilder(100);
/* 582 */     int level = 0;
/*     */     
/* 584 */     while (cls != null) {
/* 585 */       if (level > 0) {
/* 586 */         if (cls == Object.class)
/*     */           break; 
/* 588 */         buf.append("<br>&nbsp;");
/* 589 */         for (int i = 1; i < level; i++)
/* 590 */           buf.append("&nbsp;&nbsp;&nbsp;&nbsp;"); 
/* 591 */         buf.append("╰ ");
/*     */       } 
/* 593 */       level++;
/*     */       
/* 595 */       String name = cls.getName();
/* 596 */       int dot = name.lastIndexOf('.');
/* 597 */       String pkg = (dot >= 0) ? name.substring(0, dot) : "-";
/* 598 */       String simpleName = (dot >= 0) ? name.substring(dot + 1) : name;
/* 599 */       buf.append(simpleName).append(' ').append(toDimmedText("(" + pkg + ")"));
/*     */       
/* 601 */       if (UIResource.class.isAssignableFrom(cls)) {
/* 602 */         buf.append(" UI");
/*     */       }
/* 604 */       if (!classHierarchy) {
/*     */         break;
/*     */       }
/* 607 */       cls = cls.getSuperclass();
/*     */     } 
/*     */     
/* 610 */     return buf.toString();
/*     */   }
/*     */   
/*     */   private static String toString(Insets insets) {
/* 614 */     if (insets == null) {
/* 615 */       return "null";
/*     */     }
/* 617 */     return insets.top + ", " + insets.left + ", " + insets.bottom + ", " + insets.right + (
/* 618 */       (insets instanceof UIResource) ? " UI" : "");
/*     */   }
/*     */   
/*     */   private static String toString(Color c) {
/* 622 */     if (c == null) {
/* 623 */       return "null";
/*     */     }
/* 625 */     StringBuilder buf = new StringBuilder(150);
/*     */     
/* 627 */     buf.append("<tt>");
/* 628 */     buf.append((c.getAlpha() != 255) ? 
/* 629 */         String.format("#%06x%02x", new Object[] { Integer.valueOf(c.getRGB() & 0xFFFFFF), Integer.valueOf(c.getRGB() >> 24 & 0xFF)
/* 630 */           }) : String.format("#%06x", new Object[] { Integer.valueOf(c.getRGB() & 0xFFFFFF) }));
/* 631 */     buf.append("</tt>");
/*     */     
/* 633 */     if (c instanceof UIResource) {
/* 634 */       buf.append(" UI");
/*     */     }
/*     */     
/* 637 */     buf.append("&nbsp; &nbsp;")
/* 638 */       .append("<span style=\"background: ")
/* 639 */       .append(String.format("#%06x", new Object[] { Integer.valueOf(c.getRGB() & 0xFFFFFF)
/* 640 */           })).append(";\">")
/* 641 */       .append("&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;")
/* 642 */       .append("</span>");
/*     */     
/* 644 */     if (c.getAlpha() != 255) {
/* 645 */       buf.append(" ").append(Math.round(c.getAlpha() / 2.55F)).append('%');
/*     */     }
/* 647 */     return buf.toString();
/*     */   }
/*     */   
/*     */   private static String toString(Font f) {
/* 651 */     if (f == null) {
/* 652 */       return "null";
/*     */     }
/* 654 */     return f.getFamily() + " " + f.getSize() + " " + f.getStyle() + (
/* 655 */       (f instanceof UIResource) ? " UI" : "");
/*     */   }
/*     */   
/*     */   private static String toString(Border b, boolean classHierarchy) {
/* 659 */     if (b == null) {
/* 660 */       return "null";
/*     */     }
/* 662 */     String s = toString(b.getClass(), classHierarchy);
/*     */     
/* 664 */     if (b instanceof EmptyBorder) {
/* 665 */       String borderInsets = " (" + toString(((EmptyBorder)b).getBorderInsets()) + ')';
/* 666 */       int brIndex = s.indexOf("<br>");
/* 667 */       if (brIndex >= 0) {
/* 668 */         s = s.substring(0, brIndex) + borderInsets + s.substring(brIndex);
/*     */       } else {
/* 670 */         s = s + borderInsets;
/*     */       } 
/*     */     } 
/* 673 */     return s;
/*     */   }
/*     */   
/*     */   private static String toDimmedText(String text) {
/* 677 */     Color color = UIManager.getColor("Label.disabledForeground");
/* 678 */     if (color == null)
/* 679 */       color = UIManager.getColor("Label.disabledText"); 
/* 680 */     if (color == null)
/* 681 */       color = Color.GRAY; 
/* 682 */     return String.format("<span color=\"#%06x\">%s</span>", new Object[] {
/* 683 */           Integer.valueOf(color.getRGB() & 0xFFFFFF), text
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\extras\FlatInspector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */