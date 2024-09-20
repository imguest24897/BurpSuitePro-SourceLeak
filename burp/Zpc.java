package burp;

public class Zpc extends Zni implements Zmjl {
  @Zzvo(1)
  private boolean ZA = false;
  
  @Zzvo(2)
  private final Ze68 ZC;
  
  Zpc(Ze68 paramZe68) {
    this.ZC = paramZe68;
  }
  
  public void ZF7() {
    this.ZA = true;
  }
  
  public boolean ZFn() {
    return this.ZA;
  }
  
  public void Zh(int paramInt, String paramString1, Zk8m paramZk8m, String paramString2) {
    Zg6t.Zf(this.ZC, paramInt, paramString1, paramZk8m, paramString2);
  }
  
  public boolean Zg(int paramInt, String paramString1, Zk8m paramZk8m, String paramString2) {
    return (this.ZA || Zg6t.Zy(this.ZC, paramInt, paramString1, paramZk8m, paramString2));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zpc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */