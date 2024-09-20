/*    */ package com.nimbusds.jose.shaded.json.reader;
/*    */ 
/*    */ import com.nimbusds.jose.shaded.asm.Accessor;
/*    */ import com.nimbusds.jose.shaded.asm.BeansAccess;
/*    */ import com.nimbusds.jose.shaded.asm.FieldFilter;
/*    */ import com.nimbusds.jose.shaded.json.JSONObject;
/*    */ import com.nimbusds.jose.shaded.json.JSONStyle;
/*    */ import com.nimbusds.jose.shaded.json.JSONUtil;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class BeansWriterASM implements JsonWriterI<Object> {
/*    */   public <E> void writeJSONString(E value, Appendable out, JSONStyle compression) throws IOException {
/*    */     try {
/* 14 */       Class<?> cls = value.getClass();
/* 15 */       boolean needSep = false;
/*    */       
/* 17 */       BeansAccess fields = BeansAccess.get(cls, (FieldFilter)JSONUtil.JSON_SMART_FIELD_FILTER);
/* 18 */       out.append('{');
/* 19 */       for (Accessor field : fields.getAccessors()) {
/*    */         
/* 21 */         Object v = fields.get(value, field.getIndex());
/* 22 */         if (v != null || !compression.ignoreNull()) {
/*    */           
/* 24 */           if (needSep) {
/* 25 */             out.append(',');
/*    */           } else {
/* 27 */             needSep = true;
/* 28 */           }  String key = field.getName();
/* 29 */           JSONObject.writeJSONKV(key, v, out, compression);
/*    */         } 
/* 31 */       }  out.append('}');
/* 32 */     } catch (IOException e) {
/* 33 */       throw e;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\reader\BeansWriterASM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */