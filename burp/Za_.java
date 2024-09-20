package burp;

import java.io.IOException;
import net.portswigger.Zkb;
import net.portswigger.Zrzt;

class Za_ extends Zni implements Zmo2 {
  @Zzvo(0)
  private String ZV = "";
  
  private Zkk3 Zm;
  
  @Zzvo(1)
  private boolean ZC;
  
  @Zzvo(3)
  private String Zy = "";
  
  @Zzvo(4)
  private String Zx = "";
  
  Za_(Zr_4 paramZr_4) {
    Zg05 zg05 = (new Zxlb()).ZU(paramZr_4);
    this.Zm = new Zkk3(zg05, paramZr_4);
  }
  
  public String ZE(byte[] paramArrayOfbyte, Zs68 paramZs68) {
    int[] arrayOfInt = this.Zm.Zh(paramArrayOfbyte, null, paramZs68.Zk);
    if (arrayOfInt != null) {
      String str = Zkb.Zo(paramArrayOfbyte, arrayOfInt[0], arrayOfInt[1] - arrayOfInt[0]);
      if (this.ZC)
        str = Zrzt.ZJ(str); 
      return str;
    } 
    return null;
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    Zl1i.Zg(this, paramZs4f);
  }
  
  public String ZuR() {
    return this.ZV;
  }
  
  public void ZoJ(String paramString) {
    this.ZV = paramString;
  }
  
  public String Zun() {
    return this.Zy;
  }
  
  public void Zos(String paramString) {
    this.Zy = paramString;
  }
  
  public String Zu0() {
    return this.Zx;
  }
  
  public void ZoL(String paramString) {
    this.Zx = paramString;
  }
  
  public Zkk3 Zu7() {
    return this.Zm;
  }
  
  @Zzvo(2)
  private Zg05 Zff() {
    return this.Zm.Z_();
  }
  
  public void Zb(Zkk3 paramZkk3) {
    this.Zm = paramZkk3;
  }
  
  public boolean ZuY() {
    return this.ZC;
  }
  
  public void Znt(boolean paramBoolean) {
    this.ZC = paramBoolean;
  }
  
  public Zlwx ZuW() {
    return Zlcq.Zu(this);
  }
  
  public Zeu4<? extends Zmo2> ZF() {
    return ZL;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Za_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */