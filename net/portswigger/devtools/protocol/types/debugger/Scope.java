package net.portswigger.devtools.protocol.types.debugger;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.runtime.RemoteObject;

@Zsi("net.portswigger.devtools.protocol.types.debugger.Scope")
public class Scope {
  @Zvd(Zp = "type")
  public final ScopeType type;
  
  @Zvd(Zp = "object")
  public final RemoteObject object;
  
  @Zvd(Zp = "name")
  @Zj
  public final String name;
  
  @Zvd(Zp = "startLocation")
  @Zj
  public final Location startLocation;
  
  @Zvd(Zp = "endLocation")
  @Zj
  public final Location endLocation;
  
  @Zox
  public Scope(@Zc5(Ze = "type") ScopeType paramScopeType, @Zc5(Ze = "object") RemoteObject paramRemoteObject, @Zc5(Ze = "name", ZS = "null") String paramString, @Zc5(Ze = "startLocation", ZS = "null") Location paramLocation1, @Zc5(Ze = "endLocation", ZS = "null") Location paramLocation2) {
    this.type = paramScopeType;
    this.object = paramRemoteObject;
    this.name = paramString;
    this.startLocation = paramLocation1;
    this.endLocation = paramLocation2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\debugger\Scope.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */