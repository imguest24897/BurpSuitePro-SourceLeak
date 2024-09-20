package burp;

import burp.api.montoya.collaborator.SmtpDetails;
import burp.api.montoya.collaborator.SmtpProtocol;
import net.portswigger.Zkb;

class Zluc implements SmtpDetails {
  final Zxyy ZD;
  
  Zluc(Zs8k paramZs8k, Zxyy paramZxyy) {}
  
  public SmtpProtocol protocol() {
    return this.ZD.ZA().ZV() ? SmtpProtocol.SMTPS : SmtpProtocol.SMTP;
  }
  
  public String conversation() {
    return Zkb.ZG(this.ZD.Za());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zluc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */