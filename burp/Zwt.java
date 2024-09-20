package burp;

public class Zwt extends Zni implements Zsh0 {
  @Zzvo(1)
  private boolean Zu;
  
  @Zzvo(2)
  private boolean ZC;
  
  public Zwt(boolean paramBoolean1, boolean paramBoolean2) {
    this.Zu = paramBoolean1;
    this.ZC = paramBoolean2;
  }
  
  public boolean Zjo() {
    return this.Zu;
  }
  
  public void Zre(boolean paramBoolean) {
    this.Zu = paramBoolean;
  }
  
  public boolean Zj7() {
    return this.ZC;
  }
  
  public void Zrj(boolean paramBoolean) {
    this.ZC = paramBoolean;
  }
  
  public String toString() {
    return Zg5x.Zh(this);
  }
  
  public boolean equals(Object paramObject) {
    if (Zewd.ZI(this, (Zgpi)paramObject))
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zwt zwt = (Zwt)paramObject;
    return Zg5x.Zs(this, zwt);
  }
  
  public int hashCode() {
    return Zg5x.ZW(this);
  }
  
  public Zeu4<? extends Zsh0> ZF() {
    return Zsh0.Zt;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zwt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */