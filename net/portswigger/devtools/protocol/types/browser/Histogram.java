package net.portswigger.devtools.protocol.types.browser;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.browser.Histogram")
public class Histogram {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "sum")
  public final Integer sum;
  
  @Zvd(Zp = "count")
  public final Integer count;
  
  @Zvd(Zp = "buckets")
  public final List<Bucket> buckets;
  
  @Zox
  public Histogram(@Zc5(Ze = "name") String paramString, @Zc5(Ze = "sum") Integer paramInteger1, @Zc5(Ze = "count") Integer paramInteger2, @Zc5(Ze = "buckets") List<Bucket> paramList) {
    this.name = paramString;
    this.sum = paramInteger1;
    this.count = paramInteger2;
    this.buckets = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\browser\Histogram.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */