/*    */ package com.sun.javafx.binding;
/*    */ 
/*    */ import javafx.beans.Observable;
/*    */ import javafx.beans.binding.StringBinding;
/*    */ import javafx.beans.value.ObservableValue;
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
/*    */ class null
/*    */   extends StringBinding
/*    */ {
/*    */   null() {
/* 73 */     bind(new Observable[] { (Observable)this.val$observableValue });
/*    */   }
/*    */ 
/*    */   
/*    */   public void dispose() {
/* 78 */     unbind(new Observable[] { (Observable)this.val$observableValue });
/*    */   }
/*    */ 
/*    */   
/*    */   protected String computeValue() {
/* 83 */     Object object = observableValue.getValue();
/* 84 */     return (object == null) ? "null" : object.toString();
/*    */   }
/*    */ 
/*    */   
/*    */   public ObservableList<ObservableValue<?>> getDependencies() {
/* 89 */     return FXCollections.singletonObservableList(observableValue);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\StringFormatter$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */