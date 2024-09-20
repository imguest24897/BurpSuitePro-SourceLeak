/*     */ package javafx.util.converter;
/*     */ 
/*     */ import java.text.Format;
/*     */ import java.text.ParsePosition;
/*     */ import javafx.beans.NamedArg;
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
/*     */ public class FormatStringConverter<T>
/*     */   extends StringConverter<T>
/*     */ {
/*     */   final Format format;
/*     */   
/*     */   public FormatStringConverter(@NamedArg("format") Format paramFormat) {
/*  51 */     this.format = paramFormat;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public T fromString(String paramString) {
/*  59 */     if (paramString == null) {
/*  60 */       return null;
/*     */     }
/*     */     
/*  63 */     paramString = paramString.trim();
/*     */     
/*  65 */     if (paramString.length() < 1) {
/*  66 */       return null;
/*     */     }
/*     */ 
/*     */     
/*  70 */     Format format = getFormat();
/*     */ 
/*     */ 
/*     */     
/*  74 */     ParsePosition parsePosition = new ParsePosition(0);
/*  75 */     Object object = format.parseObject(paramString, parsePosition);
/*  76 */     if (parsePosition.getIndex() != paramString.length()) {
/*  77 */       throw new RuntimeException("Parsed string not according to the format");
/*     */     }
/*  79 */     return (T)object;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString(T paramT) {
/*  85 */     if (paramT == null) {
/*  86 */       return "";
/*     */     }
/*     */ 
/*     */     
/*  90 */     Format format = getFormat();
/*     */ 
/*     */     
/*  93 */     return format.format(paramT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Format getFormat() {
/* 103 */     return this.format;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\converter\FormatStringConverter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */