/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.util.Objects;
/*     */ import java.util.function.Function;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ import javafx.util.Subscription;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlatMappedBinding<S, T>
/*     */   extends LazyObjectBinding<T>
/*     */ {
/*     */   private final ObservableValue<S> source;
/*     */   private final Function<? super S, ? extends ObservableValue<? extends T>> mapper;
/*  60 */   private Subscription indirectSourceSubscription = Subscription.EMPTY;
/*     */   private ObservableValue<? extends T> indirectSource;
/*     */   
/*     */   public FlatMappedBinding(ObservableValue<S> paramObservableValue, Function<? super S, ? extends ObservableValue<? extends T>> paramFunction) {
/*  64 */     this.source = Objects.<ObservableValue<S>>requireNonNull(paramObservableValue, "source cannot be null");
/*  65 */     this.mapper = Objects.<Function<? super S, ? extends ObservableValue<? extends T>>>requireNonNull(paramFunction, "mapper cannot be null");
/*     */   }
/*     */ 
/*     */   
/*     */   protected T computeValue() {
/*  70 */     Object object = this.source.getValue();
/*  71 */     ObservableValue<? extends T> observableValue = (object == null) ? null : this.mapper.apply((S)object);
/*     */     
/*  73 */     if (isObserved() && this.indirectSource != observableValue) {
/*  74 */       this.indirectSourceSubscription.unsubscribe();
/*  75 */       this.indirectSourceSubscription = (observableValue == null) ? Subscription.EMPTY : observableValue.subscribe(this::invalidate);
/*  76 */       this.indirectSource = observableValue;
/*     */     } 
/*     */     
/*  79 */     return (observableValue == null) ? null : (T)observableValue.getValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected Subscription observeSources() {
/*  84 */     Subscription subscription = this.source.subscribe(this::invalidateAll);
/*     */     
/*  86 */     return () -> {
/*     */         paramSubscription.unsubscribe();
/*     */         unsubscribeIndirectSource();
/*     */       };
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
/*     */   private void invalidateAll() {
/* 102 */     unsubscribeIndirectSource();
/* 103 */     invalidate();
/*     */   }
/*     */   
/*     */   private void unsubscribeIndirectSource() {
/* 107 */     this.indirectSourceSubscription.unsubscribe();
/* 108 */     this.indirectSourceSubscription = Subscription.EMPTY;
/* 109 */     this.indirectSource = null;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\FlatMappedBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */