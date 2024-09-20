package burp;

import java.util.List;
import java.util.function.Predicate;

class Zb8w implements Zeot {
  private final Zbnt Zr;
  
  private final Zr_4 ZQ;
  
  private final Runnable Zp;
  
  private final Ztdi ZC;
  
  private static final String a;
  
  Zb8w(Zlnu paramZlnu, Zbnt paramZbnt, Zr_4 paramZr_4, Runnable paramRunnable) {
    this.ZC = paramZlnu;
    this.Zr = paramZbnt;
    this.ZQ = paramZr_4;
    this.Zp = paramRunnable;
  }
  
  public Ztdi ZZ() {
    return this.ZC;
  }
  
  public void Zo(Zbx0 paramZbx0, Zez3[] paramArrayOfZez3) {
    this.ZC.Zf(paramZbx0, paramArrayOfZez3);
  }
  
  public List<Zmfj> Zn(Predicate<Zez3> paramPredicate) {
    return this.ZC.Zu(paramPredicate);
  }
  
  public void Zj(Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2, String paramString1, String paramString2) {
    // Byte code:
    //   0: invokestatic ZA : ()[Ljava/lang/String;
    //   3: astore #6
    //   5: aload_1
    //   6: aload_2
    //   7: iconst_1
    //   8: aload_0
    //   9: getfield Zr : Lburp/Zbnt;
    //   12: invokestatic ZY : (Lburp/Zmzk;Lburp/Zstu;BLburp/Zbnt;)Lburp/Zz1p;
    //   15: astore #7
    //   17: aconst_null
    //   18: astore #8
    //   20: aload_3
    //   21: ifnull -> 39
    //   24: aload #7
    //   26: aload_3
    //   27: getstatic burp/Zt0k.HTML_HEAD_ANALYSIS : Lburp/Zt0k;
    //   30: aload_0
    //   31: getfield Zr : Lburp/Zbnt;
    //   34: invokestatic ZS : (Lburp/Zz1p;Lburp/Zstu;Lburp/Zt0k;Lburp/Zbnt;)Lburp/Zs68;
    //   37: astore #8
    //   39: getstatic burp/Zb8w.a : Ljava/lang/String;
    //   42: aload #7
    //   44: getfield Zb : Ljava/lang/String;
    //   47: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   50: ifeq -> 81
    //   53: aload_0
    //   54: getfield ZC : Lburp/Ztdi;
    //   57: aload #7
    //   59: getfield Zo : Lburp/Zlit;
    //   62: aload_2
    //   63: aload #7
    //   65: invokevirtual ZO : ()I
    //   68: iconst_0
    //   69: invokeinterface ZP : (Lburp/Zlit;Lburp/Zstu;IS)Lburp/Zez3;
    //   74: astore #9
    //   76: aload #6
    //   78: ifnull -> 98
    //   81: aload_0
    //   82: getfield ZC : Lburp/Ztdi;
    //   85: aload #7
    //   87: getfield Zo : Lburp/Zlit;
    //   90: iconst_0
    //   91: invokeinterface Zq : (Lburp/Zlit;S)Lburp/Zez3;
    //   96: astore #9
    //   98: new burp/Zsir
    //   101: dup
    //   102: invokespecial <init> : ()V
    //   105: aload_2
    //   106: aload_0
    //   107: getfield ZQ : Lburp/Zr_4;
    //   110: invokeinterface Zp : (Lburp/Zr_4;)Lburp/Zstu;
    //   115: aload #7
    //   117: getfield Zb : Ljava/lang/String;
    //   120: invokevirtual Zp : (Lburp/Zstu;Ljava/lang/String;)Lburp/Zsir;
    //   123: astore #10
    //   125: iconst_0
    //   126: istore #11
    //   128: aload_3
    //   129: ifnull -> 178
    //   132: aload #10
    //   134: aload_3
    //   135: aload_0
    //   136: getfield ZQ : Lburp/Zr_4;
    //   139: invokeinterface Zp : (Lburp/Zr_4;)Lburp/Zstu;
    //   144: aload_3
    //   145: invokeinterface Zpu : ()I
    //   150: aload #8
    //   152: getfield Zb : S
    //   155: aload #8
    //   157: getfield ZH : Lburp/Zk8m;
    //   160: getfield Zj : S
    //   163: aload #8
    //   165: invokestatic ZO : (Lburp/Zs68;)Ljava/lang/String;
    //   168: invokestatic currentTimeMillis : ()J
    //   171: invokevirtual ZV : (Lburp/Zstu;ISSLjava/lang/String;J)Lburp/Zsir;
    //   174: pop
    //   175: iconst_2
    //   176: istore #11
    //   178: aload #10
    //   180: iload #11
    //   182: iconst_0
    //   183: invokevirtual ZZ : (BB)Lburp/Zsir;
    //   186: aload #9
    //   188: invokevirtual Zd : (Lburp/Zez3;)V
    //   191: iconst_0
    //   192: istore #12
    //   194: aload #5
    //   196: invokestatic ZN : (Ljava/lang/String;)B
    //   199: istore #12
    //   201: goto -> 214
    //   204: astore #13
    //   206: aload #13
    //   208: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   211: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   214: new burp/Zl1f
    //   217: dup
    //   218: aload #9
    //   220: invokespecial <init> : (Lburp/Zez3;)V
    //   223: invokevirtual ZK : ()Lburp/Zrss;
    //   226: astore #13
    //   228: aload #13
    //   230: aload #4
    //   232: invokeinterface ZWK : (Ljava/lang/String;)V
    //   237: aload #13
    //   239: iload #12
    //   241: invokeinterface ZV : (B)V
    //   246: aload_0
    //   247: getfield ZC : Lburp/Ztdi;
    //   250: aload #9
    //   252: invokeinterface ZR : (Lburp/Zez3;)V
    //   257: aload_0
    //   258: getfield Zp : Ljava/lang/Runnable;
    //   261: invokeinterface run : ()V
    //   266: goto -> 279
    //   269: astore #7
    //   271: aload #7
    //   273: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   276: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   279: return
    // Exception table:
    //   from	to	target	type
    //   5	266	269	java/lang/Exception
    //   194	201	204	java/lang/IllegalArgumentException
  }
  
  static {
    // Byte code:
    //   0: bipush #33
    //   2: ldc '>peb'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zb8w.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #79
    //   82: goto -> 111
    //   85: bipush #30
    //   87: goto -> 111
    //   90: bipush #23
    //   92: goto -> 111
    //   95: bipush #23
    //   97: goto -> 111
    //   100: bipush #55
    //   102: goto -> 111
    //   105: iconst_1
    //   106: goto -> 111
    //   109: bipush #51
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb8w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */