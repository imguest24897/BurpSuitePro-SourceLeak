package burp;

import burp.api.montoya.http.message.Cookie;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Optional;

public class Zxzs implements Cookie {
  private final Ztbr Zj;
  
  public Zxzs(Ztbr paramZtbr) {
    this.Zj = paramZtbr;
  }
  
  public String name() {
    return this.Zj.Zqy();
  }
  
  public String value() {
    return this.Zj.Zq0();
  }
  
  public String domain() {
    return this.Zj.ZqJ();
  }
  
  public String path() {
    return this.Zj.ZqD();
  }
  
  public Optional<ZonedDateTime> expiration() {
    Date date = this.Zj.ZqU();
    return (date == null) ? Optional.<ZonedDateTime>empty() : Optional.<ZonedDateTime>of(Ztc3.Za(date));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxzs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */