package burp;

import java.util.List;
import java.util.Optional;
import net.portswigger.Zen;
import net.portswigger.Zli;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zew0 extends Zewx {
  private final Zk7g ZB;
  
  private final Zzow Zm;
  
  private final Zefx Zc;
  
  private final boolean Zi;
  
  private final int ZN;
  
  private final Zkl6 ZG;
  
  private Zlp9 Zp;
  
  public Zew0(Zk7g paramZk7g, int paramInt, Zzow paramZzow, byte[] paramArrayOfbyte, Zefx paramZefx, boolean paramBoolean, Zlp9 paramZlp9, Zmhr paramZmhr, Zkl6 paramZkl6) {
    super(paramZzow.Zb(0), paramArrayOfbyte, paramZlp9, paramZmhr, (byte)0, ZP);
    this.ZB = paramZk7g;
    this.ZN = paramInt;
    this.Zm = paramZzow;
    this.Zc = paramZefx;
    this.Zi = paramBoolean;
    this.Zp = paramZlp9;
    this.ZG = paramZkl6;
  }
  
  public Zs2i Zu(Zxs7 paramZxs7) {
    return Zs2i.Zl(this.Zc);
  }
  
  public List<Zl1r> Zn(Zbll paramZbll, Zxs7 paramZxs7) {
    byte[] arrayOfByte = (paramZbll.Zk.Zh() == null) ? Zh() : paramZbll.Zk.Zh();
    return (new Zb6k(this.Zc.ZD(), arrayOfByte, ZG(), this.Zi, ZF())).Ze();
  }
  
  public Zlp9 ZG() {
    return this.Zp;
  }
  
  public Zen ZF() {
    return this.Zm.ZP(ZJ());
  }
  
  public Zl1r ZE(byte[] paramArrayOfbyte) {
    Zen zen = this.Zm.ZP(ZJ());
    byte[] arrayOfByte = zen.ZZ();
    int i = Zli.ZR(paramArrayOfbyte, zen.ZZ());
    return (i == -1) ? null : new Zl1r(i, i + arrayOfByte.length);
  }
  
  public Optional<Zlvf> Zs(Zmhe paramZmhe) {
    Zlvf zlvf = paramZmhe.ZZ(Zlp5.Zc().Zd(false).Zw(Zxgd.Zu(this::lambda$issueRequest$0).Zz().ZV()).Z_());
    return Optional.of(zlvf);
  }
  
  public Zz1_ Zd(Zesv paramZesv, Zxs7 paramZxs7, Zbjl paramZbjl, Zroy paramZroy, Zzwz paramZzwz, Zer0 paramZer0, List<Zer0> paramList, Ze3n paramZe3n) {
    return new Zz1l(this.ZB, paramZesv, paramZxs7, paramZbjl, paramZroy, (Zz5i)paramZzwz, paramZer0, paramList, this, paramZe3n, this.ZN);
  }
  
  public Zz1_ Ze(Zbnt paramZbnt, Ze3n paramZe3n, Zmhe paramZmhe, Zbjl paramZbjl, Zzwz paramZzwz, Zer0 paramZer0, byte[] paramArrayOfbyte) {
    return new Zb2b(paramZe3n, paramZmhe, paramZbjl, (Zz5i)paramZzwz, paramZer0, paramArrayOfbyte, this, this.ZG);
  }
  
  protected boolean ZO(Zb6q paramZb6q) {
    Zlp9 zlp9 = this.Zm.Zp(paramZb6q.Za().ZiD());
    if (zlp9 != null) {
      this.Zp = zlp9;
      return true;
    } 
    return false;
  }
  
  private Zlp9 ZJ() {
    if (this.Zp != Zlp9.NONE)
      return this.Zp; 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  private Zefx lambda$issueRequest$0(Zefx paramZefx) {
    this.ZG.ZH();
    return this.Zc;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zew0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */