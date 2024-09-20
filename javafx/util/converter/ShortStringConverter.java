/*    */ package javafx.util.converter;
/*    */ 
/*    */ import javafx.util.StringConverter;
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
/*    */ 
/*    */ 
/*    */ public class ShortStringConverter
/*    */   extends StringConverter<Short>
/*    */ {
/*    */   public Short fromString(String paramString) {
/* 45 */     if (paramString == null) {
/* 46 */       return null;
/*    */     }
/*    */     
/* 49 */     paramString = paramString.trim();
/*    */     
/* 51 */     if (paramString.length() < 1) {
/* 52 */       return null;
/*    */     }
/*    */     
/* 55 */     return Short.valueOf(paramString);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString(Short paramShort) {
/* 62 */     if (paramShort == null) {
/* 63 */       return "";
/*    */     }
/*    */     
/* 66 */     return Short.toString(paramShort.shortValue());
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\converter\ShortStringConverter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */