/*     */ package com.install4j.runtime.filechooser;
/*     */ import com.install4j.api.Util;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.Window;
/*     */ import java.awt.event.HierarchyEvent;
/*     */ import java.io.File;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public class CustomFileChooser extends FileChooserWithLowerAccessory implements HierarchyListener {
/*  14 */   private static File lastDir = null;
/*     */   
/*     */   private JComponent lowerAccessory;
/*     */   
/*     */   public CustomFileChooser() {
/*  19 */     if (Boolean.getBoolean("ejt.noShellFolder")) {
/*  20 */       putClientProperty("FileChooser.useShellFolder", Boolean.FALSE);
/*     */     }
/*  22 */     init(false);
/*     */   }
/*     */   
/*     */   public CustomFileChooser(String currentDirectoryPath) {
/*  26 */     super(currentDirectoryPath);
/*  27 */     init((currentDirectoryPath != null));
/*     */   }
/*     */   
/*     */   public CustomFileChooser(File currentDirectory) {
/*  31 */     super(currentDirectory);
/*  32 */     init((currentDirectory != null));
/*     */   }
/*     */ 
/*     */   
/*     */   public void hierarchyChanged(HierarchyEvent event) {
/*  37 */     if ((event.getChangeFlags() & 0x1L) != 0L) {
/*  38 */       JDialog dialog = (JDialog)SwingUtilities.getAncestorOfClass(JDialog.class, this);
/*  39 */       if (dialog != null) {
/*  40 */         dialog.setBackground(UIManager.getColor("control"));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void approveSelection() {
/*  47 */     lastDir = getCurrentDirectory();
/*  48 */     super.approveSelection();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCurrentDirectory(File currentDirectory) {
/*  53 */     if (currentDirectory == null) {
/*  54 */       currentDirectory = lastDir;
/*     */     }
/*  56 */     super.setCurrentDirectory(currentDirectory);
/*     */   }
/*     */   
/*     */   private void init(boolean directorySet) {
/*  60 */     putClientProperty("JFileChooser.appBundleIsTraversable", "always");
/*  61 */     putClientProperty("JFileChooser.packageIsTraversable", "always");
/*  62 */     addHierarchyListener(this);
/*  63 */     if (!directorySet && lastDir != null) {
/*  64 */       setCurrentDirectory(lastDir);
/*     */     }
/*     */   }
/*     */   
/*     */   public JComponent getLowerAccessory() {
/*  69 */     return this.lowerAccessory;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setLowerAccessory(JComponent lowerAccessory) {
/*  74 */     int left = UiUtil.getLookAndFeelEnhancer().getFileChooserLowerAccessoryInset();
/*  75 */     lowerAccessory.setBorder(BorderFactory.createEmptyBorder(2, left, 5, 5));
/*  76 */     this.lowerAccessory = lowerAccessory;
/*     */   }
/*     */ 
/*     */   
/*     */   public int showDialog(Component parent, String approveButtonText) {
/*  81 */     return super.showDialog(parent, Util.isMacOS() ? null : approveButtonText);
/*     */   }
/*     */ 
/*     */   
/*     */   protected JDialog createDialog(Component component) {
/*  86 */     boolean macOS = Util.isMacOS();
/*  87 */     JDialog dialog = super.createDialog(macOS ? null : component);
/*  88 */     addLowerAccessory(dialog);
/*  89 */     if (macOS) {
/*     */       Window parentWindow;
/*  91 */       if (component instanceof Window) {
/*  92 */         parentWindow = (Window)component;
/*     */       } else {
/*  94 */         parentWindow = (Window)SwingUtilities.getAncestorOfClass(Window.class, component);
/*     */       } 
/*  96 */       if (parentWindow != null) {
/*  97 */         Rectangle bounds = parentWindow.getBounds();
/*  98 */         int deltaX = bounds.width - dialog.getWidth();
/*  99 */         int deltaY = bounds.height - dialog.getHeight();
/* 100 */         bounds.x += deltaX / 2;
/* 101 */         bounds.width -= deltaX;
/* 102 */         bounds.y += deltaY / 2;
/* 103 */         bounds.height -= deltaY;
/*     */         
/* 105 */         if (bounds.x < 0) {
/* 106 */           bounds.translate(-bounds.x, 0);
/*     */         }
/*     */         
/* 109 */         if (bounds.y < 0) {
/* 110 */           bounds.translate(0, -bounds.y);
/*     */         }
/* 112 */         dialog.setBounds(bounds);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 118 */     return dialog;
/*     */   }
/*     */   
/*     */   private void addLowerAccessory(JDialog dialog) {
/* 122 */     if (this.lowerAccessory == null) {
/*     */       return;
/*     */     }
/*     */     
/* 126 */     Container contentPane = dialog.getContentPane();
/* 127 */     contentPane.add(this.lowerAccessory, "South");
/* 128 */     dialog.pack();
/*     */   }
/*     */   
/*     */   public static JPanel createLowerAccessoryPanel() {
/* 132 */     JPanel panel = new JPanel();
/* 133 */     panel.setLayout(new BoxLayout(panel, 0));
/* 134 */     return panel;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\CustomFileChooser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */