/*     */ package com.twitter.hpack;
/*     */ 
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
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
/*     */ final class HuffmanDecoder
/*     */ {
/*  23 */   private static final IOException EOS_DECODED = new IOException("EOS Decoded");
/*  24 */   private static final IOException INVALID_PADDING = new IOException("Invalid Padding");
/*     */ 
/*     */ 
/*     */   
/*     */   private final Node root;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   HuffmanDecoder(int[] codes, byte[] lengths) {
/*  34 */     if (codes.length != 257 || codes.length != lengths.length) {
/*  35 */       throw new IllegalArgumentException("invalid Huffman coding");
/*     */     }
/*  37 */     this.root = buildTree(codes, lengths);
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
/*     */   public byte[] decode(byte[] buf) throws IOException {
/*  49 */     ByteArrayOutputStream baos = new ByteArrayOutputStream();
/*     */     
/*  51 */     Node node = this.root;
/*  52 */     int current = 0;
/*  53 */     int bits = 0;
/*  54 */     for (int i = 0; i < buf.length; i++) {
/*  55 */       int b = buf[i] & 0xFF;
/*  56 */       current = current << 8 | b;
/*  57 */       bits += 8;
/*  58 */       while (bits >= 8) {
/*  59 */         int c = current >>> bits - 8 & 0xFF;
/*  60 */         node = node.children[c];
/*  61 */         bits -= node.bits;
/*  62 */         if (node.isTerminal()) {
/*  63 */           if (node.symbol == 256) {
/*  64 */             throw EOS_DECODED;
/*     */           }
/*  66 */           baos.write(node.symbol);
/*  67 */           node = this.root;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  72 */     while (bits > 0) {
/*  73 */       int c = current << 8 - bits & 0xFF;
/*  74 */       node = node.children[c];
/*  75 */       if (node.isTerminal() && node.bits <= bits) {
/*  76 */         bits -= node.bits;
/*  77 */         baos.write(node.symbol);
/*  78 */         node = this.root;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  87 */     int mask = (1 << bits) - 1;
/*  88 */     if ((current & mask) != mask) {
/*  89 */       throw INVALID_PADDING;
/*     */     }
/*     */     
/*  92 */     return baos.toByteArray();
/*     */   }
/*     */ 
/*     */   
/*     */   private static final class Node
/*     */   {
/*     */     private final int symbol;
/*     */     
/*     */     private final int bits;
/*     */     
/*     */     private final Node[] children;
/*     */     
/*     */     private Node() {
/* 105 */       this.symbol = 0;
/* 106 */       this.bits = 8;
/* 107 */       this.children = new Node[256];
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private Node(int symbol, int bits) {
/* 116 */       assert bits > 0 && bits <= 8;
/* 117 */       this.symbol = symbol;
/* 118 */       this.bits = bits;
/* 119 */       this.children = null;
/*     */     }
/*     */     
/*     */     private boolean isTerminal() {
/* 123 */       return (this.children == null);
/*     */     }
/*     */   }
/*     */   
/*     */   private static Node buildTree(int[] codes, byte[] lengths) {
/* 128 */     Node root = new Node();
/* 129 */     for (int i = 0; i < codes.length; i++) {
/* 130 */       insert(root, i, codes[i], lengths[i]);
/*     */     }
/* 132 */     return root;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void insert(Node root, int symbol, int code, byte length) {
/* 137 */     Node current = root;
/* 138 */     while (length > 8) {
/* 139 */       if (current.isTerminal()) {
/* 140 */         throw new IllegalStateException("invalid Huffman code: prefix not unique");
/*     */       }
/* 142 */       length = (byte)(length - 8);
/* 143 */       int j = code >>> length & 0xFF;
/* 144 */       if (current.children[j] == null) {
/* 145 */         current.children[j] = new Node();
/*     */       }
/* 147 */       current = current.children[j];
/*     */     } 
/*     */     
/* 150 */     Node terminal = new Node(symbol, length);
/* 151 */     int shift = 8 - length;
/* 152 */     int start = code << shift & 0xFF;
/* 153 */     int end = 1 << shift;
/* 154 */     for (int i = start; i < start + end; i++)
/* 155 */       current.children[i] = terminal; 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\twitter\hpack\HuffmanDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */