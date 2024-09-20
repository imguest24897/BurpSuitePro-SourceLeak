package burp;

import java.util.ArrayList;
import net.portswigger.Zkb;

public class Zt0n<C extends Zgd8<M>, M extends Zgpi> extends Ztn0 {
  private Ze5r<C, M> ZR;
  
  public Zt0n() {
    this(new Ze5r<>(new ArrayList<>(), new Zyu<>(null, 0)));
  }
  
  public Zt0n(Ze5r<C, M> paramZe5r) {
    this.ZR = paramZe5r;
    this.Zf = new String[] { "" };
    this.ZV = new byte[] { 0 };
    this.Zc = new int[] { 40 };
    this.Zx = true;
    this.Zu = false;
    this.ZZ = 4;
  }
  
  public int getRowCount() {
    return this.ZR.ZG();
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    C c = this.ZR.ZV(paramInt1);
    return (c instanceof byte[]) ? Zkb.ZG((byte[])c) : ((c instanceof String) ? (Object)c : c.toString());
  }
  
  public C Zv(int paramInt) {
    return this.ZR.ZV(paramInt);
  }
  
  public void Zb(Ze5r<C, M> paramZe5r) {
    this.ZR = paramZe5r;
    fireTableDataChanged();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt0n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */