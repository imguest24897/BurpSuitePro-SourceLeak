package burp;

import net.portswigger.Zsy;

class Zmos implements Zrbu {
  private final int ZM;
  
  private final int ZY;
  
  private final Zsy Zy;
  
  private final Zbjl Zd;
  
  Zmos(Zsy paramZsy, Zbjl paramZbjl, int paramInt1, int paramInt2) {
    this.Zy = paramZsy;
    this.Zd = paramZbjl;
    this.ZM = paramInt1;
    this.ZY = paramInt2;
  }
  
  public Zzwz Zc(Zxs7 paramZxs7) {
    return new Zkm1(Zk7g.EXTERNAL_SERVICE_INTERACTION, this.Zy, this.ZM, this.ZY, this.Zd, paramZxs7);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmos.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */