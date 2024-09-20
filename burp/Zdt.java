package burp;

import java.util.Objects;

public class Zdt implements Zl67 {
  private final Ztj1 Zc;
  
  private final Ztr3 ZS;
  
  private final Zrfd ZI;
  
  private final Zr_4 ZO;
  
  private final Zr_4 Zp;
  
  private Zev2 Zh;
  
  private static final String a;
  
  public Zdt(Ztj1 paramZtj1, Ztr3 paramZtr3, Zrfd paramZrfd, Zr_4 paramZr_41, Zr_4 paramZr_42) {
    this.Zc = paramZtj1;
    this.ZS = paramZtr3;
    this.ZI = paramZrfd;
    this.ZO = paramZr_41;
    this.Zp = paramZr_42;
  }
  
  public void ZC(Zev2 paramZev2) {
    this.Zh = paramZev2;
  }
  
  public void Z_(Zk14 paramZk14) {
    // Byte code:
    //   0: aload_1
    //   1: getstatic burp/Zkcl.LIVE_AUDIT : Lburp/Zkcl;
    //   4: invokevirtual Zs : (Lburp/Zkcl;)V
    //   7: aload_0
    //   8: getfield ZS : Lburp/Ztr3;
    //   11: invokeinterface ZPW : ()Ljava/util/EnumSet;
    //   16: astore_3
    //   17: invokestatic ZN : ()I
    //   20: aload_1
    //   21: aload_3
    //   22: getstatic burp/Zmup.PROXY : Lburp/Zmup;
    //   25: invokevirtual contains : (Ljava/lang/Object;)Z
    //   28: invokevirtual Zp : (Z)V
    //   31: aload_1
    //   32: aload_3
    //   33: getstatic burp/Zmup.REPEATER : Lburp/Zmup;
    //   36: invokevirtual contains : (Ljava/lang/Object;)Z
    //   39: invokevirtual ZL : (Z)V
    //   42: istore_2
    //   43: aload_1
    //   44: aload_3
    //   45: getstatic burp/Zmup.INTRUDER : Lburp/Zmup;
    //   48: invokevirtual contains : (Ljava/lang/Object;)Z
    //   51: invokevirtual Zm : (Z)V
    //   54: getstatic burp/Zq6.ZQ : [I
    //   57: aload_0
    //   58: getfield ZS : Lburp/Ztr3;
    //   61: invokeinterface ZGk : ()Lburp/Zmet;
    //   66: invokevirtual ordinal : ()I
    //   69: iaload
    //   70: tableswitch default -> 176, 1 -> 96, 2 -> 104, 3 -> 112
    //   96: aload_1
    //   97: invokevirtual ZSX : ()V
    //   100: iload_2
    //   101: ifne -> 176
    //   104: aload_1
    //   105: invokevirtual ZSd : ()V
    //   108: iload_2
    //   109: ifne -> 176
    //   112: new burp/Zzkm
    //   115: dup
    //   116: invokespecial <init> : ()V
    //   119: astore #4
    //   121: new burp/Zlor
    //   124: dup
    //   125: aload_0
    //   126: getfield ZS : Lburp/Ztr3;
    //   129: invokeinterface ZGY : ()Lburp/Zl34;
    //   134: aload_0
    //   135: getfield ZS : Lburp/Ztr3;
    //   138: invokeinterface ZGp : ()Lburp/Zl34;
    //   143: aload_0
    //   144: getfield ZO : Lburp/Zr_4;
    //   147: aload_0
    //   148: getfield Zp : Lburp/Zr_4;
    //   151: aconst_null
    //   152: invokespecial <init> : (Lburp/Zl34;Lburp/Zl34;Lburp/Zr_4;Lburp/Zr_4;Lburp/Zr1j;)V
    //   155: aload #4
    //   157: getstatic burp/Zdt.a : Ljava/lang/String;
    //   160: invokevirtual Zf : (Lburp/Zg4j;Ljava/lang/String;)V
    //   163: aload_1
    //   164: invokevirtual ZSW : ()V
    //   167: aload_1
    //   168: aload #4
    //   170: invokevirtual Zl : (Lburp/Zmf_;)V
    //   173: goto -> 176
    //   176: aload_1
    //   177: aload_0
    //   178: getfield ZS : Lburp/Ztr3;
    //   181: invokeinterface ZPG : ()Z
    //   186: invokevirtual Zo : (Z)V
    //   189: new burp/Zzkm
    //   192: dup
    //   193: invokespecial <init> : ()V
    //   196: astore #4
    //   198: aload_0
    //   199: getfield ZS : Lburp/Ztr3;
    //   202: invokeinterface Zdm : ()Lburp/Zz1i;
    //   207: invokestatic Zh : (Lburp/Zz1i;)Lburp/Zx_7;
    //   210: aload #4
    //   212: invokevirtual Zl : (Lburp/Zg4j;)V
    //   215: aload_1
    //   216: new burp/Zb8e
    //   219: dup
    //   220: aload #4
    //   222: iconst_1
    //   223: anewarray burp/Zmln
    //   226: dup
    //   227: iconst_0
    //   228: getstatic burp/Zmln.AUDITING : Lburp/Zmln;
    //   231: aastore
    //   232: invokespecial <init> : (Lburp/Zmf_;[Lburp/Zmln;)V
    //   235: invokevirtual Zx : (Lburp/Zkbn;)V
    //   238: aload_1
    //   239: aload_0
    //   240: getfield ZS : Lburp/Ztr3;
    //   243: invokeinterface ZPm : ()I
    //   248: invokevirtual Zw : (I)V
    //   251: return
  }
  
  public void Zp() {
    this.Zh.Z_();
    this.Zh.ZN();
  }
  
  public void ZL(Zru5 paramZru5) {
    this.ZS.Zou(Zkcl.LIVE_AUDIT.ZN(paramZru5));
    Zz(paramZru5.ZA);
    if (paramZru5.Zf != null)
      Zh(paramZru5.Zf); 
    Zj(paramZru5.ZM);
    this.Zc.Zw();
  }
  
  private void Zz(Zgin paramZgin) {
    this.ZS.ZKn(paramZgin.ZZ);
    this.ZS.ZKH(paramZgin.Zp);
    this.ZS.ZKG(paramZgin.ZQ);
    int i = Zmet.ZD();
    this.ZS.ZK8(paramZgin.Zm);
    Zmet zmet = paramZgin.ZI;
    this.ZS.ZF(zmet);
    if (zmet == Zmet.CUSTOM) {
      paramZgin.Zr(this.ZS.ZGY(), this.ZS.ZGp(), this.Zp);
      if (i != 0) {
        paramZgin.ZQ(this.ZS.ZGY(), this.ZS.ZGp());
        return;
      } 
      return;
    } 
    paramZgin.ZQ(this.ZS.ZGY(), this.ZS.ZGp());
  }
  
  private void Zh(Zgyw paramZgyw) {
    Zx_7 zx_7 = Zx_7.Zh(this.ZS.Zdm());
    Objects.requireNonNull(zx_7);
    paramZgyw.ZU.stream().map(Zkbn::ZR).forEach(zx_7::Zd);
    this.ZS.Zod(Zkiv.ZT(paramZgyw.ZU));
  }
  
  private void Zj(Zb2y paramZb2y) {
    this.Zc.Zz(this.ZI.Zb(paramZb2y));
  }
  
  static {
    // Byte code:
    //   0: iconst_1
    //   1: ldc 'XdYJu'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zdt.a : Ljava/lang/String;
    //   10: goto -> 154
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 128
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #42
    //   82: goto -> 112
    //   85: bipush #6
    //   87: goto -> 112
    //   90: bipush #55
    //   92: goto -> 112
    //   95: bipush #59
    //   97: goto -> 112
    //   100: bipush #17
    //   102: goto -> 112
    //   105: bipush #116
    //   107: goto -> 112
    //   110: bipush #78
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 34
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 31
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
    //   151: goto -> 7
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zdt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */