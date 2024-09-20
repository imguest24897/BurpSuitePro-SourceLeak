package burp;

public class Zwe extends Zni implements Zzb7 {
  @Zzvo(0)
  private String Zp;
  
  private Zbf6 Zd = Zbf6.GREY;
  
  @Zzvo(2)
  private boolean ZC;
  
  @Zzvo(3)
  private int ZG;
  
  public Zwe(String paramString) {
    this.Zp = paramString;
  }
  
  public String ZyV() {
    return this.Zp;
  }
  
  public void Zti(String paramString) {
    this.Zp = paramString;
  }
  
  public Zbf6 Zyd() {
    return this.Zd;
  }
  
  public void ZC(Zbf6 paramZbf6) {
    this.Zd = paramZbf6;
  }
  
  public boolean Zy7() {
    return this.ZC;
  }
  
  public void Zo(boolean paramBoolean) {
    this.ZC = paramBoolean;
  }
  
  public int Zy5() {
    return this.ZG;
  }
  
  public void ZY0(int paramInt) {
    this.ZG = paramInt;
  }
  
  @Zzvo(1)
  public byte Zsh() {
    return this.Zd.id;
  }
  
  public Zeu4<? extends Zzb7> ZF() {
    return (Zeu4<? extends Zzb7>)ZP;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zwe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */