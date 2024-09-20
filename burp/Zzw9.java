package burp;

import java.util.function.Function;

public class Zzw9 implements Zgd5 {
  private final byte Zu;
  
  private final Function<Zzvx, String> ZH;
  
  private String Zn;
  
  public Zzw9(byte paramByte, Function<Zzvx, String> paramFunction) {
    this.Zu = paramByte;
    this.ZH = paramFunction;
  }
  
  public Zzbn ZZ(Zzvx paramZzvx) {
    Zzvw zzvw = (Zzvw)paramZzvx;
    String str = this.ZH.apply(paramZzvx);
    paramZzvx.Zw().Z_(str);
    Zrrb zrrb = new Zrrb(str.getBytes(), this.Zu);
    Zri7 zri7 = Zri7.ZJ(zrrb);
    Zlvf zlvf = zzvw.Zz().Zt().ZK(zri7, Zlp5.Zc().Zd(false));
    Zefx zefx = zlvf.ZM().ZL();
    Zb6q zb6q = zlvf.ZM().ZT();
    Zs2i zs2i = zlvf.ZY();
    paramZzvx.Zw().ZZ(zefx, zb6q, this.Zn);
    Zzbn zzbn = new Zzbn(zefx, zb6q, zs2i.ZO());
    zzvw.ZT(this.Zn, zzbn);
    int[] arrayOfInt = Zmgt.ZK();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[3]); 
    return zzbn;
  }
  
  public Zzw9 Ze(String paramString) {
    this.Zn = paramString;
    return this;
  }
  
  public static Zzw9 Zg(Function<Zzvx, String> paramFunction) {
    return new Zzw9((byte)1, paramFunction);
  }
  
  public static Zzw9 Zf(Function<Zzvx, String> paramFunction) {
    return new Zzw9((byte)0, paramFunction);
  }
  
  private static String lambda$appending$0(String paramString, Zzvx paramZzvx) {
    return paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzw9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */