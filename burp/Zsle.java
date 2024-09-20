package burp;

import java.awt.Component;
import java.awt.event.ActionEvent;

public class Zsle implements Zldk {
  private final Zz8s ZE;
  
  public Zsle(Zz8s paramZz8s) {
    this.ZE = paramZz8s;
  }
  
  public Component Zk() {
    return this.ZE;
  }
  
  public void ZU(boolean paramBoolean) {
    this.ZE.setSelected(paramBoolean);
  }
  
  public void Zd(Runnable paramRunnable) {
    this.ZE.addActionListener(paramRunnable::lambda$setUpdateParentAction$0);
  }
  
  private static void lambda$setUpdateParentAction$0(Runnable paramRunnable, ActionEvent paramActionEvent) {
    paramRunnable.run();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsle.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */