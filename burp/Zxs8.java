package burp;

import net.portswigger.Zli;

class Zxs8 {
  private final Ze3n Zm;
  
  private final Zxs7 ZJ;
  
  private byte[] ZQ;
  
  private byte[] Zc;
  
  private Zl1r Zb;
  
  private Zl1r Zj;
  
  private Zvow ZN;
  
  Zxs8(Ze3n paramZe3n, Zxs7 paramZxs7) {
    this.Zm = paramZe3n;
    this.ZJ = paramZxs7;
  }
  
  void ZT(Zlzy paramZlzy, byte[] paramArrayOfbyte, Zb6q paramZb6q, Zs2i paramZs2i, Zz4_ paramZz4_) {
    String str = Zmuh.Zb();
    Zvow zvow = this.Zm.ZI().Zp(paramZs2i.ZE()).Zo(paramZb6q).ZK(paramZs2i.ZO()).Zf(this.Zj).Zf(this.Zb).Zf(Zrlp.Zj(paramZlzy.ZF.ZF, paramZlzy.ZF.Za));
    paramZz4_.Zz(Zsnm.ZB(this.Zm.Za(), this.Zm.ZN(), zvow, this.ZN, this.ZJ, paramArrayOfbyte, this.ZQ, this.Zc));
    if (str != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  void Zn(Zlzy paramZlzy, byte[] paramArrayOfbyte, Zb6q paramZb6q, Zs2i paramZs2i, Zz4_ paramZz4_) {
    Zvow zvow = this.Zm.ZI().Zp(paramZs2i.ZE()).Zo(paramZb6q).ZK(paramZs2i.ZO()).Zf(this.Zj).Zf(Zrlp.Zj(paramZlzy.ZF.ZF, paramZlzy.ZF.Za));
    paramZz4_.Zz(Zsnm.ZN(this.Zm.Za(), this.Zm.ZN(), zvow, this.ZJ, paramArrayOfbyte, this.ZQ));
  }
  
  void Zm(byte[] paramArrayOfbyte, int paramInt) {
    this.ZQ = paramArrayOfbyte;
    this.Zj = Zrlp.Zj(paramInt, paramInt + paramArrayOfbyte.length);
  }
  
  void Zi(int paramInt1, int paramInt2) {
    this.Zb = Zrlp.Zj(paramInt1, paramInt2);
  }
  
  void ZI(byte[] paramArrayOfbyte, Zez3 paramZez3) {
    this.Zc = paramArrayOfbyte;
    int i = Zli.ZR(paramZez3.ZoO().ZiD(), paramArrayOfbyte);
    this.ZN = this.Zm.ZI().Zp(paramZez3.Zos()).Zu(paramZez3.ZoO()).Zf(Zrlp.Zj(i, i + paramArrayOfbyte.length));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxs8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */