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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class Change<K, V>
/*    */ {
/*    */   private final ObservableMap<K, V> map;
/*    */   
/*    */   public Change(ObservableMap<K, V> paramObservableMap) {
/* 57 */     this.map = paramObservableMap;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ObservableMap<K, V> getMap() {
/* 65 */     return this.map;
/*    */   }
/*    */   
/*    */   public abstract boolean wasAdded();
/*    */   
/*    */   public abstract boolean wasRemoved();
/*    */   
/*    */   public abstract K getKey();
/*    */   
/*    */   public abstract V getValueAdded();
/*    */   
/*    */   public abstract V getValueRemoved();
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\MapChangeListener$Change.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */