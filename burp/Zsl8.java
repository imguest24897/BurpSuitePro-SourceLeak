package burp;

public class Zsl8 implements Zzxn {
  private final Zeew Zj;
  
  private final Zkc6 ZD;
  
  private final Zey9 ZF;
  
  Zsl8(Zeew paramZeew, Zkc6 paramZkc6, Zey9 paramZey9) {
    this.Zj = paramZeew;
    this.ZD = paramZkc6;
    this.ZF = paramZey9;
  }
  
  public Zzb1 Ze(int paramInt, Zefx paramZefx, Zlhj paramZlhj) {
    Zxnq zxnq = new Zxnq(paramInt, paramZlhj, this.ZF);
    paramZefx.Zi(zxnq);
    Ze1w ze1w = zxnq.ZV;
    this.ZD.Zz(this.Zj, ze1w);
    return ze1w.ZB();
  }
  
  public Zlji Zd(int paramInt, Zefx paramZefx, Zlhj paramZlhj, byte[] paramArrayOfbyte) {
    Zty7 zty7 = new Zty7(paramInt, paramZefx, paramZlhj, paramArrayOfbyte);
    this.ZD.Z_(this.Zj, zty7);
    return new Zlji(zty7);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsl8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */