/*    */ package javafx.beans.binding;
/*    */ 
/*    */ import com.sun.javafx.binding.SetExpressionHelper;
/*    */ import javafx.collections.SetChangeListener;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
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
/*    */   implements SetChangeListener<E>
/*    */ {
/*    */   public void onChanged(SetChangeListener.Change<? extends E> paramChange) {
/* 77 */     SetBinding.this.invalidateProperties();
/* 78 */     SetBinding.this.onInvalidating();
/* 79 */     SetExpressionHelper.fireValueChangedEvent(SetBinding.this.helper, paramChange);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\SetBinding$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */