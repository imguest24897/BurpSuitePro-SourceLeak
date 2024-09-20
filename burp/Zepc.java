package burp;

import java.awt.event.ActionEvent;

public class Zepc extends Zepe {
  public Zepc(String paramString, Zt2q paramZt2q) {
    this(paramString, paramZt2q, (String)null);
  }
  
  public Zepc(String paramString1, Zt2q paramZt2q, String paramString2) {
    super(paramString1);
    setName(paramString2);
    addActionListener(paramZt2q::lambda$new$0);
  }
  
  private static void lambda$new$0(Zt2q paramZt2q, ActionEvent paramActionEvent) {
    paramZt2q.Zo();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zepc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */