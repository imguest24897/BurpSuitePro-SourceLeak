package burp;

import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.JTree;

class Zetp extends Zet0 {
  private final boolean ZZ;
  
  private final Map<Zmya, Zeod> Zi;
  
  public Zetp(boolean paramBoolean) {
    this.ZZ = paramBoolean;
    this.Zi = new HashMap<>();
  }
  
  public Component getTreeCellRendererComponent(JTree paramJTree, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4) {
    super.getTreeCellRendererComponent(paramJTree, paramObject, paramBoolean1, paramBoolean2, paramBoolean3, paramInt, paramBoolean4);
    if (paramObject instanceof Zble) {
      Zble zble = (Zble)paramObject;
      Zmnm zmnm = zble.Zg();
      if (zmnm != null) {
        Ztpr ztpr = Zl0.ZJ(zmnm.ZOe());
        setText(ztpr.ZJZ());
        setToolTipText(ztpr.ZJO());
        setIconTextGap((int)(Zrt.ZH() / 1.5F));
        Zlah zlah = zmnm.ZVZ(this.ZZ);
        Zeod zeod = this.Zi.computeIfAbsent(ztpr.ZJC(), Zetp::lambda$getTreeCellRendererComponent$0);
        setIcon(zeod.Zh(zlah));
      } 
      return this;
    } 
    setIcon((Icon)null);
    return this;
  }
  
  private static Zeod lambda$getTreeCellRendererComponent$0(Zmya paramZmya) {
    return new Zeod(paramZmya.ZB());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zetp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */