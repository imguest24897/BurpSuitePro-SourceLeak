package burp;

import javax.swing.tree.TreePath;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zg_h extends Zg_q {
  private Zet3 Zl;
  
  public Zg_h(Zslu paramZslu, Ztdi paramZtdi, Zgd paramZgd, Zmrz paramZmrz, Zzi paramZzi, Zl2z paramZl2z, Zxgc paramZxgc, Zgzy paramZgzy, Zkl6 paramZkl6, Ztwv paramZtwv, Zrxq paramZrxq) {
    super(paramZtdi, paramZgd, paramZmrz, paramZzi, paramZxgc, paramZgzy, new Zlpy(paramZslu, paramZxgc::lambda$new$0), paramZkl6, paramZtwv, paramZrxq);
    this.Zl.Zu(paramZl2z);
  }
  
  protected Zets Zu() {
    this.Zl = new Zet3();
    return this.Zl;
  }
  
  public Zez3 Ze(Zez3 paramZez3) {
    Zbqc[] arrayOfZbqc = Zzlr.Zp();
    try {
      TreePath[] arrayOfTreePath = this.ZE.getSelectionPaths();
      if (arrayOfTreePath != null) {
        TreePath[] arrayOfTreePath1 = arrayOfTreePath;
        int i = arrayOfTreePath1.length;
        byte b = 0;
        while (b < i) {
          TreePath treePath = arrayOfTreePath1[b];
          Zez3 zez3 = ((Zxya)((Zz_1)treePath.getLastPathComponent()).Z_()).ZX;
          if (paramZez3.ZO(zez3))
            return zez3; 
          b++;
          if (arrayOfZbqc != null)
            break; 
        } 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return null;
  }
  
  private static Zrek lambda$new$0(Zxgc paramZxgc) {
    return paramZxgc;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg_h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */