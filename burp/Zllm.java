package burp;

import java.util.function.Consumer;
import java.util.function.Function;

class Zllm implements Zeq {
  private final Function<Integer, Zgxp> ZT;
  
  private final Consumer<Zgxp> ZX;
  
  private Zllm(Function<Integer, Zgxp> paramFunction, Consumer<Zgxp> paramConsumer) {
    this.ZT = paramFunction;
    this.ZX = paramConsumer;
  }
  
  public void ZK(int paramInt1, int paramInt2) {
    Zgxp zgxp = this.ZT.apply(Integer.valueOf(paramInt1));
    if (zgxp == null)
      return; 
    this.ZX.accept(zgxp);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zllm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */