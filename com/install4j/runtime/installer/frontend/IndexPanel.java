/*     */ package com.install4j.runtime.installer.frontend;
/*     */ import com.install4j.api.beans.AbstractBean;
/*     */ import com.install4j.api.context.WizardIndex;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.util.MaximizedLayeredPane;
/*     */ import com.install4j.runtime.util.PartialLineBorder;
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.io.File;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.Box;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JLayeredPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.border.Border;
/*     */ 
/*     */ public class IndexPanel extends JPanel {
/*     */   private WizardIndex wizardIndex;
/*     */   
/*     */   public IndexPanel(WizardIndex wizardIndex, String key) {
/*  24 */     this.wizardIndex = wizardIndex;
/*  25 */     MaximizedLayeredPane maximizedLayeredPane = new MaximizedLayeredPane();
/*  26 */     maximizedLayeredPane.add(createTextBox(key), JLayeredPane.PALETTE_LAYER);
/*  27 */     maximizedLayeredPane.add(createImagePanel(), JLayeredPane.DEFAULT_LAYER);
/*     */     
/*  29 */     setLayout(new BorderLayout());
/*  30 */     add((Component)maximizedLayeredPane, "Center");
/*     */   }
/*     */   private Font boldFont; private Font plainFont;
/*     */   private JComponent createTextBox(String key) {
/*  34 */     Box box = new Box(3);
/*  35 */     String[] stepNames = AbstractBean.replaceVariables(this.wizardIndex.getStepNames());
/*  36 */     for (int i = 0; i < stepNames.length; i++) {
/*  37 */       String stepName = stepNames[i];
/*  38 */       String labelText = (this.wizardIndex.isNumbered() ? ((i + 1) + ". ") : "") + stepName;
/*  39 */       boolean selected = Objects.equals(AbstractBean.replaceVariables(this.wizardIndex.getKeys())[i], key);
/*  40 */       box.add(createLabel(labelText, selected));
/*     */     } 
/*  42 */     if (this.wizardIndex.isPartiallyDefined()) {
/*  43 */       box.add(createLabel("...", false));
/*     */     }
/*  45 */     box.add(Box.createVerticalGlue());
/*     */     
/*  47 */     box.setBorder(BorderFactory.createCompoundBorder((Border)new PartialLineBorder(
/*  48 */             GUIHelper.getSeparatorColor(), 1, 4), 
/*  49 */           BorderFactory.createEmptyBorder(6, 6, 6, 4)));
/*     */ 
/*     */     
/*  52 */     return box;
/*     */   }
/*     */   
/*     */   private JPanel createImagePanel() {
/*  56 */     JPanel backPanel = new JPanel(new GridBagLayout());
/*  57 */     backPanel.setBackground(getIndexBackground());
/*  58 */     backPanel.setOpaque(true);
/*  59 */     GridBagConstraints gc = new GridBagConstraints();
/*  60 */     gc.weightx = gc.weighty = 1.0D;
/*  61 */     gc.anchor = this.wizardIndex.getBackgroundImageAnchor().getValue();
/*  62 */     backPanel.add(new JLabel(getIcon(this.wizardIndex.getBackgroundImage())), gc);
/*  63 */     return backPanel;
/*     */   }
/*     */   
/*     */   private JLabel createLabel(String labelText, boolean selected) {
/*  67 */     JLabel label = new JLabel(labelText);
/*  68 */     Font font = label.getFont();
/*  69 */     if (selected) {
/*  70 */       if (this.boldFont == null) {
/*  71 */         this.boldFont = font.deriveFont(1);
/*     */       }
/*  73 */       font = this.boldFont;
/*  74 */     } else if (font.isBold()) {
/*  75 */       if (this.plainFont == null) {
/*  76 */         this.plainFont = font.deriveFont(0);
/*     */       }
/*  78 */       font = this.plainFont;
/*     */     } 
/*  80 */     label.setFont(font);
/*  81 */     Color foreground = this.wizardIndex.getForeground();
/*  82 */     if (foreground != null) {
/*  83 */       label.setForeground(foreground);
/*     */     }
/*  85 */     return label;
/*     */   }
/*     */   
/*     */   public Icon getIcon(File file) {
/*  89 */     if (file == null) {
/*  90 */       return null;
/*     */     }
/*  92 */     if (!file.isAbsolute()) {
/*  93 */       if (file.getParent() == null) {
/*  94 */         String fileName = file.getName();
/*  95 */         if (!fileName.startsWith("i4j_extf_")) {
/*  96 */           file = new File("user", fileName);
/*     */         }
/*     */       } 
/*  99 */       file = InstallerUtil.getInstallerFile(file.getPath());
/*     */     } 
/*     */     try {
/* 102 */       Icon headerIcon = IconHelper.loadIcon(file);
/* 103 */       if (headerIcon != null && headerIcon.getIconWidth() > 0) {
/* 104 */         return headerIcon;
/*     */       }
/* 106 */     } catch (Exception exception) {}
/*     */     
/* 108 */     return null;
/*     */   }
/*     */   
/*     */   private Color getIndexBackground() {
/* 112 */     Color background = this.wizardIndex.getBackground();
/* 113 */     return (background == null) ? Color.WHITE : background;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dimension getPreferredSize() {
/* 118 */     Dimension size = super.getPreferredSize();
/* 119 */     size.width = Math.min(Math.max(size.width, this.wizardIndex.getMinWidth()), this.wizardIndex.getMaxWidth());
/* 120 */     return size;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\IndexPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */