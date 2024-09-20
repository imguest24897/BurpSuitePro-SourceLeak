/*     */ package javafx.collections;
/*     */ 
/*     */ import com.sun.javafx.collections.ListListenerHelper;
/*     */ import java.util.AbstractList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import javafx.beans.InvalidationListener;
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
/*     */ public abstract class ObservableListBase<E>
/*     */   extends AbstractList<E>
/*     */   implements ObservableList<E>
/*     */ {
/*     */   private ListListenerHelper<E> listenerHelper;
/*     */   private ListChangeBuilder<E> changeBuilder;
/*     */   
/*     */   protected final void nextUpdate(int paramInt) {
/* 108 */     getListChangeBuilder().nextUpdate(paramInt);
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
/*     */   protected final void nextSet(int paramInt, E paramE) {
/* 120 */     getListChangeBuilder().nextSet(paramInt, paramE);
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
/*     */   protected final void nextReplace(int paramInt1, int paramInt2, List<? extends E> paramList) {
/* 133 */     getListChangeBuilder().nextReplace(paramInt1, paramInt2, paramList);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected final void nextRemove(int paramInt, List<? extends E> paramList) {
/* 144 */     getListChangeBuilder().nextRemove(paramInt, paramList);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected final void nextRemove(int paramInt, E paramE) {
/* 155 */     getListChangeBuilder().nextRemove(paramInt, paramE);
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
/*     */   protected final void nextPermutation(int paramInt1, int paramInt2, int[] paramArrayOfint) {
/* 171 */     getListChangeBuilder().nextPermutation(paramInt1, paramInt2, paramArrayOfint);
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
/*     */   protected final void nextAdd(int paramInt1, int paramInt2) {
/* 184 */     getListChangeBuilder().nextAdd(paramInt1, paramInt2);
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
/*     */   protected final void beginChange() {
/* 197 */     getListChangeBuilder().beginChange();
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
/*     */   protected final void endChange() {
/* 210 */     getListChangeBuilder().endChange();
/*     */   }
/*     */   
/*     */   private ListChangeBuilder<E> getListChangeBuilder() {
/* 214 */     if (this.changeBuilder == null) {
/* 215 */       this.changeBuilder = new ListChangeBuilder<>(this);
/*     */     }
/*     */     
/* 218 */     return this.changeBuilder;
/*     */   }
/*     */ 
/*     */   
/*     */   public final void addListener(InvalidationListener paramInvalidationListener) {
/* 223 */     this.listenerHelper = ListListenerHelper.addListener(this.listenerHelper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void removeListener(InvalidationListener paramInvalidationListener) {
/* 228 */     this.listenerHelper = ListListenerHelper.removeListener(this.listenerHelper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void addListener(ListChangeListener<? super E> paramListChangeListener) {
/* 233 */     this.listenerHelper = ListListenerHelper.addListener(this.listenerHelper, paramListChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void removeListener(ListChangeListener<? super E> paramListChangeListener) {
/* 238 */     this.listenerHelper = ListListenerHelper.removeListener(this.listenerHelper, paramListChangeListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected final void fireChange(ListChangeListener.Change<? extends E> paramChange) {
/* 246 */     ListListenerHelper.fireValueChangedEvent(this.listenerHelper, paramChange);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected final boolean hasListeners() {
/* 254 */     return ListListenerHelper.hasListeners(this.listenerHelper);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(E... paramVarArgs) {
/* 259 */     return addAll(Arrays.asList(paramVarArgs));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean setAll(E... paramVarArgs) {
/* 264 */     return setAll(Arrays.asList(paramVarArgs));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean setAll(Collection<? extends E> paramCollection) {
/* 269 */     throw new UnsupportedOperationException();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeAll(E... paramVarArgs) {
/* 274 */     return removeAll(Arrays.asList((Object[])paramVarArgs));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean retainAll(E... paramVarArgs) {
/* 279 */     return retainAll(Arrays.asList((Object[])paramVarArgs));
/*     */   }
/*     */ 
/*     */   
/*     */   public void remove(int paramInt1, int paramInt2) {
/* 284 */     removeRange(paramInt1, paramInt2);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\ObservableListBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */