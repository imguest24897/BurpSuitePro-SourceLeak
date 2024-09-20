package burp;

import java.io.IOException;

public class Zxhj extends Zxsr implements Zzya {
  protected Zxhj(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zkh2 ZT(Zstu paramZstu, String paramString, boolean paramBoolean, int paramInt) {
    Zbqc[] arrayOfZbqc = Zr4n.Zg();
    Zstu zstu = this.Za.<Zstu>ZA(this, Zk_g.Zk);
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[1]); 
    return Zrut.Zx(zstu.ZiD(), paramZstu, paramBoolean, paramInt);
  }
  
  public String ZN_() {
    Zstu zstu = this.Za.<Zstu>ZA(this, Zk_g.Zk);
    return Zr4n.Zf(zstu.ZiD());
  }
  
  public byte[] ZNb() {
    Zstu zstu = this.Za.<Zstu>ZA(this, Zk_g.Zk);
    return Zr4n.ZU(zstu.ZiD());
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    Zbqc[] arrayOfZbqc = Zr4n.Zg();
    Zstu zstu = this.Za.<Zstu>ZA(this, Zk_g.Zk);
    try {
      Zr4n.ZI(zstu.ZiD(), paramZs4f);
      if (Zbqc.Zwu() == null)
        Zr4n.Zf(new Zbqc[4]); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public Zeu4<? extends Zl8c> ZF() {
    return (Zeu4)ZR;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxhj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */