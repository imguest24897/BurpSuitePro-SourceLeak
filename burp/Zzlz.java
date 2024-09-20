package burp;

import java.util.function.Consumer;

class Zzlz extends Zzlj {
  private final String ZT;
  
  private final Zrdu ZY;
  
  private final String ZH;
  
  private Zzlz(Zbnt paramZbnt, Zey9 paramZey9, Zefx paramZefx, String paramString1, String paramString2, Consumer<Zbi1> paramConsumer) {
    this(paramZbnt, paramZey9, paramZefx, paramString1, null, paramString2, paramConsumer);
  }
  
  private Zzlz(Zbnt paramZbnt, Zey9 paramZey9, Zefx paramZefx, String paramString1, Zrdu paramZrdu, String paramString2, Consumer<Zbi1> paramConsumer) {
    super(paramZey9, paramZefx, paramConsumer, new Zka4(paramZbnt, paramZey9, paramZefx, paramString1, paramZrdu, paramString2));
    this.ZT = paramString1;
    this.ZY = paramZrdu;
    this.ZH = paramString2;
  }
  
  protected byte[] Zt(byte[] paramArrayOfbyte, Zz1p paramZz1p) {
    return Zljl.ZO(paramArrayOfbyte, paramZz1p, this.ZT, this.ZH, (this.ZY != null), false, this.ZY, (this.ZY == null), null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzlz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */