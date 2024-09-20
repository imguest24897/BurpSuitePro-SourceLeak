/*     */ package com.twitter.hpack;
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
/*     */ final class DynamicTable
/*     */ {
/*     */   HeaderField[] headerFields;
/*     */   int head;
/*     */   int tail;
/*     */   private int size;
/*  27 */   private int capacity = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   DynamicTable(int initialCapacity) {
/*  33 */     setCapacity(initialCapacity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int length() {
/*     */     int length;
/*  41 */     if (this.head < this.tail) {
/*  42 */       length = this.headerFields.length - this.tail + this.head;
/*     */     } else {
/*  44 */       length = this.head - this.tail;
/*     */     } 
/*  46 */     return length;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int size() {
/*  54 */     return this.size;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int capacity() {
/*  61 */     return this.capacity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public HeaderField getEntry(int index) {
/*  70 */     if (index <= 0 || index > length()) {
/*  71 */       throw new IndexOutOfBoundsException();
/*     */     }
/*  73 */     int i = this.head - index;
/*  74 */     if (i < 0) {
/*  75 */       return this.headerFields[i + this.headerFields.length];
/*     */     }
/*  77 */     return this.headerFields[i];
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
/*     */   public void add(HeaderField header) {
/*  89 */     int headerSize = header.size();
/*  90 */     if (headerSize > this.capacity) {
/*  91 */       clear();
/*     */       return;
/*     */     } 
/*  94 */     while (this.size + headerSize > this.capacity) {
/*  95 */       remove();
/*     */     }
/*  97 */     this.headerFields[this.head++] = header;
/*  98 */     this.size += header.size();
/*  99 */     if (this.head == this.headerFields.length) {
/* 100 */       this.head = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public HeaderField remove() {
/* 108 */     HeaderField removed = this.headerFields[this.tail];
/* 109 */     if (removed == null) {
/* 110 */       return null;
/*     */     }
/* 112 */     this.size -= removed.size();
/* 113 */     this.headerFields[this.tail++] = null;
/* 114 */     if (this.tail == this.headerFields.length) {
/* 115 */       this.tail = 0;
/*     */     }
/* 117 */     return removed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void clear() {
/* 124 */     while (this.tail != this.head) {
/* 125 */       this.headerFields[this.tail++] = null;
/* 126 */       if (this.tail == this.headerFields.length) {
/* 127 */         this.tail = 0;
/*     */       }
/*     */     } 
/* 130 */     this.head = 0;
/* 131 */     this.tail = 0;
/* 132 */     this.size = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapacity(int capacity) {
/* 141 */     if (capacity < 0) {
/* 142 */       throw new IllegalArgumentException("Illegal Capacity: " + capacity);
/*     */     }
/*     */ 
/*     */     
/* 146 */     if (this.capacity == capacity) {
/*     */       return;
/*     */     }
/* 149 */     this.capacity = capacity;
/*     */     
/* 151 */     if (capacity == 0) {
/* 152 */       clear();
/*     */     } else {
/*     */       
/* 155 */       while (this.size > capacity) {
/* 156 */         remove();
/*     */       }
/*     */     } 
/*     */     
/* 160 */     int maxEntries = capacity / 32;
/* 161 */     if (capacity % 32 != 0) {
/* 162 */       maxEntries++;
/*     */     }
/*     */ 
/*     */     
/* 166 */     if (this.headerFields != null && this.headerFields.length == maxEntries) {
/*     */       return;
/*     */     }
/*     */     
/* 170 */     HeaderField[] tmp = new HeaderField[maxEntries];
/*     */ 
/*     */     
/* 173 */     int len = length();
/* 174 */     int cursor = this.tail;
/* 175 */     for (int i = 0; i < len; i++) {
/* 176 */       HeaderField entry = this.headerFields[cursor++];
/* 177 */       tmp[i] = entry;
/* 178 */       if (cursor == this.headerFields.length) {
/* 179 */         cursor = 0;
/*     */       }
/*     */     } 
/*     */     
/* 183 */     this.tail = 0;
/* 184 */     this.head = this.tail + len;
/* 185 */     this.headerFields = tmp;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\twitter\hpack\DynamicTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */