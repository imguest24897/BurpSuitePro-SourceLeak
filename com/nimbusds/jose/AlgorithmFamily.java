/*    */ package com.nimbusds.jose;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.LinkedHashSet;
/*    */ import net.jcip.annotations.Immutable;
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
/*    */ @Immutable
/*    */ class AlgorithmFamily<T extends Algorithm>
/*    */   extends LinkedHashSet<T>
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   public AlgorithmFamily(T... algs) {
/* 46 */     for (T alg : algs) {
/* 47 */       super.add(alg);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean add(T alg) {
/* 54 */     throw new UnsupportedOperationException();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean addAll(Collection<? extends T> algs) {
/* 60 */     throw new UnsupportedOperationException();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean remove(Object o) {
/* 66 */     throw new UnsupportedOperationException();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean removeAll(Collection<?> c) {
/* 72 */     throw new UnsupportedOperationException();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean retainAll(Collection<?> c) {
/* 78 */     throw new UnsupportedOperationException();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\AlgorithmFamily.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */