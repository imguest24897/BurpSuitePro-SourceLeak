/*    */ package com.sun.javafx.binding;
/*    */ 
/*    */ import java.util.Objects;
/*    */ import java.util.function.Function;
/*    */ import javafx.beans.InvalidationListener;
/*    */ import javafx.beans.value.ChangeListener;
/*    */ import javafx.beans.value.ObservableValue;
/*    */ import javafx.util.Subscription;
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
/*    */ public class MappedBinding<S, T>
/*    */   extends LazyObjectBinding<T>
/*    */ {
/*    */   private final ObservableValue<S> source;
/*    */   private final Function<? super S, ? extends T> mapper;
/*    */   
/*    */   public MappedBinding(ObservableValue<S> paramObservableValue, Function<? super S, ? extends T> paramFunction) {
/* 40 */     this.source = Objects.<ObservableValue<S>>requireNonNull(paramObservableValue, "source cannot be null");
/* 41 */     this.mapper = Objects.<Function<? super S, ? extends T>>requireNonNull(paramFunction, "mapper cannot be null");
/*    */   }
/*    */ 
/*    */   
/*    */   protected T computeValue() {
/* 46 */     Object object = this.source.getValue();
/*    */     
/* 48 */     return (object == null) ? null : this.mapper.apply((S)object);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Subscription observeSources() {
/* 53 */     return this.source.subscribe(this::invalidate);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\MappedBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */