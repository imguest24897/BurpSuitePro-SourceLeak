/*     */ package com.github.weisj.jsvg.attributes.paint;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.AttributeParser;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.parser.SeparatorMode;
/*     */ import java.awt.Color;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
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
/*     */ public final class DefaultPaintParser
/*     */   implements PaintParser
/*     */ {
/*  40 */   private static final Logger LOGGER = Logger.getLogger(DefaultPaintParser.class.getName());
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Color parseColor(@NotNull String value, @NotNull AttributeNode node) {
/*  45 */     if (value.isEmpty()) return null; 
/*     */     try {
/*  47 */       if (value.charAt(0) == '#') {
/*  48 */         int rgba = -16777216;
/*  49 */         switch (value.length()) {
/*     */           
/*     */           case 4:
/*  52 */             rgba = parseHex(new char[] { value
/*  53 */                   .charAt(1), value.charAt(1), value
/*  54 */                   .charAt(2), value.charAt(2), value
/*  55 */                   .charAt(3), value.charAt(3), 'F', 'F' });
/*     */             break;
/*     */ 
/*     */           
/*     */           case 5:
/*  60 */             rgba = parseHex(new char[] { value
/*  61 */                   .charAt(1), value.charAt(1), value
/*  62 */                   .charAt(2), value.charAt(2), value
/*  63 */                   .charAt(3), value.charAt(3), value
/*  64 */                   .charAt(4), value.charAt(4) });
/*     */             break;
/*     */           
/*     */           case 7:
/*  68 */             rgba = parseHex(new char[] { value
/*  69 */                   .charAt(1), value.charAt(2), value
/*  70 */                   .charAt(3), value.charAt(4), value
/*  71 */                   .charAt(5), value.charAt(6), 'F', 'F' });
/*     */             break;
/*     */ 
/*     */           
/*     */           case 9:
/*  76 */             rgba = parseHex(value.substring(1).toCharArray());
/*     */             break;
/*     */         } 
/*     */ 
/*     */         
/*  81 */         return new Color(rgba, true);
/*  82 */       }  if (value.length() > 3 && value.substring(0, 3).equalsIgnoreCase("rgb")) {
/*  83 */         boolean isRgba = (value.length() > 4 && (value.charAt(3) == 'a' || value.charAt(3) == 'A'));
/*  84 */         int startIndex = isRgba ? 5 : 4;
/*  85 */         String[] values = node.parser().parseStringList(value
/*  86 */             .substring(startIndex, value.length() - 1), SeparatorMode.COMMA_AND_WHITESPACE);
/*  87 */         isRgba = (isRgba && values.length >= 4);
/*  88 */         AttributeParser parser = node.parser();
/*  89 */         return new Color(
/*  90 */             parseColorComponent(values[0], false, parser), 
/*  91 */             parseColorComponent(values[1], false, parser), 
/*  92 */             parseColorComponent(values[2], false, parser), 
/*  93 */             isRgba ? parseColorComponent(values[3], true, parser) : 255);
/*     */       } 
/*  95 */       return (Color)ColorLookup.colorMap().get(value.toLowerCase(Locale.ENGLISH));
/*  96 */     } catch (Exception e) {
/*  97 */       LOGGER.log(Level.INFO, e.getMessage(), e);
/*  98 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public SVGPaint parsePaint(@Nullable String value, @NotNull AttributeNode node) {
/* 104 */     if (value == null) return null; 
/* 105 */     String lower = value.toLowerCase(Locale.ENGLISH);
/* 106 */     if ("none".equals(lower) || "transparent".equals(lower)) return SVGPaint.NONE; 
/* 107 */     if ("currentcolor".equals(lower)) return SVGPaint.CURRENT_COLOR; 
/* 108 */     if ("context-fill".equals(lower)) return SVGPaint.CONTEXT_FILL; 
/* 109 */     if ("context-stroke".equals(lower)) return SVGPaint.CONTEXT_STROKE; 
/* 110 */     Color color = parseColor(lower, node);
/* 111 */     if (color == null) return null; 
/* 112 */     return new AwtSVGPaint(color);
/*     */   }
/*     */   
/*     */   private int parseColorComponent(String value, boolean percentage, @NotNull AttributeParser parser) {
/*     */     float parsed;
/* 117 */     if (value.endsWith("%")) {
/* 118 */       parsed = parser.parseFloat(value.substring(0, value.length() - 1), 0.0F);
/* 119 */       parsed /= 100.0F;
/* 120 */       parsed *= 255.0F;
/*     */     } else {
/* 122 */       parsed = parser.parseFloat(value, 0.0F);
/* 123 */       if (percentage) parsed *= 255.0F; 
/*     */     } 
/* 125 */     return Math.min(255, Math.max(0, (int)parsed));
/*     */   }
/*     */   
/*     */   private int parseHex(char[] chars) {
/* 129 */     int r = charToColorInt(chars[0]) << 4 | charToColorInt(chars[1]);
/* 130 */     int g = charToColorInt(chars[2]) << 4 | charToColorInt(chars[3]);
/* 131 */     int b = charToColorInt(chars[4]) << 4 | charToColorInt(chars[5]);
/* 132 */     int a = charToColorInt(chars[6]) << 4 | charToColorInt(chars[7]);
/* 133 */     return (a & 0xFF) << 24 | (r & 0xFF) << 16 | (g & 0xFF) << 8 | b & 0xFF;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int charToColorInt(char c) {
/* 140 */     if (c >= '0' && c <= '9')
/* 141 */       return c - 48; 
/* 142 */     if (c >= 'a' && c <= 'z')
/* 143 */       return c - 97 + 10; 
/* 144 */     if (c >= 'A' && c <= 'Z') {
/* 145 */       return c - 65 + 10;
/*     */     }
/* 147 */     return 0;
/*     */   }
/*     */   
/*     */   private static final class ColorLookup
/*     */   {
/*     */     private static Map<String, Color> colorMap;
/*     */     
/*     */     private static Map<String, Color> colorMap() {
/* 155 */       if (colorMap != null) return colorMap; 
/* 156 */       colorMap = new HashMap<>(143);
/*     */       
/* 158 */       colorMap.put("aliceblue", new Color(15792383));
/* 159 */       colorMap.put("antiquewhite", new Color(16444375));
/* 160 */       colorMap.put("aqua", new Color(65535));
/* 161 */       colorMap.put("aquamarine", new Color(8388564));
/* 162 */       colorMap.put("azure", new Color(15794175));
/* 163 */       colorMap.put("beige", new Color(16119260));
/* 164 */       colorMap.put("bisque", new Color(16770244));
/* 165 */       colorMap.put("black", new Color(0));
/* 166 */       colorMap.put("blanchedalmond", new Color(16772045));
/* 167 */       colorMap.put("blue", new Color(255));
/* 168 */       colorMap.put("blueviolet", new Color(9055202));
/* 169 */       colorMap.put("brown", new Color(10824234));
/* 170 */       colorMap.put("burlywood", new Color(14596231));
/* 171 */       colorMap.put("cadetblue", new Color(6266528));
/* 172 */       colorMap.put("chartreuse", new Color(8388352));
/* 173 */       colorMap.put("chocolate", new Color(13789470));
/* 174 */       colorMap.put("coral", new Color(16744272));
/* 175 */       colorMap.put("cornflowerblue", new Color(6591981));
/* 176 */       colorMap.put("cornsilk", new Color(16775388));
/* 177 */       colorMap.put("crimson", new Color(14423100));
/* 178 */       colorMap.put("cyan", new Color(65535));
/* 179 */       colorMap.put("darkblue", new Color(139));
/* 180 */       colorMap.put("darkcyan", new Color(35723));
/* 181 */       colorMap.put("darkgoldenrod", new Color(12092939));
/* 182 */       colorMap.put("darkgray", new Color(11119017));
/* 183 */       colorMap.put("darkgrey", new Color(11119017));
/* 184 */       colorMap.put("darkgreen", new Color(25600));
/* 185 */       colorMap.put("darkkhaki", new Color(12433259));
/* 186 */       colorMap.put("darkmagenta", new Color(9109643));
/* 187 */       colorMap.put("darkolivegreen", new Color(5597999));
/* 188 */       colorMap.put("darkorange", new Color(16747520));
/* 189 */       colorMap.put("darkorchid", new Color(10040012));
/* 190 */       colorMap.put("darkred", new Color(9109504));
/* 191 */       colorMap.put("darksalmon", new Color(15308410));
/* 192 */       colorMap.put("darkseagreen", new Color(9419919));
/* 193 */       colorMap.put("darkslateblue", new Color(4734347));
/* 194 */       colorMap.put("darkslategray", new Color(3100495));
/* 195 */       colorMap.put("darkslategrey", new Color(3100495));
/* 196 */       colorMap.put("darkturquoise", new Color(52945));
/* 197 */       colorMap.put("darkviolet", new Color(9699539));
/* 198 */       colorMap.put("deeppink", new Color(16716947));
/* 199 */       colorMap.put("deepskyblue", new Color(49151));
/* 200 */       colorMap.put("dimgray", new Color(6908265));
/* 201 */       colorMap.put("dimgrey", new Color(6908265));
/* 202 */       colorMap.put("dodgerblue", new Color(2003199));
/* 203 */       colorMap.put("feldspar", new Color(13734517));
/* 204 */       colorMap.put("firebrick", new Color(11674146));
/* 205 */       colorMap.put("floralwhite", new Color(16775920));
/* 206 */       colorMap.put("forestgreen", new Color(2263842));
/* 207 */       colorMap.put("fuchsia", new Color(16711935));
/* 208 */       colorMap.put("gainsboro", new Color(14474460));
/* 209 */       colorMap.put("ghostwhite", new Color(16316671));
/* 210 */       colorMap.put("gold", new Color(16766720));
/* 211 */       colorMap.put("goldenrod", new Color(14329120));
/* 212 */       colorMap.put("gray", new Color(8421504));
/* 213 */       colorMap.put("grey", new Color(8421504));
/* 214 */       colorMap.put("green", new Color(32768));
/* 215 */       colorMap.put("greenyellow", new Color(11403055));
/* 216 */       colorMap.put("honeydew", new Color(15794160));
/* 217 */       colorMap.put("hotpink", new Color(16738740));
/* 218 */       colorMap.put("indianred", new Color(13458524));
/* 219 */       colorMap.put("indigo", new Color(4915330));
/* 220 */       colorMap.put("ivory", new Color(16777200));
/* 221 */       colorMap.put("khaki", new Color(15787660));
/* 222 */       colorMap.put("lavender", new Color(15132410));
/* 223 */       colorMap.put("lavenderblush", new Color(16773365));
/* 224 */       colorMap.put("lawngreen", new Color(8190976));
/* 225 */       colorMap.put("lemonchiffon", new Color(16775885));
/* 226 */       colorMap.put("lightblue", new Color(11393254));
/* 227 */       colorMap.put("lightcoral", new Color(15761536));
/* 228 */       colorMap.put("lightcyan", new Color(14745599));
/* 229 */       colorMap.put("lightgoldenrodyellow", new Color(16448210));
/* 230 */       colorMap.put("lightgrey", new Color(13882323));
/* 231 */       colorMap.put("lightgreen", new Color(9498256));
/* 232 */       colorMap.put("lightpink", new Color(16758465));
/* 233 */       colorMap.put("lightsalmon", new Color(16752762));
/* 234 */       colorMap.put("lightseagreen", new Color(2142890));
/* 235 */       colorMap.put("lightskyblue", new Color(8900346));
/* 236 */       colorMap.put("lightslateblue", new Color(8679679));
/* 237 */       colorMap.put("lightslategray", new Color(7833753));
/* 238 */       colorMap.put("lightslategrey", new Color(7833753));
/* 239 */       colorMap.put("lightsteelblue", new Color(11584734));
/* 240 */       colorMap.put("lightyellow", new Color(16777184));
/* 241 */       colorMap.put("lime", new Color(65280));
/* 242 */       colorMap.put("limegreen", new Color(3329330));
/* 243 */       colorMap.put("linen", new Color(16445670));
/* 244 */       colorMap.put("magenta", new Color(16711935));
/* 245 */       colorMap.put("maroon", new Color(8388608));
/* 246 */       colorMap.put("mediumaquamarine", new Color(6737322));
/* 247 */       colorMap.put("mediumblue", new Color(205));
/* 248 */       colorMap.put("mediumorchid", new Color(12211667));
/* 249 */       colorMap.put("mediumpurple", new Color(9662680));
/* 250 */       colorMap.put("mediumseagreen", new Color(3978097));
/* 251 */       colorMap.put("mediumslateblue", new Color(8087790));
/* 252 */       colorMap.put("mediumspringgreen", new Color(64154));
/* 253 */       colorMap.put("mediumturquoise", new Color(4772300));
/* 254 */       colorMap.put("mediumvioletred", new Color(13047173));
/* 255 */       colorMap.put("midnightblue", new Color(1644912));
/* 256 */       colorMap.put("mintcream", new Color(16121850));
/* 257 */       colorMap.put("mistyrose", new Color(16770273));
/* 258 */       colorMap.put("moccasin", new Color(16770229));
/* 259 */       colorMap.put("navajowhite", new Color(16768685));
/* 260 */       colorMap.put("navy", new Color(128));
/* 261 */       colorMap.put("oldlace", new Color(16643558));
/* 262 */       colorMap.put("olive", new Color(8421376));
/* 263 */       colorMap.put("olivedrab", new Color(7048739));
/* 264 */       colorMap.put("orange", new Color(16753920));
/* 265 */       colorMap.put("orangered", new Color(16729344));
/* 266 */       colorMap.put("orchid", new Color(14315734));
/* 267 */       colorMap.put("palegoldenrod", new Color(15657130));
/* 268 */       colorMap.put("palegreen", new Color(10025880));
/* 269 */       colorMap.put("paleturquoise", new Color(11529966));
/* 270 */       colorMap.put("palevioletred", new Color(14184595));
/* 271 */       colorMap.put("papayawhip", new Color(16773077));
/* 272 */       colorMap.put("peachpuff", new Color(16767673));
/* 273 */       colorMap.put("peru", new Color(13468991));
/* 274 */       colorMap.put("pink", new Color(16761035));
/* 275 */       colorMap.put("plum", new Color(14524637));
/* 276 */       colorMap.put("powderblue", new Color(11591910));
/* 277 */       colorMap.put("purple", new Color(8388736));
/* 278 */       colorMap.put("red", new Color(16711680));
/* 279 */       colorMap.put("rosybrown", new Color(12357519));
/* 280 */       colorMap.put("royalblue", new Color(4286945));
/* 281 */       colorMap.put("saddlebrown", new Color(9127187));
/* 282 */       colorMap.put("salmon", new Color(16416882));
/* 283 */       colorMap.put("sandybrown", new Color(16032864));
/* 284 */       colorMap.put("seagreen", new Color(3050327));
/* 285 */       colorMap.put("seashell", new Color(16774638));
/* 286 */       colorMap.put("sienna", new Color(10506797));
/* 287 */       colorMap.put("silver", new Color(12632256));
/* 288 */       colorMap.put("skyblue", new Color(8900331));
/* 289 */       colorMap.put("slateblue", new Color(6970061));
/* 290 */       colorMap.put("slategray", new Color(7372944));
/* 291 */       colorMap.put("slategrey", new Color(7372944));
/* 292 */       colorMap.put("snow", new Color(16775930));
/* 293 */       colorMap.put("springgreen", new Color(65407));
/* 294 */       colorMap.put("steelblue", new Color(4620980));
/* 295 */       colorMap.put("tan", new Color(13808780));
/* 296 */       colorMap.put("teal", new Color(32896));
/* 297 */       colorMap.put("thistle", new Color(14204888));
/* 298 */       colorMap.put("tomato", new Color(16737095));
/* 299 */       colorMap.put("turquoise", new Color(4251856));
/* 300 */       colorMap.put("violet", new Color(15631086));
/* 301 */       colorMap.put("violetred", new Color(13639824));
/* 302 */       colorMap.put("wheat", new Color(16113331));
/* 303 */       colorMap.put("white", new Color(16777215));
/* 304 */       colorMap.put("whitesmoke", new Color(16119285));
/* 305 */       colorMap.put("yellow", new Color(16776960));
/* 306 */       colorMap.put("yellowgreen", new Color(10145074));
/* 307 */       colorMap = Collections.unmodifiableMap(colorMap);
/* 308 */       return colorMap;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\paint\DefaultPaintParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */