package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Zevv {
  private final Zbnt ZX;
  
  private final List<Zvow> Zf;
  
  private final Map<Long, String> Zd;
  
  private int Zs;
  
  Zevv(Zbnt paramZbnt) {
    this.ZX = paramZbnt;
    this.Zf = new LinkedList<>();
    this.Zd = new HashMap<>();
  }
  
  public void ZU(Zefx paramZefx, Zb6q paramZb6q, String paramString) {
    ArrayList<Zl1r> arrayList = new ArrayList((paramString == null) ? 0 : 1);
    if (paramString != null)
      Zl8v.Zm(paramString, paramZb6q.Za().ZiD(), 0, paramZb6q.Zs(), arrayList, false); 
    this.Zf.add((new Zvow(paramZefx.ZT(), this.ZX)).ZC(paramZefx).Zo(paramZb6q).Z_(arrayList));
  }
  
  public void Zv() {}
  
  public void Zz() {
    this.Zs |= 0x2;
  }
  
  public void ZZ() {
    this.Zs |= 0x8;
  }
  
  public void Zw() {
    this.Zs |= 0x4;
  }
  
  public void ZG(Zefx paramZefx, List<Zl1r> paramList1, Zb6q paramZb6q, List<Zl1r> paramList2) {
    this.Zf.add((new Zvow(paramZefx.ZT(), this.ZX)).ZC(paramZefx).ZK(paramList1).Zo(paramZb6q).Z_(paramList2));
  }
  
  public Zx_5 Zk(byte paramByte1, byte paramByte2, byte paramByte3, Zmzk paramZmzk, byte[] paramArrayOfbyte) {
    return Zgle.Zh(paramByte1, paramByte2, paramByte3, paramZmzk, paramArrayOfbyte, this.Zs, Zx(), this.Zd);
  }
  
  private List<Zlfv<? extends Zgkc>> Zx() {
    ArrayList<Zt2w> arrayList = new ArrayList();
    Iterator<Zvow> iterator = this.Zf.iterator();
    int i = Zzp9.Z_();
    while (iterator.hasNext()) {
      Zvow zvow = iterator.next();
      Zt2w zt2w = new Zt2w(null, zvow);
      arrayList.add(zt2w);
      if (i != 0)
        break; 
    } 
    return (List)arrayList;
  }
  
  public void Zt(Ztz3 paramZtz3, String paramString) {
    this.Zd.put(Long.valueOf(paramZtz3.permanentIndex), paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zevv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */