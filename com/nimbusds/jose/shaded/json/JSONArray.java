/*     */ package com.nimbusds.jose.shaded.json;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.json.reader.JsonWriter;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ public class JSONArray
/*     */   extends ArrayList<Object>
/*     */   implements List<Object>, JSONAwareEx, JSONStreamAwareEx
/*     */ {
/*     */   private static final long serialVersionUID = 9106884089231309568L;
/*     */   
/*     */   public static String toJSONString(List<? extends Object> list) {
/*  34 */     return toJSONString(list, JSONValue.COMPRESSION);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String toJSONString(List<? extends Object> list, JSONStyle compression) {
/*  50 */     StringBuilder sb = new StringBuilder();
/*     */     try {
/*  52 */       writeJSONString(list, sb, compression);
/*  53 */     } catch (IOException iOException) {}
/*     */ 
/*     */     
/*  56 */     return sb.toString();
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static void writeJSONString(Iterable<? extends Object> list, Appendable out, JSONStyle compression) throws IOException {
/*  71 */     if (list == null) {
/*  72 */       out.append("null");
/*     */       return;
/*     */     } 
/*  75 */     JsonWriter.JSONIterableWriter.writeJSONString(list, out, compression);
/*     */   }
/*     */   
/*     */   public static void writeJSONString(List<? extends Object> list, Appendable out) throws IOException {
/*  79 */     writeJSONString(list, out, JSONValue.COMPRESSION);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JSONArray appendElement(Object element) {
/*  90 */     add(element);
/*  91 */     return this;
/*     */   }
/*     */   
/*     */   public void merge(Object o2) {
/*  95 */     JSONObject.merge(this, o2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toJSONString() {
/* 102 */     return toJSONString(this, JSONValue.COMPRESSION);
/*     */   }
/*     */   
/*     */   public String toJSONString(JSONStyle compression) {
/* 106 */     return toJSONString(this, compression);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 113 */     return toJSONString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString(JSONStyle compression) {
/* 123 */     return toJSONString(compression);
/*     */   }
/*     */   
/*     */   public void writeJSONString(Appendable out) throws IOException {
/* 127 */     writeJSONString(this, out, JSONValue.COMPRESSION);
/*     */   }
/*     */   
/*     */   public void writeJSONString(Appendable out, JSONStyle compression) throws IOException {
/* 131 */     writeJSONString(this, out, compression);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\JSONArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */