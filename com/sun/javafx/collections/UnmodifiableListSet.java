/*    */ package com.sun.javafx.collections;
/*    */ 
/*    */ import java.util.AbstractSet;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
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
/*    */ public final class UnmodifiableListSet<E>
/*    */   extends AbstractSet<E>
/*    */ {
/*    */   private List<E> backingList;
/*    */   
/*    */   public UnmodifiableListSet(List<E> paramList) {
/* 45 */     if (paramList == null) throw new NullPointerException(); 
/* 46 */     this.backingList = paramList;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Iterator<E> iterator() {
/* 57 */     final Iterator<E> itr = this.backingList.iterator();
/* 58 */     return new Iterator<E>() {
/*    */         public boolean hasNext() {
/* 60 */           return itr.hasNext();
/*    */         }
/*    */         
/*    */         public E next() {
/* 64 */           return itr.next();
/*    */         }
/*    */         
/*    */         public void remove() {
/* 68 */           throw new UnsupportedOperationException();
/*    */         }
/*    */       };
/*    */   }
/*    */   
/*    */   public int size() {
/* 74 */     return this.backingList.size();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\UnmodifiableListSet.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */