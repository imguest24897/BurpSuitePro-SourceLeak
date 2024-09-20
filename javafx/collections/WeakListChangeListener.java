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
/*    */ public final class WeakListChangeListener<E>
/*    */   implements ListChangeListener<E>, WeakListener
/*    */ {
/*    */   private final WeakReference<ListChangeListener<E>> ref;
/*    */   
/*    */   public WeakListChangeListener(@NamedArg("listener") ListChangeListener<E> paramListChangeListener) {
/* 67 */     if (paramListChangeListener == null) {
/* 68 */       throw new NullPointerException("Listener must be specified.");
/*    */     }
/* 70 */     this.ref = new WeakReference<>(paramListChangeListener);
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
/*    */   public void onChanged(ListChangeListener.Change<? extends E> paramChange) {
/* 86 */     ListChangeListener<E> listChangeListener = this.ref.get();
/* 87 */     if (listChangeListener != null) {
/* 88 */       listChangeListener.onChanged(paramChange);
/*    */     
/*    */     }
/*    */     else {
/*    */       
/* 93 */       paramChange.getList().removeListener(this);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\WeakListChangeListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */