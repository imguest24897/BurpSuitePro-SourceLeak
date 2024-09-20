package net.portswigger.devtools.protocol.types.indexeddb;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.types.runtime.RemoteObject;

@Zsi("net.portswigger.devtools.protocol.types.indexeddb.DataEntry")
public class DataEntry {
  @Zvd(Zp = "key")
  public final RemoteObject key;
  
  @Zvd(Zp = "primaryKey")
  public final RemoteObject primaryKey;
  
  @Zvd(Zp = "value")
  public final RemoteObject value;
  
  @Zox
  public DataEntry(@Zc5(Ze = "key") RemoteObject paramRemoteObject1, @Zc5(Ze = "primaryKey") RemoteObject paramRemoteObject2, @Zc5(Ze = "value") RemoteObject paramRemoteObject3) {
    this.key = paramRemoteObject1;
    this.primaryKey = paramRemoteObject2;
    this.value = paramRemoteObject3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\indexeddb\DataEntry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */