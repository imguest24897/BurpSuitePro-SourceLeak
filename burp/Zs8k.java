package burp;

import burp.api.montoya.collaborator.DnsDetails;
import burp.api.montoya.collaborator.HttpDetails;
import burp.api.montoya.collaborator.Interaction;
import burp.api.montoya.collaborator.InteractionId;
import burp.api.montoya.collaborator.InteractionType;
import burp.api.montoya.collaborator.SmtpDetails;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Optional;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zs8k implements Interaction {
  private final Zer0 Zv;
  
  private final String ZT;
  
  private final Zbnt Za;
  
  private final Zskl Zu;
  
  public Zs8k(Zer0 paramZer0, String paramString, Zbnt paramZbnt, Zskl paramZskl) {
    this.Zv = paramZer0;
    this.ZT = paramString;
    this.Za = paramZbnt;
    this.Zu = paramZskl;
  }
  
  public InteractionId id() {
    return new Zk9z(this);
  }
  
  public InteractionType type() {
    return Zt6v.ZM(this.Zv.ZA());
  }
  
  public ZonedDateTime timeStamp() {
    return Instant.ofEpochMilli(this.Zv.Zn()).atZone(ZoneOffset.UTC);
  }
  
  public InetAddress clientIp() {
    try {
      return InetAddress.getByName(this.Zv.Zv());
    } catch (UnknownHostException unknownHostException) {
      Zah.Zl(unknownHostException, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  public int clientPort() {
    return this.Zv.Zu();
  }
  
  public Optional<DnsDetails> dnsDetails() {
    if (type() != InteractionType.DNS)
      return Optional.empty(); 
    Zxyr zxyr = (Zxyr)this.Zv;
    return Optional.of(new Zmcf(this, zxyr));
  }
  
  public Optional<HttpDetails> httpDetails() {
    if (type() != InteractionType.HTTP)
      return Optional.empty(); 
    Zxyt zxyt = (Zxyt)this.Zv;
    return Optional.of(new Zept(this, zxyt));
  }
  
  public Optional<SmtpDetails> smtpDetails() {
    if (type() != InteractionType.SMTP)
      return Optional.empty(); 
    Zxyy zxyy = (Zxyy)this.Zv;
    return Optional.of(new Zluc(this, zxyy));
  }
  
  public Optional<String> customData() {
    String str = this.Zv.Zi();
    return Zlrz.ZS(str);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs8k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */