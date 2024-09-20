/*    */ package javafx.util.converter;
/*    */ 
/*    */ import java.text.NumberFormat;
/*    */ import java.util.Locale;
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
/*    */ public class PercentageStringConverter
/*    */   extends NumberStringConverter
/*    */ {
/*    */   public PercentageStringConverter() {
/* 47 */     this(Locale.getDefault());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public PercentageStringConverter(Locale paramLocale) {
/* 56 */     super(paramLocale, null, null);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public PercentageStringConverter(NumberFormat paramNumberFormat) {
/* 65 */     super(null, null, paramNumberFormat);
/*    */   }
/*    */ 
/*    */   
/*    */   public NumberFormat getNumberFormat() {
/* 70 */     Locale locale = (this.locale == null) ? Locale.getDefault() : this.locale;
/*    */     
/* 72 */     if (this.numberFormat != null) {
/* 73 */       return this.numberFormat;
/*    */     }
/* 75 */     return NumberFormat.getPercentInstance(locale);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\converter\PercentageStringConverter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */