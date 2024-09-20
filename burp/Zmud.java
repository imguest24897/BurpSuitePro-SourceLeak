package burp;

import java.util.List;
import javax.swing.SwingUtilities;

public class Zmud extends Zmuc<Zzem> {
  private final Zbqc ZK;
  
  private final Zgl7 Zd;
  
  Zmud(Zbqc paramZbqc, Zgl7 paramZgl7) {
    super(new Zg2e(), paramZgl7);
    this.ZK = paramZbqc;
    this.Zd = paramZgl7;
  }
  
  public void Zx(Zbws paramZbws) {
    super.Zx(paramZbws);
  }
  
  void Zl(List<Zzem> paramList) {
    this.Zd.addAll(paramList);
  }
  
  void Zh() {
    this.Zd.clear();
    SwingUtilities.invokeLater(this::lambda$clear$0);
  }
  
  boolean Zs(int paramInt) {
    Zzem zzem = this.Zd.Zz(paramInt);
    return (zzem != null && zzem.Zi());
  }
  
  private void lambda$clear$0() {
    this.ZK.removeAll();
    Zmse.ZF(this.ZK);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmud.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */