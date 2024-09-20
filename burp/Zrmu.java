package burp;

import net.portswigger.Zdo;

class Zrmu implements Ztf1 {
  private final int ZG;
  
  private final Zbkv Zv;
  
  final Zbgh ZR;
  
  Zrmu(Zbgh paramZbgh, int paramInt, Zgb6 paramZgb6, Zb0h paramZb0h) {
    this.ZG = paramInt;
    this.Zv = new Zbkv(false, paramZgb6, paramZb0h, paramZbgh.Za);
    this.Zv.ZJ();
    this.Zv.ZM(null);
    this.Zv.Zh(true);
    this.Zv.Zx(Zdo.ZQ);
    this.Zv.ZY(true);
  }
  
  public void Zc(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.Zv.ZX(paramArrayOfbyte, paramInt1, paramInt2);
    this.ZR.ZF.Z_(this.ZG, Zlkk.TAB_FLASH_COLOUR.ZS(), true);
  }
  
  public void Z_() {
    this.Zv.Zx(Zdo.ZQ);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrmu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */