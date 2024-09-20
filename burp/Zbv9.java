package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import net.portswigger.Zop;
import net.portswigger.Zqe;

public class Zbv9 extends Zbqc {
  private final Zbka ZM = new Zbka();
  
  private final Zbqc ZT = new Zbqc();
  
  private final Zbke Zw = new Zbke();
  
  private final Zbke ZQ = new Zbke();
  
  private final Zbke Zf = new Zbke();
  
  private final Zbke ZV = new Zbke();
  
  private final Zem9 Zh = new Zem9();
  
  private final Zem9 ZO = new Zem9();
  
  private final Zem9 ZJ = new Zem9();
  
  public void ZB(Zop paramZop) {
    setLayout(new GridBagLayout());
    ZR(paramZop.ZZ);
    Ze(paramZop);
  }
  
  private void ZR(Zqe paramZqe) {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.ZM, gridBagConstraints);
    this.ZM.Zd(paramZqe);
  }
  
  private void Ze(Zop paramZop) {
    this.ZT.setLayout(new GridBagLayout());
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.anchor = 23;
    this.ZT.add(this.Zf, gridBagConstraints);
    this.Zh.setOrientation(1);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.fill = 3;
    gridBagConstraints.insets = new Insets(0, 20, 0, 20);
    this.ZT.add(this.Zh, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.anchor = 23;
    this.ZT.add(this.Zw, gridBagConstraints);
    this.ZO.setOrientation(1);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.fill = 3;
    gridBagConstraints.insets = new Insets(0, 20, 0, 20);
    this.ZT.add(this.ZO, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.anchor = 23;
    this.ZT.add(this.ZQ, gridBagConstraints);
    this.ZJ.setOrientation(1);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 5;
    gridBagConstraints.fill = 3;
    gridBagConstraints.insets = new Insets(0, 20, 0, 20);
    this.ZT.add(this.ZJ, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    this.ZT.add(this.ZV, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.anchor = 21;
    add(this.ZT, gridBagConstraints);
    this.Zf.ZR(Ze1c.MEMORY_LOAD, paramZop.ZK);
    this.Zw.ZR(Ze1c.CPU_LOAD, paramZop.Zc);
    this.ZQ.ZR(Ze1c.TIME, paramZop.ZV);
    this.ZV.ZR(Ze1c.SCAN_SPEED, paramZop.ZR);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbv9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */