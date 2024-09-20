package org.bouncycastle.util.test;

public final class NumberParsing {
  public static long decodeLongFromHex(String paramString) {
    return (paramString.charAt(1) == 'x' || paramString.charAt(1) == 'X') ? Long.parseLong(paramString.substring(2), 16) : Long.parseLong(paramString, 16);
  }
  
  public static int decodeIntFromHex(String paramString) {
    return (paramString.charAt(1) == 'x' || paramString.charAt(1) == 'X') ? Integer.parseInt(paramString.substring(2), 16) : Integer.parseInt(paramString, 16);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastl\\util\test\NumberParsing.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */