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
/*    */ public class CharacterStringConverter
/*    */   extends StringConverter<Character>
/*    */ {
/*    */   public Character fromString(String paramString) {
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
/* 56 */     return Character.valueOf(paramString.charAt(0));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString(Character paramCharacter) {
/* 62 */     if (paramCharacter == null) {
/* 63 */       return "";
/*    */     }
/*    */     
/* 66 */     return paramCharacter.toString();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\converter\CharacterStringConverter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */