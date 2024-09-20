package burp;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

class Ztva extends KeyAdapter {
  private final Zspz ZT;
  
  private Ztva(Zspz paramZspz) {
    this.ZT = paramZspz;
  }
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    Zbqc[] arrayOfZbqc = Zr7o.Z_z();
    if (paramKeyEvent.getKeyCode() == 27) {
      this.ZT.Zlm();
      if (arrayOfZbqc == null) {
        if (paramKeyEvent.getKeyCode() == 10)
          this.ZT.Zlt(); 
        return;
      } 
      return;
    } 
    if (paramKeyEvent.getKeyCode() == 10)
      this.ZT.Zlt(); 
  }
  
  private void ZL(Component paramComponent) {
    Zbqc[] arrayOfZbqc = Zr7o.Z_z();
    if (paramComponent instanceof javax.swing.text.JTextComponent) {
      paramComponent.addKeyListener(this);
      if (arrayOfZbqc == null) {
        if (paramComponent instanceof Container)
          Arrays.<Component>stream(((Container)paramComponent).getComponents()).forEach(this::ZL); 
        return;
      } 
      return;
    } 
    if (paramComponent instanceof Container)
      Arrays.<Component>stream(((Container)paramComponent).getComponents()).forEach(this::ZL); 
  }
  
  private void ZT(Component paramComponent) {
    Zbqc[] arrayOfZbqc = Zr7o.Z_z();
    if (paramComponent instanceof javax.swing.text.JTextComponent) {
      paramComponent.removeKeyListener(this);
      if (arrayOfZbqc == null) {
        if (paramComponent instanceof Container)
          Arrays.<Component>stream(((Container)paramComponent).getComponents()).forEach(this::ZT); 
        return;
      } 
      return;
    } 
    if (paramComponent instanceof Container)
      Arrays.<Component>stream(((Container)paramComponent).getComponents()).forEach(this::ZT); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztva.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */