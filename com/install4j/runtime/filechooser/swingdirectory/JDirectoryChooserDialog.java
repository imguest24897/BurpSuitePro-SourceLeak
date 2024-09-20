/*    */ package com.install4j.runtime.filechooser.swingdirectory;
/*    */ 
/*    */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*    */ import com.install4j.runtime.util.CustomDialog;
/*    */ import java.awt.BorderLayout;
/*    */ import java.awt.Component;
/*    */ import java.awt.Window;
/*    */ import java.awt.event.WindowAdapter;
/*    */ import java.awt.event.WindowEvent;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ class JDirectoryChooserDialog extends CustomDialog {
/*    */   private static final int FRAME_WIDTH = 400;
/*    */   private static final int FRAME_HEIGHT = 400;
/*    */   
/*    */   public JDirectoryChooserDialog(final JDirectoryChooser directoryChooser, Window parentWindow) {
/* 17 */     super(parentWindow);
/* 18 */     setModal(true);
/* 19 */     setTitle(directoryChooser.getTitle());
/*    */     
/* 21 */     JPanel contentPane = (JPanel)getContentPane();
/*    */     
/* 23 */     GUIHelper.setEmptyBorder(contentPane, 4, 10, 10, 10);
/*    */     
/* 25 */     contentPane.setLayout(new BorderLayout());
/* 26 */     contentPane.add((Component)directoryChooser, "Center");
/*    */     
/* 28 */     setBounds(getFrameBounds());
/*    */     
/* 30 */     addWindowListener(new WindowAdapter()
/*    */         {
/*    */           public void windowActivated(WindowEvent event) {
/* 33 */             directoryChooser.focusTree();
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   protected int getFrameHeight() {
/* 40 */     return 400;
/*    */   }
/*    */ 
/*    */   
/*    */   protected int getFrameWidth() {
/* 45 */     return 400;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\swingdirectory\JDirectoryChooserDialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */