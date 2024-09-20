package burp;

import java.util.List;
import java.util.Optional;
import net.portswigger.Zen;

public class Zewn extends Zewx {
  private final Zefx ZF;
  
  private final Zb6k Zb;
  
  Zewn(Zen paramZen, byte[] paramArrayOfbyte, Zefx paramZefx, boolean paramBoolean, Zlp9 paramZlp9, Zmhr paramZmhr) {
    super(paramZen, paramArrayOfbyte, paramZlp9, paramZmhr, (byte)0, ZP);
    this.ZF = paramZefx;
    this.Zb = new Zb6k(paramZefx.ZD(), paramArrayOfbyte, ZG(), paramBoolean, ZF());
  }
  
  public Zs2i Zu(Zxs7 paramZxs7) {
    return Zs2i.Zl(this.ZF);
  }
  
  public Optional<Zlvf> Zs(Zmhe paramZmhe) {
    byte[] arrayOfByte = (ZG() == Zlp9.COLLABORATOR_EVERYWHERE_SSL_SNI_PAYLOAD) ? Zh() : Zsoh.ZG;
    Zlvf zlvf = paramZmhe.ZZ(Zlp5.Zc().Zd(false).Zw(Zxgd.Zu(this::lambda$issueRequest$0).Zz().ZV()).ZC(arrayOfByte).Z_());
    return Optional.of(zlvf);
  }
  
  public List<Zl1r> Zn(Zbll paramZbll, Zxs7 paramZxs7) {
    return this.Zb.Ze();
  }
  
  private Zefx lambda$issueRequest$0(Zefx paramZefx) {
    return this.ZF;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zewn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */