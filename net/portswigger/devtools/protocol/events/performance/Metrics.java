package net.portswigger.devtools.protocol.events.performance;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.performance.Metric;

@Zsi("net.portswigger.devtools.protocol.events.performance.Metrics")
public class Metrics implements Zl {
  @Zvd(Zp = "metrics")
  public final List<Metric> metrics;
  
  @Zvd(Zp = "title")
  public final String title;
  
  private static Zbqc[] ZE;
  
  @Zox
  public Metrics(@Zc5(Ze = "metrics") List<Metric> paramList, @Zc5(Ze = "title") String paramString) {
    this.metrics = paramList;
    this.title = paramString;
    Zbqc[] arrayOfZbqc = Zl();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public static void Zv(Zbqc[] paramArrayOfZbqc) {
    ZE = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zl() {
    return ZE;
  }
  
  static {
    if (Zl() == null)
      Zv(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\performance\Metrics.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */