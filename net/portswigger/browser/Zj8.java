package net.portswigger.browser;

import java.time.ZonedDateTime;
import net.portswigger.Zi7;

public abstract class Zj8 extends Zd_ {
  private final Zjp ZL;
  
  protected Zj8(Zd3 paramZd3, long paramLong, ZonedDateTime paramZonedDateTime, boolean paramBoolean1, boolean paramBoolean2, Integer paramInteger1, Integer paramInteger2, boolean paramBoolean3, Integer paramInteger3, boolean paramBoolean4, boolean paramBoolean5, Integer paramInteger4, Zjp paramZjp) {
    super(paramZd3, paramLong, paramZonedDateTime, paramBoolean1, paramBoolean2, paramInteger1, paramInteger2, paramBoolean3, paramInteger3, paramBoolean4, paramBoolean5, paramInteger4);
    this.ZL = paramZjp;
  }
  
  protected Zj8(Zi7 paramZi7) {
    super(paramZi7);
    this.ZL = Zjp.ZD(paramZi7);
  }
  
  public Zjp Zq() {
    return this.ZL;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zj8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */