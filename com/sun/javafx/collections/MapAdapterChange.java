/*    */ package com.sun.javafx.collections;
/*    */ 
/*    */ import javafx.collections.MapChangeListener;
/*    */ import javafx.collections.ObservableMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MapAdapterChange<K, V>
/*    */   extends MapChangeListener.Change<K, V>
/*    */ {
/*    */   private final MapChangeListener.Change<? extends K, ? extends V> change;
/*    */   
/*    */   public MapAdapterChange(ObservableMap<K, V> paramObservableMap, MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/* 36 */     super(paramObservableMap);
/* 37 */     this.change = paramChange;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean wasAdded() {
/* 42 */     return this.change.wasAdded();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean wasRemoved() {
/* 47 */     return this.change.wasRemoved();
/*    */   }
/*    */ 
/*    */   
/*    */   public K getKey() {
/* 52 */     return (K)this.change.getKey();
/*    */   }
/*    */ 
/*    */   
/*    */   public V getValueAdded() {
/* 57 */     return (V)this.change.getValueAdded();
/*    */   }
/*    */ 
/*    */   
/*    */   public V getValueRemoved() {
/* 62 */     return (V)this.change.getValueRemoved();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 67 */     return this.change.toString();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\MapAdapterChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */