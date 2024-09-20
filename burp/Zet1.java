package burp;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTree;

class Zet1 extends Zet_ {
  private final boolean ZI;
  
  Zet1(boolean paramBoolean) {
    this.ZI = paramBoolean;
  }
  
  public Component getTreeCellRendererComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4) {
    super.getTreeCellRendererComponent(paramJTree, paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt, paramBoolean4);
    if (paramObject instanceof Zg7t) {
      Zrdb zrdb = ((Zg7t)paramObject).ZH();
      ImageIcon imageIcon = this.ZI ? Ztvx.ZO(zrdb.ZaJ(), zrdb.Zac(), false) : Ztvx.ZO(zrdb.Zaw(), zrdb.Zak(), false);
      setIcon(imageIcon);
    } 
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zet1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */