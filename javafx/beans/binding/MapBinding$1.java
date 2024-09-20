/*    */ package javafx.beans.binding;
/*    */ 
/*    */ import com.sun.javafx.binding.MapExpressionHelper;
/*    */ import javafx.collections.MapChangeListener;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */   implements MapChangeListener<K, V>
/*    */ {
/*    */   public void onChanged(MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/* 73 */     MapBinding.this.invalidateProperties();
/* 74 */     MapBinding.this.onInvalidating();
/* 75 */     MapExpressionHelper.fireValueChangedEvent(MapBinding.this.helper, paramChange);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\MapBinding$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */