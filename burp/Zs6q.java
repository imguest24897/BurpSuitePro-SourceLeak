package burp;

public class Zs6q implements Zk8x {
  private static final byte[] ZS = new byte[] { 60, 33, 45, 45 };
  
  private static final byte[] Zf = new byte[] { 45, 45, 62 };
  
  private final Zrzd Z_;
  
  private final Zrzd Zs;
  
  private static final Zzrd Zb = Zzrd.ZJ(Zf, false, false);
  
  Zs6q(Zrzd paramZrzd1, Zrzd paramZrzd2) {
    this.Z_ = paramZrzd1;
    this.Zs = paramZrzd2;
  }
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    int i = paramZm7o.Zz();
    return ZK(paramZstu, i) ? (Zz(paramZstu, i) ? Short.valueOf((short)262) : Short.valueOf((short)256)) : Short.valueOf((short)1);
  }
  
  private boolean ZK(Zstu paramZstu, int paramInt) {
    int i = Zm(paramZstu, paramInt);
    return (ZQ(paramZstu, i) && ZR(paramZstu, i + 1));
  }
  
  private boolean Zz(Zstu paramZstu, int paramInt) {
    int i = ZZ(paramZstu, paramInt);
    return (this.Zs.Zo(paramZstu, i) > 0);
  }
  
  private boolean ZQ(Zstu paramZstu, int paramInt) {
    return Zw(ZS, paramZstu, paramInt) ? Zlt_.ZT(paramZstu, ZS, paramInt) : false;
  }
  
  private boolean ZR(Zstu paramZstu, int paramInt) {
    if (Zw(Zf, paramZstu, paramInt)) {
      int i = Zb.Zi(paramZstu, paramInt, paramZstu.Zpu()).ZR();
      if (i >= 0)
        return ZV(paramZstu, i); 
    } 
    return false;
  }
  
  private boolean Zw(byte[] paramArrayOfbyte, Zstu paramZstu, int paramInt) {
    return (paramInt + paramArrayOfbyte.length < paramZstu.Zpu());
  }
  
  private boolean ZV(Zstu paramZstu, int paramInt) {
    int i = ZZ(paramZstu, paramInt + Zf.length);
    return (i == paramZstu.Zpu());
  }
  
  private int Zm(Zstu paramZstu, int paramInt) {
    int i = ZZ(paramZstu, paramInt);
    int j = i + this.Zs.Zo(paramZstu, i);
    return ZZ(paramZstu, j);
  }
  
  private int ZZ(Zstu paramZstu, int paramInt) {
    return paramInt + this.Z_.Zo(paramZstu, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs6q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */