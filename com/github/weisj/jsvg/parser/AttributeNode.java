/*     */ package com.github.weisj.jsvg.parser;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.AttributeParser;
/*     */ import com.github.weisj.jsvg.attributes.ViewBox;
/*     */ import com.github.weisj.jsvg.attributes.filter.DefaultFilterChannel;
/*     */ import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
/*     */ import com.github.weisj.jsvg.attributes.paint.PaintParser;
/*     */ import com.github.weisj.jsvg.attributes.paint.SVGPaint;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.Unit;
/*     */ import com.github.weisj.jsvg.nodes.ClipPath;
/*     */ import com.github.weisj.jsvg.nodes.Mask;
/*     */ import com.github.weisj.jsvg.nodes.filter.Filter;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.parser.css.StyleProperty;
/*     */ import com.github.weisj.jsvg.parser.css.StyleSheet;
/*     */ import java.awt.Color;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
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
/*     */ public final class AttributeNode
/*     */ {
/*  50 */   private static final Length TopOrLeft = new Length(Unit.PERCENTAGE, 0.0F);
/*  51 */   private static final Length Center = new Length(Unit.PERCENTAGE, 50.0F);
/*  52 */   private static final Length BottomOrRight = new Length(Unit.PERCENTAGE, 100.0F);
/*     */   @NotNull
/*     */   private final String tagName;
/*     */   @NotNull
/*     */   private final Map<String, String> attributes;
/*     */   @Nullable
/*     */   private final AttributeNode parent;
/*     */   @NotNull
/*     */   private final Map<String, Object> namedElements;
/*     */   @NotNull
/*     */   private final List<StyleSheet> styleSheets;
/*     */   @NotNull
/*     */   private final LoadHelper loadHelper;
/*     */   
/*     */   public AttributeNode(@NotNull String tagName, @NotNull Map<String, String> attributes, @Nullable AttributeNode parent, @NotNull Map<String, Object> namedElements, @NotNull List<StyleSheet> styleSheets, @NotNull LoadHelper loadHelper) {
/*  67 */     this.tagName = tagName;
/*  68 */     this.attributes = attributes;
/*  69 */     this.parent = parent;
/*  70 */     this.namedElements = namedElements;
/*  71 */     this.styleSheets = styleSheets;
/*  72 */     this.loadHelper = loadHelper;
/*     */   }
/*     */   
/*     */   void prepareForNodeBuilding(@NotNull ParsedElement parsedElement) {
/*  76 */     Map<String, String> styleSheetAttributes = new HashMap<>();
/*     */ 
/*     */     
/*  79 */     preprocessAttributes(this.attributes, styleSheetAttributes);
/*     */     
/*  81 */     List<StyleSheet> sheets = styleSheets();
/*     */ 
/*     */     
/*  84 */     for (int i = sheets.size() - 1; i >= 0; i--) {
/*  85 */       StyleSheet sheet = sheets.get(i);
/*  86 */       sheet.forEachMatchingRule(parsedElement, p -> {
/*     */             if (!styleSheetAttributes.containsKey(p.name())) {
/*     */               styleSheetAttributes.put(p.name(), p.value());
/*     */             }
/*     */           });
/*     */     } 
/*  92 */     this.attributes.putAll(styleSheetAttributes);
/*     */   }
/*     */   
/*     */   private static boolean isBlank(@NotNull String s) {
/*  96 */     return s.trim().isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   private static void preprocessAttributes(@NotNull Map<String, String> attributes, @NotNull Map<String, String> styleAttributes) {
/* 101 */     String styleStr = attributes.get("style");
/* 102 */     if (styleStr != null && !isBlank(styleStr)) {
/* 103 */       String[] styles = styleStr.split(";");
/* 104 */       for (String style : styles) {
/* 105 */         if (!isBlank(style)) {
/* 106 */           String[] styleDef = style.split(":", 2);
/* 107 */           styleAttributes.put(styleDef[0].trim().toLowerCase(Locale.ENGLISH), styleDef[1].trim());
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   @NotNull
/*     */   Map<String, Object> namedElements() {
/* 114 */     return this.namedElements;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   List<StyleSheet> styleSheets() {
/* 119 */     return this.styleSheets;
/*     */   }
/*     */   @Nullable
/*     */   private <T> T getElementById(@NotNull Class<T> type, @Nullable String id) {
/* 123 */     if (id == null) return null;
/*     */     
/* 125 */     Object node = this.namedElements.get(id);
/* 126 */     if (node instanceof ParsedElement) {
/* 127 */       node = ((ParsedElement)node).nodeEnsuringBuildStatus();
/*     */     }
/* 129 */     return type.isInstance(node) ? type.cast(node) : null;
/*     */   }
/*     */   @Nullable
/*     */   private <T> T getElementByUrl(@NotNull Class<T> type, @Nullable String value) {
/* 133 */     String url = this.loadHelper.attributeParser().parseUrl(value);
/* 134 */     if (url != null && url.startsWith("#")) url = url.substring(1); 
/* 135 */     return getElementById(type, url);
/*     */   }
/*     */   @Nullable
/*     */   public <T> T getElementByHref(@NotNull Class<T> type, @Nullable String value) {
/* 139 */     if (value == null) return null; 
/* 140 */     return getElementByUrl(type, value);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public <T> T getElementByHref(@NotNull Class<T> type, @NotNull Category category, @Nullable String value) {
/* 145 */     T element = getElementByHref(type, value);
/* 146 */     if (element == null) return null; 
/* 147 */     for (Category cat : ((ElementCategories)element.getClass().<ElementCategories>getAnnotation(ElementCategories.class)).value()) {
/* 148 */       if (cat == category) return element; 
/*     */     } 
/* 150 */     return null;
/*     */   }
/*     */   @NotNull
/*     */   public Map<String, String> attributes() {
/* 154 */     return this.attributes;
/*     */   }
/*     */   @NotNull
/*     */   public String tagName() {
/* 158 */     return this.tagName;
/*     */   }
/*     */   
/*     */   public boolean tagIsOneOf(@NotNull String... tags) {
/* 162 */     for (String tag : tags) {
/* 163 */       if (this.tagName.equals(tag)) return true; 
/*     */     } 
/* 165 */     return false;
/*     */   }
/*     */   @Nullable
/*     */   public AttributeNode parent() {
/* 169 */     return this.parent;
/*     */   }
/*     */   @Nullable
/*     */   public String getValue(@NotNull String key) {
/* 173 */     return this.attributes.get(key);
/*     */   }
/*     */   @NotNull
/*     */   public Color getColor(@NotNull String key) {
/* 177 */     return getColor(key, PaintParser.DEFAULT_COLOR);
/*     */   }
/*     */   @Contract("_,!null -> !null")
/*     */   @Nullable
/*     */   public Color getColor(@NotNull String key, @Nullable Color fallback) {
/* 182 */     String value = getValue(key);
/* 183 */     if (value == null) return fallback; 
/* 184 */     Color c = this.loadHelper.attributeParser().paintParser().parseColor(value.toLowerCase(Locale.ENGLISH), this);
/* 185 */     return (c != null) ? c : fallback;
/*     */   }
/*     */   @NotNull
/*     */   public SVGPaint getPaint(@NotNull String key, @NotNull SVGPaint fallback) {
/* 189 */     SVGPaint paint = getPaint(key);
/* 190 */     return (paint != null) ? paint : fallback;
/*     */   }
/*     */   @Nullable
/*     */   public SVGPaint getPaint(@NotNull String key) {
/* 194 */     String value = getValue(key);
/* 195 */     SVGPaint paint = getElementByUrl(SVGPaint.class, value);
/* 196 */     if (paint != null) return paint; 
/* 197 */     return this.loadHelper.attributeParser().parsePaint(value, this);
/*     */   }
/*     */   @Nullable
/*     */   public Length getLength(@NotNull String key) {
/* 201 */     return getLengthInternal(key, null);
/*     */   }
/*     */   @NotNull
/*     */   public Length getLength(@NotNull String key, float fallback) {
/* 205 */     return getLength(key, Unit.Raw.valueOf(fallback));
/*     */   }
/*     */   @NotNull
/*     */   public Length getLength(@NotNull String key, @NotNull Length fallback) {
/* 209 */     return getLengthInternal(key, fallback);
/*     */   }
/*     */   @Contract("_,!null -> !null")
/*     */   @Nullable
/*     */   private Length getLengthInternal(@NotNull String key, @Nullable Length fallback) {
/* 214 */     return this.loadHelper.attributeParser().parseLength(getValue(key), fallback);
/*     */   }
/*     */   @NotNull
/*     */   public Length getHorizontalReferenceLength(@NotNull String key) {
/* 218 */     return parseReferenceLength(key, "left", "right");
/*     */   }
/*     */   @NotNull
/*     */   public Length getVerticalReferenceLength(@NotNull String key) {
/* 222 */     return parseReferenceLength(key, "top", "bottom");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private Length parseReferenceLength(@NotNull String key, @NotNull String topLeft, @NotNull String bottomRight) {
/* 227 */     String value = getValue(key);
/* 228 */     if (topLeft.equals(value))
/* 229 */       return TopOrLeft; 
/* 230 */     if ("center".equals(value))
/* 231 */       return Center; 
/* 232 */     if (bottomRight.equals(value)) {
/* 233 */       return BottomOrRight;
/*     */     }
/* 235 */     return this.loadHelper.attributeParser().parseLength(value, Length.ZERO);
/*     */   }
/*     */ 
/*     */   
/*     */   public float getPercentage(@NotNull String key, float fallback) {
/* 240 */     return this.loadHelper.attributeParser().parsePercentage(getValue(key), fallback);
/*     */   }
/*     */   @NotNull
/*     */   public Length[] getLengthList(@NotNull String key) {
/* 244 */     return this.loadHelper.attributeParser().parseLengthList(getValue(key));
/*     */   }
/*     */   
/*     */   public float[] getFloatList(@NotNull String key) {
/* 248 */     return this.loadHelper.attributeParser().parseFloatList(getValue(key));
/*     */   }
/*     */   
/*     */   public double[] getDoubleList(@NotNull String key) {
/* 252 */     return this.loadHelper.attributeParser().parseDoubleList(getValue(key));
/*     */   }
/*     */   @NotNull
/*     */   public <E extends Enum<E>> E getEnum(@NotNull String key, @NotNull E fallback) {
/* 256 */     return (E)this.loadHelper.attributeParser().parseEnum(getValue(key), (Enum)fallback);
/*     */   }
/*     */   @Nullable
/*     */   public <E extends Enum<E>> E getEnumNullable(@NotNull String key, @NotNull Class<E> enumType) {
/* 260 */     return (E)this.loadHelper.attributeParser().parseEnum(getValue(key), enumType);
/*     */   }
/*     */   @Nullable
/*     */   public ClipPath getClipPath() {
/* 264 */     return getElementByUrl(ClipPath.class, getValue("clip-path"));
/*     */   }
/*     */   @Nullable
/*     */   public Mask getMask() {
/* 268 */     return getElementByUrl(Mask.class, getValue("mask"));
/*     */   }
/*     */   @Nullable
/*     */   public Filter getFilter() {
/* 272 */     return getElementByUrl(Filter.class, getValue("filter"));
/*     */   }
/*     */   @NotNull
/*     */   public FilterChannelKey getFilterChannelKey(@NotNull String key, @NotNull DefaultFilterChannel fallback) {
/* 276 */     String in = getValue(key);
/* 277 */     if (in == null) return (FilterChannelKey)fallback; 
/* 278 */     return (FilterChannelKey)new FilterChannelKey.StringKey(in);
/*     */   }
/*     */   @Nullable
/*     */   public AffineTransform parseTransform(@NotNull String key) {
/* 282 */     return this.loadHelper.attributeParser().parseTransform(getValue(key));
/*     */   }
/*     */   
/*     */   public boolean hasAttribute(@NotNull String name) {
/* 286 */     return this.attributes.containsKey(name);
/*     */   }
/*     */   @NotNull
/*     */   public String[] getStringList(@NotNull String name) {
/* 290 */     return getStringList(name, SeparatorMode.COMMA_AND_WHITESPACE);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String[] getStringList(@NotNull String name, SeparatorMode separatorMode) {
/* 295 */     return this.loadHelper.attributeParser().parseStringList(getValue(name), separatorMode);
/*     */   }
/*     */   
/*     */   public float getFloat(@NotNull String name, float fallback) {
/* 299 */     return this.loadHelper.attributeParser().parseFloat(getValue(name), fallback);
/*     */   }
/*     */   
/*     */   public float getNonNegativeFloat(@NotNull String name, float fallback) {
/* 303 */     float value = getFloat(name, fallback);
/* 304 */     if (Float.isFinite(value) && value < 0.0F) return fallback; 
/* 305 */     return value;
/*     */   }
/*     */   
/*     */   public int getInt(@NotNull String key, int fallback) {
/* 309 */     return this.loadHelper.attributeParser().parseInt(getValue(key), fallback);
/*     */   }
/*     */   @Nullable
/*     */   public String getHref() {
/* 313 */     String href = getValue("href");
/* 314 */     if (href == null) return getValue("xlink:href"); 
/* 315 */     return href;
/*     */   }
/*     */   @Nullable
/*     */   public ViewBox getViewBox() {
/* 319 */     float[] viewBoxCords = getFloatList("viewBox");
/* 320 */     return (viewBoxCords.length == 4) ? new ViewBox(viewBoxCords) : null;
/*     */   }
/*     */   @NotNull
/*     */   public AttributeParser parser() {
/* 324 */     return this.loadHelper.attributeParser();
/*     */   }
/*     */   @NotNull
/*     */   public ResourceLoader resourceLoader() {
/* 328 */     return this.loadHelper.resourceLoader();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\AttributeNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */