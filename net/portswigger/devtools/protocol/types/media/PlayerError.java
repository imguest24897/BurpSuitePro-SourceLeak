package net.portswigger.devtools.protocol.types.media;

import burp.Zbqc;
import java.util.List;
import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.media.PlayerError")
public class PlayerError {
  @Zvd(Zp = "errorType")
  public final String errorType;
  
  @Zvd(Zp = "code")
  public final Integer code;
  
  @Zvd(Zp = "stack")
  public final List<PlayerErrorSourceLocation> stack;
  
  @Zvd(Zp = "cause")
  public final List<PlayerError> cause;
  
  @Zvd(Zp = "data")
  public final Map<String, Zi7> data;
  
  @Zox
  public PlayerError(@Zc5(Ze = "errorType") String paramString, @Zc5(Ze = "code") Integer paramInteger, @Zc5(Ze = "stack") List<PlayerErrorSourceLocation> paramList, @Zc5(Ze = "cause") List<PlayerError> paramList1, @Zc5(Ze = "data") Map<String, Zi7> paramMap) {
    this.errorType = paramString;
    this.code = paramInteger;
    this.stack = paramList;
    this.cause = paramList1;
    Zbqc[] arrayOfZbqc = PlayerProperty.Zs();
    this.data = paramMap;
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\media\PlayerError.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */