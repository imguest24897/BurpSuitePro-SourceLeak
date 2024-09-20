/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.FlatLaf;
/*     */ import com.formdev.flatlaf.util.StringUtils;
/*     */ import com.formdev.flatlaf.util.SystemInfo;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.lang.annotation.ElementType;
/*     */ import java.lang.annotation.Repeatable;
/*     */ import java.lang.annotation.Retention;
/*     */ import java.lang.annotation.RetentionPolicy;
/*     */ import java.lang.annotation.Target;
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.atomic.AtomicBoolean;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.Predicate;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.border.Border;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlatStylingSupport
/*     */ {
/*     */   public static Object getStyle(JComponent c) {
/* 124 */     return c.getClientProperty("FlatLaf.style");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object getStyleClass(JComponent c) {
/* 131 */     return c.getClientProperty("FlatLaf.styleClass");
/*     */   }
/*     */   
/*     */   static boolean hasStyleProperty(JComponent c) {
/* 135 */     return (getStyle(c) != null || getStyleClass(c) != null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object getResolvedStyle(JComponent c, String type) throws IllegalArgumentException {
/* 141 */     Object style = getStyle(c);
/* 142 */     Object styleClass = getStyleClass(c);
/* 143 */     Object styleForClasses = getStyleForClasses(styleClass, type);
/* 144 */     return joinStyles(styleForClasses, style);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object getStyleForClasses(Object styleClass, String type) throws IllegalArgumentException {
/* 183 */     if (styleClass == null) {
/* 184 */       return null;
/*     */     }
/* 186 */     if (styleClass instanceof String && ((String)styleClass).indexOf(' ') >= 0) {
/* 187 */       styleClass = StringUtils.split((String)styleClass, ' ', true, true);
/*     */     }
/* 189 */     if (styleClass instanceof String)
/* 190 */       return getStyleForClass(((String)styleClass).trim(), type); 
/* 191 */     if (styleClass instanceof String[]) {
/* 192 */       Object style = null;
/* 193 */       for (String cls : (String[])styleClass)
/* 194 */         style = joinStyles(style, getStyleForClass(cls, type)); 
/* 195 */       return style;
/* 196 */     }  if (styleClass instanceof java.util.List) {
/* 197 */       Object style = null;
/* 198 */       for (Object cls : styleClass)
/* 199 */         style = joinStyles(style, getStyleForClass((String)cls, type)); 
/* 200 */       return style;
/*     */     } 
/* 202 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static Object getStyleForClass(String styleClass, String type) throws IllegalArgumentException {
/* 208 */     return joinStyles(
/* 209 */         UIManager.get("[style]." + styleClass), 
/* 210 */         UIManager.get("[style]" + type + '.' + styleClass));
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
/*     */   public static Object joinStyles(Object style1, Object style2) throws IllegalArgumentException {
/* 230 */     if (style1 == null)
/* 231 */       return style2; 
/* 232 */     if (style2 == null) {
/* 233 */       return style1;
/*     */     }
/*     */     
/* 236 */     if (style1 instanceof String && style2 instanceof String) {
/* 237 */       return style1 + "; " + style2;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 242 */     Map<String, Object> map1 = (style1 instanceof String) ? parse((String)style1) : (Map<String, Object>)style1;
/* 243 */     if (map1 == null) {
/* 244 */       return style2;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 249 */     Map<String, Object> map2 = (style2 instanceof String) ? parse((String)style2) : (Map<String, Object>)style2;
/* 250 */     if (map2 == null) {
/* 251 */       return style1;
/*     */     }
/*     */     
/* 254 */     Map<String, Object> map = new HashMap<>(map1);
/* 255 */     map.putAll(map2);
/* 256 */     return map;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String concatStyles(String style1, String style2) {
/* 267 */     if (style1 == null)
/* 268 */       return style2; 
/* 269 */     if (style2 == null)
/* 270 */       return style1; 
/* 271 */     return style1 + "; " + style2;
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
/*     */   public static Map<String, Object> parseAndApply(Map<String, Object> oldStyleValues, Object style, BiFunction<String, Object, Object> applyProperty) throws UnknownStyleException, IllegalArgumentException {
/* 295 */     if (oldStyleValues != null) {
/* 296 */       for (Map.Entry<String, Object> e : oldStyleValues.entrySet()) {
/* 297 */         applyProperty.apply(e.getKey(), e.getValue());
/*     */       }
/*     */     }
/*     */     
/* 301 */     if (style == null) {
/* 302 */       return null;
/*     */     }
/* 304 */     if (style instanceof String) {
/*     */       
/* 306 */       String str = (String)style;
/* 307 */       if (StringUtils.isTrimmedEmpty(str)) {
/* 308 */         return null;
/*     */       }
/* 310 */       return applyStyle(parse(str), applyProperty);
/* 311 */     }  if (style instanceof Map) {
/*     */ 
/*     */       
/* 314 */       Map<String, Object> map = (Map<String, Object>)style;
/* 315 */       return applyStyle(map, applyProperty);
/*     */     } 
/* 317 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static Map<String, Object> applyStyle(Map<String, Object> style, BiFunction<String, Object, Object> applyProperty) {
/* 323 */     if (style.isEmpty()) {
/* 324 */       return null;
/*     */     }
/* 326 */     Map<String, Object> oldValues = new HashMap<>();
/* 327 */     for (Map.Entry<String, Object> e : style.entrySet()) {
/* 328 */       String key = e.getKey();
/* 329 */       Object newValue = e.getValue();
/*     */ 
/*     */       
/* 332 */       if (key.startsWith("[")) {
/* 333 */         if ((SystemInfo.isWindows && key.startsWith("[win]")) || (SystemInfo.isMacOS && key
/* 334 */           .startsWith("[mac]")) || (SystemInfo.isLinux && key
/* 335 */           .startsWith("[linux]")) || (key
/* 336 */           .startsWith("[light]") && !FlatLaf.isLafDark()) || (key
/* 337 */           .startsWith("[dark]") && FlatLaf.isLafDark())) {
/*     */ 
/*     */           
/* 340 */           key = key.substring(key.indexOf(']') + 1);
/*     */         } else {
/*     */           continue;
/*     */         } 
/*     */       }
/* 345 */       Object oldValue = applyProperty.apply(key, newValue);
/* 346 */       oldValues.put(key, oldValue);
/*     */     } 
/* 348 */     return oldValues;
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
/*     */   public static Map<String, Object> parse(String style) throws IllegalArgumentException {
/* 362 */     if (style == null || StringUtils.isTrimmedEmpty(style)) {
/* 363 */       return null;
/*     */     }
/* 365 */     Map<String, Object> map = null;
/*     */ 
/*     */     
/* 368 */     for (String part : StringUtils.split(style, ';', true, true)) {
/*     */       
/* 370 */       int sepIndex = part.indexOf(':');
/* 371 */       if (sepIndex < 0) {
/* 372 */         throw new IllegalArgumentException("missing colon in '" + part + "'");
/*     */       }
/*     */       
/* 375 */       String key = StringUtils.substringTrimmed(part, 0, sepIndex);
/* 376 */       String value = StringUtils.substringTrimmed(part, sepIndex + 1);
/* 377 */       if (key.isEmpty())
/* 378 */         throw new IllegalArgumentException("missing key in '" + part + "'"); 
/* 379 */       if (value.isEmpty()) {
/* 380 */         throw new IllegalArgumentException("missing value in '" + part + "'");
/*     */       }
/*     */       
/* 383 */       if (map == null)
/* 384 */         map = new LinkedHashMap<>(); 
/* 385 */       map.put(key, parseValue(key, value));
/*     */     } 
/*     */     
/* 388 */     return map;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Object parseValue(String key, String value) throws IllegalArgumentException {
/* 395 */     if (value.startsWith("$")) {
/* 396 */       return UIManager.get(value.substring(1));
/*     */     }
/*     */ 
/*     */     
/* 400 */     if (key.startsWith("[")) {
/* 401 */       key = key.substring(key.indexOf(']') + 1);
/*     */     }
/*     */     
/* 404 */     return FlatLaf.parseDefaultsValue(key, value, null);
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
/*     */   public static Object applyToAnnotatedObject(Object obj, String key, Object value) throws UnknownStyleException, IllegalArgumentException {
/* 421 */     String fieldName = keyToFieldName(key);
/*     */     
/* 423 */     return applyToField(obj, fieldName, key, value, field -> {
/*     */           Styleable styleable = field.<Styleable>getAnnotation(Styleable.class);
/* 425 */           return (styleable != null && styleable.dot() == ((fieldName != key)));
/*     */         });
/*     */   }
/*     */   
/*     */   private static String keyToFieldName(String key) {
/* 430 */     int dotIndex = key.indexOf('.');
/* 431 */     if (dotIndex < 0) {
/* 432 */       return key;
/*     */     }
/*     */     
/* 435 */     return key.substring(0, dotIndex) + 
/* 436 */       Character.toUpperCase(key.charAt(dotIndex + 1)) + key
/* 437 */       .substring(dotIndex + 2);
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
/*     */   static Object applyToField(Object obj, String fieldName, String key, Object value) throws UnknownStyleException, IllegalArgumentException {
/* 454 */     return applyToField(obj, fieldName, key, value, null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static Object applyToField(Object obj, String fieldName, String key, Object value, Predicate<Field> predicate) throws UnknownStyleException, IllegalArgumentException {
/* 460 */     Class<?> cls = obj.getClass();
/*     */     
/*     */     while (true)
/*     */     { try {
/* 464 */         Field f = cls.getDeclaredField(fieldName);
/* 465 */         if (predicate == null || predicate.test(f))
/* 466 */           return applyToField(f, obj, value, false); 
/* 467 */       } catch (NoSuchFieldException noSuchFieldException) {}
/*     */ 
/*     */ 
/*     */       
/* 471 */       for (StyleableField styleableField : (StyleableField[])cls.<StyleableField>getAnnotationsByType(StyleableField.class)) {
/* 472 */         if (key.equals(styleableField.key())) {
/* 473 */           return applyToField(getStyleableField(styleableField), obj, value, true);
/*     */         }
/*     */       } 
/* 476 */       cls = cls.getSuperclass();
/* 477 */       if (cls == null) {
/* 478 */         throw new UnknownStyleException(key);
/*     */       }
/* 480 */       if (predicate != null)
/* 481 */       { String superclassName = cls.getName();
/* 482 */         if (superclassName.startsWith("java.") || superclassName.startsWith("javax."))
/* 483 */           break;  }  }  throw new UnknownStyleException(key);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Object applyToField(Field f, Object obj, Object value, boolean useMethodHandles) throws IllegalArgumentException {
/* 491 */     checkValidField(f);
/*     */     
/* 493 */     if (useMethodHandles && obj instanceof StyleableLookupProvider) {
/*     */       
/*     */       try {
/* 496 */         MethodHandles.Lookup lookup = ((StyleableLookupProvider)obj).getLookupForStyling();
/*     */ 
/*     */         
/* 499 */         Object oldValue = lookup.unreflectGetter(f).invoke(obj);
/* 500 */         lookup.unreflectSetter(f).invoke(obj, convertToEnum(value, f.getType()));
/* 501 */         return oldValue;
/* 502 */       } catch (Throwable ex) {
/* 503 */         throw newFieldAccessFailed(f, ex);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     try {
/* 509 */       f.setAccessible(true);
/*     */ 
/*     */       
/* 512 */       Object oldValue = f.get(obj);
/* 513 */       f.set(obj, convertToEnum(value, f.getType()));
/* 514 */       return oldValue;
/* 515 */     } catch (IllegalAccessException ex) {
/* 516 */       throw newFieldAccessFailed(f, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static Object getFieldValue(Field f, Object obj, boolean useMethodHandles) throws IllegalArgumentException {
/* 523 */     checkValidField(f);
/*     */     
/* 525 */     if (useMethodHandles && obj instanceof StyleableLookupProvider) {
/*     */       
/*     */       try {
/* 528 */         MethodHandles.Lookup lookup = ((StyleableLookupProvider)obj).getLookupForStyling();
/* 529 */         return lookup.unreflectGetter(f).invoke(obj);
/* 530 */       } catch (Throwable ex) {
/* 531 */         throw newFieldAccessFailed(f, ex);
/*     */       } 
/*     */     }
/*     */     
/*     */     try {
/* 536 */       f.setAccessible(true);
/* 537 */       return f.get(obj);
/* 538 */     } catch (IllegalAccessException ex) {
/* 539 */       throw newFieldAccessFailed(f, ex);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static IllegalArgumentException newFieldAccessFailed(Field f, Throwable ex) {
/* 544 */     return new IllegalArgumentException("failed to access field '" + f.getDeclaringClass().getName() + "." + f.getName() + "'", ex);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void checkValidField(Field f) throws IllegalArgumentException {
/* 550 */     if (!isValidField(f))
/* 551 */       throw new IllegalArgumentException("field '" + f.getDeclaringClass().getName() + "." + f.getName() + "' is final or static"); 
/*     */   }
/*     */   
/*     */   private static boolean isValidField(Field f) {
/* 555 */     int modifiers = f.getModifiers();
/* 556 */     return ((modifiers & 0x18) == 0 && !f.isSynthetic());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static Field getStyleableField(StyleableField styleableField) throws IllegalArgumentException {
/* 562 */     String fieldName = styleableField.fieldName();
/* 563 */     if (fieldName.isEmpty()) {
/* 564 */       fieldName = styleableField.key();
/*     */     }
/*     */     try {
/* 567 */       return styleableField.cls().getDeclaredField(fieldName);
/* 568 */     } catch (NoSuchFieldException ex) {
/* 569 */       throw new IllegalArgumentException("field '" + styleableField.cls().getName() + "." + fieldName + "' not found", ex);
/*     */     } 
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
/*     */   private static Object applyToProperty(Object obj, String name, Object value) throws UnknownStyleException, IllegalArgumentException {
/* 589 */     Class<?> cls = obj.getClass();
/* 590 */     String getterName = buildMethodName("get", name);
/* 591 */     String setterName = buildMethodName("set", name);
/*     */     
/*     */     try {
/*     */       Method getter;
/*     */       try {
/* 596 */         getter = cls.getMethod(getterName, new Class[0]);
/* 597 */       } catch (NoSuchMethodException ex) {
/* 598 */         getter = cls.getMethod(buildMethodName("is", name), new Class[0]);
/*     */       } 
/* 600 */       Method setter = cls.getMethod(setterName, new Class[] { getter.getReturnType() });
/* 601 */       Object oldValue = getter.invoke(obj, new Object[0]);
/* 602 */       setter.invoke(obj, new Object[] { convertToEnum(value, getter.getReturnType()) });
/* 603 */       return oldValue;
/* 604 */     } catch (NoSuchMethodException ex) {
/* 605 */       throw new UnknownStyleException(name);
/* 606 */     } catch (Exception ex) {
/* 607 */       throw new IllegalArgumentException("failed to invoke property methods '" + cls.getName() + "." + getterName + "()' or '" + setterName + "(...)'", ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static String buildMethodName(String prefix, String name) {
/* 613 */     int prefixLength = prefix.length();
/* 614 */     int nameLength = name.length();
/* 615 */     char[] chars = new char[prefixLength + nameLength];
/* 616 */     prefix.getChars(0, prefixLength, chars, 0);
/* 617 */     name.getChars(0, nameLength, chars, prefixLength);
/* 618 */     chars[prefixLength] = Character.toUpperCase(chars[prefixLength]);
/* 619 */     return new String(chars);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Object convertToEnum(Object value, Class<?> type) throws IllegalArgumentException {
/* 627 */     if (Enum.class.isAssignableFrom(type) && value instanceof String) {
/*     */       try {
/* 629 */         value = Enum.valueOf(type, (String)value);
/* 630 */       } catch (IllegalArgumentException ex) {
/* 631 */         throw new IllegalArgumentException("unknown enum value '" + value + "' in enum '" + type.getName() + "'", ex);
/*     */       } 
/*     */     }
/* 634 */     return value;
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
/*     */   public static Object applyToAnnotatedObjectOrComponent(Object obj, Object comp, String key, Object value) throws UnknownStyleException, IllegalArgumentException {
/*     */     try {
/* 655 */       return applyToAnnotatedObject(obj, key, value);
/* 656 */     } catch (UnknownStyleException ex) {
/*     */       try {
/* 658 */         if (comp != null)
/* 659 */           return applyToProperty(comp, key, value); 
/* 660 */       } catch (UnknownStyleException unknownStyleException) {}
/*     */ 
/*     */       
/* 663 */       throw ex;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static Object applyToAnnotatedObjectOrBorder(Object obj, String key, Object value, JComponent c, AtomicBoolean borderShared) throws IllegalArgumentException {
/*     */     try {
/* 672 */       return applyToAnnotatedObject(obj, key, value);
/* 673 */     } catch (UnknownStyleException ex) {
/*     */       
/* 675 */       Border border = c.getBorder();
/* 676 */       if (border instanceof StyleableBorder) {
/* 677 */         if (borderShared.get()) {
/* 678 */           border = cloneBorder(border);
/* 679 */           c.setBorder(border);
/* 680 */           borderShared.set(false);
/*     */         } 
/*     */         
/*     */         try {
/* 684 */           return ((StyleableBorder)border).applyStyleProperty(key, value);
/* 685 */         } catch (UnknownStyleException unknownStyleException) {}
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 692 */         return applyToProperty(c, key, value);
/* 693 */       } catch (UnknownStyleException unknownStyleException) {
/*     */ 
/*     */         
/* 696 */         throw ex;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   static PropertyChangeListener createPropertyChangeListener(JComponent c, Runnable installStyle, PropertyChangeListener superListener) {
/* 703 */     return e -> {
/*     */         if (superListener != null) {
/*     */           superListener.propertyChange(e);
/*     */         }
/*     */         switch (e.getPropertyName()) {
/*     */           case "FlatLaf.style":
/*     */           case "FlatLaf.styleClass":
/*     */             installStyle.run();
/*     */             c.revalidate();
/*     */             c.repaint();
/*     */             break;
/*     */         } 
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static Border cloneBorder(Border border) throws IllegalArgumentException {
/* 721 */     Class<? extends Border> borderClass = (Class)border.getClass();
/*     */     try {
/* 723 */       return borderClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
/* 724 */     } catch (Exception ex) {
/* 725 */       throw new IllegalArgumentException("failed to clone border '" + borderClass.getName() + "'", ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static Icon cloneIcon(Icon icon) throws IllegalArgumentException {
/* 732 */     Class<? extends Icon> iconClass = (Class)icon.getClass();
/*     */     try {
/* 734 */       return iconClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
/* 735 */     } catch (Exception ex) {
/* 736 */       throw new IllegalArgumentException("failed to clone icon '" + iconClass.getName() + "'", ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Map<String, Class<?>> getAnnotatedStyleableInfos(Object obj) throws IllegalArgumentException {
/* 747 */     return getAnnotatedStyleableInfos(obj, null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Map<String, Class<?>> getAnnotatedStyleableInfos(Object obj, Border border) throws IllegalArgumentException {
/* 753 */     Map<String, Class<?>> infos = new StyleableInfosMap<>();
/* 754 */     collectAnnotatedStyleableInfos(obj, infos);
/* 755 */     collectStyleableInfos(border, infos);
/* 756 */     return infos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void collectAnnotatedStyleableInfos(Object obj, Map<String, Class<?>> infos) throws IllegalArgumentException {
/*     */     String superclassName;
/* 766 */     HashSet<String> processedFields = new HashSet<>();
/* 767 */     Class<?> cls = obj.getClass();
/*     */ 
/*     */     
/*     */     do {
/* 771 */       for (Field f : cls.getDeclaredFields()) {
/* 772 */         if (isValidField(f)) {
/*     */ 
/*     */           
/* 775 */           Styleable styleable = f.<Styleable>getAnnotation(Styleable.class);
/* 776 */           if (styleable != null) {
/*     */ 
/*     */             
/* 779 */             String name = f.getName();
/* 780 */             Class<?> type = f.getType();
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 785 */             if (!processedFields.contains(name)) {
/*     */               
/* 787 */               processedFields.add(name);
/*     */ 
/*     */               
/* 790 */               if (styleable.dot()) {
/* 791 */                 int len = name.length();
/* 792 */                 for (int i = 0; i < len; i++) {
/* 793 */                   if (Character.isUpperCase(name.charAt(i))) {
/*     */ 
/*     */                     
/* 796 */                     name = name.substring(0, i) + '.' + Character.toLowerCase(name.charAt(i)) + name.substring(i + 1);
/*     */                     
/*     */                     break;
/*     */                   } 
/*     */                 } 
/*     */               } 
/*     */               
/* 803 */               if (styleable.type() != Void.class) {
/* 804 */                 type = styleable.type();
/*     */               }
/* 806 */               infos.put(name, type);
/*     */             } 
/*     */           } 
/*     */         } 
/* 810 */       }  for (StyleableField styleableField : (StyleableField[])cls.<StyleableField>getAnnotationsByType(StyleableField.class)) {
/* 811 */         String name = styleableField.key();
/*     */ 
/*     */ 
/*     */         
/* 815 */         if (!processedFields.contains(name)) {
/*     */           
/* 817 */           processedFields.add(name);
/*     */           
/* 819 */           Field f = getStyleableField(styleableField);
/* 820 */           infos.put(name, f.getType());
/*     */         } 
/*     */       } 
/* 823 */       cls = cls.getSuperclass();
/* 824 */       if (cls == null) {
/*     */         return;
/*     */       }
/* 827 */       superclassName = cls.getName();
/* 828 */     } while (!superclassName.startsWith("java.") && !superclassName.startsWith("javax."));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void collectStyleableInfos(Border border, Map<String, Class<?>> infos) {
/* 834 */     if (border instanceof StyleableBorder)
/* 835 */       infos.putAll(((StyleableBorder)border).getStyleableInfos()); 
/*     */   } @Target({ElementType.FIELD})
/*     */   @Retention(RetentionPolicy.RUNTIME)
/*     */   public static @interface Styleable { boolean dot() default false; Class<?> type() default Void.class; } public static void putAllPrefixKey(Map<String, Class<?>> infos, String keyPrefix, Map<String, Class<?>> infos2) {
/* 839 */     for (Map.Entry<String, Class<?>> e : infos2.entrySet())
/* 840 */       infos.put(keyPrefix.concat(e.getKey()), e.getValue()); 
/*     */   } @Target({ElementType.TYPE})
/*     */   @Retention(RetentionPolicy.RUNTIME)
/*     */   @Repeatable(StyleableFields.class)
/*     */   public static @interface StyleableField {
/*     */     Class<?> cls(); String key(); String fieldName() default ""; } public static Object getAnnotatedStyleableValue(Object obj, String key) throws IllegalArgumentException {
/* 846 */     String superclassName, fieldName = keyToFieldName(key);
/* 847 */     Class<?> cls = obj.getClass();
/*     */ 
/*     */     
/*     */     do {
/*     */       try {
/* 852 */         Field f = cls.getDeclaredField(fieldName);
/* 853 */         Styleable styleable = f.<Styleable>getAnnotation(Styleable.class);
/* 854 */         if (styleable != null) {
/* 855 */           if (styleable.dot() != ((fieldName != key)))
/* 856 */             throw new IllegalArgumentException("'Styleable.dot' on field '" + fieldName + "' does not match key '" + key + "'"); 
/* 857 */           if (styleable.type() != Void.class) {
/* 858 */             throw new IllegalArgumentException("'Styleable.type' on field '" + fieldName + "' not supported");
/*     */           }
/* 860 */           return getFieldValue(f, obj, false);
/*     */         } 
/* 862 */       } catch (NoSuchFieldException noSuchFieldException) {}
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 867 */       for (StyleableField styleableField : (StyleableField[])cls.<StyleableField>getAnnotationsByType(StyleableField.class)) {
/* 868 */         if (key.equals(styleableField.key())) {
/* 869 */           return getFieldValue(getStyleableField(styleableField), obj, true);
/*     */         }
/*     */       } 
/* 872 */       cls = cls.getSuperclass();
/* 873 */       if (cls == null) {
/* 874 */         return null;
/*     */       }
/* 876 */       superclassName = cls.getName();
/* 877 */     } while (!superclassName.startsWith("java.") && !superclassName.startsWith("javax."));
/* 878 */     return null;
/*     */   } @Target({ElementType.TYPE})
/*     */   @Retention(RetentionPolicy.RUNTIME)
/*     */   public static @interface StyleableFields {
/*     */     FlatStylingSupport.StyleableField[] value(); } public static Object getAnnotatedStyleableValue(Object obj, Border border, String key) {
/* 883 */     if (border instanceof StyleableBorder) {
/* 884 */       Object value = ((StyleableBorder)border).getStyleableValue(key);
/* 885 */       if (value != null)
/* 886 */         return value; 
/*     */     } 
/* 888 */     return getAnnotatedStyleableValue(obj, key);
/*     */   } public static interface StyleableUI {
/*     */     Map<String, Class<?>> getStyleableInfos(JComponent param1JComponent) throws IllegalArgumentException; Object getStyleableValue(JComponent param1JComponent, String param1String) throws IllegalArgumentException; } public static interface StyleableBorder {
/*     */     Object applyStyleProperty(String param1String, Object param1Object);
/*     */     Map<String, Class<?>> getStyleableInfos() throws IllegalArgumentException;
/*     */     Object getStyleableValue(String param1String) throws IllegalArgumentException; }
/*     */   public static interface StyleableLookupProvider {
/*     */     MethodHandles.Lookup getLookupForStyling(); }
/*     */   public static class UnknownStyleException extends IllegalArgumentException { public UnknownStyleException(String key) {
/* 897 */       super(key);
/*     */     }
/*     */ 
/*     */     
/*     */     public String getMessage() {
/* 902 */       return "unknown style '" + super.getMessage() + "'";
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static class StyleableInfosMap<K, V>
/*     */     extends LinkedHashMap<K, V>
/*     */   {
/*     */     public V put(K key, V value) throws IllegalArgumentException {
/* 915 */       V oldValue = super.put(key, value);
/* 916 */       if (oldValue != null)
/* 917 */         throw new IllegalArgumentException("duplicate key '" + key + "'"); 
/* 918 */       return oldValue;
/*     */     }
/*     */ 
/*     */     
/*     */     public void putAll(Map<? extends K, ? extends V> m) {
/* 923 */       for (Map.Entry<? extends K, ? extends V> e : m.entrySet())
/* 924 */         put(e.getKey(), e.getValue()); 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatStylingSupport.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */