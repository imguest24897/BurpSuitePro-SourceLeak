package net.portswigger.devtools.protocol.types.indexeddb;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.indexeddb.RequestData")
public class RequestData {
  @Zvd(Zp = "objectStoreDataEntries")
  public final List<DataEntry> objectStoreDataEntries;
  
  @Zvd(Zp = "hasMore")
  public final Boolean hasMore;
  
  private static boolean ZX;
  
  @Zox
  public RequestData(@Zc5(Ze = "objectStoreDataEntries") List<DataEntry> paramList, @Zc5(Ze = "hasMore") Boolean paramBoolean) {
    this.objectStoreDataEntries = paramList;
    this.hasMore = paramBoolean;
  }
  
  public static void Zn(boolean paramBoolean) {
    ZX = paramBoolean;
  }
  
  public static boolean Zl() {
    return ZX;
  }
  
  public static boolean Zd() {
    boolean bool = Zl();
    return !bool;
  }
  
  static {
    if (!Zl())
      Zn(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\indexeddb\RequestData.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */