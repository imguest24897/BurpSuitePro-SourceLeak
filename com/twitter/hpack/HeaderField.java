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
/*    */ class HeaderField
/*    */   implements Comparable<HeaderField>
/*    */ {
/*    */   static final int HEADER_ENTRY_OVERHEAD = 32;
/*    */   final byte[] name;
/*    */   final byte[] value;
/*    */   
/*    */   static int sizeOf(byte[] name, byte[] value) {
/* 29 */     return name.length + value.length + 32;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   HeaderField(String name, String value) {
/* 37 */     this(name.getBytes(HpackUtil.ISO_8859_1), value.getBytes(HpackUtil.ISO_8859_1));
/*    */   }
/*    */   
/*    */   HeaderField(byte[] name, byte[] value) {
/* 41 */     this.name = HpackUtil.<byte[]>requireNonNull(name);
/* 42 */     this.value = HpackUtil.<byte[]>requireNonNull(value);
/*    */   }
/*    */   
/*    */   int size() {
/* 46 */     return this.name.length + this.value.length + 32;
/*    */   }
/*    */ 
/*    */   
/*    */   public int compareTo(HeaderField anotherHeaderField) {
/* 51 */     int ret = compareTo(this.name, anotherHeaderField.name);
/* 52 */     if (ret == 0) {
/* 53 */       ret = compareTo(this.value, anotherHeaderField.value);
/*    */     }
/* 55 */     return ret;
/*    */   }
/*    */   
/*    */   private int compareTo(byte[] s1, byte[] s2) {
/* 59 */     int len1 = s1.length;
/* 60 */     int len2 = s2.length;
/* 61 */     int lim = Math.min(len1, len2);
/*    */     
/* 63 */     int k = 0;
/* 64 */     while (k < lim) {
/* 65 */       byte b1 = s1[k];
/* 66 */       byte b2 = s2[k];
/* 67 */       if (b1 != b2) {
/* 68 */         return b1 - b2;
/*    */       }
/* 70 */       k++;
/*    */     } 
/* 72 */     return len1 - len2;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object obj) {
/* 77 */     if (obj == this) {
/* 78 */       return true;
/*    */     }
/* 80 */     if (!(obj instanceof HeaderField)) {
/* 81 */       return false;
/*    */     }
/* 83 */     HeaderField other = (HeaderField)obj;
/* 84 */     boolean nameEquals = HpackUtil.equals(this.name, other.name);
/* 85 */     boolean valueEquals = HpackUtil.equals(this.value, other.value);
/* 86 */     return (nameEquals && valueEquals);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 91 */     String nameString = new String(this.name);
/* 92 */     String valueString = new String(this.value);
/* 93 */     return nameString + ": " + valueString;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\twitter\hpack\HeaderField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */