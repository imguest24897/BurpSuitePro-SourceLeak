package burp;

class Zskq implements Zg5l {
  public Zgv_ ZQ(byte[] paramArrayOfbyte, Zb3s paramZb3s, Zsb paramZsb) {
    if (paramZb3s != Zb3s.CLIENT_INITIATED && paramZb3s != Zb3s.MESSAGE_FINISHED) {
      paramZsb.ZX(paramArrayOfbyte);
      return new Zgv_(Zgzu.Zo, paramZb3s);
    } 
    paramZsb.Zf(paramArrayOfbyte);
    return new Zgv_(Zgzu.Zg, Zb3s.TRANSACTION_STARTED);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zskq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */