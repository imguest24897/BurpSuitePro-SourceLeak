package burp;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

final class Zeev extends Record implements PropertyChangeListener {
  private final Zx8n Zz;
  
  private final Zg3i ZA;
  
  private Zeev(Zx8n paramZx8n, Zg3i paramZg3i) {
    this.Zz = paramZx8n;
    this.ZA = paramZg3i;
  }
  
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    String str = Zbk_.Zb();
    Zl5t zl5t = (Zl5t)paramPropertyChangeEvent.getSource();
    boolean bool = (paramPropertyChangeEvent.getNewValue() != null) ? true : false;
    this.Zz.ZFB(bool);
    Zztv zztv = zl5t.Zf();
    if (bool) {
      if (zztv != null) {
        this.ZA.Zm(zztv);
        if (str == null) {
          if (zztv != null)
            this.ZA.ZX(zztv, 2); 
          return;
        } 
      } 
      return;
    } 
    if (zztv != null)
      this.ZA.ZX(zztv, 2); 
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zeev;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zeev;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zeev;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeev.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */