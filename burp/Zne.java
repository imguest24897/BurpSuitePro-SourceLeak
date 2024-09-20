package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zrz9;

class Zne extends Zni implements Zzj5 {
  @Zzvo(3)
  private final String ZK;
  
  @Zzvo(4)
  private final Zefg<Zsdr> ZO;
  
  @Zzvo(5)
  private final String Ze;
  
  @Zzvo(6)
  private final String ZG;
  
  @Zzvo(0)
  private final String ZU;
  
  @Zzvo(1)
  private final String ZB;
  
  @Zzvo(2)
  private final String Zd;
  
  @Zzvo(9)
  private final int ZR;
  
  @Zzvo(7)
  private final long Zj;
  
  @Zzvo(8)
  private final String ZY;
  
  Zne(String paramString1, Zefg<Zsdr> paramZefg, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt, long paramLong, String paramString7) {
    this.ZK = paramString1;
    this.ZO = paramZefg;
    this.Ze = paramString2;
    Zbqc[] arrayOfZbqc = Zlyq.Ze();
    this.ZG = paramString3;
    this.ZU = paramString4;
    this.ZB = paramString5;
    this.Zd = paramString6;
    this.ZR = paramInt;
    this.Zj = paramLong;
    this.ZY = paramString7;
    if (Zbqc.Zwu() == null)
      Zlyq.ZH(new Zbqc[1]); 
  }
  
  public Zeu4<Zzj5> ZF() {
    return ZJ;
  }
  
  public String Zl() {
    return this.ZU;
  }
  
  public String ZU() {
    return this.ZK;
  }
  
  public List<String> Ze() {
    ArrayList<String> arrayList = new ArrayList(this.ZO.size());
    Iterator<Zsdr> iterator = this.ZO.iterator();
    Zbqc[] arrayOfZbqc = Zlyq.Ze();
    while (iterator.hasNext()) {
      Zsdr zsdr = iterator.next();
      arrayList.add(zsdr.toString());
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayList;
  }
  
  public String Zq() {
    return this.Ze;
  }
  
  public String ZM() {
    return this.ZG;
  }
  
  public String Zr() {
    return this.ZB;
  }
  
  public String ZH() {
    return this.Zd;
  }
  
  public int ZE() {
    return this.ZR;
  }
  
  public Zrz9 Zu() {
    return Zrz9.SMTP;
  }
  
  public String ZN() {
    return this.ZY;
  }
  
  public long ZQ() {
    return this.Zj;
  }
  
  public void ZC(Zmp5 paramZmp5) {
    paramZmp5.ZB(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zne.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */