/*    */ package com.install4j.runtime.launcher.integration.gui;
/*    */ 
/*    */ import org.eclipse.swt.widgets.Display;
/*    */ import org.eclipse.swt.widgets.Shell;
/*    */ 
/*    */ class SwtWindowChecker
/*    */   extends WindowChecker {
/*    */   private ThreadGroup rootThreadGroup;
/*    */   
/*    */   public SwtWindowChecker(Runnable runnable, boolean adjustLaf) {
/* 11 */     super(runnable, adjustLaf);
/*    */     
/* 13 */     this.rootThreadGroup = currentThread().getThreadGroup().getParent();
/* 14 */     while (this.rootThreadGroup.getParent() != null) {
/* 15 */       this.rootThreadGroup = this.rootThreadGroup.getParent();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean checkExecute() {
/* 21 */     return checkThreads(this.rootThreadGroup, 0);
/*    */   }
/*    */   
/*    */   public boolean checkThreads(ThreadGroup threadGroup, int level) {
/* 25 */     int threadCount = threadGroup.activeCount();
/* 26 */     Thread[] threads = new Thread[2 * threadCount];
/* 27 */     threadCount = threadGroup.enumerate(threads, false);
/* 28 */     for (int i = 0; i < threadCount; i++) {
/* 29 */       Thread thread = threads[i];
/* 30 */       if (checkThread(thread)) {
/* 31 */         return true;
/*    */       }
/*    */     } 
/* 34 */     int groupCount = threadGroup.activeGroupCount();
/* 35 */     ThreadGroup[] groups = new ThreadGroup[2 * groupCount];
/* 36 */     groupCount = threadGroup.enumerate(groups, false);
/* 37 */     for (int j = 0; j < groupCount; j++) {
/*    */       try {
/* 39 */         if (checkThreads(groups[j], level + 1)) {
/* 40 */           return true;
/*    */         }
/* 42 */       } catch (Exception exception) {}
/*    */     } 
/*    */     
/* 45 */     return false;
/*    */   }
/*    */   
/*    */   private boolean checkThread(Thread thread) {
/* 49 */     Display display = Display.findDisplay(thread);
/*    */     
/* 51 */     if (display != null) {
/* 52 */       boolean[] result = new boolean[1];
/* 53 */       display.syncExec(() -> {
/*    */             Shell[] shells = display.getShells();
/*    */             for (Shell shell : shells) {
/*    */               if (shell.isVisible()) {
/*    */                 result[0] = true;
/*    */                 return;
/*    */               } 
/*    */             } 
/*    */           });
/* 62 */       return result[0];
/*    */     } 
/* 64 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\integration\gui\SwtWindowChecker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */