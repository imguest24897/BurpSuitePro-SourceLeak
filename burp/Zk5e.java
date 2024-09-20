package burp;

import burp.api.montoya.collaborator.SmtpDetails;
import burp.api.montoya.collaborator.SmtpProtocol;

class Zk5e implements SmtpDetails {
  final Zzj5 ZO;
  
  Zk5e(Zbwn paramZbwn, Zzj5 paramZzj5) {}
  
  public SmtpProtocol protocol() {
    Zb25 zb25 = Zb25.ZL(this.ZO.Zl());
    return (zb25 == null) ? null : (zb25.ZV() ? SmtpProtocol.SMTPS : SmtpProtocol.SMTP);
  }
  
  public String conversation() {
    return this.ZO.ZM();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk5e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */