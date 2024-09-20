/*     */ package com.install4j.runtime.util;
/*     */ 
/*     */ import java.util.StringTokenizer;
/*     */ 
/*     */ public class VersionCheck
/*     */ {
/*   7 */   private static final NumberSplit UNAVAILABLE_SPLIT = new NumberSplit("", "0");
/*     */   
/*     */   public static boolean checkJavaVersionCompatible(String expectedLower, String expectedHigher) {
/*  10 */     return checkCompatible(expectedLower, expectedHigher, false);
/*     */   }
/*     */   
/*     */   public static boolean checkCompatible(String expectedLower, String expectedHigher) {
/*  14 */     return checkCompatible(expectedLower, expectedHigher, true);
/*     */   }
/*     */   
/*     */   public static boolean checkCompatible(String expectedLower, String expectedHigher, boolean useNonNumeric) {
/*  18 */     expectedLower = prepareForVersionComparison(expectedLower);
/*  19 */     expectedHigher = prepareForVersionComparison(expectedHigher);
/*     */     
/*  21 */     StringTokenizer expectedLowerTokenizer = new StringTokenizer(expectedLower, ".");
/*  22 */     StringTokenizer expectedHigherTokenizer = new StringTokenizer(expectedHigher, ".");
/*     */     
/*  24 */     while (expectedLowerTokenizer.hasMoreTokens() || expectedHigherTokenizer.hasMoreTokens()) {
/*     */ 
/*     */       
/*  27 */       NumberSplit expectedLowerToken = expectedLowerTokenizer.hasMoreTokens() ? extractNumbers(expectedLowerTokenizer.nextToken()) : UNAVAILABLE_SPLIT;
/*     */ 
/*     */       
/*  30 */       NumberSplit expectedHigherToken = expectedHigherTokenizer.hasMoreTokens() ? extractNumbers(expectedHigherTokenizer.nextToken()) : UNAVAILABLE_SPLIT;
/*     */       
/*  32 */       if (useNonNumeric && expectedLowerToken.nonNumericPart.length() > 0 && expectedHigherToken.nonNumericPart
/*  33 */         .length() == 0)
/*     */       {
/*  35 */         return true; } 
/*  36 */       if (useNonNumeric && expectedLowerToken.nonNumericPart.length() == 0 && expectedHigherToken.nonNumericPart
/*  37 */         .length() > 0)
/*     */       {
/*  39 */         return false;
/*     */       }
/*     */       
/*  42 */       int textComparison = expectedLowerToken.nonNumericPart.compareTo(expectedHigherToken.nonNumericPart);
/*  43 */       if (useNonNumeric && textComparison != 0) {
/*  44 */         return (textComparison < 0);
/*     */       }
/*     */       
/*  47 */       long expectedLowerVersionPart = Long.parseLong(expectedLowerToken.numericPart);
/*  48 */       long expectedHigherVersionPart = Long.parseLong(expectedHigherToken.numericPart);
/*     */       
/*  50 */       if (expectedHigherVersionPart != expectedLowerVersionPart) {
/*  51 */         return (expectedHigherVersionPart > expectedLowerVersionPart);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/*  56 */     return !expectedLowerTokenizer.hasMoreTokens();
/*     */   }
/*     */   
/*     */   private static String prepareForVersionComparison(String version) {
/*  60 */     StringBuilder comparableVersion = new StringBuilder();
/*  61 */     char previousCharacter = Character.MIN_VALUE;
/*  62 */     for (int i = 0; i < version.length(); i++) {
/*  63 */       char c = version.charAt(i);
/*  64 */       if (Character.isDigit(c)) {
/*  65 */         comparableVersion.append(c);
/*  66 */       } else if (c == '.' || c == '-' || c == '_') {
/*     */ 
/*     */         
/*  69 */         if (previousCharacter != '.') {
/*  70 */           comparableVersion.append(".");
/*     */         }
/*     */       } else {
/*  73 */         if (Character.isDigit(previousCharacter) || previousCharacter == '\000')
/*     */         {
/*  75 */           comparableVersion.append(".");
/*     */         }
/*  77 */         comparableVersion.append(Character.toLowerCase(c));
/*     */       } 
/*     */       
/*  80 */       previousCharacter = comparableVersion.charAt(comparableVersion.length() - 1);
/*     */     } 
/*     */     
/*  83 */     return comparableVersion.toString();
/*     */   }
/*     */   
/*     */   private static NumberSplit extractNumbers(String text) {
/*  87 */     char[] chars = text.toCharArray();
/*  88 */     for (int i = 0; i < chars.length; i++) {
/*  89 */       if (Character.isDigit(chars[i])) {
/*  90 */         return new NumberSplit(new String(chars, 0, i), new String(chars, i, chars.length - i));
/*     */       }
/*     */     } 
/*     */     
/*  94 */     return new NumberSplit(text, "0");
/*     */   }
/*     */   
/*     */   private static class NumberSplit {
/*     */     final String nonNumericPart;
/*     */     final String numericPart;
/*     */     
/*     */     public NumberSplit(String nonNumericPart, String numericPart) {
/* 102 */       this.nonNumericPart = nonNumericPart;
/* 103 */       this.numericPart = numericPart;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\VersionCheck.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */