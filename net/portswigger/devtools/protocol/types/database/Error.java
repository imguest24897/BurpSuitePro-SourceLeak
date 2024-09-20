package net.portswigger.devtools.protocol.types.database;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.database.Error")
public class Error {
  @Zvd(Zp = "message")
  public final String message;
  
  @Zvd(Zp = "code")
  public final Integer code;
  
  @Zox
  public Error(@Zc5(Ze = "message") String paramString, @Zc5(Ze = "code") Integer paramInteger) {
    this.message = paramString;
    this.code = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\database\Error.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */