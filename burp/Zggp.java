package burp;

public class Zggp {
  private final Zbnt Zi;
  
  private final Zskh ZR;
  
  private final Zr06 ZW;
  
  private final Zsh8 ZC;
  
  private final Zey9 ZP;
  
  Zggp(Zbnt paramZbnt, Zskh paramZskh, Zr06 paramZr06, Zsh8 paramZsh8, Zey9 paramZey9) {
    this.Zi = paramZbnt;
    this.ZR = paramZskh;
    this.ZW = paramZr06;
    this.ZC = paramZsh8;
    this.ZP = paramZey9;
  }
  
  public Zsxd Zd(Zgxp paramZgxp) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface Zod : ()Lburp/Zmzk;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull -> 13
    //   11: aconst_null
    //   12: areturn
    //   13: aload_1
    //   14: invokeinterface Zos : ()Lburp/Zstu;
    //   19: astore_3
    //   20: aload_3
    //   21: ifnonnull -> 33
    //   24: iconst_0
    //   25: getstatic net/portswigger/Zqf.Zx : Lnet/portswigger/Zqf;
    //   28: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   31: aconst_null
    //   32: areturn
    //   33: aload_0
    //   34: getfield ZW : Lburp/Zr06;
    //   37: aload_0
    //   38: getfield ZP : Lburp/Zey9;
    //   41: aload_2
    //   42: aload_3
    //   43: invokeinterface ZiD : ()[B
    //   48: invokevirtual ZY : (Lburp/Zmzk;[B)Lburp/Zefx;
    //   51: aload_0
    //   52: getfield ZC : Lburp/Zsh8;
    //   55: aload_0
    //   56: aload_2
    //   57: aload_3
    //   58: <illegal opcode> Zv : (Lburp/Zggp;Lburp/Zmzk;Lburp/Zstu;)Lburp/Zmdh;
    //   63: aload_0
    //   64: aload_1
    //   65: <illegal opcode> Zh : (Lburp/Zggp;Lburp/Zgxp;)Lburp/Zlgm;
    //   70: aload_1
    //   71: <illegal opcode> ZD : (Lburp/Zgxp;)Lburp/Zl1o;
    //   76: invokevirtual Zt : (Lburp/Zefx;Lburp/Zsh8;Lburp/Zmdh;Lburp/Zlgm;Lburp/Zl1o;)Lburp/Zsxd;
    //   79: areturn
  }
  
  private static void lambda$makeHttpRequest$2(Zgxp paramZgxp, Zefx paramZefx) {
    paramZgxp.ZN(System.currentTimeMillis());
  }
  
  private boolean lambda$makeHttpRequest$1(Zgxp paramZgxp, Zrdu paramZrdu, String paramString) {
    return this.ZC.ZP(paramZrdu, paramString, paramZgxp);
  }
  
  private void lambda$makeHttpRequest$0(Zmzk paramZmzk, Zstu paramZstu) {
    Zmgc.CANNOT_HANDLE_STREAMING_RESPONSE.ZV(this.ZR, new Object[] { Zmpa.Zy(paramZmzk, paramZstu, this.Zi) });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zggp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */