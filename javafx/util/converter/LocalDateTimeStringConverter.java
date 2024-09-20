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
/*     */ public class LocalDateTimeStringConverter
/*     */   extends StringConverter<LocalDateTime>
/*     */ {
/*     */   LdtConverter<LocalDateTime> ldtConverter;
/*     */   
/*     */   public LocalDateTimeStringConverter() {
/*  74 */     this.ldtConverter = new LdtConverter<>(LocalDateTime.class, null, null, null, null, null, null);
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
/*     */ 
/*     */   
/*     */   public LocalDateTimeStringConverter(FormatStyle paramFormatStyle1, FormatStyle paramFormatStyle2) {
/*  92 */     this.ldtConverter = new LdtConverter<>(LocalDateTime.class, null, null, paramFormatStyle1, paramFormatStyle2, null, null);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LocalDateTimeStringConverter(DateTimeFormatter paramDateTimeFormatter1, DateTimeFormatter paramDateTimeFormatter2) {
/* 120 */     this.ldtConverter = new LdtConverter<>(LocalDateTime.class, paramDateTimeFormatter1, paramDateTimeFormatter2, null, null, null, null);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LocalDateTimeStringConverter(FormatStyle paramFormatStyle1, FormatStyle paramFormatStyle2, Locale paramLocale, Chronology paramChronology) {
/* 144 */     this.ldtConverter = new LdtConverter<>(LocalDateTime.class, null, null, paramFormatStyle1, paramFormatStyle2, paramLocale, paramChronology);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LocalDateTime fromString(String paramString) {
/* 154 */     return this.ldtConverter.fromString(paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString(LocalDateTime paramLocalDateTime) {
/* 159 */     return this.ldtConverter.toString(paramLocalDateTime);
/*     */   }
/*     */ 
/*     */   
/*     */   static class LdtConverter<T extends Temporal>
/*     */     extends StringConverter<T>
/*     */   {
/*     */     private Class<T> type;
/*     */     Locale locale;
/*     */     Chronology chronology;
/*     */     DateTimeFormatter formatter;
/*     */     DateTimeFormatter parser;
/*     */     FormatStyle dateStyle;
/*     */     FormatStyle timeStyle;
/*     */     
/*     */     LdtConverter(Class<T> param1Class, DateTimeFormatter param1DateTimeFormatter1, DateTimeFormatter param1DateTimeFormatter2, FormatStyle param1FormatStyle1, FormatStyle param1FormatStyle2, Locale param1Locale, Chronology param1Chronology) {
/* 175 */       this.type = param1Class;
/* 176 */       this.formatter = param1DateTimeFormatter1;
/* 177 */       this.parser = (param1DateTimeFormatter2 != null) ? param1DateTimeFormatter2 : param1DateTimeFormatter1;
/* 178 */       this.locale = (param1Locale != null) ? param1Locale : Locale.getDefault(Locale.Category.FORMAT);
/* 179 */       this.chronology = (param1Chronology != null) ? param1Chronology : IsoChronology.INSTANCE;
/*     */       
/* 181 */       if (param1Class == LocalDate.class || param1Class == LocalDateTime.class) {
/* 182 */         this.dateStyle = (param1FormatStyle1 != null) ? param1FormatStyle1 : FormatStyle.SHORT;
/*     */       }
/*     */       
/* 185 */       if (param1Class == LocalTime.class || param1Class == LocalDateTime.class) {
/* 186 */         this.timeStyle = (param1FormatStyle2 != null) ? param1FormatStyle2 : FormatStyle.SHORT;
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public T fromString(String param1String) {
/* 193 */       if (param1String == null || param1String.isEmpty()) {
/* 194 */         return null;
/*     */       }
/*     */       
/* 197 */       param1String = param1String.trim();
/*     */       
/* 199 */       if (this.parser == null) {
/* 200 */         this.parser = getDefaultParser();
/*     */       }
/*     */       
/* 203 */       TemporalAccessor temporalAccessor = this.parser.parse(param1String);
/*     */       
/* 205 */       if (this.type == LocalDate.class)
/* 206 */         return (T)LocalDate.from(temporalAccessor); 
/* 207 */       if (this.type == LocalTime.class) {
/* 208 */         return (T)LocalTime.from(temporalAccessor);
/*     */       }
/* 210 */       return (T)LocalDateTime.from(temporalAccessor);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString(T param1T) {
/* 218 */       if (param1T == null) {
/* 219 */         return "";
/*     */       }
/*     */       
/* 222 */       if (this.formatter == null) {
/* 223 */         this.formatter = getDefaultFormatter();
/*     */       }
/*     */       
/* 226 */       return this.formatter.format((TemporalAccessor)param1T);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     private DateTimeFormatter getDefaultParser() {
/* 232 */       String str = DateTimeFormatterBuilder.getLocalizedDateTimePattern(this.dateStyle, this.timeStyle, this.chronology, this.locale);
/*     */       
/* 234 */       return (new DateTimeFormatterBuilder()).parseLenient()
/* 235 */         .appendPattern(str)
/* 236 */         .toFormatter()
/* 237 */         .withChronology(this.chronology)
/* 238 */         .withDecimalStyle(DecimalStyle.of(this.locale));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private DateTimeFormatter getDefaultFormatter() {
/* 248 */       if (this.dateStyle != null && this.timeStyle != null) {
/* 249 */         dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(this.dateStyle, this.timeStyle);
/* 250 */       } else if (this.dateStyle != null) {
/* 251 */         dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(this.dateStyle);
/*     */       } else {
/* 253 */         dateTimeFormatter = DateTimeFormatter.ofLocalizedTime(this.timeStyle);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 258 */       DateTimeFormatter dateTimeFormatter = dateTimeFormatter.withLocale(this.locale).withChronology(this.chronology).withDecimalStyle(DecimalStyle.of(this.locale));
/*     */       
/* 260 */       if (this.dateStyle != null) {
/* 261 */         dateTimeFormatter = fixFourDigitYear(dateTimeFormatter, this.dateStyle, this.timeStyle, this.chronology, this.locale);
/*     */       }
/*     */ 
/*     */       
/* 265 */       return dateTimeFormatter;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private DateTimeFormatter fixFourDigitYear(DateTimeFormatter param1DateTimeFormatter, FormatStyle param1FormatStyle1, FormatStyle param1FormatStyle2, Chronology param1Chronology, Locale param1Locale) {
/* 272 */       String str = DateTimeFormatterBuilder.getLocalizedDateTimePattern(param1FormatStyle1, param1FormatStyle2, param1Chronology, param1Locale);
/*     */       
/* 274 */       if (str.contains("yy") && !str.contains("yyy")) {
/*     */         
/* 276 */         String str1 = str.replace("yy", "yyyy");
/*     */         
/* 278 */         param1DateTimeFormatter = DateTimeFormatter.ofPattern(str1).withDecimalStyle(DecimalStyle.of(param1Locale));
/*     */       } 
/*     */       
/* 281 */       return param1DateTimeFormatter;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\converter\LocalDateTimeStringConverter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */