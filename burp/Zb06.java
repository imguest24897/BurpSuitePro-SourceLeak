package burp;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import net.portswigger.Zm2;

public class Zb06 extends Zb0j {
  private final Collection<Zrdb> ZZ;
  
  Zb06(Zzb4 paramZzb4, Zsh9 paramZsh9, Collection<Zrdb> paramCollection, Zz38 paramZz38, Zskh paramZskh, Zbnt paramZbnt, Zey9 paramZey9) {
    super(paramZzb4, paramZsh9, paramZz38, paramZskh, paramZbnt, paramZey9);
    Zm2.ZC(Zrrh.SCANNER_ISSUES_REPORT_XML);
    this.ZZ = paramCollection;
  }
  
  protected void ZX() throws IOException {
    String str = (new Date()).toString();
    Zemb zemb = new Zemb(this.Zj, this.Zx, this.ZR, this.ZZ, str, this.ZX, this.ZB, this.ZU);
    zemb.ZE();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb06.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */