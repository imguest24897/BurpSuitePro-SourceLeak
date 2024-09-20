package burp;

import java.util.function.Supplier;
import net.portswigger.Zm2;

class Zt7s implements Zx_a {
  private final Zkrn ZR;
  
  private final Supplier<Zr6e> Zy;
  
  Zt7s(Zkrn paramZkrn, Supplier<Zr6e> paramSupplier) {
    this.ZR = paramZkrn;
    this.Zy = paramSupplier;
  }
  
  public void ZQ(Zmzk paramZmzk, Zbr paramZbr, String paramString1, String paramString2) {
    ZT(paramZmzk, paramZbr, null, paramString1, null, paramString2);
  }
  
  public void Zk(Zmzk paramZmzk, Zbr paramZbr, Zgsq paramZgsq, String paramString) {
    ZT(paramZmzk, paramZbr, paramZgsq, paramString, null, null);
  }
  
  public void ZT(Zmzk paramZmzk, Zbr paramZbr, Zgsq paramZgsq, String paramString1, Zr6e paramZr6e, String paramString2) {
    if (paramZbr != null && !paramZbr.Zd()) {
      Zm2.Zo(Zze0.SUITE_INTERFACES_SEND_TO_REPEATER);
      if (paramZr6e == null)
        paramZr6e = this.Zy.get(); 
      this.ZR.ZM(paramZmzk, paramZbr, paramZgsq, paramString1, paramZr6e, paramString2);
    } 
  }
  
  public void Ze(Zmzk paramZmzk, Zstu paramZstu, String paramString1, String paramString2) {
    Zj(paramZmzk, paramZstu, paramString1, paramString2, true);
  }
  
  public void Zj(Zmzk paramZmzk, Zstu paramZstu, String paramString1, String paramString2, boolean paramBoolean) {
    if (paramZstu != null) {
      Zm2.Zo(Zze0.SUITE_INTERFACES_SEND_TO_REPEATER);
      this.ZR.Zz(paramZmzk, paramZstu, paramString1, this.Zy.get(), paramString2, paramBoolean);
    } 
  }
  
  public void Zf(Zkmj paramZkmj) {
    Zv(paramZkmj, this.Zy.get());
  }
  
  public void Zv(Zkmj paramZkmj, Zr6e paramZr6e) {
    if (paramZkmj.ZZ()) {
      Zm2.Zo(Zze0.SUITE_INTERFACES_SEND_WEBSOCKET_TO_REPEATER);
      this.ZR.ZA(paramZkmj, paramZr6e);
    } 
  }
  
  public void ZR(Zbx0 paramZbx0) {
    this.ZR.Zz(paramZbx0);
  }
  
  public void ZB() {
    this.ZR.ZQ();
  }
  
  public void Zo(Ztpl paramZtpl, Zvo1 paramZvo1) {
    this.ZR.Zi(paramZtpl, paramZvo1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt7s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */