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
/*    */ public abstract class Change<E>
/*    */ {
/*    */   private ObservableSet<E> set;
/*    */   
/*    */   public Change(ObservableSet<E> paramObservableSet) {
/* 54 */     this.set = paramObservableSet;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ObservableSet<E> getSet() {
/* 62 */     return this.set;
/*    */   }
/*    */   
/*    */   public abstract boolean wasAdded();
/*    */   
/*    */   public abstract boolean wasRemoved();
/*    */   
/*    */   public abstract E getElementAdded();
/*    */   
/*    */   public abstract E getElementRemoved();
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\SetChangeListener$Change.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */