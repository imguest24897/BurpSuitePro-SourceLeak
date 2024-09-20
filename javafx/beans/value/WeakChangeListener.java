/*    */ package javafx.beans.value;
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
/*    */ public final class WeakChangeListener<T>
/*    */   implements ChangeListener<T>, WeakListener
/*    */ {
/*    */   private final WeakReference<ChangeListener<T>> ref;
/*    */   
/*    */   public WeakChangeListener(@NamedArg("listener") ChangeListener<T> paramChangeListener) {
/* 64 */     if (paramChangeListener == null) {
/* 65 */       throw new NullPointerException("Listener must be specified.");
/*    */     }
/* 67 */     this.ref = new WeakReference<>(paramChangeListener);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean wasGarbageCollected() {
/* 75 */     return (this.ref.get() == null);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void changed(ObservableValue<? extends T> paramObservableValue, T paramT1, T paramT2) {
/* 84 */     ChangeListener<T> changeListener = this.ref.get();
/* 85 */     if (changeListener != null) {
/* 86 */       changeListener.changed(paramObservableValue, paramT1, paramT2);
/*    */     
/*    */     }
/*    */     else {
/*    */       
/* 91 */       paramObservableValue.removeListener(this);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\value\WeakChangeListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */