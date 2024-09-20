package burp;

import burp.api.montoya.collaborator.DnsDetails;
import burp.api.montoya.collaborator.DnsQueryType;
import burp.api.montoya.core.ByteArray;

class Ztq implements DnsDetails {
  final Zb0p Zs;
  
  final Zbwn ZS;
  
  Ztq(Zbwn paramZbwn, Zb0p paramZb0p) {}
  
  public DnsQueryType queryType() {
    return Zt6v.ZM(this.Zs.Za());
  }
  
  public ByteArray query() {
    return this.ZS.Zq.ZI(this.Zs.Zv().ZiD());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */