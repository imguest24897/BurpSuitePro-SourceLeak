package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.List;

public class Zbh1 extends Zbqc implements Zbof {
  private final Zk2_ ZH;
  
  public Zbh1(Ztwv paramZtwv, Zs0g paramZs0g, Zgso paramZgso, Zg0s paramZg0s, Ztos<Zt1_> paramZtos, Zzpo paramZzpo, Zrny paramZrny) {
    this.ZH = new Zk2_(paramZtwv, paramZs0g, paramZgso, paramZg0s, paramZtos, paramZzpo, paramZrny);
    setOpaque(false);
    int i = Zbhu.ZC();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.rowHeights = new int[] { 0, 10, 0 };
    gridBagLayout.columnWidths = new int[] { 0, 10, 0 };
    setLayout(gridBagLayout);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 1;
    add(this.ZH.ZE(), gridBagConstraints);
    if (i == 0)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public void Zu(Zzbt paramZzbt) {
    this.ZH.Zi(paramZzbt);
  }
  
  public Zzbt Zd() {
    return this.ZH.Zo();
  }
  
  public void Zh(List<Zrdb> paramList) {
    this.ZH.Zh(paramList);
  }
  
  public void ZV(List<Zrdb> paramList) {
    this.ZH.ZV(paramList);
  }
  
  public void ZP(Zrdb paramZrdb, Zb9y paramZb9y, int paramInt) {
    this.ZH.ZP(paramZrdb, paramZb9y, paramInt);
  }
  
  public void Zl(List<Zb2e> paramList, int paramInt1, int paramInt2) {
    this.ZH.Zl(paramList, paramInt1, paramInt2);
  }
  
  public Zbws Zg() {
    return this.ZH.Zf();
  }
  
  public void Zq() {
    this.ZH.Zq();
  }
  
  public void ZE(Zb2e paramZb2e) {
    this.ZH.Zx(paramZb2e);
  }
  
  public void Zf(Zb4f paramZb4f) {
    this.ZH.Zn(paramZb4f);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbh1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */