package net.portswigger.devtools.protocol.types.runtime;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.runtime.PrivatePropertyDescriptor")
public class PrivatePropertyDescriptor {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "value")
  @Zj
  public final RemoteObject value;
  
  @Zvd(Zp = "get")
  @Zj
  public final RemoteObject get;
  
  @Zvd(Zp = "set")
  @Zj
  public final RemoteObject set;
  
  @Zox
  public PrivatePropertyDescriptor(@Zc5(Ze = "name") String paramString, @Zc5(Ze = "value", ZS = "null") RemoteObject paramRemoteObject1, @Zc5(Ze = "get", ZS = "null") RemoteObject paramRemoteObject2, @Zc5(Ze = "set", ZS = "null") RemoteObject paramRemoteObject3) {
    this.name = paramString;
    this.value = paramRemoteObject1;
    this.get = paramRemoteObject2;
    this.set = paramRemoteObject3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\PrivatePropertyDescriptor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */