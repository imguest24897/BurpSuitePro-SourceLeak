package net.portswigger.devtools.protocol.types.browser;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.browser.Bucket")
public class Bucket {
  @Zvd(Zp = "low")
  public final Integer low;
  
  @Zvd(Zp = "high")
  public final Integer high;
  
  @Zvd(Zp = "count")
  public final Integer count;
  
  @Zox
  public Bucket(@Zc5(Ze = "low") Integer paramInteger1, @Zc5(Ze = "high") Integer paramInteger2, @Zc5(Ze = "count") Integer paramInteger3) {
    this.low = paramInteger1;
    this.high = paramInteger2;
    this.count = paramInteger3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\browser\Bucket.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */