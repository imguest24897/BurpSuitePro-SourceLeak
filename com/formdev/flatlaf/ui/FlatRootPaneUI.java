/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.FlatClientProperties;
/*     */ import com.formdev.flatlaf.FlatLaf;
/*     */ import com.formdev.flatlaf.util.HiDPIUtils;
/*     */ import com.formdev.flatlaf.util.SystemInfo;
/*     */ import com.formdev.flatlaf.util.UIScale;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.Frame;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.IllegalComponentStateException;
/*     */ import java.awt.Insets;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.LayoutManager2;
/*     */ import java.awt.Window;
/*     */ import java.awt.event.ComponentAdapter;
/*     */ import java.awt.event.ComponentEvent;
/*     */ import java.awt.event.ComponentListener;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.util.function.Function;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLayeredPane;
/*     */ import javax.swing.JMenuBar;
/*     */ import javax.swing.JRootPane;
/*     */ import javax.swing.LookAndFeel;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.border.Border;
/*     */ import javax.swing.plaf.BorderUIResource;
/*     */ import javax.swing.plaf.ComponentUI;
/*     */ import javax.swing.plaf.RootPaneUI;
/*     */ import javax.swing.plaf.basic.BasicRootPaneUI;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlatRootPaneUI
/*     */   extends BasicRootPaneUI
/*     */ {
/*  83 */   protected final Color borderColor = UIManager.getColor("TitlePane.borderColor");
/*     */   
/*     */   protected JRootPane rootPane;
/*     */   
/*     */   protected FlatTitlePane titlePane;
/*     */   protected FlatWindowResizer windowResizer;
/*     */   private Object nativeWindowBorderData;
/*     */   private LayoutManager oldLayout;
/*     */   private PropertyChangeListener ancestorListener;
/*     */   private ComponentListener componentListener;
/*     */   
/*     */   public static ComponentUI createUI(JComponent c) {
/*  95 */     return new FlatRootPaneUI();
/*     */   }
/*     */ 
/*     */   
/*     */   public void installUI(JComponent c) {
/* 100 */     super.installUI(c);
/*     */     
/* 102 */     this.rootPane = (JRootPane)c;
/*     */     
/* 104 */     if (this.rootPane.getWindowDecorationStyle() != 0) {
/* 105 */       installClientDecorations();
/*     */     } else {
/* 107 */       installBorder();
/*     */     } 
/* 109 */     installNativeWindowBorder();
/*     */   }
/*     */   
/*     */   protected void installBorder() {
/* 113 */     if (this.borderColor != null) {
/* 114 */       Border b = this.rootPane.getBorder();
/* 115 */       if (b == null || b instanceof javax.swing.plaf.UIResource) {
/* 116 */         this.rootPane.setBorder(new FlatWindowTitleBorder(this.borderColor));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void uninstallUI(JComponent c) {
/* 122 */     super.uninstallUI(c);
/*     */     
/* 124 */     uninstallNativeWindowBorder();
/* 125 */     uninstallClientDecorations();
/* 126 */     this.rootPane = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installDefaults(JRootPane c) {
/* 131 */     super.installDefaults(c);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 139 */     if (!c.isBackgroundSet() || c.getBackground() instanceof javax.swing.plaf.UIResource)
/* 140 */       c.setBackground(UIManager.getColor("RootPane.background")); 
/* 141 */     if (!c.isForegroundSet() || c.getForeground() instanceof javax.swing.plaf.UIResource)
/* 142 */       c.setForeground(UIManager.getColor("RootPane.foreground")); 
/* 143 */     if (!c.isFontSet() || c.getFont() instanceof javax.swing.plaf.UIResource) {
/* 144 */       c.setFont(UIManager.getFont("RootPane.font"));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 153 */     Container parent = c.getParent();
/* 154 */     if (parent instanceof JFrame || parent instanceof JDialog) {
/* 155 */       Color background = parent.getBackground();
/* 156 */       if (background == null || background instanceof javax.swing.plaf.UIResource) {
/* 157 */         parent.setBackground(UIManager.getColor("control"));
/*     */       }
/*     */     } 
/*     */     
/* 161 */     if (SystemInfo.isJetBrainsJVM && SystemInfo.isMacOS_10_14_Mojave_orLater) {
/* 162 */       c.putClientProperty("jetbrains.awt.windowDarkAppearance", Boolean.valueOf(FlatLaf.isLafDark()));
/*     */     }
/*     */   }
/*     */   
/*     */   protected void uninstallDefaults(JRootPane c) {
/* 167 */     super.uninstallDefaults(c);
/*     */ 
/*     */     
/* 170 */     if (c.isBackgroundSet() && c.getBackground() instanceof javax.swing.plaf.UIResource)
/* 171 */       c.setBackground((Color)null); 
/* 172 */     if (c.isForegroundSet() && c.getForeground() instanceof javax.swing.plaf.UIResource)
/* 173 */       c.setForeground((Color)null); 
/* 174 */     if (c.isFontSet() && c.getFont() instanceof javax.swing.plaf.UIResource) {
/* 175 */       c.setFont((Font)null);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void installListeners(final JRootPane root) {
/* 180 */     super.installListeners(root);
/*     */     
/* 182 */     if (SystemInfo.isJava_9_orLater) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 194 */       this.ancestorListener = (e -> {
/*     */           Object oldValue = e.getOldValue();
/*     */           Object newValue = e.getNewValue();
/*     */           if (newValue instanceof Window) {
/*     */             if (this.componentListener == null) {
/*     */               this.componentListener = new ComponentAdapter()
/*     */                 {
/*     */                   public void componentShown(ComponentEvent e)
/*     */                   {
/* 203 */                     root.getParent().repaint(root.getX(), root.getY(), root.getWidth(), root.getHeight());
/*     */                   }
/*     */                 };
/*     */             }
/*     */             
/*     */             ((Window)newValue).addComponentListener(this.componentListener);
/*     */           } else if (newValue == null && oldValue instanceof Window && this.componentListener != null) {
/*     */             ((Window)oldValue).removeComponentListener(this.componentListener);
/*     */           } 
/*     */         });
/* 213 */       root.addPropertyChangeListener("ancestor", this.ancestorListener);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallListeners(JRootPane root) {
/* 219 */     super.uninstallListeners(root);
/*     */     
/* 221 */     if (SystemInfo.isJava_9_orLater) {
/* 222 */       if (this.componentListener != null) {
/* 223 */         Window window = SwingUtilities.windowForComponent(root);
/* 224 */         if (window != null)
/* 225 */           window.removeComponentListener(this.componentListener); 
/* 226 */         this.componentListener = null;
/*     */       } 
/* 228 */       root.removePropertyChangeListener("ancestor", this.ancestorListener);
/* 229 */       this.ancestorListener = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installNativeWindowBorder() {
/* 235 */     this.nativeWindowBorderData = FlatNativeWindowBorder.install(this.rootPane);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallNativeWindowBorder() {
/* 240 */     FlatNativeWindowBorder.uninstall(this.rootPane, this.nativeWindowBorderData);
/* 241 */     this.nativeWindowBorderData = null;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void updateNativeWindowBorder(JRootPane rootPane) {
/* 246 */     RootPaneUI rui = rootPane.getUI();
/* 247 */     if (!(rui instanceof FlatRootPaneUI)) {
/*     */       return;
/*     */     }
/* 250 */     FlatRootPaneUI ui = (FlatRootPaneUI)rui;
/* 251 */     ui.uninstallNativeWindowBorder();
/* 252 */     ui.installNativeWindowBorder();
/*     */   }
/*     */   
/*     */   protected void installClientDecorations() {
/* 256 */     boolean isNativeWindowBorderSupported = FlatNativeWindowBorder.isSupported();
/*     */ 
/*     */     
/* 259 */     if (this.rootPane.getWindowDecorationStyle() != 0 && !isNativeWindowBorderSupported) {
/* 260 */       LookAndFeel.installBorder(this.rootPane, "RootPane.border");
/*     */     } else {
/* 262 */       LookAndFeel.uninstallBorder(this.rootPane);
/*     */     } 
/*     */     
/* 265 */     setTitlePane(createTitlePane());
/*     */ 
/*     */     
/* 268 */     this.oldLayout = this.rootPane.getLayout();
/* 269 */     this.rootPane.setLayout(createRootLayout());
/*     */ 
/*     */     
/* 272 */     if (!isNativeWindowBorderSupported)
/* 273 */       this.windowResizer = createWindowResizer(); 
/*     */   }
/*     */   
/*     */   protected void uninstallClientDecorations() {
/* 277 */     LookAndFeel.uninstallBorder(this.rootPane);
/* 278 */     setTitlePane(null);
/*     */     
/* 280 */     if (this.windowResizer != null) {
/* 281 */       this.windowResizer.uninstall();
/* 282 */       this.windowResizer = null;
/*     */     } 
/*     */     
/* 285 */     if (this.oldLayout != null) {
/* 286 */       this.rootPane.setLayout(this.oldLayout);
/* 287 */       this.oldLayout = null;
/*     */     } 
/*     */     
/* 290 */     if (this.rootPane.getWindowDecorationStyle() == 0) {
/* 291 */       this.rootPane.revalidate();
/* 292 */       this.rootPane.repaint();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected FlatRootLayout createRootLayout() {
/* 297 */     return new FlatRootLayout();
/*     */   }
/*     */   
/*     */   protected FlatWindowResizer createWindowResizer() {
/* 301 */     return new FlatWindowResizer.WindowResizer(this.rootPane);
/*     */   }
/*     */   
/*     */   protected FlatTitlePane createTitlePane() {
/* 305 */     return new FlatTitlePane(this.rootPane);
/*     */   }
/*     */ 
/*     */   
/* 309 */   protected static final Integer TITLE_PANE_LAYER = Integer.valueOf(JLayeredPane.FRAME_CONTENT_LAYER.intValue() - 1);
/*     */   
/*     */   protected void setTitlePane(FlatTitlePane newTitlePane) {
/* 312 */     JLayeredPane layeredPane = this.rootPane.getLayeredPane();
/*     */     
/* 314 */     if (this.titlePane != null) {
/* 315 */       layeredPane.remove(this.titlePane);
/*     */     }
/* 317 */     if (newTitlePane != null) {
/* 318 */       layeredPane.add(newTitlePane, TITLE_PANE_LAYER);
/*     */     }
/* 320 */     this.titlePane = newTitlePane;
/*     */   }
/*     */ 
/*     */   
/*     */   public void propertyChange(PropertyChangeEvent e) {
/* 325 */     super.propertyChange(e);
/*     */     
/* 327 */     switch (e.getPropertyName()) {
/*     */       case "windowDecorationStyle":
/* 329 */         uninstallClientDecorations();
/* 330 */         if (this.rootPane.getWindowDecorationStyle() != 0) {
/* 331 */           installClientDecorations(); break;
/*     */         } 
/* 333 */         installBorder();
/*     */         break;
/*     */       
/*     */       case "JRootPane.useWindowDecorations":
/* 337 */         updateNativeWindowBorder(this.rootPane);
/*     */         break;
/*     */       
/*     */       case "JRootPane.menuBarEmbedded":
/* 341 */         if (this.titlePane != null) {
/* 342 */           this.titlePane.menuBarChanged();
/* 343 */           this.rootPane.revalidate();
/* 344 */           this.rootPane.repaint();
/*     */         } 
/*     */         break;
/*     */       
/*     */       case "JRootPane.titleBarShowIcon":
/* 349 */         if (this.titlePane != null) {
/* 350 */           this.titlePane.updateIcon();
/*     */         }
/*     */         break;
/*     */       case "JRootPane.titleBarShowTitle":
/*     */       case "JRootPane.titleBarShowIconify":
/*     */       case "JRootPane.titleBarShowMaximize":
/*     */       case "JRootPane.titleBarShowClose":
/* 357 */         if (this.titlePane != null) {
/* 358 */           this.titlePane.updateVisibility();
/*     */         }
/*     */         break;
/*     */       case "JRootPane.titleBarBackground":
/*     */       case "JRootPane.titleBarForeground":
/* 363 */         if (this.titlePane != null) {
/* 364 */           this.titlePane.titleBarColorsChanged();
/*     */         }
/*     */         break;
/*     */       case "JRootPane.glassPaneFullHeight":
/* 368 */         this.rootPane.revalidate();
/*     */         break;
/*     */       
/*     */       case "Window.style":
/* 372 */         if (this.rootPane.isDisplayable())
/* 373 */           throw new IllegalComponentStateException("The client property 'Window.style' must be set before the window becomes displayable."); 
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected static boolean isMenuBarEmbedded(JRootPane rootPane) {
/* 379 */     RootPaneUI ui = rootPane.getUI();
/* 380 */     return (ui instanceof FlatRootPaneUI && ((FlatRootPaneUI)ui).titlePane != null && ((FlatRootPaneUI)ui).titlePane
/*     */       
/* 382 */       .isMenuBarEmbedded());
/*     */   }
/*     */ 
/*     */   
/*     */   protected static FlatTitlePane getTitlePane(JRootPane rootPane) {
/* 387 */     RootPaneUI ui = rootPane.getUI();
/* 388 */     return (ui instanceof FlatRootPaneUI) ? ((FlatRootPaneUI)ui).titlePane : null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected class FlatRootLayout
/*     */     implements LayoutManager2
/*     */   {
/*     */     public void addLayoutComponent(String name, Component comp) {}
/*     */     
/*     */     public void addLayoutComponent(Component comp, Object constraints) {}
/*     */     
/*     */     public void removeLayoutComponent(Component comp) {}
/*     */     
/*     */     public Dimension preferredLayoutSize(Container parent) {
/* 402 */       return computeLayoutSize(parent, c -> c.getPreferredSize());
/*     */     }
/*     */ 
/*     */     
/*     */     public Dimension minimumLayoutSize(Container parent) {
/* 407 */       return computeLayoutSize(parent, c -> c.getMinimumSize());
/*     */     }
/*     */ 
/*     */     
/*     */     public Dimension maximumLayoutSize(Container parent) {
/* 412 */       return new Dimension(2147483647, 2147483647);
/*     */     }
/*     */     
/*     */     private Dimension computeLayoutSize(Container parent, Function<Component, Dimension> getSizeFunc) {
/* 416 */       JRootPane rootPane = (JRootPane)parent;
/*     */ 
/*     */ 
/*     */       
/* 420 */       Dimension titlePaneSize = (FlatRootPaneUI.this.titlePane != null) ? getSizeFunc.apply(FlatRootPaneUI.this.titlePane) : new Dimension();
/*     */ 
/*     */       
/* 423 */       Dimension contentSize = (rootPane.getContentPane() != null) ? getSizeFunc.apply(rootPane.getContentPane()) : rootPane.getSize();
/*     */       
/* 425 */       int width = contentSize.width;
/* 426 */       int height = titlePaneSize.height + contentSize.height;
/* 427 */       if (FlatRootPaneUI.this.titlePane == null || !FlatRootPaneUI.this.titlePane.isMenuBarEmbedded()) {
/* 428 */         JMenuBar menuBar = rootPane.getJMenuBar();
/*     */ 
/*     */         
/* 431 */         Dimension menuBarSize = (menuBar != null && menuBar.isVisible()) ? getSizeFunc.apply(menuBar) : new Dimension();
/*     */         
/* 433 */         width = Math.max(width, menuBarSize.width);
/* 434 */         height += menuBarSize.height;
/*     */       } 
/*     */       
/* 437 */       Insets insets = rootPane.getInsets();
/*     */       
/* 439 */       return new Dimension(width + insets.left + insets.right, height + insets.top + insets.bottom);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void layoutContainer(Container parent) {
/* 446 */       JRootPane rootPane = (JRootPane)parent;
/* 447 */       boolean isFullScreen = FlatUIUtils.isFullScreen(rootPane);
/*     */       
/* 449 */       Insets insets = rootPane.getInsets();
/* 450 */       int x = insets.left;
/* 451 */       int y = insets.top;
/* 452 */       int width = rootPane.getWidth() - insets.left - insets.right;
/* 453 */       int height = rootPane.getHeight() - insets.top - insets.bottom;
/*     */ 
/*     */       
/* 456 */       if (rootPane.getLayeredPane() != null) {
/* 457 */         rootPane.getLayeredPane().setBounds(x, y, width, height);
/*     */       }
/*     */       
/* 460 */       int nextY = 0;
/* 461 */       if (FlatRootPaneUI.this.titlePane != null) {
/* 462 */         int prefHeight = !isFullScreen ? (FlatRootPaneUI.this.titlePane.getPreferredSize()).height : 0;
/* 463 */         FlatRootPaneUI.this.titlePane.setBounds(0, 0, width, prefHeight);
/* 464 */         nextY += prefHeight;
/*     */       } 
/*     */ 
/*     */       
/* 468 */       if (rootPane.getGlassPane() != null) {
/* 469 */         boolean fullHeight = FlatClientProperties.clientPropertyBoolean(rootPane, "JRootPane.glassPaneFullHeight", false);
/*     */         
/* 471 */         int offset = fullHeight ? 0 : nextY;
/* 472 */         rootPane.getGlassPane().setBounds(x, y + offset, width, height - offset);
/*     */       } 
/*     */ 
/*     */       
/* 476 */       JMenuBar menuBar = rootPane.getJMenuBar();
/* 477 */       if (menuBar != null && menuBar.isVisible()) {
/* 478 */         boolean embedded = (!isFullScreen && FlatRootPaneUI.this.titlePane != null && FlatRootPaneUI.this.titlePane.isMenuBarEmbedded());
/* 479 */         if (embedded) {
/* 480 */           FlatRootPaneUI.this.titlePane.validate();
/* 481 */           menuBar.setBounds(FlatRootPaneUI.this.titlePane.getMenuBarBounds());
/*     */         } else {
/* 483 */           Dimension prefSize = menuBar.getPreferredSize();
/* 484 */           menuBar.setBounds(0, nextY, width, prefSize.height);
/* 485 */           nextY += prefSize.height;
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 490 */       Container contentPane = rootPane.getContentPane();
/* 491 */       if (contentPane != null) {
/* 492 */         contentPane.setBounds(0, nextY, width, Math.max(height - nextY, 0));
/*     */       }
/*     */       
/* 495 */       if (FlatRootPaneUI.this.titlePane != null) {
/* 496 */         FlatRootPaneUI.this.titlePane.menuBarLayouted();
/*     */       }
/*     */     }
/*     */     
/*     */     public void invalidateLayout(Container parent) {
/* 501 */       if (FlatRootPaneUI.this.titlePane != null) {
/* 502 */         FlatRootPaneUI.this.titlePane.menuBarChanged();
/*     */       }
/*     */     }
/*     */     
/*     */     public float getLayoutAlignmentX(Container target) {
/* 507 */       return 0.0F;
/*     */     }
/*     */ 
/*     */     
/*     */     public float getLayoutAlignmentY(Container target) {
/* 512 */       return 0.0F;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class FlatWindowBorder
/*     */     extends BorderUIResource.EmptyBorderUIResource
/*     */   {
/* 524 */     protected final Color activeBorderColor = UIManager.getColor("RootPane.activeBorderColor");
/* 525 */     protected final Color inactiveBorderColor = UIManager.getColor("RootPane.inactiveBorderColor");
/* 526 */     protected final Color baseBorderColor = UIManager.getColor("Panel.background");
/*     */     
/*     */     public FlatWindowBorder() {
/* 529 */       super(1, 1, 1, 1);
/*     */     }
/*     */ 
/*     */     
/*     */     public Insets getBorderInsets(Component c, Insets insets) {
/* 534 */       if (isWindowMaximized(c) || FlatUIUtils.isFullScreen(c)) {
/*     */         
/* 536 */         insets.top = insets.left = insets.bottom = insets.right = 0;
/* 537 */         return insets;
/*     */       } 
/* 539 */       return super.getBorderInsets(c, insets);
/*     */     }
/*     */ 
/*     */     
/*     */     public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
/* 544 */       if (isWindowMaximized(c) || FlatUIUtils.isFullScreen(c)) {
/*     */         return;
/*     */       }
/* 547 */       Container parent = c.getParent();
/* 548 */       boolean active = (parent instanceof Window && ((Window)parent).isActive());
/*     */       
/* 550 */       g.setColor(FlatUIUtils.deriveColor(active ? this.activeBorderColor : this.inactiveBorderColor, this.baseBorderColor));
/* 551 */       HiDPIUtils.paintAtScale1x((Graphics2D)g, x, y, width, height, this::paintImpl);
/*     */     }
/*     */     
/*     */     private void paintImpl(Graphics2D g, int x, int y, int width, int height, double scaleFactor) {
/* 555 */       g.drawRect(x, y, width - 1, height - 1);
/*     */     }
/*     */     
/*     */     protected boolean isWindowMaximized(Component c) {
/* 559 */       Container parent = c.getParent();
/* 560 */       return (parent instanceof Frame && (((Frame)parent).getExtendedState() & 0x6) == 6);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static class FlatWindowTitleBorder
/*     */     extends BorderUIResource.EmptyBorderUIResource
/*     */   {
/*     */     private final Color borderColor;
/*     */ 
/*     */     
/*     */     FlatWindowTitleBorder(Color borderColor) {
/* 572 */       super(0, 0, 0, 0);
/* 573 */       this.borderColor = borderColor;
/*     */     }
/*     */ 
/*     */     
/*     */     public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
/* 578 */       if (showBorder(c)) {
/* 579 */         float lineHeight = UIScale.scale(1.0F);
/* 580 */         FlatUIUtils.paintFilledRectangle(g, this.borderColor, x, y, width, lineHeight);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public Insets getBorderInsets(Component c, Insets insets) {
/* 586 */       insets.set(showBorder(c) ? 1 : 0, 0, 0, 0);
/* 587 */       return insets;
/*     */     }
/*     */     
/*     */     private boolean showBorder(Component c) {
/* 591 */       Container parent = c.getParent();
/* 592 */       return ((parent instanceof JFrame && (((JFrame)parent)
/*     */         
/* 594 */         .getJMenuBar() == null || 
/* 595 */         !((JFrame)parent).getJMenuBar().isVisible())) || (parent instanceof JDialog && (((JDialog)parent)
/*     */         
/* 597 */         .getJMenuBar() == null || 
/* 598 */         !((JDialog)parent).getJMenuBar().isVisible())));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatRootPaneUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */