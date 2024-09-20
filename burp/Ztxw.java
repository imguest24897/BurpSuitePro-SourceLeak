package burp;

class Ztxw implements Zrcs {
  private final Zey9 ZU;
  
  private final byte[] ZI;
  
  private Zefx Zv;
  
  private Ztxw(Zey9 paramZey9, byte[] paramArrayOfbyte) {
    this.ZU = paramZey9;
    this.ZI = paramArrayOfbyte;
  }
  
  public void Zs(Zr6q paramZr6q) {
    int i = paramZr6q.ZN();
    if (i == -1) {
      this.Zv = paramZr6q;
      return;
    } 
    byte[] arrayOfByte = new byte[i + this.ZI.length];
    System.arraycopy(paramZr6q.ZD(), 0, arrayOfByte, 0, i);
    System.arraycopy(this.ZI, 0, arrayOfByte, i, this.ZI.length);
    Zmzk zmzk = paramZr6q.ZT();
    this.Zv = this.ZU.ZY(zmzk, arrayOfByte);
  }
  
  public void ZS(Zr6h paramZr6h) {
    this.Zv = this.ZU.ZR(paramZr6h.ZT(), paramZr6h.ZK(), this.ZI);
  }
  
  public Zefx ZK() {
    return this.Zv;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztxw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */