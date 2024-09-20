package burp;

public class Zbwg implements Zxlu {
  private final Zrso Zk;
  
  private static final String a;
  
  public Zbwg(Zrso paramZrso) {
    this.Zk = paramZrso;
  }
  
  public Zsqx<Zrdb> Zr() {
    Zms4 zms4 = this.Zk.Zi();
    String str1 = zms4.ZA();
    String str2 = zms4.ZA();
    int[] arrayOfInt1 = zms4.ZH();
    int[] arrayOfInt2 = zms4.ZH();
    if (str1 == null || str2 == null || arrayOfInt1 == null || arrayOfInt2 == null)
      return null; 
    String str3 = str2;
    int i = arrayOfInt2[1];
    int j = arrayOfInt2[0];
    int k = arrayOfInt1[1];
    int m = arrayOfInt1[0];
    Zk2s zk2s = new Zk2s(str1 + str1 + "{" + m + "*" + k + a + j + "*" + i + "}", str1 + str1 + String.valueOf(arrayOfInt1[0] * arrayOfInt1[1]) + String.valueOf(arrayOfInt2[0] * arrayOfInt2[1]), (byte)1, (byte)3);
    return this.Zk.Zq(zk2s);
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: ldc 'SzoS\\n4bKo1U6zZ+8K'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbwg.a : Ljava/lang/String;
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
    //   80: bipush #36
    //   82: goto -> 111
    //   85: bipush #11
    //   87: goto -> 111
    //   90: bipush #79
    //   92: goto -> 111
    //   95: bipush #58
    //   97: goto -> 111
    //   100: bipush #111
    //   102: goto -> 111
    //   105: bipush #83
    //   107: goto -> 111
    //   110: iconst_5
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbwg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */