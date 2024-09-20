package burp;

import java.util.function.Consumer;

abstract class Zzlj implements Zrcs {
  private final Zey9 Zs;
  
  private final Zefx Zc;
  
  private final Consumer<Zbi1> ZM;
  
  private final Zmxf Zd;
  
  Zefx Zj;
  
  private Zzlj(Zey9 paramZey9, Zefx paramZefx, Consumer<Zbi1> paramConsumer, Zmxf paramZmxf) {
    this.Zs = paramZey9;
    this.Zc = paramZefx;
    this.ZM = paramConsumer;
    this.Zd = paramZmxf;
  }
  
  abstract byte[] Zt(byte[] paramArrayOfbyte, Zz1p paramZz1p);
  
  public final void Zs(Zr6q paramZr6q) {
    Zsbz zsbz = new Zsbz();
    this.ZM.accept(zsbz);
    boolean bool = Zey9.ZN();
    byte[] arrayOfByte = Zt(paramZr6q.ZD(), zsbz.Zk);
    if (arrayOfByte != paramZr6q.ZD()) {
      Zmzk zmzk = this.Zc.ZT();
      this.Zj = this.Zs.ZY(zmzk, arrayOfByte);
      if (!bool) {
        this.Zj = this.Zc;
        return;
      } 
      return;
    } 
    this.Zj = this.Zc;
  }
  
  public void ZS(Zr6h paramZr6h) {
    this.Zj = this.Zd.ZF(paramZr6h);
  }
  
  public final Zefx ZK() {
    return this.Zj;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzlj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */