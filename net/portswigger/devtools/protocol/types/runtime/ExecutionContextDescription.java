package net.portswigger.devtools.protocol.types.runtime;

import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.runtime.ExecutionContextDescription")
public class ExecutionContextDescription {
  @Zvd(Zp = "id")
  public final Integer id;
  
  @Zvd(Zp = "origin")
  public final String origin;
  
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "uniqueId")
  @Zy
  public final String uniqueId;
  
  @Zvd(Zp = "auxData")
  @Zj
  public final Map<String, Zi7> auxData;
  
  @Zox
  public ExecutionContextDescription(@Zc5(Ze = "id") Integer paramInteger, @Zc5(Ze = "origin") String paramString1, @Zc5(Ze = "name") String paramString2, @Zc5(Ze = "uniqueId") String paramString3, @Zc5(Ze = "auxData", ZS = "null") Map<String, Zi7> paramMap) {
    this.id = paramInteger;
    this.origin = paramString1;
    this.name = paramString2;
    this.uniqueId = paramString3;
    this.auxData = paramMap;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\ExecutionContextDescription.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */