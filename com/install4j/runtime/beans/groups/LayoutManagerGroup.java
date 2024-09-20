/*     */ package com.install4j.runtime.beans.groups;
/*     */ import com.install4j.api.beans.Anchor;
/*     */ import com.install4j.api.beans.ExternalFile;
/*     */ import com.install4j.runtime.beans.formcomponents.AxisType;
/*     */ import com.install4j.runtime.beans.formcomponents.BorderSides;
/*     */ import com.install4j.runtime.util.MaximizedLayeredPane;
/*     */ import com.install4j.runtime.util.PartialLineBorder;
/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.Insets;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.border.Border;
/*     */ import javax.swing.border.EmptyBorder;
/*     */ 
/*     */ public abstract class LayoutManagerGroup extends FormComponentGroup {
/*  20 */   private ExternalFile imageFile = null;
/*  21 */   private Anchor imageAnchor = Anchor.NORTHWEST;
/*  22 */   private AxisType imageEdgeAxisType = AxisType.VERTICAL;
/*  23 */   private Color imageEdgeBackgroundColor = null;
/*  24 */   private Insets imageInsets = new Insets(0, 0, 0, 0);
/*     */   private boolean imageOverlap = false;
/*     */   private boolean imageEdgeBorder = false;
/*  27 */   private Color imageEdgeBorderColor = null;
/*  28 */   private int imageEdgeBorderWidth = 1;
/*     */   
/*  30 */   private Color backgroundColor = null;
/*  31 */   private Color foregroundColor = null;
/*     */   private BorderSides borderSides;
/*  33 */   private String borderTitle = "";
/*  34 */   private Color borderColor = null;
/*  35 */   private int borderWidth = 1;
/*     */   private int cellSpacing;
/*     */   private JPanel panel;
/*     */   
/*     */   public ExternalFile getImageFile() {
/*  40 */     return (ExternalFile)replaceWithTextOverride("imageFile", this.imageFile, ExternalFile.class);
/*     */   }
/*     */   
/*     */   public void setImageFile(ExternalFile imageFile) {
/*  44 */     this.imageFile = imageFile;
/*     */   }
/*     */   
/*     */   public Anchor getImageAnchor() {
/*  48 */     return (Anchor)replaceWithTextOverride("imageAnchor", this.imageAnchor, Anchor.class);
/*     */   }
/*     */   
/*     */   public void setImageAnchor(Anchor imageAnchor) {
/*  52 */     this.imageAnchor = imageAnchor;
/*     */   }
/*     */   
/*     */   public AxisType getImageEdgeAxisType() {
/*  56 */     return (AxisType)replaceWithTextOverride("imageEdgeAxisType", this.imageEdgeAxisType, AxisType.class);
/*     */   }
/*     */   
/*     */   public void setImageEdgeAxisType(AxisType imageEdgeAxisType) {
/*  60 */     this.imageEdgeAxisType = imageEdgeAxisType;
/*     */   }
/*     */   
/*     */   public Color getImageEdgeBackgroundColor() {
/*  64 */     return (Color)replaceWithTextOverride("imageEdgeBackgroundColor", this.imageEdgeBackgroundColor, Color.class);
/*     */   }
/*     */   
/*     */   public void setImageEdgeBackgroundColor(Color imageEdgeBackgroundColor) {
/*  68 */     this.imageEdgeBackgroundColor = imageEdgeBackgroundColor;
/*     */   }
/*     */   
/*     */   public Insets getImageInsets() {
/*  72 */     return (Insets)replaceWithTextOverride("imageInsets", this.imageInsets, Insets.class);
/*     */   }
/*     */   
/*     */   public void setImageInsets(Insets imageInsets) {
/*  76 */     this.imageInsets = imageInsets;
/*     */   }
/*     */   
/*     */   public boolean isImageOverlap() {
/*  80 */     return replaceWithTextOverride("imageOverlap", this.imageOverlap);
/*     */   }
/*     */   
/*     */   public void setImageOverlap(boolean imageOverlap) {
/*  84 */     this.imageOverlap = imageOverlap;
/*     */   }
/*     */   
/*     */   public boolean isImageEdgeBorder() {
/*  88 */     return replaceWithTextOverride("imageEdgeBorder", this.imageEdgeBorder);
/*     */   }
/*     */   
/*     */   public void setImageEdgeBorder(boolean imageEdgeBorder) {
/*  92 */     this.imageEdgeBorder = imageEdgeBorder;
/*     */   }
/*     */   
/*     */   public Color getImageEdgeBorderColor() {
/*  96 */     return (Color)replaceWithTextOverride("imageEdgeBorderColor", this.imageEdgeBorderColor, Color.class);
/*     */   }
/*     */   
/*     */   public void setImageEdgeBorderColor(Color imageEdgeBorderColor) {
/* 100 */     this.imageEdgeBorderColor = imageEdgeBorderColor;
/*     */   }
/*     */   
/*     */   public int getImageEdgeBorderWidth() {
/* 104 */     return replaceWithTextOverride("imageEdgeBorderWidth", this.imageEdgeBorderWidth);
/*     */   }
/*     */   
/*     */   public void setImageEdgeBorderWidth(int imageEdgeBorderWidth) {
/* 108 */     this.imageEdgeBorderWidth = imageEdgeBorderWidth;
/*     */   }
/*     */   
/*     */   public Color getBackgroundColor() {
/* 112 */     return (Color)replaceWithTextOverride("backgroundColor", this.backgroundColor, Color.class);
/*     */   }
/*     */   
/*     */   public void setBackgroundColor(Color backgroundColor) {
/* 116 */     this.backgroundColor = backgroundColor;
/*     */   }
/*     */   
/*     */   public Color getForegroundColor() {
/* 120 */     return (Color)replaceWithTextOverride("foregroundColor", this.foregroundColor, Color.class);
/*     */   }
/*     */   
/*     */   public void setForegroundColor(Color foregroundColor) {
/* 124 */     this.foregroundColor = foregroundColor;
/*     */   }
/*     */   
/*     */   public BorderSides getBorderSides() {
/* 128 */     return (BorderSides)replaceWithTextOverride("borderSides", this.borderSides, BorderSides.class);
/*     */   }
/*     */   
/*     */   public void setBorderSides(BorderSides borderSides) {
/* 132 */     this.borderSides = borderSides;
/*     */   }
/*     */   
/*     */   public String getBorderTitle() {
/* 136 */     return replaceVariables(replaceVariables(this.borderTitle));
/*     */   }
/*     */   
/*     */   public void setBorderTitle(String borderTitle) {
/* 140 */     this.borderTitle = borderTitle;
/*     */   }
/*     */   
/*     */   public Color getBorderColor() {
/* 144 */     return (Color)replaceWithTextOverride("borderColor", this.borderColor, Color.class);
/*     */   }
/*     */   
/*     */   public void setBorderColor(Color borderColor) {
/* 148 */     this.borderColor = borderColor;
/*     */   }
/*     */   
/*     */   public int getBorderWidth() {
/* 152 */     return replaceWithTextOverride("borderWidth", this.borderWidth);
/*     */   }
/*     */   
/*     */   public void setBorderWidth(int borderWidth) {
/* 156 */     this.borderWidth = borderWidth;
/*     */   }
/*     */   
/*     */   protected LayoutManagerGroup() {
/* 160 */     setCellSpacing(getDefaultCellSpacing());
/*     */   }
/*     */   
/*     */   public int getCellSpacing() {
/* 164 */     return replaceWithTextOverride("cellSpacing", this.cellSpacing);
/*     */   }
/*     */   
/*     */   public void setCellSpacing(int cellSpacing) {
/* 168 */     this.cellSpacing = cellSpacing;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JComponent createComponent(JComponent container) {
/* 179 */     this.panel = new JPanel(new GridBagLayout());
/* 180 */     this.panel.setOpaque(false);
/* 181 */     this.panel.setBorder(createInsetsBorder(getInsets()));
/* 182 */     return this.panel;
/*     */   }
/*     */   
/*     */   public EmptyBorder createInsetsBorder(Insets insets) {
/* 186 */     return new EmptyBorder(insets.top, insets.left, insets.bottom, insets.right);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setVisible(boolean visible) {
/* 191 */     super.setVisible(visible);
/* 192 */     if (this.panel != null) {
/* 193 */       this.panel.setVisible(visible);
/*     */     }
/*     */   }
/*     */   
/*     */   public JPanel getPanel() {
/* 198 */     return this.panel;
/*     */   }
/*     */   
/*     */   public JComponent wrap(JComponent component) {
/* 202 */     JPanel wrapper = new JPanel(new BorderLayout());
/* 203 */     wrapper.setOpaque(false);
/* 204 */     wrapper.setBorder(createWrapperBorder());
/* 205 */     if (getBackgroundColor() != null) {
/* 206 */       wrapper.setBackground(getBackgroundColor());
/* 207 */       wrapper.setOpaque(true);
/*     */     } else {
/* 209 */       wrapper.setOpaque(false);
/*     */     } 
/* 211 */     wrapper.add(createWrapperContent(component), "Center");
/*     */     
/* 213 */     return wrapper;
/*     */   }
/*     */   
/*     */   private JComponent createWrapperContent(JComponent component) {
/* 217 */     ExternalFile imageFile = getImageFile();
/* 218 */     if (imageFile == null) {
/* 219 */       return component;
/*     */     }
/* 221 */     return (JComponent)IconHelper.withIcon(imageFile, component, getContext(), icon -> {
/*     */           if (isEffectiveImageOverlap()) {
/*     */             MaximizedLayeredPane maximizedLayeredPane = new MaximizedLayeredPane();
/*     */             maximizedLayeredPane.setOpaque(false);
/*     */             maximizedLayeredPane.add(component, JLayeredPane.PALETTE_LAYER);
/*     */             maximizedLayeredPane.add(createImagePanel(new JLabel(icon)), JLayeredPane.DEFAULT_LAYER);
/*     */             return (JComponent)maximizedLayeredPane;
/*     */           } 
/*     */           JPanel backPanel = new JPanel(new GridBagLayout());
/*     */           backPanel.setOpaque(false);
/*     */           GridBagConstraints gc = createImagePanelConstraint();
/*     */           boolean imageFirstComponent = isImageFirstComponent();
/*     */           adjustImagePanelRowOrColumn(gc, imageFirstComponent);
/*     */           backPanel.add(createImagePanel(new JLabel(icon)), gc);
/*     */           adjustImagePanelRowOrColumn(gc, !imageFirstComponent);
/*     */           gc.weightx = gc.weighty = 1.0D;
/*     */           gc.fill = 1;
/*     */           gc.anchor = 10;
/*     */           backPanel.add(component, gc);
/*     */           return backPanel;
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isEffectiveImageOverlap() {
/* 247 */     return (getImageAnchor() == Anchor.CENTER || isImageOverlap());
/*     */   }
/*     */   
/*     */   private void adjustImagePanelRowOrColumn(GridBagConstraints gc, boolean first) {
/* 251 */     int index = first ? 0 : 1;
/* 252 */     if (getImagePanelAxis() == AxisType.HORIZONTAL) {
/* 253 */       gc.gridy = index;
/*     */     } else {
/* 255 */       gc.gridx = index;
/*     */     } 
/*     */   }
/*     */   
/*     */   private GridBagConstraints createImagePanelConstraint() {
/* 260 */     GridBagConstraints gc = new GridBagConstraints();
/* 261 */     gc.gridx = gc.gridy = 0;
/* 262 */     gc.weightx = getImagePanelConstraintWeight(AxisType.HORIZONTAL);
/* 263 */     gc.weighty = getImagePanelConstraintWeight(AxisType.VERTICAL);
/* 264 */     gc.fill = getImagePanelFill();
/* 265 */     gc.anchor = getImageAnchor().getValue();
/* 266 */     return gc;
/*     */   }
/*     */   
/*     */   private int getImagePanelFill() {
/* 270 */     Anchor anchor = getImageAnchor();
/* 271 */     switch (anchor) {
/*     */       case CENTER:
/* 273 */         return 0;
/*     */       case NORTHWEST:
/*     */       case NORTHEAST:
/*     */       case SOUTHWEST:
/*     */       case SOUTHEAST:
/* 278 */         return (getImageEdgeAxisType() == AxisType.HORIZONTAL) ? 2 : 3;
/*     */       case NORTH:
/*     */       case SOUTH:
/* 281 */         return 2;
/*     */       case WEST:
/*     */       case EAST:
/* 284 */         return 3;
/*     */     } 
/* 286 */     throw new IllegalStateException(anchor.name());
/*     */   }
/*     */ 
/*     */   
/*     */   private double getImagePanelConstraintWeight(AxisType gridBagAxisType) {
/* 291 */     Anchor anchor = getImageAnchor();
/* 292 */     switch (anchor) {
/*     */       case NORTHWEST:
/*     */       case NORTHEAST:
/*     */       case SOUTHWEST:
/*     */       case SOUTHEAST:
/* 297 */         return (getImageEdgeAxisType() == gridBagAxisType) ? 1.0D : 0.0D;
/*     */       case NORTH:
/*     */       case SOUTH:
/* 300 */         return (gridBagAxisType == AxisType.HORIZONTAL) ? 1.0D : 0.0D;
/*     */       case CENTER:
/* 302 */         return 1.0D;
/*     */       case WEST:
/*     */       case EAST:
/* 305 */         return (gridBagAxisType == AxisType.VERTICAL) ? 1.0D : 0.0D;
/*     */     } 
/* 307 */     throw new IllegalStateException(anchor.name());
/*     */   }
/*     */ 
/*     */   
/*     */   private AxisType getImagePanelAxis() {
/* 312 */     Anchor anchor = getImageAnchor();
/* 313 */     switch (anchor) {
/*     */       case NORTHWEST:
/*     */       case NORTHEAST:
/*     */       case SOUTHWEST:
/*     */       case SOUTHEAST:
/* 318 */         return getImageEdgeAxisType();
/*     */       case NORTH:
/*     */       case SOUTH:
/* 321 */         return AxisType.HORIZONTAL;
/*     */       case WEST:
/*     */       case EAST:
/* 324 */         return AxisType.VERTICAL;
/*     */     } 
/* 326 */     throw new IllegalStateException(anchor.name());
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean isImageFirstComponent() {
/* 331 */     Anchor anchor = getImageAnchor();
/* 332 */     switch (anchor) {
/*     */       case NORTHWEST:
/*     */       case NORTH:
/*     */       case WEST:
/* 336 */         return true;
/*     */       case SOUTHEAST:
/*     */       case SOUTH:
/*     */       case EAST:
/* 340 */         return false;
/*     */       case NORTHEAST:
/* 342 */         return (getImageEdgeAxisType() == AxisType.HORIZONTAL);
/*     */       case SOUTHWEST:
/* 344 */         return (getImageEdgeAxisType() == AxisType.VERTICAL);
/*     */     } 
/* 346 */     throw new IllegalStateException(anchor.name());
/*     */   }
/*     */ 
/*     */   
/*     */   private int getImageEdgeBorderFlag() {
/* 351 */     Anchor anchor = getImageAnchor();
/* 352 */     switch (anchor) {
/*     */       case NORTHWEST:
/* 354 */         return (getImageEdgeAxisType() == AxisType.HORIZONTAL) ? 2 : 4;
/*     */       case NORTH:
/* 356 */         return 2;
/*     */       case NORTHEAST:
/* 358 */         return (getImageEdgeAxisType() == AxisType.HORIZONTAL) ? 2 : 8;
/*     */       case WEST:
/* 360 */         return 4;
/*     */       case EAST:
/* 362 */         return 8;
/*     */       case SOUTHWEST:
/* 364 */         return (getImageEdgeAxisType() == AxisType.HORIZONTAL) ? 1 : 4;
/*     */       case SOUTH:
/* 366 */         return 1;
/*     */       case SOUTHEAST:
/* 368 */         return (getImageEdgeAxisType() == AxisType.HORIZONTAL) ? 1 : 8;
/*     */     } 
/* 370 */     throw new IllegalStateException(anchor.name());
/*     */   }
/*     */ 
/*     */   
/*     */   private JComponent createImagePanel(JLabel label) {
/* 375 */     JPanel edgePanel = new JPanel(new GridBagLayout())
/*     */       {
/*     */         public void paint(Graphics g) {
/* 378 */           super.paint(g);
/*     */           
/* 380 */           paintBorder(g);
/*     */         }
/*     */       };
/* 383 */     if (getImageEdgeBackgroundColor() != null) {
/* 384 */       edgePanel.setOpaque(true);
/* 385 */       edgePanel.setBackground(getImageEdgeBackgroundColor());
/*     */     } else {
/* 387 */       edgePanel.setOpaque(false);
/*     */     } 
/* 389 */     GridBagConstraints gc = new GridBagConstraints();
/* 390 */     gc.gridx = gc.gridy = 0;
/* 391 */     gc.weightx = gc.weighty = 1.0D;
/* 392 */     gc.anchor = getImageAnchor().getValue();
/* 393 */     edgePanel.add(label, gc);
/* 394 */     edgePanel.setBorder(createImagePanelBorder());
/* 395 */     return edgePanel;
/*     */   }
/*     */   
/*     */   private Border createImagePanelBorder() {
/* 399 */     EmptyBorder insetsBorder = createInsetsBorder(getImageInsets());
/* 400 */     if (isImageEdgeBorder() && !isEffectiveImageOverlap()) {
/* 401 */       Color color = (getImageEdgeBorderColor() == null) ? GUIHelper.getSeparatorColor() : getImageEdgeBorderColor();
/* 402 */       PartialLineBorder lineBorder = new PartialLineBorder(color, getImageEdgeBorderWidth(), getImageEdgeBorderFlag());
/* 403 */       return BorderFactory.createCompoundBorder((Border)lineBorder, insetsBorder);
/*     */     } 
/* 405 */     return insetsBorder;
/*     */   }
/*     */ 
/*     */   
/*     */   private Border createWrapperBorder() {
/* 410 */     Color color = (getBorderColor() == null) ? GUIHelper.getSeparatorColor() : getBorderColor();
/* 411 */     int borderSideFlags = (getBorderSides() == null) ? 0 : getBorderSides().getBorderFlags();
/* 412 */     PartialLineBorder border = new PartialLineBorder(color, getBorderWidth(), borderSideFlags);
/* 413 */     String title = getBorderTitle();
/* 414 */     if (borderSideFlags == 15 && !title.isEmpty()) {
/* 415 */       return new TitledBorder((Border)border, title);
/*     */     }
/* 417 */     return (Border)border;
/*     */   }
/*     */   
/*     */   protected abstract int getDefaultCellSpacing();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\groups\LayoutManagerGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */