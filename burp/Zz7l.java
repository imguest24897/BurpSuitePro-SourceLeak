package burp;

import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collection;
import java.util.List;

class Zz7l extends MouseAdapter {
  private final Zlkk ZQ;
  
  private final Zlkk ZZ;
  
  private final Zbcn Zl;
  
  private final Collection<Zbqc> Zq;
  
  private Zz7l(Zlkk paramZlkk1, Zlkk paramZlkk2, Zbcn paramZbcn, Zbqc... paramVarArgs) {
    this.ZQ = paramZlkk1;
    this.ZZ = paramZlkk2;
    this.Zl = paramZbcn;
    this.Zq = List.of(paramVarArgs);
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    this.Zl.Zl(this.ZZ);
    this.Zq.forEach(this::lambda$mouseEntered$0);
    if (this.Zl.Zd.ZI && !this.Zl.ZM.isSelected())
      this.Zl.setBorder(new Zr6s(new Insets(5, 5, 5, 5), 8, this.ZZ)); 
    super.mouseEntered(paramMouseEvent);
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    this.Zl.Zl(this.ZQ);
    this.Zq.forEach(this::lambda$mouseExited$1);
    if (this.Zl.Zd.ZI && !this.Zl.ZM.isSelected())
      this.Zl.setBorder(new Zr6s(new Insets(5, 5, 5, 5), 8, this.ZQ)); 
    super.mouseExited(paramMouseEvent);
  }
  
  private void lambda$mouseExited$1(Zbqc paramZbqc) {
    paramZbqc.Zl(this.ZQ);
  }
  
  private void lambda$mouseEntered$0(Zbqc paramZbqc) {
    paramZbqc.Zl(this.ZZ);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz7l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */