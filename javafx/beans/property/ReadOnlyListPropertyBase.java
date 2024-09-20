/*     */ package javafx.beans.property;
/*     */ 
/*     */ import com.sun.javafx.binding.ListExpressionHelper;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableListValue;
/*     */ import javafx.collections.ListChangeListener;
/*     */ import javafx.collections.ObservableList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ReadOnlyListPropertyBase<E>
/*     */   extends ReadOnlyListProperty<E>
/*     */ {
/*     */   private ListExpressionHelper<E> helper;
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/*  54 */     this.helper = ListExpressionHelper.addListener(this.helper, (ObservableListValue)this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/*  59 */     this.helper = ListExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super ObservableList<E>> paramChangeListener) {
/*  64 */     this.helper = ListExpressionHelper.addListener(this.helper, (ObservableListValue)this, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super ObservableList<E>> paramChangeListener) {
/*  69 */     this.helper = ListExpressionHelper.removeListener(this.helper, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ListChangeListener<? super E> paramListChangeListener) {
/*  74 */     this.helper = ListExpressionHelper.addListener(this.helper, (ObservableListValue)this, paramListChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ListChangeListener<? super E> paramListChangeListener) {
/*  79 */     this.helper = ListExpressionHelper.removeListener(this.helper, paramListChangeListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent() {
/*  94 */     ListExpressionHelper.fireValueChangedEvent(this.helper);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(ListChangeListener.Change<? extends E> paramChange) {
/* 111 */     ListExpressionHelper.fireValueChangedEvent(this.helper, paramChange);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyListPropertyBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */