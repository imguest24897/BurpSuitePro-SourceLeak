/*    */ package javafx.collections;
/*    */ 
/*    */ import com.sun.javafx.collections.ArrayListenerHelper;
/*    */ import javafx.beans.InvalidationListener;
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
/*    */ public abstract class ObservableArrayBase<T extends ObservableArray<T>>
/*    */   implements ObservableArray<T>
/*    */ {
/*    */   private ArrayListenerHelper<T> listenerHelper;
/*    */   
/*    */   public final void addListener(InvalidationListener paramInvalidationListener) {
/* 52 */     this.listenerHelper = ArrayListenerHelper.addListener(this.listenerHelper, this, paramInvalidationListener);
/*    */   }
/*    */   
/*    */   public final void removeListener(InvalidationListener paramInvalidationListener) {
/* 56 */     this.listenerHelper = ArrayListenerHelper.removeListener(this.listenerHelper, paramInvalidationListener);
/*    */   }
/*    */   
/*    */   public final void addListener(ArrayChangeListener<T> paramArrayChangeListener) {
/* 60 */     this.listenerHelper = ArrayListenerHelper.addListener(this.listenerHelper, this, paramArrayChangeListener);
/*    */   }
/*    */   
/*    */   public final void removeListener(ArrayChangeListener<T> paramArrayChangeListener) {
/* 64 */     this.listenerHelper = ArrayListenerHelper.removeListener(this.listenerHelper, paramArrayChangeListener);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected final void fireChange(boolean paramBoolean, int paramInt1, int paramInt2) {
/* 74 */     ArrayListenerHelper.fireValueChangedEvent(this.listenerHelper, paramBoolean, paramInt1, paramInt2);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\ObservableArrayBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */