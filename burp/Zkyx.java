package burp;

import java.io.IOException;

public class Zkyx extends Zkte {
  private final Zkfd Zh;
  
  public Zkyx(Zr_4 paramZr_4, Zkfd paramZkfd) {
    super(paramZr_4, paramZkfd);
    this.Zh = paramZkfd;
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    Zstu zstu1 = this.Zh.ZT_();
    Zstu zstu2 = this.Zh.ZTd();
    boolean bool1 = (zstu2 != null && Zxrp.Zk(zstu1, zstu2)) ? true : false;
    boolean bool2 = (zstu1 == null || (this.Zh.ZTo() && bool1)) ? true : false;
    if (bool2)
      return null; 
    this.Zh.Zi(zstu1);
    return this.Zh.Zyn().Zm(new Zr1f(paramZzlx), paramArrayOfbyte, zstu1.ZiD());
  }
  
  public void Zy4() {
    this.Zh.Zy4();
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.Zh.ZS(paramZs4f);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkyx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */