/*    */ package com.sun.javafx;
/*    */ 
/*    */ import java.util.AbstractList;
/*    */ import java.util.RandomAccess;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UnmodifiableArrayList<T>
/*    */   extends AbstractList<T>
/*    */   implements RandomAccess
/*    */ {
/*    */   private T[] elements;
/*    */   private final int size;
/*    */   
/*    */   public UnmodifiableArrayList(T[] paramArrayOfT, int paramInt) {
/*    */     assert false;
/* 51 */     throw new AssertionError();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public T get(int paramInt) {
/* 57 */     return this.elements[paramInt];
/*    */   }
/*    */   
/*    */   public int size() {
/* 61 */     return this.size;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\UnmodifiableArrayList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */