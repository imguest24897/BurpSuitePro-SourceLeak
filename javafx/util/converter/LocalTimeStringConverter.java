/*     */ package javafx.util.converter;
/*     */ 
/*     */ import java.time.LocalTime;
/*     */ import java.time.format.DateTimeFormatter;
/*     */ import java.time.format.FormatStyle;
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
/*     */ public class LocalTimeStringConverter
/*     */   extends StringConverter<LocalTime>
/*     */ {
/*     */   LocalDateTimeStringConverter.LdtConverter<LocalTime> ldtConverter;
/*     */   
/*     */   public LocalTimeStringConverter() {
/*  55 */     this.ldtConverter = new LocalDateTimeStringConverter.LdtConverter<>(LocalTime.class, null, null, null, null, null, null);
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
/*     */   public LocalTimeStringConverter(FormatStyle paramFormatStyle) {
/*  68 */     this.ldtConverter = new LocalDateTimeStringConverter.LdtConverter<>(LocalTime.class, null, null, null, paramFormatStyle, null, null);
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
/*     */   public LocalTimeStringConverter(FormatStyle paramFormatStyle, Locale paramLocale) {
/*  84 */     this.ldtConverter = new LocalDateTimeStringConverter.LdtConverter<>(LocalTime.class, null, null, null, paramFormatStyle, paramLocale, null);
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
/*     */   public LocalTimeStringConverter(DateTimeFormatter paramDateTimeFormatter1, DateTimeFormatter paramDateTimeFormatter2) {
/* 111 */     this.ldtConverter = new LocalDateTimeStringConverter.LdtConverter<>(LocalTime.class, paramDateTimeFormatter1, paramDateTimeFormatter2, null, null, null, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LocalTime fromString(String paramString) {
/* 119 */     return this.ldtConverter.fromString(paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString(LocalTime paramLocalTime) {
/* 124 */     return this.ldtConverter.toString(paramLocalTime);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\converter\LocalTimeStringConverter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */