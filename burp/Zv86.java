package burp;

import burp.api.montoya.core.ByteArray;
import java.util.Iterator;

class Zv86 implements Iterator<ByteArray> {
  private final Iterator<Zstu> ZT = this.Zj.ZE.iterator();
  
  final Zbor Zj;
  
  Zv86(Zbor paramZbor) {}
  
  public boolean hasNext() {
    return this.ZT.hasNext();
  }
  
  public ByteArray Zy() {
    return Zsyg.ZJ(this.ZT.next(), this.Zj.ZW);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv86.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */