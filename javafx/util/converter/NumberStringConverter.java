/*     */ package javafx.util.converter;
/*     */ 
/*     */ import java.text.DecimalFormat;
/*     */ import java.text.DecimalFormatSymbols;
/*     */ import java.text.NumberFormat;
/*     */ import java.text.ParseException;
/*     */ import java.util.Locale;
/*     */ import javafx.util.StringConverter;
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
/*     */ public class NumberStringConverter
/*     */   extends StringConverter<Number>
/*     */ {
/*     */   final Locale locale;
/*     */   final String pattern;
/*     */   final NumberFormat numberFormat;
/*     */   
/*     */   public NumberStringConverter() {
/*  50 */     this(Locale.getDefault());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NumberStringConverter(Locale paramLocale) {
/*  59 */     this(paramLocale, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NumberStringConverter(String paramString) {
/*  70 */     this(Locale.getDefault(), paramString);
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
/*     */   public NumberStringConverter(Locale paramLocale, String paramString) {
/*  82 */     this(paramLocale, paramString, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NumberStringConverter(NumberFormat paramNumberFormat) {
/*  91 */     this(null, null, paramNumberFormat);
/*     */   }
/*     */   
/*     */   NumberStringConverter(Locale paramLocale, String paramString, NumberFormat paramNumberFormat) {
/*  95 */     this.locale = paramLocale;
/*  96 */     this.pattern = paramString;
/*  97 */     this.numberFormat = paramNumberFormat;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Number fromString(String paramString) {
/*     */     try {
/* 104 */       if (paramString == null) {
/* 105 */         return null;
/*     */       }
/*     */       
/* 108 */       paramString = paramString.trim();
/*     */       
/* 110 */       if (paramString.length() < 1) {
/* 111 */         return null;
/*     */       }
/*     */ 
/*     */       
/* 115 */       NumberFormat numberFormat = getNumberFormat();
/*     */ 
/*     */       
/* 118 */       return numberFormat.parse(paramString);
/* 119 */     } catch (ParseException parseException) {
/* 120 */       throw new RuntimeException(parseException);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString(Number paramNumber) {
/* 127 */     if (paramNumber == null) {
/* 128 */       return "";
/*     */     }
/*     */ 
/*     */     
/* 132 */     NumberFormat numberFormat = getNumberFormat();
/*     */ 
/*     */     
/* 135 */     return numberFormat.format(paramNumber);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected NumberFormat getNumberFormat() {
/* 146 */     Locale locale = (this.locale == null) ? Locale.getDefault() : this.locale;
/*     */     
/* 148 */     if (this.numberFormat != null)
/* 149 */       return this.numberFormat; 
/* 150 */     if (this.pattern != null) {
/* 151 */       DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
/* 152 */       return new DecimalFormat(this.pattern, decimalFormatSymbols);
/*     */     } 
/* 154 */     return NumberFormat.getNumberInstance(locale);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\converter\NumberStringConverter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */