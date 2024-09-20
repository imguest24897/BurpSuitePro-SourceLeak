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
/*    */ public class ByteStringConverter
/*    */   extends StringConverter<Byte>
/*    */ {
/*    */   public Byte fromString(String paramString) {
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
/* 56 */     return Byte.valueOf(paramString);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString(Byte paramByte) {
/* 62 */     if (paramByte == null) {
/* 63 */       return "";
/*    */     }
/*    */     
/* 66 */     return Byte.toString(paramByte.byteValue());
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\converter\ByteStringConverter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */