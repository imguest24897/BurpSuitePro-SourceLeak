package burp;

import burp.api.montoya.proxy.ProxyHttpRequestResponse;

public class Zzan implements Zkoh<Zeo2, ProxyHttpRequestResponse> {
  private final Zm51 ZA;
  
  private final Zskl Za;
  
  private final Zey9 ZW;
  
  private final Zm6x Zq;
  
  public Zzan(Zm51 paramZm51, Zskl paramZskl, Zey9 paramZey9, Zm6x paramZm6x) {
    this.ZA = paramZm51;
    this.Za = paramZskl;
    this.ZW = paramZey9;
    this.Zq = paramZm6x;
  }
  
  public Zzvl<Zeo2> Zo(String paramString, Zex3<ProxyHttpRequestResponse, Object> paramZex3, Zsuf paramZsuf) {
    Zs4l<ProxyHttpRequestResponse, Object> zs4l = new Zs4l<>(paramString, this.ZA, paramZex3, 60000L);
    zs4l.Zf(paramZsuf);
    Zbqc[] arrayOfZbqc = Zxkz.Zm();
    if (Zbqc.Zwu() == null)
      Zxkz.ZM(new Zbqc[4]); 
    return new Zvok(zs4l, this.Za, this.ZW, this.Zq);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzan.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */