package burp;

public class Zzto implements IIntruderAttack {
  private final Zsh8 ZO;
  
  public static IIntruderAttack Z_(Zsh8 paramZsh8) {
    return new Zmxs(new Zzto(paramZsh8));
  }
  
  private Zzto(Zsh8 paramZsh8) {
    this.ZO = paramZsh8;
  }
  
  public IHttpService getHttpService() {
    Zmzk zmzk = Zz96.Zm(this.ZO.ZPE().ZwZ());
    return Zb28.ZU(zmzk);
  }
  
  public byte[] getRequestTemplate() {
    return (byte[])this.ZO.ZPJ().ZiD().clone();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzto.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */