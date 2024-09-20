package burp;

import java.util.function.Consumer;

class Zzl6 extends Zzlj {
  private final Zlou Zx;
  
  private Zzl6(Zbnt paramZbnt, Zey9 paramZey9, Zefx paramZefx, Zlou paramZlou, Consumer<Zbi1> paramConsumer) {
    super(paramZey9, paramZefx, paramConsumer, new Zeby(paramZbnt, paramZey9, paramZefx, paramZlou));
    this.Zx = paramZlou;
  }
  
  protected byte[] Zt(byte[] paramArrayOfbyte, Zz1p paramZz1p) {
    return Zljl.ZE(paramArrayOfbyte, paramZz1p, this.Zx.ZA, this.Zx.Zr, this.Zx.Zx);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzl6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */