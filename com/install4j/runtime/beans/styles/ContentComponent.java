/*     */ package com.install4j.runtime.beans.styles;
/*     */ import com.ejt.internal.gui.HiDPIUtil;
/*     */ import com.install4j.api.styles.StyleContext;
/*     */ import com.install4j.runtime.beans.formcomponents.SystemFormComponent;
/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.awt.image.BufferedImage;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public class ContentComponent extends SystemFormComponent implements StyleContextReceiver {
/*     */   private JPanel containerPanel;
/*     */   
/*     */   public void setContent(JComponent content) {
/*  19 */     if (this.content != content || content.getParent() == null) {
/*  20 */       this.content = content;
/*  21 */       this.containerPanel.removeAll();
/*  22 */       this.containerPanel.add(content, "Center");
/*     */     } 
/*     */   }
/*     */   private JComponent content;
/*     */   
/*     */   public void setStyleContext(StyleContext styleContext) {
/*  28 */     JComponent contentComponent = styleContext.getContentComponent();
/*  29 */     if (contentComponent != null && contentComponent.getParent() == null) {
/*  30 */       setContent(contentComponent);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/*  36 */     this.containerPanel = new JPanel(new BorderLayout());
/*  37 */     if (getFormEnvironment().isDesignTime()) {
/*  38 */       this.containerPanel.add(new PlaceholderComponent(), "Center");
/*     */     }
/*  40 */     return this.containerPanel;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/*  45 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterVertical() {
/*  50 */     return true;
/*     */   }
/*     */   
/*     */   private static class PlaceholderComponent
/*     */     extends JPanel {
/*     */     private int lastCrossHatch;
/*     */     private BufferedImage bufferedImage;
/*     */     
/*     */     public PlaceholderComponent() {
/*  59 */       setLayout(new GridBagLayout());
/*  60 */       GridBagConstraints gc = new GridBagConstraints();
/*  61 */       gc.gridx = gc.gridy = 0;
/*  62 */       gc.weightx = gc.weighty = 1.0D;
/*     */       
/*  64 */       JLabel label = new JLabel("Screen Content");
/*  65 */       label.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
/*  66 */       label.setEnabled(false);
/*  67 */       label.setOpaque(true);
/*  68 */       add(label, gc);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void paintComponent(Graphics graphics) {
/*  73 */       Graphics2D g = (Graphics2D)graphics;
/*  74 */       double scaleFactor = HiDPIUtil.getScaleFactor(g);
/*  75 */       if (scaleFactor > 1.0D) {
/*  76 */         double inverseScaleFactor = 1.0D / scaleFactor;
/*  77 */         g.scale(inverseScaleFactor, inverseScaleFactor);
/*     */       } 
/*     */       
/*  80 */       int crossHatch = (int)(10.0D * HiDPIUtil.getScaleFactor(g));
/*  81 */       if (crossHatch != this.lastCrossHatch) {
/*  82 */         this.lastCrossHatch = crossHatch;
/*  83 */         this.bufferedImage = initCrossHatchImage(crossHatch);
/*     */       } 
/*     */       
/*  86 */       Rectangle2D rect = new Rectangle2D.Double(0.0D, 0.0D, crossHatch, crossHatch);
/*  87 */       g.setPaint(new TexturePaint(this.bufferedImage, rect));
/*  88 */       g.fill(new Rectangle2D.Double(0.0D, 0.0D, getWidth() * scaleFactor, getHeight() * scaleFactor));
/*     */       
/*  90 */       if (scaleFactor > 1.0D) {
/*  91 */         g.scale(scaleFactor, scaleFactor);
/*     */       }
/*     */     }
/*     */     
/*     */     private BufferedImage initCrossHatchImage(int crossHatch) {
/*  96 */       BufferedImage bufferedImage = new BufferedImage(crossHatch, crossHatch, 2);
/*     */       
/*  98 */       Graphics2D g = bufferedImage.createGraphics();
/*  99 */       Color hatchColor = UIManager.getColor("Label.disabledForeground");
/* 100 */       g.setColor(hatchColor);
/* 101 */       g.drawLine(0, 0, crossHatch, crossHatch);
/* 102 */       return bufferedImage;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\styles\ContentComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */