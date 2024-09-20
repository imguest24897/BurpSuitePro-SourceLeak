/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.icons.FlatFileViewDirectoryIcon;
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import com.formdev.flatlaf.util.ScaledImageIcon;
/*     */ import com.formdev.flatlaf.util.SystemInfo;
/*     */ import com.formdev.flatlaf.util.UIScale;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Image;
/*     */ import java.awt.Insets;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.io.File;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.ArrayList;
/*     */ import java.util.function.Function;
/*     */ import javax.swing.AbstractButton;
/*     */ import javax.swing.ButtonGroup;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JFileChooser;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JToggleButton;
/*     */ import javax.swing.JToolBar;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.filechooser.FileSystemView;
/*     */ import javax.swing.filechooser.FileView;
/*     */ import javax.swing.plaf.ComponentUI;
/*     */ import javax.swing.plaf.basic.BasicFileChooserUI;
/*     */ import javax.swing.plaf.metal.MetalFileChooserUI;
/*     */ import javax.swing.table.TableCellRenderer;
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
/*     */ public class FlatFileChooserUI
/*     */   extends MetalFileChooserUI
/*     */ {
/* 165 */   private final FlatFileView fileView = new FlatFileView();
/*     */   private FlatShortcutsPanel shortcutsPanel;
/*     */   
/*     */   public static ComponentUI createUI(JComponent c) {
/* 169 */     return new FlatFileChooserUI((JFileChooser)c);
/*     */   }
/*     */   
/*     */   public FlatFileChooserUI(JFileChooser filechooser) {
/* 173 */     super(filechooser);
/*     */   }
/*     */ 
/*     */   
/*     */   public void installComponents(JFileChooser fc) {
/* 178 */     super.installComponents(fc);
/*     */     
/* 180 */     patchUI(fc);
/*     */     
/* 182 */     if (!UIManager.getBoolean("FileChooser.noPlacesBar")) {
/* 183 */       FlatShortcutsPanel panel = createShortcutsPanel(fc);
/* 184 */       if (panel.getComponentCount() > 0) {
/* 185 */         this.shortcutsPanel = panel;
/* 186 */         fc.add(this.shortcutsPanel, "Before");
/* 187 */         fc.addPropertyChangeListener(this.shortcutsPanel);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void uninstallComponents(JFileChooser fc) {
/* 194 */     super.uninstallComponents(fc);
/*     */     
/* 196 */     if (this.shortcutsPanel != null) {
/* 197 */       fc.removePropertyChangeListener(this.shortcutsPanel);
/* 198 */       this.shortcutsPanel = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void patchUI(JFileChooser fc) {
/* 204 */     Component topPanel = fc.getComponent(0);
/* 205 */     if (topPanel instanceof JPanel && ((JPanel)topPanel)
/* 206 */       .getLayout() instanceof BorderLayout) {
/*     */       
/* 208 */       Component topButtonPanel = ((JPanel)topPanel).getComponent(0);
/* 209 */       if (topButtonPanel instanceof JPanel && ((JPanel)topButtonPanel)
/* 210 */         .getLayout() instanceof javax.swing.BoxLayout) {
/*     */         
/* 212 */         Insets margin = UIManager.getInsets("Button.margin");
/* 213 */         Component[] comps = ((JPanel)topButtonPanel).getComponents();
/* 214 */         for (int i = comps.length - 1; i >= 0; i--) {
/* 215 */           Component c = comps[i];
/* 216 */           if (c instanceof javax.swing.JButton || c instanceof JToggleButton) {
/* 217 */             AbstractButton b = (AbstractButton)c;
/* 218 */             b.putClientProperty("JButton.buttonType", "toolBarButton");
/*     */             
/* 220 */             b.setMargin(margin);
/* 221 */             b.setFocusable(false);
/* 222 */           } else if (c instanceof javax.swing.Box.Filler) {
/* 223 */             ((JPanel)topButtonPanel).remove(i);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*     */     try {
/* 230 */       Component directoryComboBox = ((JPanel)topPanel).getComponent(2);
/* 231 */       if (directoryComboBox instanceof JComboBox) {
/* 232 */         int maximumRowCount = UIManager.getInt("ComboBox.maximumRowCount");
/* 233 */         if (maximumRowCount > 0)
/* 234 */           ((JComboBox)directoryComboBox).setMaximumRowCount(maximumRowCount); 
/*     */       } 
/* 236 */     } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 242 */     LayoutManager layout = fc.getLayout();
/* 243 */     if (layout instanceof BorderLayout) {
/* 244 */       BorderLayout borderLayout = (BorderLayout)layout;
/* 245 */       borderLayout.setHgap(8);
/*     */       
/* 247 */       Component north = borderLayout.getLayoutComponent("North");
/* 248 */       Component lineEnd = borderLayout.getLayoutComponent("After");
/* 249 */       Component center = borderLayout.getLayoutComponent("Center");
/* 250 */       Component south = borderLayout.getLayoutComponent("South");
/* 251 */       if (north != null && lineEnd != null && center != null && south != null) {
/* 252 */         JPanel p = new JPanel(new BorderLayout(0, 11));
/* 253 */         p.add(north, "North");
/* 254 */         p.add(lineEnd, "After");
/* 255 */         p.add(center, "Center");
/* 256 */         p.add(south, "South");
/* 257 */         fc.add(p, "Center");
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected JPanel createDetailsView(JFileChooser fc) {
/* 264 */     JPanel p = super.createDetailsView(fc);
/*     */     
/* 266 */     if (!SystemInfo.isWindows) {
/* 267 */       return p;
/*     */     }
/*     */     
/* 270 */     JScrollPane scrollPane = null;
/* 271 */     for (Component c : p.getComponents()) {
/* 272 */       if (c instanceof JScrollPane) {
/* 273 */         scrollPane = (JScrollPane)c;
/*     */         break;
/*     */       } 
/*     */     } 
/* 277 */     if (scrollPane == null) {
/* 278 */       return p;
/*     */     }
/*     */     
/* 281 */     Component view = scrollPane.getViewport().getView();
/* 282 */     if (!(view instanceof JTable)) {
/* 283 */       return p;
/*     */     }
/* 285 */     JTable table = (JTable)view;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 291 */     final TableCellRenderer defaultRenderer = table.getDefaultRenderer(Object.class);
/* 292 */     table.setDefaultRenderer(Object.class, new TableCellRenderer()
/*     */         {
/*     */ 
/*     */           
/*     */           public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
/*     */           {
/* 298 */             if (value instanceof String && ((String)value).startsWith("‎")) {
/* 299 */               String str = (String)value;
/* 300 */               char[] buf = new char[str.length()];
/* 301 */               int j = 0;
/* 302 */               for (int i = 0; i < buf.length; i++) {
/* 303 */                 char ch = str.charAt(i);
/* 304 */                 if (ch != '‎' && ch != '‏')
/* 305 */                   buf[j++] = ch; 
/*     */               } 
/* 307 */               value = new String(buf, 0, j);
/*     */             } 
/*     */             
/* 310 */             return defaultRenderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 315 */     return p;
/*     */   }
/*     */ 
/*     */   
/*     */   protected FlatShortcutsPanel createShortcutsPanel(JFileChooser fc) {
/* 320 */     return new FlatShortcutsPanel(fc);
/*     */   }
/*     */ 
/*     */   
/*     */   public Dimension getPreferredSize(JComponent c) {
/* 325 */     Dimension prefSize = super.getPreferredSize(c);
/* 326 */     Dimension minSize = getMinimumSize(c);
/* 327 */     int shortcutsPanelWidth = (this.shortcutsPanel != null) ? (this.shortcutsPanel.getPreferredSize()).width : 0;
/* 328 */     return new Dimension(
/* 329 */         Math.max(prefSize.width, minSize.width + shortcutsPanelWidth), 
/* 330 */         Math.max(prefSize.height, minSize.height));
/*     */   }
/*     */ 
/*     */   
/*     */   public Dimension getMinimumSize(JComponent c) {
/* 335 */     return UIScale.scale(super.getMinimumSize(c));
/*     */   }
/*     */ 
/*     */   
/*     */   public FileView getFileView(JFileChooser fc) {
/* 340 */     return doNotUseSystemIcons() ? super.getFileView(fc) : this.fileView;
/*     */   }
/*     */ 
/*     */   
/*     */   public void clearIconCache() {
/* 345 */     if (doNotUseSystemIcons()) {
/* 346 */       super.clearIconCache();
/*     */     } else {
/* 348 */       this.fileView.clearIconCache();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean doNotUseSystemIcons() {
/* 354 */     return (SystemInfo.isWindows && SystemInfo.isX86 && SystemInfo.isJava_17_orLater && SystemInfo.javaVersion < 
/*     */       
/* 356 */       SystemInfo.toVersion(17, 0, 3, 0));
/*     */   }
/*     */ 
/*     */   
/*     */   private class FlatFileView
/*     */     extends BasicFileChooserUI.BasicFileView
/*     */   {
/*     */     private FlatFileView() {}
/*     */     
/*     */     public Icon getIcon(File f) {
/*     */       ScaledImageIcon scaledImageIcon;
/* 367 */       Icon icon = getCachedIcon(f);
/* 368 */       if (icon != null) {
/* 369 */         return icon;
/*     */       }
/*     */       
/* 372 */       if (f != null) {
/* 373 */         icon = FlatFileChooserUI.this.getFileChooser().getFileSystemView().getSystemIcon(f);
/*     */         
/* 375 */         if (icon != null) {
/* 376 */           if (icon instanceof ImageIcon)
/* 377 */             scaledImageIcon = new ScaledImageIcon((ImageIcon)icon); 
/* 378 */           cacheIcon(f, (Icon)scaledImageIcon);
/* 379 */           return (Icon)scaledImageIcon;
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 384 */       icon = super.getIcon(f);
/*     */       
/* 386 */       if (icon instanceof ImageIcon) {
/* 387 */         scaledImageIcon = new ScaledImageIcon((ImageIcon)icon);
/* 388 */         cacheIcon(f, (Icon)scaledImageIcon);
/*     */       } 
/*     */       
/* 391 */       return (Icon)scaledImageIcon;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class FlatShortcutsPanel
/*     */     extends JToolBar
/*     */     implements PropertyChangeListener
/*     */   {
/*     */     private final JFileChooser fc;
/*     */     
/*     */     private final Dimension buttonSize;
/*     */     
/*     */     private final Dimension iconSize;
/*     */     
/*     */     private final Function<File[], File[]> filesFunction;
/*     */     
/*     */     private final Function<File, String> displayNameFunction;
/*     */     private final Function<File, Icon> iconFunction;
/*     */     protected final File[] files;
/*     */     protected final JToggleButton[] buttons;
/* 412 */     protected final ButtonGroup buttonGroup = new ButtonGroup();
/*     */ 
/*     */     
/*     */     public FlatShortcutsPanel(JFileChooser fc) {
/* 416 */       super(1);
/* 417 */       this.fc = fc;
/* 418 */       setFloatable(false);
/*     */       
/* 420 */       this.buttonSize = UIScale.scale(getUIDimension("FileChooser.shortcuts.buttonSize", 84, 64));
/* 421 */       this.iconSize = getUIDimension("FileChooser.shortcuts.iconSize", 32, 32);
/*     */       
/* 423 */       this.filesFunction = (Function<File[], File[]>)UIManager.get("FileChooser.shortcuts.filesFunction");
/* 424 */       this.displayNameFunction = (Function<File, String>)UIManager.get("FileChooser.shortcuts.displayNameFunction");
/* 425 */       this.iconFunction = (Function<File, Icon>)UIManager.get("FileChooser.shortcuts.iconFunction");
/*     */       
/* 427 */       FileSystemView fsv = fc.getFileSystemView();
/* 428 */       File[] files = getChooserShortcutPanelFiles(fsv);
/* 429 */       if (this.filesFunction != null) {
/* 430 */         files = this.filesFunction.apply(files);
/*     */       }
/*     */       
/* 433 */       ArrayList<File> filesList = new ArrayList<>();
/* 434 */       ArrayList<JToggleButton> buttonsList = new ArrayList<>();
/* 435 */       for (File file : files) {
/* 436 */         if (file != null) {
/*     */ 
/*     */ 
/*     */           
/* 440 */           if (fsv.isFileSystemRoot(file)) {
/* 441 */             file = fsv.createFileObject(file.getAbsolutePath());
/*     */           }
/* 443 */           String name = getDisplayName(fsv, file);
/* 444 */           Icon icon = getIcon(fsv, file);
/* 445 */           if (name != null) {
/*     */             ScaledImageIcon scaledImageIcon;
/*     */             
/*     */             FlatFileChooserUI.ShortcutIcon shortcutIcon;
/* 449 */             int lastSepIndex = name.lastIndexOf(File.separatorChar);
/* 450 */             if (lastSepIndex >= 0 && lastSepIndex < name.length() - 1) {
/* 451 */               name = name.substring(lastSepIndex + 1);
/*     */             }
/*     */             
/* 454 */             if (icon instanceof ImageIcon) {
/* 455 */               scaledImageIcon = new ScaledImageIcon((ImageIcon)icon, this.iconSize.width, this.iconSize.height);
/* 456 */             } else if (scaledImageIcon != null) {
/* 457 */               shortcutIcon = new FlatFileChooserUI.ShortcutIcon((Icon)scaledImageIcon, this.iconSize.width, this.iconSize.height);
/*     */             } 
/*     */             
/* 460 */             JToggleButton button = createButton(name, shortcutIcon);
/* 461 */             File f = file;
/* 462 */             button.addActionListener(e -> fc.setCurrentDirectory(f));
/*     */ 
/*     */ 
/*     */             
/* 466 */             add(button);
/* 467 */             this.buttonGroup.add(button);
/*     */             
/* 469 */             filesList.add(file);
/* 470 */             buttonsList.add(button);
/*     */           } 
/*     */         } 
/* 473 */       }  this.files = filesList.<File>toArray(new File[filesList.size()]);
/* 474 */       this.buttons = buttonsList.<JToggleButton>toArray(new JToggleButton[buttonsList.size()]);
/*     */       
/* 476 */       directoryChanged(fc.getCurrentDirectory());
/*     */     }
/*     */     
/*     */     private Dimension getUIDimension(String key, int defaultWidth, int defaultHeight) {
/* 480 */       Dimension size = UIManager.getDimension(key);
/* 481 */       if (size == null)
/* 482 */         size = new Dimension(defaultWidth, defaultHeight); 
/* 483 */       return size;
/*     */     }
/*     */     
/*     */     protected JToggleButton createButton(String name, Icon icon) {
/* 487 */       JToggleButton button = new JToggleButton(name, icon);
/* 488 */       button.setVerticalTextPosition(3);
/* 489 */       button.setHorizontalTextPosition(0);
/* 490 */       button.setAlignmentX(0.5F);
/* 491 */       button.setIconTextGap(0);
/* 492 */       button.setPreferredSize(this.buttonSize);
/* 493 */       button.setMaximumSize(this.buttonSize);
/* 494 */       return button;
/*     */     }
/*     */     
/*     */     protected File[] getChooserShortcutPanelFiles(FileSystemView fsv) {
/*     */       try {
/* 499 */         if (SystemInfo.isJava_12_orLater) {
/* 500 */           Method m = fsv.getClass().getMethod("getChooserShortcutPanelFiles", new Class[0]);
/* 501 */           File[] files = (File[])m.invoke(fsv, new Object[0]);
/*     */ 
/*     */           
/* 504 */           if (files.length == 1 && files[0].equals(new File(System.getProperty("user.home")))) {
/* 505 */             files = new File[0];
/*     */           }
/* 507 */           return files;
/* 508 */         }  if (SystemInfo.isWindows) {
/* 509 */           Class<?> cls = Class.forName("sun.awt.shell.ShellFolder");
/* 510 */           Method m = cls.getMethod("get", new Class[] { String.class });
/* 511 */           return (File[])m.invoke(null, new Object[] { "fileChooserShortcutPanelFolders" });
/*     */         } 
/* 513 */       } catch (IllegalAccessException illegalAccessException) {
/*     */       
/* 515 */       } catch (Exception ex) {
/* 516 */         LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */       } 
/*     */ 
/*     */       
/* 520 */       return new File[0];
/*     */     }
/*     */     
/*     */     protected String getDisplayName(FileSystemView fsv, File file) {
/* 524 */       if (this.displayNameFunction != null) {
/* 525 */         String name = this.displayNameFunction.apply(file);
/* 526 */         if (name != null) {
/* 527 */           return name;
/*     */         }
/*     */       } 
/* 530 */       return fsv.getSystemDisplayName(file);
/*     */     }
/*     */     
/*     */     protected Icon getIcon(FileSystemView fsv, File file) {
/* 534 */       if (this.iconFunction != null) {
/* 535 */         Icon icon = this.iconFunction.apply(file);
/* 536 */         if (icon != null) {
/* 537 */           return icon;
/*     */         }
/*     */       } 
/* 540 */       if (FlatFileChooserUI.doNotUseSystemIcons()) {
/* 541 */         return (Icon)new FlatFileViewDirectoryIcon();
/*     */       }
/*     */       
/*     */       try {
/* 545 */         if (SystemInfo.isJava_17_orLater) {
/* 546 */           Method m = fsv.getClass().getMethod("getSystemIcon", new Class[] { File.class, int.class, int.class });
/* 547 */           return (Icon)m.invoke(fsv, new Object[] { file, Integer.valueOf(this.iconSize.width), Integer.valueOf(this.iconSize.height) });
/* 548 */         }  if (this.iconSize.width > 16 || this.iconSize.height > 16) {
/* 549 */           Class<?> cls = Class.forName("sun.awt.shell.ShellFolder");
/* 550 */           if (cls.isInstance(file)) {
/* 551 */             Method m = file.getClass().getMethod("getIcon", new Class[] { boolean.class });
/* 552 */             m.setAccessible(true);
/* 553 */             Image image = (Image)m.invoke(file, new Object[] { Boolean.valueOf(true) });
/* 554 */             if (image != null)
/* 555 */               return new ImageIcon(image); 
/*     */           } 
/*     */         } 
/* 558 */       } catch (Exception ex) {
/*     */ 
/*     */ 
/*     */         
/* 562 */         if (!"java.lang.reflect.InaccessibleObjectException".equals(ex.getClass().getName())) {
/* 563 */           LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */         }
/*     */       } 
/*     */       
/* 567 */       return fsv.getSystemIcon(file);
/*     */     }
/*     */     
/*     */     protected void directoryChanged(File file) {
/* 571 */       if (file != null) {
/* 572 */         String absolutePath = file.getAbsolutePath();
/* 573 */         for (int i = 0; i < this.files.length; i++) {
/*     */ 
/*     */           
/* 576 */           if (this.files[i].equals(file) || this.files[i].getAbsolutePath().equals(absolutePath)) {
/* 577 */             this.buttons[i].setSelected(true);
/*     */             
/*     */             return;
/*     */           } 
/*     */         } 
/*     */       } 
/* 583 */       this.buttonGroup.clearSelection();
/*     */     }
/*     */ 
/*     */     
/*     */     public void propertyChange(PropertyChangeEvent e) {
/* 588 */       switch (e.getPropertyName()) {
/*     */         case "directoryChanged":
/* 590 */           directoryChanged(this.fc.getCurrentDirectory());
/*     */           break;
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static class ShortcutIcon
/*     */     implements Icon
/*     */   {
/*     */     private final Icon icon;
/*     */     
/*     */     private final int iconWidth;
/*     */     private final int iconHeight;
/*     */     
/*     */     ShortcutIcon(Icon icon, int iconWidth, int iconHeight) {
/* 606 */       this.icon = icon;
/* 607 */       this.iconWidth = iconWidth;
/* 608 */       this.iconHeight = iconHeight;
/*     */     }
/*     */ 
/*     */     
/*     */     public void paintIcon(Component c, Graphics g, int x, int y) {
/* 613 */       Graphics2D g2 = (Graphics2D)g.create();
/*     */       
/*     */       try {
/* 616 */         g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
/*     */         
/* 618 */         double scale = getIconWidth() / this.icon.getIconWidth();
/* 619 */         g2.translate(x, y);
/* 620 */         g2.scale(scale, scale);
/*     */         
/* 622 */         this.icon.paintIcon(c, g2, 0, 0);
/*     */       } finally {
/* 624 */         g2.dispose();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public int getIconWidth() {
/* 630 */       return UIScale.scale(this.iconWidth);
/*     */     }
/*     */ 
/*     */     
/*     */     public int getIconHeight() {
/* 635 */       return UIScale.scale(this.iconHeight);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatFileChooserUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */