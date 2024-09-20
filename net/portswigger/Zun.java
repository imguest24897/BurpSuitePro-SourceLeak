package net.portswigger;

import java.io.IOException;
import java.io.InputStream;

class Zun extends Zus {
  private final Zus ZB;
  
  public Zun(Zus paramZus) {
    super(null, null, null, null);
    this.ZB = paramZus;
  }
  
  public Zom Zp(InputStream paramInputStream) throws IOException, Zib {
    return this.ZB.Zp(paramInputStream);
  }
  
  public Zvw Zn(InputStream paramInputStream) throws IOException, Zib {
    return this.ZB.Zn(paramInputStream);
  }
  
  public byte[] ZO(Zvw paramZvw, InputStream paramInputStream) throws IOException, Zib {
    try {
      if (paramInputStream.available() == 0)
        try {
          Thread.sleep(100L);
        } catch (InterruptedException interruptedException) {} 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramInputStream.available() > 0)
        return this.ZB.ZO(paramZvw, paramInputStream); 
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
    return null;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zun.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */