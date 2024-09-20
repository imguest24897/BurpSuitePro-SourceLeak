/*     */ package com.twitter.hpack;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ final class StaticTable
/*     */ {
/*     */   private static final String EMPTY = "";
/*  31 */   private static final List<HeaderField> STATIC_TABLE = Arrays.asList(new HeaderField[] { new HeaderField(":authority", ""), new HeaderField(":method", "GET"), new HeaderField(":method", "POST"), new HeaderField(":path", "/"), new HeaderField(":path", "/index.html"), new HeaderField(":scheme", "http"), new HeaderField(":scheme", "https"), new HeaderField(":status", "200"), new HeaderField(":status", "204"), new HeaderField(":status", "206"), new HeaderField(":status", "304"), new HeaderField(":status", "400"), new HeaderField(":status", "404"), new HeaderField(":status", "500"), new HeaderField("accept-charset", ""), new HeaderField("accept-encoding", "gzip, deflate"), new HeaderField("accept-language", ""), new HeaderField("accept-ranges", ""), new HeaderField("accept", ""), new HeaderField("access-control-allow-origin", ""), new HeaderField("age", ""), new HeaderField("allow", ""), new HeaderField("authorization", ""), new HeaderField("cache-control", ""), new HeaderField("content-disposition", ""), new HeaderField("content-encoding", ""), new HeaderField("content-language", ""), new HeaderField("content-length", ""), new HeaderField("content-location", ""), new HeaderField("content-range", ""), new HeaderField("content-type", ""), new HeaderField("cookie", ""), new HeaderField("date", ""), new HeaderField("etag", ""), new HeaderField("expect", ""), new HeaderField("expires", ""), new HeaderField("from", ""), new HeaderField("host", ""), new HeaderField("if-match", ""), new HeaderField("if-modified-since", ""), new HeaderField("if-none-match", ""), new HeaderField("if-range", ""), new HeaderField("if-unmodified-since", ""), new HeaderField("last-modified", ""), new HeaderField("link", ""), new HeaderField("location", ""), new HeaderField("max-forwards", ""), new HeaderField("proxy-authenticate", ""), new HeaderField("proxy-authorization", ""), new HeaderField("range", ""), new HeaderField("referer", ""), new HeaderField("refresh", ""), new HeaderField("retry-after", ""), new HeaderField("server", ""), new HeaderField("set-cookie", ""), new HeaderField("strict-transport-security", ""), new HeaderField("transfer-encoding", ""), new HeaderField("user-agent", ""), new HeaderField("vary", ""), new HeaderField("via", ""), new HeaderField("www-authenticate", "") });
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
/*  95 */   private static final Map<String, Integer> STATIC_INDEX_BY_NAME = createMap();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 100 */   static final int length = STATIC_TABLE.size();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static HeaderField getEntry(int index) {
/* 106 */     return STATIC_TABLE.get(index - 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static int getIndex(byte[] name) {
/* 114 */     String nameString = new String(name, 0, name.length, HpackUtil.ISO_8859_1);
/* 115 */     Integer index = STATIC_INDEX_BY_NAME.get(nameString);
/* 116 */     if (index == null) {
/* 117 */       return -1;
/*     */     }
/* 119 */     return index.intValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static int getIndex(byte[] name, byte[] value) {
/* 127 */     int index = getIndex(name);
/* 128 */     if (index == -1) {
/* 129 */       return -1;
/*     */     }
/*     */ 
/*     */     
/* 133 */     while (index <= length) {
/* 134 */       HeaderField entry = getEntry(index);
/* 135 */       if (!HpackUtil.equals(name, entry.name)) {
/*     */         break;
/*     */       }
/* 138 */       if (HpackUtil.equals(value, entry.value)) {
/* 139 */         return index;
/*     */       }
/* 141 */       index++;
/*     */     } 
/*     */     
/* 144 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   private static Map<String, Integer> createMap() {
/* 149 */     int length = STATIC_TABLE.size();
/* 150 */     HashMap<String, Integer> ret = new HashMap<String, Integer>(length);
/*     */ 
/*     */     
/* 153 */     for (int index = length; index > 0; index--) {
/* 154 */       HeaderField entry = getEntry(index);
/* 155 */       String name = new String(entry.name, 0, entry.name.length, HpackUtil.ISO_8859_1);
/* 156 */       ret.put(name, Integer.valueOf(index));
/*     */     } 
/* 158 */     return ret;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\twitter\hpack\StaticTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */