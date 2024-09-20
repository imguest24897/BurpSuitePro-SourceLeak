package com.fasterxml.Zs;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zor.Zyg;
import java.io.IOException;

class Zuc extends Zub<Object> {
  public Zuc() {
    super(StringBuffer.class);
  }
  
  public Zd Zb() {
    return Zd.Textual;
  }
  
  public Object Zy(Zyg paramZyg) {
    return new StringBuffer();
  }
  
  public Object deserialize(Zg paramZg, Zyg paramZyg) throws IOException {
    String str = paramZg.Zd();
    try {
      if (str != null)
        return ZV(str, paramZyg); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return super.deserialize(paramZg, paramZyg);
  }
  
  protected Object ZV(String paramString, Zyg paramZyg) throws IOException {
    return new StringBuffer(paramString);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zuc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */