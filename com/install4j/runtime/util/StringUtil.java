/*     */ package com.install4j.runtime.util;
/*     */ 
/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.io.StringReader;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.StringTokenizer;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class StringUtil
/*     */ {
/*     */   public static final String VARIABLE_START = "${";
/*     */   public static final String VARIABLE_END = "}";
/*     */   private static final String ELVIS = "?:";
/*     */   
/*     */   public static String rtrim(String string) {
/*  23 */     int i = string.length() - 1;
/*  24 */     while (i >= 0 && Character.isWhitespace(string.charAt(i))) {
/*  25 */       i--;
/*     */     }
/*  27 */     return string.substring(0, i + 1);
/*     */   }
/*     */   
/*     */   public static String repeat(String string, int count) {
/*  31 */     StringBuilder buffer = new StringBuilder();
/*  32 */     for (int i = 0; i < count; i++) {
/*  33 */       buffer.append(string);
/*     */     }
/*  35 */     return buffer.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public static String replace(String string, String pattern, String replace) {
/*  40 */     int startIndex = 0;
/*     */     
/*  42 */     StringBuilder result = new StringBuilder();
/*     */     int endIndex;
/*  44 */     while ((endIndex = string.indexOf(pattern, startIndex)) >= 0) {
/*  45 */       result.append(string, startIndex, endIndex);
/*  46 */       result.append(replace);
/*  47 */       startIndex = endIndex + pattern.length();
/*     */     } 
/*     */     
/*  50 */     result.append(string.substring(startIndex));
/*     */     
/*  52 */     return result.toString();
/*     */   }
/*     */   
/*     */   public static String replaceVariable(String string, ReplacementCallback replacementCallback) {
/*  56 */     return replaceVariable(string, "${", "}", replacementCallback);
/*     */   }
/*     */   
/*     */   public static String replaceVariable(String string, String startPattern, String endPattern, ReplacementCallback replacementCallback) {
/*  60 */     return replaceVariable(string, startPattern, endPattern, replacementCallback, null);
/*     */   }
/*     */   
/*     */   public static String replaceVariable(String string, ReplacementCallback replacementCallback, Object memento) {
/*  64 */     return replaceVariable(string, "${", "}", replacementCallback, memento);
/*     */   }
/*     */   
/*     */   public static String replaceVariable(String string, String startPattern, String endPattern, ReplacementCallback replacementCallback, Object memento) {
/*  68 */     int startIndex = 0;
/*     */ 
/*     */     
/*  71 */     StringBuilder result = new StringBuilder();
/*     */     int variableIndex, endIndex;
/*  73 */     while ((variableIndex = string.indexOf(startPattern, startIndex)) >= 0 && (endIndex = getEndIndex(string, startPattern, endPattern, variableIndex)) >= 0) {
/*     */       String variable, fallback;
/*  75 */       int nextVariableIndex = string.indexOf(startPattern, variableIndex + startPattern.length());
/*  76 */       int nextElvisIndex = string.indexOf("?:", variableIndex + startPattern.length());
/*  77 */       if (nextVariableIndex > -1 && nextVariableIndex < endIndex && (nextElvisIndex == -1 || nextElvisIndex > endIndex || nextElvisIndex > nextVariableIndex)) {
/*  78 */         result.append(string, startIndex, nextVariableIndex);
/*  79 */         startIndex = nextVariableIndex;
/*     */         
/*     */         continue;
/*     */       } 
/*  83 */       String variableWithElvis = string.substring(variableIndex + startPattern.length(), endIndex);
/*  84 */       int elvisIndex = variableWithElvis.indexOf("?:");
/*     */       
/*  86 */       if (elvisIndex > 0) {
/*  87 */         variable = variableWithElvis.substring(0, elvisIndex);
/*  88 */         boolean skipReplacement = (replacementCallback instanceof SkippableReplacementCallback && ((SkippableReplacementCallback)replacementCallback).isSkipReplacement(variable));
/*  89 */         fallback = skipReplacement ? null : variableWithElvis.substring(elvisIndex + "?:".length());
/*     */       } else {
/*  91 */         variable = variableWithElvis;
/*  92 */         fallback = null;
/*     */       } 
/*  94 */       String replacement = replacementCallback.getReplacement(variable, memento, (fallback != null));
/*  95 */       if (replacement == null && fallback == null) {
/*  96 */         result.append(string, startIndex, endIndex + endPattern.length());
/*     */       } else {
/*  98 */         result.append(string, startIndex, variableIndex);
/*  99 */         result.append((replacement != null) ? replacement : fallback);
/*     */       } 
/* 101 */       startIndex = endIndex + endPattern.length();
/*     */     } 
/*     */     
/* 104 */     result.append(string.substring(startIndex));
/*     */     
/* 106 */     String resultString = result.toString();
/* 107 */     if (!string.equals(resultString) && resultString.contains(startPattern)) {
/* 108 */       return replaceVariable(resultString, startPattern, endPattern, replacementCallback, memento);
/*     */     }
/* 110 */     return resultString;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int getEndIndex(String string, String startPattern, String endPattern, int startIndex) {
/* 115 */     int firstEndIndex = string.indexOf(endPattern, startIndex + startPattern.length());
/* 116 */     int elvisIndex = string.indexOf("?:", startIndex + startPattern.length());
/* 117 */     if (elvisIndex > -1 && elvisIndex < firstEndIndex) {
/* 118 */       int balancedEndIndex = findBalancedEndIndex(string, startPattern, endPattern, elvisIndex + "?:".length());
/* 119 */       if (balancedEndIndex > 0) {
/* 120 */         return balancedEndIndex;
/*     */       }
/* 122 */       return firstEndIndex;
/*     */     } 
/*     */     
/* 125 */     return firstEndIndex;
/*     */   }
/*     */ 
/*     */   
/*     */   private static int findBalancedEndIndex(String string, String startPattern, String endPattern, int startIndex) {
/* 130 */     int openCount = 0;
/*     */     while (true) {
/* 132 */       int startPatternIndex = string.indexOf(startPattern, startIndex);
/* 133 */       int endPatternIndex = string.indexOf(endPattern, startIndex);
/* 134 */       if (endPatternIndex == -1)
/* 135 */         return -1; 
/* 136 */       if (endPatternIndex < startPatternIndex || startPatternIndex == -1) {
/* 137 */         if (openCount == 0) {
/* 138 */           return endPatternIndex;
/*     */         }
/* 140 */         openCount--;
/* 141 */         startIndex = endPatternIndex + endPattern.length();
/*     */         continue;
/*     */       } 
/* 144 */       openCount++;
/* 145 */       startIndex = startPatternIndex + startPattern.length();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void splitupCommandLine(List<String> cmdList, String command) {
/* 151 */     splitupQuotedList(cmdList, command, " ");
/*     */   }
/*     */   
/*     */   public static void splitupQuotedList(List<String> list, String line, String delimiter) {
/* 155 */     if (line != null) {
/* 156 */       StringTokenizer tokenizer = new StringTokenizer(line, delimiter + "\"", true);
/* 157 */       boolean insideQuotes = false;
/* 158 */       StringBuilder argument = new StringBuilder();
/* 159 */       while (tokenizer.hasMoreTokens()) {
/* 160 */         String token = tokenizer.nextToken();
/* 161 */         if (token.equals("\"")) {
/* 162 */           if (insideQuotes && argument.length() > 0) {
/* 163 */             list.add(argument.toString());
/* 164 */             argument.setLength(0);
/*     */           } 
/* 166 */           insideQuotes = !insideQuotes; continue;
/* 167 */         }  if (delimiter.contains(token)) {
/* 168 */           if (insideQuotes) {
/* 169 */             argument.append(delimiter); continue;
/* 170 */           }  if (argument.length() > 0) {
/* 171 */             list.add(argument.toString());
/* 172 */             argument.setLength(0);
/*     */           }  continue;
/*     */         } 
/* 175 */         argument.append(token);
/*     */       } 
/*     */       
/* 178 */       if (argument.length() > 0) {
/* 179 */         list.add(argument.toString());
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static String trimLineSeparators(String text) {
/* 185 */     return trimPattern(trimPattern(text, "\n"), "\r\n");
/*     */   }
/*     */   
/*     */   private static String trimPattern(String text, String pattern) {
/* 189 */     if (text.length() < pattern.length()) {
/* 190 */       return text;
/*     */     }
/* 192 */     int firstPosition = 0;
/* 193 */     int patternLength = pattern.length();
/* 194 */     while (text.substring(firstPosition, firstPosition + patternLength).equals(pattern)) {
/* 195 */       firstPosition += patternLength;
/*     */     }
/*     */     
/* 198 */     int lastPosition = text.length();
/* 199 */     if (firstPosition + patternLength == lastPosition) {
/* 200 */       return "";
/*     */     }
/* 202 */     while (text.substring(lastPosition - patternLength, lastPosition).equals(pattern)) {
/* 203 */       lastPosition -= patternLength;
/*     */     }
/* 205 */     return text.substring(firstPosition, lastPosition);
/*     */   }
/*     */   
/*     */   public static String padLeft(String val, char padChar, int length) {
/* 209 */     StringBuilder buffer = new StringBuilder(length);
/* 210 */     for (int i = 0; i < length - val.length(); i++) {
/* 211 */       buffer.append(padChar);
/*     */     }
/* 213 */     buffer.append(val, 0, Math.min(length, val.length()));
/* 214 */     return buffer.toString();
/*     */   }
/*     */   
/*     */   public static String padRight(String val, char padChar, int length) {
/* 218 */     StringBuilder buffer = new StringBuilder(length);
/* 219 */     buffer.append(val, 0, Math.min(length, val.length()));
/* 220 */     for (int i = 0; i < length - val.length(); i++) {
/* 221 */       buffer.append(padChar);
/*     */     }
/* 223 */     return buffer.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public static String makeCommandLine(String[] commands) {
/* 228 */     if (commands == null) {
/* 229 */       return "";
/*     */     }
/*     */     
/* 232 */     StringBuilder buffer = new StringBuilder();
/* 233 */     for (String command : commands) {
/* 234 */       buffer.append('"');
/* 235 */       buffer.append(command);
/* 236 */       buffer.append('"');
/* 237 */       buffer.append(' ');
/*     */     } 
/* 239 */     return buffer.toString().trim();
/*     */   }
/*     */   
/*     */   public static String toStringWithArrays(Object object) {
/* 243 */     if (object == null)
/* 244 */       return null; 
/* 245 */     if (object.getClass().isArray()) {
/* 246 */       Class<?> c = object.getClass();
/* 247 */       if (c == byte[].class)
/* 248 */         return Arrays.toString((byte[])object); 
/* 249 */       if (c == short[].class)
/* 250 */         return Arrays.toString((short[])object); 
/* 251 */       if (c == int[].class)
/* 252 */         return Arrays.toString((int[])object); 
/* 253 */       if (c == long[].class)
/* 254 */         return Arrays.toString((long[])object); 
/* 255 */       if (c == char[].class)
/* 256 */         return Arrays.toString((char[])object); 
/* 257 */       if (c == float[].class)
/* 258 */         return Arrays.toString((float[])object); 
/* 259 */       if (c == double[].class)
/* 260 */         return Arrays.toString((double[])object); 
/* 261 */       if (c == boolean[].class) {
/* 262 */         return Arrays.toString((boolean[])object);
/*     */       }
/* 264 */       return Arrays.toString((Object[])object);
/*     */     } 
/*     */     
/* 267 */     return object.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public static List<String> getLines(String text) {
/* 272 */     List<String> ret = new ArrayList<String>();
/* 273 */     if (text != null) {
/* 274 */       BufferedReader stringReader = new BufferedReader(new StringReader(text));
/*     */       try {
/* 276 */         String line = stringReader.readLine();
/* 277 */         while (line != null) {
/* 278 */           ret.add(line);
/* 279 */           line = stringReader.readLine();
/*     */         } 
/* 281 */         stringReader.close();
/* 282 */       } catch (IOException e) {
/* 283 */         e.printStackTrace();
/*     */       } 
/*     */     } 
/* 286 */     return ret;
/*     */   }
/*     */   
/*     */   public static int countNonOverlappingSubstrings(String containedText, String text) {
/* 290 */     return (text.split(Pattern.quote(containedText), -1)).length - 1;
/*     */   }
/*     */   
/*     */   public static interface SkippableReplacementCallback extends ReplacementCallback {
/*     */     boolean isSkipReplacement(String param1String);
/*     */   }
/*     */   
/*     */   public static interface ReplacementCallback {
/*     */     String getReplacement(String param1String, Object param1Object, boolean param1Boolean);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\StringUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */