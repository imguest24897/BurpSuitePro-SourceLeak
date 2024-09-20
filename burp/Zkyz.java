package burp;

import java.io.IOException;

public class Zkyz extends Zkte {
  private final Zm_2 Zq;
  
  public Zkyz(Zr_4 paramZr_4, Zm_2 paramZm_2) {
    super(paramZr_4, paramZm_2);
    this.Zq = paramZm_2;
  }
  
  public void Zy4() {
    this.Zq.Zy4();
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    Zefg<Zstu> zefg = this.Zq.ZBu();
    int i = this.Zq.ZBI();
    if (i >= zefg.size())
      return null; 
    this.Zq.ZOE(i + 1);
    return this.Zq.Zyn().Zm(new Zr1f(paramZzlx), paramArrayOfbyte, ((Zstu)zefg.get(i)).ZiD());
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.Zq.ZS(paramZs4f);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkyz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */