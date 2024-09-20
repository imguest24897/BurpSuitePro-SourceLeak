package burp;

import java.util.List;

class Zxyz implements Zg5o {
  private final Zskh Zl;
  
  private final Zxzh ZX;
  
  private final Zey9 Ze;
  
  private final Ze44 Zy;
  
  private final int ZJ;
  
  private final List<Zkg1> ZU;
  
  private final String ZK;
  
  private final Zsgw ZF;
  
  private Zsgw ZC;
  
  private Zxyz(Zskh paramZskh, Zxzh paramZxzh, Zey9 paramZey9, Ze44 paramZe44, int paramInt, List<Zkg1> paramList, String paramString, Zsgw paramZsgw) {
    this.Zl = paramZskh;
    this.ZX = paramZxzh;
    this.Ze = paramZey9;
    this.Zy = paramZe44;
    this.ZJ = paramInt;
    this.ZU = paramList;
    this.ZK = paramString;
    this.ZF = paramZsgw;
  }
  
  public void Zs(Zr6q paramZr6q) {
    Zsxd zsxd = Zgg4.ZW(this.Zl, this.ZX, this.Zy, this.ZJ, this.ZF.Zi, this.ZK, this.ZU, this.Ze);
    this.ZC = new Zsgw(zsxd);
  }
  
  public void ZS(Zr6h paramZr6h) {
    // Byte code:
    //   0: invokestatic ZI : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: invokevirtual ZH : ()Z
    //   8: ifeq -> 23
    //   11: aload_0
    //   12: aload_0
    //   13: getfield ZF : Lburp/Zsgw;
    //   16: putfield ZC : Lburp/Zsgw;
    //   19: iload_2
    //   20: ifne -> 116
    //   23: aload_0
    //   24: getfield ZF : Lburp/Zsgw;
    //   27: getfield Zi : Lburp/Zsxd;
    //   30: invokeinterface ZG : ()Lburp/Zg3d;
    //   35: invokeinterface ZR : ()Lburp/Zefx;
    //   40: astore_3
    //   41: aload_3
    //   42: ifnonnull -> 49
    //   45: aconst_null
    //   46: goto -> 55
    //   49: aload_3
    //   50: invokeinterface Zb : ()Lburp/Zefx;
    //   55: astore #4
    //   57: new burp/Ze5m
    //   60: dup
    //   61: aload #4
    //   63: invokespecial <init> : (Lburp/Zefx;)V
    //   66: astore #5
    //   68: aload_0
    //   69: getfield Zl : Lburp/Zskh;
    //   72: aload_0
    //   73: getfield ZX : Lburp/Zxzh;
    //   76: aload_0
    //   77: getfield Zy : Lburp/Ze44;
    //   80: aload_0
    //   81: getfield ZJ : I
    //   84: aload #5
    //   86: aload_0
    //   87: getfield ZK : Ljava/lang/String;
    //   90: aload_0
    //   91: getfield ZU : Ljava/util/List;
    //   94: aload_0
    //   95: getfield Ze : Lburp/Zey9;
    //   98: invokestatic ZW : (Lburp/Zskh;Lburp/Zxzh;Lburp/Ze44;ILburp/Zsxd;Ljava/lang/String;Ljava/util/List;Lburp/Zey9;)Lburp/Zsxd;
    //   101: astore #6
    //   103: aload_0
    //   104: new burp/Zsgw
    //   107: dup
    //   108: aload #6
    //   110: invokespecial <init> : (Lburp/Zsxd;)V
    //   113: putfield ZC : Lburp/Zsgw;
    //   116: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxyz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */