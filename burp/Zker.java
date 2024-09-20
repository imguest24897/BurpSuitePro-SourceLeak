package burp;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;

public class Zker {
  private final Ztdi ZI;
  
  private final Zbnt Zs;
  
  private final Zey9 ZL;
  
  private static final Zsh9 ZS = new Zsh9();
  
  public Zker(Ztdi paramZtdi, Zbnt paramZbnt) {
    this.ZI = paramZtdi;
    this.Zs = paramZbnt;
    this.ZL = new Zey9(paramZbnt);
  }
  
  public String Zq() throws IOException {
    StringWriter stringWriter = new StringWriter();
    Zemb zemb = new Zemb(Zrf1.Za, ZS, stringWriter, this.ZI.Zs(Zker::lambda$xmlReport$0), (new Date()).toString(), this.Zs, new Zr1x(), this.ZL);
    zemb.ZE();
    Zbqc[] arrayOfZbqc = Zbfm.Zf();
    try {
      if (Zbqc.Zwu() == null)
        Zbfm.ZO(new Zbqc[5]); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return stringWriter.toString();
  }
  
  private static boolean lambda$xmlReport$0(Zez3 paramZez3) {
    return true;
  }
  
  static {
    ZS.Zq = Zxtk.XML;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zker.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */