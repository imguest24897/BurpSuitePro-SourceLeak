package org.yaml;

import java.util.List;

public final class Zgh<T> extends Z_8 {
  private final String ZT;
  
  private final List<T> ZY;
  
  private static final String b;
  
  public Zgh(String paramString, List<T> paramList, Zt1 paramZt11, Zt1 paramZt12) {
    super(paramZt11, paramZt12);
    this.ZT = paramString;
    if (paramList != null)
      try {
        if (paramList.size() != 2)
          throw new Zj3(b + paramList.size()); 
      } catch (Zj3 zj3) {
        throw a(null);
      }  
    this.ZY = paramList;
  }
  
  public String ZQ() {
    return this.ZT;
  }
  
  public List<T> Zp() {
    return this.ZY;
  }
  
  public Ztt ZI() {
    return Ztt.Directive;
  }
  
  private static Zj3 a(Zj3 paramZj3) {
    return paramZj3;
  }
  
  static {
    // Byte code:
    //   0: bipush #125
    //   2: ldc 'O\\rZ\\b\\frRH[hYJiCR;[HZZ]['
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic org/yaml/Zgh.b : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
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
    //   80: bipush #102
    //   82: goto -> 111
    //   85: bipush #7
    //   87: goto -> 111
    //   90: bipush #72
    //   92: goto -> 111
    //   95: bipush #70
    //   97: goto -> 111
    //   100: bipush #6
    //   102: goto -> 111
    //   105: bipush #23
    //   107: goto -> 111
    //   110: iconst_3
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zgh.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */