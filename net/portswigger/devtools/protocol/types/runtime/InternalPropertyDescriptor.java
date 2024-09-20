package net.portswigger.devtools.protocol.types.runtime;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.runtime.InternalPropertyDescriptor")
public class InternalPropertyDescriptor {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "value")
  @Zj
  public final RemoteObject value;
  
  @Zox
  public InternalPropertyDescriptor(@Zc5(Ze = "name") String paramString, @Zc5(Ze = "value", ZS = "null") RemoteObject paramRemoteObject) {
    this.name = paramString;
    this.value = paramRemoteObject;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\InternalPropertyDescriptor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */