/*      */ package com.formdev.flatlaf;
/*      */ 
/*      */ import com.formdev.flatlaf.ui.FlatEmptyBorder;
/*      */ import com.formdev.flatlaf.ui.FlatLineBorder;
/*      */ import com.formdev.flatlaf.util.ColorFunctions;
/*      */ import com.formdev.flatlaf.util.DerivedColor;
/*      */ import com.formdev.flatlaf.util.GrayFilter;
/*      */ import com.formdev.flatlaf.util.HSLColor;
/*      */ import com.formdev.flatlaf.util.LoggingFacade;
/*      */ import com.formdev.flatlaf.util.SoftCache;
/*      */ import com.formdev.flatlaf.util.StringUtils;
/*      */ import com.formdev.flatlaf.util.SystemInfo;
/*      */ import com.formdev.flatlaf.util.UIScale;
/*      */ import java.awt.Color;
/*      */ import java.awt.Dimension;
/*      */ import java.awt.Font;
/*      */ import java.awt.Insets;
/*      */ import java.io.File;
/*      */ import java.io.FileInputStream;
/*      */ import java.io.FileNotFoundException;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.StreamTokenizer;
/*      */ import java.io.StringReader;
/*      */ import java.lang.reflect.Constructor;
/*      */ import java.lang.reflect.Executable;
/*      */ import java.lang.reflect.Method;
/*      */ import java.net.URL;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collections;
/*      */ import java.util.HashMap;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Locale;
/*      */ import java.util.Map;
/*      */ import java.util.Properties;
/*      */ import java.util.function.Function;
/*      */ import javax.swing.Icon;
/*      */ import javax.swing.UIDefaults;
/*      */ import javax.swing.UIManager;
/*      */ import javax.swing.border.Border;
/*      */ import javax.swing.plaf.ColorUIResource;
/*      */ import javax.swing.plaf.DimensionUIResource;
/*      */ import javax.swing.plaf.InsetsUIResource;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ class UIDefaultsLoader
/*      */ {
/*      */   private static final String TYPE_PREFIX = "{";
/*      */   private static final String TYPE_PREFIX_END = "}";
/*      */   private static final String VARIABLE_PREFIX = "@";
/*      */   private static final String PROPERTY_PREFIX = "$";
/*      */   private static final String OPTIONAL_PREFIX = "?";
/*      */   private static final String WILDCARD_PREFIX = "*.";
/*      */   static final String KEY_VARIABLES = "FlatLaf.internal.variables";
/*      */   private static int parseColorDepth;
/*      */   private static Map<String, ColorUIResource> systemColorCache;
/*   92 */   private static final SoftCache<String, Object> fontCache = new SoftCache();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static void loadDefaultsFromProperties(Class<?> lookAndFeelClass, List<FlatDefaultsAddon> addons, Properties additionalDefaults, boolean dark, UIDefaults defaults) {
/*   98 */     ArrayList<Class<?>> lafClasses = new ArrayList<>();
/*   99 */     Class<?> lafClass = lookAndFeelClass;
/*  100 */     for (; FlatLaf.class.isAssignableFrom(lafClass); 
/*  101 */       lafClass = lafClass.getSuperclass())
/*      */     {
/*  103 */       lafClasses.add(0, lafClass);
/*      */     }
/*      */     
/*  106 */     loadDefaultsFromProperties(lafClasses, addons, additionalDefaults, dark, defaults);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static void loadDefaultsFromProperties(List<Class<?>> lafClasses, List<FlatDefaultsAddon> addons, Properties additionalDefaults, boolean dark, UIDefaults defaults) {
/*      */     try {
/*  115 */       systemColorCache = (FlatLaf.getSystemColorGetter() != null) ? new HashMap<>() : null;
/*      */ 
/*      */       
/*  118 */       Properties properties = new Properties();
/*  119 */       for (Class<?> lafClass : lafClasses) {
/*  120 */         String propertiesName = '/' + lafClass.getName().replace('.', '/') + ".properties";
/*  121 */         InputStream in = lafClass.getResourceAsStream(propertiesName); 
/*  122 */         try { if (in != null)
/*  123 */             properties.load(in); 
/*  124 */           if (in != null) in.close();  } catch (Throwable throwable) { if (in != null)
/*      */             try { in.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }
/*      */               throw throwable; }
/*      */       
/*  128 */       }  for (FlatDefaultsAddon addon : addons) {
/*  129 */         for (Class<?> lafClass : lafClasses) {
/*  130 */           InputStream in = addon.getDefaults(lafClass); 
/*  131 */           try { if (in != null)
/*  132 */               properties.load(in); 
/*  133 */             if (in != null) in.close();  } catch (Throwable throwable) { if (in != null)
/*      */               try { in.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }
/*      */                 throw throwable; }
/*      */         
/*      */         } 
/*  138 */       }  List<ClassLoader> addonClassLoaders = new ArrayList<>();
/*  139 */       for (FlatDefaultsAddon addon : addons) {
/*  140 */         ClassLoader addonClassLoader = addon.getClass().getClassLoader();
/*  141 */         if (!addonClassLoaders.contains(addonClassLoader)) {
/*  142 */           addonClassLoaders.add(addonClassLoader);
/*      */         }
/*      */       } 
/*      */       
/*  146 */       List<Object> customDefaultsSources = FlatLaf.getCustomDefaultsSources();
/*  147 */       int size = (customDefaultsSources != null) ? customDefaultsSources.size() : 0;
/*  148 */       for (int i = 0; i < size; i++) {
/*  149 */         Object source = customDefaultsSources.get(i);
/*  150 */         if (source instanceof String && i + 1 < size) {
/*      */           
/*  152 */           String packageName = (String)source;
/*  153 */           ClassLoader classLoader = (ClassLoader)customDefaultsSources.get(++i);
/*      */ 
/*      */           
/*  156 */           if (classLoader != null && !addonClassLoaders.contains(classLoader)) {
/*  157 */             addonClassLoaders.add(classLoader);
/*      */           }
/*  159 */           packageName = packageName.replace('.', '/');
/*  160 */           if (classLoader == null) {
/*  161 */             classLoader = FlatLaf.class.getClassLoader();
/*      */           }
/*  163 */           for (Class<?> lafClass : lafClasses)
/*  164 */           { String propertiesName = packageName + '/' + lafClass.getSimpleName() + ".properties";
/*  165 */             InputStream in = classLoader.getResourceAsStream(propertiesName); 
/*  166 */             try { if (in != null)
/*  167 */                 properties.load(in); 
/*  168 */               if (in != null) in.close();  } catch (Throwable throwable) { if (in != null)
/*      */                 try { in.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }   throw throwable; }  } 
/*  170 */         } else if (source instanceof URL) {
/*      */           
/*  172 */           URL packageUrl = (URL)source;
/*  173 */           for (Class<?> lafClass : lafClasses) {
/*  174 */             URL propertiesUrl = new URL(packageUrl + lafClass.getSimpleName() + ".properties");
/*      */             
/*  176 */             try { InputStream in = propertiesUrl.openStream(); 
/*  177 */               try { properties.load(in);
/*  178 */                 if (in != null) in.close();  } catch (Throwable throwable) { if (in != null) try { in.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }   throw throwable; }  } catch (FileNotFoundException fileNotFoundException) {}
/*      */           }
/*      */         
/*      */         }
/*  182 */         else if (source instanceof File) {
/*      */           
/*  184 */           File folder = (File)source;
/*  185 */           for (Class<?> lafClass : lafClasses) {
/*  186 */             File propertiesFile = new File(folder, lafClass.getSimpleName() + ".properties");
/*  187 */             if (!propertiesFile.isFile()) {
/*      */               continue;
/*      */             }
/*  190 */             InputStream in = new FileInputStream(propertiesFile); 
/*  191 */             try { properties.load(in);
/*  192 */               in.close(); } catch (Throwable throwable) { try { in.close(); }
/*      */               catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }
/*      */                throw throwable; }
/*      */           
/*      */           } 
/*      */         } 
/*  198 */       }  if (additionalDefaults != null) {
/*  199 */         properties.putAll(additionalDefaults);
/*      */       }
/*      */       
/*  202 */       ArrayList<String> platformSpecificKeys = new ArrayList<>();
/*  203 */       for (Object okey : properties.keySet()) {
/*  204 */         String key = (String)okey;
/*  205 */         if (key.startsWith("[") && (key
/*  206 */           .startsWith("[win]") || key
/*  207 */           .startsWith("[mac]") || key
/*  208 */           .startsWith("[linux]") || key
/*  209 */           .startsWith("[light]") || key
/*  210 */           .startsWith("[dark]"))) {
/*  211 */           platformSpecificKeys.add(key);
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/*  216 */       if (!platformSpecificKeys.isEmpty()) {
/*      */         
/*  218 */         String lightOrDarkPrefix = dark ? "[dark]" : "[light]";
/*  219 */         for (String key : platformSpecificKeys) {
/*  220 */           if (key.startsWith(lightOrDarkPrefix)) {
/*  221 */             properties.put(key.substring(lightOrDarkPrefix.length()), properties.remove(key));
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  228 */         String platformPrefix = SystemInfo.isWindows ? "[win]" : (SystemInfo.isMacOS ? "[mac]" : (SystemInfo.isLinux ? "[linux]" : "[unknown]"));
/*  229 */         for (String key : platformSpecificKeys) {
/*  230 */           Object value = properties.remove(key);
/*  231 */           if (key.startsWith(platformPrefix)) {
/*  232 */             properties.put(key.substring(platformPrefix.length()), value);
/*      */           }
/*      */         } 
/*      */       } 
/*      */       
/*  237 */       HashMap<String, String> wildcards = new HashMap<>();
/*  238 */       Iterator<Map.Entry<Object, Object>> it = properties.entrySet().iterator();
/*  239 */       while (it.hasNext()) {
/*  240 */         Map.Entry<Object, Object> e = it.next();
/*  241 */         String key = (String)e.getKey();
/*  242 */         if (key.startsWith("*.")) {
/*  243 */           wildcards.put(key.substring("*.".length()), (String)e.getValue());
/*  244 */           it.remove();
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  249 */       for (Object key : defaults.keySet()) {
/*      */         int dot;
/*  251 */         if (!(key instanceof String) || properties
/*  252 */           .containsKey(key) || (
/*  253 */           dot = ((String)key).lastIndexOf('.')) < 0) {
/*      */           continue;
/*      */         }
/*  256 */         String wildcardKey = ((String)key).substring(dot + 1);
/*  257 */         String wildcardValue = wildcards.get(wildcardKey);
/*  258 */         if (wildcardValue != null) {
/*  259 */           properties.put(key, wildcardValue);
/*      */         }
/*      */       } 
/*  262 */       Function<String, String> propertiesGetter = key -> properties.getProperty(key);
/*      */ 
/*      */       
/*  265 */       Function<String, String> resolver = value -> resolveValue(value, propertiesGetter);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  270 */       Map<String, String> variables = new HashMap<>(50);
/*  271 */       for (Map.Entry<Object, Object> e : properties.entrySet()) {
/*  272 */         String key = (String)e.getKey();
/*  273 */         if (key.startsWith("@")) {
/*  274 */           variables.put(key, (String)e.getValue());
/*      */           
/*      */           continue;
/*      */         } 
/*  278 */         String value = (String)e.getValue();
/*      */         try {
/*  280 */           value = resolveValue(value, propertiesGetter);
/*  281 */           defaults.put(key, parseValue(key, value, null, null, resolver, addonClassLoaders));
/*  282 */         } catch (RuntimeException ex) {
/*  283 */           logParseError(key, value, ex, true);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  288 */       defaults.put("FlatLaf.internal.variables", variables);
/*      */ 
/*      */       
/*  291 */       systemColorCache = null;
/*  292 */     } catch (IOException ex) {
/*  293 */       LoggingFacade.INSTANCE.logSevere("FlatLaf: Failed to load properties files.", ex);
/*      */     } 
/*      */   }
/*      */   
/*      */   static void logParseError(String key, String value, RuntimeException ex, boolean severe) {
/*  298 */     String message = "FlatLaf: Failed to parse: '" + key + '=' + value + '\'';
/*  299 */     if (severe) {
/*  300 */       LoggingFacade.INSTANCE.logSevere(message, ex);
/*      */     } else {
/*  302 */       LoggingFacade.INSTANCE.logConfig(message, ex);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   static String resolveValue(String value, Function<String, String> propertiesGetter) throws IllegalArgumentException {
/*  308 */     value = value.trim();
/*  309 */     String value0 = value;
/*      */     
/*  311 */     if (value.startsWith("$")) {
/*  312 */       value = value.substring("$".length());
/*  313 */     } else if (!value.startsWith("@")) {
/*  314 */       return value;
/*      */     } 
/*  316 */     boolean optional = false;
/*  317 */     if (value.startsWith("?")) {
/*  318 */       value = value.substring("?".length());
/*  319 */       optional = true;
/*      */     } 
/*      */     
/*  322 */     String newValue = propertiesGetter.apply(value);
/*  323 */     if (newValue == null) {
/*  324 */       if (optional) {
/*  325 */         return "null";
/*      */       }
/*  327 */       throw new IllegalArgumentException("variable or property '" + value + "' not found");
/*      */     } 
/*      */     
/*  330 */     if (newValue.equals(value0)) {
/*  331 */       throw new IllegalArgumentException("endless recursion in variable or property '" + value + "'");
/*      */     }
/*  333 */     return resolveValue(newValue, propertiesGetter);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   static String resolveValueFromUIManager(String value) throws IllegalArgumentException {
/*  339 */     if (value.startsWith("@")) {
/*      */       
/*  341 */       Map<String, String> variables = (Map<String, String>)UIManager.get("FlatLaf.internal.variables");
/*  342 */       String str = (variables != null) ? variables.get(value) : null;
/*  343 */       if (str == null) {
/*  344 */         throw new IllegalArgumentException("variable '" + value + "' not found");
/*      */       }
/*  346 */       return resolveValueFromUIManager(str);
/*      */     } 
/*      */     
/*  349 */     if (!value.startsWith("$")) {
/*  350 */       return value;
/*      */     }
/*  352 */     String key = value.substring("$".length());
/*  353 */     Object newValue = UIManager.get(key);
/*  354 */     if (newValue == null) {
/*  355 */       throw new IllegalArgumentException("property '" + key + "' not found");
/*      */     }
/*      */     
/*  358 */     if (newValue instanceof Color) {
/*  359 */       Color color = (Color)newValue;
/*  360 */       int rgb = color.getRGB() & 0xFFFFFF;
/*  361 */       int alpha = color.getAlpha();
/*  362 */       return (alpha != 255) ? 
/*  363 */         String.format("#%06x%02x", new Object[] { Integer.valueOf(rgb), Integer.valueOf(alpha)
/*  364 */           }) : String.format("#%06x", new Object[] { Integer.valueOf(rgb) });
/*      */     } 
/*      */     
/*  367 */     throw new IllegalArgumentException("property value type '" + newValue.getClass().getName() + "' not supported in references");
/*      */   }
/*      */   
/*  370 */   enum ValueType { UNKNOWN, STRING, BOOLEAN, CHARACTER, INTEGER, INTEGERORFLOAT, FLOAT, BORDER, ICON, INSETS, DIMENSION, COLOR, FONT,
/*  371 */     SCALEDINTEGER, SCALEDFLOAT, SCALEDINSETS, SCALEDDIMENSION, INSTANCE, CLASS, GRAYFILTER, NULL, LAZY; }
/*      */   
/*  373 */   private static final ValueType[] tempResultValueType = new ValueType[1];
/*      */   
/*      */   private static Map<Class<?>, ValueType> javaValueTypes;
/*      */   
/*      */   private static Map<String, ValueType> knownValueTypes;
/*      */   
/*      */   static Object parseValue(String key, String value, Class<?> valueType) throws IllegalArgumentException {
/*  380 */     return parseValue(key, value, valueType, null, v -> v, Collections.emptyList());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static Object parseValue(String key, String value, Class<?> javaValueType, ValueType[] resultValueType, Function<String, String> resolver, List<ClassLoader> addonClassLoaders) throws IllegalArgumentException {
/*  387 */     if (resultValueType == null) {
/*  388 */       resultValueType = tempResultValueType;
/*      */     }
/*      */     
/*  391 */     if (key.startsWith("[style]")) {
/*  392 */       resultValueType[0] = ValueType.STRING;
/*  393 */       return value;
/*      */     } 
/*      */     
/*  396 */     value = value.trim();
/*      */ 
/*      */     
/*  399 */     if (value.equals("null") || value.isEmpty()) {
/*  400 */       resultValueType[0] = ValueType.NULL;
/*  401 */       return null;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  412 */     if (value.startsWith("if(") && value.endsWith(")")) {
/*  413 */       List<String> params = splitFunctionParams(value.substring(3, value.length() - 1), ',');
/*  414 */       if (params.size() != 3) {
/*  415 */         throw newMissingParametersException(value);
/*      */       }
/*  417 */       boolean ifCondition = parseCondition(params.get(0), resolver, addonClassLoaders);
/*  418 */       String ifValue = params.get(ifCondition ? 1 : 2);
/*  419 */       return parseValue(key, resolver.apply(ifValue), javaValueType, resultValueType, resolver, addonClassLoaders);
/*      */     } 
/*      */     
/*  422 */     ValueType valueType = ValueType.UNKNOWN;
/*      */     
/*  424 */     if (javaValueType != null) {
/*  425 */       if (javaValueTypes == null) {
/*      */         
/*  427 */         javaValueTypes = new HashMap<>();
/*  428 */         javaValueTypes.put(String.class, ValueType.STRING);
/*  429 */         javaValueTypes.put(boolean.class, ValueType.BOOLEAN);
/*  430 */         javaValueTypes.put(Boolean.class, ValueType.BOOLEAN);
/*  431 */         javaValueTypes.put(char.class, ValueType.CHARACTER);
/*  432 */         javaValueTypes.put(Character.class, ValueType.CHARACTER);
/*  433 */         javaValueTypes.put(int.class, ValueType.INTEGER);
/*  434 */         javaValueTypes.put(Integer.class, ValueType.INTEGER);
/*  435 */         javaValueTypes.put(float.class, ValueType.FLOAT);
/*  436 */         javaValueTypes.put(Float.class, ValueType.FLOAT);
/*  437 */         javaValueTypes.put(Border.class, ValueType.BORDER);
/*  438 */         javaValueTypes.put(Icon.class, ValueType.ICON);
/*  439 */         javaValueTypes.put(Insets.class, ValueType.INSETS);
/*  440 */         javaValueTypes.put(Dimension.class, ValueType.DIMENSION);
/*  441 */         javaValueTypes.put(Color.class, ValueType.COLOR);
/*  442 */         javaValueTypes.put(Font.class, ValueType.FONT);
/*      */       } 
/*      */ 
/*      */       
/*  446 */       valueType = javaValueTypes.get(javaValueType);
/*  447 */       if (valueType == null) {
/*  448 */         throw new IllegalArgumentException("unsupported value type '" + javaValueType.getName() + "'");
/*      */       }
/*      */       
/*  451 */       if (valueType == ValueType.STRING && value.startsWith("\"") && value.endsWith("\"")) {
/*  452 */         value = value.substring(1, value.length() - 1);
/*      */       }
/*      */     } else {
/*  455 */       switch (value) { case "false":
/*  456 */           resultValueType[0] = ValueType.BOOLEAN; return Boolean.valueOf(false);
/*  457 */         case "true": resultValueType[0] = ValueType.BOOLEAN; return Boolean.valueOf(true); }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  462 */       if (value.startsWith("lazy(") && value.endsWith(")")) {
/*  463 */         resultValueType[0] = ValueType.LAZY;
/*  464 */         String uiKey = StringUtils.substringTrimmed(value, 5, value.length() - 1);
/*  465 */         return t -> lazyUIManagerGet(uiKey);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  471 */       if (value.startsWith("#")) {
/*  472 */         valueType = ValueType.COLOR;
/*  473 */       } else if (value.startsWith("{")) {
/*  474 */         int end = value.indexOf("}");
/*  475 */         if (end != -1) {
/*      */           try {
/*  477 */             String typeStr = value.substring("{".length(), end);
/*  478 */             valueType = ValueType.valueOf(typeStr.toUpperCase(Locale.ENGLISH));
/*      */ 
/*      */             
/*  481 */             value = value.substring(end + "}".length());
/*  482 */           } catch (IllegalArgumentException illegalArgumentException) {}
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  488 */       if (valueType == ValueType.UNKNOWN) {
/*  489 */         if (knownValueTypes == null) {
/*      */           
/*  491 */           knownValueTypes = new HashMap<>();
/*      */           
/*  493 */           knownValueTypes.put("activeCaptionBorder", ValueType.COLOR);
/*  494 */           knownValueTypes.put("inactiveCaptionBorder", ValueType.COLOR);
/*  495 */           knownValueTypes.put("windowBorder", ValueType.COLOR);
/*      */           
/*  497 */           knownValueTypes.put("SplitPane.dividerSize", ValueType.INTEGER);
/*  498 */           knownValueTypes.put("SplitPaneDivider.gripDotSize", ValueType.INTEGER);
/*  499 */           knownValueTypes.put("dividerSize", ValueType.INTEGER);
/*  500 */           knownValueTypes.put("gripDotSize", ValueType.INTEGER);
/*      */           
/*  502 */           knownValueTypes.put("TabbedPane.closeCrossPlainSize", ValueType.FLOAT);
/*  503 */           knownValueTypes.put("TabbedPane.closeCrossFilledSize", ValueType.FLOAT);
/*  504 */           knownValueTypes.put("closeCrossPlainSize", ValueType.FLOAT);
/*  505 */           knownValueTypes.put("closeCrossFilledSize", ValueType.FLOAT);
/*      */           
/*  507 */           knownValueTypes.put("Table.intercellSpacing", ValueType.DIMENSION);
/*  508 */           knownValueTypes.put("intercellSpacing", ValueType.DIMENSION);
/*      */         } 
/*      */         
/*  511 */         valueType = knownValueTypes.getOrDefault(key, ValueType.UNKNOWN);
/*      */       } 
/*      */ 
/*      */       
/*  515 */       if (valueType == ValueType.UNKNOWN) {
/*  516 */         if (key.endsWith("UI")) {
/*  517 */           valueType = ValueType.STRING;
/*  518 */         } else if (key.endsWith("Color") || (key
/*  519 */           .endsWith("ground") && (key
/*  520 */           .endsWith(".background") || key.endsWith("Background") || key.equals("background") || key
/*  521 */           .endsWith(".foreground") || key.endsWith("Foreground") || key.equals("foreground")))) {
/*  522 */           valueType = ValueType.COLOR;
/*  523 */         } else if (key.endsWith(".font") || key.endsWith("Font") || key.equals("font")) {
/*  524 */           valueType = ValueType.FONT;
/*  525 */         } else if (key.endsWith(".border") || key.endsWith("Border") || key.equals("border")) {
/*  526 */           valueType = ValueType.BORDER;
/*  527 */         } else if (key.endsWith(".icon") || key.endsWith("Icon") || key.equals("icon")) {
/*  528 */           valueType = ValueType.ICON;
/*  529 */         } else if (key.endsWith(".margin") || key.equals("margin") || key
/*  530 */           .endsWith(".padding") || key.equals("padding") || key
/*  531 */           .endsWith("Margins") || key.endsWith("Insets")) {
/*  532 */           valueType = ValueType.INSETS;
/*  533 */         } else if (key.endsWith("Size")) {
/*  534 */           valueType = ValueType.DIMENSION;
/*  535 */         } else if (key.endsWith("Width") || key.endsWith("Height")) {
/*  536 */           valueType = ValueType.INTEGERORFLOAT;
/*  537 */         } else if (key.endsWith("Char")) {
/*  538 */           valueType = ValueType.CHARACTER;
/*  539 */         } else if (key.endsWith("grayFilter")) {
/*  540 */           valueType = ValueType.GRAYFILTER;
/*      */         } 
/*      */       }
/*      */     } 
/*  544 */     resultValueType[0] = valueType;
/*      */ 
/*      */     
/*  547 */     switch (valueType) { case STRING:
/*  548 */         return value;
/*  549 */       case BOOLEAN: return parseBoolean(value);
/*  550 */       case CHARACTER: return parseCharacter(value);
/*  551 */       case INTEGER: return parseInteger(value);
/*  552 */       case INTEGERORFLOAT: return parseIntegerOrFloat(value);
/*  553 */       case FLOAT: return parseFloat(value);
/*  554 */       case BORDER: return parseBorder(value, resolver, addonClassLoaders);
/*  555 */       case ICON: return parseInstance(value, resolver, addonClassLoaders);
/*  556 */       case INSETS: return parseInsets(value);
/*  557 */       case DIMENSION: return parseDimension(value);
/*  558 */       case COLOR: return parseColorOrFunction(value, resolver);
/*  559 */       case FONT: return parseFont(value);
/*  560 */       case SCALEDINTEGER: return parseScaledInteger(value);
/*  561 */       case SCALEDFLOAT: return parseScaledFloat(value);
/*  562 */       case SCALEDINSETS: return parseScaledInsets(value);
/*  563 */       case SCALEDDIMENSION: return parseScaledDimension(value);
/*  564 */       case INSTANCE: return parseInstance(value, resolver, addonClassLoaders);
/*  565 */       case CLASS: return parseClass(value, addonClassLoaders);
/*  566 */       case GRAYFILTER: return parseGrayFilter(value); }
/*      */ 
/*      */ 
/*      */     
/*  570 */     if (value.startsWith("\"") && value.endsWith("\"")) {
/*  571 */       resultValueType[0] = ValueType.STRING;
/*  572 */       return value.substring(1, value.length() - 1);
/*      */     } 
/*      */ 
/*      */     
/*  576 */     if (value.startsWith("#") || value.endsWith(")")) {
/*  577 */       Object color = parseColorOrFunction(value, resolver);
/*  578 */       resultValueType[0] = (color != null) ? ValueType.COLOR : ValueType.NULL;
/*  579 */       return color;
/*      */     } 
/*      */ 
/*      */     
/*  583 */     char firstChar = value.charAt(0);
/*  584 */     if ((firstChar >= '0' && firstChar <= '9') || firstChar == '-' || firstChar == '+' || firstChar == '.') {
/*      */       
/*      */       try {
/*      */ 
/*      */         
/*  589 */         Integer integer = parseInteger(value);
/*  590 */         resultValueType[0] = ValueType.INTEGER;
/*  591 */         return integer;
/*  592 */       } catch (NumberFormatException numberFormatException) {
/*      */ 
/*      */         
/*      */         try {
/*      */ 
/*      */           
/*  598 */           Float f = parseFloat(value);
/*  599 */           resultValueType[0] = ValueType.FLOAT;
/*  600 */           return f;
/*  601 */         } catch (NumberFormatException numberFormatException1) {}
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  607 */     resultValueType[0] = ValueType.STRING;
/*  608 */     return value;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static boolean parseCondition(String condition, Function<String, String> resolver, List<ClassLoader> addonClassLoaders) {
/*      */     try {
/*  616 */       Object conditionValue = parseValue("", resolver.apply(condition), null, null, resolver, addonClassLoaders);
/*  617 */       return (conditionValue != null && 
/*  618 */         !conditionValue.equals(Boolean.valueOf(false)) && 
/*  619 */         !conditionValue.equals(Integer.valueOf(0)));
/*  620 */     } catch (IllegalArgumentException ex) {
/*      */       
/*  622 */       return false;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static Object parseBorder(String value, Function<String, String> resolver, List<ClassLoader> addonClassLoaders) throws IllegalArgumentException {
/*  629 */     if (value.indexOf(',') >= 0) {
/*      */       
/*  631 */       List<String> parts = splitFunctionParams(value, ',');
/*  632 */       Insets insets = parseInsets(value);
/*      */ 
/*      */       
/*  635 */       ColorUIResource lineColor = (parts.size() >= 5) ? (ColorUIResource)parseColorOrFunction(resolver.apply(parts.get(4)), resolver) : null;
/*  636 */       float lineThickness = (parts.size() >= 6 && !((String)parts.get(5)).isEmpty()) ? parseFloat(parts.get(5)).floatValue() : 1.0F;
/*  637 */       int arc = (parts.size() >= 7) ? parseInteger(parts.get(6)).intValue() : 0;
/*      */       
/*  639 */       return t -> (lineColor != null) ? new FlatLineBorder(insets, lineColor, lineThickness, arc) : new FlatEmptyBorder(insets);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  645 */     return parseInstance(value, resolver, addonClassLoaders);
/*      */   }
/*      */   
/*      */   private static Object parseInstance(String value, Function<String, String> resolver, List<ClassLoader> addonClassLoaders) {
/*  649 */     return t -> {
/*      */         try {
/*      */           if (value.indexOf(',') >= 0) {
/*      */             List<String> parts = splitFunctionParams(value, ',');
/*      */             
/*      */             String className = parts.get(0);
/*      */             
/*      */             Class<?> cls = findClass(className, addonClassLoaders);
/*      */             
/*      */             Constructor[] arrayOfConstructor = (Constructor[])cls.getDeclaredConstructors();
/*      */             
/*      */             Object result = invokeConstructorOrStaticMethod((Executable[])arrayOfConstructor, parts, resolver);
/*      */             if (result != null) {
/*      */               return result;
/*      */             }
/*      */             LoggingFacade.INSTANCE.logSevere("FlatLaf: Failed to instantiate '" + className + "': no constructor found for parameters '" + value.substring(value.indexOf('-')) + "'.", null);
/*      */             return null;
/*      */           } 
/*      */           return findClass(value, addonClassLoaders).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
/*  668 */         } catch (Exception ex) {
/*      */           LoggingFacade.INSTANCE.logSevere("FlatLaf: Failed to instantiate '" + value + "'.", ex);
/*      */           return null;
/*      */         } 
/*      */       };
/*      */   }
/*      */   
/*      */   private static Object parseClass(String value, List<ClassLoader> addonClassLoaders) {
/*  676 */     return t -> {
/*      */         try {
/*      */           return findClass(value, addonClassLoaders);
/*  679 */         } catch (ClassNotFoundException ex) {
/*      */           LoggingFacade.INSTANCE.logSevere("FlatLaf: Failed to find class '" + value + "'.", ex);
/*      */           return null;
/*      */         } 
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static Class<?> findClass(String className, List<ClassLoader> addonClassLoaders) throws ClassNotFoundException {
/*      */     try {
/*  690 */       return Class.forName(className);
/*  691 */     } catch (ClassNotFoundException ex) {
/*      */       
/*  693 */       for (ClassLoader addonClassLoader : addonClassLoaders) {
/*      */         try {
/*  695 */           return addonClassLoader.loadClass(className);
/*  696 */         } catch (ClassNotFoundException classNotFoundException) {}
/*      */       } 
/*      */ 
/*      */       
/*  700 */       throw ex;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static Insets parseInsets(String value) throws IllegalArgumentException {
/*  707 */     List<String> numbers = StringUtils.split(value, ',', true, false);
/*      */     try {
/*  709 */       return new InsetsUIResource(
/*  710 */           Integer.parseInt(numbers.get(0)), 
/*  711 */           Integer.parseInt(numbers.get(1)), 
/*  712 */           Integer.parseInt(numbers.get(2)), 
/*  713 */           Integer.parseInt(numbers.get(3)));
/*  714 */     } catch (NumberFormatException ex) {
/*  715 */       throw new IllegalArgumentException("invalid insets '" + value + "'");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static Dimension parseDimension(String value) throws IllegalArgumentException {
/*  722 */     List<String> numbers = StringUtils.split(value, ',', true, false);
/*      */     try {
/*  724 */       return new DimensionUIResource(
/*  725 */           Integer.parseInt(numbers.get(0)), 
/*  726 */           Integer.parseInt(numbers.get(1)));
/*  727 */     } catch (NumberFormatException ex) {
/*  728 */       throw new IllegalArgumentException("invalid size '" + value + "'");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static Object parseColorOrFunction(String value, Function<String, String> resolver) throws IllegalArgumentException {
/*  735 */     if (value.endsWith(")")) {
/*  736 */       return parseColorFunctions(value, resolver);
/*      */     }
/*  738 */     return parseColor(value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static ColorUIResource parseColor(String value) throws IllegalArgumentException {
/*  748 */     int rgba = parseColorRGBA(value);
/*  749 */     return ((rgba & 0xFF000000) == -16777216) ? 
/*  750 */       new ColorUIResource(rgba) : 
/*  751 */       new ColorUIResource(new Color(rgba, true));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static int parseColorRGBA(String value) throws IllegalArgumentException {
/*  762 */     int len = value.length();
/*  763 */     if ((len != 4 && len != 5 && len != 7 && len != 9) || value.charAt(0) != '#') {
/*  764 */       throw newInvalidColorException(value);
/*      */     }
/*      */     
/*  767 */     int n = 0;
/*  768 */     for (int i = 1; i < len; i++) {
/*  769 */       int digit; char ch = value.charAt(i);
/*      */ 
/*      */       
/*  772 */       if (ch >= '0' && ch <= '9') {
/*  773 */         digit = ch - 48;
/*  774 */       } else if (ch >= 'a' && ch <= 'f') {
/*  775 */         digit = ch - 97 + 10;
/*  776 */       } else if (ch >= 'A' && ch <= 'F') {
/*  777 */         digit = ch - 65 + 10;
/*      */       } else {
/*  779 */         throw newInvalidColorException(value);
/*      */       } 
/*  781 */       n = n << 4 | digit;
/*      */     } 
/*      */     
/*  784 */     if (len <= 5) {
/*      */       
/*  786 */       int n1 = n & 0xF000;
/*  787 */       int n2 = n & 0xF00;
/*  788 */       int n3 = n & 0xF0;
/*  789 */       int n4 = n & 0xF;
/*  790 */       n = n1 << 16 | n1 << 12 | n2 << 12 | n2 << 8 | n3 << 8 | n3 << 4 | n4 << 4 | n4;
/*      */     } 
/*      */     
/*  793 */     return (len == 4 || len == 7) ? (
/*  794 */       0xFF000000 | n) : (
/*  795 */       n >> 8 & 0xFFFFFF | (n & 0xFF) << 24);
/*      */   }
/*      */   
/*      */   private static IllegalArgumentException newInvalidColorException(String value) {
/*  799 */     return new IllegalArgumentException("invalid color '" + value + "'");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static Object parseColorFunctions(String value, Function<String, String> resolver) throws IllegalArgumentException {
/*  805 */     int paramsStart = value.indexOf('(');
/*  806 */     if (paramsStart < 0) {
/*  807 */       throw new IllegalArgumentException("missing opening parenthesis in function '" + value + "'");
/*      */     }
/*  809 */     String function = StringUtils.substringTrimmed(value, 0, paramsStart);
/*  810 */     List<String> params = splitFunctionParams(value.substring(paramsStart + 1, value.length() - 1), ',');
/*  811 */     if (params.isEmpty()) {
/*  812 */       throw newMissingParametersException(value);
/*      */     }
/*  814 */     if (parseColorDepth > 100) {
/*  815 */       throw new IllegalArgumentException("endless recursion in color function '" + value + "'");
/*      */     }
/*  817 */     parseColorDepth++; try {
/*      */       Object object;
/*  819 */       switch (function) { case "if":
/*  820 */           object = parseColorIf(value, params, resolver); return object;
/*  821 */         case "systemColor": object = parseColorSystemColor(value, params, resolver); return object;
/*  822 */         case "rgb": object = parseColorRgbOrRgba(false, params, resolver); return object;
/*  823 */         case "rgba": object = parseColorRgbOrRgba(true, params, resolver); return object;
/*  824 */         case "hsl": object = parseColorHslOrHsla(false, params); return object;
/*  825 */         case "hsla": object = parseColorHslOrHsla(true, params); return object;
/*  826 */         case "lighten": object = parseColorHSLIncreaseDecrease(2, true, params, resolver); return object;
/*  827 */         case "darken": object = parseColorHSLIncreaseDecrease(2, false, params, resolver); return object;
/*  828 */         case "saturate": object = parseColorHSLIncreaseDecrease(1, true, params, resolver); return object;
/*  829 */         case "desaturate": object = parseColorHSLIncreaseDecrease(1, false, params, resolver); return object;
/*  830 */         case "fadein": object = parseColorHSLIncreaseDecrease(3, true, params, resolver); return object;
/*  831 */         case "fadeout": object = parseColorHSLIncreaseDecrease(3, false, params, resolver); return object;
/*  832 */         case "fade": object = parseColorFade(params, resolver); return object;
/*  833 */         case "spin": object = parseColorSpin(params, resolver); return object;
/*  834 */         case "changeHue": object = parseColorChange(0, params, resolver); return object;
/*  835 */         case "changeSaturation": object = parseColorChange(1, params, resolver); return object;
/*  836 */         case "changeLightness": object = parseColorChange(2, params, resolver); return object;
/*  837 */         case "changeAlpha": object = parseColorChange(3, params, resolver); return object;
/*  838 */         case "mix": object = parseColorMix(null, params, resolver); return object;
/*  839 */         case "tint": object = parseColorMix("#fff", params, resolver); return object;
/*  840 */         case "shade": object = parseColorMix("#000", params, resolver); return object;
/*  841 */         case "contrast": object = parseColorContrast(params, resolver); return object;
/*  842 */         case "over": object = parseColorOver(params, resolver); return object; }
/*      */     
/*      */     } finally {
/*  845 */       parseColorDepth--;
/*      */     } 
/*      */     
/*  848 */     throw new IllegalArgumentException("unknown color function '" + value + "'");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static Object parseColorIf(String value, List<String> params, Function<String, String> resolver) throws IllegalArgumentException {
/*  860 */     if (params.size() != 3) {
/*  861 */       throw newMissingParametersException(value);
/*      */     }
/*  863 */     boolean ifCondition = parseCondition(params.get(0), resolver, Collections.emptyList());
/*  864 */     String ifValue = params.get(ifCondition ? 1 : 2);
/*  865 */     return parseColorOrFunction(resolver.apply(ifValue), resolver);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static Object parseColorSystemColor(String value, List<String> params, Function<String, String> resolver) throws IllegalArgumentException {
/*  876 */     if (params.size() < 1) {
/*  877 */       throw newMissingParametersException(value);
/*      */     }
/*  879 */     ColorUIResource systemColor = getSystemColor(params.get(0));
/*  880 */     if (systemColor != null) {
/*  881 */       return systemColor;
/*      */     }
/*  883 */     String defaultValue = (params.size() > 1) ? params.get(1) : "";
/*  884 */     if (defaultValue.equals("null") || defaultValue.isEmpty()) {
/*  885 */       return null;
/*      */     }
/*  887 */     return parseColorOrFunction(resolver.apply(defaultValue), resolver);
/*      */   }
/*      */   
/*      */   private static ColorUIResource getSystemColor(String name) {
/*  891 */     Function<String, Color> systemColorGetter = FlatLaf.getSystemColorGetter();
/*  892 */     if (systemColorGetter == null) {
/*  893 */       return null;
/*      */     }
/*      */     
/*  896 */     if (systemColorCache != null && systemColorCache.containsKey(name)) {
/*  897 */       return systemColorCache.get(name);
/*      */     }
/*  899 */     Color color = systemColorGetter.apply(name);
/*  900 */     ColorUIResource uiColor = (color != null) ? new ColorUIResource(color) : null;
/*      */     
/*  902 */     if (systemColorCache != null) {
/*  903 */       systemColorCache.put(name, uiColor);
/*      */     }
/*  905 */     return uiColor;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static ColorUIResource parseColorRgbOrRgba(boolean hasAlpha, List<String> params, Function<String, String> resolver) throws IllegalArgumentException {
/*  919 */     if (hasAlpha && params.size() == 2) {
/*      */ 
/*      */ 
/*      */       
/*  923 */       String colorStr = params.get(0);
/*  924 */       int i = parseInteger(params.get(1), 0, 255, true).intValue();
/*      */       
/*  926 */       ColorUIResource color = (ColorUIResource)parseColorOrFunction(resolver.apply(colorStr), resolver);
/*  927 */       return new ColorUIResource(new Color((i & 0xFF) << 24 | color.getRGB() & 0xFFFFFF, true));
/*      */     } 
/*      */     
/*  930 */     int red = parseInteger(params.get(0), 0, 255, true).intValue();
/*  931 */     int green = parseInteger(params.get(1), 0, 255, true).intValue();
/*  932 */     int blue = parseInteger(params.get(2), 0, 255, true).intValue();
/*  933 */     int alpha = hasAlpha ? parseInteger(params.get(3), 0, 255, true).intValue() : 255;
/*      */     
/*  935 */     return hasAlpha ? 
/*  936 */       new ColorUIResource(new Color(red, green, blue, alpha)) : 
/*  937 */       new ColorUIResource(red, green, blue);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static ColorUIResource parseColorHslOrHsla(boolean hasAlpha, List<String> params) throws IllegalArgumentException {
/*  950 */     int hue = parseInteger(params.get(0), 0, 360, false).intValue();
/*  951 */     int saturation = parsePercentage(params.get(1));
/*  952 */     int lightness = parsePercentage(params.get(2));
/*  953 */     int alpha = hasAlpha ? parsePercentage(params.get(3)) : 100;
/*      */     
/*  955 */     float[] hsl = { hue, saturation, lightness };
/*  956 */     return new ColorUIResource(HSLColor.toRGB(hsl, alpha / 100.0F));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static Object parseColorHSLIncreaseDecrease(int hslIndex, boolean increase, List<String> params, Function<String, String> resolver) throws IllegalArgumentException {
/*  971 */     String colorStr = params.get(0);
/*  972 */     int amount = parsePercentage(params.get(1));
/*  973 */     boolean relative = false;
/*  974 */     boolean autoInverse = false;
/*  975 */     boolean lazy = false;
/*  976 */     boolean derived = false;
/*      */     
/*  978 */     if (params.size() > 2) {
/*  979 */       String options = params.get(2);
/*  980 */       relative = options.contains("relative");
/*  981 */       autoInverse = options.contains("autoInverse");
/*  982 */       lazy = options.contains("lazy");
/*  983 */       derived = options.contains("derived");
/*      */ 
/*      */       
/*  986 */       if (derived && !options.contains("noAutoInverse")) {
/*  987 */         autoInverse = true;
/*      */       }
/*      */     } 
/*      */     
/*  991 */     ColorFunctions.HSLIncreaseDecrease hSLIncreaseDecrease = new ColorFunctions.HSLIncreaseDecrease(hslIndex, increase, amount, relative, autoInverse);
/*      */ 
/*      */     
/*  994 */     if (lazy) {
/*  995 */       return t -> {
/*      */           Object color = lazyUIManagerGet(colorStr);
/*      */ 
/*      */           
/*      */           return (color instanceof Color) ? new ColorUIResource(ColorFunctions.applyFunctions((Color)color, new ColorFunctions.ColorFunction[] { function })) : null;
/*      */         };
/*      */     }
/*      */ 
/*      */     
/* 1004 */     return parseFunctionBaseColor(colorStr, (ColorFunctions.ColorFunction)hSLIncreaseDecrease, derived, resolver);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static Object parseColorFade(List<String> params, Function<String, String> resolver) throws IllegalArgumentException {
/* 1016 */     String colorStr = params.get(0);
/* 1017 */     int amount = parsePercentage(params.get(1));
/* 1018 */     boolean derived = false;
/* 1019 */     boolean lazy = false;
/*      */     
/* 1021 */     if (params.size() > 2) {
/* 1022 */       String options = params.get(2);
/* 1023 */       derived = options.contains("derived");
/* 1024 */       lazy = options.contains("lazy");
/*      */     } 
/*      */ 
/*      */     
/* 1028 */     ColorFunctions.Fade fade = new ColorFunctions.Fade(amount);
/*      */     
/* 1030 */     if (lazy) {
/* 1031 */       return t -> {
/*      */           Object color = lazyUIManagerGet(colorStr);
/*      */ 
/*      */           
/*      */           return (color instanceof Color) ? new ColorUIResource(ColorFunctions.applyFunctions((Color)color, new ColorFunctions.ColorFunction[] { function })) : null;
/*      */         };
/*      */     }
/*      */ 
/*      */     
/* 1040 */     return parseFunctionBaseColor(colorStr, (ColorFunctions.ColorFunction)fade, derived, resolver);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static Object parseColorSpin(List<String> params, Function<String, String> resolver) throws IllegalArgumentException {
/* 1052 */     String colorStr = params.get(0);
/* 1053 */     int amount = parseInteger(params.get(1)).intValue();
/* 1054 */     boolean derived = false;
/*      */     
/* 1056 */     if (params.size() > 2) {
/* 1057 */       String options = params.get(2);
/* 1058 */       derived = options.contains("derived");
/*      */     } 
/*      */ 
/*      */     
/* 1062 */     ColorFunctions.HSLIncreaseDecrease hSLIncreaseDecrease = new ColorFunctions.HSLIncreaseDecrease(0, true, amount, false, false);
/*      */ 
/*      */     
/* 1065 */     return parseFunctionBaseColor(colorStr, (ColorFunctions.ColorFunction)hSLIncreaseDecrease, derived, resolver);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static Object parseColorChange(int hslIndex, List<String> params, Function<String, String> resolver) throws IllegalArgumentException {
/* 1081 */     String colorStr = params.get(0);
/*      */ 
/*      */     
/* 1084 */     int value = (hslIndex == 0) ? parseInteger(params.get(1)).intValue() : parsePercentage(params.get(1));
/* 1085 */     boolean derived = false;
/*      */     
/* 1087 */     if (params.size() > 2) {
/* 1088 */       String options = params.get(2);
/* 1089 */       derived = options.contains("derived");
/*      */     } 
/*      */ 
/*      */     
/* 1093 */     ColorFunctions.HSLChange hSLChange = new ColorFunctions.HSLChange(hslIndex, value);
/*      */ 
/*      */     
/* 1096 */     return parseFunctionBaseColor(colorStr, (ColorFunctions.ColorFunction)hSLChange, derived, resolver);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static Object parseColorMix(String color1Str, List<String> params, Function<String, String> resolver) throws IllegalArgumentException {
/* 1111 */     int i = 0;
/* 1112 */     if (color1Str == null)
/* 1113 */       color1Str = params.get(i++); 
/* 1114 */     String color2Str = params.get(i++);
/* 1115 */     int weight = (params.size() > i) ? parsePercentage(params.get(i)) : 50;
/*      */ 
/*      */     
/* 1118 */     ColorUIResource color2 = (ColorUIResource)parseColorOrFunction(resolver.apply(color2Str), resolver);
/* 1119 */     if (color2 == null) {
/* 1120 */       return null;
/*      */     }
/*      */     
/* 1123 */     ColorFunctions.Mix mix = new ColorFunctions.Mix(color2, weight);
/*      */ 
/*      */     
/* 1126 */     return parseFunctionBaseColor(color1Str, (ColorFunctions.ColorFunction)mix, false, resolver);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static Object parseColorContrast(List<String> params, Function<String, String> resolver) throws IllegalArgumentException {
/* 1140 */     String colorStr = params.get(0);
/* 1141 */     String darkStr = params.get(1);
/* 1142 */     String lightStr = params.get(2);
/* 1143 */     int threshold = (params.size() > 3) ? parsePercentage(params.get(3)) : 43;
/*      */ 
/*      */     
/* 1146 */     ColorUIResource color = (ColorUIResource)parseColorOrFunction(resolver.apply(colorStr), resolver);
/* 1147 */     if (color == null) {
/* 1148 */       return null;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1153 */     String darkOrLightColor = (ColorFunctions.luma(color) * 100.0F < threshold) ? lightStr : darkStr;
/*      */ 
/*      */     
/* 1156 */     return parseColorOrFunction(resolver.apply(darkOrLightColor), resolver);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static ColorUIResource parseColorOver(List<String> params, Function<String, String> resolver) throws IllegalArgumentException {
/* 1168 */     String foregroundStr = params.get(0);
/* 1169 */     String backgroundStr = params.get(1);
/*      */ 
/*      */     
/* 1172 */     ColorUIResource foreground = (ColorUIResource)parseColorOrFunction(resolver.apply(foregroundStr), resolver);
/* 1173 */     if (foreground == null || foreground.getAlpha() == 255) {
/* 1174 */       return foreground;
/*      */     }
/*      */     
/* 1177 */     ColorUIResource foreground2 = new ColorUIResource(foreground.getRGB());
/*      */ 
/*      */     
/* 1180 */     ColorUIResource background = (ColorUIResource)parseColorOrFunction(resolver.apply(backgroundStr), resolver);
/* 1181 */     if (background == null) {
/* 1182 */       return foreground2;
/*      */     }
/*      */     
/* 1185 */     float weight = foreground.getAlpha() / 255.0F;
/* 1186 */     return new ColorUIResource(ColorFunctions.mix(foreground2, background, weight));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static Object parseFunctionBaseColor(String colorStr, ColorFunctions.ColorFunction function, boolean derived, Function<String, String> resolver) throws IllegalArgumentException {
/* 1194 */     String resolvedColorStr = resolver.apply(colorStr);
/* 1195 */     ColorUIResource baseColor = (ColorUIResource)parseColorOrFunction(resolvedColorStr, resolver);
/* 1196 */     if (baseColor == null) {
/* 1197 */       return null;
/*      */     }
/*      */     
/* 1200 */     Color newColor = ColorFunctions.applyFunctions(baseColor, new ColorFunctions.ColorFunction[] { function });
/*      */     
/* 1202 */     if (derived) {
/*      */       ColorFunctions.ColorFunction[] functions;
/* 1204 */       if (baseColor instanceof DerivedColor && resolvedColorStr == colorStr) {
/*      */ 
/*      */         
/* 1207 */         ColorFunctions.ColorFunction[] baseFunctions = ((DerivedColor)baseColor).getFunctions();
/* 1208 */         functions = new ColorFunctions.ColorFunction[baseFunctions.length + 1];
/* 1209 */         System.arraycopy(baseFunctions, 0, functions, 0, baseFunctions.length);
/* 1210 */         functions[baseFunctions.length] = function;
/*      */       } else {
/* 1212 */         functions = new ColorFunctions.ColorFunction[] { function };
/*      */       } 
/* 1214 */       return new DerivedColor(newColor, functions);
/*      */     } 
/*      */     
/* 1217 */     return new ColorUIResource(newColor);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static Object parseFont(String value) throws IllegalArgumentException {
/* 1226 */     Object font = fontCache.get(value);
/* 1227 */     if (font != null) {
/* 1228 */       return font;
/*      */     }
/* 1230 */     int style = -1;
/* 1231 */     int styleChange = 0;
/* 1232 */     int absoluteSize = 0;
/* 1233 */     int relativeSize = 0;
/* 1234 */     float scaleSize = 0.0F;
/* 1235 */     List<String> families = null;
/* 1236 */     String baseFontKey = null;
/*      */ 
/*      */     
/* 1239 */     StreamTokenizer st = new StreamTokenizer(new StringReader(value));
/* 1240 */     st.resetSyntax();
/* 1241 */     st.wordChars(33, 255);
/* 1242 */     st.whitespaceChars(0, 32);
/* 1243 */     st.whitespaceChars(44, 44);
/* 1244 */     st.quoteChar(34);
/* 1245 */     st.quoteChar(39);
/*      */     
/*      */     try {
/* 1248 */       while (st.nextToken() != -1) {
/* 1249 */         String param = st.sval;
/* 1250 */         switch (param) {
/*      */           
/*      */           case "normal":
/* 1253 */             style = 0;
/*      */             continue;
/*      */           
/*      */           case "bold":
/* 1257 */             if (style == -1)
/* 1258 */               style = 0; 
/* 1259 */             style |= 0x1;
/*      */             continue;
/*      */           
/*      */           case "italic":
/* 1263 */             if (style == -1)
/* 1264 */               style = 0; 
/* 1265 */             style |= 0x2;
/*      */             continue;
/*      */           case "+bold":
/* 1268 */             styleChange |= 0x1; continue;
/* 1269 */           case "-bold": styleChange |= 0x10000; continue;
/* 1270 */           case "+italic": styleChange |= 0x2; continue;
/* 1271 */           case "-italic": styleChange |= 0x20000;
/*      */             continue;
/*      */         } 
/* 1274 */         char firstChar = param.charAt(0);
/* 1275 */         if (Character.isDigit(firstChar) || firstChar == '+' || firstChar == '-') {
/*      */           
/* 1277 */           if (absoluteSize != 0 || relativeSize != 0 || scaleSize != 0.0F) {
/* 1278 */             throw new IllegalArgumentException("size specified more than once in '" + value + "'");
/*      */           }
/* 1280 */           if (firstChar == '+' || firstChar == '-') {
/* 1281 */             relativeSize = parseInteger(param).intValue(); continue;
/* 1282 */           }  if (param.endsWith("%")) {
/* 1283 */             scaleSize = parseInteger(param.substring(0, param.length() - 1)).intValue() / 100.0F; continue;
/*      */           } 
/* 1285 */           absoluteSize = parseInteger(param).intValue(); continue;
/* 1286 */         }  if (firstChar == '$') {
/*      */           
/* 1288 */           if (baseFontKey != null) {
/* 1289 */             throw new IllegalArgumentException("baseFontKey specified more than once in '" + value + "'");
/*      */           }
/* 1291 */           baseFontKey = param.substring(1);
/*      */           continue;
/*      */         } 
/* 1294 */         if (families == null) {
/* 1295 */           families = Collections.singletonList(param); continue;
/*      */         } 
/* 1297 */         if (families.size() == 1)
/* 1298 */           families = new ArrayList<>(families); 
/* 1299 */         families.add(param);
/*      */       
/*      */       }
/*      */ 
/*      */     
/*      */     }
/* 1305 */     catch (IOException ex) {
/* 1306 */       throw new IllegalArgumentException(ex);
/*      */     } 
/*      */     
/* 1309 */     if (style != -1 && styleChange != 0)
/* 1310 */       throw new IllegalArgumentException("can not mix absolute style (e.g. 'bold') with derived style (e.g. '+italic') in '" + value + "'"); 
/* 1311 */     if (styleChange != 0) {
/* 1312 */       if ((styleChange & 0x1) != 0 && (styleChange & 0x10000) != 0)
/* 1313 */         throw new IllegalArgumentException("can not use '+bold' and '-bold' in '" + value + "'"); 
/* 1314 */       if ((styleChange & 0x2) != 0 && (styleChange & 0x20000) != 0) {
/* 1315 */         throw new IllegalArgumentException("can not use '+italic' and '-italic' in '" + value + "'");
/*      */       }
/*      */     } 
/* 1318 */     font = new FlatLaf.ActiveFont(baseFontKey, families, style, styleChange, absoluteSize, relativeSize, scaleSize);
/* 1319 */     fontCache.put(value, font);
/* 1320 */     return font;
/*      */   }
/*      */ 
/*      */   
/*      */   private static int parsePercentage(String value) throws IllegalArgumentException, NumberFormatException {
/*      */     int val;
/* 1326 */     if (!value.endsWith("%")) {
/* 1327 */       throw new NumberFormatException("invalid percentage '" + value + "'");
/*      */     }
/*      */     
/*      */     try {
/* 1331 */       val = Integer.parseInt(value.substring(0, value.length() - 1));
/* 1332 */     } catch (NumberFormatException ex) {
/* 1333 */       throw new NumberFormatException("invalid percentage '" + value + "'");
/*      */     } 
/*      */     
/* 1336 */     if (val < 0 || val > 100)
/* 1337 */       throw new IllegalArgumentException("percentage out of range (0-100%) '" + value + "'"); 
/* 1338 */     return val;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static Boolean parseBoolean(String value) throws IllegalArgumentException {
/* 1344 */     switch (value) { case "false":
/* 1345 */         return Boolean.valueOf(false);
/* 1346 */       case "true": return Boolean.valueOf(true); }
/*      */     
/* 1348 */     throw new IllegalArgumentException("invalid boolean '" + value + "'");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static Character parseCharacter(String value) throws IllegalArgumentException {
/* 1354 */     if (value.length() != 1)
/* 1355 */       throw new IllegalArgumentException("invalid character '" + value + "'"); 
/* 1356 */     return Character.valueOf(value.charAt(0));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static Integer parseInteger(String value, int min, int max, boolean allowPercentage) throws IllegalArgumentException, NumberFormatException {
/* 1362 */     if (allowPercentage && value.endsWith("%")) {
/* 1363 */       int percent = parsePercentage(value);
/* 1364 */       return Integer.valueOf(max * percent / 100);
/*      */     } 
/*      */     
/* 1367 */     Integer integer = parseInteger(value);
/* 1368 */     if (integer.intValue() < min || integer.intValue() > max)
/* 1369 */       throw new NumberFormatException("integer '" + value + "' out of range (" + min + '-' + max + ')'); 
/* 1370 */     return integer;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static Integer parseInteger(String value) throws NumberFormatException {
/*      */     try {
/* 1377 */       return Integer.valueOf(Integer.parseInt(value));
/* 1378 */     } catch (NumberFormatException ex) {
/* 1379 */       throw new NumberFormatException("invalid integer '" + value + "'");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static Number parseIntegerOrFloat(String value) throws NumberFormatException {
/*      */     try {
/* 1387 */       return Integer.valueOf(Integer.parseInt(value));
/* 1388 */     } catch (NumberFormatException ex) {
/*      */       try {
/* 1390 */         return Float.valueOf(Float.parseFloat(value));
/* 1391 */       } catch (NumberFormatException ex2) {
/* 1392 */         throw new NumberFormatException("invalid integer or float '" + value + "'");
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static Float parseFloat(String value) throws NumberFormatException {
/*      */     try {
/* 1401 */       return Float.valueOf(Float.parseFloat(value));
/* 1402 */     } catch (NumberFormatException ex) {
/* 1403 */       throw new NumberFormatException("invalid float '" + value + "'");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static UIDefaults.ActiveValue parseScaledInteger(String value) throws NumberFormatException {
/* 1410 */     int val = parseInteger(value).intValue();
/* 1411 */     return t -> Integer.valueOf(UIScale.scale(val));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static UIDefaults.ActiveValue parseScaledFloat(String value) throws NumberFormatException {
/* 1419 */     float val = parseFloat(value).floatValue();
/* 1420 */     return t -> Float.valueOf(UIScale.scale(val));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static UIDefaults.ActiveValue parseScaledInsets(String value) throws IllegalArgumentException {
/* 1428 */     Insets insets = parseInsets(value);
/* 1429 */     return t -> UIScale.scale(insets);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static UIDefaults.ActiveValue parseScaledDimension(String value) throws IllegalArgumentException {
/* 1437 */     Dimension dimension = parseDimension(value);
/* 1438 */     return t -> UIScale.scale(dimension);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static Object parseGrayFilter(String value) throws IllegalArgumentException {
/* 1446 */     List<String> numbers = StringUtils.split(value, ',', true, false);
/*      */     try {
/* 1448 */       int brightness = Integer.parseInt(numbers.get(0));
/* 1449 */       int contrast = Integer.parseInt(numbers.get(1));
/* 1450 */       int alpha = Integer.parseInt(numbers.get(2));
/*      */       
/* 1452 */       return t -> new GrayFilter(brightness, contrast, alpha);
/*      */     
/*      */     }
/* 1455 */     catch (NumberFormatException ex) {
/* 1456 */       throw new IllegalArgumentException("invalid gray filter '" + value + "'");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static List<String> splitFunctionParams(String str, char delim) {
/* 1465 */     ArrayList<String> strs = new ArrayList<>();
/* 1466 */     int nestLevel = 0;
/* 1467 */     int start = 0;
/* 1468 */     int strlen = str.length();
/* 1469 */     for (int i = 0; i < strlen; i++) {
/* 1470 */       char ch = str.charAt(i);
/* 1471 */       if (ch == '(') {
/* 1472 */         nestLevel++;
/* 1473 */       } else if (ch == ')') {
/* 1474 */         nestLevel--;
/* 1475 */       } else if (nestLevel == 0 && ch == delim) {
/* 1476 */         strs.add(StringUtils.substringTrimmed(str, start, i));
/* 1477 */         start = i + 1;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1482 */     String s = StringUtils.substringTrimmed(str, start);
/* 1483 */     if (!s.isEmpty() || !strs.isEmpty()) {
/* 1484 */       strs.add(s);
/*      */     }
/* 1486 */     return strs;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static Object invokeConstructorOrStaticMethod(Executable[] constructorsOrMethods, List<String> parts, Function<String, String> resolver) throws Exception {
/* 1496 */     constructorsOrMethods = (Executable[])constructorsOrMethods.clone();
/* 1497 */     Arrays.sort(constructorsOrMethods, (c1, c2) -> {
/*      */           Class<?>[] ptypes1 = c1.getParameterTypes();
/*      */           
/*      */           Class<?>[] ptypes2 = c2.getParameterTypes();
/*      */           
/*      */           if (ptypes1.length != ptypes2.length) {
/*      */             return ptypes1.length - ptypes2.length;
/*      */           }
/*      */           
/*      */           for (int i = 0; i < ptypes1.length; i++) {
/*      */             Class<?> pt1 = ptypes1[i];
/*      */             Class<?> pt2 = ptypes2[i];
/*      */             if (pt1 != pt2) {
/*      */               if (pt1 == String.class) {
/*      */                 return 2;
/*      */               }
/*      */               if (pt2 == String.class) {
/*      */                 return -2;
/*      */               }
/*      */               if (pt1 == int.class) {
/*      */                 return -1;
/*      */               }
/*      */               if (pt2 == int.class) {
/*      */                 return 1;
/*      */               }
/*      */             } 
/*      */           } 
/*      */           return 0;
/*      */         });
/* 1526 */     for (Executable cm : constructorsOrMethods) {
/* 1527 */       if (cm.getParameterCount() == parts.size() - 1) {
/*      */ 
/*      */         
/* 1530 */         Object[] params = parseMethodParams(cm.getParameterTypes(), parts, resolver);
/* 1531 */         if (params != null) {
/*      */ 
/*      */ 
/*      */           
/* 1535 */           if (cm instanceof Constructor) {
/* 1536 */             return ((Constructor)cm).newInstance(params);
/*      */           }
/* 1538 */           return ((Method)cm).invoke(null, params);
/*      */         } 
/*      */       } 
/* 1541 */     }  return null;
/*      */   }
/*      */   
/*      */   private static Object[] parseMethodParams(Class<?>[] paramTypes, List<String> parts, Function<String, String> resolver) {
/* 1545 */     Object[] params = new Object[paramTypes.length];
/*      */     try {
/* 1547 */       for (int i = 0; i < params.length; i++) {
/* 1548 */         Class<?> paramType = paramTypes[i];
/* 1549 */         String paramValue = parts.get(i + 1);
/* 1550 */         if (paramType == String.class)
/* 1551 */         { params[i] = paramValue; }
/* 1552 */         else if (paramType == boolean.class)
/* 1553 */         { params[i] = parseBoolean(paramValue); }
/* 1554 */         else if (paramType == int.class)
/* 1555 */         { params[i] = parseInteger(paramValue); }
/* 1556 */         else if (paramType == float.class)
/* 1557 */         { params[i] = parseFloat(paramValue); }
/* 1558 */         else if (paramType == Color.class)
/* 1559 */         { params[i] = parseColorOrFunction(resolver.apply(paramValue), resolver); }
/*      */         else
/* 1561 */         { return null; } 
/*      */       } 
/* 1563 */     } catch (IllegalArgumentException ex) {
/* 1564 */       return null;
/*      */     } 
/* 1566 */     return params;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static Object lazyUIManagerGet(String uiKey) {
/* 1574 */     boolean optional = false;
/* 1575 */     if (uiKey.startsWith("?")) {
/* 1576 */       uiKey = uiKey.substring("?".length());
/* 1577 */       optional = true;
/*      */     } 
/*      */     
/* 1580 */     Object value = UIManager.get(uiKey);
/* 1581 */     if (value == null && !optional)
/* 1582 */       LoggingFacade.INSTANCE.logSevere("FlatLaf: '" + uiKey + "' not found in UI defaults.", null); 
/* 1583 */     return value;
/*      */   }
/*      */   
/*      */   private static IllegalArgumentException newMissingParametersException(String value) {
/* 1587 */     return new IllegalArgumentException("missing parameters in function '" + value + "'");
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\UIDefaultsLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */