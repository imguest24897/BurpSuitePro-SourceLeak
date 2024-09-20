package burp;

import burp.api.montoya.collaborator.Collaborator;
import burp.api.montoya.collaborator.CollaboratorClient;
import burp.api.montoya.collaborator.CollaboratorPayloadGenerator;
import burp.api.montoya.collaborator.SecretKey;

public class Zsz_ implements Collaborator {
  private final Collaborator Zk;
  
  public Zsz_(Zlxz paramZlxz, Zkam paramZkam, Zgb6 paramZgb6, Zbnt paramZbnt, Zr_4 paramZr_4, Zskl paramZskl) {
    this.Zk = new Zdc(paramZlxz, paramZkam, paramZgb6, paramZbnt, paramZr_4, paramZskl);
  }
  
  public CollaboratorClient createClient() {
    return this.Zk.createClient();
  }
  
  public CollaboratorClient restoreClient(SecretKey paramSecretKey) {
    return this.Zk.restoreClient(paramSecretKey);
  }
  
  public CollaboratorPayloadGenerator defaultPayloadGenerator() {
    return this.Zk.defaultPayloadGenerator();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsz_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */