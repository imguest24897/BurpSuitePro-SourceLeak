/*     */ package com.ejt.internal.util;
/*     */ 
/*     */ import com.ejt.internal.CommonApplicationServices;
/*     */ import java.io.File;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.StringTokenizer;
/*     */ 
/*     */ 
/*     */ public class CommonStringUtil
/*     */ {
/*     */   public static String decapitalizeFirstLetter(String string) {
/*  14 */     return decapitalizeFirstLetter(string, false);
/*     */   }
/*     */   
/*     */   public static String decapitalizeFirstLetter(String string, boolean force) {
/*  18 */     CommonApplicationServices instance = CommonApplicationServices.getInstance();
/*  19 */     if (!force && instance != null && instance.isLocalized()) {
/*  20 */       return string;
/*     */     }
/*  22 */     if (string == null) {
/*  23 */       return null;
/*     */     }
/*  25 */     if (string.length() < 2) {
/*  26 */       return string.toLowerCase();
/*     */     }
/*  28 */     if (Character.isUpperCase(string.charAt(0)) && Character.isLowerCase(string.charAt(1))) {
/*  29 */       StringBuilder buffer = new StringBuilder();
/*  30 */       buffer.append(Character.toLowerCase(string.charAt(0)));
/*  31 */       buffer.append(string.substring(1));
/*  32 */       return buffer.toString();
/*     */     } 
/*  34 */     return string;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String removePrefix(String string, String prefix) {
/*  39 */     if (string.startsWith(prefix)) {
/*  40 */       return string.substring(prefix.length());
/*     */     }
/*  42 */     return string;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String wrapString(String string, int maxLength, String prepend) {
/*  47 */     return wrapString(string, maxLength, prepend, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public static String wrapString(String string, int maxLength, String prepend, boolean prependFirst) {
/*  52 */     if (prepend == null) {
/*  53 */       prepend = "";
/*     */     }
/*  55 */     StringBuilder output = new StringBuilder(prependFirst ? prepend : "");
/*  56 */     StringTokenizer tokenizer = new StringTokenizer(string, " ," + File.pathSeparator, true);
/*  57 */     int lineLength = 0;
/*  58 */     label22: while (tokenizer.hasMoreTokens()) {
/*  59 */       String token = tokenizer.nextToken();
/*     */       while (true)
/*  61 */       { if (lineLength + token.length() > maxLength) {
/*  62 */           if (lineLength < maxLength / 2) {
/*  63 */             output.append(token, 0, maxLength - lineLength);
/*  64 */             token = token.substring(maxLength - lineLength);
/*     */           } 
/*  66 */           output.append('\n');
/*  67 */           output.append(prepend);
/*  68 */           lineLength = 0;
/*     */         } else {
/*  70 */           if (lineLength == 0) {
/*  71 */             token = token.trim();
/*     */           }
/*  73 */           output.append(token);
/*  74 */           lineLength += token.length();
/*  75 */           token = null;
/*     */         } 
/*  77 */         if (token == null)
/*     */           continue label22;  } 
/*  79 */     }  return output.toString();
/*     */   }
/*     */   
/*     */   public static String ellipse(String text, int maxLength) {
/*  83 */     int length = text.length();
/*  84 */     if (length <= maxLength) {
/*  85 */       return text;
/*     */     }
/*  87 */     maxLength -= 3;
/*  88 */     int deltaLeft = (length - maxLength) / 2;
/*  89 */     int deltaRight = length - maxLength - deltaLeft;
/*  90 */     StringBuilder buffer = new StringBuilder();
/*  91 */     buffer.append(text, 0, length / 2 - deltaLeft);
/*  92 */     buffer.append("...");
/*  93 */     buffer.append(text.substring(length / 2 + deltaRight));
/*     */     
/*  95 */     return buffer.toString();
/*     */   }
/*     */   
/*     */   public static String capitalizeFirstLetter(String string) {
/*  99 */     if (string == null) {
/* 100 */       return null;
/*     */     }
/* 102 */     if (Character.isUpperCase(string.charAt(0))) {
/* 103 */       return string;
/*     */     }
/* 105 */     StringBuilder buffer = new StringBuilder();
/* 106 */     buffer.append(Character.toUpperCase(string.charAt(0)));
/* 107 */     buffer.append(string.substring(1));
/* 108 */     return buffer.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public static String ellipseFileName(File file, int maxLength) {
/* 113 */     List<String> components = new ArrayList<String>();
/* 114 */     File currentFile = file;
/* 115 */     while (currentFile != null) {
/* 116 */       String name = currentFile.getName();
/* 117 */       if (name.length() == 0) {
/* 118 */         name = currentFile.getPath();
/*     */       }
/* 120 */       if (name.endsWith(File.separator)) {
/* 121 */         name = name.substring(0, name.length() - File.separator.length());
/*     */       }
/*     */       
/* 124 */       components.add(name);
/* 125 */       currentFile = currentFile.getParentFile();
/*     */     } 
/* 127 */     Collections.reverse(components);
/* 128 */     boolean[] included = new boolean[components.size()];
/* 129 */     int length = 0;
/* 130 */     int leftIndex = 0;
/* 131 */     int rightIndex = components.size() - 1;
/*     */     
/* 133 */     while (leftIndex <= rightIndex) {
/* 134 */       included[leftIndex] = true;
/* 135 */       length += ((String)components.get(leftIndex)).length() + 1;
/*     */       
/* 137 */       if ((length > maxLength && leftIndex > 0) || leftIndex == rightIndex) {
/*     */         break;
/*     */       }
/*     */       
/* 141 */       included[rightIndex] = true;
/* 142 */       length += ((String)components.get(rightIndex)).length() + 1;
/*     */       
/* 144 */       leftIndex++;
/* 145 */       rightIndex--;
/*     */     } 
/*     */ 
/*     */     
/* 149 */     StringBuilder buffer = new StringBuilder();
/* 150 */     boolean ellipsePrinted = false;
/* 151 */     for (int i = 0; i < included.length; i++) {
/* 152 */       if (included[i]) {
/* 153 */         if (i > 0) {
/* 154 */           buffer.append(File.separator);
/*     */         }
/* 156 */         buffer.append(components.get(i));
/* 157 */       } else if (!ellipsePrinted) {
/* 158 */         buffer.append(File.separator);
/* 159 */         buffer.append("...");
/* 160 */         ellipsePrinted = true;
/*     */       } 
/*     */     } 
/*     */     
/* 164 */     return buffer.toString();
/*     */   }
/*     */   
/*     */   public static List<String> splitupCommandLine(String command) {
/* 168 */     List<String> cmdList = new ArrayList<String>();
/* 169 */     splitupQuotedList(cmdList, command, " ");
/* 170 */     return cmdList;
/*     */   }
/*     */   
/*     */   public static void splitupCommandLine(List<String> cmdList, String command) {
/* 174 */     splitupQuotedList(cmdList, command, " ");
/*     */   }
/*     */   
/*     */   public static void splitupQuotedList(List<String> list, String line, String delimiter) {
/* 178 */     List<SplitEntry> entryList = new ArrayList<SplitEntry>();
/* 179 */     splitupToEntries(entryList, line, delimiter);
/* 180 */     for (SplitEntry splitEntry : entryList) {
/* 181 */       list.add(splitEntry.value);
/*     */     }
/*     */   }
/*     */   
/*     */   public static List<SplitEntry> splitupCommandLineToEntries(String command) {
/* 186 */     List<SplitEntry> cmdList = new ArrayList<SplitEntry>();
/* 187 */     splitupToEntries(cmdList, command, " ");
/* 188 */     return cmdList;
/*     */   }
/*     */   
/*     */   public static void splitupToEntries(List<SplitEntry> list, String line, String delimiter) {
/* 192 */     StringTokenizer tokenizer = new StringTokenizer(line, delimiter + "\"", true);
/* 193 */     boolean insideQuotes = false;
/* 194 */     StringBuilder argument = new StringBuilder();
/* 195 */     while (tokenizer.hasMoreTokens()) {
/* 196 */       String token = tokenizer.nextToken();
/* 197 */       if (token.equals("\"")) {
/* 198 */         if (insideQuotes && argument.length() > 0) {
/* 199 */           list.add(new SplitEntry(true, argument.toString()));
/* 200 */           argument.setLength(0);
/*     */         } 
/* 202 */         insideQuotes = !insideQuotes; continue;
/* 203 */       }  if (delimiter.contains(token)) {
/* 204 */         if (insideQuotes) {
/* 205 */           argument.append(delimiter); continue;
/* 206 */         }  if (argument.length() > 0) {
/* 207 */           list.add(new SplitEntry(false, argument.toString()));
/* 208 */           argument.setLength(0);
/*     */         }  continue;
/*     */       } 
/* 211 */       argument.append(token);
/*     */     } 
/*     */     
/* 214 */     if (argument.length() > 0) {
/* 215 */       list.add(new SplitEntry(false, argument.toString()));
/*     */     }
/*     */   }
/*     */   
/*     */   public static String join(String delimiter, Iterable<String> parts) {
/* 220 */     StringBuilder buffer = new StringBuilder();
/* 221 */     for (String part : parts) {
/* 222 */       if (buffer.length() > 0) {
/* 223 */         buffer.append(delimiter);
/*     */       }
/* 225 */       buffer.append(part);
/*     */     } 
/* 227 */     return buffer.toString();
/*     */   }
/*     */   
/*     */   public static String encodeUrlSpaces(String url) {
/* 231 */     StringBuilder buffer = new StringBuilder();
/* 232 */     int urlLen = url.length();
/* 233 */     for (int i = 0; i < urlLen; i++) {
/* 234 */       if (url.charAt(i) == ' ') {
/* 235 */         buffer.append("%20");
/*     */       } else {
/* 237 */         buffer.append(url.charAt(i));
/*     */       } 
/*     */     } 
/* 240 */     return buffer.toString();
/*     */   }
/*     */   
/*     */   public static class SplitEntry {
/*     */     private boolean quoted;
/*     */     private String value;
/*     */     
/*     */     public SplitEntry(boolean quoted, String value) {
/* 248 */       this.quoted = quoted;
/* 249 */       this.value = value;
/*     */     }
/*     */     
/*     */     public boolean isQuoted() {
/* 253 */       return this.quoted;
/*     */     }
/*     */     
/*     */     public String getValue() {
/* 257 */       return this.value;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 262 */       return "SplitEntry{quoted=" + this.quoted + ", value='" + this.value + '\'' + '}';
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\interna\\util\CommonStringUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */