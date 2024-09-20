package burp;

import burp.api.montoya.MontoyaApi;
import burp.api.montoya.burpsuite.BurpSuite;
import burp.api.montoya.collaborator.Collaborator;
import burp.api.montoya.comparer.Comparer;
import burp.api.montoya.decoder.Decoder;
import burp.api.montoya.extension.Extension;
import burp.api.montoya.http.Http;
import burp.api.montoya.intruder.Intruder;
import burp.api.montoya.logging.Logging;
import burp.api.montoya.organizer.Organizer;
import burp.api.montoya.persistence.Persistence;
import burp.api.montoya.project.Project;
import burp.api.montoya.proxy.Proxy;
import burp.api.montoya.repeater.Repeater;
import burp.api.montoya.scanner.Scanner;
import burp.api.montoya.scope.Scope;
import burp.api.montoya.sitemap.SiteMap;
import burp.api.montoya.ui.UserInterface;
import burp.api.montoya.utilities.Utilities;
import burp.api.montoya.websocket.WebSockets;

public final class Ze_i extends Record implements MontoyaApi {
  private final MontoyaApi ZP;
  
  public Ze_i(MontoyaApi paramMontoyaApi) {
    this.ZP = paramMontoyaApi;
  }
  
  public BurpSuite burpSuite() {
    return new Zl7f(this.ZP.burpSuite());
  }
  
  public Collaborator collaborator() {
    return new Zstx(this.ZP.collaborator());
  }
  
  public Comparer comparer() {
    return new Zgma(this.ZP.comparer());
  }
  
  public Decoder decoder() {
    return new Zr91(this.ZP.decoder());
  }
  
  public Extension extension() {
    return new Zxrj(this.ZP.extension());
  }
  
  public Http http() {
    return new Zzkk(this.ZP.http());
  }
  
  public Intruder intruder() {
    return new Zt7p(this.ZP.intruder());
  }
  
  public Logging logging() {
    return new Zzry(this.ZP.logging());
  }
  
  public Organizer organizer() {
    return new Zmtm(this.ZP.organizer());
  }
  
  public Persistence persistence() {
    return new Zl_4(this.ZP.persistence());
  }
  
  public Project project() {
    return new Zent(this.ZP.project());
  }
  
  public Proxy proxy() {
    return new Zec1(this.ZP.proxy());
  }
  
  public Repeater repeater() {
    return new Zliu(this.ZP.repeater());
  }
  
  public Scanner scanner() {
    return new Zl2i(this.ZP.scanner());
  }
  
  public Scope scope() {
    return new Zxk7(this.ZP.scope());
  }
  
  public SiteMap siteMap() {
    return new Zerd(this.ZP.siteMap());
  }
  
  public UserInterface userInterface() {
    return new Zrzq(this.ZP.userInterface());
  }
  
  public Utilities utilities() {
    return new Zlzz(this.ZP.utilities());
  }
  
  public WebSockets websockets() {
    return new Zmaq(this.ZP.websockets());
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ze_i;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ze_i;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ze_i;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze_i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */