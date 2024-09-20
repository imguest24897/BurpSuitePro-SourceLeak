/*     */ package com.install4j.runtime.filechooser.swingdirectory;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.util.ButtonBoxLayout;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Component;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.Point;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.io.File;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import javax.swing.AbstractAction;
/*     */ import javax.swing.Action;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JFileChooser;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JPopupMenu;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTree;
/*     */ import javax.swing.event.TreeExpansionEvent;
/*     */ import javax.swing.filechooser.FileSystemView;
/*     */ import javax.swing.plaf.basic.BasicFileChooserUI;
/*     */ import javax.swing.tree.DefaultMutableTreeNode;
/*     */ import javax.swing.tree.DefaultTreeModel;
/*     */ import javax.swing.tree.TreePath;
/*     */ 
/*     */ class JDirectoryChooserUI extends BasicFileChooserUI {
/*  37 */   private static final Icon ICON_NEW_16 = IconHelper.loadIcon("folder_new_16.png");
/*  38 */   private static final boolean MANUAL = Boolean.getBoolean("manualDirectoryChooser");
/*     */   
/*     */   private static final String NA = "not available";
/*     */   
/*     */   private static TreeModel fileSystemTreeModel;
/*     */   private JDirectoryChooser chooser;
/*     */   private JTree tree;
/*     */   private JScrollPane treeScroll;
/*     */   private JButton approveButton;
/*     */   private JButton cancelButton;
/*     */   private JButton newFolderButton;
/*     */   private JPanel buttonPanel;
/*  50 */   private BasicFileChooserUI.BasicFileView fileView = new CommonFileView();
/*  51 */   private Action approveSelectionAction = new ApproveSelectionAction();
/*  52 */   private Action newFolderAction = new NewFolderAction();
/*     */   
/*     */   private boolean inSelectionChanged;
/*     */   
/*     */   private JPopupMenu popupMenu;
/*     */   
/*     */   public JDirectoryChooserUI(JDirectoryChooser chooser) {
/*  59 */     super((JFileChooser)chooser);
/*     */   }
/*     */ 
/*     */   
/*     */   public void rescanCurrentDirectory(JFileChooser fc) {
/*  64 */     super.rescanCurrentDirectory(fc);
/*  65 */     findFile((this.chooser.getSelectedFile() == null) ? this.chooser.getCurrentDirectory() : this.chooser.getSelectedFile(), true, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void ensureFileIsVisible(JFileChooser fc, File f) {
/*  70 */     super.ensureFileIsVisible(fc, f);
/*  71 */     findFile(f, false, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void installComponents(JFileChooser chooser) {
/*  76 */     this.chooser = (JDirectoryChooser)chooser;
/*     */     
/*  78 */     chooser.setLayout(new BorderLayout(8, 0));
/*  79 */     chooser.setFileSelectionMode(1);
/*     */     
/*  81 */     Component accessory = chooser.getAccessory();
/*  82 */     if (accessory != null) {
/*  83 */       chooser.add("First", chooser.getAccessory());
/*     */     }
/*     */     
/*  86 */     this.tree = new JTree();
/*  87 */     this.tree.setRowHeight(18);
/*  88 */     this.tree.addTreeExpansionListener(new TreeExpansion());
/*     */     
/*  90 */     if (fileSystemTreeModel == null) {
/*  91 */       fileSystemTreeModel = new FileSystemTreeModel(chooser.getFileSystemView());
/*     */     }
/*  93 */     this.tree.setModel(fileSystemTreeModel);
/*  94 */     this.tree.setRootVisible(false);
/*  95 */     this.tree.setCellRenderer(new FileSystemTreeRenderer());
/*  96 */     this.tree.addMouseListener(new TreeMouseListener());
/*  97 */     FileDrop.addTo(this.tree, file -> {
/*     */           if (!file.isDirectory()) {
/*     */             file = file.getParentFile();
/*     */           }
/*     */           
/*     */           findFile(file, true, false);
/*     */         });
/* 104 */     chooser.add("Center", this.treeScroll = new JScrollPane(this.tree));
/* 105 */     this.treeScroll.setPreferredSize(new Dimension(300, 300));
/*     */     
/* 107 */     this.approveButton = createButton();
/* 108 */     this.approveButton.setName("ok");
/* 109 */     this.approveButton.setAction(getApproveSelectionAction());
/*     */     
/* 111 */     this.cancelButton = createButton();
/* 112 */     this.cancelButton.addActionListener(getCancelSelectionAction());
/* 113 */     this.cancelButton.setName("cancel");
/*     */     
/* 115 */     this.buttonPanel = new JPanel(new BorderLayout());
/* 116 */     GUIHelper.setEmptyBorder(this.buttonPanel, 8, 0, 0, 0);
/*     */     
/* 118 */     JPanel rightButtonPanel = new JPanel((LayoutManager)new ButtonBoxLayout(6));
/* 119 */     rightButtonPanel.add(this.approveButton);
/* 120 */     rightButtonPanel.add(this.cancelButton);
/*     */     
/* 122 */     this.newFolderButton = new JButton(this.newFolderAction);
/* 123 */     this.newFolderButton.setIcon((Icon)null);
/* 124 */     JPanel leftButtonPanel = new JPanel((LayoutManager)new ButtonBoxLayout(6));
/* 125 */     if (this.chooser.isAllowFolderCreation()) {
/* 126 */       leftButtonPanel.add(this.newFolderButton);
/*     */     }
/*     */     
/* 129 */     this.buttonPanel.add(leftButtonPanel, "Before");
/* 130 */     this.buttonPanel.add(rightButtonPanel, "After");
/* 131 */     chooser.add("Last", this.buttonPanel);
/*     */ 
/*     */     
/* 134 */     updateView();
/* 135 */     initMultiSelection();
/*     */   }
/*     */   
/*     */   private JComponent getLowerAccessory() {
/* 139 */     return this.chooser.getLowerAccessory();
/*     */   }
/*     */   
/*     */   private JButton createButton() {
/* 143 */     return new JButton();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installStrings(JFileChooser fc) {
/* 148 */     super.installStrings(fc);
/*     */     
/* 150 */     this.saveButtonToolTipText = null;
/* 151 */     this.openButtonToolTipText = null;
/* 152 */     this.cancelButtonToolTipText = null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void uninstallComponents(JFileChooser chooser) {
/* 157 */     chooser.remove(this.treeScroll);
/* 158 */     chooser.remove(this.buttonPanel);
/*     */   }
/*     */ 
/*     */   
/*     */   public FileView getFileView(JFileChooser fc) {
/* 163 */     return this.fileView;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installListeners(JFileChooser fc) {
/* 168 */     super.installListeners(fc);
/*     */     
/* 170 */     this.tree.addTreeSelectionListener(new SelectionListener());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallListeners(JFileChooser fc) {
/* 175 */     super.uninstallListeners(fc);
/*     */   }
/*     */ 
/*     */   
/*     */   public PropertyChangeListener createPropertyChangeListener(JFileChooser fc) {
/* 180 */     return new ChangeListener();
/*     */   }
/*     */   
/*     */   private void updateView() {
/* 184 */     if (this.chooser.getApproveButtonText() != null) {
/* 185 */       this.approveButton.setText(this.chooser.getApproveButtonText());
/* 186 */       this.approveButton.setMnemonic(this.chooser.getApproveButtonMnemonic());
/*     */     }
/* 188 */     else if (0 == this.chooser.getDialogType()) {
/* 189 */       this.approveButton.setText(this.openButtonText);
/* 190 */       this.approveButton.setToolTipText(this.openButtonToolTipText);
/* 191 */       this.approveButton.setMnemonic(this.openButtonMnemonic);
/*     */     } else {
/* 193 */       this.approveButton.setText(this.saveButtonText);
/* 194 */       this.approveButton.setToolTipText(this.saveButtonToolTipText);
/* 195 */       this.approveButton.setMnemonic(this.saveButtonMnemonic);
/*     */     } 
/*     */ 
/*     */     
/* 199 */     if (this.chooser.getCancelButtonText() != null) {
/* 200 */       this.cancelButtonText = this.chooser.getCancelButtonText();
/* 201 */       this.cancelButtonMnemonic = 0;
/*     */     } 
/* 203 */     this.cancelButton.setText(this.cancelButtonText);
/* 204 */     this.cancelButton.setMnemonic(this.cancelButtonMnemonic);
/*     */     
/* 206 */     JComponent lowerAccessory = getLowerAccessory();
/* 207 */     if (lowerAccessory != null) {
/* 208 */       lowerAccessory.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
/*     */       
/* 210 */       this.buttonPanel.add(lowerAccessory, "First");
/*     */     } 
/* 212 */     this.buttonPanel.setVisible(this.chooser.getControlButtonsAreShown());
/*     */   }
/*     */ 
/*     */   
/*     */   private void findFile(File fileToLocate, boolean selectFile, boolean reload) {
/* 217 */     if (fileToLocate == null || !fileToLocate.isDirectory()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*     */     try {
/* 223 */       file = fileToLocate.getCanonicalFile();
/* 224 */     } catch (Exception e) {
/*     */       return;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 230 */     List<File> files = new ArrayList<>();
/* 231 */     files.add(file); File file;
/* 232 */     while ((file = this.chooser.getFileSystemView().getParentDirectory(file)) != null) {
/* 233 */       files.add(0, file);
/*     */     }
/*     */     
/* 236 */     List<DefaultMutableTreeNode> path = new ArrayList<>();
/*     */ 
/*     */     
/* 239 */     DefaultMutableTreeNode node = (DefaultMutableTreeNode)this.tree.getModel().getRoot();
/* 240 */     path.add(node);
/*     */ 
/*     */ 
/*     */     
/* 244 */     boolean found = true;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 249 */     while (files.size() > 0 && found) {
/* 250 */       found = false;
/* 251 */       for (int i = 0, c = node.getChildCount(); i < c; i++) {
/* 252 */         DefaultMutableTreeNode current = (DefaultMutableTreeNode)node.getChildAt(i);
/* 253 */         File f = ((FileTreeNode)current).getFile();
/* 254 */         if (Objects.equals(files.get(0), f)) {
/* 255 */           path.add(current);
/* 256 */           files.remove(0);
/* 257 */           node = current;
/* 258 */           found = true;
/*     */ 
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 266 */     TreePath pathToSelect = new TreePath(path.toArray());
/* 267 */     if (pathToSelect.getLastPathComponent() instanceof FileTreeNode && reload) {
/* 268 */       ((FileTreeNode)pathToSelect.getLastPathComponent()).clear();
/*     */     }
/*     */     
/* 271 */     if (selectFile) {
/* 272 */       this.tree.expandPath(pathToSelect);
/* 273 */       this.tree.setSelectionPath(pathToSelect);
/*     */     } 
/*     */     
/* 276 */     scrollToPath(pathToSelect);
/*     */   }
/*     */   
/*     */   private void scrollToPath(TreePath path) {
/* 280 */     if (!this.tree.isVisible(path)) {
/* 281 */       int scrollHeight = (this.inSelectionChanged && this.chooser.isDialogVisible()) ? this.tree.getRowHeight() : 100;
/* 282 */       SwingUtilities.invokeLater(() -> {
/*     */             Rectangle pathBounds = this.tree.getPathBounds(path);
/*     */             if (pathBounds != null) {
/*     */               pathBounds.height = scrollHeight;
/*     */               this.tree.scrollRectToVisible(pathBounds);
/*     */             } 
/*     */           });
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void focusTree() {
/* 294 */     this.tree.requestFocus();
/*     */   }
/*     */   
/*     */   private boolean getBooleanFileMethodValue(Method fileMethod, File file) {
/* 298 */     Boolean result = (Boolean)getFileMethodValue(fileMethod, file);
/* 299 */     if (result != null) {
/* 300 */       return result.booleanValue();
/*     */     }
/* 302 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getFileMethodValue(Method fileMethod, File file) {
/* 308 */     if (fileMethod != null) {
/*     */       try {
/* 310 */         return fileMethod.invoke(this.chooser.getFileSystemView(), new Object[] { file });
/* 311 */       } catch (Exception e) {
/* 312 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*     */     
/* 316 */     return null;
/*     */   }
/*     */   
/*     */   public void scrollToSelection() {
/* 320 */     TreePath path = this.tree.getSelectionPath();
/* 321 */     if (path != null) {
/* 322 */       scrollToPath(path);
/*     */     }
/*     */   }
/*     */   
/*     */   private void initMultiSelection() {
/* 327 */     if (this.chooser.isMultiSelectionEnabled()) {
/* 328 */       this.tree.getSelectionModel().setSelectionMode(4);
/*     */     } else {
/* 330 */       this.tree.getSelectionModel().setSelectionMode(1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private class ChangeListener implements PropertyChangeListener {
/*     */     private ChangeListener() {}
/*     */     
/*     */     public void propertyChange(PropertyChangeEvent evt) {
/* 338 */       if (Objects.equals("ApproveButtonTextChangedProperty", evt.getPropertyName()) || 
/* 339 */         Objects.equals("lowerAccessory", evt.getPropertyName())) {
/* 340 */         JDirectoryChooserUI.this.updateView();
/*     */       }
/*     */       
/* 343 */       if (Objects.equals("MultiSelectionEnabledChangedProperty", evt.getPropertyName())) {
/* 344 */         JDirectoryChooserUI.this.initMultiSelection();
/*     */       }
/*     */       
/* 347 */       if (Objects.equals("directoryChanged", evt.getPropertyName())) {
/* 348 */         JDirectoryChooserUI.this.findFile(JDirectoryChooserUI.this.chooser.getCurrentDirectory(), false, false);
/*     */       }
/*     */       
/* 351 */       if (Objects.equals("AccessoryChangedProperty", evt.getPropertyName())) {
/* 352 */         Component oldValue = (Component)evt.getOldValue();
/* 353 */         Component newValue = (Component)evt.getNewValue();
/* 354 */         if (oldValue != null) {
/* 355 */           JDirectoryChooserUI.this.chooser.remove(oldValue);
/*     */         }
/* 357 */         if (newValue != null) {
/* 358 */           JDirectoryChooserUI.this.chooser.add("First", newValue);
/*     */         }
/* 360 */         JDirectoryChooserUI.this.chooser.revalidate();
/* 361 */         JDirectoryChooserUI.this.chooser.repaint();
/*     */       } 
/*     */       
/* 364 */       if (Objects.equals("ControlButtonsAreShownChangedProperty", evt.getPropertyName()))
/* 365 */         JDirectoryChooserUI.this.updateView(); 
/*     */     }
/*     */   }
/*     */   
/*     */   private class SelectionListener
/*     */     implements TreeSelectionListener {
/*     */     private SelectionListener() {}
/*     */     
/*     */     public void valueChanged(TreeSelectionEvent e) {
/* 374 */       boolean directorySelected = isDirectorySelected();
/* 375 */       JDirectoryChooserUI.this.getApproveSelectionAction().setEnabled(directorySelected);
/* 376 */       JDirectoryChooserUI.this.newFolderAction.setEnabled(directorySelected);
/* 377 */       JDirectoryChooserUI.this.inSelectionChanged = true;
/*     */       try {
/* 379 */         JDirectoryChooserUI.this.setSelectedFiles();
/*     */       } finally {
/* 381 */         JDirectoryChooserUI.this.inSelectionChanged = false;
/*     */       } 
/*     */     }
/*     */     
/*     */     private boolean isDirectorySelected() {
/* 386 */       if (JDirectoryChooserUI.this.tree.getSelectionCount() > 0) {
/* 387 */         TreePath[] selectionPaths = JDirectoryChooserUI.this.tree.getSelectionPaths();
/* 388 */         assert selectionPaths != null;
/* 389 */         Object node = selectionPaths[0].getLastPathComponent();
/* 390 */         if (node instanceof JDirectoryChooserUI.FileTreeNode && ((JDirectoryChooserUI.FileTreeNode)node).getFile().isDirectory()) {
/* 391 */           return true;
/*     */         }
/*     */       } 
/* 394 */       return false;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public Action getApproveSelectionAction() {
/* 400 */     return this.approveSelectionAction;
/*     */   }
/*     */   
/*     */   private void setSelectedFiles() {
/* 404 */     TreePath[] selectedPaths = this.tree.getSelectionPaths();
/* 405 */     if (selectedPaths == null || selectedPaths.length == 0) {
/* 406 */       this.chooser.setSelectedFile(null);
/*     */       
/*     */       return;
/*     */     } 
/* 410 */     List<File> files = new ArrayList<>();
/* 411 */     for (TreePath selectedPath : selectedPaths) {
/* 412 */       LazyMutableTreeNode node = (LazyMutableTreeNode)selectedPath.getLastPathComponent();
/* 413 */       if (node instanceof FileTreeNode) {
/* 414 */         File f = ((FileTreeNode)node).getFile();
/* 415 */         files.add(f);
/*     */       } 
/*     */     } 
/* 418 */     this.chooser.setSelectedFiles(files.<File>toArray(new File[0]));
/*     */   }
/*     */   
/*     */   public void newFolderButtonClicked() {
/* 422 */     TreePath[] paths = this.tree.getSelectionPaths();
/* 423 */     List<File> selection = getSelectedFolders(paths);
/* 424 */     if (selection.size() != 1) {
/*     */       return;
/*     */     }
/*     */     
/* 428 */     File parent = selection.get(0);
/*     */     
/*     */     String folderName;
/*     */     do {
/* 432 */       folderName = JOptionPane.showInputDialog((Component)this.chooser, MANUAL ? "not available" : Messages.getString(".DirectoryChooserLabel"), 
/* 433 */           MANUAL ? "not available" : Messages.getString(".DirectoryChooserTitle"), 3);
/*     */     }
/* 435 */     while (folderName != null && (folderName = checkFolderEmpty(folderName)).length() == 0);
/*     */     
/* 437 */     if (folderName != null) {
/* 438 */       File newFolder = new File(parent, folderName);
/* 439 */       boolean success = newFolder.mkdir();
/*     */       
/* 441 */       assert paths != null;
/* 442 */       TreePath parentPath = paths[0];
/* 443 */       boolean isExpanded = this.tree.isExpanded(parentPath);
/* 444 */       if (!isExpanded) {
/* 445 */         this.tree.expandPath(parentPath);
/*     */       }
/*     */       
/* 448 */       LazyMutableTreeNode parentTreeNode = (LazyMutableTreeNode)parentPath.getLastPathComponent();
/* 449 */       FileTreeNode child = createFileTreeNode(newFolder);
/* 450 */       if (success) {
/* 451 */         parentTreeNode.clear();
/* 452 */         int insertIndex = this.tree.getModel().getIndexOfChild(parentTreeNode, child);
/* 453 */         if (insertIndex != -1) {
/* 454 */           ((FileSystemTreeModel)this.tree.getModel()).nodeStructureChanged(parentTreeNode);
/*     */         }
/*     */       } 
/* 457 */       TreePath newPath = parentPath.pathByAddingChild(child);
/* 458 */       this.tree.setSelectionPath(newPath);
/* 459 */       this.tree.scrollPathToVisible(newPath);
/*     */     } 
/*     */   }
/*     */   
/*     */   private String checkFolderEmpty(String folderName) {
/* 464 */     folderName = folderName.trim();
/* 465 */     if (folderName.length() == 0) {
/* 466 */       Util.showMessage(MANUAL ? "not available" : Messages.getString(".MustEnterGroupName"), 2);
/*     */     }
/* 468 */     return folderName;
/*     */   }
/*     */   
/*     */   private FileTreeNode createFileTreeNode(File file) {
/* 472 */     return new FileTreeNode(file);
/*     */   }
/*     */   
/*     */   private List<File> getSelectedFolders(TreePath[] paths) {
/* 476 */     if (paths == null || paths.length == 0) {
/* 477 */       return new ArrayList<>();
/*     */     }
/* 479 */     List<File> folders = new ArrayList<>(paths.length);
/* 480 */     for (TreePath path : paths) {
/* 481 */       FileTreeNode f = (FileTreeNode)path.getLastPathComponent();
/* 482 */       folders.add(f.getFile());
/*     */     } 
/* 484 */     return folders;
/*     */   }
/*     */   
/*     */   private class ApproveSelectionAction extends AbstractAction {
/*     */     public ApproveSelectionAction() {
/* 489 */       setEnabled(false);
/*     */     }
/*     */ 
/*     */     
/*     */     public void actionPerformed(ActionEvent e) {
/* 494 */       JDirectoryChooserUI.this.setSelectedFiles();
/* 495 */       JDirectoryChooserUI.this.chooser.approveSelection();
/*     */     }
/*     */   }
/*     */   
/*     */   private class NewFolderAction extends AbstractAction {
/*     */     public NewFolderAction() {
/* 501 */       setEnabled(false);
/* 502 */       putValue("Name", JDirectoryChooserUI.MANUAL ? "not available" : Messages.getString(".DirectoryChooserTooltip"));
/* 503 */       putValue("SmallIcon", JDirectoryChooserUI.ICON_NEW_16);
/*     */     }
/*     */     
/*     */     public void actionPerformed(ActionEvent e) {
/* 507 */       JDirectoryChooserUI.this.newFolderButtonClicked();
/*     */     } }
/*     */   
/*     */   private class TreeExpansion implements TreeExpansionListener {
/*     */     private TreeExpansion() {}
/*     */     
/*     */     public void treeCollapsed(TreeExpansionEvent event) {
/* 514 */       if (event.getPath() != null) {
/* 515 */         Object lastElement = event.getPath().getLastPathComponent();
/* 516 */         if (lastElement instanceof JDirectoryChooserUI.FileTreeNode) {
/* 517 */           JDirectoryChooserUI.FileTreeNode node = (JDirectoryChooserUI.FileTreeNode)lastElement;
/* 518 */           node.clear();
/* 519 */           ((JDirectoryChooserUI.FileSystemTreeModel)JDirectoryChooserUI.this.tree.getModel()).nodeStructureChanged(node);
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     public void treeExpanded(TreeExpansionEvent event) {}
/*     */   }
/*     */   
/*     */   private class FileSystemTreeRenderer
/*     */     extends DefaultTreeCellRenderer {
/*     */     private FileSystemTreeRenderer() {}
/*     */     
/*     */     public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
/* 532 */       super.getTreeCellRendererComponent(tree, value, sel, expanded, false, row, UiUtil.getLookAndFeelEnhancer().isWideTreeSelection() ? false : hasFocus);
/*     */       
/* 534 */       if (value instanceof JDirectoryChooserUI.FileTreeNode) {
/* 535 */         JDirectoryChooserUI.FileTreeNode node = (JDirectoryChooserUI.FileTreeNode)value;
/* 536 */         setText(JDirectoryChooserUI.this.getFileView((JFileChooser)JDirectoryChooserUI.this.chooser).getName(node.getFile()));
/* 537 */         if (!InstallerUtil.isMacOS() || !UIManager.getLookAndFeel().isNativeLookAndFeel()) {
/* 538 */           setIcon(JDirectoryChooserUI.this.getFileView((JFileChooser)JDirectoryChooserUI.this.chooser).getIcon(node.getFile()));
/*     */         }
/*     */       } 
/*     */       
/* 542 */       return this;
/*     */     }
/*     */   }
/*     */   
/*     */   private class FileSystemTreeModel extends DefaultTreeModel {
/*     */     public FileSystemTreeModel(FileSystemView fsv) {
/* 548 */       super(new DefaultMutableTreeNode());
/* 549 */       setRoot(new JDirectoryChooserUI.MyComputerTreeNode(fsv));
/* 550 */       setAsksAllowsChildren(false);
/*     */     }
/*     */   }
/*     */   
/*     */   private class MyComputerTreeNode extends LazyMutableTreeNode {
/*     */     public MyComputerTreeNode(FileSystemView fsv) {
/* 556 */       super(fsv);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void loadChildren() {
/* 561 */       FileSystemView fsv = (FileSystemView)getUserObject();
/* 562 */       File[] roots = fsv.getRoots();
/* 563 */       if (roots != null) {
/* 564 */         Arrays.sort((Object[])roots);
/* 565 */         for (File root : roots) {
/* 566 */           add(JDirectoryChooserUI.this.createFileTreeNode(root));
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 573 */       return "/";
/*     */     }
/*     */   }
/*     */   
/*     */   private class FileTreeNode
/*     */     extends LazyMutableTreeNode implements Comparable {
/*     */     private FileTreeNode(File file) {
/* 580 */       super(file);
/*     */     }
/*     */     
/*     */     public boolean canEnqueue() {
/* 584 */       return (!isLoaded() && 
/* 585 */         !isFloppyDrive() && 
/* 586 */         !isFileSystemRoot());
/*     */     }
/*     */     
/*     */     private boolean isFileSystemRoot() {
/* 590 */       return JDirectoryChooserUI.this.chooser.getFileSystemView().isFileSystemRoot(getFile());
/*     */     }
/*     */     
/*     */     private boolean isFloppyDrive() {
/* 594 */       return JDirectoryChooserUI.this.chooser.getFileSystemView().isFloppyDrive(getFile());
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isLeaf() {
/* 599 */       return (isLoaded() && super.isLeaf());
/*     */     }
/*     */ 
/*     */     
/*     */     protected void loadChildren() {
/* 604 */       FileTreeNode[] nodes = getChildren();
/* 605 */       for (FileTreeNode node : nodes) {
/* 606 */         add(node);
/*     */       }
/*     */     }
/*     */     
/*     */     private FileTreeNode[] getChildren() {
/* 611 */       File[] files = null;
/*     */       try {
/* 613 */         files = JDirectoryChooserUI.this.chooser.getFileSystemView().getFiles(getFile(), JDirectoryChooserUI.this.chooser.isFileHidingEnabled());
/* 614 */       } catch (Throwable e) {
/* 615 */         e.printStackTrace();
/*     */       } 
/* 617 */       ArrayList<FileTreeNode> nodes = new ArrayList<>();
/*     */       
/* 619 */       if (files != null) {
/* 620 */         for (File file : files) {
/* 621 */           if (!InstallerUtil.isWindows() || !file.getName().endsWith(".lnk"))
/*     */           {
/*     */             
/* 624 */             if (file.isDirectory()) {
/* 625 */               nodes.add(JDirectoryChooserUI.this.createFileTreeNode(file));
/*     */             }
/*     */           }
/*     */         } 
/*     */       }
/* 630 */       FileTreeNode[] result = nodes.<FileTreeNode>toArray(new FileTreeNode[0]);
/* 631 */       Arrays.sort((Object[])result);
/* 632 */       return result;
/*     */     }
/*     */     
/*     */     public File getFile() {
/* 636 */       return (File)getUserObject();
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 641 */       String name = JDirectoryChooserUI.this.chooser.getFileSystemView().getSystemDisplayName((File)getUserObject());
/* 642 */       if (name != null) {
/* 643 */         return name;
/*     */       }
/* 645 */       return super.toString();
/*     */     }
/*     */ 
/*     */     
/*     */     public String getSortKey() {
/* 650 */       File file = (File)getUserObject();
/* 651 */       FileSystemView fileSystemView = JDirectoryChooserUI.this.chooser.getFileSystemView();
/* 652 */       if (fileSystemView.isDrive(file)) {
/* 653 */         return file.getName();
/*     */       }
/* 655 */       return fileSystemView.getSystemDisplayName((File)getUserObject());
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int compareTo(@NotNull Object o) {
/* 661 */       if (!(o instanceof FileTreeNode)) {
/* 662 */         return 1;
/*     */       }
/* 664 */       return getSortKey().compareToIgnoreCase(((FileTreeNode)o).getSortKey());
/*     */     }
/*     */ 
/*     */     
/*     */     public void clear() {
/* 669 */       super.clear();
/* 670 */       ((DefaultTreeModel)JDirectoryChooserUI.this.tree.getModel()).nodeStructureChanged(this);
/*     */     }
/*     */   }
/*     */   
/*     */   protected class CommonFileView
/*     */     extends BasicFileChooserUI.BasicFileView {
/*     */     public Icon getIcon(File f) {
/* 677 */       Icon icon = getCachedIcon(f);
/* 678 */       if (icon != null) {
/* 679 */         return icon;
/*     */       }
/* 681 */       if (f != null) {
/* 682 */         icon = JDirectoryChooserUI.this.chooser.getFileSystemView().getSystemIcon(f);
/*     */       }
/* 684 */       if (icon == null) {
/* 685 */         icon = super.getIcon(f);
/*     */       }
/* 687 */       cacheIcon(f, icon);
/* 688 */       return icon;
/*     */     } }
/*     */   
/*     */   private class TreeMouseListener implements MouseListener {
/*     */     private TreeMouseListener() {}
/*     */     
/*     */     public void mouseClicked(MouseEvent e) {
/* 695 */       popup(e);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void mouseEntered(MouseEvent e) {}
/*     */ 
/*     */ 
/*     */     
/*     */     public void mouseExited(MouseEvent e) {}
/*     */ 
/*     */     
/*     */     public void mousePressed(MouseEvent e) {
/* 708 */       popup(e);
/*     */     }
/*     */ 
/*     */     
/*     */     public void mouseReleased(MouseEvent e) {
/* 713 */       popup(e);
/*     */     }
/*     */ 
/*     */     
/*     */     private void popup(MouseEvent e) {
/* 718 */       if (e.isPopupTrigger() && isPointInLabel(e)) {
/* 719 */         JDirectoryChooserUI.this.tree.setSelectionPath(JDirectoryChooserUI.this.tree.getPathForLocation(e.getX(), e.getY()));
/* 720 */         if (JDirectoryChooserUI.this.popupMenu == null) {
/* 721 */           JDirectoryChooserUI.this.popupMenu = new JPopupMenu();
/* 722 */           JDirectoryChooserUI.this.popupMenu.add(JDirectoryChooserUI.this.newFolderAction);
/*     */         } 
/* 724 */         JDirectoryChooserUI.this.popupMenu.show(JDirectoryChooserUI.this.tree, e.getX(), e.getY());
/*     */       } 
/*     */     }
/*     */     
/*     */     private boolean isPointInLabel(MouseEvent e) {
/* 729 */       TreePath path = JDirectoryChooserUI.this.tree.getPathForLocation(e.getX(), e.getY());
/* 730 */       if (path == null) {
/* 731 */         return false;
/*     */       }
/*     */       
/* 734 */       int row = JDirectoryChooserUI.this.tree.getRowForLocation(e.getX(), e.getY());
/* 735 */       Rectangle bounds = JDirectoryChooserUI.this.tree.getRowBounds(row);
/* 736 */       Point point = e.getPoint();
/* 737 */       point.translate(-bounds.x, -bounds.y);
/* 738 */       return (point.x > 0);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\swingdirectory\JDirectoryChooserUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */