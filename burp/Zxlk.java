package burp;

import net.portswigger.browser.Zjq;

public class Zxlk {
  private final Zxs9 Zg;
  
  protected final Zjq Za;
  
  private static int Zz;
  
  private static final String a;
  
  Zxlk(Zxs9 paramZxs9) {
    this(paramZxs9, null);
  }
  
  Zxlk(Zxs9 paramZxs9, Zjq paramZjq) {
    this.Zg = paramZxs9;
    this.Za = paramZjq;
  }
  
  public Zrp0 ZN() {
    return this.Zg.ZXL();
  }
  
  public Zeu9 Zr() {
    return this.Zg.ZXh();
  }
  
  protected Zlru ZP() {
    return this.Zg.ZXa();
  }
  
  Zxs9 Zm() {
    return this.Zg;
  }
  
  public Zxlk ZA(Zjq paramZjq) {
    return new Zxlk(this.Zg, paramZjq);
  }
  
  boolean Zd() {
    return false;
  }
  
  public Zzl1 Za(Zthl paramZthl, Zzl1 paramZzl1, Zmgu paramZmgu, Zz3v paramZz3v) throws Zmnk, Zmn5 {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zg : Lburp/Zxs9;
    //   4: invokevirtual ZXL : ()Lburp/Zrp0;
    //   7: astore #6
    //   9: invokestatic Zg : ()I
    //   12: aload #6
    //   14: dup
    //   15: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   18: pop
    //   19: astore #8
    //   21: iconst_0
    //   22: istore #9
    //   24: istore #5
    //   26: aload #8
    //   28: iload #9
    //   30: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   35: lookupswitch default -> 96, 0 -> 60, 1 -> 79
    //   60: aload #8
    //   62: checkcast burp/Zl_
    //   65: astore #10
    //   67: aload_3
    //   68: aload_2
    //   69: aload #10
    //   71: invokeinterface ZA : (Lburp/Zzl1;Lburp/Zl_;)Lburp/Zg8y;
    //   76: goto -> 123
    //   79: aload #8
    //   81: checkcast burp/Zxss
    //   84: astore #11
    //   86: aload #11
    //   88: invokeinterface ZY : ()Lburp/Zlvj;
    //   93: goto -> 123
    //   96: new java/lang/IllegalArgumentException
    //   99: dup
    //   100: aload #6
    //   102: invokeinterface getClass : ()Ljava/lang/Class;
    //   107: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   110: getstatic burp/Zxlk.a : Ljava/lang/String;
    //   113: swap
    //   114: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   119: invokespecial <init> : (Ljava/lang/String;)V
    //   122: athrow
    //   123: astore #7
    //   125: aload_1
    //   126: aload #7
    //   128: aload #6
    //   130: aload_0
    //   131: getfield Zg : Lburp/Zxs9;
    //   134: invokevirtual ZXa : ()Lburp/Zlru;
    //   137: aload_2
    //   138: ifnonnull -> 149
    //   141: aconst_null
    //   142: goto -> 153
    //   145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   148: athrow
    //   149: aload_2
    //   150: invokevirtual Z_Q : ()Lburp/Zlit;
    //   153: aload #4
    //   155: aload_0
    //   156: getfield Za : Lnet/portswigger/browser/Zjq;
    //   159: invokevirtual ZT : (Lnet/portswigger/browser/Zjq;)Lburp/Zz3v;
    //   162: invokeinterface ZQ : (Lburp/Zg8y;Lburp/Zrp0;Lburp/Zlru;Lburp/Zlit;Lburp/Zz3v;)Lburp/Zzl1;
    //   167: iload #5
    //   169: ifeq -> 186
    //   172: iconst_3
    //   173: anewarray burp/Zbqc
    //   176: invokestatic Zr : ([Lburp/Zbqc;)V
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   185: athrow
    //   186: areturn
    // Exception table:
    //   from	to	target	type
    //   125	145	145	burp/Zmnk
    //   153	179	182	burp/Zmnk
  }
  
  public static void ZM(int paramInt) {
    Zz = paramInt;
  }
  
  public static int Zg() {
    return Zz;
  }
  
  public static int ZO() {
    int i = Zg();
    try {
      if (i == 0)
        return 83; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zg : ()I
    //   3: ifeq -> 11
    //   6: bipush #80
    //   8: invokestatic ZM : (I)V
    //   11: bipush #73
    //   13: ldc 'cM6`>0RDW qn%E_Wea70X\\f'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zxlk.a : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #127
    //   94: goto -> 124
    //   97: bipush #106
    //   99: goto -> 124
    //   102: bipush #12
    //   104: goto -> 124
    //   107: bipush #92
    //   109: goto -> 124
    //   112: bipush #7
    //   114: goto -> 124
    //   117: bipush #9
    //   119: goto -> 124
    //   122: bipush #116
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 43
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
    //   163: goto -> 19
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxlk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */