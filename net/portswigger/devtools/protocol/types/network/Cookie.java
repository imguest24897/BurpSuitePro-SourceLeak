package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.network.Cookie")
public class Cookie {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "value")
  public final String value;
  
  @Zvd(Zp = "domain")
  public final String domain;
  
  @Zvd(Zp = "path")
  public final String path;
  
  @Zvd(Zp = "expires")
  public final Double expires;
  
  @Zvd(Zp = "size")
  public final Integer size;
  
  @Zvd(Zp = "httpOnly")
  public final Boolean httpOnly;
  
  @Zvd(Zp = "secure")
  public final Boolean secure;
  
  @Zvd(Zp = "session")
  public final Boolean session;
  
  @Zvd(Zp = "sameSite")
  @Zj
  public final CookieSameSite sameSite;
  
  @Zvd(Zp = "priority")
  @Zy
  public final CookiePriority priority;
  
  @Zvd(Zp = "sameParty")
  @Deprecated
  @Zy
  public final Boolean sameParty;
  
  @Zvd(Zp = "sourceScheme")
  @Zy
  public final CookieSourceScheme sourceScheme;
  
  @Zvd(Zp = "sourcePort")
  @Zy
  public final Integer sourcePort;
  
  @Zvd(Zp = "partitionKey")
  @Zy
  @Zj
  public final CookiePartitionKey partitionKey;
  
  @Zvd(Zp = "partitionKeyOpaque")
  @Zy
  @Zj
  public final Boolean partitionKeyOpaque;
  
  @Zox
  public Cookie(@Zc5(Ze = "name") String paramString1, @Zc5(Ze = "value") String paramString2, @Zc5(Ze = "domain") String paramString3, @Zc5(Ze = "path") String paramString4, @Zc5(Ze = "expires") Double paramDouble, @Zc5(Ze = "size") Integer paramInteger1, @Zc5(Ze = "httpOnly") Boolean paramBoolean1, @Zc5(Ze = "secure") Boolean paramBoolean2, @Zc5(Ze = "session") Boolean paramBoolean3, @Zc5(Ze = "sameSite", ZS = "null") CookieSameSite paramCookieSameSite, @Zc5(Ze = "priority") CookiePriority paramCookiePriority, @Zc5(Ze = "sameParty") Boolean paramBoolean4, @Zc5(Ze = "sourceScheme") CookieSourceScheme paramCookieSourceScheme, @Zc5(Ze = "sourcePort") Integer paramInteger2, @Zc5(Ze = "partitionKey", ZS = "null") CookiePartitionKey paramCookiePartitionKey, @Zc5(Ze = "partitionKeyOpaque", ZS = "null") Boolean paramBoolean5) {
    this.name = paramString1;
    this.value = paramString2;
    this.domain = paramString3;
    this.path = paramString4;
    this.expires = paramDouble;
    this.size = paramInteger1;
    this.httpOnly = paramBoolean1;
    this.secure = paramBoolean2;
    this.session = paramBoolean3;
    this.sameSite = paramCookieSameSite;
    this.priority = paramCookiePriority;
    this.sameParty = paramBoolean4;
    this.sourceScheme = paramCookieSourceScheme;
    this.sourcePort = paramInteger2;
    this.partitionKey = paramCookiePartitionKey;
    this.partitionKeyOpaque = paramBoolean5;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\Cookie.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */