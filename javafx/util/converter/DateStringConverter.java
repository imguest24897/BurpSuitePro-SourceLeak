/*     */ package javafx.util.converter;
/*     */ 
/*     */ import java.text.DateFormat;
/*     */ import java.text.SimpleDateFormat;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DateStringConverter
/*     */   extends DateTimeStringConverter
/*     */ {
/*     */   public DateStringConverter() {
/*  50 */     this((Locale)null, (String)null, (DateFormat)null, 2);
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
/*     */   
/*     */   public DateStringConverter(int paramInt) {
/*  63 */     this((Locale)null, (String)null, (DateFormat)null, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DateStringConverter(Locale paramLocale) {
/*  73 */     this(paramLocale, (String)null, (DateFormat)null, 2);
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
/*     */ 
/*     */   
/*     */   public DateStringConverter(Locale paramLocale, int paramInt) {
/*  87 */     this(paramLocale, (String)null, (DateFormat)null, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DateStringConverter(String paramString) {
/*  97 */     this((Locale)null, paramString, (DateFormat)null, 2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DateStringConverter(Locale paramLocale, String paramString) {
/* 108 */     this(paramLocale, paramString, (DateFormat)null, 2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DateStringConverter(DateFormat paramDateFormat) {
/* 119 */     this((Locale)null, (String)null, paramDateFormat, 2);
/*     */   }
/*     */   
/*     */   private DateStringConverter(Locale paramLocale, String paramString, DateFormat paramDateFormat, int paramInt) {
/* 123 */     super(paramLocale, paramString, paramDateFormat, paramInt, 2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected DateFormat getDateFormat() {
/* 131 */     DateFormat dateFormat = null;
/*     */     
/* 133 */     if (this.dateFormat != null)
/* 134 */       return this.dateFormat; 
/* 135 */     if (this.pattern != null) {
/* 136 */       dateFormat = new SimpleDateFormat(this.pattern, this.locale);
/*     */     } else {
/* 138 */       dateFormat = DateFormat.getDateInstance(this.dateStyle, this.locale);
/*     */     } 
/*     */     
/* 141 */     dateFormat.setLenient(false);
/*     */     
/* 143 */     return dateFormat;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\converter\DateStringConverter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */