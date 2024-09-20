/*     */ package com.install4j.runtime.installer.helper;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.StringTokenizer;
/*     */ 
/*     */ public class VariableEncoding {
/*     */   public static final String BOOLEAN_SUFFIX = "$Boolean";
/*     */   public static final String DATE_SUFFIX = "$Date";
/*     */   public static final String INTEGER_SUFFIX = "$Integer";
/*     */   
/*     */   public static Map<String, Object> decodeVariables(Map<String, String> encodedVars, boolean ignoreErrors) {
/*  15 */     Map<String, Object> result = new HashMap<>();
/*  16 */     for (Map.Entry<String, String> entry : encodedVars.entrySet()) {
/*  17 */       String variableName = entry.getKey();
/*  18 */       String variableString = entry.getValue();
/*  19 */       String realName = getRealVariableName(variableName);
/*     */       
/*     */       try {
/*  22 */         result.put(realName, decodeVariable(variableName, variableString));
/*  23 */       } catch (Exception e) {
/*  24 */         if (!ignoreErrors) {
/*  25 */           String errorMessage = "Could not decode variable " + variableName + ": " + e;
/*  26 */           Logger.getInstance().error(null, errorMessage);
/*  27 */           System.err.println(errorMessage);
/*     */         } 
/*     */       } 
/*     */     } 
/*  31 */     return result;
/*     */   }
/*     */   public static final String LONG_SUFFIX = "$Long"; public static final String INT_ARRAY_SUFFIX = "$IntArray"; public static final String STRING_ARRAY_SUFFIX = "$StringArray";
/*     */   public static String getRealVariableName(String encodedVariableName) {
/*  35 */     int i = encodedVariableName.indexOf('$');
/*  36 */     if (i > -1) {
/*  37 */       return encodedVariableName.substring(0, i);
/*     */     }
/*  39 */     return encodedVariableName;
/*     */   }
/*     */ 
/*     */   
/*     */   private static Object decodeVariable(String variableName, String variableString) {
/*  44 */     if (variableName.endsWith("$Boolean"))
/*  45 */       return Boolean.valueOf(variableString); 
/*  46 */     if (variableName.endsWith("$Date"))
/*  47 */       return new Date(Long.parseLong(variableString)); 
/*  48 */     if (variableName.endsWith("$Integer"))
/*  49 */       return Integer.valueOf(variableString); 
/*  50 */     if (variableName.endsWith("$Long"))
/*  51 */       return Long.valueOf(variableString); 
/*  52 */     if (variableName.endsWith("$IntArray"))
/*  53 */       return decodeIntegerArray(variableString); 
/*  54 */     if (variableName.endsWith("$StringArray")) {
/*  55 */       return decodeStringArray(variableString);
/*     */     }
/*  57 */     return variableString;
/*     */   }
/*     */ 
/*     */   
/*     */   public static Object decodeIntegerArray(String variableString) {
/*  62 */     List<String> list = new ArrayList<>();
/*  63 */     for (StringTokenizer tokenizer = new StringTokenizer(variableString, ","); tokenizer.hasMoreTokens(); ) {
/*  64 */       String sVal = tokenizer.nextToken();
/*  65 */       list.add(sVal.trim());
/*     */     } 
/*  67 */     int[] ret = new int[list.size()];
/*  68 */     for (int i = 0; i < list.size(); i++) {
/*  69 */       String s = list.get(i);
/*  70 */       ret[i] = Integer.parseInt(s);
/*     */     } 
/*  72 */     return ret;
/*     */   }
/*     */   
/*     */   public static Object decodeStringArray(String variableString) {
/*  76 */     List<String> list = new ArrayList<>();
/*     */     
/*  78 */     StringBuilder curVal = null;
/*  79 */     for (int i = 0; i < variableString.length(); i++) {
/*  80 */       char c = variableString.charAt(i);
/*  81 */       if (i == 0 && c != '"') {
/*  82 */         throw new IllegalArgumentException("Missing quote at the beginning of " + variableString);
/*     */       }
/*  84 */       if (c == '"') {
/*  85 */         if (curVal == null) {
/*  86 */           curVal = new StringBuilder();
/*     */         } else {
/*  88 */           list.add(curVal.toString());
/*  89 */           curVal = null;
/*     */         } 
/*  91 */       } else if (c == '\\') {
/*  92 */         i++;
/*  93 */         if (curVal != null) {
/*  94 */           curVal.append(variableString.charAt(i));
/*     */         }
/*     */       }
/*  97 */       else if (curVal != null) {
/*  98 */         curVal.append(c);
/*  99 */       } else if (c != ',' && !Character.isWhitespace(c)) {
/* 100 */         throw new IllegalArgumentException("Illegal separator \"" + c + "\" in " + variableString);
/*     */       } 
/*     */     } 
/*     */     
/* 104 */     if (curVal != null) {
/* 105 */       throw new IllegalArgumentException("Unmatched quotes in " + variableString);
/*     */     }
/*     */     
/* 108 */     String[] ret = new String[list.size()];
/* 109 */     for (int j = 0; j < list.size(); j++) {
/* 110 */       ret[j] = list.get(j);
/*     */     }
/* 112 */     return ret;
/*     */   }
/*     */   
/*     */   public static boolean encodeVariable(Map<String, String> properties, String variableName, Object variableValue) {
/* 116 */     if (variableValue == null) {
/* 117 */       return false;
/*     */     }
/* 119 */     String encodedVariableName = getEncodedVariableName(variableName, variableValue);
/* 120 */     if (variableValue instanceof String) {
/* 121 */       properties.put(encodedVariableName, (String)variableValue);
/* 122 */     } else if (variableValue instanceof Boolean) {
/* 123 */       properties.put(encodedVariableName, variableValue.toString());
/* 124 */     } else if (variableValue instanceof Date) {
/* 125 */       properties.put(encodedVariableName, String.valueOf(((Date)variableValue).getTime()));
/* 126 */     } else if (variableValue instanceof Integer) {
/* 127 */       properties.put(encodedVariableName, variableValue.toString());
/* 128 */     } else if (variableValue instanceof Long) {
/* 129 */       properties.put(encodedVariableName, variableValue.toString());
/* 130 */     } else if (variableValue instanceof int[]) {
/* 131 */       int[] intArray = (int[])variableValue;
/* 132 */       StringBuilder value = new StringBuilder();
/* 133 */       for (int i = 0; i < intArray.length; i++) {
/* 134 */         value.append(intArray[i]);
/* 135 */         if (i < intArray.length - 1) {
/* 136 */           value.append(",");
/*     */         }
/*     */       } 
/* 139 */       properties.put(encodedVariableName, value.toString());
/* 140 */     } else if (variableValue instanceof String[]) {
/* 141 */       String[] stringArray = (String[])variableValue;
/* 142 */       StringBuilder value = new StringBuilder();
/* 143 */       for (int i = 0; i < stringArray.length; i++) {
/* 144 */         value.append("\"").append(encodeArrayString(stringArray[i])).append("\"");
/* 145 */         if (i < stringArray.length - 1) {
/* 146 */           value.append(",");
/*     */         }
/*     */       } 
/* 149 */       properties.put(encodedVariableName, value.toString());
/*     */     } else {
/* 151 */       return false;
/*     */     } 
/* 153 */     return true;
/*     */   }
/*     */   
/*     */   public static String getEncodedVariableName(String variableName, Object variableValue) {
/* 157 */     if (variableValue instanceof Boolean)
/* 158 */       return variableName + "$Boolean"; 
/* 159 */     if (variableValue instanceof Date)
/* 160 */       return variableName + "$Date"; 
/* 161 */     if (variableValue instanceof Integer)
/* 162 */       return variableName + "$Integer"; 
/* 163 */     if (variableValue instanceof Long)
/* 164 */       return variableName + "$Long"; 
/* 165 */     if (variableValue instanceof int[])
/* 166 */       return variableName + "$IntArray"; 
/* 167 */     if (variableValue instanceof String[]) {
/* 168 */       return variableName + "$StringArray";
/*     */     }
/* 170 */     return variableName;
/*     */   }
/*     */ 
/*     */   
/*     */   private static String encodeArrayString(String str) {
/* 175 */     if (str == null) {
/* 176 */       return "";
/*     */     }
/* 178 */     StringBuilder value = new StringBuilder();
/* 179 */     for (int i = 0; i < str.length(); i++) {
/* 180 */       char c = str.charAt(i);
/* 181 */       if (c == '"') {
/* 182 */         value.append("\\\"");
/* 183 */       } else if (c == '\\') {
/* 184 */         value.append("\\\\");
/*     */       } else {
/* 186 */         value.append(c);
/*     */       } 
/*     */     } 
/* 189 */     return value.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/* 194 */     Map<String, String> props = new HashMap<>();
/* 195 */     encodeVariable(props, "stringVar", "test\\\"");
/* 196 */     encodeVariable(props, "booleanVar", Boolean.TRUE);
/* 197 */     encodeVariable(props, "integerVar", Integer.valueOf(123));
/* 198 */     encodeVariable(props, "dateVar", new Date());
/* 199 */     encodeVariable(props, "intArray", new int[0]);
/* 200 */     encodeVariable(props, "stringArray", new String[0]);
/* 201 */     encodeVariable(props, "stringArray2", new String[] { "One", "Two\" c\\3" });
/* 202 */     System.out.println(props);
/*     */     
/* 204 */     Map<String, String> encoded = new HashMap<>(props);
/*     */     
/* 206 */     System.out.println("decode");
/* 207 */     Map<String, Object> result = decodeVariables(encoded, false);
/* 208 */     for (Map.Entry<String, Object> entry : result.entrySet()) {
/* 209 */       Object displayValue; System.out.println(entry.getKey());
/* 210 */       Object value = entry.getValue();
/*     */       
/* 212 */       if (value instanceof String[]) {
/* 213 */         displayValue = Arrays.asList((String[])value);
/*     */       } else {
/* 215 */         displayValue = value;
/*     */       } 
/*     */       
/* 218 */       System.out.println(entry.getValue().getClass().getName() + ": " + displayValue);
/* 219 */       System.out.println("---------");
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\VariableEncoding.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */