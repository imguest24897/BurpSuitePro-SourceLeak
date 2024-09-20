package burp;

import java.util.List;

class Zr54 implements Zsh2 {
  private final Zrej Zy;
  
  private final List<Zsh2> Zw;
  
  Zr54(Zrej paramZrej, List<Zsh2> paramList) {
    this.Zy = paramZrej;
    this.Zw = paramList;
  }
  
  public void Zd(Zzir paramZzir) {
    if (this.Zy.Za())
      this.Zw.forEach(paramZzir::lambda$sanitize$0); 
  }
  
  private static void lambda$sanitize$0(Zzir paramZzir, Zsh2 paramZsh2) {
    paramZsh2.Zd(paramZzir);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr54.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */