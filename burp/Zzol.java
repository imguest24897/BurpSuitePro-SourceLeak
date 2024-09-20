package burp;

import burp.api.montoya.collaborator.CollaboratorServer;
import burp.api.montoya.collaborator.InteractionFilter;

class Zzol implements Zthu {
  private final Zbnt Zz;
  
  private final InteractionFilter Zs;
  
  private final CollaboratorServer Zg;
  
  private final Zskl Zl;
  
  private Zzol(Zbnt paramZbnt, InteractionFilter paramInteractionFilter, String paramString, Zskl paramZskl) {
    this.Zz = paramZbnt;
    this.Zs = paramInteractionFilter;
    this.Zg = new Zrb3(paramString);
    this.Zl = paramZskl;
  }
  
  public boolean ZZ(Zer0 paramZer0) {
    return this.Zs.matches(this.Zg, new Zs8k(paramZer0, this.Zg.address(), this.Zz, this.Zl));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzol.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */