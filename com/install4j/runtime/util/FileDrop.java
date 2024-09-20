/*     */ package com.install4j.runtime.util;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import java.awt.Component;
/*     */ import java.awt.datatransfer.DataFlavor;
/*     */ import java.awt.datatransfer.Transferable;
/*     */ import java.awt.dnd.DropTarget;
/*     */ import java.awt.dnd.DropTargetDragEvent;
/*     */ import java.awt.dnd.DropTargetDropEvent;
/*     */ import java.awt.dnd.DropTargetListener;
/*     */ import java.io.File;
/*     */ import java.util.List;
/*     */ import java.util.TooManyListenersException;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class FileDrop {
/*     */   private static final boolean SUPPORTS_DND;
/*     */   
/*     */   static {
/*     */     boolean support;
/*     */     try {
/*  21 */       Class.forName("java.awt.dnd.DnDConstants");
/*  22 */       support = true;
/*  23 */     } catch (Exception e) {
/*  24 */       support = false;
/*     */     } 
/*  26 */     SUPPORTS_DND = support;
/*     */   }
/*     */   private DropTargetListener dropListener;
/*     */   
/*     */   public static void addTo(JComponent component, FileDropListener listener) {
/*  31 */     if (!InstallerUtil.isUnattended() && !InstallerUtil.isConsole()) {
/*  32 */       new FileDrop(component, listener);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FileDrop(final Component c, final FileDropListener listener) {
/*  40 */     if (SUPPORTS_DND) {
/*  41 */       this.dropListener = new DropTargetListener()
/*     */         {
/*     */           public void dragEnter(DropTargetDragEvent event) {
/*  44 */             if (FileDrop.this.isDragOk(event)) {
/*  45 */               event.acceptDrag(1);
/*     */             } else {
/*  47 */               event.rejectDrag();
/*     */             } 
/*     */           }
/*     */ 
/*     */ 
/*     */           
/*     */           public void dragOver(DropTargetDragEvent event) {}
/*     */ 
/*     */           
/*     */           public void drop(DropTargetDropEvent event) {
/*     */             try {
/*  58 */               Transferable tr = event.getTransferable();
/*     */               
/*  60 */               if (tr.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
/*  61 */                 event.acceptDrop(1);
/*     */                 
/*  63 */                 List<File> fileList = (List)tr.getTransferData(DataFlavor.javaFileListFlavor);
/*  64 */                 if (fileList.size() > 0) {
/*  65 */                   File file = fileList.get(0);
/*  66 */                   if (listener != null) {
/*  67 */                     listener.fileDropped(file);
/*  68 */                   } else if (c instanceof JTextField) {
/*  69 */                     ((JTextField)c).setText(file.getPath());
/*     */                   } 
/*     */                 } 
/*     */                 
/*  73 */                 event.getDropTargetContext().dropComplete(true);
/*     */               } else {
/*  75 */                 DataFlavor[] flavors = tr.getTransferDataFlavors();
/*  76 */                 boolean handled = false;
/*  77 */                 for (DataFlavor flavor : flavors) {
/*  78 */                   if (flavor.isRepresentationClassReader()) {
/*  79 */                     event.acceptDrop(1);
/*  80 */                     event.getDropTargetContext().dropComplete(true);
/*  81 */                     handled = true;
/*     */                     break;
/*     */                   } 
/*     */                 } 
/*  85 */                 if (!handled) {
/*  86 */                   event.rejectDrop();
/*     */                 }
/*     */               } 
/*  89 */             } catch (Exception ex) {
/*  90 */               ex.printStackTrace();
/*  91 */               event.rejectDrop();
/*     */             } 
/*     */           }
/*     */ 
/*     */ 
/*     */           
/*     */           public void dragExit(DropTargetEvent evt) {}
/*     */ 
/*     */           
/*     */           public void dropActionChanged(DropTargetDragEvent evt) {
/* 101 */             if (FileDrop.this.isDragOk(evt)) {
/* 102 */               evt.acceptDrag(1);
/*     */             } else {
/* 104 */               evt.rejectDrag();
/*     */             } 
/*     */           }
/*     */         };
/*     */       
/* 109 */       makeDropTarget(c);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void makeDropTarget(Component c) {
/* 114 */     DropTarget dt = new DropTarget();
/*     */     try {
/* 116 */       dt.addDropTargetListener(this.dropListener);
/* 117 */     } catch (TooManyListenersException e) {
/* 118 */       e.printStackTrace();
/*     */     } 
/*     */     
/* 121 */     c.addHierarchyListener(evt -> {
/*     */           Component parent = c.getParent();
/*     */           if (parent == null) {
/*     */             c.setDropTarget(null);
/*     */           } else {
/*     */             new DropTarget(c, this.dropListener);
/*     */           } 
/*     */         });
/* 129 */     if (c.getParent() != null) {
/* 130 */       new DropTarget(c, this.dropListener);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean isDragOk(DropTargetDragEvent evt) {
/* 136 */     DataFlavor[] flavors = evt.getCurrentDataFlavors();
/* 137 */     for (DataFlavor flavor : flavors) {
/* 138 */       if (flavor.equals(DataFlavor.javaFileListFlavor) || flavor.isRepresentationClassReader()) {
/* 139 */         return true;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 144 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\FileDrop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */