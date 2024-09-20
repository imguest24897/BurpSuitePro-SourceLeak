package org.yaml;

import burp.Zbqc;

public class Zje {
  private static final String a;
  
  public static <T extends Enum<T>> T Zu(Class<T> paramClass, String paramString) {
    Enum[] arrayOfEnum = (Enum[])paramClass.getEnumConstants();
    Zbqc[] arrayOfZbqc = Zq.Zl();
    int i = arrayOfEnum.length;
    byte b = 0;
    while (b < i) {
      Enum enum_ = arrayOfEnum[b];
      try {
        if (enum_.name().compareToIgnoreCase(paramString) == 0)
          return (T)enum_; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      b++;
      if (arrayOfZbqc != null) {
        Zbqc.Zr(new Zbqc[2]);
        break;
      } 
    } 
    throw new IllegalArgumentException(a + paramClass.getCanonicalName() + "." + paramString);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #63
    //   2: ldc '1\\r@1}W:A=3'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic org/yaml/Zje.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #98
    //   82: goto -> 112
    //   85: bipush #95
    //   87: goto -> 112
    //   90: bipush #7
    //   92: goto -> 112
    //   95: bipush #107
    //   97: goto -> 112
    //   100: bipush #92
    //   102: goto -> 112
    //   105: bipush #10
    //   107: goto -> 112
    //   110: bipush #99
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zje.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */