package burp;

import burp.api.montoya.http.message.requests.HttpRequest;

class Zbpg implements Zg5o {
  private final Zbnt Zw;
  
  private final Zr_4 Zm;
  
  private final Zey9 Zs;
  
  private final Zslu Za;
  
  HttpRequest ZD;
  
  Zbpg(Zbnt paramZbnt, Zr_4 paramZr_4, Zey9 paramZey9, Zslu paramZslu) {
    this.Zw = paramZbnt;
    this.Zm = paramZr_4;
    this.Zs = paramZey9;
    this.Za = paramZslu;
  }
  
  public void Zs(Zr6q paramZr6q) {
    this.ZD = Zsia.ZJ(paramZr6q, this.Zw, this.Zm, this.Zs, this.Za);
  }
  
  public void ZS(Zr6h paramZr6h) {
    this.ZD = Zsik.ZP(paramZr6h, this.Zw, this.Zm, this.Zs, this.Za);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbpg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */