package burp;

import java.util.Collection;
import javax.swing.tree.DefaultMutableTreeNode;

class Zl3u extends DefaultMutableTreeNode implements Zg7t {
  private volatile Zrdb Zm;
  
  private volatile String ZC = "";
  
  Zl3u(Zpg paramZpg) {
    super(paramZpg);
  }
  
  public String toString() {
    return this.ZC;
  }
  
  public Zrdb ZH() {
    return this.Zm;
  }
  
  void Zf(Zrdb paramZrdb, String paramString) {
    this.Zm = paramZrdb;
    this.ZC = paramString;
  }
  
  void Zb(Collection<Zrdb> paramCollection) {
    ((Zpg)getUserObject()).Z_(paramCollection);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl3u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */