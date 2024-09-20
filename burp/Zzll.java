package burp;

import java.util.function.Consumer;

class Zzll extends Zzlj {
  private final Zlou ZT;
  
  private Zzll(Zey9 paramZey9, Zlou paramZlou, Zefx paramZefx, Consumer<Zbi1> paramConsumer) {
    super(paramZey9, paramZefx, paramConsumer, new Zg42(paramZey9, paramZefx, paramZlou));
    this.ZT = paramZlou;
  }
  
  protected byte[] Zt(byte[] paramArrayOfbyte, Zz1p paramZz1p) {
    return Zljl.Zp(paramArrayOfbyte, paramZz1p, this.ZT.ZA, this.ZT.Zr, this.ZT.Zx, null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzll.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */