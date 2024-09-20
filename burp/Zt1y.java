package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.internal.MontoyaObjectFactory;
import burp.api.montoya.utilities.URLUtils;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import net.portswigger.Zkb;

public class Zt1y implements URLUtils {
  private final MontoyaObjectFactory Zg;
  
  public Zt1y(MontoyaObjectFactory paramMontoyaObjectFactory) {
    this.Zg = paramMontoyaObjectFactory;
  }
  
  public String encode(String paramString) {
    return URLEncoder.encode(paramString, StandardCharsets.UTF_8);
  }
  
  public String decode(String paramString) {
    return URLDecoder.decode(paramString, StandardCharsets.UTF_8);
  }
  
  public ByteArray encode(ByteArray paramByteArray) {
    return this.Zg.byteArray(Zkb.Zy(encode(paramByteArray.toString())));
  }
  
  public ByteArray decode(ByteArray paramByteArray) {
    return this.Zg.byteArray(Zkb.Zy(decode(paramByteArray.toString())));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt1y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */