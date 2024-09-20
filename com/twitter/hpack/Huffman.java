/*    */ package com.twitter.hpack;
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
/*    */ public final class Huffman
/*    */ {
/* 26 */   public static final HuffmanDecoder DECODER = new HuffmanDecoder(HpackUtil.HUFFMAN_CODES, HpackUtil.HUFFMAN_CODE_LENGTHS);
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 31 */   public static final HuffmanEncoder ENCODER = new HuffmanEncoder(HpackUtil.HUFFMAN_CODES, HpackUtil.HUFFMAN_CODE_LENGTHS);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\twitter\hpack\Huffman.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */