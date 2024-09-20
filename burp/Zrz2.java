package burp;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.swing.SwingUtilities;

class Zrz2 {
  private final AtomicReference<Zz6w> ZH;
  
  private final Consumer<Zto7> Zx;
  
  Zrz2(AtomicReference<Zz6w> paramAtomicReference, Consumer<Zto7> paramConsumer) {
    this.ZH = paramAtomicReference;
    this.Zx = paramConsumer;
  }
  
  void Zw() {
    Zz6w zz6w = this.ZH.get();
    if (zz6w != null && !zz6w.ZW())
      Za(); 
  }
  
  private void Za() {
    SwingUtilities.invokeLater(this::lambda$clearRequestResponseViewer$0);
  }
  
  private void lambda$clearRequestResponseViewer$0() {
    this.Zx.accept(null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrz2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */