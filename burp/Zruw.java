package burp;

import java.util.function.Consumer;

public class Zruw {
  private final Zra1 ZH;
  
  private final Zskh ZB;
  
  private Consumer<String> ZQ = Zruw::lambda$new$0;
  
  private Consumer<Zb6l> Za = Zruw::lambda$new$1;
  
  private Consumer<Zb6l> ZD = Zruw::lambda$new$1;
  
  public Zruw(Zra1 paramZra1, Zskh paramZskh) {
    this.ZH = paramZra1;
    this.ZB = paramZskh;
  }
  
  public Zruw Zx(Consumer<String> paramConsumer) {
    this.ZQ = paramConsumer;
    return this;
  }
  
  public Zruw Zv(Consumer<Zb6l> paramConsumer) {
    this.Za = paramConsumer;
    return this;
  }
  
  public Zruw ZJ(Consumer<Zb6l> paramConsumer) {
    this.ZD = paramConsumer;
    return this;
  }
  
  public Zbuz ZR() {
    return new Zsm0(this.ZH, this.ZB, this.ZQ, this.Za, this.ZD);
  }
  
  private static void lambda$new$1(Zb6l paramZb6l) {}
  
  private static void lambda$new$0(String paramString) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zruw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */