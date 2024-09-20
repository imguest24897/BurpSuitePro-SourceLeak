package org.bouncycastle.jsse.provider;

import java.lang.reflect.Method;

public class IDNUtil {
  public static final int ALLOW_UNASSIGNED = ReflectionUtil.getStaticIntOrDefault("java.net.IDN", "ALLOW_UNASSIGNED", 1).intValue();
  
  public static final int USE_STD3_ASCII_RULES = ReflectionUtil.getStaticIntOrDefault("java.net.IDN", "USE_STD3_ASCII_RULES", 2).intValue();
  
  private static final Method toASCIIMethod = ReflectionUtil.getMethod("java.net.IDN", "toASCII", new Class[] { String.class, int.class });
  
  private static final Method toUnicodeMethod = ReflectionUtil.getMethod("java.net.IDN", "toUnicode", new Class[] { String.class, int.class });
  
  private static final String IDN_CLASSNAME = "java.net.IDN";
  
  private static final int MAX_LABEL_LENGTH = 63;
  
  public static String toASCII(String paramString, int paramInt) {
    if (null != toASCIIMethod)
      return (String)ReflectionUtil.invokeMethod(null, toASCIIMethod, new Object[] { paramString, Integer.valueOf(paramInt) }); 
    if (isRoot(paramString))
      return "."; 
    StringBuilder stringBuilder = new StringBuilder();
    int i = paramString.length();
    int j;
    for (j = 0; j < i; j = k + 1) {
      int k = findSeparator(paramString, j);
      String str1 = paramString.substring(j, k);
      String str2 = toAsciiLabel(str1, paramInt);
      stringBuilder.append(str2);
      if (k < paramString.length())
        stringBuilder.append('.'); 
    } 
    return stringBuilder.toString();
  }
  
  public static String toUnicode(String paramString, int paramInt) {
    if (null != toUnicodeMethod)
      return (String)ReflectionUtil.invokeMethod(null, toUnicodeMethod, new Object[] { paramString, Integer.valueOf(paramInt) }); 
    if (isRoot(paramString))
      return "."; 
    StringBuilder stringBuilder = new StringBuilder();
    int i = paramString.length();
    int j;
    for (j = 0; j < i; j = k + 1) {
      int k = findSeparator(paramString, j);
      String str1 = paramString.substring(j, k);
      String str2 = toUnicodeLabel(str1, paramInt);
      stringBuilder.append(str2);
      if (k < paramString.length())
        stringBuilder.append('.'); 
    } 
    return stringBuilder.toString();
  }
  
  private static int findSeparator(String paramString, int paramInt) {
    while (paramInt < paramString.length() && !isSeparator(paramString.charAt(paramInt)))
      paramInt++; 
    return paramInt;
  }
  
  private static boolean isAllAscii(CharSequence paramCharSequence) {
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      if (c >= '')
        return false; 
    } 
    return true;
  }
  
  private static boolean hasAnyNonLDHAscii(CharSequence paramCharSequence) {
    for (byte b = 0; b < paramCharSequence.length(); b++) {
      char c = paramCharSequence.charAt(b);
      if ((Character.MIN_VALUE <= c && c <= ',') || ('.' <= c && c <= '/') || (':' <= c && c <= '@') || ('[' <= c && c <= '`') || ('{' <= c && c <= ''))
        return true; 
    } 
    return false;
  }
  
  private static boolean isRoot(String paramString) {
    return (paramString.length() == 1 && isSeparator(paramString.charAt(0)));
  }
  
  private static boolean isSeparator(char paramChar) {
    switch (paramChar) {
      case '.':
      case '。':
      case '．':
      case '｡':
        return true;
    } 
    return false;
  }
  
  private static String toAsciiLabel(String paramString, int paramInt) {
    if (paramString.length() < 1)
      throw new IllegalArgumentException("Domain name label cannot be empty"); 
    boolean bool = isAllAscii(paramString);
    if (!bool)
      throw new UnsupportedOperationException("IDN support incomplete"); 
    boolean bool1 = ((paramInt & USE_STD3_ASCII_RULES) != 0) ? true : false;
    if (bool1) {
      if (hasAnyNonLDHAscii(paramString))
        throw new IllegalArgumentException("Domain name label cannot contain non-LDH characters"); 
      if ('-' == paramString.charAt(0) || '-' == paramString.charAt(paramString.length() - 1))
        throw new IllegalArgumentException("Domain name label cannot begin or end with a hyphen"); 
    } 
    if (63 < paramString.length())
      throw new IllegalArgumentException("Domain name label length cannot be more than 63"); 
    return paramString;
  }
  
  private static String toUnicodeLabel(String paramString, int paramInt) {
    return paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\IDNUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */