package net.portswigger.devtools.protocol.types.indexeddb;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.indexeddb.DatabaseWithObjectStores")
public class DatabaseWithObjectStores {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "version")
  public final Double version;
  
  @Zvd(Zp = "objectStores")
  public final List<ObjectStore> objectStores;
  
  @Zox
  public DatabaseWithObjectStores(@Zc5(Ze = "name") String paramString, @Zc5(Ze = "version") Double paramDouble, @Zc5(Ze = "objectStores") List<ObjectStore> paramList) {
    this.name = paramString;
    this.version = paramDouble;
    this.objectStores = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\indexeddb\DatabaseWithObjectStores.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */