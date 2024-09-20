package net.portswigger.devtools.protocol.types.indexeddb;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.indexeddb.ObjectStore")
public class ObjectStore {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "keyPath")
  public final KeyPath keyPath;
  
  @Zvd(Zp = "autoIncrement")
  public final Boolean autoIncrement;
  
  @Zvd(Zp = "indexes")
  public final List<ObjectStoreIndex> indexes;
  
  @Zox
  public ObjectStore(@Zc5(Ze = "name") String paramString, @Zc5(Ze = "keyPath") KeyPath paramKeyPath, @Zc5(Ze = "autoIncrement") Boolean paramBoolean, @Zc5(Ze = "indexes") List<ObjectStoreIndex> paramList) {
    this.name = paramString;
    this.keyPath = paramKeyPath;
    this.autoIncrement = paramBoolean;
    this.indexes = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\indexeddb\ObjectStore.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */