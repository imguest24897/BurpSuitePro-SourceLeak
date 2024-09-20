package burp;

import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.swing.JToggleButton;

public class Zz8s extends JToggleButton {
  private final List<Zgun> ZR;
  
  private Zlkk ZJ;
  
  private Ze9n ZS;
  
  public Zz8s() {
    this(new Zgun[0]);
  }
  
  public Zz8s(Zgun... paramVarArgs) {
    this.ZR = Arrays.asList(paramVarArgs);
    setFocusable(false);
  }
  
  public Zz8s(Zlkk paramZlkk, Zgun... paramVarArgs) {
    this.ZR = Arrays.asList(paramVarArgs);
    ZO(this.ZR.getFirst());
    setFocusable(false);
    ZW(paramZlkk);
    addActionListener(this::lambda$new$0);
    ZL();
  }
  
  public void ZW(Zlkk paramZlkk) {
    this.ZJ = paramZlkk;
    setBackground(paramZlkk.ZS());
  }
  
  public void setSelected(boolean paramBoolean) {
    super.setSelected(paramBoolean);
    Zp();
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZJ != null)
      setBackground(this.ZJ.ZS()); 
  }
  
  private void Zp() {
    Zd(isSelected()).ifPresent(this::ZO);
  }
  
  private Optional<Zgun> Zd(boolean paramBoolean) {
    Zmpl zmpl = paramBoolean ? Zmpl.SELECTED : Zmpl.NORMAL;
    return this.ZR.stream().filter(zmpl::lambda$getIconConfig$1).findFirst();
  }
  
  private void ZO(Zgun paramZgun) {
    this.ZS = paramZgun.Zc;
    setIcon(paramZgun.Zc);
  }
  
  private void ZL() {
    addMouseListener(new Zbq(this));
  }
  
  private static boolean lambda$getIconConfig$1(Zmpl paramZmpl, Zgun paramZgun) {
    return (paramZgun.Zh == paramZmpl);
  }
  
  private void lambda$new$0(ActionEvent paramActionEvent) {
    Zp();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz8s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */