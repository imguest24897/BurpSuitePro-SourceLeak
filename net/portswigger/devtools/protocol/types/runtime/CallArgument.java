package net.portswigger.devtools.protocol.types.runtime;

import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.runtime.CallArgument")
public class CallArgument {
  @Zvd(Zp = "value")
  @Zj
  public final Zi7 value;
  
  @Zvd(Zp = "unserializableValue")
  @Zj
  public final String unserializableValue;
  
  @Zvd(Zp = "objectId")
  @Zj
  public final String objectId;
  
  @Zox
  public CallArgument(@Zc5(Ze = "value", ZS = "null") Zi7 paramZi7, @Zc5(Ze = "unserializableValue", ZS = "null") String paramString1, @Zc5(Ze = "objectId", ZS = "null") String paramString2) {
    this.value = paramZi7;
    this.unserializableValue = paramString1;
    this.objectId = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\CallArgument.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */