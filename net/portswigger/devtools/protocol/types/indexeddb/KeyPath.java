package net.portswigger.devtools.protocol.types.indexeddb;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.indexeddb.KeyPath")
public class KeyPath {
  @Zvd(Zp = "type")
  public final KeyPathType type;
  
  @Zvd(Zp = "string")
  @Zj
  public final String string;
  
  @Zvd(Zp = "array")
  @Zj
  public final List<String> array;
  
  @Zox
  public KeyPath(@Zc5(Ze = "type") KeyPathType paramKeyPathType, @Zc5(Ze = "string", ZS = "null") String paramString, @Zc5(Ze = "array", ZS = "null") List<String> paramList) {
    this.type = paramKeyPathType;
    this.string = paramString;
    this.array = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\indexeddb\KeyPath.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */