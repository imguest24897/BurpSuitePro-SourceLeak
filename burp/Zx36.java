package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zrz9;

class Zx36 extends Zxsr implements Zzj5 {
  Zx36(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zeu4<Zzj5> ZF() {
    return ZJ;
  }
  
  public String Zl() {
    return this.Za.Zf(this, Zkl1.ZE);
  }
  
  public String ZU() {
    return this.Za.Zf(this, Zkl1.Zb);
  }
  
  public List<String> Ze() {
    Zefg zefg = (Zefg)this.Za.ZJ(this, Zkl1.ZM);
    ArrayList<String> arrayList = new ArrayList(zefg.size());
    Zbqc[] arrayOfZbqc = Zlyq.Ze();
    for (Zsdr zsdr : zefg) {
      arrayList.add(zsdr.toString());
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayList;
  }
  
  public String Zq() {
    return this.Za.Zf(this, Zkl1.Ze);
  }
  
  public String ZM() {
    return this.Za.Zf(this, Zkl1.Zz);
  }
  
  public String Zr() {
    return this.Za.Zf(this, Zkl1.ZR);
  }
  
  public String ZH() {
    return this.Za.Zf(this, Zkl1.Zy);
  }
  
  public int ZE() {
    return this.Za.Zx(this, Zkl1.ZS);
  }
  
  public long ZQ() {
    return this.Za.ZL(this, Zkl1.ZF);
  }
  
  public void ZC(Zmp5 paramZmp5) {
    paramZmp5.ZB(this);
  }
  
  public Zrz9 Zu() {
    return Zrz9.SMTP;
  }
  
  public String ZN() {
    return this.Za.Zf(this, Zkl1.Zn);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx36.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */