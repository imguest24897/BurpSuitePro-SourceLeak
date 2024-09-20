/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.AbstractList;
/*     */ import java.util.List;
/*     */ import java.util.function.Function;
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
/*     */ public final class MappingChange<E, F>
/*     */   extends ListChangeListener.Change<F>
/*     */ {
/*     */   private final Function<E, F> mapper;
/*     */   private final ListChangeListener.Change<? extends E> original;
/*     */   private List<F> removed;
/*     */   
/*     */   public MappingChange(ListChangeListener.Change<? extends E> paramChange, Function<E, F> paramFunction, ObservableList<F> paramObservableList) {
/*  41 */     super(paramObservableList);
/*  42 */     this.original = paramChange;
/*  43 */     this.mapper = paramFunction;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean next() {
/*  48 */     return this.original.next();
/*     */   }
/*     */ 
/*     */   
/*     */   public void reset() {
/*  53 */     this.original.reset();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getFrom() {
/*  58 */     return this.original.getFrom();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getTo() {
/*  63 */     return this.original.getTo();
/*     */   }
/*     */ 
/*     */   
/*     */   public List<F> getRemoved() {
/*  68 */     if (this.removed == null) {
/*  69 */       this.removed = new AbstractList<F>()
/*     */         {
/*     */           public F get(int param1Int)
/*     */           {
/*  73 */             return (F)MappingChange.this.mapper.apply(MappingChange.this.original.getRemoved().get(param1Int));
/*     */           }
/*     */ 
/*     */           
/*     */           public int size() {
/*  78 */             return MappingChange.this.original.getRemovedSize();
/*     */           }
/*     */         };
/*     */     }
/*  82 */     return this.removed;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int[] getPermutation() {
/*  87 */     return new int[0];
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean wasPermutated() {
/*  92 */     return this.original.wasPermutated();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean wasUpdated() {
/*  97 */     return this.original.wasUpdated();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getPermutation(int paramInt) {
/* 102 */     return this.original.getPermutation(paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 110 */     byte b1 = 0;
/* 111 */     while (next()) {
/* 112 */       b1++;
/*     */     }
/*     */     
/* 115 */     byte b2 = 0;
/* 116 */     reset();
/* 117 */     while (next()) {
/* 118 */       b2++;
/*     */     }
/* 120 */     reset();
/* 121 */     StringBuilder stringBuilder = new StringBuilder();
/* 122 */     stringBuilder.append("{ ");
/* 123 */     int i = 0;
/* 124 */     while (next()) {
/* 125 */       if (wasPermutated()) {
/* 126 */         stringBuilder.append(ChangeHelper.permChangeToString(getPermutation()));
/* 127 */       } else if (wasUpdated()) {
/* 128 */         stringBuilder.append(ChangeHelper.updateChangeToString(getFrom(), getTo()));
/*     */       } else {
/* 130 */         stringBuilder.append(ChangeHelper.addRemoveChangeToString(getFrom(), getTo(), (List<?>)getList(), getRemoved()));
/*     */       } 
/* 132 */       if (i != b2) {
/* 133 */         stringBuilder.append(", ");
/*     */       }
/*     */     } 
/* 136 */     stringBuilder.append(" }");
/*     */     
/* 138 */     reset();
/* 139 */     i = b2 - b1;
/* 140 */     while (i-- > 0) {
/* 141 */       next();
/*     */     }
/*     */     
/* 144 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\MappingChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */