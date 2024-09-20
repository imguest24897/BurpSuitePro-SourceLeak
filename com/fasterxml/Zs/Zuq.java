package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

@Zl
public class Zuq extends Zu6<Date> {
  public static final Zuq Zf = new Zuq();
  
  public Zuq() {
    super(Date.class);
  }
  
  public Zuq(Zuq paramZuq, DateFormat paramDateFormat, String paramString) {
    super(paramZuq, paramDateFormat, paramString);
  }
  
  protected Zuq ZM(DateFormat paramDateFormat, String paramString) {
    return new Zuq(this, paramDateFormat, paramString);
  }
  
  public Object Zy(Zyg paramZyg) {
    return new Date(0L);
  }
  
  public Date Z_(Zg paramZg, Zyg paramZyg) throws IOException {
    return ZG(paramZg, paramZyg);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zuq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */