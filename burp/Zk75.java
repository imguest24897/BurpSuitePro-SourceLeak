package burp;

import net.portswigger.Zkb;

public class Zk75 {
  public final String Zi;
  
  public final int ZU;
  
  public final boolean Zo;
  
  public final byte[] ZI;
  
  public final Zr42 Zc;
  
  public Zk75(Zlit paramZlit, byte[] paramArrayOfbyte) {
    this(paramZlit.Zd1(), paramZlit.Zda(), paramZlit.Zdr(), paramArrayOfbyte);
  }
  
  public Zk75(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte) {
    this.Zi = paramString.trim();
    this.ZU = paramInt;
    this.Zo = paramBoolean;
    this.ZI = paramArrayOfbyte;
    this.Zc = ZU();
  }
  
  protected Zr42 ZU() {
    return this.Zi.isEmpty() ? Zr42.BAD_HOST : ((this.ZU < 0) ? Zr42.BAD_PORT : ((Zkb.ZG(this.ZI).trim().isEmpty() || Zsbj.Za(this.ZI) < 0) ? Zr42.BAD_REQUEST : null));
  }
  
  boolean Zh() {
    return (this.Zc == null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk75.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */