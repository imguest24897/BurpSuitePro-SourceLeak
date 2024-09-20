package burp;

import java.awt.event.HierarchyEvent;

public class Zbjf {
  private final Zbws Zu = new Zbws();
  
  private final Zgku Zo;
  
  public Zbjf(Zg09 paramZg09, Zmug paramZmug) {
    this.Zo = new Zgku(paramZg09, paramZmug, this.Zu);
    this.Zu.ZL(paramZmug);
    String[] arrayOfString = Zxcf.Zq();
    this.Zu.ZF(true);
    this.Zu.setFillsViewportHeight(true);
    this.Zu.setAutoCreateRowSorter(true);
    this.Zu.getTableHeader().setReorderingAllowed(true);
    this.Zu.addHierarchyListener(this::lambda$new$0);
    if (Zbqc.Zwu() == null)
      Zxcf.Zy(new String[3]); 
  }
  
  public void Zd(Zbza paramZbza) {
    String[] arrayOfString = Zxcf.Zq();
    if (!this.Zu.isVisible())
      return; 
    if (paramZbza.Zg1()) {
      this.Zo.ZW(paramZbza);
      if (arrayOfString != null) {
        this.Zo.ZI(paramZbza);
        return;
      } 
      return;
    } 
    this.Zo.ZI(paramZbza);
  }
  
  void Zn(int paramInt1, int paramInt2) {
    this.Zo.Zp(paramInt1, paramInt2);
  }
  
  public Zbws ZV() {
    return this.Zu;
  }
  
  private void lambda$new$0(HierarchyEvent paramHierarchyEvent) {
    if (Zgzm.Zc(paramHierarchyEvent.getChangeFlags(), 2L) && !paramHierarchyEvent.getComponent().isDisplayable())
      this.Zo.ZE(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbjf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */