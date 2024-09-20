package burp;

import burp.api.montoya.utilities.Base64Utils;
import burp.api.montoya.utilities.ByteUtils;
import burp.api.montoya.utilities.CompressionUtils;
import burp.api.montoya.utilities.CryptoUtils;
import burp.api.montoya.utilities.HtmlUtils;
import burp.api.montoya.utilities.NumberUtils;
import burp.api.montoya.utilities.RandomUtils;
import burp.api.montoya.utilities.StringUtils;
import burp.api.montoya.utilities.URLUtils;
import burp.api.montoya.utilities.Utilities;
import burp.api.montoya.utilities.json.JsonUtils;

public class Zlzz implements Utilities {
  private final Utilities Zm;
  
  public Zlzz(Utilities paramUtilities) {
    this.Zm = paramUtilities;
  }
  
  public ByteUtils byteUtils() {
    return new Zm79(this.Zm.byteUtils());
  }
  
  public URLUtils urlUtils() {
    return new Zsk8(this.Zm.urlUtils());
  }
  
  public Base64Utils base64Utils() {
    return new Ztcz(this.Zm.base64Utils());
  }
  
  public HtmlUtils htmlUtils() {
    return new Zsj6(this.Zm.htmlUtils());
  }
  
  public CryptoUtils cryptoUtils() {
    return new Zrs(this.Zm.cryptoUtils());
  }
  
  public StringUtils stringUtils() {
    return new Zrjl(this.Zm.stringUtils());
  }
  
  public NumberUtils numberUtils() {
    return new Zzeo(this.Zm.numberUtils());
  }
  
  public RandomUtils randomUtils() {
    return new Zt9x(this.Zm.randomUtils());
  }
  
  public CompressionUtils compressionUtils() {
    return new Zt39(this.Zm.compressionUtils());
  }
  
  public JsonUtils jsonUtils() {
    return new Zbfk(this.Zm.jsonUtils());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlzz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */