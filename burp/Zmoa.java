package burp;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

class Zmoa implements CaretListener {
  private int[] ZK;
  
  final Zvo6 Zl;
  
  private Zmoa(Zvo6 paramZvo6) {}
  
  public void caretUpdate(CaretEvent paramCaretEvent) {
    int[] arrayOfInt = { this.Zl.ZE.getSelectionStart(), this.Zl.ZE.getSelectionEnd() };
    if (this.ZK == null || arrayOfInt[0] != this.ZK[0] || arrayOfInt[1] != this.ZK[1]) {
      this.ZK = arrayOfInt;
      this.Zl.ZD.forEach(arrayOfInt::lambda$caretUpdate$0);
    } 
  }
  
  private static void lambda$caretUpdate$0(int[] paramArrayOfint, Zg90 paramZg90) {
    paramZg90.Zf(paramArrayOfint);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmoa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */