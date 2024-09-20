/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.List;
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
/*     */ public abstract class NonIterableChange<E>
/*     */   extends ListChangeListener.Change<E>
/*     */ {
/*     */   private final int from;
/*     */   private final int to;
/*     */   private boolean invalid = true;
/*     */   
/*     */   protected NonIterableChange(int paramInt1, int paramInt2, ObservableList<E> paramObservableList) {
/*  40 */     super(paramObservableList);
/*  41 */     this.from = paramInt1;
/*  42 */     this.to = paramInt2;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getFrom() {
/*  47 */     checkState();
/*  48 */     return this.from;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getTo() {
/*  53 */     checkState();
/*  54 */     return this.to;
/*     */   }
/*     */   
/*  57 */   private static final int[] EMPTY_PERM = new int[0];
/*     */ 
/*     */   
/*     */   protected int[] getPermutation() {
/*  61 */     checkState();
/*  62 */     return EMPTY_PERM;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean next() {
/*  67 */     if (this.invalid) {
/*  68 */       this.invalid = false;
/*  69 */       return true;
/*     */     } 
/*  71 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void reset() {
/*  76 */     this.invalid = true;
/*     */   }
/*     */   
/*     */   public void checkState() {
/*  80 */     if (this.invalid) {
/*  81 */       throw new IllegalStateException("Invalid Change state: next() must be called before inspecting the Change.");
/*     */     }
/*     */   }
/*     */   
/*     */   public String toString() {
/*     */     String str;
/*  87 */     boolean bool = this.invalid;
/*  88 */     this.invalid = false;
/*     */     
/*  90 */     if (wasPermutated()) {
/*  91 */       str = ChangeHelper.permChangeToString(getPermutation());
/*  92 */     } else if (wasUpdated()) {
/*  93 */       str = ChangeHelper.updateChangeToString(this.from, this.to);
/*     */     } else {
/*  95 */       str = ChangeHelper.addRemoveChangeToString(this.from, this.to, (List<?>)getList(), getRemoved());
/*     */     } 
/*  97 */     this.invalid = bool;
/*  98 */     return "{ " + str + " }";
/*     */   }
/*     */   
/*     */   public static class GenericAddRemoveChange<E>
/*     */     extends NonIterableChange<E> {
/*     */     private final List<E> removed;
/*     */     
/*     */     public GenericAddRemoveChange(int param1Int1, int param1Int2, List<E> param1List, ObservableList<E> param1ObservableList) {
/* 106 */       super(param1Int1, param1Int2, param1ObservableList);
/* 107 */       this.removed = param1List;
/*     */     }
/*     */ 
/*     */     
/*     */     public List<E> getRemoved() {
/* 112 */       checkState();
/* 113 */       return this.removed;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class SimpleRemovedChange<E>
/*     */     extends NonIterableChange<E> {
/*     */     private final List<E> removed;
/*     */     
/*     */     public SimpleRemovedChange(int param1Int1, int param1Int2, E param1E, ObservableList<E> param1ObservableList) {
/* 122 */       super(param1Int1, param1Int2, param1ObservableList);
/* 123 */       this.removed = Collections.singletonList(param1E);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasRemoved() {
/* 128 */       checkState();
/* 129 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public List<E> getRemoved() {
/* 134 */       checkState();
/* 135 */       return this.removed;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class SimpleAddChange<E>
/*     */     extends NonIterableChange<E>
/*     */   {
/*     */     public SimpleAddChange(int param1Int1, int param1Int2, ObservableList<E> param1ObservableList) {
/* 143 */       super(param1Int1, param1Int2, param1ObservableList);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasRemoved() {
/* 148 */       checkState();
/* 149 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public List<E> getRemoved() {
/* 154 */       checkState();
/* 155 */       return Collections.emptyList();
/*     */     }
/*     */   }
/*     */   
/*     */   public static class SimplePermutationChange<E>
/*     */     extends NonIterableChange<E>
/*     */   {
/*     */     private final int[] permutation;
/*     */     
/*     */     public SimplePermutationChange(int param1Int1, int param1Int2, int[] param1ArrayOfint, ObservableList<E> param1ObservableList) {
/* 165 */       super(param1Int1, param1Int2, param1ObservableList);
/* 166 */       this.permutation = param1ArrayOfint;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public List<E> getRemoved() {
/* 172 */       checkState();
/* 173 */       return Collections.emptyList();
/*     */     }
/*     */ 
/*     */     
/*     */     protected int[] getPermutation() {
/* 178 */       checkState();
/* 179 */       return this.permutation;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class SimpleUpdateChange<E>
/*     */     extends NonIterableChange<E> {
/*     */     public SimpleUpdateChange(int param1Int, ObservableList<E> param1ObservableList) {
/* 186 */       this(param1Int, param1Int + 1, param1ObservableList);
/*     */     }
/*     */     
/*     */     public SimpleUpdateChange(int param1Int1, int param1Int2, ObservableList<E> param1ObservableList) {
/* 190 */       super(param1Int1, param1Int2, param1ObservableList);
/*     */     }
/*     */ 
/*     */     
/*     */     public List<E> getRemoved() {
/* 195 */       return Collections.emptyList();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasUpdated() {
/* 200 */       return true;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\NonIterableChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */