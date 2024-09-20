package net.portswigger.devtools.protocol.types.emulation;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.emulation.PressureMetadata")
public class PressureMetadata {
  @Zvd(Zp = "available")
  @Zj
  public final Boolean available;
  
  @Zox
  public PressureMetadata(@Zc5(Ze = "available", ZS = "null") Boolean paramBoolean) {
    this.available = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\emulation\PressureMetadata.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */