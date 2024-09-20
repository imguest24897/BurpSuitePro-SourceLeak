/*     */ package javafx.beans.property;
/*     */ 
/*     */ import com.sun.javafx.binding.MapExpressionHelper;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableMapValue;
/*     */ import javafx.collections.MapChangeListener;
/*     */ import javafx.collections.ObservableMap;
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
/*     */ public abstract class ReadOnlyMapPropertyBase<K, V>
/*     */   extends ReadOnlyMapProperty<K, V>
/*     */ {
/*     */   private MapExpressionHelper<K, V> helper;
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/*  53 */     this.helper = MapExpressionHelper.addListener(this.helper, (ObservableMapValue)this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/*  58 */     this.helper = MapExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/*  63 */     this.helper = MapExpressionHelper.addListener(this.helper, (ObservableMapValue)this, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/*  68 */     this.helper = MapExpressionHelper.removeListener(this.helper, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/*  73 */     this.helper = MapExpressionHelper.addListener(this.helper, (ObservableMapValue)this, paramMapChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/*  78 */     this.helper = MapExpressionHelper.removeListener(this.helper, paramMapChangeListener);
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
/*  93 */     MapExpressionHelper.fireValueChangedEvent(this.helper);
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
/*     */   protected void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/* 110 */     MapExpressionHelper.fireValueChangedEvent(this.helper, paramChange);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyMapPropertyBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */