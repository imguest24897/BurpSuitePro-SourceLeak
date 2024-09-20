package burp;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.KeyStroke;

public class Ztd4 {
  private final Map<KeyStroke, Zm9> ZB = new HashMap<>();
  
  private final Supplier<InputMap> Zv;
  
  private final Supplier<ActionMap> ZY;
  
  public Ztd4(Supplier<InputMap> paramSupplier, Supplier<ActionMap> paramSupplier1) {
    this.Zv = paramSupplier;
    this.ZY = paramSupplier1;
  }
  
  public void Zu(Zlpm paramZlpm) {
    ActionMap actionMap = this.ZY.get();
    InputMap inputMap = this.Zv.get();
    KeyStroke keyStroke = paramZlpm.ZxZ();
    Object object = inputMap.get(keyStroke);
    inputMap.put(keyStroke, paramZlpm.Zx0());
    Action action = actionMap.get(paramZlpm.Zx0());
    actionMap.put(paramZlpm.Zx0(), new Zg_s(paramZlpm.ZxV()));
    this.ZB.putIfAbsent(keyStroke, new Zm9(object, action));
    Zbqc[] arrayOfZbqc = Ztsr.Zb();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public void ZP() {
    this.ZB.forEach(this::ZR);
    this.ZB.clear();
  }
  
  private void ZR(KeyStroke paramKeyStroke, Zm9 paramZm9) {
    InputMap inputMap = this.Zv.get();
    ((ActionMap)this.ZY.get()).put(inputMap.get(paramKeyStroke), paramZm9.ZZm());
    inputMap.put(paramKeyStroke, paramZm9.ZZO());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztd4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */