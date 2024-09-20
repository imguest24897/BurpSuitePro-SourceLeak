package burp;

import java.util.function.Consumer;

public class Zg0s extends Zg04<Zb2e> {
  private static String[] Zq;
  
  public Zg0s(Zefg<Zb2e> paramZefg) {
    super(paramZefg);
  }
  
  public void ZN(int paramInt, Consumer<Zb2e> paramConsumer) {
    synchronized (this.ZC) {
      stream().filter(paramInt::lambda$issuesForTask$0).forEach(paramConsumer);
    } 
  }
  
  private static boolean lambda$issuesForTask$0(int paramInt, Zb2e paramZb2e) {
    return (paramZb2e.ZBG() == paramInt);
  }
  
  public static void Zm(String[] paramArrayOfString) {
    Zq = paramArrayOfString;
  }
  
  public static String[] ZW() {
    return Zq;
  }
  
  static {
    if (ZW() != null)
      Zm(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg0s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */