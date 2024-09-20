/*    */ package javafx.collections;
/*    */ 
/*    */ import java.lang.ref.WeakReference;
/*    */ import javafx.beans.NamedArg;
/*    */ import javafx.beans.WeakListener;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class WeakSetChangeListener<E>
/*    */   implements SetChangeListener<E>, WeakListener
/*    */ {
/*    */   private final WeakReference<SetChangeListener<E>> ref;
/*    */   
/*    */   public WeakSetChangeListener(@NamedArg("listener") SetChangeListener<E> paramSetChangeListener) {
/* 67 */     if (paramSetChangeListener == null) {
/* 68 */       throw new NullPointerException("Listener must be specified.");
/*    */     }
/* 70 */     this.ref = new WeakReference<>(paramSetChangeListener);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean wasGarbageCollected() {
/* 78 */     return (this.ref.get() == null);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onChanged(SetChangeListener.Change<? extends E> paramChange) {
/* 86 */     SetChangeListener<E> setChangeListener = this.ref.get();
/* 87 */     if (setChangeListener != null) {
/* 88 */       setChangeListener.onChanged(paramChange);
/*    */     
/*    */     }
/*    */     else {
/*    */       
/* 93 */       paramChange.getSet().removeListener(this);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\WeakSetChangeListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */