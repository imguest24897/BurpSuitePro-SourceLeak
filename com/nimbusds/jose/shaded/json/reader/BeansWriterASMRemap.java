/*    */ package com.nimbusds.jose.shaded.json.reader;
/*    */ 
/*    */ import com.nimbusds.jose.shaded.asm.Accessor;
/*    */ import com.nimbusds.jose.shaded.asm.BeansAccess;
/*    */ import com.nimbusds.jose.shaded.asm.FieldFilter;
/*    */ import com.nimbusds.jose.shaded.json.JSONObject;
/*    */ import com.nimbusds.jose.shaded.json.JSONStyle;
/*    */ import com.nimbusds.jose.shaded.json.JSONUtil;
/*    */ import java.io.IOException;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class BeansWriterASMRemap implements JsonWriterI<Object> {
/* 14 */   private Map<String, String> rename = new HashMap<>();
/*    */   
/*    */   public void renameField(String source, String dest) {
/* 17 */     this.rename.put(source, dest);
/*    */   }
/*    */   
/*    */   private String rename(String key) {
/* 21 */     String k2 = this.rename.get(key);
/* 22 */     if (k2 != null)
/* 23 */       return k2; 
/* 24 */     return key;
/*    */   }
/*    */   
/*    */   public <E> void writeJSONString(E value, Appendable out, JSONStyle compression) throws IOException {
/*    */     try {
/* 29 */       Class<?> cls = value.getClass();
/* 30 */       boolean needSep = false;
/*    */       
/* 32 */       BeansAccess fields = BeansAccess.get(cls, (FieldFilter)JSONUtil.JSON_SMART_FIELD_FILTER);
/* 33 */       out.append('{');
/* 34 */       for (Accessor field : fields.getAccessors()) {
/*    */         
/* 36 */         Object v = fields.get(value, field.getIndex());
/* 37 */         if (v != null || !compression.ignoreNull()) {
/*    */           
/* 39 */           if (needSep) {
/* 40 */             out.append(',');
/*    */           } else {
/* 42 */             needSep = true;
/* 43 */           }  String key = field.getName();
/* 44 */           key = rename(key);
/* 45 */           JSONObject.writeJSONKV(key, v, out, compression);
/*    */         } 
/* 47 */       }  out.append('}');
/* 48 */     } catch (IOException e) {
/* 49 */       throw e;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\reader\BeansWriterASMRemap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */