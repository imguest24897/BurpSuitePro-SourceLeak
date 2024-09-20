package burp;

import java.io.IOException;

public class Zxhf extends Zxsr implements Zt24 {
  protected Zxhf(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zkh2 ZT(Zstu paramZstu, String paramString, boolean paramBoolean, int paramInt) {
    String str1 = Zljy.ZA();
    String str2 = this.Za.Zf(this, Zk_d.Zm);
    if (str1 == null)
      Zbqc.Zr(new Zbqc[4]); 
    return Zljy.ZK(str2, paramString, paramBoolean);
  }
  
  public String ZN_() {
    String str = this.Za.Zf(this, Zk_d.Zm);
    return Zljy.Zq(str);
  }
  
  public byte[] ZNb() {
    String str = this.Za.Zf(this, Zk_d.Zm);
    return Zljy.ZY(str);
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    String str1 = Zljy.ZA();
    String str2 = this.Za.Zf(this, Zk_d.Zm);
    try {
      Zljy.ZF(str2, paramZs4f);
      if (Zbqc.Zwu() == null)
        Zljy.Z_("Cjpif"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public Zeu4<? extends Zl8c> ZF() {
    return (Zeu4)ZD;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxhf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */