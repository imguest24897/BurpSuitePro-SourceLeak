/*     */ package javafx.util.converter;
/*     */ 
/*     */ import java.time.LocalDate;
/*     */ import java.time.LocalDateTime;
/*     */ import java.time.LocalTime;
/*     */ import java.time.chrono.Chronology;
/*     */ import java.time.chrono.IsoChronology;
/*     */ import java.time.format.DateTimeFormatter;
/*     */ import java.time.format.DateTimeFormatterBuilder;
/*     */ import java.time.format.DecimalStyle;
/*     */ import java.time.format.FormatStyle;
/*     */ import java.time.temporal.Temporal;
/*     */ import java.time.temporal.TemporalAccessor;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class LdtConverter<T extends Temporal>
/*     */   extends StringConverter<T>
/*     */ {
/*     */   private Class<T> type;
/*     */   Locale locale;
/*     */   Chronology chronology;
/*     */   DateTimeFormatter formatter;
/*     */   DateTimeFormatter parser;
/*     */   FormatStyle dateStyle;
/*     */   FormatStyle timeStyle;
/*     */   
/*     */   LdtConverter(Class<T> paramClass, DateTimeFormatter paramDateTimeFormatter1, DateTimeFormatter paramDateTimeFormatter2, FormatStyle paramFormatStyle1, FormatStyle paramFormatStyle2, Locale paramLocale, Chronology paramChronology) {
/* 175 */     this.type = paramClass;
/* 176 */     this.formatter = paramDateTimeFormatter1;
/* 177 */     this.parser = (paramDateTimeFormatter2 != null) ? paramDateTimeFormatter2 : paramDateTimeFormatter1;
/* 178 */     this.locale = (paramLocale != null) ? paramLocale : Locale.getDefault(Locale.Category.FORMAT);
/* 179 */     this.chronology = (paramChronology != null) ? paramChronology : IsoChronology.INSTANCE;
/*     */     
/* 181 */     if (paramClass == LocalDate.class || paramClass == LocalDateTime.class) {
/* 182 */       this.dateStyle = (paramFormatStyle1 != null) ? paramFormatStyle1 : FormatStyle.SHORT;
/*     */     }
/*     */     
/* 185 */     if (paramClass == LocalTime.class || paramClass == LocalDateTime.class) {
/* 186 */       this.timeStyle = (paramFormatStyle2 != null) ? paramFormatStyle2 : FormatStyle.SHORT;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public T fromString(String paramString) {
/* 193 */     if (paramString == null || paramString.isEmpty()) {
/* 194 */       return null;
/*     */     }
/*     */     
/* 197 */     paramString = paramString.trim();
/*     */     
/* 199 */     if (this.parser == null) {
/* 200 */       this.parser = getDefaultParser();
/*     */     }
/*     */     
/* 203 */     TemporalAccessor temporalAccessor = this.parser.parse(paramString);
/*     */     
/* 205 */     if (this.type == LocalDate.class)
/* 206 */       return (T)LocalDate.from(temporalAccessor); 
/* 207 */     if (this.type == LocalTime.class) {
/* 208 */       return (T)LocalTime.from(temporalAccessor);
/*     */     }
/* 210 */     return (T)LocalDateTime.from(temporalAccessor);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString(T paramT) {
/* 218 */     if (paramT == null) {
/* 219 */       return "";
/*     */     }
/*     */     
/* 222 */     if (this.formatter == null) {
/* 223 */       this.formatter = getDefaultFormatter();
/*     */     }
/*     */     
/* 226 */     return this.formatter.format((TemporalAccessor)paramT);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private DateTimeFormatter getDefaultParser() {
/* 232 */     String str = DateTimeFormatterBuilder.getLocalizedDateTimePattern(this.dateStyle, this.timeStyle, this.chronology, this.locale);
/*     */     
/* 234 */     return (new DateTimeFormatterBuilder()).parseLenient()
/* 235 */       .appendPattern(str)
/* 236 */       .toFormatter()
/* 237 */       .withChronology(this.chronology)
/* 238 */       .withDecimalStyle(DecimalStyle.of(this.locale));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private DateTimeFormatter getDefaultFormatter() {
/* 248 */     if (this.dateStyle != null && this.timeStyle != null) {
/* 249 */       dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(this.dateStyle, this.timeStyle);
/* 250 */     } else if (this.dateStyle != null) {
/* 251 */       dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(this.dateStyle);
/*     */     } else {
/* 253 */       dateTimeFormatter = DateTimeFormatter.ofLocalizedTime(this.timeStyle);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 258 */     DateTimeFormatter dateTimeFormatter = dateTimeFormatter.withLocale(this.locale).withChronology(this.chronology).withDecimalStyle(DecimalStyle.of(this.locale));
/*     */     
/* 260 */     if (this.dateStyle != null) {
/* 261 */       dateTimeFormatter = fixFourDigitYear(dateTimeFormatter, this.dateStyle, this.timeStyle, this.chronology, this.locale);
/*     */     }
/*     */ 
/*     */     
/* 265 */     return dateTimeFormatter;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private DateTimeFormatter fixFourDigitYear(DateTimeFormatter paramDateTimeFormatter, FormatStyle paramFormatStyle1, FormatStyle paramFormatStyle2, Chronology paramChronology, Locale paramLocale) {
/* 272 */     String str = DateTimeFormatterBuilder.getLocalizedDateTimePattern(paramFormatStyle1, paramFormatStyle2, paramChronology, paramLocale);
/*     */     
/* 274 */     if (str.contains("yy") && !str.contains("yyy")) {
/*     */       
/* 276 */       String str1 = str.replace("yy", "yyyy");
/*     */       
/* 278 */       paramDateTimeFormatter = DateTimeFormatter.ofPattern(str1).withDecimalStyle(DecimalStyle.of(paramLocale));
/*     */     } 
/*     */     
/* 281 */     return paramDateTimeFormatter;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\converter\LocalDateTimeStringConverter$LdtConverter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */