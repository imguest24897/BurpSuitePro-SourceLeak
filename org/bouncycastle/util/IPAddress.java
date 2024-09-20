package org.bouncycastle.util;

public class IPAddress {
  public static boolean isValid(String paramString) {
    return (isValidIPv4(paramString) || isValidIPv6(paramString));
  }
  
  public static boolean isValidWithNetMask(String paramString) {
    return (isValidIPv4WithNetmask(paramString) || isValidIPv6WithNetmask(paramString));
  }
  
  public static boolean isValidIPv4(String paramString) {
    int i = paramString.length();
    if (i < 7 || i > 15)
      return false; 
    int j = 0;
    for (byte b = 0; b < 3; b++) {
      int k = paramString.indexOf('.', j);
      if (!isParseableIPv4Octet(paramString, j, k))
        return false; 
      j = k + 1;
    } 
    return isParseableIPv4Octet(paramString, j, i);
  }
  
  public static boolean isValidIPv4WithNetmask(String paramString) {
    int i = paramString.indexOf("/");
    if (i < 1)
      return false; 
    String str1 = paramString.substring(0, i);
    String str2 = paramString.substring(i + 1);
    return (isValidIPv4(str1) && (isValidIPv4(str2) || isParseableIPv4Mask(str2)));
  }
  
  public static boolean isValidIPv6(String paramString) {
    if (paramString.length() == 0)
      return false; 
    char c = paramString.charAt(0);
    if (c != ':' && Character.digit(c, 16) < 0)
      return false; 
    byte b = 0;
    String str = paramString + ":";
    boolean bool = false;
    int i = 0;
    int j;
    while (i < str.length() && (j = str.indexOf(':', i)) >= i) {
      if (b == 8)
        return false; 
      if (i != j) {
        String str1 = str.substring(i, j);
        if (j == str.length() - 1 && str1.indexOf('.') > 0) {
          if (++b == 8)
            return false; 
          if (!isValidIPv4(str1))
            return false; 
        } else if (!isParseableIPv6Segment(str, i, j)) {
          return false;
        } 
      } else {
        if (j != 1 && j != str.length() - 1 && bool)
          return false; 
        bool = true;
      } 
      i = j + 1;
      b++;
    } 
    return (b == 8 || bool);
  }
  
  public static boolean isValidIPv6WithNetmask(String paramString) {
    int i = paramString.indexOf("/");
    if (i < 1)
      return false; 
    String str1 = paramString.substring(0, i);
    String str2 = paramString.substring(i + 1);
    return (isValidIPv6(str1) && (isValidIPv6(str2) || isParseableIPv6Mask(str2)));
  }
  
  private static boolean isParseableIPv4Mask(String paramString) {
    return isParseable(paramString, 0, paramString.length(), 10, 2, false, 0, 32);
  }
  
  private static boolean isParseableIPv4Octet(String paramString, int paramInt1, int paramInt2) {
    return isParseable(paramString, paramInt1, paramInt2, 10, 3, true, 0, 255);
  }
  
  private static boolean isParseableIPv6Mask(String paramString) {
    return isParseable(paramString, 0, paramString.length(), 10, 3, false, 1, 128);
  }
  
  private static boolean isParseableIPv6Segment(String paramString, int paramInt1, int paramInt2) {
    return isParseable(paramString, paramInt1, paramInt2, 16, 4, true, 0, 65535);
  }
  
  private static boolean isParseable(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5, int paramInt6) {
    int i = paramInt2 - paramInt1;
    if ((((i < 1) ? 1 : 0) | ((i > paramInt4) ? 1 : 0)) != 0)
      return false; 
    int j = ((i > 1) ? 1 : 0) & (!paramBoolean ? 1 : 0);
    if (j != 0 && Character.digit(paramString.charAt(paramInt1), paramInt3) <= 0)
      return false; 
    int k;
    for (k = 0; paramInt1 < paramInt2; k += m) {
      char c = paramString.charAt(paramInt1++);
      int m = Character.digit(c, paramInt3);
      if (m < 0)
        return false; 
      k *= paramInt3;
    } 
    return ((k >= paramInt5)) & ((k <= paramInt6));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastl\\util\IPAddress.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */