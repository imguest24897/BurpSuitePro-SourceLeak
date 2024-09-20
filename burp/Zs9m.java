package burp;

import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zs9m {
  private final Zxz1 Zh;
  
  private final Zbnt Zy;
  
  private final Zm6e Zb;
  
  private final Zey9 ZS;
  
  public Zs9m(Zxz1 paramZxz1, Zbnt paramZbnt, Zkl6 paramZkl6) {
    this.Zh = paramZxz1;
    this.Zy = paramZbnt;
    int i = Zg7i.Zn();
    this.Zb = paramZkl6.Zs();
    this.ZS = paramZkl6.ZH();
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Zg7i Zm(Zmzk paramZmzk, byte[][] paramArrayOfbyte, Zs6y... paramVarArgs) {
    int i = Zg7i.Zn();
    try {
      Zs6y[] arrayOfZs6y = new Zs6y[paramArrayOfbyte.length + paramVarArgs.length];
      byte b = 0;
      while (b < paramArrayOfbyte.length) {
        Zax zax = new Zax(paramZmzk, paramArrayOfbyte[b]);
        byte[] arrayOfByte = this.Zb.ZO().Zf(zax).Zr().ZiD();
        Zg3d zg3d = this.Zh.ZV(this.ZS.ZY(paramZmzk, arrayOfByte));
        try {
          if (zg3d.Zb() != Zvom.STREAMING_RESPONSE)
            try {
              if (zg3d.Ze() != null && zg3d.Ze().Za().Zpu() != 0) {
                Zstu zstu = zg3d.Ze().Za();
                Zs68 zs68 = Zbwc.Zt(zax, zstu, Zt0k.HTML_ANALYSIS, this.Zy);
                arrayOfZs6y[b] = Z_(zax, zstu, zs68);
                if (b + 1 < paramArrayOfbyte.length)
                  try {
                    Thread.sleep(1000L);
                  } catch (InterruptedException interruptedException) {
                    Zah.Zl(interruptedException, Zk_.IGNORED);
                  }  
                b++;
                if (i != 0)
                  break; 
                continue;
              } 
            } catch (InterruptedException interruptedException) {
              throw a(null);
            }  
        } catch (InterruptedException interruptedException) {
          throw a(null);
        } 
        return null;
      } 
      System.arraycopy(paramVarArgs, 0, arrayOfZs6y, b, paramVarArgs.length);
      return new Zg7i(arrayOfZs6y);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  private Zs6y Z_(Zlit paramZlit, Zstu paramZstu, Zs68 paramZs68) {
    List<Zg8y> list = (new Zm4c<>(this.Zy)).Zn().Zw().ZW(Zski.Zf(paramZlit), paramZs68);
    return (new Zk1s()).Zx(paramZstu, paramZs68).Zw(list).ZF();
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs9m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */