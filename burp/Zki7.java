package burp;

import burp.api.montoya.http.message.Cookie;
import java.time.ZonedDateTime;
import java.util.Date;

public class Zki7 implements ICookie {
  private final Cookie ZO;
  
  public static ICookie Zn(Cookie paramCookie) {
    return new Zln6(new Zki7(paramCookie));
  }
  
  private Zki7(Cookie paramCookie) {
    this.ZO = paramCookie;
  }
  
  public String getDomain() {
    return this.ZO.domain();
  }
  
  public String getPath() {
    return this.ZO.path();
  }
  
  public Date getExpiration() {
    return this.ZO.expiration().isEmpty() ? null : new Date(((ZonedDateTime)this.ZO.expiration().get()).toInstant().toEpochMilli());
  }
  
  public String getName() {
    return this.ZO.name();
  }
  
  public String getValue() {
    return this.ZO.value();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zki7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */