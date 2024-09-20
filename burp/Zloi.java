package burp;

import net.portswigger.Zz_;

class Zloi implements Zg5l {
  public Zgv_ ZQ(byte[] paramArrayOfbyte, Zb3s paramZb3s, Zsb paramZsb) {
    Zbqc[] arrayOfZbqc = Zgv_.Zm();
    if (paramZb3s != Zb3s.TRANSACTION_STARTED && paramZb3s != Zb3s.RECIPIENTS_SUPPLIED) {
      paramZsb.ZX(paramArrayOfbyte);
      return new Zgv_(Zgzu.Zo, paramZb3s);
    } 
    paramZsb.Zj(paramArrayOfbyte);
    if ((new Zz_(paramArrayOfbyte)).Z_().isEmpty())
      return new Zgv_(Zgzu.Zw, paramZb3s); 
    if (Zbqc.Zwu() == null)
      Zgv_.Zy(new Zbqc[2]); 
    return new Zgv_(Zgzu.Zg, Zb3s.RECIPIENTS_SUPPLIED);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zloi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */