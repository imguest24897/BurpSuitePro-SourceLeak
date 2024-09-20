package net.portswigger.devtools.protocol.types.target;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.target.FilterEntry")
public class FilterEntry {
  @Zvd(Zp = "exclude")
  @Zj
  public final Boolean exclude;
  
  @Zvd(Zp = "type")
  @Zj
  public final String type;
  
  @Zox
  public FilterEntry(@Zc5(Ze = "exclude", ZS = "null") Boolean paramBoolean, @Zc5(Ze = "type", ZS = "null") String paramString) {
    int[] arrayOfInt = TargetInfo.ZD();
    this.exclude = paramBoolean;
    this.type = paramString;
    if (Zbqc.Zwu() == null)
      TargetInfo.ZN(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\target\FilterEntry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */