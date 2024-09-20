/*    */ package javafx.beans;
/*    */ 
/*    */ import java.lang.ref.WeakReference;
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
/*    */ public final class WeakInvalidationListener
/*    */   implements InvalidationListener, WeakListener
/*    */ {
/*    */   private final WeakReference<InvalidationListener> ref;
/*    */   
/*    */   public WeakInvalidationListener(@NamedArg("listener") InvalidationListener paramInvalidationListener) {
/* 61 */     if (paramInvalidationListener == null) {
/* 62 */       throw new NullPointerException("Listener must be specified.");
/*    */     }
/* 64 */     this.ref = new WeakReference<>(paramInvalidationListener);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean wasGarbageCollected() {
/* 72 */     return (this.ref.get() == null);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void invalidated(Observable paramObservable) {
/* 80 */     InvalidationListener invalidationListener = this.ref.get();
/* 81 */     if (invalidationListener != null) {
/* 82 */       invalidationListener.invalidated(paramObservable);
/*    */     
/*    */     }
/*    */     else {
/*    */       
/* 87 */       paramObservable.removeListener(this);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\WeakInvalidationListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */