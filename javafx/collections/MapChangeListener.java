/*    */ package javafx.collections;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @FunctionalInterface
/*    */ public interface MapChangeListener<K, V>
/*    */ {
/*    */   void onChanged(Change<? extends K, ? extends V> paramChange);
/*    */   
/*    */   public static abstract class Change<K, V>
/*    */   {
/*    */     private final ObservableMap<K, V> map;
/*    */     
/*    */     public Change(ObservableMap<K, V> param1ObservableMap) {
/* 57 */       this.map = param1ObservableMap;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public ObservableMap<K, V> getMap() {
/* 65 */       return this.map;
/*    */     }
/*    */     
/*    */     public abstract boolean wasAdded();
/*    */     
/*    */     public abstract boolean wasRemoved();
/*    */     
/*    */     public abstract K getKey();
/*    */     
/*    */     public abstract V getValueAdded();
/*    */     
/*    */     public abstract V getValueRemoved();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\MapChangeListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */