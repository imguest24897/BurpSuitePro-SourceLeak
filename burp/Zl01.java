package burp;

public class Zl01 extends Zl04 implements Zzyl {
  private final Zbhx Zb;
  
  public Zl01(Zbhx paramZbhx) {
    this.Zb = paramZbhx;
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    switch (paramInt) {
      case 266817:
        this.Zb.Zb(Zl01::lambda$handleAction$0);
        return true;
      case 266818:
        this.Zb.Zb(Zl01::lambda$handleAction$1);
        return true;
    } 
    return false;
  }
  
  private static boolean lambda$handleAction$1(Zrm5 paramZrm5) {
    return paramZrm5 instanceof Zbhu;
  }
  
  private static boolean lambda$handleAction$0(Zrm5 paramZrm5) {
    return paramZrm5 instanceof Zbh3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl01.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */