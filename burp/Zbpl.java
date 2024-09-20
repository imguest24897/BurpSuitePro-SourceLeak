package burp;

import java.util.Map;

class Zbpl extends Zbpj<Map.Entry<K, V>> {
  private Zr6i ZK = null;
  
  final Zrlv ZL;
  
  private Zbpl(Zrlv paramZrlv) {
    super(paramZrlv);
  }
  
  public Map.Entry<K, V> ZR() {
    this.ZK = new Zr6i(this, ZY());
    return this.ZK;
  }
  
  public void remove() {
    this.ZY = (null == this.ZK) ? -1 : this.ZK.Zy;
    super.remove();
    this.ZK.Zy = this.ZY;
    this.ZK = null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbpl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */