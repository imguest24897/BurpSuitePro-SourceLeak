package burp;

import burp.api.montoya.intruder.AttackConfiguration;

class Zm1a implements IIntruderAttack {
  final AttackConfiguration ZQ;
  
  Zm1a(AttackConfiguration paramAttackConfiguration) {}
  
  public IHttpService getHttpService() {
    return this.ZQ.httpService().map(Zrt7::ZH).orElse(null);
  }
  
  public byte[] getRequestTemplate() {
    return this.ZQ.requestTemplate().content().getBytes();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm1a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */