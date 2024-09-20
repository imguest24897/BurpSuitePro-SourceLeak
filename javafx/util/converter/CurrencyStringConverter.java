/*     */ package javafx.util.converter;
/*     */ 
/*     */ import java.text.DecimalFormat;
/*     */ import java.text.DecimalFormatSymbols;
/*     */ import java.text.NumberFormat;
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CurrencyStringConverter
/*     */   extends NumberStringConverter
/*     */ {
/*     */   public CurrencyStringConverter() {
/*  48 */     this(Locale.getDefault());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CurrencyStringConverter(Locale paramLocale) {
/*  57 */     this(paramLocale, (String)null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CurrencyStringConverter(String paramString) {
/*  68 */     this(Locale.getDefault(), paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CurrencyStringConverter(Locale paramLocale, String paramString) {
/*  80 */     super(paramLocale, paramString, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CurrencyStringConverter(NumberFormat paramNumberFormat) {
/*  89 */     super(null, null, paramNumberFormat);
/*     */   }
/*     */ 
/*     */   
/*     */   protected NumberFormat getNumberFormat() {
/*  94 */     Locale locale = (this.locale == null) ? Locale.getDefault() : this.locale;
/*     */     
/*  96 */     if (this.numberFormat != null)
/*  97 */       return this.numberFormat; 
/*  98 */     if (this.pattern != null) {
/*  99 */       DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
/* 100 */       return new DecimalFormat(this.pattern, decimalFormatSymbols);
/*     */     } 
/* 102 */     return NumberFormat.getCurrencyInstance(locale);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\converter\CurrencyStringConverter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */