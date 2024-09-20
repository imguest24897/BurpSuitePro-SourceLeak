/*     */ package com.formdev.flatlaf;
/*     */ 
/*     */ import com.formdev.flatlaf.json.Json;
/*     */ import com.formdev.flatlaf.json.ParseException;
/*     */ import com.formdev.flatlaf.util.ColorFunctions;
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import com.formdev.flatlaf.util.StringUtils;
/*     */ import com.formdev.flatlaf.util.SystemInfo;
/*     */ import java.awt.Color;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.Reader;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.Enumeration;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.swing.UIDefaults;
/*     */ import javax.swing.plaf.ColorUIResource;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class IntelliJTheme
/*     */ {
/*     */   public final String name;
/*     */   public final boolean dark;
/*     */   public final String author;
/*     */   private final boolean isMaterialUILite;
/*     */   private Map<String, String> colors;
/*     */   private Map<String, Object> ui;
/*     */   private Map<String, Object> icons;
/*     */   private Map<String, ColorUIResource> namedColors;
/*     */   private static final Set<String> uiKeyExcludes;
/*     */   private static final Set<String> uiKeyDoNotOverride;
/*     */   
/*     */   public static boolean setup(InputStream in) {
/*     */     try {
/*  85 */       return FlatLaf.setup(createLaf(in));
/*  86 */     } catch (Exception ex) {
/*  87 */       LoggingFacade.INSTANCE.logSevere("FlatLaf: Failed to load IntelliJ theme", ex);
/*  88 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static boolean install(InputStream in) {
/*  97 */     return setup(in);
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
/*     */   public static FlatLaf createLaf(InputStream in) throws IOException {
/* 110 */     return createLaf(new IntelliJTheme(in));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static FlatLaf createLaf(IntelliJTheme theme) {
/* 117 */     return new ThemeLaf(theme);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IntelliJTheme(InputStream in) throws IOException {
/*     */     Map<String, Object> json;
/*     */     this.namedColors = Collections.emptyMap();
/*     */     
/* 131 */     try { Reader reader = new InputStreamReader(in, StandardCharsets.UTF_8); 
/* 132 */       try { json = (Map<String, Object>)Json.parse(reader);
/* 133 */         reader.close(); } catch (Throwable throwable) { try { reader.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }  } catch (ParseException ex)
/* 134 */     { throw new IOException(ex.getMessage(), ex); }
/*     */ 
/*     */     
/* 137 */     this.name = (String)json.get("name");
/* 138 */     this.dark = Boolean.parseBoolean((String)json.get("dark"));
/* 139 */     this.author = (String)json.get("author");
/*     */     
/* 141 */     this.isMaterialUILite = this.author.equals("Mallowigi");
/*     */     
/* 143 */     this.colors = (Map<String, String>)json.get("colors");
/* 144 */     this.ui = (Map<String, Object>)json.get("ui");
/* 145 */     this.icons = (Map<String, Object>)json.get("icons");
/*     */   }
/*     */   
/*     */   private void applyProperties(UIDefaults defaults) {
/* 149 */     if (this.ui == null) {
/*     */       return;
/*     */     }
/* 152 */     defaults.put("Component.isIntelliJTheme", Boolean.valueOf(true));
/*     */ 
/*     */     
/* 155 */     defaults.put("Button.paintShadow", Boolean.valueOf(true));
/* 156 */     defaults.put("Button.shadowWidth", Integer.valueOf(this.dark ? 2 : 1));
/*     */     
/* 158 */     Map<Object, Object> themeSpecificDefaults = removeThemeSpecificDefaults(defaults);
/*     */     
/* 160 */     loadNamedColors(defaults);
/*     */ 
/*     */     
/* 163 */     ArrayList<Object> defaultsKeysCache = new ArrayList();
/* 164 */     Set<String> uiKeys = new HashSet<>();
/* 165 */     for (Map.Entry<String, Object> e : this.ui.entrySet()) {
/* 166 */       apply(e.getKey(), e.getValue(), defaults, defaultsKeysCache, uiKeys);
/*     */     }
/* 168 */     applyColorPalette(defaults);
/* 169 */     applyCheckBoxColors(defaults);
/*     */ 
/*     */     
/* 172 */     for (Map.Entry<String, String> e : uiKeyCopying.entrySet()) {
/* 173 */       Object value = defaults.get(e.getValue());
/* 174 */       if (value != null) {
/* 175 */         defaults.put(e.getKey(), value);
/*     */       }
/*     */     } 
/*     */     
/* 179 */     Object panelBackground = defaults.get("Panel.background");
/* 180 */     defaults.put("Button.disabledBackground", panelBackground);
/* 181 */     defaults.put("ToggleButton.disabledBackground", panelBackground);
/*     */ 
/*     */     
/* 184 */     copyIfNotSet(defaults, "Button.focusedBorderColor", "Component.focusedBorderColor", uiKeys);
/* 185 */     defaults.put("Button.hoverBorderColor", defaults.get("Button.focusedBorderColor"));
/* 186 */     defaults.put("HelpButton.hoverBorderColor", defaults.get("Button.focusedBorderColor"));
/*     */ 
/*     */     
/* 189 */     Object helpButtonBackground = defaults.get("Button.startBackground");
/* 190 */     Object helpButtonBorderColor = defaults.get("Button.startBorderColor");
/* 191 */     if (helpButtonBackground == null)
/* 192 */       helpButtonBackground = defaults.get("Button.background"); 
/* 193 */     if (helpButtonBorderColor == null)
/* 194 */       helpButtonBorderColor = defaults.get("Button.borderColor"); 
/* 195 */     defaults.put("HelpButton.background", helpButtonBackground);
/* 196 */     defaults.put("HelpButton.borderColor", helpButtonBorderColor);
/* 197 */     defaults.put("HelpButton.disabledBackground", panelBackground);
/* 198 */     defaults.put("HelpButton.disabledBorderColor", defaults.get("Button.disabledBorderColor"));
/* 199 */     defaults.put("HelpButton.focusedBorderColor", defaults.get("Button.focusedBorderColor"));
/* 200 */     defaults.put("HelpButton.focusedBackground", defaults.get("Button.focusedBackground"));
/*     */ 
/*     */     
/* 203 */     Object textFieldBackground = get(defaults, themeSpecificDefaults, "TextField.background");
/* 204 */     defaults.put("ComboBox.editableBackground", textFieldBackground);
/* 205 */     defaults.put("Spinner.background", textFieldBackground);
/*     */ 
/*     */     
/* 208 */     defaults.put("Spinner.buttonBackground", defaults.get("ComboBox.buttonEditableBackground"));
/* 209 */     defaults.put("Spinner.buttonArrowColor", defaults.get("ComboBox.buttonArrowColor"));
/* 210 */     defaults.put("Spinner.buttonDisabledArrowColor", defaults.get("ComboBox.buttonDisabledArrowColor"));
/*     */ 
/*     */ 
/*     */     
/* 214 */     putAll(defaults, textFieldBackground, new String[] { "EditorPane.background", "FormattedTextField.background", "PasswordField.background", "TextArea.background", "TextPane.background" });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 221 */     putAll(defaults, get(defaults, themeSpecificDefaults, "TextField.selectionBackground"), new String[] { "EditorPane.selectionBackground", "FormattedTextField.selectionBackground", "PasswordField.selectionBackground", "TextArea.selectionBackground", "TextPane.selectionBackground" });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 228 */     putAll(defaults, get(defaults, themeSpecificDefaults, "TextField.selectionForeground"), new String[] { "EditorPane.selectionForeground", "FormattedTextField.selectionForeground", "PasswordField.selectionForeground", "TextArea.selectionForeground", "TextPane.selectionForeground" });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 238 */     putAll(defaults, panelBackground, new String[] { "ComboBox.disabledBackground", "EditorPane.disabledBackground", "EditorPane.inactiveBackground", "FormattedTextField.disabledBackground", "FormattedTextField.inactiveBackground", "PasswordField.disabledBackground", "PasswordField.inactiveBackground", "Spinner.disabledBackground", "TextArea.disabledBackground", "TextArea.inactiveBackground", "TextField.disabledBackground", "TextField.inactiveBackground", "TextPane.disabledBackground", "TextPane.inactiveBackground" });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 250 */     if (!uiKeys.contains("ToggleButton.startBackground") && !uiKeys.contains("*.startBackground"))
/* 251 */       defaults.put("ToggleButton.startBackground", defaults.get("Button.startBackground")); 
/* 252 */     if (!uiKeys.contains("ToggleButton.endBackground") && !uiKeys.contains("*.endBackground"))
/* 253 */       defaults.put("ToggleButton.endBackground", defaults.get("Button.endBackground")); 
/* 254 */     if (!uiKeys.contains("ToggleButton.foreground") && uiKeys.contains("Button.foreground")) {
/* 255 */       defaults.put("ToggleButton.foreground", defaults.get("Button.foreground"));
/*     */     }
/*     */     
/* 258 */     Color desktopBackgroundBase = defaults.getColor("Panel.background");
/* 259 */     Color desktopBackground = ColorFunctions.applyFunctions(desktopBackgroundBase, new ColorFunctions.ColorFunction[] { (ColorFunctions.ColorFunction)new ColorFunctions.HSLIncreaseDecrease(2, this.dark, 5.0F, false, true) });
/*     */     
/* 261 */     defaults.put("Desktop.background", new ColorUIResource(desktopBackground));
/*     */ 
/*     */     
/* 264 */     if (this.isMaterialUILite) {
/* 265 */       defaults.put("List.background", defaults.get("Tree.background"));
/* 266 */       defaults.put("Table.background", defaults.get("Tree.background"));
/*     */     } 
/*     */ 
/*     */     
/* 270 */     int rowHeight = defaults.getInt("Tree.rowHeight");
/* 271 */     if (rowHeight > 22) {
/* 272 */       defaults.put("Tree.rowHeight", Integer.valueOf(22));
/*     */     }
/*     */     
/* 275 */     HashMap<String, Object> wildcards = new HashMap<>();
/* 276 */     Iterator<Map.Entry<Object, Object>> it = themeSpecificDefaults.entrySet().iterator();
/* 277 */     while (it.hasNext()) {
/* 278 */       Map.Entry<Object, Object> e = it.next();
/* 279 */       String key = (String)e.getKey();
/* 280 */       if (key.startsWith("*.")) {
/* 281 */         wildcards.put(key.substring("*.".length()), e.getValue());
/* 282 */         it.remove();
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 287 */     if (!wildcards.isEmpty()) {
/* 288 */       for (Object key : defaults.keySet().toArray()) {
/*     */         int dot;
/* 290 */         if (key instanceof String && (
/* 291 */           dot = ((String)key).lastIndexOf('.')) >= 0) {
/*     */ 
/*     */           
/* 294 */           String wildcardKey = ((String)key).substring(dot + 1);
/* 295 */           Object wildcardValue = wildcards.get(wildcardKey);
/* 296 */           if (wildcardValue != null) {
/* 297 */             defaults.put(key, wildcardValue);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/* 302 */     for (Map.Entry<Object, Object> e : themeSpecificDefaults.entrySet()) {
/* 303 */       Object key = e.getKey();
/* 304 */       Object value = e.getValue();
/*     */ 
/*     */       
/* 307 */       if (key instanceof String && ((String)key).startsWith("[style]")) {
/* 308 */         Object oldValue = defaults.get(key);
/* 309 */         if (oldValue != null) {
/* 310 */           value = oldValue + "; " + value;
/*     */         }
/*     */       } 
/* 313 */       defaults.put(key, value);
/*     */     } 
/*     */ 
/*     */     
/* 317 */     this.colors = null;
/* 318 */     this.ui = null;
/* 319 */     this.icons = null;
/*     */   }
/*     */   
/*     */   private Object get(UIDefaults defaults, Map<Object, Object> themeSpecificDefaults, String key) {
/* 323 */     return themeSpecificDefaults.getOrDefault(key, defaults.get(key));
/*     */   }
/*     */   
/*     */   private void putAll(UIDefaults defaults, Object value, String... keys) {
/* 327 */     for (String key : keys) {
/* 328 */       defaults.put(key, value);
/*     */     }
/*     */   }
/*     */   
/*     */   private Map<Object, Object> removeThemeSpecificDefaults(UIDefaults defaults) {
/* 333 */     ArrayList<String> themeSpecificKeys = new ArrayList<>();
/* 334 */     for (Object key : defaults.keySet()) {
/* 335 */       if (key instanceof String && ((String)key).startsWith("[") && !((String)key).startsWith("[style]")) {
/* 336 */         themeSpecificKeys.add((String)key);
/*     */       }
/*     */     } 
/*     */     
/* 340 */     Map<Object, Object> themeSpecificDefaults = new HashMap<>();
/* 341 */     String currentThemePrefix = '[' + this.name.replace(' ', '_') + ']';
/* 342 */     String currentThemeAndAuthorPrefix = '[' + this.name.replace(' ', '_') + "---" + this.author.replace(' ', '_') + ']';
/* 343 */     String currentAuthorPrefix = "[author-" + this.author.replace(' ', '_') + ']';
/* 344 */     String allThemesPrefix = "[*]";
/* 345 */     String[] prefixes = { currentThemePrefix, currentThemeAndAuthorPrefix, currentAuthorPrefix, allThemesPrefix };
/* 346 */     for (String key : themeSpecificKeys) {
/* 347 */       Object value = defaults.remove(key);
/* 348 */       for (String prefix : prefixes) {
/* 349 */         if (key.startsWith(prefix)) {
/* 350 */           themeSpecificDefaults.put(key.substring(prefix.length()), value);
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/* 356 */     return themeSpecificDefaults;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void loadNamedColors(UIDefaults defaults) {
/* 363 */     if (this.colors == null) {
/*     */       return;
/*     */     }
/* 366 */     this.namedColors = new HashMap<>();
/*     */     
/* 368 */     for (Map.Entry<String, String> e : this.colors.entrySet()) {
/* 369 */       String value = e.getValue();
/* 370 */       ColorUIResource color = parseColor(value);
/* 371 */       if (color != null) {
/* 372 */         String key = e.getKey();
/* 373 */         this.namedColors.put(key, color);
/* 374 */         defaults.put("ColorPalette." + key, color);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void apply(String key, Object value, UIDefaults defaults, ArrayList<Object> defaultsKeysCache, Set<String> uiKeys) {
/* 384 */     if (value instanceof Map) {
/* 385 */       Map<String, Object> map = (Map<String, Object>)value;
/* 386 */       if (map.containsKey("os.default") || map.containsKey("os.windows") || map.containsKey("os.mac") || map.containsKey("os.linux"))
/*     */       
/*     */       { 
/* 389 */         String osKey = SystemInfo.isWindows ? "os.windows" : (SystemInfo.isMacOS ? "os.mac" : (SystemInfo.isLinux ? "os.linux" : null));
/* 390 */         if (osKey != null && map.containsKey(osKey)) {
/* 391 */           apply(key, map.get(osKey), defaults, defaultsKeysCache, uiKeys);
/* 392 */         } else if (map.containsKey("os.default")) {
/* 393 */           apply(key, map.get("os.default"), defaults, defaultsKeysCache, uiKeys);
/*     */         }  }
/* 395 */       else { for (Map.Entry<String, Object> e : map.entrySet())
/* 396 */           apply(key + '.' + (String)e.getKey(), e.getValue(), defaults, defaultsKeysCache, uiKeys);  }
/*     */     
/*     */     } else {
/* 399 */       if ("".equals(value)) {
/*     */         return;
/*     */       }
/*     */       
/* 403 */       if (key.endsWith(".border") || key
/* 404 */         .endsWith(".rowHeight") || key
/* 405 */         .equals("ComboBox.padding") || key
/* 406 */         .equals("Spinner.padding") || key
/* 407 */         .equals("Tree.leftChildIndent") || key
/* 408 */         .equals("Tree.rightChildIndent")) {
/*     */         return;
/*     */       }
/*     */       
/* 412 */       key = uiKeyMapping.getOrDefault(key, key);
/* 413 */       if (key.isEmpty()) {
/*     */         return;
/*     */       }
/*     */       
/* 417 */       int dot = key.indexOf('.');
/* 418 */       if (dot > 0 && uiKeyExcludes.contains(key.substring(0, dot + 1))) {
/*     */         return;
/*     */       }
/* 421 */       if (uiKeyDoNotOverride.contains(key) && uiKeys.contains(key)) {
/*     */         return;
/*     */       }
/* 424 */       uiKeys.add(key);
/*     */       
/* 426 */       String valueStr = value.toString();
/*     */ 
/*     */       
/* 429 */       Object uiValue = this.namedColors.get(valueStr);
/*     */ 
/*     */       
/* 432 */       if (uiValue == null) {
/*     */         
/* 434 */         if (!valueStr.startsWith("#") && (key.endsWith("ground") || key.endsWith("Color"))) {
/* 435 */           valueStr = fixColorIfValid("#" + valueStr, valueStr);
/* 436 */         } else if (valueStr.startsWith("##")) {
/* 437 */           valueStr = fixColorIfValid(valueStr.substring(1), valueStr);
/* 438 */         } else if (key.endsWith(".border") || key.endsWith("Border")) {
/* 439 */           List<String> parts = StringUtils.split(valueStr, ',');
/* 440 */           if (parts.size() == 5 && !((String)parts.get(4)).startsWith("#")) {
/* 441 */             parts.set(4, "#" + (String)parts.get(4));
/* 442 */             valueStr = String.join(",", (Iterable)parts);
/*     */           } 
/*     */         } 
/*     */ 
/*     */         
/*     */         try {
/* 448 */           uiValue = UIDefaultsLoader.parseValue(key, valueStr, null);
/* 449 */         } catch (RuntimeException ex) {
/* 450 */           UIDefaultsLoader.logParseError(key, valueStr, ex, false);
/*     */           
/*     */           return;
/*     */         } 
/*     */       } 
/* 455 */       if (key.startsWith("*.")) {
/*     */         
/* 457 */         String tail = key.substring(1);
/*     */ 
/*     */ 
/*     */         
/* 461 */         if (defaultsKeysCache.size() != defaults.size()) {
/* 462 */           defaultsKeysCache.clear();
/* 463 */           Enumeration<Object> e = defaults.keys();
/* 464 */           while (e.hasMoreElements()) {
/* 465 */             defaultsKeysCache.add(e.nextElement());
/*     */           }
/*     */         } 
/*     */         
/* 469 */         for (Object k : defaultsKeysCache) {
/* 470 */           if (k.equals("Desktop.background") || k
/* 471 */             .equals("DesktopIcon.background") || k
/* 472 */             .equals("TabbedPane.focusColor")) {
/*     */             continue;
/*     */           }
/* 475 */           if (k instanceof String) {
/*     */ 
/*     */ 
/*     */             
/* 479 */             String km = uiKeyInverseMapping.getOrDefault(k, (String)k);
/* 480 */             if (km.endsWith(tail) && !((String)k).startsWith("CheckBox.icon."))
/* 481 */               defaults.put(k, uiValue); 
/*     */           } 
/*     */         } 
/*     */       } else {
/* 485 */         defaults.put(key, uiValue);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private String fixColorIfValid(String newColorStr, String colorStr) {
/*     */     try {
/* 492 */       UIDefaultsLoader.parseColorRGBA(newColorStr);
/*     */       
/* 494 */       return newColorStr;
/* 495 */     } catch (IllegalArgumentException ex) {
/* 496 */       return colorStr;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void applyColorPalette(UIDefaults defaults) {
/* 501 */     if (this.icons == null) {
/*     */       return;
/*     */     }
/* 504 */     Object palette = this.icons.get("ColorPalette");
/* 505 */     if (!(palette instanceof Map)) {
/*     */       return;
/*     */     }
/*     */     
/* 509 */     Map<String, Object> colorPalette = (Map<String, Object>)palette;
/* 510 */     for (Map.Entry<String, Object> e : colorPalette.entrySet()) {
/* 511 */       String key = e.getKey();
/* 512 */       Object value = e.getValue();
/* 513 */       if (key.startsWith("Checkbox.") || !(value instanceof String)) {
/*     */         continue;
/*     */       }
/* 516 */       if (this.dark) {
/* 517 */         key = StringUtils.removeTrailing(key, ".Dark");
/*     */       }
/* 519 */       ColorUIResource color = toColor((String)value);
/* 520 */       if (color != null) {
/* 521 */         defaults.put(key, color);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private ColorUIResource toColor(String value) {
/* 527 */     ColorUIResource color = this.namedColors.get(value);
/*     */ 
/*     */     
/* 530 */     return (color != null) ? color : parseColor(value);
/*     */   }
/*     */   
/*     */   private ColorUIResource parseColor(String value) {
/*     */     try {
/* 535 */       return UIDefaultsLoader.parseColor(value);
/* 536 */     } catch (IllegalArgumentException ex) {
/* 537 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void applyCheckBoxColors(UIDefaults defaults) {
/* 547 */     if (this.icons == null) {
/*     */       return;
/*     */     }
/* 550 */     Object palette = this.icons.get("ColorPalette");
/* 551 */     if (!(palette instanceof Map)) {
/*     */       return;
/*     */     }
/* 554 */     boolean checkboxModified = false;
/*     */     
/* 556 */     Map<String, Object> colorPalette = (Map<String, Object>)palette;
/* 557 */     for (Map.Entry<String, Object> e : colorPalette.entrySet()) {
/* 558 */       String key = e.getKey();
/* 559 */       Object value = e.getValue();
/* 560 */       if (!key.startsWith("Checkbox.") || !(value instanceof String)) {
/*     */         continue;
/*     */       }
/* 563 */       if (this.dark) {
/* 564 */         key = StringUtils.removeTrailing(key, ".Dark");
/*     */       }
/* 566 */       String newKey = checkboxKeyMapping.get(key);
/* 567 */       if (newKey != null) {
/* 568 */         String checkBoxIconPrefix = "CheckBox.icon.";
/* 569 */         if (!this.dark && newKey.startsWith(checkBoxIconPrefix)) {
/* 570 */           newKey = "CheckBox.icon[filled].".concat(newKey.substring(checkBoxIconPrefix.length()));
/*     */         }
/* 572 */         ColorUIResource color = toColor((String)value);
/* 573 */         if (color != null) {
/* 574 */           defaults.put(newKey, color);
/*     */           
/* 576 */           String key2 = checkboxDuplicateColors.get(key + ".Dark");
/* 577 */           if (key2 != null) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 590 */             if (this.dark) {
/* 591 */               key2 = StringUtils.removeTrailing(key2, ".Dark");
/*     */             }
/* 593 */             String newKey2 = checkboxKeyMapping.get(key2);
/* 594 */             if (newKey2 != null) {
/* 595 */               defaults.put(newKey2, color);
/*     */             }
/*     */           } 
/*     */         } 
/* 599 */         checkboxModified = true;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 604 */     if (checkboxModified) {
/*     */       
/* 606 */       defaults.remove("CheckBox.icon.focusWidth");
/* 607 */       defaults.put("CheckBox.icon.hoverBorderColor", defaults.get("CheckBox.icon.focusedBorderColor"));
/*     */ 
/*     */       
/* 610 */       defaults.remove("CheckBox.icon[filled].focusWidth");
/* 611 */       defaults.put("CheckBox.icon[filled].hoverBorderColor", defaults.get("CheckBox.icon[filled].focusedBorderColor"));
/* 612 */       defaults.put("CheckBox.icon[filled].focusedSelectedBackground", defaults.get("CheckBox.icon[filled].selectedBackground"));
/*     */       
/* 614 */       if (this.dark) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 619 */         String[] focusedBorderColorKeys = { "CheckBox.icon.focusedBorderColor", "CheckBox.icon.focusedSelectedBorderColor", "CheckBox.icon[filled].focusedBorderColor", "CheckBox.icon[filled].focusedSelectedBorderColor" };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 625 */         for (String key : focusedBorderColorKeys) {
/* 626 */           Color color = defaults.getColor(key);
/* 627 */           if (color != null) {
/* 628 */             defaults.put(key, new ColorUIResource(new Color(color
/* 629 */                     .getRGB() & 0xFFFFFF | 0xA6000000, true)));
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void copyIfNotSet(UIDefaults defaults, String destKey, String srcKey, Set<String> uiKeys) {
/* 637 */     if (!uiKeys.contains(destKey)) {
/* 638 */       defaults.put(destKey, defaults.get(srcKey));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 644 */   private static final Map<String, String> uiKeyMapping = new HashMap<>();
/*     */   
/* 646 */   private static final Map<String, String> uiKeyCopying = new LinkedHashMap<>();
/* 647 */   private static final Map<String, String> uiKeyInverseMapping = new HashMap<>();
/* 648 */   private static final Map<String, String> checkboxKeyMapping = new HashMap<>();
/* 649 */   private static final Map<String, String> checkboxDuplicateColors = new HashMap<>();
/*     */ 
/*     */   
/*     */   static {
/* 653 */     uiKeyExcludes = new HashSet<>(Arrays.asList(new String[] { "ActionButton.", "ActionToolbar.", "ActionsList.", "AppInspector.", "AssignedMnemonic.", "Autocomplete.", "AvailableMnemonic.", "BigSpinner.", "Bookmark.", "BookmarkIcon.", "BookmarkMnemonicAssigned.", "BookmarkMnemonicAvailable.", "BookmarkMnemonicCurrent.", "BookmarkMnemonicIcon.", "Borders.", "Breakpoint.", "Canvas.", "CodeWithMe.", "ComboBoxButton.", "CompletionPopup.", "ComplexPopup.", "Content.", "CurrentMnemonic.", "Counter.", "Debugger.", "DebuggerPopup.", "DebuggerTabs.", "DefaultTabs.", "Dialog.", "DialogWrapper.", "DragAndDrop.", "Editor.", "EditorGroupsTabs.", "EditorTabs.", "FileColor.", "FlameGraph.", "Focus.", "Git.", "Github.", "GotItTooltip.", "Group.", "Gutter.", "GutterTooltip.", "HeaderColor.", "HelpTooltip.", "Hg.", "IconBadge.", "InformationHint.", "InplaceRefactoringPopup.", "Lesson.", "Link.", "LiveIndicator.", "MainMenu.", "MainToolbar.", "MemoryIndicator.", "MlModelBinding.", "MnemonicIcon.", "NavBar.", "NewClass.", "NewPSD.", "Notification.", "Notifications.", "NotificationsToolwindow.", "OnePixelDivider.", "OptionButton.", "Outline.", "ParameterInfo.", "Plugins.", "ProgressIcon.", "PsiViewer.", "ReviewList.", "RunWidget.", "ScreenView.", "SearchEverywhere.", "SearchFieldWithExtension.", "SearchMatch.", "SearchOption.", "SearchResults.", "SegmentedButton.", "Settings.", "SidePanel.", "Space.", "SpeedSearch.", "StateWidget.", "StatusBar.", "Tag.", "TipOfTheDay.", "ToolbarComboWidget.", "ToolWindow.", "UIDesigner.", "UnattendedHostStatus.", "ValidationTooltip.", "VersionControl.", "WelcomeScreen.", "darcula.", "dropArea.", "icons.", "intellijlaf.", "macOSWindow.", "material.", "tooltips.", "Checkbox.", "Toolbar.", "Tooltip.", "UiDesigner.", "link." }));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 687 */     uiKeyDoNotOverride = new HashSet<>(Arrays.asList(new String[] { "TabbedPane.selectedForeground" }));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 692 */     uiKeyMapping.put("ComboBox.background", "");
/* 693 */     uiKeyMapping.put("ComboBox.buttonBackground", "");
/* 694 */     uiKeyMapping.put("ComboBox.nonEditableBackground", "ComboBox.background");
/* 695 */     uiKeyMapping.put("ComboBox.ArrowButton.background", "ComboBox.buttonEditableBackground");
/* 696 */     uiKeyMapping.put("ComboBox.ArrowButton.disabledIconColor", "ComboBox.buttonDisabledArrowColor");
/* 697 */     uiKeyMapping.put("ComboBox.ArrowButton.iconColor", "ComboBox.buttonArrowColor");
/* 698 */     uiKeyMapping.put("ComboBox.ArrowButton.nonEditableBackground", "ComboBox.buttonBackground");
/* 699 */     uiKeyCopying.put("ComboBox.buttonSeparatorColor", "Component.borderColor");
/* 700 */     uiKeyCopying.put("ComboBox.buttonDisabledSeparatorColor", "Component.disabledBorderColor");
/*     */ 
/*     */     
/* 703 */     uiKeyMapping.put("Component.inactiveErrorFocusColor", "Component.error.borderColor");
/* 704 */     uiKeyMapping.put("Component.errorFocusColor", "Component.error.focusedBorderColor");
/* 705 */     uiKeyMapping.put("Component.inactiveWarningFocusColor", "Component.warning.borderColor");
/* 706 */     uiKeyMapping.put("Component.warningFocusColor", "Component.warning.focusedBorderColor");
/*     */ 
/*     */     
/* 709 */     uiKeyMapping.put("Link.activeForeground", "Component.linkColor");
/*     */ 
/*     */     
/* 712 */     uiKeyMapping.put("Menu.border", "Menu.margin");
/* 713 */     uiKeyMapping.put("MenuItem.border", "MenuItem.margin");
/* 714 */     uiKeyCopying.put("CheckBoxMenuItem.margin", "MenuItem.margin");
/* 715 */     uiKeyCopying.put("RadioButtonMenuItem.margin", "MenuItem.margin");
/* 716 */     uiKeyMapping.put("PopupMenu.border", "PopupMenu.borderInsets");
/* 717 */     uiKeyCopying.put("MenuItem.underlineSelectionColor", "TabbedPane.underlineColor");
/*     */ 
/*     */     
/* 720 */     uiKeyCopying.put("Menu.selectionBackground", "List.selectionBackground");
/* 721 */     uiKeyCopying.put("MenuItem.selectionBackground", "List.selectionBackground");
/* 722 */     uiKeyCopying.put("CheckBoxMenuItem.selectionBackground", "List.selectionBackground");
/* 723 */     uiKeyCopying.put("RadioButtonMenuItem.selectionBackground", "List.selectionBackground");
/*     */ 
/*     */     
/* 726 */     uiKeyMapping.put("ProgressBar.background", "");
/* 727 */     uiKeyMapping.put("ProgressBar.foreground", "");
/* 728 */     uiKeyMapping.put("ProgressBar.trackColor", "ProgressBar.background");
/* 729 */     uiKeyMapping.put("ProgressBar.progressColor", "ProgressBar.foreground");
/* 730 */     uiKeyCopying.put("ProgressBar.selectionForeground", "ProgressBar.background");
/* 731 */     uiKeyCopying.put("ProgressBar.selectionBackground", "ProgressBar.foreground");
/*     */ 
/*     */     
/* 734 */     uiKeyMapping.put("ScrollBar.trackColor", "ScrollBar.track");
/* 735 */     uiKeyMapping.put("ScrollBar.thumbColor", "ScrollBar.thumb");
/*     */ 
/*     */     
/* 738 */     uiKeyMapping.put("Separator.separatorColor", "Separator.foreground");
/*     */ 
/*     */     
/* 741 */     uiKeyMapping.put("Slider.trackWidth", "");
/* 742 */     uiKeyCopying.put("Slider.trackValueColor", "ProgressBar.foreground");
/* 743 */     uiKeyCopying.put("Slider.thumbColor", "ProgressBar.foreground");
/* 744 */     uiKeyCopying.put("Slider.trackColor", "ProgressBar.background");
/*     */ 
/*     */     
/* 747 */     uiKeyCopying.put("Spinner.buttonSeparatorColor", "Component.borderColor");
/* 748 */     uiKeyCopying.put("Spinner.buttonDisabledSeparatorColor", "Component.disabledBorderColor");
/*     */ 
/*     */     
/* 751 */     uiKeyMapping.put("DefaultTabs.underlinedTabBackground", "TabbedPane.selectedBackground");
/* 752 */     uiKeyMapping.put("DefaultTabs.underlinedTabForeground", "TabbedPane.selectedForeground");
/* 753 */     uiKeyMapping.put("DefaultTabs.inactiveUnderlineColor", "TabbedPane.inactiveUnderlineColor");
/*     */ 
/*     */     
/* 756 */     uiKeyCopying.put("TitlePane.inactiveBackground", "TitlePane.background");
/* 757 */     uiKeyMapping.put("TitlePane.infoForeground", "TitlePane.foreground");
/* 758 */     uiKeyMapping.put("TitlePane.inactiveInfoForeground", "TitlePane.inactiveForeground");
/*     */     
/* 760 */     for (Map.Entry<String, String> e : uiKeyMapping.entrySet()) {
/* 761 */       uiKeyInverseMapping.put(e.getValue(), e.getKey());
/*     */     }
/* 763 */     uiKeyCopying.put("ToggleButton.tab.underlineColor", "TabbedPane.underlineColor");
/* 764 */     uiKeyCopying.put("ToggleButton.tab.disabledUnderlineColor", "TabbedPane.disabledUnderlineColor");
/* 765 */     uiKeyCopying.put("ToggleButton.tab.selectedBackground", "TabbedPane.selectedBackground");
/* 766 */     uiKeyCopying.put("ToggleButton.tab.hoverBackground", "TabbedPane.hoverColor");
/* 767 */     uiKeyCopying.put("ToggleButton.tab.focusBackground", "TabbedPane.focusColor");
/*     */     
/* 769 */     checkboxKeyMapping.put("Checkbox.Background.Default", "CheckBox.icon.background");
/* 770 */     checkboxKeyMapping.put("Checkbox.Background.Disabled", "CheckBox.icon.disabledBackground");
/* 771 */     checkboxKeyMapping.put("Checkbox.Border.Default", "CheckBox.icon.borderColor");
/* 772 */     checkboxKeyMapping.put("Checkbox.Border.Disabled", "CheckBox.icon.disabledBorderColor");
/* 773 */     checkboxKeyMapping.put("Checkbox.Focus.Thin.Default", "CheckBox.icon.focusedBorderColor");
/* 774 */     checkboxKeyMapping.put("Checkbox.Focus.Wide", "CheckBox.icon.focusColor");
/* 775 */     checkboxKeyMapping.put("Checkbox.Foreground.Disabled", "CheckBox.icon.disabledCheckmarkColor");
/* 776 */     checkboxKeyMapping.put("Checkbox.Background.Selected", "CheckBox.icon.selectedBackground");
/* 777 */     checkboxKeyMapping.put("Checkbox.Border.Selected", "CheckBox.icon.selectedBorderColor");
/* 778 */     checkboxKeyMapping.put("Checkbox.Foreground.Selected", "CheckBox.icon.checkmarkColor");
/* 779 */     checkboxKeyMapping.put("Checkbox.Focus.Thin.Selected", "CheckBox.icon.focusedSelectedBorderColor");
/*     */     
/* 781 */     checkboxDuplicateColors.put("Checkbox.Background.Default.Dark", "Checkbox.Background.Selected.Dark");
/* 782 */     checkboxDuplicateColors.put("Checkbox.Border.Default.Dark", "Checkbox.Border.Selected.Dark");
/* 783 */     checkboxDuplicateColors.put("Checkbox.Focus.Thin.Default.Dark", "Checkbox.Focus.Thin.Selected.Dark");
/*     */     
/* 785 */     Map.Entry[] arrayOfEntry = (Map.Entry[])checkboxDuplicateColors.entrySet().toArray((Object[])new Map.Entry[checkboxDuplicateColors.size()]);
/* 786 */     for (Map.Entry<String, String> e : arrayOfEntry) {
/* 787 */       checkboxDuplicateColors.put(e.getValue(), e.getKey());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class ThemeLaf
/*     */     extends FlatLaf
/*     */   {
/*     */     private final IntelliJTheme theme;
/*     */     
/*     */     public ThemeLaf(IntelliJTheme theme) {
/* 798 */       this.theme = theme;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 803 */       return this.theme.name;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getDescription() {
/* 808 */       return getName();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isDark() {
/* 813 */       return this.theme.dark;
/*     */     }
/*     */     
/*     */     public IntelliJTheme getTheme() {
/* 817 */       return this.theme;
/*     */     }
/*     */ 
/*     */     
/*     */     void applyAdditionalDefaults(UIDefaults defaults) {
/* 822 */       this.theme.applyProperties(defaults);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ArrayList<Class<?>> getLafClassesForDefaultsLoading() {
/* 827 */       ArrayList<Class<?>> lafClasses = new ArrayList<>();
/* 828 */       lafClasses.add(FlatLaf.class);
/* 829 */       lafClasses.add(this.theme.dark ? FlatDarkLaf.class : FlatLightLaf.class);
/* 830 */       lafClasses.add(this.theme.dark ? FlatDarculaLaf.class : FlatIntelliJLaf.class);
/* 831 */       lafClasses.add(ThemeLaf.class);
/* 832 */       return lafClasses;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\IntelliJTheme.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */