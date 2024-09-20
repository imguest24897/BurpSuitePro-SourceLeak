/*     */ package javafx.collections.transformation;
/*     */ 
/*     */ import javafx.collections.ListChangeListener;
/*     */ import javafx.collections.ObservableList;
/*     */ import javafx.collections.ObservableListBase;
/*     */ import javafx.collections.WeakListChangeListener;
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
/*     */ public abstract class TransformationList<E, F>
/*     */   extends ObservableListBase<E>
/*     */ {
/*     */   private ObservableList<? extends F> source;
/*     */   private ListChangeListener<F> sourceListener;
/*     */   
/*     */   protected TransformationList(ObservableList<? extends F> paramObservableList) {
/*  63 */     if (paramObservableList == null) {
/*  64 */       throw new NullPointerException();
/*     */     }
/*  66 */     this.source = paramObservableList;
/*  67 */     paramObservableList.addListener((ListChangeListener)new WeakListChangeListener(getListener()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final ObservableList<? extends F> getSource() {
/*  75 */     return this.source;
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
/*     */   public final boolean isInTransformationChain(ObservableList<?> paramObservableList) {
/*  89 */     if (this.source == paramObservableList) {
/*  90 */       return true;
/*     */     }
/*  92 */     ObservableList<? extends F> observableList = this.source;
/*  93 */     while (observableList instanceof TransformationList) { TransformationList transformationList = (TransformationList)observableList;
/*  94 */       observableList = transformationList.source;
/*  95 */       if (observableList == paramObservableList) {
/*  96 */         return true;
/*     */       } }
/*     */     
/*  99 */     return false;
/*     */   }
/*     */   
/*     */   private ListChangeListener<F> getListener() {
/* 103 */     if (this.sourceListener == null) {
/* 104 */       this.sourceListener = (paramChange -> sourceChanged(paramChange));
/*     */     }
/*     */ 
/*     */     
/* 108 */     return this.sourceListener;
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
/*     */   public final int getSourceIndexFor(ObservableList<?> paramObservableList, int paramInt) {
/* 136 */     if (!isInTransformationChain(paramObservableList)) {
/* 137 */       throw new IllegalArgumentException("Provided list is not in the transformation chain of thistransformation list");
/*     */     }
/*     */     
/* 140 */     ObservableList<? extends F> observableList = this.source;
/* 141 */     int i = getSourceIndex(paramInt);
/* 142 */     while (observableList != paramObservableList && observableList instanceof TransformationList) { TransformationList transformationList = (TransformationList)observableList;
/* 143 */       i = transformationList.getSourceIndex(i);
/* 144 */       observableList = transformationList.source; }
/*     */     
/* 146 */     return i;
/*     */   }
/*     */   
/*     */   protected abstract void sourceChanged(ListChangeListener.Change<? extends F> paramChange);
/*     */   
/*     */   public abstract int getSourceIndex(int paramInt);
/*     */   
/*     */   public abstract int getViewIndex(int paramInt);
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\transformation\TransformationList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */