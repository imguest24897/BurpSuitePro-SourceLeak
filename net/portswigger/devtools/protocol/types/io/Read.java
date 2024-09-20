package net.portswigger.devtools.protocol.types.io;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.io.Read")
public class Read {
  @Zvd(Zp = "base64Encoded")
  @Zj
  public final Boolean base64Encoded;
  
  @Zvd(Zp = "data")
  public final String data;
  
  @Zvd(Zp = "eof")
  public final Boolean eof;
  
  private static Zbqc[] Zr;
  
  @Zox
  public Read(@Zc5(Ze = "base64Encoded", ZS = "null") Boolean paramBoolean1, @Zc5(Ze = "data") String paramString, @Zc5(Ze = "eof") Boolean paramBoolean2) {
    this.base64Encoded = paramBoolean1;
    this.data = paramString;
    Zbqc[] arrayOfZbqc = Zv();
    this.eof = paramBoolean2;
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public static void Zg(Zbqc[] paramArrayOfZbqc) {
    Zr = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zv() {
    return Zr;
  }
  
  static {
    if (Zv() != null)
      Zg(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\io\Read.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */