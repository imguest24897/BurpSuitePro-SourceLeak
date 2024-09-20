/*    */ package javafx.beans.binding;
/*    */ 
/*    */ import com.sun.javafx.binding.ListExpressionHelper;
/*    */ import javafx.collections.ListChangeListener;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
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
/*    */   implements ListChangeListener<E>
/*    */ {
/*    */   public void onChanged(ListChangeListener.Change<? extends E> paramChange) {
/* 76 */     ListBinding.this.invalidateProperties();
/* 77 */     ListBinding.this.onInvalidating();
/* 78 */     ListExpressionHelper.fireValueChangedEvent(ListBinding.this.helper, paramChange);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\ListBinding$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */