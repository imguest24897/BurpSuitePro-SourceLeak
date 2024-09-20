package net.portswigger.devtools.protocol.types.backgroundservice;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.backgroundservice.EventMetadata")
public class EventMetadata {
  @Zvd(Zp = "key")
  public final String key;
  
  @Zvd(Zp = "value")
  public final String value;
  
  @Zox
  public EventMetadata(@Zc5(Ze = "key") String paramString1, @Zc5(Ze = "value") String paramString2) {
    this.key = paramString1;
    int i = ServiceName.Zr();
    this.value = paramString2;
    if (Zbqc.Zwu() == null)
      ServiceName.ZT(++i); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\backgroundservice\EventMetadata.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */