package burp;

import burp.api.montoya.collaborator.CollaboratorServer;
import burp.api.montoya.collaborator.Interaction;
import burp.api.montoya.collaborator.InteractionFilter;

final class Zrm9 extends Record implements InteractionFilter {
  private final String ZE;
  
  Zrm9(String paramString) {
    this.ZE = paramString;
  }
  
  public boolean matches(CollaboratorServer paramCollaboratorServer, Interaction paramInteraction) {
    return paramInteraction.id().toString().equals(this.ZE);
  }
  
  static InteractionFilter Za(String paramString) {
    return new Zrm9(paramString);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zrm9;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zrm9;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zrm9;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrm9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */