/*    */ package javafx.beans.binding;
/*    */ 
/*    */ import javafx.beans.Observable;
/*    */ import javafx.beans.value.ObservableBooleanValue;
/*    */ import javafx.collections.FXCollections;
/*    */ import javafx.collections.ObservableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
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
/*    */   extends BooleanBinding
/*    */ {
/*    */   null() {
/* 81 */     bind(new Observable[] { (Observable)this.val$value });
/*    */   }
/*    */ 
/*    */   
/*    */   public void dispose() {
/* 86 */     unbind(new Observable[] { (Observable)this.val$value });
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean computeValue() {
/* 91 */     return value.get();
/*    */   }
/*    */ 
/*    */   
/*    */   public ObservableList<ObservableBooleanValue> getDependencies() {
/* 96 */     return FXCollections.singletonObservableList(value);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\BooleanExpression$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */