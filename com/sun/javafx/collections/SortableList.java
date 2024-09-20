/*    */ package com.sun.javafx.collections;
/*    */ 
/*    */ import java.util.Comparator;
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
/*    */ public interface SortableList<E>
/*    */   extends ObservableList<E>
/*    */ {
/*    */   default void sort(Comparator<? super E> paramComparator) {
/* 45 */     if (size() == 0 || size() == 1) {
/*    */       return;
/*    */     }
/*    */     
/* 49 */     paramComparator = (paramComparator != null) ? paramComparator : Comparator.<E>naturalOrder();
/* 50 */     doSort(paramComparator);
/*    */   }
/*    */   
/*    */   void doSort(Comparator<? super E> paramComparator);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\SortableList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */