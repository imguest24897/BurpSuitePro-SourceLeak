package burp;

import burp.api.montoya.collaborator.DnsDetails;
import burp.api.montoya.collaborator.HttpDetails;
import burp.api.montoya.collaborator.Interaction;
import burp.api.montoya.collaborator.InteractionId;
import burp.api.montoya.collaborator.InteractionType;
import burp.api.montoya.collaborator.SmtpDetails;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.ZonedDateTime;
import java.util.Optional;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbwn implements Interaction {
  private final Ztkk Zd;
  
  private final Zkl6 Zc;
  
  private final Zskl Zq;
  
  private final Zm6x Zl;
  
  Zbwn(Ztkk paramZtkk, Zkl6 paramZkl6, Zskl paramZskl, Zm6x paramZm6x) {
    this.Zd = paramZtkk;
    this.Zc = paramZkl6;
    this.Zq = paramZskl;
    this.Zl = paramZm6x;
  }
  
  public InteractionId id() {
    return new Zxj5(this);
  }
  
  public InteractionType type() {
    return Zt6v.ZS(this.Zd.Zu());
  }
  
  public ZonedDateTime timeStamp() {
    return Zxpc.Zn(this.Zd.Zr());
  }
  
  public InetAddress clientIp() {
    try {
      return InetAddress.getByName(this.Zd.ZH());
    } catch (UnknownHostException unknownHostException) {
      Zah.Zl(unknownHostException, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  public int clientPort() {
    return this.Zd.ZE();
  }
  
  public Optional<DnsDetails> dnsDetails() {
    if (type() != InteractionType.DNS)
      return Optional.empty(); 
    Zb0p zb0p = (Zb0p)this.Zd;
    return Optional.of(new Ztq(this, zb0p));
  }
  
  public Optional<HttpDetails> httpDetails() {
    if (type() != InteractionType.HTTP)
      return Optional.empty(); 
    Zsnv zsnv = (Zsnv)this.Zd;
    return Optional.of(new Zxrl(this, zsnv));
  }
  
  public Optional<SmtpDetails> smtpDetails() {
    if (type() != InteractionType.SMTP)
      return Optional.empty(); 
    Zzj5 zzj5 = (Zzj5)this.Zd;
    return Optional.of(new Zk5e(this, zzj5));
  }
  
  public Optional<String> customData() {
    return Optional.empty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbwn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */