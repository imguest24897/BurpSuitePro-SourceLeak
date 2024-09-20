/*     */ package javafx.beans.property;
/*     */ 
/*     */ import com.sun.javafx.binding.SetExpressionHelper;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableSetValue;
/*     */ import javafx.collections.ObservableSet;
/*     */ import javafx.collections.SetChangeListener;
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
/*     */ 
/*     */ public abstract class ReadOnlySetPropertyBase<E>
/*     */   extends ReadOnlySetProperty<E>
/*     */ {
/*     */   private SetExpressionHelper<E> helper;
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/*  55 */     this.helper = SetExpressionHelper.addListener(this.helper, (ObservableSetValue)this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/*  60 */     this.helper = SetExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super ObservableSet<E>> paramChangeListener) {
/*  65 */     this.helper = SetExpressionHelper.addListener(this.helper, (ObservableSetValue)this, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super ObservableSet<E>> paramChangeListener) {
/*  70 */     this.helper = SetExpressionHelper.removeListener(this.helper, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(SetChangeListener<? super E> paramSetChangeListener) {
/*  75 */     this.helper = SetExpressionHelper.addListener(this.helper, (ObservableSetValue)this, paramSetChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(SetChangeListener<? super E> paramSetChangeListener) {
/*  80 */     this.helper = SetExpressionHelper.removeListener(this.helper, paramSetChangeListener);
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
/*  95 */     SetExpressionHelper.fireValueChangedEvent(this.helper);
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
/*     */   protected void fireValueChangedEvent(SetChangeListener.Change<? extends E> paramChange) {
/* 112 */     SetExpressionHelper.fireValueChangedEvent(this.helper, paramChange);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlySetPropertyBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */