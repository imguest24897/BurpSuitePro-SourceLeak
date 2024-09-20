package burp;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

class Zs6j implements Zlr9 {
  private final Zzu Zj;
  
  private final Zgg0 ZS;
  
  private final Zgzx Zy;
  
  private final Zxtb ZJ;
  
  private final Zsil ZU;
  
  private final Zzen ZT;
  
  private final Ze6v Zn;
  
  private final Zxg_ Zw;
  
  private final Consumer<Zefx> Zv;
  
  private final boolean Zi;
  
  private final Zlg9 ZV;
  
  private final Zxy1 Zk;
  
  private Zs6j(Zzu paramZzu, Zgzx paramZgzx, Zxtb paramZxtb, Zsil paramZsil, Zzen paramZzen, Ze6v paramZe6v, Zxg_ paramZxg_, Consumer<Zefx> paramConsumer, boolean paramBoolean, Zlg9 paramZlg9, Zgg0 paramZgg0, Zxy1 paramZxy1) {
    this.Zy = paramZgzx;
    this.ZJ = paramZxtb;
    this.ZU = paramZsil;
    this.ZT = paramZzen;
    this.Zn = paramZe6v;
    this.Zw = paramZxg_;
    this.Zv = paramConsumer;
    this.Zi = paramBoolean;
    this.ZV = paramZlg9;
    this.ZS = paramZgg0;
    this.Zk = paramZxy1;
    this.Zj = new Zlvh(paramZzu);
  }
  
  public Zz9e Zm(Zsw paramZsw) {
    Zz9e zz9e = this.Zn.Zc(this.Zj, this.Zy, this.ZJ, this.ZU, this.ZT, paramZsw, this.ZS, this.Zk);
    AtomicReference<Zln9> atomicReference = new AtomicReference();
    Objects.requireNonNull(atomicReference);
    Ze_d ze_d = new Ze_d(this.Zi, this.ZV, zz9e, atomicReference::get);
    Zln9 zln9 = new Zln9(this.Zw, this.Zv, ze_d);
    atomicReference.set(zln9);
    return zln9;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs6j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */