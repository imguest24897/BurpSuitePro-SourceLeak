/*     */ package com.github.weisj.jsvg.attributes;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.paint.PaintParser;
/*     */ import com.github.weisj.jsvg.attributes.paint.SVGPaint;
/*     */ import com.github.weisj.jsvg.geometry.size.AngleUnit;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.Unit;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.parser.SeparatorMode;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import org.jetbrains.annotations.Contract;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class AttributeParser
/*     */ {
/*     */   @NotNull
/*     */   private final PaintParser paintParser;
/*     */   
/*     */   public AttributeParser(@NotNull PaintParser paintParser) {
/*  48 */     this.paintParser = paintParser;
/*     */   }
/*     */   @Contract("_,!null -> !null")
/*     */   @Nullable
/*     */   public Length parseLength(@Nullable String value, @Nullable Length fallback) {
/*  53 */     if (value == null) return fallback; 
/*  54 */     Unit unit = Unit.Raw;
/*  55 */     String lower = value.toLowerCase(Locale.ENGLISH);
/*  56 */     for (Unit u : Unit.units()) {
/*  57 */       if (lower.endsWith(u.suffix())) {
/*  58 */         unit = u;
/*     */         break;
/*     */       } 
/*     */     } 
/*  62 */     String str = lower.substring(0, lower.length() - unit.suffix().length());
/*     */     try {
/*  64 */       return unit.valueOf(Float.parseFloat(str));
/*  65 */     } catch (NumberFormatException e) {
/*  66 */       return fallback;
/*     */     } 
/*     */   }
/*     */   
/*     */   public float parsePercentage(@Nullable String value, float fallback) {
/*  71 */     return parsePercentage(value, fallback, 0.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public float parsePercentage(@Nullable String value, float fallback, float min, float max) {
/*  75 */     if (value == null) return fallback; 
/*     */     try {
/*     */       float parsed;
/*  78 */       if (value.endsWith("%")) {
/*  79 */         parsed = Float.parseFloat(value.substring(0, value.length() - 1)) / 100.0F;
/*     */       } else {
/*  81 */         parsed = Float.parseFloat(value);
/*     */       } 
/*  83 */       return Math.max(min, Math.min(max, parsed));
/*  84 */     } catch (NumberFormatException e) {
/*  85 */       return fallback;
/*     */     } 
/*     */   }
/*     */   
/*     */   public int parseInt(@Nullable String value, int fallback) {
/*  90 */     if (value == null) return fallback; 
/*     */     try {
/*  92 */       return Integer.parseInt(value);
/*  93 */     } catch (NumberFormatException e) {
/*  94 */       return fallback;
/*     */     } 
/*     */   }
/*     */   
/*     */   public float parseFloat(@Nullable String value, float fallback) {
/*  99 */     if (value == null) return fallback; 
/*     */     try {
/* 101 */       return Float.parseFloat(value);
/* 102 */     } catch (NumberFormatException e) {
/* 103 */       return fallback;
/*     */     } 
/*     */   }
/*     */   
/*     */   public double parseDouble(@Nullable String value, double fallback) {
/* 108 */     if (value == null) return fallback; 
/*     */     try {
/* 110 */       return Double.parseDouble(value);
/* 111 */     } catch (NumberFormatException e) {
/* 112 */       return fallback;
/*     */     } 
/*     */   }
/*     */   
/*     */   public float parseAngle(@Nullable String value, float fallback) {
/* 117 */     if (value == null) return fallback; 
/* 118 */     AngleUnit unit = AngleUnit.Raw;
/* 119 */     String lower = value.toLowerCase(Locale.ENGLISH);
/* 120 */     for (AngleUnit u : AngleUnit.units()) {
/* 121 */       if (lower.endsWith(u.suffix())) {
/* 122 */         unit = u;
/*     */         break;
/*     */       } 
/*     */     } 
/* 126 */     String str = lower.substring(0, lower.length() - unit.suffix().length());
/*     */     try {
/* 128 */       return unit.toRadians(Float.parseFloat(str), AngleUnit.Deg);
/* 129 */     } catch (NumberFormatException e) {
/* 130 */       return fallback;
/*     */     } 
/*     */   }
/*     */   
/*     */   public Length[] parseLengthList(@Nullable String value) {
/* 135 */     if (value != null && value.equalsIgnoreCase("none")) return new Length[0]; 
/* 136 */     String[] values = parseStringList(value, SeparatorMode.COMMA_AND_WHITESPACE);
/* 137 */     Length[] ret = new Length[values.length];
/* 138 */     for (int i = 0; i < ret.length; i++) {
/* 139 */       Length length = parseLength(values[i], null);
/* 140 */       if (length == null) return new Length[0]; 
/* 141 */       ret[i] = length;
/*     */     } 
/* 143 */     return ret;
/*     */   }
/*     */   
/*     */   public float[] parseFloatList(@Nullable String value) {
/* 147 */     String[] values = parseStringList(value, SeparatorMode.COMMA_AND_WHITESPACE);
/* 148 */     float[] ret = new float[values.length];
/* 149 */     for (int i = 0; i < ret.length; i++) {
/* 150 */       ret[i] = parseFloat(values[i], 0.0F);
/*     */     }
/* 152 */     return ret;
/*     */   }
/*     */   
/*     */   public double[] parseDoubleList(@Nullable String value) {
/* 156 */     String[] values = parseStringList(value, SeparatorMode.COMMA_AND_WHITESPACE);
/* 157 */     double[] ret = new double[values.length];
/* 158 */     for (int i = 0; i < ret.length; i++) {
/* 159 */       ret[i] = parseDouble(values[i], 0.0D);
/*     */     }
/* 161 */     return ret;
/*     */   }
/*     */   @NotNull
/*     */   public String[] parseStringList(@Nullable String value, SeparatorMode separatorMode) {
/* 165 */     if (value == null || value.isEmpty()) return new String[0]; 
/* 166 */     List<String> list = new ArrayList<>();
/* 167 */     int max = value.length();
/* 168 */     int start = 0;
/* 169 */     int i = 0;
/* 170 */     boolean inWhiteSpace = false;
/* 171 */     for (; i < max; i++) {
/* 172 */       char c = value.charAt(i);
/* 173 */       if (Character.isWhitespace(c)) {
/* 174 */         if (!inWhiteSpace && separatorMode != SeparatorMode.COMMA_ONLY && i - start > 0) {
/* 175 */           list.add(value.substring(start, i));
/* 176 */           start = i + 1;
/*     */         } 
/* 178 */         inWhiteSpace = true;
/*     */       } else {
/*     */         
/* 181 */         inWhiteSpace = false;
/* 182 */         if (c == ',' && separatorMode != SeparatorMode.WHITESPACE_ONLY) {
/* 183 */           list.add(value.substring(start, i));
/* 184 */           start = i + 1;
/*     */         } 
/*     */       } 
/* 187 */     }  if (i - start > 0) list.add(value.substring(start, i)); 
/* 188 */     return list.<String>toArray(new String[0]);
/*     */   }
/*     */   @Nullable
/*     */   public SVGPaint parsePaint(@Nullable String value, @NotNull AttributeNode attributeNode) {
/* 192 */     return this.paintParser.parsePaint(value, attributeNode);
/*     */   }
/*     */   @NotNull
/*     */   public <E extends Enum<E>> E parseEnum(@Nullable String value, @NotNull E fallback) {
/* 196 */     E e = parseEnum(value, fallback.getDeclaringClass());
/* 197 */     if (e == null) return fallback; 
/* 198 */     return e;
/*     */   }
/*     */   @Nullable
/*     */   public <E extends Enum<E>> E parseEnum(@Nullable String value, @NotNull Class<E> enumType) {
/* 202 */     if (value == null) return null; 
/* 203 */     for (Enum enum_ : (Enum[])enumType.getEnumConstants()) {
/*     */ 
/*     */       
/* 206 */       String name = (enum_ instanceof HasMatchName) ? ((HasMatchName)enum_).matchName() : enum_.name();
/* 207 */       if (name.equalsIgnoreCase(value)) return (E)enum_; 
/*     */     } 
/* 209 */     return null;
/*     */   }
/*     */   
/* 212 */   private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s");
/*     */   @NotNull
/*     */   private String removeWhiteSpace(@NotNull String value) {
/* 215 */     return WHITESPACE_PATTERN.matcher(value).replaceAll("");
/*     */   }
/*     */   @Nullable
/*     */   public String parseUrl(@Nullable String value) {
/* 219 */     if (value == null) return null; 
/* 220 */     if (!value.startsWith("url(") || !value.endsWith(")")) return removeWhiteSpace(value); 
/* 221 */     return removeWhiteSpace(value.substring(4, value.length() - 1));
/*     */   }
/*     */   
/* 224 */   private static final Pattern TRANSFORM_PATTERN = Pattern.compile("\\w+\\([^)]*\\)");
/*     */   @Nullable
/*     */   public AffineTransform parseTransform(@Nullable String value) {
/* 227 */     if (value == null) return null; 
/* 228 */     Matcher transformMatcher = TRANSFORM_PATTERN.matcher(value);
/* 229 */     AffineTransform transform = new AffineTransform();
/* 230 */     while (transformMatcher.find()) {
/* 231 */       String group = transformMatcher.group();
/*     */       try {
/* 233 */         parseSingleTransform(group, transform);
/* 234 */       } catch (Exception e) {
/* 235 */         throw new IllegalArgumentException("Illegal transform definition '" + value + "' encountered error while parsing '" + group + "'", e);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 240 */     return transform;
/*     */   }
/*     */   
/*     */   private void parseSingleTransform(@NotNull String value, @NotNull AffineTransform tx) {
/* 244 */     int first = value.indexOf('(');
/* 245 */     int last = value.lastIndexOf(')');
/* 246 */     String command = value.substring(0, value.indexOf('(')).toLowerCase(Locale.ENGLISH);
/* 247 */     double[] values = parseDoubleList(value.substring(first + 1, last));
/* 248 */     switch (command) {
/*     */       case "matrix":
/* 250 */         tx.concatenate(new AffineTransform(values));
/*     */         return;
/*     */       case "translate":
/* 253 */         if (values.length == 1) {
/* 254 */           tx.translate(values[0], 0.0D);
/*     */         } else {
/* 256 */           tx.translate(values[0], values[1]);
/*     */         } 
/*     */         return;
/*     */       case "translatex":
/* 260 */         tx.translate(values[0], 0.0D);
/*     */         return;
/*     */       case "translatey":
/* 263 */         tx.translate(0.0D, values[0]);
/*     */         return;
/*     */       case "scale":
/* 266 */         if (values.length == 1) {
/* 267 */           tx.scale(values[0], values[0]);
/*     */         } else {
/* 269 */           tx.scale(values[0], values[1]);
/*     */         } 
/*     */         return;
/*     */       case "scalex":
/* 273 */         tx.scale(values[0], 1.0D);
/*     */         return;
/*     */       case "scaley":
/* 276 */         tx.scale(1.0D, values[0]);
/*     */         return;
/*     */       case "rotate":
/* 279 */         if (values.length > 2) {
/* 280 */           tx.rotate(Math.toRadians(values[0]), values[1], values[2]);
/*     */         } else {
/* 282 */           tx.rotate(Math.toRadians(values[0]));
/*     */         } 
/*     */         return;
/*     */       case "skewx":
/* 286 */         tx.shear(Math.tan(Math.toRadians(values[0])), 0.0D);
/*     */         return;
/*     */       case "skewy":
/* 289 */         tx.shear(0.0D, Math.tan(Math.toRadians(values[0])));
/*     */         return;
/*     */     } 
/* 292 */     throw new IllegalArgumentException("Unknown transform type: " + command);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public PaintParser paintParser() {
/* 297 */     return this.paintParser;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\AttributeParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */