/*    */ package com.github.weisj.jsvg.parser;
/*    */ 
/*    */ import java.beans.PropertyChangeEvent;
/*    */ import java.util.concurrent.atomic.AtomicReference;
/*    */ import java.util.function.Supplier;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.SwingWorker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class SwingUIFuture<T>
/*    */   implements UIFuture<T>
/*    */ {
/*    */   @NotNull
/*    */   private final AtomicReference<SwingWorker<Void, Void>> swingWorker;
/*    */   @Nullable
/*    */   private T value;
/*    */   
/*    */   public SwingUIFuture(@NotNull final Supplier<T> supplier) {
/* 38 */     this.swingWorker = new AtomicReference<>(new SwingWorker<Void, Void>()
/*    */         {
/*    */           protected Void doInBackground() {
/* 41 */             SwingUIFuture.this.value = (T)supplier.get();
/* 42 */             synchronized (SwingUIFuture.this) {
/* 43 */               SwingUIFuture.this.swingWorker.set(null);
/*    */             } 
/* 45 */             return null;
/*    */           }
/*    */         });
/* 48 */     ((SwingWorker)this.swingWorker.get()).execute();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean checkIfReady(@Nullable JComponent component) {
/* 53 */     SwingWorker<?, ?> worker = this.swingWorker.get();
/* 54 */     if (worker == null || worker.isDone()) return true; 
/* 55 */     if (component != null)
/* 56 */       synchronized (this) {
/* 57 */         worker.addPropertyChangeListener(e -> {
/*    */               if (worker.isDone())
/*    */                 component.repaint(); 
/*    */             });
/*    */       }  
/* 62 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public T get() {
/* 67 */     return this.value;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\SwingUIFuture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */