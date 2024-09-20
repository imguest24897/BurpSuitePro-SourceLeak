package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

public class Zu4 extends Zuy<AtomicLong> {
  private static final long serialVersionUID = 1L;
  
  public Zu4() {
    super(AtomicLong.class);
  }
  
  public AtomicLong Zi(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (paramZg.ZA())
        return new AtomicLong(paramZg.ZE()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Long long_ = ZH(paramZg, paramZyg, AtomicLong.class);
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (long_ == null) ? null : new AtomicLong(long_.intValue());
  }
  
  public Zd Zb() {
    return Zd.Integer;
  }
  
  public Object Zy(Zyg paramZyg) throws Zy_ {
    return new AtomicLong();
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zu4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */