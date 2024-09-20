/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.util.SystemInfo;
/*     */ import com.formdev.flatlaf.util.UIScale;
/*     */ import java.awt.AWTEvent;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.GraphicsConfiguration;
/*     */ import java.awt.GraphicsDevice;
/*     */ import java.awt.GraphicsEnvironment;
/*     */ import java.awt.Insets;
/*     */ import java.awt.MouseInfo;
/*     */ import java.awt.Panel;
/*     */ import java.awt.Point;
/*     */ import java.awt.PointerInfo;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.Window;
/*     */ import java.awt.event.ComponentEvent;
/*     */ import java.awt.event.ComponentListener;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.WindowFocusListener;
/*     */ import java.lang.invoke.MethodHandle;
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import java.lang.invoke.MethodType;
/*     */ import java.lang.reflect.Method;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLayeredPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JWindow;
/*     */ import javax.swing.Popup;
/*     */ import javax.swing.PopupFactory;
/*     */ import javax.swing.RootPaneContainer;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.ToolTipManager;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.border.Border;
/*     */ import javax.swing.border.LineBorder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlatPopupFactory
/*     */   extends PopupFactory
/*     */ {
/*     */   private MethodHandle java8getPopupMethod;
/*     */   private MethodHandle java9getPopupMethod;
/*     */   
/*     */   public Popup getPopup(Component owner, Component contents, int x, int y) throws IllegalArgumentException {
/*  81 */     Point pt = fixToolTipLocation(owner, contents, x, y);
/*  82 */     if (pt != null) {
/*  83 */       x = pt.x;
/*  84 */       y = pt.y;
/*     */     } 
/*     */     
/*  87 */     fixLinuxWaylandJava21focusIssue(owner);
/*     */     
/*  89 */     boolean forceHeavyWeight = isOptionEnabled(owner, contents, "Popup.forceHeavyWeight", "Popup.forceHeavyWeight");
/*     */     
/*  91 */     if (!isOptionEnabled(owner, contents, "Popup.dropShadowPainted", "Popup.dropShadowPainted") || SystemInfo.isProjector || SystemInfo.isWebswing) {
/*  92 */       return new NonFlashingPopup(getPopupForScreenOfOwner(owner, contents, x, y, forceHeavyWeight), contents);
/*     */     }
/*     */     
/*  95 */     if (SystemInfo.isMacOS || SystemInfo.isLinux) {
/*  96 */       return new NonFlashingPopup(getPopupForScreenOfOwner(owner, contents, x, y, true), contents);
/*     */     }
/*     */     
/*     */     int borderCornerRadius;
/* 100 */     if (isWindows11BorderSupported() && (
/* 101 */       borderCornerRadius = getBorderCornerRadius(owner, contents)) > 0) {
/*     */       
/* 103 */       NonFlashingPopup popup = new NonFlashingPopup(getPopupForScreenOfOwner(owner, contents, x, y, true), contents);
/* 104 */       if (popup.popupWindow != null)
/* 105 */         setupWindows11Border(popup.popupWindow, contents, borderCornerRadius); 
/* 106 */       return popup;
/*     */     } 
/*     */ 
/*     */     
/* 110 */     if (!forceHeavyWeight && overlapsHeavyWeightComponent(owner, contents, x, y)) {
/* 111 */       forceHeavyWeight = true;
/*     */     }
/*     */     
/* 114 */     return new DropShadowPopup(getPopupForScreenOfOwner(owner, contents, x, y, forceHeavyWeight), owner, contents);
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
/*     */   private Popup getPopupForScreenOfOwner(Component owner, Component contents, int x, int y, boolean forceHeavyWeight) throws IllegalArgumentException {
/* 134 */     int count = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     while (true) {
/* 140 */       Popup popup = forceHeavyWeight ? getHeavyWeightPopup(owner, contents, x, y) : super.getPopup(owner, contents, x, y);
/*     */ 
/*     */       
/* 143 */       Window popupWindow = SwingUtilities.windowForComponent(contents);
/*     */ 
/*     */       
/* 146 */       if (popupWindow == null || owner == null || popupWindow
/*     */         
/* 148 */         .getGraphicsConfiguration() == owner.getGraphicsConfiguration()) {
/* 149 */         return popup;
/*     */       }
/*     */       
/* 152 */       if (++count > 10) {
/* 153 */         return popup;
/*     */       }
/*     */       
/* 156 */       if (popupWindow instanceof JWindow) {
/* 157 */         ((JWindow)popupWindow).getContentPane().removeAll();
/*     */       }
/*     */ 
/*     */       
/* 161 */       popupWindow.dispose();
/*     */     } 
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
/*     */   private static void showPopupAndFixLocation(Popup popup, Window popupWindow) {
/* 175 */     if (popupWindow != null) {
/*     */       
/* 177 */       int x = popupWindow.getX();
/* 178 */       int y = popupWindow.getY();
/*     */       
/* 180 */       popup.show();
/*     */ 
/*     */ 
/*     */       
/* 184 */       if (popupWindow.getX() != x || popupWindow.getY() != y)
/* 185 */         popupWindow.setLocation(x, y); 
/*     */     } else {
/* 187 */       popup.show();
/*     */     } 
/*     */   }
/*     */   private boolean isOptionEnabled(Component owner, Component contents, String clientKey, String uiKey) {
/* 191 */     Object value = getOption(owner, contents, clientKey, uiKey);
/* 192 */     return (value instanceof Boolean) ? ((Boolean)value).booleanValue() : false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int getBorderCornerRadius(Component owner, Component contents) {
/* 200 */     String uiKey = (contents instanceof javax.swing.plaf.basic.BasicComboPopup) ? "ComboBox.borderCornerRadius" : ((contents instanceof javax.swing.JPopupMenu) ? "PopupMenu.borderCornerRadius" : ((contents instanceof javax.swing.JToolTip) ? "ToolTip.borderCornerRadius" : "Popup.borderCornerRadius"));
/*     */     
/* 202 */     Object value = getOption(owner, contents, "Popup.borderCornerRadius", uiKey);
/* 203 */     return (value instanceof Integer) ? ((Integer)value).intValue() : 0;
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
/*     */   private Object getOption(Component owner, Component contents, String clientKey, String uiKey) {
/* 215 */     for (Component c : new Component[] { owner, contents }) {
/* 216 */       if (c instanceof JComponent) {
/* 217 */         Object value = ((JComponent)c).getClientProperty(clientKey);
/* 218 */         if (value != null) {
/* 219 */           return value;
/*     */         }
/*     */       } 
/*     */     } 
/* 223 */     return UIManager.get(uiKey);
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
/*     */   private Popup getHeavyWeightPopup(Component owner, Component contents, int x, int y) throws IllegalArgumentException {
/*     */     try {
/* 238 */       if (SystemInfo.isJava_9_orLater) {
/*     */         
/* 240 */         if (this.java9getPopupMethod == null) {
/* 241 */           MethodType mt = MethodType.methodType(Popup.class, Component.class, new Class[] { Component.class, int.class, int.class, boolean.class });
/* 242 */           this.java9getPopupMethod = MethodHandles.lookup().findVirtual(PopupFactory.class, "getPopup", mt);
/*     */         } 
/* 244 */         return this.java9getPopupMethod.invoke(this, owner, contents, x, y, true);
/*     */       } 
/*     */       
/* 247 */       if (this.java8getPopupMethod == null) {
/* 248 */         Method m = PopupFactory.class.getDeclaredMethod("getPopup", new Class[] { Component.class, Component.class, int.class, int.class, int.class });
/*     */         
/* 250 */         m.setAccessible(true);
/* 251 */         this.java8getPopupMethod = MethodHandles.lookup().unreflect(m);
/*     */       } 
/* 253 */       return this.java8getPopupMethod.invoke(this, owner, contents, x, y, 2);
/*     */     }
/* 255 */     catch (Throwable ex) {
/*     */       
/* 257 */       return super.getPopup(owner, contents, x, y);
/*     */     } 
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
/*     */   private Point fixToolTipLocation(Component owner, Component contents, int x, int y) {
/* 271 */     if (!(contents instanceof javax.swing.JToolTip) || !wasInvokedFromToolTipManager() || hasTipLocation(owner)) {
/* 272 */       return null;
/*     */     }
/* 274 */     PointerInfo pointerInfo = MouseInfo.getPointerInfo();
/* 275 */     if (pointerInfo == null) {
/* 276 */       return null;
/*     */     }
/* 278 */     Point mouseLocation = pointerInfo.getLocation();
/* 279 */     Dimension tipSize = contents.getPreferredSize();
/*     */ 
/*     */     
/* 282 */     Rectangle tipBounds = new Rectangle(x, y, tipSize.width, tipSize.height);
/* 283 */     if (!tipBounds.contains(mouseLocation)) {
/* 284 */       return null;
/*     */     }
/*     */     
/* 287 */     GraphicsConfiguration gc = null;
/* 288 */     for (GraphicsDevice device : GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()) {
/* 289 */       GraphicsConfiguration dgc = device.getDefaultConfiguration();
/* 290 */       if (dgc.getBounds().contains(mouseLocation)) {
/* 291 */         gc = dgc;
/*     */         break;
/*     */       } 
/*     */     } 
/* 295 */     if (gc == null)
/* 296 */       gc = owner.getGraphicsConfiguration(); 
/* 297 */     if (gc == null) {
/* 298 */       return null;
/*     */     }
/* 300 */     Rectangle screenBounds = gc.getBounds();
/* 301 */     Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(gc);
/* 302 */     int screenTop = screenBounds.y + screenInsets.top;
/*     */ 
/*     */     
/* 305 */     int newY = mouseLocation.y - tipSize.height - UIScale.scale(20);
/* 306 */     if (newY < screenTop) {
/* 307 */       return null;
/*     */     }
/* 309 */     return new Point(x, newY);
/*     */   }
/*     */   
/*     */   private boolean wasInvokedFromToolTipManager() {
/* 313 */     return StackUtils.wasInvokedFrom(ToolTipManager.class.getName(), "showTipWindow", 8);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean hasTipLocation(Component owner) {
/*     */     MouseEvent me;
/* 321 */     if (!(owner instanceof JComponent)) {
/* 322 */       return false;
/*     */     }
/* 324 */     AWTEvent e = EventQueue.getCurrentEvent();
/*     */     
/* 326 */     if (e instanceof MouseEvent) {
/* 327 */       me = (MouseEvent)e;
/*     */     }
/*     */     else {
/*     */       
/* 331 */       PointerInfo pointerInfo = MouseInfo.getPointerInfo();
/* 332 */       if (pointerInfo == null) {
/* 333 */         return false;
/*     */       }
/* 335 */       Point location = new Point(pointerInfo.getLocation());
/* 336 */       SwingUtilities.convertPointFromScreen(location, owner);
/* 337 */       me = new MouseEvent(owner, 503, System.currentTimeMillis(), 0, location.x, location.y, 0, false);
/*     */     } 
/*     */ 
/*     */     
/* 341 */     return (me.getSource() == owner && ((JComponent)owner)
/* 342 */       .getToolTipLocation(me) != null);
/*     */   }
/*     */   
/*     */   private static boolean isWindows11BorderSupported() {
/* 346 */     return (SystemInfo.isWindows_11_orLater && FlatNativeWindowsLibrary.isLoaded());
/*     */   }
/*     */ 
/*     */   
/*     */   private static void setupWindows11Border(Window popupWindow, Component contents, int borderCornerRadius) {
/* 351 */     if (!popupWindow.isDisplayable()) {
/* 352 */       popupWindow.addNotify();
/*     */     }
/*     */     
/* 355 */     long hwnd = FlatNativeWindowsLibrary.getHWND(popupWindow);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 360 */     int cornerPreference = (borderCornerRadius <= 4) ? 3 : 2;
/* 361 */     FlatNativeWindowsLibrary.setWindowCornerPreference(hwnd, cornerPreference);
/*     */ 
/*     */     
/* 364 */     int red = -1;
/* 365 */     int green = 0;
/* 366 */     int blue = 0;
/* 367 */     if (contents instanceof JComponent) {
/* 368 */       Border border = ((JComponent)contents).getBorder();
/* 369 */       border = FlatUIUtils.unwrapNonUIResourceBorder(border);
/*     */ 
/*     */       
/* 372 */       Color borderColor = null;
/* 373 */       if (border instanceof FlatLineBorder) {
/* 374 */         borderColor = ((FlatLineBorder)border).getLineColor();
/* 375 */       } else if (border instanceof LineBorder) {
/* 376 */         borderColor = ((LineBorder)border).getLineColor();
/* 377 */       } else if (border instanceof javax.swing.border.EmptyBorder) {
/* 378 */         red = -2;
/*     */       } 
/* 380 */       if (borderColor != null) {
/* 381 */         red = borderColor.getRed();
/* 382 */         green = borderColor.getGreen();
/* 383 */         blue = borderColor.getBlue();
/*     */       } 
/*     */     } 
/* 386 */     FlatNativeWindowsLibrary.setWindowBorderColor(hwnd, red, green, blue);
/*     */   }
/*     */ 
/*     */   
/*     */   private static void resetWindows11Border(Window popupWindow) {
/* 391 */     long hwnd = FlatNativeWindowsLibrary.getHWND(popupWindow);
/* 392 */     if (hwnd == 0L) {
/*     */       return;
/*     */     }
/*     */     
/* 396 */     FlatNativeWindowsLibrary.setWindowCornerPreference(hwnd, 1);
/*     */   }
/*     */   
/*     */   private static boolean overlapsHeavyWeightComponent(Component owner, Component contents, int x, int y) {
/* 400 */     if (owner == null) {
/* 401 */       return false;
/*     */     }
/* 403 */     Window window = SwingUtilities.getWindowAncestor(owner);
/* 404 */     if (window == null) {
/* 405 */       return false;
/*     */     }
/* 407 */     Rectangle r = new Rectangle(new Point(x, y), contents.getPreferredSize());
/* 408 */     return overlapsHeavyWeightComponent(window, r);
/*     */   }
/*     */   
/*     */   private static boolean overlapsHeavyWeightComponent(Component parent, Rectangle r) {
/* 412 */     if (!parent.isVisible() || !r.intersects(parent.getBounds())) {
/* 413 */       return false;
/*     */     }
/* 415 */     if (!parent.isLightweight() && !(parent instanceof Window)) {
/* 416 */       return true;
/*     */     }
/* 418 */     if (parent instanceof Container) {
/* 419 */       Rectangle r2 = new Rectangle(r.x - parent.getX(), r.y - parent.getY(), r.width, r.height);
/* 420 */       for (Component c : ((Container)parent).getComponents()) {
/* 421 */         if (overlapsHeavyWeightComponent(c, r2)) {
/* 422 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 426 */     return false;
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
/*     */   private static void fixLinuxWaylandJava21focusIssue(Component owner) {
/* 444 */     if (owner == null || !SystemInfo.isLinux || SystemInfo.javaVersion < SystemInfo.toVersion(21, 0, 0, 0)) {
/*     */       return;
/*     */     }
/*     */     
/* 448 */     Window window = SwingUtilities.getWindowAncestor(owner);
/* 449 */     if (window == null) {
/*     */       return;
/*     */     }
/*     */     
/* 453 */     for (WindowFocusListener l : window.getWindowFocusListeners()) {
/* 454 */       if ("sun.awt.UNIXToolkit$1".equals(l.getClass().getName())) {
/* 455 */         window.removeWindowFocusListener(l);
/*     */         break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static class NonFlashingPopup
/*     */     extends Popup
/*     */   {
/*     */     private Popup delegate;
/*     */     
/*     */     private Component contents;
/*     */     
/*     */     protected Window popupWindow;
/*     */     
/*     */     private Color oldPopupWindowBackground;
/*     */     
/*     */     NonFlashingPopup(Popup delegate, Component contents) {
/* 474 */       this.delegate = delegate;
/* 475 */       this.contents = contents;
/*     */       
/* 477 */       this.popupWindow = SwingUtilities.windowForComponent(contents);
/* 478 */       if (this.popupWindow != null) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 483 */         this.oldPopupWindowBackground = this.popupWindow.getBackground();
/* 484 */         this.popupWindow.setBackground(contents.getBackground());
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void show() {
/* 490 */       if (this.delegate != null) {
/* 491 */         FlatPopupFactory.showPopupAndFixLocation(this.delegate, this.popupWindow);
/*     */ 
/*     */ 
/*     */         
/* 495 */         if (this.contents instanceof javax.swing.JToolTip && this.popupWindow == null) {
/* 496 */           Container parent = this.contents.getParent();
/* 497 */           if (parent instanceof JPanel) {
/* 498 */             Dimension prefSize = parent.getPreferredSize();
/* 499 */             if (!prefSize.equals(parent.getSize())) {
/* 500 */               Container mediumWeightPanel = SwingUtilities.getAncestorOfClass(Panel.class, parent);
/*     */ 
/*     */               
/* 503 */               Container c = (mediumWeightPanel != null) ? mediumWeightPanel : parent;
/* 504 */               c.setSize(prefSize);
/* 505 */               c.validate();
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void hide() {
/* 514 */       if (this.delegate != null) {
/* 515 */         this.delegate.hide();
/* 516 */         this.delegate = null;
/* 517 */         this.contents = null;
/*     */       } 
/*     */       
/* 520 */       if (this.popupWindow != null) {
/*     */ 
/*     */         
/* 523 */         this.popupWindow.setBackground(this.oldPopupWindowBackground);
/* 524 */         this.popupWindow = null;
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private class DropShadowPopup
/*     */     extends NonFlashingPopup
/*     */   {
/*     */     private final Component owner;
/*     */     
/*     */     private JComponent lightComp;
/*     */     
/*     */     private Border oldBorder;
/*     */     
/*     */     private boolean oldOpaque;
/*     */     
/*     */     private boolean mediumWeightShown;
/*     */     
/*     */     private Panel mediumWeightPanel;
/*     */     
/*     */     private JPanel dropShadowPanel;
/*     */     
/*     */     private ComponentListener mediumPanelListener;
/*     */     private Popup dropShadowDelegate;
/*     */     private Window dropShadowWindow;
/*     */     private Color oldDropShadowWindowBackground;
/*     */     
/*     */     DropShadowPopup(Popup delegate, Component owner, Component contents) {
/* 553 */       super(delegate, contents);
/* 554 */       this.owner = owner;
/*     */       
/* 556 */       Dimension size = contents.getPreferredSize();
/* 557 */       if (size.width <= 0 || size.height <= 0) {
/*     */         return;
/*     */       }
/* 560 */       if (this.popupWindow != null) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 570 */         JPanel dropShadowPanel = new JPanel();
/* 571 */         dropShadowPanel.setBorder(createDropShadowBorder());
/* 572 */         dropShadowPanel.setOpaque(false);
/*     */ 
/*     */         
/* 575 */         Dimension prefSize = this.popupWindow.getPreferredSize();
/* 576 */         Insets insets = dropShadowPanel.getInsets();
/* 577 */         dropShadowPanel.setPreferredSize(new Dimension(prefSize.width + insets.left + insets.right, prefSize.height + insets.top + insets.bottom));
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 582 */         int x = this.popupWindow.getX() - insets.left;
/* 583 */         int y = this.popupWindow.getY() - insets.top;
/* 584 */         this.dropShadowDelegate = FlatPopupFactory.this.getPopupForScreenOfOwner(owner, dropShadowPanel, x, y, true);
/*     */ 
/*     */         
/* 587 */         this.dropShadowWindow = SwingUtilities.windowForComponent(dropShadowPanel);
/* 588 */         if (this.dropShadowWindow != null) {
/* 589 */           this.oldDropShadowWindowBackground = this.dropShadowWindow.getBackground();
/* 590 */           this.dropShadowWindow.setBackground(new Color(0, true));
/*     */         } 
/*     */ 
/*     */         
/* 594 */         if (FlatPopupFactory.isWindows11BorderSupported()) {
/* 595 */           FlatPopupFactory.resetWindows11Border(this.popupWindow);
/* 596 */           if (this.dropShadowWindow != null) {
/* 597 */             FlatPopupFactory.resetWindows11Border(this.dropShadowWindow);
/*     */           }
/*     */         } 
/*     */       } else {
/* 601 */         this.mediumWeightPanel = (Panel)SwingUtilities.getAncestorOfClass(Panel.class, contents);
/* 602 */         if (this.mediumWeightPanel != null) {
/*     */           
/* 604 */           this.dropShadowPanel = new JPanel();
/* 605 */           this.dropShadowPanel.setBorder(createDropShadowBorder());
/* 606 */           this.dropShadowPanel.setOpaque(false);
/* 607 */           this.dropShadowPanel.setSize(FlatUIUtils.addInsets(this.mediumWeightPanel.getSize(), this.dropShadowPanel.getInsets()));
/*     */         } else {
/*     */           
/* 610 */           Container p = contents.getParent();
/* 611 */           if (!(p instanceof JComponent)) {
/*     */             return;
/*     */           }
/* 614 */           this.lightComp = (JComponent)p;
/* 615 */           this.oldBorder = this.lightComp.getBorder();
/* 616 */           this.oldOpaque = this.lightComp.isOpaque();
/* 617 */           this.lightComp.setBorder(createDropShadowBorder());
/* 618 */           this.lightComp.setOpaque(false);
/* 619 */           this.lightComp.setSize(this.lightComp.getPreferredSize());
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     private Border createDropShadowBorder() {
/* 625 */       return new FlatDropShadowBorder(
/* 626 */           UIManager.getColor("Popup.dropShadowColor"), 
/* 627 */           UIManager.getInsets("Popup.dropShadowInsets"), 
/* 628 */           FlatUIUtils.getUIFloat("Popup.dropShadowOpacity", 0.5F));
/*     */     }
/*     */ 
/*     */     
/*     */     public void show() {
/* 633 */       if (this.dropShadowDelegate != null) {
/* 634 */         FlatPopupFactory.showPopupAndFixLocation(this.dropShadowDelegate, this.dropShadowWindow);
/*     */       }
/* 636 */       if (this.mediumWeightPanel != null) {
/* 637 */         showMediumWeightDropShadow();
/*     */       }
/* 639 */       super.show();
/*     */ 
/*     */       
/* 642 */       if (this.lightComp != null) {
/* 643 */         Insets insets = this.lightComp.getInsets();
/* 644 */         if (insets.left != 0 || insets.top != 0) {
/* 645 */           this.lightComp.setLocation(this.lightComp.getX() - insets.left, this.lightComp.getY() - insets.top);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/*     */     public void hide() {
/* 651 */       if (this.dropShadowDelegate != null) {
/* 652 */         this.dropShadowDelegate.hide();
/* 653 */         this.dropShadowDelegate = null;
/*     */       } 
/*     */       
/* 656 */       if (this.mediumWeightPanel != null) {
/* 657 */         hideMediumWeightDropShadow();
/* 658 */         this.dropShadowPanel = null;
/* 659 */         this.mediumWeightPanel = null;
/*     */       } 
/*     */       
/* 662 */       super.hide();
/*     */       
/* 664 */       if (this.dropShadowWindow != null) {
/* 665 */         this.dropShadowWindow.setBackground(this.oldDropShadowWindowBackground);
/* 666 */         this.dropShadowWindow = null;
/*     */       } 
/*     */       
/* 669 */       if (this.lightComp != null) {
/* 670 */         this.lightComp.setBorder(this.oldBorder);
/* 671 */         this.lightComp.setOpaque(this.oldOpaque);
/* 672 */         this.lightComp = null;
/*     */       } 
/*     */     }
/*     */     
/*     */     private void showMediumWeightDropShadow() {
/* 677 */       if (this.mediumWeightShown) {
/*     */         return;
/*     */       }
/* 680 */       this.mediumWeightShown = true;
/*     */       
/* 682 */       if (this.owner == null) {
/*     */         return;
/*     */       }
/* 685 */       Window window = SwingUtilities.windowForComponent(this.owner);
/* 686 */       if (!(window instanceof RootPaneContainer)) {
/*     */         return;
/*     */       }
/* 689 */       this.dropShadowPanel.setVisible(false);
/*     */       
/* 691 */       JLayeredPane layeredPane = ((RootPaneContainer)window).getLayeredPane();
/* 692 */       layeredPane.add(this.dropShadowPanel, JLayeredPane.POPUP_LAYER, 0);
/*     */       
/* 694 */       moveMediumWeightDropShadow();
/* 695 */       resizeMediumWeightDropShadow();
/*     */       
/* 697 */       this.mediumPanelListener = new ComponentListener()
/*     */         {
/*     */           public void componentShown(ComponentEvent e) {
/* 700 */             if (FlatPopupFactory.DropShadowPopup.this.dropShadowPanel != null) {
/* 701 */               FlatPopupFactory.DropShadowPopup.this.dropShadowPanel.setVisible(true);
/*     */             }
/*     */           }
/*     */           
/*     */           public void componentHidden(ComponentEvent e) {
/* 706 */             if (FlatPopupFactory.DropShadowPopup.this.dropShadowPanel != null) {
/* 707 */               FlatPopupFactory.DropShadowPopup.this.dropShadowPanel.setVisible(false);
/*     */             }
/*     */           }
/*     */           
/*     */           public void componentMoved(ComponentEvent e) {
/* 712 */             FlatPopupFactory.DropShadowPopup.this.moveMediumWeightDropShadow();
/*     */           }
/*     */ 
/*     */           
/*     */           public void componentResized(ComponentEvent e) {
/* 717 */             FlatPopupFactory.DropShadowPopup.this.resizeMediumWeightDropShadow();
/*     */           }
/*     */         };
/* 720 */       this.mediumWeightPanel.addComponentListener(this.mediumPanelListener);
/*     */     }
/*     */     
/*     */     private void hideMediumWeightDropShadow() {
/* 724 */       this.mediumWeightPanel.removeComponentListener(this.mediumPanelListener);
/*     */       
/* 726 */       Container parent = this.dropShadowPanel.getParent();
/* 727 */       if (parent != null) {
/* 728 */         Rectangle bounds = this.dropShadowPanel.getBounds();
/* 729 */         parent.remove(this.dropShadowPanel);
/* 730 */         parent.repaint(bounds.x, bounds.y, bounds.width, bounds.height);
/*     */       } 
/*     */     }
/*     */     
/*     */     private void moveMediumWeightDropShadow() {
/* 735 */       if (this.dropShadowPanel != null && this.mediumWeightPanel != null) {
/* 736 */         Point location = this.mediumWeightPanel.getLocation();
/* 737 */         Insets insets = this.dropShadowPanel.getInsets();
/* 738 */         this.dropShadowPanel.setLocation(location.x - insets.left, location.y - insets.top);
/*     */       } 
/*     */     }
/*     */     
/*     */     private void resizeMediumWeightDropShadow() {
/* 743 */       if (this.dropShadowPanel != null && this.mediumWeightPanel != null)
/* 744 */         this.dropShadowPanel.setSize(FlatUIUtils.addInsets(this.mediumWeightPanel.getSize(), this.dropShadowPanel.getInsets())); 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatPopupFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */