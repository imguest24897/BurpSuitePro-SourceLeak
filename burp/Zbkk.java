package burp;

import java.awt.GridLayout;
import javax.swing.border.EmptyBorder;

public class Zbkk extends Zbqc {
  private final Zm2o Zm;
  
  private final Zm28 ZC;
  
  public Zbkk() {
    this(Zsuk.VERTICAL);
  }
  
  public Zbkk(Zsuk paramZsuk) {
    setLayout(new GridLayout(paramZsuk.Zo, paramZsuk.ZO, paramZsuk.ZD, paramZsuk.ZP));
    this.Zm = new Zm2o();
    add(this.Zm);
    this.ZC = new Zm28();
    add(this.ZC);
    setBorder(new EmptyBorder(0, 0, 0, 5));
  }
  
  public void ZB(Zk97 paramZk97, Zgdq paramZgdq, String paramString) {
    this.Zm.Zi(paramZk97);
    this.ZC.ZP(paramZgdq, paramString);
  }
  
  public void ZM(boolean paramBoolean) {
    this.ZC.setEnabled(paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbkk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */