package burp;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.util.List;
import javax.swing.ButtonGroup;

class Zgoc extends Zbqc {
  private final Zzw8 Zl;
  
  public Zgoc(Zzml paramZzml, Zzw8 paramZzw8) {
    this.Zl = paramZzw8;
    setLayout(new GridLayout(paramZzml.Zk_().isEmpty() ? 1 : 2, 1));
    setBorder(new Zrf5(0, 0, 1, 0, Zlkk.QUESTIONNAIRE_SEPARATOR));
    Zj(paramZzml.Zkv());
    Zu(paramZzml.Zk_());
  }
  
  private void Zj(List<String> paramList) {
    GridLayout gridLayout = new GridLayout(1, paramList.size());
    gridLayout.setHgap(5);
    Zbqc zbqc = new Zbqc(gridLayout);
    zbqc.Zl(Zlkk.QUESTIONNAIRE_BACKGROUND);
    Zbqc[] arrayOfZbqc = Zrv_.ZG();
    ButtonGroup buttonGroup = new ButtonGroup();
    for (String str : paramList) {
      Zz8u zz8u = new Zz8u(str);
      zbqc.add(zz8u);
      buttonGroup.add(zz8u);
      zz8u.addItemListener(this::ZD);
      if (arrayOfZbqc == null)
        break; 
    } 
    add(zbqc);
  }
  
  private void ZD(ItemEvent paramItemEvent) {
    if (paramItemEvent.getStateChange() == 1) {
      Zz8u zz8u = (Zz8u)paramItemEvent.getSource();
      this.Zl.ZV(zz8u.getText());
    } 
  }
  
  private void Zu(List<String> paramList) {
    Zbqc[] arrayOfZbqc = Zrv_.ZG();
    if (paramList.isEmpty())
      return; 
    int i = paramList.size();
    GridLayout gridLayout = new GridLayout(1, i);
    gridLayout.setHgap(5);
    Zbqc zbqc = new Zbqc(gridLayout);
    zbqc.Zl(Zlkk.QUESTIONNAIRE_BACKGROUND);
    byte b = 0;
    while (b < i) {
      String str = paramList.get(b);
      Zm99 zm99 = new Zm99(str);
      zm99.ZE(Zt00.SMALL_REGULAR);
      zm99.setHorizontalAlignment(Zm(i, b));
      zbqc.add(zm99);
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    add(zbqc);
  }
  
  private static int Zm(int paramInt1, int paramInt2) {
    return (paramInt2 == 0) ? 2 : ((paramInt2 == paramInt1 - 1) ? 4 : 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgoc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */