/*     */ package javafx.util.converter;
/*     */ 
/*     */ import java.text.DateFormat;
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
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
/*     */ public class DateTimeStringConverter
/*     */   extends StringConverter<Date>
/*     */ {
/*     */   final Locale locale;
/*     */   final String pattern;
/*     */   final DateFormat dateFormat;
/*     */   final int dateStyle;
/*     */   final int timeStyle;
/*     */   
/*     */   public DateTimeStringConverter() {
/*  65 */     this(null, null, null, 2, 2);
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
/*     */   
/*     */   public DateTimeStringConverter(int paramInt1, int paramInt2) {
/*  80 */     this(null, null, null, paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DateTimeStringConverter(Locale paramLocale) {
/*  90 */     this(paramLocale, null, null, 2, 2);
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
/*     */ 
/*     */   
/*     */   public DateTimeStringConverter(Locale paramLocale, int paramInt1, int paramInt2) {
/* 106 */     this(paramLocale, null, null, paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DateTimeStringConverter(String paramString) {
/* 116 */     this(null, paramString, null, 2, 2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DateTimeStringConverter(Locale paramLocale, String paramString) {
/* 127 */     this(paramLocale, paramString, null, 2, 2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DateTimeStringConverter(DateFormat paramDateFormat) {
/* 138 */     this(null, null, paramDateFormat, 2, 2);
/*     */   }
/*     */ 
/*     */   
/*     */   DateTimeStringConverter(Locale paramLocale, String paramString, DateFormat paramDateFormat, int paramInt1, int paramInt2) {
/* 143 */     this.locale = (paramLocale != null) ? paramLocale : Locale.getDefault(Locale.Category.FORMAT);
/* 144 */     this.pattern = paramString;
/* 145 */     this.dateFormat = paramDateFormat;
/* 146 */     this.dateStyle = paramInt1;
/* 147 */     this.timeStyle = paramInt2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date fromString(String paramString) {
/*     */     try {
/* 157 */       if (paramString == null) {
/* 158 */         return null;
/*     */       }
/*     */       
/* 161 */       paramString = paramString.trim();
/*     */       
/* 163 */       if (paramString.length() < 1) {
/* 164 */         return null;
/*     */       }
/*     */ 
/*     */       
/* 168 */       DateFormat dateFormat = getDateFormat();
/*     */ 
/*     */       
/* 171 */       return dateFormat.parse(paramString);
/* 172 */     } catch (ParseException parseException) {
/* 173 */       throw new RuntimeException(parseException);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString(Date paramDate) {
/* 180 */     if (paramDate == null) {
/* 181 */       return "";
/*     */     }
/*     */ 
/*     */     
/* 185 */     DateFormat dateFormat = getDateFormat();
/*     */ 
/*     */     
/* 188 */     return dateFormat.format(paramDate);
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
/*     */   DateFormat getDateFormat() {
/* 201 */     DateFormat dateFormat = null;
/*     */     
/* 203 */     if (this.dateFormat != null)
/* 204 */       return this.dateFormat; 
/* 205 */     if (this.pattern != null) {
/* 206 */       dateFormat = new SimpleDateFormat(this.pattern, this.locale);
/*     */     } else {
/* 208 */       dateFormat = DateFormat.getDateTimeInstance(this.dateStyle, this.timeStyle, this.locale);
/*     */     } 
/*     */     
/* 211 */     dateFormat.setLenient(false);
/*     */     
/* 213 */     return dateFormat;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\converter\DateTimeStringConverter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */