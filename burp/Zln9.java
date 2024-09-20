package burp;

import java.util.function.Consumer;

class Zln9 implements Zz9e {
  private final Zxg_ Zw;
  
  private final Consumer<Zefx> ZV;
  
  private final Zz9e ZD;
  
  Zln9(Zxg_ paramZxg_, Consumer<Zefx> paramConsumer, Zz9e paramZz9e) {
    this.Zw = paramZxg_;
    this.ZV = paramConsumer;
    this.ZD = paramZz9e;
  }
  
  public Zsxd Zh(Zefx paramZefx, Zlhj paramZlhj) {
    if (this.Zw.Zt(paramZefx)) {
      this.ZV.accept(paramZefx);
      return new Ze5m(paramZefx);
    } 
    return this.ZD.Zh(paramZefx, paramZlhj);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zln9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */