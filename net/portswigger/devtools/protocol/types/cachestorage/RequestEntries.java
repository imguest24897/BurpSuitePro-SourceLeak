package net.portswigger.devtools.protocol.types.cachestorage;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.cachestorage.RequestEntries")
public class RequestEntries {
  @Zvd(Zp = "cacheDataEntries")
  public final List<DataEntry> cacheDataEntries;
  
  @Zvd(Zp = "returnCount")
  public final Double returnCount;
  
  private static String[] Zs;
  
  @Zox
  public RequestEntries(@Zc5(Ze = "cacheDataEntries") List<DataEntry> paramList, @Zc5(Ze = "returnCount") Double paramDouble) {
    this.cacheDataEntries = paramList;
    this.returnCount = paramDouble;
  }
  
  public static void Zz(String[] paramArrayOfString) {
    Zs = paramArrayOfString;
  }
  
  public static String[] ZB() {
    return Zs;
  }
  
  static {
    if (ZB() == null)
      Zz(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\cachestorage\RequestEntries.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */