package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.page.PrintToPDF")
public class PrintToPDF {
  @Zvd(Zp = "data")
  public final String data;
  
  @Zvd(Zp = "stream")
  @Zy
  @Zj
  public final String stream;
  
  @Zox
  public PrintToPDF(@Zc5(Ze = "data") String paramString1, @Zc5(Ze = "stream", ZS = "null") String paramString2) {
    this.data = paramString1;
    this.stream = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\PrintToPDF.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */