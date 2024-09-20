/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import com.formdev.flatlaf.util.SystemInfo;
/*     */ import java.awt.Color;
/*     */ import java.awt.Dialog;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Frame;
/*     */ import java.awt.GraphicsConfiguration;
/*     */ import java.awt.Point;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.Window;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.util.Collections;
/*     */ import java.util.IdentityHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.Timer;
/*     */ import javax.swing.event.ChangeEvent;
/*     */ import javax.swing.event.ChangeListener;
/*     */ import javax.swing.event.EventListenerList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class FlatWindowsNativeWindowBorder
/*     */   implements FlatNativeWindowBorder.Provider
/*     */ {
/*  75 */   private final Map<Window, WndProc> windowsMap = Collections.synchronizedMap(new IdentityHashMap<>());
/*  76 */   private final EventListenerList listenerList = new EventListenerList();
/*     */   
/*     */   private Timer fireStateChangedTimer;
/*     */   
/*     */   private boolean colorizationUpToDate;
/*     */   
/*     */   private boolean colorizationColorAffectsBorders;
/*     */   private Color colorizationColor;
/*     */   private int colorizationColorBalance;
/*     */   private static FlatWindowsNativeWindowBorder instance;
/*     */   
/*     */   static FlatNativeWindowBorder.Provider getInstance() {
/*  88 */     if (!SystemInfo.isWindows_10_orLater) {
/*  89 */       return null;
/*     */     }
/*     */     
/*  92 */     if (!FlatNativeLibrary.isLoaded()) {
/*  93 */       return null;
/*     */     }
/*     */     
/*  96 */     if (instance == null)
/*  97 */       instance = new FlatWindowsNativeWindowBorder(); 
/*  98 */     return instance;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasCustomDecoration(Window window) {
/* 106 */     return this.windowsMap.containsKey(window);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHasCustomDecoration(Window window, boolean hasCustomDecoration) {
/* 116 */     if (hasCustomDecoration) {
/* 117 */       install(window);
/*     */     } else {
/* 119 */       uninstall(window);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void install(Window window) {
/* 124 */     if (!SystemInfo.isWindows_10_orLater) {
/*     */       return;
/*     */     }
/*     */     
/* 128 */     if (!(window instanceof JFrame) && !(window instanceof javax.swing.JDialog)) {
/*     */       return;
/*     */     }
/*     */     
/* 132 */     if ((window instanceof Frame && ((Frame)window).isUndecorated()) || (window instanceof Dialog && ((Dialog)window)
/* 133 */       .isUndecorated())) {
/*     */       return;
/*     */     }
/*     */     
/* 137 */     if (this.windowsMap.containsKey(window)) {
/*     */       return;
/*     */     }
/*     */     
/*     */     try {
/* 142 */       WndProc wndProc = new WndProc(window);
/* 143 */       if (wndProc.hwnd == 0L) {
/*     */         return;
/*     */       }
/* 146 */       this.windowsMap.put(window, wndProc);
/* 147 */     } catch (UnsatisfiedLinkError ex) {
/*     */ 
/*     */ 
/*     */       
/* 151 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void uninstall(Window window) {
/* 156 */     WndProc wndProc = this.windowsMap.remove(window);
/* 157 */     if (wndProc != null) {
/* 158 */       wndProc.uninstall();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void updateTitleBarInfo(Window window, int titleBarHeight, List<Rectangle> hitTestSpots, Rectangle appIconBounds, Rectangle minimizeButtonBounds, Rectangle maximizeButtonBounds, Rectangle closeButtonBounds) {
/* 166 */     WndProc wndProc = this.windowsMap.get(window);
/* 167 */     if (wndProc == null) {
/*     */       return;
/*     */     }
/* 170 */     wndProc.titleBarHeight = titleBarHeight;
/* 171 */     wndProc.hitTestSpots = hitTestSpots.<Rectangle>toArray(new Rectangle[hitTestSpots.size()]);
/* 172 */     wndProc.appIconBounds = cloneRectange(appIconBounds);
/* 173 */     wndProc.minimizeButtonBounds = cloneRectange(minimizeButtonBounds);
/* 174 */     wndProc.maximizeButtonBounds = cloneRectange(maximizeButtonBounds);
/* 175 */     wndProc.closeButtonBounds = cloneRectange(closeButtonBounds);
/*     */   }
/*     */   
/*     */   private static Rectangle cloneRectange(Rectangle rect) {
/* 179 */     return (rect != null) ? new Rectangle(rect) : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean showWindow(Window window, int cmd) {
/* 184 */     WndProc wndProc = this.windowsMap.get(window);
/* 185 */     if (wndProc == null) {
/* 186 */       return false;
/*     */     }
/* 188 */     wndProc.showWindow(wndProc.hwnd, cmd);
/* 189 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isColorizationColorAffectsBorders() {
/* 194 */     updateColorization();
/* 195 */     return this.colorizationColorAffectsBorders;
/*     */   }
/*     */ 
/*     */   
/*     */   public Color getColorizationColor() {
/* 200 */     updateColorization();
/* 201 */     return this.colorizationColor;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getColorizationColorBalance() {
/* 206 */     updateColorization();
/* 207 */     return this.colorizationColorBalance;
/*     */   }
/*     */   
/*     */   private void updateColorization() {
/* 211 */     if (this.colorizationUpToDate)
/*     */       return; 
/* 213 */     this.colorizationUpToDate = true;
/*     */     
/* 215 */     String subKey = "SOFTWARE\\Microsoft\\Windows\\DWM";
/*     */     
/* 217 */     int value = registryGetIntValue(subKey, "ColorPrevalence", -1);
/* 218 */     this.colorizationColorAffectsBorders = (value > 0);
/*     */     
/* 220 */     value = registryGetIntValue(subKey, "ColorizationColor", -1);
/* 221 */     this.colorizationColor = (value != -1) ? new Color(value) : null;
/*     */     
/* 223 */     this.colorizationColorBalance = registryGetIntValue(subKey, "ColorizationColorBalance", -1);
/*     */   }
/*     */ 
/*     */   
/*     */   private static native int registryGetIntValue(String paramString1, String paramString2, int paramInt);
/*     */   
/*     */   public void addChangeListener(ChangeListener l) {
/* 230 */     this.listenerList.add(ChangeListener.class, l);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeChangeListener(ChangeListener l) {
/* 235 */     this.listenerList.remove(ChangeListener.class, l);
/*     */   }
/*     */   
/*     */   private void fireStateChanged() {
/* 239 */     Object[] listeners = this.listenerList.getListenerList();
/* 240 */     if (listeners.length == 0) {
/*     */       return;
/*     */     }
/* 243 */     ChangeEvent e = new ChangeEvent(this);
/* 244 */     for (int i = 0; i < listeners.length; i += 2) {
/* 245 */       if (listeners[i] == ChangeListener.class) {
/* 246 */         ((ChangeListener)listeners[i + 1]).stateChanged(e);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void fireStateChangedLaterOnce() {
/* 255 */     EventQueue.invokeLater(() -> {
/*     */           if (this.fireStateChangedTimer != null) {
/*     */             this.fireStateChangedTimer.restart();
/*     */             return;
/*     */           } 
/*     */           this.fireStateChangedTimer = new Timer(300, ());
/*     */           this.fireStateChangedTimer.setRepeats(false);
/*     */           this.fireStateChangedTimer.start();
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private class WndProc
/*     */     implements PropertyChangeListener
/*     */   {
/*     */     private static final int HTCLIENT = 1;
/*     */     
/*     */     private static final int HTCAPTION = 2;
/*     */     
/*     */     private static final int HTSYSMENU = 3;
/*     */     
/*     */     private static final int HTMINBUTTON = 8;
/*     */     
/*     */     private static final int HTMAXBUTTON = 9;
/*     */     
/*     */     private static final int HTTOP = 12;
/*     */     
/*     */     private static final int HTCLOSE = 20;
/*     */     
/*     */     private Window window;
/*     */     
/*     */     private final long hwnd;
/*     */     
/*     */     private int titleBarHeight;
/*     */     
/*     */     private Rectangle[] hitTestSpots;
/*     */     
/*     */     private Rectangle appIconBounds;
/*     */     
/*     */     private Rectangle minimizeButtonBounds;
/*     */     private Rectangle maximizeButtonBounds;
/*     */     private Rectangle closeButtonBounds;
/*     */     
/*     */     WndProc(Window window) {
/* 299 */       this.window = window;
/*     */       
/* 301 */       this.hwnd = installImpl(window);
/* 302 */       if (this.hwnd == 0L) {
/*     */         return;
/*     */       }
/*     */       
/* 306 */       updateFrame(this.hwnd, (window instanceof JFrame) ? ((JFrame)window).getExtendedState() : 0);
/*     */ 
/*     */       
/* 309 */       updateWindowBackground();
/* 310 */       window.addPropertyChangeListener("background", this);
/*     */     }
/*     */     
/*     */     void uninstall() {
/* 314 */       this.window.removePropertyChangeListener("background", this);
/*     */       
/* 316 */       uninstallImpl(this.hwnd);
/*     */ 
/*     */       
/* 319 */       this.window = null;
/*     */     }
/*     */ 
/*     */     
/*     */     public void propertyChange(PropertyChangeEvent e) {
/* 324 */       updateWindowBackground();
/*     */     }
/*     */     
/*     */     private void updateWindowBackground() {
/* 328 */       Color bg = this.window.getBackground();
/* 329 */       if (bg != null) {
/* 330 */         setWindowBackground(this.hwnd, bg.getRed(), bg.getGreen(), bg.getBlue());
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private int onNcHitTest(int x, int y, boolean isOnResizeBorder) {
/* 342 */       Point pt = scaleDown(x, y);
/* 343 */       int sx = pt.x;
/* 344 */       int sy = pt.y;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 349 */       if (contains(this.appIconBounds, sx, sy)) {
/* 350 */         return 3;
/*     */       }
/*     */ 
/*     */       
/* 354 */       if (contains(this.minimizeButtonBounds, sx, sy)) {
/* 355 */         return 8;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 361 */       if (contains(this.maximizeButtonBounds, sx, sy)) {
/* 362 */         return 9;
/*     */       }
/*     */ 
/*     */       
/* 366 */       if (contains(this.closeButtonBounds, sx, sy)) {
/* 367 */         return 20;
/*     */       }
/* 369 */       boolean isOnTitleBar = (sy < this.titleBarHeight);
/*     */       
/* 371 */       if (isOnTitleBar) {
/*     */ 
/*     */         
/* 374 */         Rectangle[] hitTestSpots2 = this.hitTestSpots;
/* 375 */         for (Rectangle spot : hitTestSpots2) {
/* 376 */           if (spot.contains(sx, sy))
/* 377 */             return 1; 
/*     */         } 
/* 379 */         return isOnResizeBorder ? 12 : 2;
/*     */       } 
/*     */       
/* 382 */       return isOnResizeBorder ? 12 : 1;
/*     */     }
/*     */     
/*     */     private boolean contains(Rectangle rect, int x, int y) {
/* 386 */       return (rect != null && rect.contains(x, y));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private Point scaleDown(int x, int y) {
/* 394 */       GraphicsConfiguration gc = this.window.getGraphicsConfiguration();
/* 395 */       if (gc == null) {
/* 396 */         return new Point(x, y);
/*     */       }
/* 398 */       AffineTransform t = gc.getDefaultTransform();
/* 399 */       return new Point(clipRound(x / t.getScaleX()), clipRound(y / t.getScaleY()));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private int clipRound(double value) {
/* 407 */       value -= 0.5D;
/* 408 */       if (value < -2.147483648E9D)
/* 409 */         return Integer.MIN_VALUE; 
/* 410 */       if (value > 2.147483647E9D)
/* 411 */         return Integer.MAX_VALUE; 
/* 412 */       return (int)Math.ceil(value);
/*     */     }
/*     */ 
/*     */     
/*     */     private boolean isFullscreen() {
/* 417 */       GraphicsConfiguration gc = this.window.getGraphicsConfiguration();
/* 418 */       if (gc == null)
/* 419 */         return false; 
/* 420 */       return (gc.getDevice().getFullScreenWindow() == this.window);
/*     */     }
/*     */ 
/*     */     
/*     */     private void fireStateChangedLaterOnce() {
/* 425 */       FlatWindowsNativeWindowBorder.this.fireStateChangedLaterOnce();
/*     */     }
/*     */     
/*     */     private native long installImpl(Window param1Window);
/*     */     
/*     */     private native void uninstallImpl(long param1Long);
/*     */     
/*     */     private native void updateFrame(long param1Long, int param1Int);
/*     */     
/*     */     private native void setWindowBackground(long param1Long, int param1Int1, int param1Int2, int param1Int3);
/*     */     
/*     */     private native void showWindow(long param1Long, int param1Int);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatWindowsNativeWindowBorder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */