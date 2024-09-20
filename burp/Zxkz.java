package burp;

import burp.api.montoya.proxy.ProxyWebSocketMessage;

public class Zxkz implements Zkoh<Zzh2, ProxyWebSocketMessage> {
  private final Zm51 ZM;
  
  private final Zskl ZZ;
  
  private final Zbp5 Za;
  
  private static Zbqc[] Zm;
  
  public Zxkz(Zm51 paramZm51, Zskl paramZskl, Zbp5 paramZbp5) {
    this.ZM = paramZm51;
    this.ZZ = paramZskl;
    this.Za = paramZbp5;
  }
  
  public Zzvl<Zzh2> Zo(String paramString, Zex3<ProxyWebSocketMessage, Object> paramZex3, Zsuf paramZsuf) {
    Zs4l<ProxyWebSocketMessage, Object> zs4l = new Zs4l<>(paramString, this.ZM, paramZex3, 60000L);
    zs4l.Zf(paramZsuf);
    return new Zss_(zs4l, this.ZZ, this.Za);
  }
  
  public static void ZM(Zbqc[] paramArrayOfZbqc) {
    Zm = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zm() {
    return Zm;
  }
  
  static {
    if (Zm() != null)
      ZM(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxkz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */