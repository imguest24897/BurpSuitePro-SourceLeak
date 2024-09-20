package burp;

public class Zb8z {
  private static String[] ZD;
  
  private static final String a;
  
  public static void ZQ(Zxei paramZxei) {
    Zl04 zl04 = paramZxei.ZF();
    Zt55 zt55 = new Zt55(a);
    Zl0e zl0e = new Zl0e(zl04);
    zl0e.setVisible(true);
    String[] arrayOfString = Zi();
    zt55.Zx(zl0e::lambda$showDiagnosticsFrame$0);
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  private static void lambda$showDiagnosticsFrame$0(Zl0e paramZl0e) {
    Ze_f.Z_().ZS(new Zx_p(paramZl0e));
  }
  
  public static void Zh(String[] paramArrayOfString) {
    ZD = paramArrayOfString;
  }
  
  public static String[] Zi() {
    return ZD;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zi : ()[Ljava/lang/String;
    //   3: ifnonnull -> 13
    //   6: iconst_1
    //   7: anewarray java/lang/String
    //   10: invokestatic Zh : ([Ljava/lang/String;)V
    //   13: bipush #115
    //   15: ldc 'UdGjTiSpLw\\nySd'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zb8z.a : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #10
    //   94: goto -> 124
    //   97: bipush #126
    //   99: goto -> 124
    //   102: bipush #73
    //   104: goto -> 124
    //   107: bipush #6
    //   109: goto -> 124
    //   112: bipush #100
    //   114: goto -> 124
    //   117: bipush #81
    //   119: goto -> 124
    //   122: bipush #107
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 21
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb8z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */