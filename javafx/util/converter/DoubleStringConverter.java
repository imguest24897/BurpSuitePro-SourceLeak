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
/*    */ public class DoubleStringConverter
/*    */   extends StringConverter<Double>
/*    */ {
/*    */   public Double fromString(String paramString) {
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
/* 56 */     return Double.valueOf(paramString);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString(Double paramDouble) {
/* 62 */     if (paramDouble == null) {
/* 63 */       return "";
/*    */     }
/*    */     
/* 66 */     return Double.toString(paramDouble.doubleValue());
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\converter\DoubleStringConverter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */