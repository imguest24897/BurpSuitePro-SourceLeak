/*    */ package com.nimbusds.jose.shaded.json.reader;
/*    */ 
/*    */ import com.nimbusds.jose.shaded.json.JSONStyle;
/*    */ import com.nimbusds.jose.shaded.json.JSONValue;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class ArrayWriter
/*    */   implements JsonWriterI<Object> {
/*    */   public <E> void writeJSONString(E value, Appendable out, JSONStyle compression) throws IOException {
/* 10 */     compression.arrayStart(out);
/* 11 */     boolean needSep = false;
/* 12 */     for (Object o : (Object[])value) {
/* 13 */       if (needSep) {
/* 14 */         compression.objectNext(out);
/*    */       } else {
/* 16 */         needSep = true;
/* 17 */       }  JSONValue.writeJSONString(o, out, compression);
/*    */     } 
/* 19 */     compression.arrayStop(out);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\reader\ArrayWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */