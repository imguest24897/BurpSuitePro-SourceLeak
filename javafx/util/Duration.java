/*     */ package javafx.util;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javafx.beans.NamedArg;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Duration
/*     */   implements Comparable<Duration>, Serializable
/*     */ {
/*  44 */   public static final Duration ZERO = new Duration(0.0D);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  49 */   public static final Duration ONE = new Duration(1.0D);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  54 */   public static final Duration INDEFINITE = new Duration(Double.POSITIVE_INFINITY);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  59 */   public static final Duration UNKNOWN = new Duration(Double.NaN);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final double millis;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Duration valueOf(String paramString) {
/*  71 */     byte b = -1;
/*  72 */     for (byte b1 = 0; b1 < paramString.length(); b1++) {
/*  73 */       char c = paramString.charAt(b1);
/*  74 */       if (!Character.isDigit(c) && c != '.' && c != '-') {
/*  75 */         b = b1;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/*  80 */     if (b == -1)
/*     */     {
/*  82 */       throw new IllegalArgumentException("The time parameter must have a suffix of [ms|s|m|h]");
/*     */     }
/*     */     
/*  85 */     double d = Double.parseDouble(paramString.substring(0, b));
/*  86 */     String str = paramString.substring(b);
/*  87 */     if ("ms".equals(str))
/*  88 */       return millis(d); 
/*  89 */     if ("s".equals(str))
/*  90 */       return seconds(d); 
/*  91 */     if ("m".equals(str))
/*  92 */       return minutes(d); 
/*  93 */     if ("h".equals(str)) {
/*  94 */       return hours(d);
/*     */     }
/*     */     
/*  97 */     throw new IllegalArgumentException("The time parameter must have a suffix of [ms|s|m|h]");
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
/*     */   public static Duration millis(double paramDouble) {
/* 109 */     if (paramDouble == 0.0D)
/* 110 */       return ZERO; 
/* 111 */     if (paramDouble == 1.0D)
/* 112 */       return ONE; 
/* 113 */     if (paramDouble == Double.POSITIVE_INFINITY)
/* 114 */       return INDEFINITE; 
/* 115 */     if (Double.isNaN(paramDouble)) {
/* 116 */       return UNKNOWN;
/*     */     }
/* 118 */     return new Duration(paramDouble);
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
/*     */   public static Duration seconds(double paramDouble) {
/* 130 */     if (paramDouble == 0.0D)
/* 131 */       return ZERO; 
/* 132 */     if (paramDouble == Double.POSITIVE_INFINITY)
/* 133 */       return INDEFINITE; 
/* 134 */     if (Double.isNaN(paramDouble)) {
/* 135 */       return UNKNOWN;
/*     */     }
/* 137 */     return new Duration(paramDouble * 1000.0D);
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
/*     */   public static Duration minutes(double paramDouble) {
/* 149 */     if (paramDouble == 0.0D)
/* 150 */       return ZERO; 
/* 151 */     if (paramDouble == Double.POSITIVE_INFINITY)
/* 152 */       return INDEFINITE; 
/* 153 */     if (Double.isNaN(paramDouble)) {
/* 154 */       return UNKNOWN;
/*     */     }
/* 156 */     return new Duration(paramDouble * 60000.0D);
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
/*     */   public static Duration hours(double paramDouble) {
/* 168 */     if (paramDouble == 0.0D)
/* 169 */       return ZERO; 
/* 170 */     if (paramDouble == Double.POSITIVE_INFINITY)
/* 171 */       return INDEFINITE; 
/* 172 */     if (Double.isNaN(paramDouble)) {
/* 173 */       return UNKNOWN;
/*     */     }
/* 175 */     return new Duration(paramDouble * 3600000.0D);
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
/*     */   public Duration(@NamedArg("millis") double paramDouble) {
/* 189 */     this.millis = paramDouble;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double toMillis() {
/* 198 */     return this.millis;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double toSeconds() {
/* 207 */     return this.millis / 1000.0D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double toMinutes() {
/* 216 */     return this.millis / 60000.0D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double toHours() {
/* 225 */     return this.millis / 3600000.0D;
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
/*     */   public Duration add(Duration paramDuration) {
/* 241 */     return millis(this.millis + paramDuration.millis);
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
/*     */   public Duration subtract(Duration paramDuration) {
/* 255 */     return millis(this.millis - paramDuration.millis);
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
/*     */   @Deprecated
/*     */   public Duration multiply(Duration paramDuration) {
/* 272 */     return millis(this.millis * paramDuration.millis);
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
/*     */   public Duration multiply(double paramDouble) {
/* 286 */     return millis(this.millis * paramDouble);
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
/*     */   public Duration divide(double paramDouble) {
/* 300 */     return millis(this.millis / paramDouble);
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
/*     */   @Deprecated
/*     */   public Duration divide(Duration paramDuration) {
/* 318 */     return millis(this.millis / paramDuration.millis);
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
/*     */   public Duration negate() {
/* 332 */     return millis(-this.millis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isIndefinite() {
/* 341 */     return (this.millis == Double.POSITIVE_INFINITY);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isUnknown() {
/* 350 */     return Double.isNaN(this.millis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean lessThan(Duration paramDuration) {
/* 361 */     return (this.millis < paramDuration.millis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean lessThanOrEqualTo(Duration paramDuration) {
/* 372 */     return (this.millis <= paramDuration.millis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean greaterThan(Duration paramDuration) {
/* 383 */     return (this.millis > paramDuration.millis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean greaterThanOrEqualTo(Duration paramDuration) {
/* 394 */     return (this.millis >= paramDuration.millis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 402 */     return isIndefinite() ? "INDEFINITE" : (isUnknown() ? "UNKNOWN" : ("" + this.millis + " ms"));
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
/*     */   public int compareTo(Duration paramDuration) {
/* 415 */     return Double.compare(this.millis, paramDuration.millis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 425 */     return (paramObject == this || (paramObject instanceof Duration && this.millis == ((Duration)paramObject).millis));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 434 */     long l = Double.doubleToLongBits(this.millis);
/* 435 */     return (int)(l ^ l >>> 32L);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\Duration.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */