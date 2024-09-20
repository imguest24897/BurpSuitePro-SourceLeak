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
/*     */ 
/*     */ public class TimeStringConverter
/*     */   extends DateTimeStringConverter
/*     */ {
/*     */   public TimeStringConverter() {
/*  51 */     this((Locale)null, (String)null, (DateFormat)null, 2);
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
/*     */   public TimeStringConverter(int paramInt) {
/*  64 */     this((Locale)null, (String)null, (DateFormat)null, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TimeStringConverter(Locale paramLocale) {
/*  74 */     this(paramLocale, (String)null, (DateFormat)null, 2);
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
/*     */   public TimeStringConverter(Locale paramLocale, int paramInt) {
/*  88 */     this(paramLocale, (String)null, (DateFormat)null, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TimeStringConverter(String paramString) {
/*  98 */     this((Locale)null, paramString, (DateFormat)null, 2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TimeStringConverter(Locale paramLocale, String paramString) {
/* 109 */     this(paramLocale, paramString, (DateFormat)null, 2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TimeStringConverter(DateFormat paramDateFormat) {
/* 120 */     this((Locale)null, (String)null, paramDateFormat, 2);
/*     */   }
/*     */   
/*     */   private TimeStringConverter(Locale paramLocale, String paramString, DateFormat paramDateFormat, int paramInt) {
/* 124 */     super(paramLocale, paramString, paramDateFormat, 2, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected DateFormat getDateFormat() {
/* 132 */     DateFormat dateFormat = null;
/*     */     
/* 134 */     if (this.dateFormat != null)
/* 135 */       return this.dateFormat; 
/* 136 */     if (this.pattern != null) {
/* 137 */       dateFormat = new SimpleDateFormat(this.pattern, this.locale);
/*     */     } else {
/* 139 */       dateFormat = DateFormat.getTimeInstance(this.timeStyle, this.locale);
/*     */     } 
/*     */     
/* 142 */     dateFormat.setLenient(false);
/*     */     
/* 144 */     return dateFormat;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\converter\TimeStringConverter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */