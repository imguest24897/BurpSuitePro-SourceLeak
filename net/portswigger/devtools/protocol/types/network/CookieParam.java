package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.network.CookieParam")
public class CookieParam {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "value")
  public final String value;
  
  @Zvd(Zp = "url")
  @Zj
  public final String url;
  
  @Zvd(Zp = "domain")
  @Zj
  public final String domain;
  
  @Zvd(Zp = "path")
  @Zj
  public final String path;
  
  @Zvd(Zp = "secure")
  @Zj
  public final Boolean secure;
  
  @Zvd(Zp = "httpOnly")
  @Zj
  public final Boolean httpOnly;
  
  @Zvd(Zp = "sameSite")
  @Zj
  public final CookieSameSite sameSite;
  
  @Zvd(Zp = "expires")
  @Zj
  public final Double expires;
  
  @Zvd(Zp = "priority")
  @Zy
  @Zj
  public final CookiePriority priority;
  
  @Zvd(Zp = "sameParty")
  @Zy
  @Zj
  public final Boolean sameParty;
  
  @Zvd(Zp = "sourceScheme")
  @Zy
  @Zj
  public final CookieSourceScheme sourceScheme;
  
  @Zvd(Zp = "sourcePort")
  @Zy
  @Zj
  public final Integer sourcePort;
  
  @Zvd(Zp = "partitionKey")
  @Zy
  @Zj
  public final CookiePartitionKey partitionKey;
  
  @Zox
  public CookieParam(@Zc5(Ze = "name") String paramString1, @Zc5(Ze = "value") String paramString2, @Zc5(Ze = "url", ZS = "null") String paramString3, @Zc5(Ze = "domain", ZS = "null") String paramString4, @Zc5(Ze = "path", ZS = "null") String paramString5, @Zc5(Ze = "secure", ZS = "null") Boolean paramBoolean1, @Zc5(Ze = "httpOnly", ZS = "null") Boolean paramBoolean2, @Zc5(Ze = "sameSite", ZS = "null") CookieSameSite paramCookieSameSite, @Zc5(Ze = "expires", ZS = "null") Double paramDouble, @Zc5(Ze = "priority", ZS = "null") CookiePriority paramCookiePriority, @Zc5(Ze = "sameParty", ZS = "null") Boolean paramBoolean3, @Zc5(Ze = "sourceScheme", ZS = "null") CookieSourceScheme paramCookieSourceScheme, @Zc5(Ze = "sourcePort", ZS = "null") Integer paramInteger, @Zc5(Ze = "partitionKey", ZS = "null") CookiePartitionKey paramCookiePartitionKey) {
    this.name = paramString1;
    this.value = paramString2;
    this.url = paramString3;
    this.domain = paramString4;
    this.path = paramString5;
    this.secure = paramBoolean1;
    this.httpOnly = paramBoolean2;
    this.sameSite = paramCookieSameSite;
    this.expires = paramDouble;
    this.priority = paramCookiePriority;
    this.sameParty = paramBoolean3;
    this.sourceScheme = paramCookieSourceScheme;
    this.sourcePort = paramInteger;
    this.partitionKey = paramCookiePartitionKey;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\CookieParam.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */