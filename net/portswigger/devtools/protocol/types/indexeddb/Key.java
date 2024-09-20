package net.portswigger.devtools.protocol.types.indexeddb;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.indexeddb.Key")
public class Key {
  @Zvd(Zp = "type")
  public final KeyType type;
  
  @Zvd(Zp = "number")
  @Zj
  public final Double number;
  
  @Zvd(Zp = "string")
  @Zj
  public final String string;
  
  @Zvd(Zp = "date")
  @Zj
  public final Double date;
  
  @Zvd(Zp = "array")
  @Zj
  public final List<Key> array;
  
  @Zox
  public Key(@Zc5(Ze = "type") KeyType paramKeyType, @Zc5(Ze = "number", ZS = "null") Double paramDouble1, @Zc5(Ze = "string", ZS = "null") String paramString, @Zc5(Ze = "date", ZS = "null") Double paramDouble2, @Zc5(Ze = "array", ZS = "null") List<Key> paramList) {
    boolean bool = RequestData.Zl();
    this.type = paramKeyType;
    this.number = paramDouble1;
    this.string = paramString;
    this.date = paramDouble2;
    this.array = paramList;
    if (!bool)
      Zbqc.Zr(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\indexeddb\Key.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */