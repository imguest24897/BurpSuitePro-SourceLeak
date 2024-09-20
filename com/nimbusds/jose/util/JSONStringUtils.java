/*    */ package com.nimbusds.jose.util;
/*    */ 
/*    */ import com.nimbusds.jose.shaded.json.JSONObject;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class JSONStringUtils
/*    */ {
/*    */   public static String toJSONString(String string) {
/* 42 */     return "\"" + JSONObject.escape(string) + "\"";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jos\\util\JSONStringUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */