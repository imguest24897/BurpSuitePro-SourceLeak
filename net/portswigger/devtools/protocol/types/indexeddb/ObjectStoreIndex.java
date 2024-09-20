package net.portswigger.devtools.protocol.types.indexeddb;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.indexeddb.ObjectStoreIndex")
public class ObjectStoreIndex {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "keyPath")
  public final KeyPath keyPath;
  
  @Zvd(Zp = "unique")
  public final Boolean unique;
  
  @Zvd(Zp = "multiEntry")
  public final Boolean multiEntry;
  
  @Zox
  public ObjectStoreIndex(@Zc5(Ze = "name") String paramString, @Zc5(Ze = "keyPath") KeyPath paramKeyPath, @Zc5(Ze = "unique") Boolean paramBoolean1, @Zc5(Ze = "multiEntry") Boolean paramBoolean2) {
    this.name = paramString;
    this.keyPath = paramKeyPath;
    boolean bool = RequestData.Zl();
    this.unique = paramBoolean1;
    this.multiEntry = paramBoolean2;
    if (Zbqc.Zwu() == null)
      RequestData.Zn(!bool); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\indexeddb\ObjectStoreIndex.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */