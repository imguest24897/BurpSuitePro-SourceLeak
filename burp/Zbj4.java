package burp;

public class Zbj4 {
  private final Zgb6 Zh;
  
  private final Zbnt ZR;
  
  private final Zr_4 ZM;
  
  private final Ze47 Zw;
  
  private final Zey9 ZQ;
  
  public Zbj4(Zgb6 paramZgb6, Zbnt paramZbnt, Zr_4 paramZr_4, Ze47 paramZe47, Zey9 paramZey9) {
    this.Zh = paramZgb6;
    this.ZR = paramZbnt;
    this.ZM = paramZr_4;
    this.Zw = paramZe47;
    this.ZQ = paramZey9;
  }
  
  Zvo1 Zm(Zex_ paramZex_, int[] paramArrayOfint) {
    return this.Zh.ZfP() ? this.ZM.<Zvo1>ZH(new Ze1s(paramZex_.Zf(), paramZex_.ZS().ZD(), paramZex_.ZM().map(Zb6q::Za).map(Zstu::ZiD).orElse(null), paramZex_.ZA(), paramZex_.Zj(), paramArrayOfint, this.ZR, this.ZQ, paramZex_.Zx())) : Zu(paramZex_, paramArrayOfint, null, null);
  }
  
  Zvo1 Zu(Zex_ paramZex_, int[] paramArrayOfint, String paramString1, String paramString2) {
    Zkyt zkyt = (paramZex_.ZU() == Zgsq.AUTO) ? this.Zw.Zw(paramZex_.Zf()) : Zgsq.Zj(paramZex_.ZU());
    return this.ZM.<Zvo1>ZH(new Ze1p(paramZex_.ZS(), zkyt, paramZex_.ZM().map(Zb6q::Za).map(Zstu::ZiD).orElse(null), paramZex_.ZA(), paramZex_.Zj(), paramArrayOfint, this.ZR, paramString1, paramString2, paramZex_.Zx()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbj4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */