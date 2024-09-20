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

public class Zzwe implements Utilities {
  private final ByteUtils Zn;
  
  private final Zt1y Zy;
  
  private final Base64Utils ZD;
  
  private final HtmlUtils ZZ;
  
  private final CryptoUtils Zh;
  
  private final StringUtils ZK;
  
  private final NumberUtils Zf;
  
  private final CompressionUtils ZQ;
  
  private final RandomUtils ZL;
  
  private final JsonUtils Zi;
  
  public Zzwe(ByteUtils paramByteUtils, Zt1y paramZt1y, Base64Utils paramBase64Utils, HtmlUtils paramHtmlUtils, CryptoUtils paramCryptoUtils, StringUtils paramStringUtils, NumberUtils paramNumberUtils, CompressionUtils paramCompressionUtils, RandomUtils paramRandomUtils, JsonUtils paramJsonUtils) {
    this.Zn = paramByteUtils;
    this.Zy = paramZt1y;
    this.ZD = paramBase64Utils;
    this.ZZ = paramHtmlUtils;
    this.Zh = paramCryptoUtils;
    this.ZK = paramStringUtils;
    this.Zf = paramNumberUtils;
    this.ZQ = paramCompressionUtils;
    this.ZL = paramRandomUtils;
    this.Zi = paramJsonUtils;
  }
  
  public ByteUtils byteUtils() {
    return this.Zn;
  }
  
  public URLUtils urlUtils() {
    return this.Zy;
  }
  
  public JsonUtils jsonUtils() {
    return this.Zi;
  }
  
  public Base64Utils base64Utils() {
    return this.ZD;
  }
  
  public HtmlUtils htmlUtils() {
    return this.ZZ;
  }
  
  public CryptoUtils cryptoUtils() {
    return this.Zh;
  }
  
  public StringUtils stringUtils() {
    return this.ZK;
  }
  
  public NumberUtils numberUtils() {
    return this.Zf;
  }
  
  public RandomUtils randomUtils() {
    return this.ZL;
  }
  
  public CompressionUtils compressionUtils() {
    return this.ZQ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzwe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */