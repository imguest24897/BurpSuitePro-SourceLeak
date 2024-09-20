package burp;

class Zx0z {
  private final Zzkr ZG;
  
  private final Zz4b ZH;
  
  private final Ztg8 ZJ;
  
  private static final String a;
  
  Zx0z(Zzkr paramZzkr, Zz4b paramZz4b, Ztg8 paramZtg8) {
    this.ZG = paramZzkr;
    this.ZH = paramZz4b;
    this.ZJ = paramZtg8;
  }
  
  Ztor Zr(Zefg<Ztic> paramZefg) {
    // Byte code:
    //   0: new burp/Ztor
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZK : ()Ljava/lang/String;
    //   11: aload_1
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore #4
    //   19: astore_2
    //   20: aload #4
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 259
    //   30: aload #4
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast burp/Ztic
    //   40: astore #5
    //   42: aload_0
    //   43: getfield ZH : Lburp/Zz4b;
    //   46: invokeinterface ZVq : ()Lburp/Zefg;
    //   51: astore #6
    //   53: iconst_0
    //   54: istore #7
    //   56: iconst_0
    //   57: istore #8
    //   59: aload #6
    //   61: invokeinterface iterator : ()Ljava/util/Iterator;
    //   66: astore #9
    //   68: aload #9
    //   70: invokeinterface hasNext : ()Z
    //   75: ifeq -> 154
    //   78: aload #9
    //   80: invokeinterface next : ()Ljava/lang/Object;
    //   85: checkcast burp/Ztic
    //   88: astore #10
    //   90: aload #10
    //   92: aload #5
    //   94: invokeinterface equals : (Ljava/lang/Object;)Z
    //   99: ifeq -> 127
    //   102: iconst_1
    //   103: istore #7
    //   105: aload_3
    //   106: aload #5
    //   108: invokeinterface ZrT : ()I
    //   113: aload #10
    //   115: invokeinterface ZrT : ()I
    //   120: invokevirtual Zg : (II)V
    //   123: aload_2
    //   124: ifnonnull -> 150
    //   127: aload #10
    //   129: invokeinterface ZrL : ()Ljava/lang/String;
    //   134: aload #5
    //   136: invokeinterface ZrL : ()Ljava/lang/String;
    //   141: invokevirtual equals : (Ljava/lang/Object;)Z
    //   144: ifeq -> 150
    //   147: iconst_1
    //   148: istore #8
    //   150: aload_2
    //   151: ifnonnull -> 68
    //   154: iload #7
    //   156: ifne -> 255
    //   159: aload_0
    //   160: getfield ZJ : Lburp/Ztg8;
    //   163: aload #5
    //   165: invokeinterface Zw : (Lburp/Zgpi;)Lburp/Zgpi;
    //   170: checkcast burp/Ztic
    //   173: astore #9
    //   175: aload #9
    //   177: invokeinterface Zrz : ()V
    //   182: iload #8
    //   184: ifeq -> 205
    //   187: aload #9
    //   189: aload_0
    //   190: aload #9
    //   192: invokeinterface ZrL : ()Ljava/lang/String;
    //   197: invokevirtual ZH : (Ljava/lang/String;)Ljava/lang/String;
    //   200: invokeinterface Zr : (Ljava/lang/String;)V
    //   205: new burp/Ztau
    //   208: dup
    //   209: aload #9
    //   211: invokestatic ZP : (Lburp/Ztic;)Lburp/Ztwh;
    //   214: invokespecial <init> : (Lburp/Ztwh;)V
    //   217: astore #10
    //   219: aload_0
    //   220: getfield ZG : Lburp/Zzkr;
    //   223: aload #10
    //   225: new burp/Zs3t
    //   228: dup
    //   229: aload #10
    //   231: invokespecial <init> : (Ljava/util/function/Supplier;)V
    //   234: invokevirtual Ze : (Lburp/Ztau;Lburp/Zs3t;)Lburp/Zr5_;
    //   237: astore #11
    //   239: aload_3
    //   240: aload #5
    //   242: invokeinterface ZrT : ()I
    //   247: aload #11
    //   249: invokevirtual Z_ : ()I
    //   252: invokevirtual Zg : (II)V
    //   255: aload_2
    //   256: ifnonnull -> 20
    //   259: aload_3
    //   260: areturn
  }
  
  private String ZH(String paramString) {
    String str = a;
    byte b = 0;
    while (ZO(String.format(str, new Object[] { paramString, Integer.valueOf(++b) })));
    return String.format(str, new Object[] { paramString, Integer.valueOf(b) });
  }
  
  private boolean ZO(String paramString) {
    String str = Zbhz.ZK();
    for (Zr5_ zr5_ : this.ZG.Zk()) {
      if (zr5_.Zu().equals(paramString))
        return true; 
      if (str == null)
        break; 
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #42
    //   2: ldc 'y?'>r?'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zx0z.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 99, 5 -> 104
    //   80: bipush #118
    //   82: goto -> 111
    //   85: bipush #102
    //   87: goto -> 111
    //   90: bipush #45
    //   92: goto -> 111
    //   95: iconst_1
    //   96: goto -> 111
    //   99: bipush #49
    //   101: goto -> 111
    //   104: bipush #60
    //   106: goto -> 111
    //   109: bipush #60
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx0z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */