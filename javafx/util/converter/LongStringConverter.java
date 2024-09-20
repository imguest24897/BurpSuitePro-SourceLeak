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
/*    */ 
/*    */ public class LongStringConverter
/*    */   extends StringConverter<Long>
/*    */ {
/*    */   public Long fromString(String paramString) {
/* 46 */     if (paramString == null) {
/* 47 */       return null;
/*    */     }
/*    */     
/* 50 */     paramString = paramString.trim();
/*    */     
/* 52 */     if (paramString.length() < 1) {
/* 53 */       return null;
/*    */     }
/*    */     
/* 56 */     return Long.valueOf(paramString);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString(Long paramLong) {
/* 62 */     if (paramLong == null) {
/* 63 */       return "";
/*    */     }
/*    */     
/* 66 */     return Long.toString(paramLong.longValue());
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\converter\LongStringConverter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */