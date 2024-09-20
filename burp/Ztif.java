package burp;

import java.util.Objects;

public class Ztif implements Zl67 {
  private final Ztj1 ZQ;
  
  private final Ze9i ZO;
  
  private final Zrfd Zi;
  
  private final Zr_4 Zb;
  
  private final Zr_4 Zs;
  
  private Zev2 ZY;
  
  private static final String a;
  
  public Ztif(Ztj1 paramZtj1, Ze9i paramZe9i, Zrfd paramZrfd, Zr_4 paramZr_41, Zr_4 paramZr_42) {
    this.ZQ = paramZtj1;
    this.ZO = paramZe9i;
    this.Zi = paramZrfd;
    this.Zb = paramZr_41;
    this.Zs = paramZr_42;
  }
  
  public void ZC(Zev2 paramZev2) {
    this.ZY = paramZev2;
  }
  
  public void Z_(Zk14 paramZk14) {
    // Byte code:
    //   0: aload_1
    //   1: getstatic burp/Zkcl.LIVE_PASSIVE_CRAWL : Lburp/Zkcl;
    //   4: invokevirtual Zs : (Lburp/Zkcl;)V
    //   7: aload_0
    //   8: getfield ZO : Lburp/Ze9i;
    //   11: invokeinterface ZPW : ()Ljava/util/EnumSet;
    //   16: astore_3
    //   17: invokestatic ZD : ()I
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
    //   54: getstatic burp/Zglc.ZD : [I
    //   57: aload_0
    //   58: getfield ZO : Lburp/Ze9i;
    //   61: invokeinterface ZGk : ()Lburp/Zmet;
    //   66: invokevirtual ordinal : ()I
    //   69: iaload
    //   70: tableswitch default -> 176, 1 -> 96, 2 -> 104, 3 -> 112
    //   96: aload_1
    //   97: invokevirtual ZSX : ()V
    //   100: iload_2
    //   101: ifeq -> 176
    //   104: aload_1
    //   105: invokevirtual ZSd : ()V
    //   108: iload_2
    //   109: ifeq -> 176
    //   112: new burp/Zzkm
    //   115: dup
    //   116: invokespecial <init> : ()V
    //   119: astore #4
    //   121: new burp/Zlor
    //   124: dup
    //   125: aload_0
    //   126: getfield ZO : Lburp/Ze9i;
    //   129: invokeinterface ZGY : ()Lburp/Zl34;
    //   134: aload_0
    //   135: getfield ZO : Lburp/Ze9i;
    //   138: invokeinterface ZGp : ()Lburp/Zl34;
    //   143: aload_0
    //   144: getfield Zb : Lburp/Zr_4;
    //   147: aload_0
    //   148: getfield Zs : Lburp/Zr_4;
    //   151: aconst_null
    //   152: invokespecial <init> : (Lburp/Zl34;Lburp/Zl34;Lburp/Zr_4;Lburp/Zr_4;Lburp/Zr1j;)V
    //   155: aload #4
    //   157: getstatic burp/Ztif.a : Ljava/lang/String;
    //   160: invokevirtual Zf : (Lburp/Zg4j;Ljava/lang/String;)V
    //   163: aload_1
    //   164: invokevirtual ZSW : ()V
    //   167: aload_1
    //   168: aload #4
    //   170: invokevirtual Zl : (Lburp/Zmf_;)V
    //   173: goto -> 176
    //   176: aload_1
    //   177: aload_0
    //   178: getfield ZO : Lburp/Ze9i;
    //   181: invokeinterface ZPG : ()Z
    //   186: invokevirtual Zo : (Z)V
    //   189: new burp/Zzkm
    //   192: dup
    //   193: invokespecial <init> : ()V
    //   196: astore #4
    //   198: aload_0
    //   199: getfield ZO : Lburp/Ze9i;
    //   202: invokeinterface Zno : ()Lburp/Zs98;
    //   207: invokeinterface ZCE : ()Lburp/Zqu;
    //   212: aload #4
    //   214: invokeinterface Zl : (Lburp/Zg4j;)V
    //   219: aload_1
    //   220: new burp/Zb8e
    //   223: dup
    //   224: aload #4
    //   226: iconst_1
    //   227: anewarray burp/Zmln
    //   230: dup
    //   231: iconst_0
    //   232: getstatic burp/Zmln.LIVE_PASSIVE_CRAWLING : Lburp/Zmln;
    //   235: aastore
    //   236: invokespecial <init> : (Lburp/Zmf_;[Lburp/Zmln;)V
    //   239: invokevirtual Zx : (Lburp/Zkbn;)V
    //   242: aload_1
    //   243: aload_0
    //   244: getfield ZO : Lburp/Ze9i;
    //   247: invokeinterface ZPm : ()I
    //   252: invokevirtual Zw : (I)V
    //   255: invokestatic Zwu : ()[Lburp/Zbqc;
    //   258: ifnonnull -> 268
    //   261: iinc #2, 1
    //   264: iload_2
    //   265: invokestatic Zs : (I)V
    //   268: return
  }
  
  public void Zp() {
    this.ZY.ZR();
    this.ZY.ZN();
  }
  
  public void ZL(Zru5 paramZru5) {
    this.ZO.Zou(Zkcl.LIVE_PASSIVE_CRAWL.ZN(paramZru5));
    Zu(paramZru5.ZA);
    if (paramZru5.Zf != null)
      Zz(paramZru5.Zf); 
    ZX(paramZru5.ZM);
    this.ZQ.Zw();
  }
  
  private void Zu(Zgin paramZgin) {
    this.ZO.ZKn(paramZgin.ZZ);
    this.ZO.ZKH(paramZgin.Zp);
    this.ZO.ZKG(paramZgin.ZQ);
    this.ZO.ZK8(paramZgin.Zm);
    this.ZO.ZF(paramZgin.ZI);
    int i = Zmet.ZN();
    if (paramZgin.ZI == Zmet.CUSTOM) {
      paramZgin.Zr(this.ZO.ZGY(), this.ZO.ZGp(), this.Zs);
      if (i == 0) {
        paramZgin.ZQ(this.ZO.ZGY(), this.ZO.ZGp());
        return;
      } 
      return;
    } 
    paramZgin.ZQ(this.ZO.ZGY(), this.ZO.ZGp());
  }
  
  private void Zz(Zgyw paramZgyw) {
    Zqu zqu = this.ZO.Zno().ZCE();
    Objects.requireNonNull(zqu);
    paramZgyw.ZU.stream().map(Zkbn::ZR).forEach(zqu::Zd);
    this.ZO.Zod(Zkiv.ZT(paramZgyw.ZU));
  }
  
  private void ZX(Zb2y paramZb2y) {
    this.ZQ.Zz(this.Zi.Zb(paramZb2y));
  }
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: ldc 'nLH\\f'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztif.a : Ljava/lang/String;
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
    //   80: bipush #97
    //   82: goto -> 112
    //   85: bipush #26
    //   87: goto -> 112
    //   90: bipush #52
    //   92: goto -> 112
    //   95: bipush #47
    //   97: goto -> 112
    //   100: bipush #126
    //   102: goto -> 112
    //   105: bipush #102
    //   107: goto -> 112
    //   110: bipush #34
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztif.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */