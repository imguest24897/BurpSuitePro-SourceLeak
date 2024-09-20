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
/*    */ public class FloatStringConverter
/*    */   extends StringConverter<Float>
/*    */ {
/*    */   public Float fromString(String paramString) {
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
/* 56 */     return Float.valueOf(paramString);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString(Float paramFloat) {
/* 62 */     if (paramFloat == null) {
/* 63 */       return "";
/*    */     }
/*    */     
/* 66 */     return Float.toString(paramFloat.floatValue());
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\converter\FloatStringConverter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */