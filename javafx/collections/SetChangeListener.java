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
/*    */ @FunctionalInterface
/*    */ public interface SetChangeListener<E>
/*    */ {
/*    */   void onChanged(Change<? extends E> paramChange);
/*    */   
/*    */   public static abstract class Change<E>
/*    */   {
/*    */     private ObservableSet<E> set;
/*    */     
/*    */     public Change(ObservableSet<E> param1ObservableSet) {
/* 54 */       this.set = param1ObservableSet;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public ObservableSet<E> getSet() {
/* 62 */       return this.set;
/*    */     }
/*    */     
/*    */     public abstract boolean wasAdded();
/*    */     
/*    */     public abstract boolean wasRemoved();
/*    */     
/*    */     public abstract E getElementAdded();
/*    */     
/*    */     public abstract E getElementRemoved();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\SetChangeListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */