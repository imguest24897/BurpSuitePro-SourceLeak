package burp;

public class Zb2b implements Zz1_ {
  private final Zz1_ ZS;
  
  private final Ze3n Zo;
  
  private final Zmhe Zr;
  
  private final Zbjl Zm;
  
  private final Zz5i ZG;
  
  private final Zew0 ZC;
  
  private final Zkl6 ZN;
  
  private final Zewn Zq;
  
  public Zb2b(Ze3n paramZe3n, Zmhe paramZmhe, Zbjl paramZbjl, Zz5i paramZz5i, Zer0 paramZer0, byte[] paramArrayOfbyte, Zew0 paramZew0, Zkl6 paramZkl6) {
    this.Zo = paramZe3n;
    this.Zr = paramZmhe;
    this.Zm = paramZbjl;
    this.ZG = paramZz5i;
    this.ZC = paramZew0;
    int i = Zz1f.Zz();
    this.ZN = paramZkl6;
    this.ZS = new Zr5u(paramZkl6.ZB(), paramZe3n, paramZer0, paramArrayOfbyte, paramZew0);
    this.Zq = paramZz5i.Za(paramZew0.ZG()) ? paramZz5i.Zp(paramZew0.ZG()) : null;
    if (i == 0)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Zbll Z_() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZG : Lburp/Zz5i;
    //   4: aload_0
    //   5: getfield ZC : Lburp/Zew0;
    //   8: invokevirtual ZG : ()Lburp/Zlp9;
    //   11: invokevirtual Za : (Lburp/Zlp9;)Z
    //   14: ifeq -> 156
    //   17: aload_0
    //   18: getfield Zq : Lburp/Zewn;
    //   21: aconst_null
    //   22: invokevirtual Zu : (Lburp/Zxs7;)Lburp/Zs2i;
    //   25: astore_1
    //   26: aload_0
    //   27: getfield Zq : Lburp/Zewn;
    //   30: aload_0
    //   31: getfield Zr : Lburp/Zmhe;
    //   34: invokestatic Zc : ()Lburp/Zlp5;
    //   37: aload_0
    //   38: aload_1
    //   39: <illegal opcode> Zv : (Lburp/Zb2b;Lburp/Zs2i;)Lburp/Zrec;
    //   44: invokestatic Zu : (Lburp/Zrec;)Lburp/Zxgd;
    //   47: invokevirtual Zw : (Lburp/Zxgd;)Lburp/Zlp5;
    //   50: iconst_1
    //   51: invokevirtual Zd : (Z)Lburp/Zlp5;
    //   54: invokevirtual Z_ : ()Lburp/Zlp5;
    //   57: invokeinterface ZZ : (Lburp/Zlp5;)Lburp/Zlvf;
    //   62: invokeinterface ZM : ()Lburp/Zzud;
    //   67: invokevirtual ZE : (Lburp/Zzud;)[B
    //   70: astore_2
    //   71: aload_2
    //   72: ifnull -> 156
    //   75: aload_0
    //   76: getfield Zm : Lburp/Zbjl;
    //   79: aload_0
    //   80: getfield Zq : Lburp/Zewn;
    //   83: invokevirtual ZF : ()Lnet/portswigger/Zen;
    //   86: invokeinterface Ze : (Lnet/portswigger/Zen;)Ljava/util/List;
    //   91: astore_3
    //   92: new burp/Zrlt
    //   95: dup
    //   96: aload_3
    //   97: invokespecial <init> : (Ljava/util/List;)V
    //   100: aload_0
    //   101: getfield Zq : Lburp/Zewn;
    //   104: iconst_2
    //   105: anewarray burp/Zb25
    //   108: dup
    //   109: iconst_0
    //   110: getstatic burp/Zb25.HTTP : Lburp/Zb25;
    //   113: aastore
    //   114: dup
    //   115: iconst_1
    //   116: getstatic burp/Zb25.HTTPS : Lburp/Zb25;
    //   119: aastore
    //   120: invokevirtual Zh : (Lburp/Zewx;[Lburp/Zb25;)Lburp/Zer0;
    //   123: astore #4
    //   125: new burp/Zr5u
    //   128: dup
    //   129: aload_0
    //   130: getfield ZN : Lburp/Zkl6;
    //   133: invokeinterface ZB : ()Lburp/Zbnt;
    //   138: aload_0
    //   139: getfield Zo : Lburp/Ze3n;
    //   142: aload #4
    //   144: aload_2
    //   145: aload_0
    //   146: getfield Zq : Lburp/Zewn;
    //   149: invokespecial <init> : (Lburp/Zbnt;Lburp/Ze3n;Lburp/Zer0;[BLburp/Zewx;)V
    //   152: invokevirtual Z_ : ()Lburp/Zbll;
    //   155: areturn
    //   156: aload_0
    //   157: getfield ZS : Lburp/Zz1_;
    //   160: invokeinterface Z_ : ()Lburp/Zbll;
    //   165: areturn
  }
  
  private Zefx lambda$findCollaboratorReportableData$0(Zs2i paramZs2i, Zefx paramZefx) {
    Zey9 zey9 = this.ZN.ZH();
    Zmzk zmzk = this.Zo.Za();
    return zey9.ZY(zmzk, paramZs2i.ZE());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb2b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */