package burp;

import java.awt.LayoutManager;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Zbqc extends JPanel {
  private Zlkk Zp;
  
  private static Zbqc[] Ze;
  
  public Zbqc() {}
  
  public Zbqc(String paramString) {
    setName(paramString);
  }
  
  public Zbqc(LayoutManager paramLayoutManager) {
    setLayout(paramLayoutManager);
  }
  
  public void Zl(Zlkk paramZlkk) {
    setBackground(paramZlkk.ZS());
    this.Zp = paramZlkk;
  }
  
  public void setBorder(Border paramBorder) {
    if (paramBorder instanceof TitledBorder)
      ((TitledBorder)paramBorder).setTitleFont(Zt00.DEFAULT_FONT.ZV()); 
    super.setBorder(paramBorder);
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.Zp != null)
      setBackground(this.Zp.ZS()); 
  }
  
  public static void Zr(Zbqc[] paramArrayOfZbqc) {
    Ze = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zwu() {
    return Ze;
  }
  
  static {
    if (Zwu() == null)
      Zr(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbqc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */