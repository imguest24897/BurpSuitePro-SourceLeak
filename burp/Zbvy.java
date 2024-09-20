package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.Arrays;

public class Zbvy extends Zbqc {
  public Zbvy() {
    setLayout(new BorderLayout());
  }
  
  public void setVisible(boolean paramBoolean) {
    super.setVisible(paramBoolean);
    Arrays.<Component>stream(getComponents()).forEach(paramBoolean::lambda$setVisible$0);
  }
  
  private static void lambda$setVisible$0(boolean paramBoolean, Component paramComponent) {
    paramComponent.setVisible(paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbvy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */