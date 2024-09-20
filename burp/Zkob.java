package burp;

import javax.swing.RowFilter;

class Zkob extends RowFilter.Entry<M, I> {
  int ZY;
  
  final Zm0y Zb;
  
  private Zkob(Zm0y paramZm0y) {}
  
  public M getModel() {
    return (M)this.Zb.Zc().Zo();
  }
  
  public int getValueCount() {
    return this.Zb.Zc().Zm();
  }
  
  public Object getValue(int paramInt) {
    return this.Zb.Zc().ZU(this.ZY, paramInt);
  }
  
  public String getStringValue(int paramInt) {
    return this.Zb.Zc().Zs(this.ZY, paramInt);
  }
  
  public I getIdentifier() {
    return (I)this.Zb.Zc().Zq(this.ZY);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkob.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */