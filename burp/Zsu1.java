package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zsu1 {
  private static final byte[] Zf = new byte[] { 60, 63 };
  
  private static final byte[] ZA = new byte[] { 60, 63, 120, 109, 108 };
  
  private static final byte[] ZG = new byte[] { 60, 63, 105, 109, 112, 111, 114, 116 };
  
  private static final byte[] ZM = new byte[] { 60, 37, 64 };
  
  private static final byte[] Zi = new byte[] { 60, 106, 115, 112, 58 };
  
  private static final byte[] Zk = new byte[] { 60, 37 };
  
  private static final byte[] Zc = new byte[] { 63, 62 };
  
  private static final byte[] ZX = new byte[] { 37, 62 };
  
  private static final Zrpi<Integer> ZF = Zd();
  
  private final Ze3n ZS;
  
  private static final Zzrd Zr = Zzrd.ZJ(Zc, false, false);
  
  private static final Zzrd Zj = Zzrd.ZJ(ZX, false, false);
  
  Zsu1(Ze3n paramZe3n) {
    this.ZS = paramZe3n;
  }
  
  Ztk8 ZD(int paramInt) {
    // Byte code:
    //   0: invokestatic ZZ : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZS : Lburp/Ze3n;
    //   8: invokevirtual Zp : ()Lburp/Zs68;
    //   11: getfield ZH : Lburp/Zk8m;
    //   14: getfield ZJ : S
    //   17: invokestatic Zu : (S)Z
    //   20: ifne -> 46
    //   23: aload_0
    //   24: getfield ZS : Lburp/Ze3n;
    //   27: invokevirtual Zp : ()Lburp/Zs68;
    //   30: getfield ZH : Lburp/Zk8m;
    //   33: getfield Zj : S
    //   36: invokestatic Zu : (S)Z
    //   39: ifne -> 46
    //   42: invokestatic ZD : ()Lburp/Ztk8;
    //   45: areturn
    //   46: new java/util/ArrayList
    //   49: dup
    //   50: invokespecial <init> : ()V
    //   53: astore_3
    //   54: iconst_0
    //   55: istore #4
    //   57: iconst_0
    //   58: istore #6
    //   60: iload #4
    //   62: iload_1
    //   63: if_icmpge -> 211
    //   66: aload_0
    //   67: getfield ZS : Lburp/Ze3n;
    //   70: invokevirtual ZL : ()Lburp/Zb6q;
    //   73: invokeinterface Za : ()Lburp/Zstu;
    //   78: bipush #60
    //   80: iload #4
    //   82: iload_1
    //   83: invokestatic ZT : (Lburp/Zstu;BII)I
    //   86: istore #4
    //   88: aload_0
    //   89: iload #4
    //   91: iload_1
    //   92: invokevirtual Zh : (II)Z
    //   95: ifeq -> 101
    //   98: goto -> 211
    //   101: aload_0
    //   102: iload #4
    //   104: invokevirtual ZO : (I)I
    //   107: istore #7
    //   109: iload #7
    //   111: ifne -> 121
    //   114: iinc #4, 1
    //   117: iload_2
    //   118: ifeq -> 60
    //   121: aload_0
    //   122: iload #7
    //   124: iload #4
    //   126: iload_1
    //   127: invokevirtual ZH : (III)Z
    //   130: ifne -> 140
    //   133: iinc #4, 1
    //   136: iload_2
    //   137: ifeq -> 60
    //   140: aload_0
    //   141: iload #7
    //   143: iload #4
    //   145: iload_1
    //   146: invokevirtual Zu : (III)I
    //   149: istore #5
    //   151: iconst_m1
    //   152: iload #5
    //   154: if_icmpne -> 164
    //   157: iinc #4, 1
    //   160: iload_2
    //   161: ifeq -> 60
    //   164: aload_0
    //   165: iload #4
    //   167: iload #5
    //   169: invokevirtual Ze : (II)Z
    //   172: ifeq -> 182
    //   175: iinc #4, 1
    //   178: iload_2
    //   179: ifeq -> 60
    //   182: aload_3
    //   183: iload #4
    //   185: iload #5
    //   187: invokestatic Zj : (II)Lburp/Zl1r;
    //   190: invokeinterface add : (Ljava/lang/Object;)Z
    //   195: pop
    //   196: iload #6
    //   198: iload #7
    //   200: ior
    //   201: istore #6
    //   203: iload #5
    //   205: istore #4
    //   207: iload_2
    //   208: ifeq -> 60
    //   211: aload_3
    //   212: invokeinterface isEmpty : ()Z
    //   217: ifne -> 258
    //   220: aload_0
    //   221: getfield ZS : Lburp/Ze3n;
    //   224: astore #7
    //   226: aload #7
    //   228: invokevirtual Zt : ()Lburp/Zvow;
    //   231: aload_3
    //   232: invokevirtual Z_ : (Ljava/util/Collection;)Lburp/Zvow;
    //   235: astore #8
    //   237: aload #7
    //   239: invokevirtual Za : ()Lburp/Zmzk;
    //   242: aload #7
    //   244: invokevirtual ZN : ()Ljava/lang/String;
    //   247: aload #8
    //   249: iload #6
    //   251: invokestatic Zh : (Lburp/Zmzk;Ljava/lang/String;Lburp/Zvow;I)Lburp/Zsqx;
    //   254: invokestatic ZY : (Lburp/Zsqx;)Lburp/Ztk8;
    //   257: areturn
    //   258: invokestatic ZD : ()Lburp/Ztk8;
    //   261: areturn
  }
  
  private boolean ZH(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt2 + ZK(paramInt1);
    int j = Zlt_.Zz(this.ZS.ZL().Za(), i, paramInt3);
    if (j >= paramInt3)
      return false; 
    byte b = this.ZS.ZL().Za().Zp(j);
    return (Zsw8.Zk(b) || b == 36);
  }
  
  private boolean Zh(int paramInt1, int paramInt2) {
    return (paramInt1 == -1 || paramInt1 + 1 >= paramInt2);
  }
  
  private int ZO(int paramInt) {
    return ((Integer)ZF.Zo(this.ZS.ZL().Za(), paramInt).orElse(Integer.valueOf(0))).intValue();
  }
  
  private int Zu(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt1 == 1) ? Zq(paramInt2, paramInt3) : ((paramInt1 == 8 || paramInt1 == 2) ? ZL(paramInt2, paramInt3) : ((paramInt1 == 4) ? ZT(paramInt2, paramInt3) : -1));
  }
  
  private int ZK(int paramInt) {
    switch (paramInt) {
      case 8:
      
      case 4:
      
      case 2:
      
      case 1:
      
    } 
    Zuh.Zb(false, Zqf.Zk);
    return Zk.length;
  }
  
  private int Zq(int paramInt1, int paramInt2) {
    int i = Zr.Zi(this.ZS.ZL().Za(), paramInt1 + 3, paramInt2).ZR();
    return (i > -1) ? (i + 2) : -1;
  }
  
  private int ZL(int paramInt1, int paramInt2) {
    int i = Zj.Zi(this.ZS.ZL().Za(), paramInt1 + 3, paramInt2).ZR();
    return (i > -1) ? (i + 2) : -1;
  }
  
  private int ZT(int paramInt1, int paramInt2) {
    int i = Zlt_.ZT(this.ZS.ZL().Za(), (byte)62, paramInt1 + 5, paramInt2);
    return (i > -1) ? (i + 1) : -1;
  }
  
  private boolean Ze(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: invokestatic ZZ : ()I
    //   6: iload_1
    //   7: iconst_4
    //   8: iadd
    //   9: istore #5
    //   11: istore_3
    //   12: iload #5
    //   14: iload_2
    //   15: if_icmpge -> 57
    //   18: aload_0
    //   19: getfield ZS : Lburp/Ze3n;
    //   22: invokevirtual ZL : ()Lburp/Zb6q;
    //   25: invokeinterface Za : ()Lburp/Zstu;
    //   30: iload #5
    //   32: invokeinterface Zp : (I)B
    //   37: invokestatic isLetter : (I)Z
    //   40: ifeq -> 50
    //   43: iconst_1
    //   44: istore #4
    //   46: iload_3
    //   47: ifeq -> 57
    //   50: iinc #5, 1
    //   53: iload_3
    //   54: ifeq -> 12
    //   57: iload #4
    //   59: ifne -> 66
    //   62: iconst_1
    //   63: goto -> 67
    //   66: iconst_0
    //   67: ireturn
  }
  
  private static Zrpi<Integer> Zd() {
    Zrpi<Integer> zrpi = new Zrpi(false);
    zrpi.ZG(Zf, Integer.valueOf(1));
    zrpi.ZG(ZA, Integer.valueOf(0));
    zrpi.ZG(ZG, Integer.valueOf(0));
    zrpi.ZG(ZM, Integer.valueOf(2));
    zrpi.ZG(Zi, Integer.valueOf(4));
    zrpi.ZG(Zk, Integer.valueOf(8));
    return zrpi;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsu1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */