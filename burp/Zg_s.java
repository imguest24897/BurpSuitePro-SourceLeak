package burp;

import java.awt.event.ActionEvent;
import java.util.function.Consumer;
import javax.swing.AbstractAction;

class Zg_s extends AbstractAction {
  private final Consumer<ActionEvent> Zh;
  
  Zg_s(Consumer<ActionEvent> paramConsumer) {
    this.Zh = paramConsumer;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.Zh.accept(paramActionEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg_s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */