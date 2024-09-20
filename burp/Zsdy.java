package burp;

import burp.api.montoya.ui.menu.Menu;
import javax.swing.JMenu;

public class Zsdy extends JMenu {
  private static int[] Zc;
  
  public Zsdy(Menu paramMenu) {
    super(paramMenu.caption());
    paramMenu.menuItems().stream().map(Zzv4::Za).forEach(this::add);
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public static void ZT(int[] paramArrayOfint) {
    Zc = paramArrayOfint;
  }
  
  public static int[] ZO() {
    return Zc;
  }
  
  static {
    if (ZO() != null)
      ZT(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsdy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */