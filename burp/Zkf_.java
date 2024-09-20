package burp;

import burp.api.montoya.collaborator.Interaction;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.scanner.audit.issues.AuditIssue;
import burp.api.montoya.scanner.audit.issues.AuditIssueConfidence;
import burp.api.montoya.scanner.audit.issues.AuditIssueDefinition;
import burp.api.montoya.scanner.audit.issues.AuditIssueSeverity;
import java.util.List;

public class Zkf_ implements AuditIssue, Zzsg, Proxyable {
  private final Zrdb ZY;
  
  private final Zkl6 Zc;
  
  private final Zskl ZH;
  
  private final Zm6x Zd;
  
  public Zkf_(Zrdb paramZrdb, Zkl6 paramZkl6, Zskl paramZskl, Zm6x paramZm6x) {
    this.ZY = paramZrdb;
    this.Zc = paramZkl6;
    this.ZH = paramZskl;
    this.Zd = paramZm6x;
  }
  
  public Zrdb ZI() {
    return this.ZY;
  }
  
  public String name() {
    return Zrf1.Za.ZK(this.ZY).ZZV();
  }
  
  public String detail() {
    return this.ZY.Zai();
  }
  
  public String remediation() {
    return this.ZY.ZaR();
  }
  
  public HttpService httpService() {
    return this.ZH.ZU(this.ZY.ZaB());
  }
  
  public String baseUrl() {
    byte[] arrayOfByte = this.ZY.Zax();
    return this.ZY.ZaB().toString() + this.ZY.ZaB().toString();
  }
  
  public AuditIssueSeverity severity() {
    return Zt6v.Zk(this.ZY.ZaJ());
  }
  
  public AuditIssueConfidence confidence() {
    return Zt6v.ZF(this.ZY.Zac());
  }
  
  public List<HttpRequestResponse> requestResponses() {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: aload_1
    //   10: <illegal opcode> ZC : (Lburp/Zkf_;Ljava/util/List;)Lburp/Zb03;
    //   15: astore_2
    //   16: aload_0
    //   17: getfield ZY : Lburp/Zrdb;
    //   20: invokeinterface Za7 : ()Lburp/Ztub;
    //   25: aload_2
    //   26: <illegal opcode> accept : (Lburp/Zb03;)Ljava/util/function/Consumer;
    //   31: invokevirtual Zj : (Ljava/util/function/Consumer;)V
    //   34: aload_1
    //   35: areturn
  }
  
  public List<Interaction> collaboratorInteractions() {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: getfield ZY : Lburp/Zrdb;
    //   12: invokeinterface Za7 : ()Lburp/Ztub;
    //   17: invokevirtual ZY : ()Ljava/util/List;
    //   20: aload_0
    //   21: aload_1
    //   22: <illegal opcode> accept : (Lburp/Zkf_;Ljava/util/List;)Ljava/util/function/Consumer;
    //   27: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   32: aload_1
    //   33: areturn
  }
  
  public AuditIssueDefinition definition() {
    Zree zree = Zrf1.Za.ZK(this.ZY);
    return this.ZH.ZW(zree.ZZV(), zree.ZZA(), zree.ZZH(), zree.ZZ3(), zree.Za6());
  }
  
  public Ztub ZV() {
    return this.ZY.Za7();
  }
  
  private void lambda$collaboratorInteractions$2(List<Zbwn> paramList, Ztkk paramZtkk) {
    paramList.add(new Zbwn(paramZtkk, this.Zc, this.ZH, this.Zd));
  }
  
  private static void lambda$requestResponses$1(Zb03 paramZb03, Zgkc paramZgkc) {
    paramZgkc.Zg(paramZb03);
  }
  
  private void lambda$requestResponses$0(List<HttpRequestResponse> paramList, Zzi8 paramZzi8) {
    paramList.add(this.ZH.Zh(paramZzi8.Zq(this.Zc, this.Zd)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkf_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */