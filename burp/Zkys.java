package burp;

public class Zkys {
  private final Zkit ZJ;
  
  private final Zgpi Zr;
  
  public Zkys(Zkit paramZkit, Zgpi paramZgpi) {
    this.ZJ = paramZkit;
    this.Zr = paramZgpi;
  }
  
  public Zgpi Za() {
    Zeu4<Object> zeu4 = this.Zr.ZF();
    Zm31[] arrayOfZm311 = zeu4.Zc();
    Zgpi zgpi = (Zgpi)this.ZJ.ZH((Zsqx)new Zbjy<>(zeu4));
    Zm31[] arrayOfZm312 = arrayOfZm311;
    Zbqc[] arrayOfZbqc = Zxsr.ZXP();
    int i = arrayOfZm312.length;
    byte b = 0;
    while (b < i) {
      Zm31 zm31 = arrayOfZm312[b];
      zm31.ZB(this.ZJ, this.Zr, zgpi);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return zgpi;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkys.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */