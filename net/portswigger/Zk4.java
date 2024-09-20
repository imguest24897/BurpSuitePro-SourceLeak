package net.portswigger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Zk4 {
  private final int ZZ;
  
  private final Map<String, String> ZE;
  
  private final List<Zn8> ZF;
  
  private static final String a;
  
  public Zk4(int paramInt) {
    this.ZZ = paramInt;
    this.ZF = new ArrayList<>();
    this.ZE = new TreeMap<>();
  }
  
  public Zk4 Zg(String paramString1, String paramString2) {
    this.ZE.put(paramString1, paramString2);
    return this;
  }
  
  public Zk4 Zj(Zn8 paramZn8) {
    this.ZF.add(paramZn8);
    return this;
  }
  
  public Zex ZI() {
    try {
      if (this.ZF.isEmpty())
        throw new IllegalStateException(a); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return new Zn0(this.ZZ, this.ZE, this.ZF);
  }
  
  public void Z_() {
    this.ZF.clear();
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #96
    //   2: ldc 'O(SnU` \\nAnSq7y'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zk4.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 104
    //   80: bipush #97
    //   82: goto -> 111
    //   85: bipush #39
    //   87: goto -> 111
    //   90: bipush #19
    //   92: goto -> 111
    //   95: bipush #25
    //   97: goto -> 111
    //   100: iconst_1
    //   101: goto -> 111
    //   104: bipush #125
    //   106: goto -> 111
    //   109: bipush #70
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zk4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */