package net.portswigger.devtools.protocol.types.runtime;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.runtime.PropertyDescriptor")
public class PropertyDescriptor {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "value")
  @Zj
  public final RemoteObject value;
  
  @Zvd(Zp = "writable")
  @Zj
  public final Boolean writable;
  
  @Zvd(Zp = "get")
  @Zj
  public final RemoteObject get;
  
  @Zvd(Zp = "set")
  @Zj
  public final RemoteObject set;
  
  @Zvd(Zp = "configurable")
  public final Boolean configurable;
  
  @Zvd(Zp = "enumerable")
  public final Boolean enumerable;
  
  @Zvd(Zp = "wasThrown")
  @Zj
  public final Boolean wasThrown;
  
  @Zvd(Zp = "isOwn")
  @Zj
  public final Boolean isOwn;
  
  @Zvd(Zp = "symbol")
  @Zj
  public final RemoteObject symbol;
  
  @Zox
  public PropertyDescriptor(@Zc5(Ze = "name") String paramString, @Zc5(Ze = "value", ZS = "null") RemoteObject paramRemoteObject1, @Zc5(Ze = "writable", ZS = "null") Boolean paramBoolean1, @Zc5(Ze = "get", ZS = "null") RemoteObject paramRemoteObject2, @Zc5(Ze = "set", ZS = "null") RemoteObject paramRemoteObject3, @Zc5(Ze = "configurable") Boolean paramBoolean2, @Zc5(Ze = "enumerable") Boolean paramBoolean3, @Zc5(Ze = "wasThrown", ZS = "null") Boolean paramBoolean4, @Zc5(Ze = "isOwn", ZS = "null") Boolean paramBoolean5, @Zc5(Ze = "symbol", ZS = "null") RemoteObject paramRemoteObject4) {
    this.name = paramString;
    this.value = paramRemoteObject1;
    boolean bool = RemoteObject.ZV();
    this.writable = paramBoolean1;
    this.get = paramRemoteObject2;
    this.set = paramRemoteObject3;
    this.configurable = paramBoolean2;
    this.enumerable = paramBoolean3;
    this.wasThrown = paramBoolean4;
    this.isOwn = paramBoolean5;
    this.symbol = paramRemoteObject4;
    if (!bool)
      Zbqc.Zr(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\PropertyDescriptor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */