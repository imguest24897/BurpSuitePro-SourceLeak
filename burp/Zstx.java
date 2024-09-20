package burp;

import burp.api.montoya.collaborator.Collaborator;
import burp.api.montoya.collaborator.CollaboratorClient;
import burp.api.montoya.collaborator.CollaboratorPayloadGenerator;
import burp.api.montoya.collaborator.SecretKey;

public class Zstx implements Collaborator {
  private final Collaborator ZV;
  
  public Zstx(Collaborator paramCollaborator) {
    this.ZV = paramCollaborator;
  }
  
  public CollaboratorClient createClient() {
    CollaboratorClient collaboratorClient = this.ZV.createClient();
    return (collaboratorClient == null) ? null : new Ztrs(collaboratorClient);
  }
  
  public CollaboratorClient restoreClient(SecretKey paramSecretKey) {
    CollaboratorClient collaboratorClient = this.ZV.restoreClient(paramSecretKey);
    return (collaboratorClient == null) ? null : new Ztrs(collaboratorClient);
  }
  
  public CollaboratorPayloadGenerator defaultPayloadGenerator() {
    CollaboratorPayloadGenerator collaboratorPayloadGenerator = this.ZV.defaultPayloadGenerator();
    return (collaboratorPayloadGenerator == null) ? null : new Zlt0(collaboratorPayloadGenerator);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zstx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */