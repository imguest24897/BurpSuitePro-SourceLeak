package burp;

import burp.api.montoya.collaborator.CollaboratorClient;
import burp.api.montoya.collaborator.CollaboratorPayload;
import burp.api.montoya.collaborator.CollaboratorServer;
import burp.api.montoya.collaborator.Interaction;
import burp.api.montoya.collaborator.InteractionFilter;
import burp.api.montoya.collaborator.PayloadOption;
import burp.api.montoya.collaborator.SecretKey;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Zzuu implements CollaboratorClient {
  private final Zg1t Zu;
  
  private final Zzgk Zc;
  
  private final Zg13 Zy;
  
  private final Zbnt Zz;
  
  private final SecretKey Zi;
  
  private final Zskl ZV;
  
  public Zzuu(Zzgk paramZzgk, Zg1t paramZg1t, byte[] paramArrayOfbyte, Zg13 paramZg13, Zbnt paramZbnt, Zskl paramZskl) {
    this.Zc = paramZzgk;
    this.Zu = paramZg1t;
    this.Zy = paramZg13;
    this.Zz = paramZbnt;
    this.ZV = paramZskl;
    this.Zi = new Zmnz(paramArrayOfbyte);
  }
  
  public CollaboratorPayload generatePayload(PayloadOption... paramVarArgs) {
    return generatePayload("", paramVarArgs);
  }
  
  public CollaboratorPayload generatePayload(String paramString, PayloadOption... paramVarArgs) {
    String str1 = this.Zc.ZY(1, paramString, false);
    boolean bool = Arrays.<PayloadOption>stream(paramVarArgs).anyMatch(Zzuu::lambda$generatePayload$0);
    String str2 = bool ? "" : this.Zy.ZZ();
    return new Ze4t(str2, str1, paramString);
  }
  
  public List<Interaction> getAllInteractions() {
    return (List<Interaction>)this.Zu.Zv().stream().map(this::lambda$getAllInteractions$1).collect(Collectors.toList());
  }
  
  public List<Interaction> getInteractions(InteractionFilter paramInteractionFilter) {
    Zzol zzol = new Zzol(this.Zz, paramInteractionFilter, this.Zy.ZZ(), this.ZV);
    return (List<Interaction>)this.Zu.ZG(zzol).stream().map(this::lambda$getAllInteractions$1).collect(Collectors.toList());
  }
  
  public CollaboratorServer server() {
    Objects.requireNonNull(this.Zy);
    return new Zrb3(this.Zy::ZZ);
  }
  
  public SecretKey getSecretKey() {
    return this.Zi;
  }
  
  private Zs8k lambda$getAllInteractions$1(Zer0 paramZer0) {
    return new Zs8k(paramZer0, this.Zy.ZZ(), this.Zz, this.ZV);
  }
  
  private static boolean lambda$generatePayload$0(PayloadOption paramPayloadOption) {
    return (paramPayloadOption == PayloadOption.WITHOUT_SERVER_LOCATION);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzuu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */