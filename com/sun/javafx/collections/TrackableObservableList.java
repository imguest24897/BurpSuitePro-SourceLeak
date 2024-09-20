/*    */ package com.sun.javafx.collections;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
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
/*    */ public abstract class TrackableObservableList<T>
/*    */   extends ObservableListWrapper<T>
/*    */ {
/*    */   public TrackableObservableList(List<T> paramList) {
/* 38 */     super(paramList);
/*    */   }
/*    */   
/*    */   public TrackableObservableList() {
/* 42 */     super(new ArrayList<>());
/* 43 */     addListener(paramChange -> onChanged(paramChange));
/*    */   }
/*    */   
/*    */   protected abstract void onChanged(ListChangeListener.Change<T> paramChange);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\TrackableObservableList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */