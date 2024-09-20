/*    */ package org.brotli.dec;
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
/*    */ final class HuffmanTreeGroup
/*    */ {
/*    */   private int alphabetSize;
/*    */   int[] codes;
/*    */   int[] trees;
/*    */   
/*    */   static void init(HuffmanTreeGroup group, int alphabetSize, int n) {
/* 37 */     group.alphabetSize = alphabetSize;
/* 38 */     group.codes = new int[n * 1080];
/* 39 */     group.trees = new int[n];
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   static void decode(HuffmanTreeGroup group, BitReader br) {
/* 49 */     int next = 0;
/* 50 */     int n = group.trees.length;
/* 51 */     for (int i = 0; i < n; i++) {
/* 52 */       group.trees[i] = next;
/* 53 */       Decode.readHuffmanCode(group.alphabetSize, group.codes, next, br);
/* 54 */       next += 1080;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\brotli\dec\HuffmanTreeGroup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */