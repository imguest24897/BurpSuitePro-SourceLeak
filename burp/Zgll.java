package burp;

import java.io.InputStream;
import java.io.OutputStream;

public class Zgll {
  private final InputStream Zz;
  
  private final OutputStream Za;
  
  public Zgll(int paramInt) {
    Zsnl zsnl = new Zsnl(paramInt);
    this.Zz = new Zbz9(zsnl);
    Zbqc[] arrayOfZbqc = Zsnl.ZS();
    this.Za = new Zlzn(zsnl);
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public OutputStream ZE() {
    return this.Za;
  }
  
  public InputStream Zb() {
    return this.Zz;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgll.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */