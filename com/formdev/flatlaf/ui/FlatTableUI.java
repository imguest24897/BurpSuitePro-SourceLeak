/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.util.Graphics2DProxy;
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import com.formdev.flatlaf.util.SystemInfo;
/*     */ import com.formdev.flatlaf.util.UIScale;
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.FocusEvent;
/*     */ import java.awt.event.FocusListener;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.util.Map;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JViewport;
/*     */ import javax.swing.LookAndFeel;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.plaf.ComponentUI;
/*     */ import javax.swing.plaf.basic.BasicTableUI;
/*     */ import javax.swing.table.JTableHeader;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlatTableUI
/*     */   extends BasicTableUI
/*     */   implements FlatStylingSupport.StyleableUI, FlatViewportUI.ViewportPainter
/*     */ {
/*     */   protected boolean showHorizontalLines;
/*     */   protected boolean showVerticalLines;
/*     */   @Styleable
/*     */   protected boolean showTrailingVerticalLine;
/*     */   protected Dimension intercellSpacing;
/*     */   @Styleable
/*     */   protected Color selectionBackground;
/*     */   @Styleable
/*     */   protected Color selectionForeground;
/*     */   @Styleable
/*     */   protected Color selectionInactiveBackground;
/*     */   @Styleable
/*     */   protected Color selectionInactiveForeground;
/*     */   @Styleable
/*     */   protected Insets cellMargins;
/*     */   @Styleable
/*     */   protected Color cellFocusColor;
/*     */   @Styleable
/*     */   protected Boolean showCellFocusIndicator;
/*     */   private boolean oldShowHorizontalLines;
/*     */   private boolean oldShowVerticalLines;
/*     */   private Dimension oldIntercellSpacing;
/*     */   private PropertyChangeListener propertyChangeListener;
/*     */   private Map<String, Object> oldStyleValues;
/*     */   
/*     */   public static ComponentUI createUI(JComponent c) {
/* 124 */     return new FlatTableUI();
/*     */   }
/*     */ 
/*     */   
/*     */   public void installUI(JComponent c) {
/* 129 */     super.installUI(c);
/*     */     
/* 131 */     installStyle();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installDefaults() {
/* 136 */     super.installDefaults();
/*     */     
/* 138 */     this.showHorizontalLines = UIManager.getBoolean("Table.showHorizontalLines");
/* 139 */     this.showVerticalLines = UIManager.getBoolean("Table.showVerticalLines");
/* 140 */     this.showTrailingVerticalLine = UIManager.getBoolean("Table.showTrailingVerticalLine");
/* 141 */     this.intercellSpacing = UIManager.getDimension("Table.intercellSpacing");
/*     */     
/* 143 */     this.selectionBackground = UIManager.getColor("Table.selectionBackground");
/* 144 */     this.selectionForeground = UIManager.getColor("Table.selectionForeground");
/* 145 */     this.selectionInactiveBackground = UIManager.getColor("Table.selectionInactiveBackground");
/* 146 */     this.selectionInactiveForeground = UIManager.getColor("Table.selectionInactiveForeground");
/*     */     
/* 148 */     toggleSelectionColors();
/*     */     
/* 150 */     int rowHeight = FlatUIUtils.getUIInt("Table.rowHeight", 16);
/* 151 */     if (rowHeight > 0) {
/* 152 */       LookAndFeel.installProperty(this.table, "rowHeight", Integer.valueOf(UIScale.scale(rowHeight)));
/*     */     }
/* 154 */     if (!this.showHorizontalLines) {
/* 155 */       this.oldShowHorizontalLines = this.table.getShowHorizontalLines();
/* 156 */       this.table.setShowHorizontalLines(false);
/*     */     } 
/* 158 */     if (!this.showVerticalLines) {
/* 159 */       this.oldShowVerticalLines = this.table.getShowVerticalLines();
/* 160 */       this.table.setShowVerticalLines(false);
/*     */     } 
/*     */     
/* 163 */     if (this.intercellSpacing != null) {
/* 164 */       this.oldIntercellSpacing = this.table.getIntercellSpacing();
/* 165 */       this.table.setIntercellSpacing(this.intercellSpacing);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallDefaults() {
/* 171 */     super.uninstallDefaults();
/*     */     
/* 173 */     this.selectionBackground = null;
/* 174 */     this.selectionForeground = null;
/* 175 */     this.selectionInactiveBackground = null;
/* 176 */     this.selectionInactiveForeground = null;
/*     */     
/* 178 */     this.oldStyleValues = null;
/*     */ 
/*     */     
/* 181 */     if (!this.showHorizontalLines && this.oldShowHorizontalLines && !this.table.getShowHorizontalLines())
/* 182 */       this.table.setShowHorizontalLines(true); 
/* 183 */     if (!this.showVerticalLines && this.oldShowVerticalLines && !this.table.getShowVerticalLines()) {
/* 184 */       this.table.setShowVerticalLines(true);
/*     */     }
/*     */     
/* 187 */     if (this.intercellSpacing != null && this.table.getIntercellSpacing().equals(this.intercellSpacing)) {
/* 188 */       this.table.setIntercellSpacing(this.oldIntercellSpacing);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void installListeners() {
/* 193 */     super.installListeners();
/*     */     
/* 195 */     this.propertyChangeListener = (e -> {
/*     */         switch (e.getPropertyName()) {
/*     */           case "JComponent.focusOwner":
/*     */             toggleSelectionColors();
/*     */             break;
/*     */           
/*     */           case "FlatLaf.style":
/*     */           case "FlatLaf.styleClass":
/*     */             installStyle();
/*     */             this.table.revalidate();
/*     */             this.table.repaint();
/*     */             break;
/*     */         } 
/*     */       });
/* 209 */     this.table.addPropertyChangeListener(this.propertyChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallListeners() {
/* 214 */     super.uninstallListeners();
/*     */     
/* 216 */     this.table.removePropertyChangeListener(this.propertyChangeListener);
/* 217 */     this.propertyChangeListener = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected FocusListener createFocusListener() {
/* 222 */     return new BasicTableUI.FocusHandler()
/*     */       {
/*     */         public void focusGained(FocusEvent e) {
/* 225 */           super.focusGained(e);
/* 226 */           FlatTableUI.this.toggleSelectionColors();
/*     */         }
/*     */ 
/*     */         
/*     */         public void focusLost(FocusEvent e) {
/* 231 */           super.focusLost(e);
/*     */ 
/*     */           
/* 234 */           EventQueue.invokeLater(() -> FlatTableUI.this.toggleSelectionColors());
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void installStyle() {
/*     */     try {
/* 244 */       applyStyle(FlatStylingSupport.getResolvedStyle(this.table, "Table"));
/* 245 */     } catch (RuntimeException ex) {
/* 246 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void applyStyle(Object style) {
/* 252 */     Color oldSelectionBackground = this.selectionBackground;
/* 253 */     Color oldSelectionForeground = this.selectionForeground;
/* 254 */     Color oldSelectionInactiveBackground = this.selectionInactiveBackground;
/* 255 */     Color oldSelectionInactiveForeground = this.selectionInactiveForeground;
/*     */     
/* 257 */     this.oldStyleValues = FlatStylingSupport.parseAndApply(this.oldStyleValues, style, this::applyStyleProperty);
/*     */ 
/*     */     
/* 260 */     if (this.selectionBackground != oldSelectionBackground) {
/* 261 */       Color selBg = this.table.getSelectionBackground();
/* 262 */       if (selBg == oldSelectionBackground) {
/* 263 */         this.table.setSelectionBackground(this.selectionBackground);
/* 264 */       } else if (selBg == oldSelectionInactiveBackground) {
/* 265 */         this.table.setSelectionBackground(this.selectionInactiveBackground);
/*     */       } 
/*     */     } 
/*     */     
/* 269 */     if (this.selectionForeground != oldSelectionForeground) {
/* 270 */       Color selFg = this.table.getSelectionForeground();
/* 271 */       if (selFg == oldSelectionForeground) {
/* 272 */         this.table.setSelectionForeground(this.selectionForeground);
/* 273 */       } else if (selFg == oldSelectionInactiveForeground) {
/* 274 */         this.table.setSelectionForeground(this.selectionInactiveForeground);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected Object applyStyleProperty(String key, Object value) {
/* 280 */     if ("rowHeight".equals(key) && value instanceof Integer) {
/* 281 */       value = Integer.valueOf(UIScale.scale(((Integer)value).intValue()));
/*     */     }
/* 283 */     return FlatStylingSupport.applyToAnnotatedObjectOrComponent(this, this.table, key, value);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Class<?>> getStyleableInfos(JComponent c) {
/* 289 */     return FlatStylingSupport.getAnnotatedStyleableInfos(this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getStyleableValue(JComponent c, String key) {
/* 295 */     return FlatStylingSupport.getAnnotatedStyleableValue(this, key);
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
/*     */   private void toggleSelectionColors() {
/* 308 */     if (this.table == null) {
/*     */       return;
/*     */     }
/* 311 */     if (FlatUIUtils.isPermanentFocusOwner(this.table)) {
/* 312 */       if (this.table.getSelectionBackground() == this.selectionInactiveBackground)
/* 313 */         this.table.setSelectionBackground(this.selectionBackground); 
/* 314 */       if (this.table.getSelectionForeground() == this.selectionInactiveForeground)
/* 315 */         this.table.setSelectionForeground(this.selectionForeground); 
/*     */     } else {
/* 317 */       if (this.table.getSelectionBackground() == this.selectionBackground)
/* 318 */         this.table.setSelectionBackground(this.selectionInactiveBackground); 
/* 319 */       if (this.table.getSelectionForeground() == this.selectionForeground)
/* 320 */         this.table.setSelectionForeground(this.selectionInactiveForeground); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void paint(Graphics g, JComponent c) {
/*     */     Graphics2DProxy graphics2DProxy;
/* 326 */     FlatTableHeaderUI.fixDraggedAndResizingColumns(this.table.getTableHeader());
/*     */     
/* 328 */     final boolean horizontalLines = this.table.getShowHorizontalLines();
/* 329 */     final boolean verticalLines = this.table.getShowVerticalLines();
/* 330 */     if (horizontalLines || verticalLines) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 337 */       final boolean hideLastVerticalLine = hideLastVerticalLine();
/* 338 */       final int tableWidth = this.table.getWidth();
/* 339 */       JTableHeader header = this.table.getTableHeader();
/* 340 */       final boolean isDragging = (header != null && header.getDraggedColumn() != null);
/*     */       
/* 342 */       double systemScaleFactor = UIScale.getSystemScaleFactor((Graphics2D)g);
/* 343 */       final double lineThickness = 1.0D / systemScaleFactor * (int)systemScaleFactor;
/*     */ 
/*     */ 
/*     */       
/* 347 */       graphics2DProxy = new Graphics2DProxy((Graphics2D)g)
/*     */         {
/*     */           public void drawLine(int x1, int y1, int x2, int y2)
/*     */           {
/* 351 */             if (hideLastVerticalLine && verticalLines && x1 == x2 && y1 == 0 && x1 == tableWidth - 1 && 
/*     */               
/* 353 */               wasInvokedFromPaintGrid()) {
/*     */               return;
/*     */             }
/*     */             
/* 357 */             if (isDragging && SystemInfo.isJava_9_orLater && ((horizontalLines && y1 == y2) || (verticalLines && x1 == x2)) && 
/*     */ 
/*     */               
/* 360 */               wasInvokedFromMethod("paintDraggedArea")) {
/*     */               
/* 362 */               if (y1 == y2) {
/*     */                 
/* 364 */                 fill(new Rectangle2D.Double(x1, y1, (x2 - x1 + 1), lineThickness));
/* 365 */               } else if (x1 == x2) {
/*     */                 
/* 367 */                 fill(new Rectangle2D.Double(x1, y1, lineThickness, (y2 - y1 + 1)));
/*     */               } 
/*     */               
/*     */               return;
/*     */             } 
/* 372 */             super.drawLine(x1, y1, x2, y2);
/*     */           }
/*     */ 
/*     */ 
/*     */           
/*     */           public void fillRect(int x, int y, int width, int height) {
/* 378 */             if (hideLastVerticalLine && verticalLines && width == 1 && y == 0 && x == tableWidth - 1 && 
/*     */               
/* 380 */               wasInvokedFromPaintGrid()) {
/*     */               return;
/*     */             }
/*     */             
/* 384 */             if (lineThickness != 1.0D) {
/* 385 */               if (horizontalLines && height == 1 && wasInvokedFromPaintGrid()) {
/* 386 */                 fill(new Rectangle2D.Double(x, y, width, lineThickness));
/*     */                 return;
/*     */               } 
/* 389 */               if (verticalLines && width == 1 && y == 0 && wasInvokedFromPaintGrid()) {
/* 390 */                 fill(new Rectangle2D.Double(x, y, lineThickness, height));
/*     */                 
/*     */                 return;
/*     */               } 
/*     */             } 
/* 395 */             super.fillRect(x, y, width, height);
/*     */           }
/*     */           
/*     */           private boolean wasInvokedFromPaintGrid() {
/* 399 */             return wasInvokedFromMethod("paintGrid");
/*     */           }
/*     */           
/*     */           private boolean wasInvokedFromMethod(String methodName) {
/* 403 */             return StackUtils.wasInvokedFrom(BasicTableUI.class.getName(), methodName, 8);
/*     */           }
/*     */         };
/*     */     } 
/*     */     
/* 408 */     super.paint((Graphics)graphics2DProxy, c);
/*     */   }
/*     */   
/*     */   protected boolean hideLastVerticalLine() {
/* 412 */     if (this.showTrailingVerticalLine) {
/* 413 */       return false;
/*     */     }
/*     */     
/* 416 */     Container viewport = SwingUtilities.getUnwrappedParent(this.table);
/* 417 */     Container viewportParent = (viewport != null) ? viewport.getParent() : null;
/* 418 */     if (!(viewportParent instanceof JScrollPane)) {
/* 419 */       return false;
/*     */     }
/*     */     
/* 422 */     if (this.table.getX() + this.table.getWidth() < viewport.getWidth()) {
/* 423 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 430 */     JScrollPane scrollPane = (JScrollPane)viewportParent;
/* 431 */     JViewport rowHeader = scrollPane.getRowHeader();
/* 432 */     return scrollPane.getComponentOrientation().isLeftToRight() ? (
/* 433 */       (viewport != rowHeader)) : (
/* 434 */       (viewport == rowHeader || rowHeader == null));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void paintViewport(Graphics g, JComponent c, JViewport viewport) {
/* 440 */     int viewportWidth = viewport.getWidth();
/* 441 */     int viewportHeight = viewport.getHeight();
/*     */ 
/*     */     
/* 444 */     if (viewport.isOpaque()) {
/* 445 */       g.setColor(this.table.getBackground());
/* 446 */       g.fillRect(0, 0, viewportWidth, viewportHeight);
/*     */     } 
/*     */ 
/*     */     
/* 450 */     boolean paintOutside = UIManager.getBoolean("Table.paintOutsideAlternateRows");
/*     */     Color alternateColor;
/* 452 */     if (paintOutside && (alternateColor = UIManager.getColor("Table.alternateRowColor")) != null) {
/* 453 */       g.setColor(alternateColor);
/*     */       
/* 455 */       int rowCount = this.table.getRowCount();
/*     */ 
/*     */       
/* 458 */       int tableHeight = this.table.getHeight();
/* 459 */       if (tableHeight < viewportHeight) {
/* 460 */         int tableWidth = this.table.getWidth();
/* 461 */         int rowHeight = this.table.getRowHeight();
/*     */         
/* 463 */         for (int y = tableHeight, row = rowCount; y < viewportHeight; y += rowHeight, row++) {
/* 464 */           if (row % 2 != 0)
/* 465 */             g.fillRect(0, y, tableWidth, rowHeight); 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatTableUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */