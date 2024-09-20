/*    */ package javafx.beans.binding;
/*    */ 
/*    */ import javafx.beans.Observable;
/*    */ import javafx.beans.value.ObservableObjectValue;
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
/*    */ 
/*    */ class null
/*    */   extends ObjectBinding<T>
/*    */ {
/*    */   null() {
/* 82 */     bind(new Observable[] { (Observable)this.val$value });
/*    */   }
/*    */ 
/*    */   
/*    */   public void dispose() {
/* 87 */     unbind(new Observable[] { (Observable)this.val$value });
/*    */   }
/*    */ 
/*    */   
/*    */   protected T computeValue() {
/* 92 */     return (T)value.get();
/*    */   }
/*    */ 
/*    */   
/*    */   public ObservableList<ObservableObjectValue<T>> getDependencies() {
/* 97 */     return FXCollections.singletonObservableList(value);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\ObjectExpression$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */