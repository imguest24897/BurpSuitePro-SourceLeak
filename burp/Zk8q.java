package burp;

import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Zk8q extends Zk82 implements Zsh2 {
  private final List<Consumer<Zgpi<?>>> ZL;
  
  private final BiFunction<Zgpi<?>, Zekb<?>, Object> ZK;
  
  public Zk8q(Zr_4 paramZr_4, List<Consumer<Zgpi<?>>> paramList) {
    this.ZL = paramList;
    Zkit zkit = (Zkit)paramZr_4;
    Objects.requireNonNull(zkit);
    this.ZK = (paramZr_4 instanceof Zkit) ? zkit::ZJ : Zk8q::lambda$new$0;
  }
  
  public void Zd(Zzir paramZzir) {
    Ztew ztew = new Ztew(this);
    ztew.ZT(paramZzir);
  }
  
  public <T extends Zgpi> T Zd(Ztew paramZtew, T paramT) {
    paramT.ZQ(paramT.ZF().Zc(), new Zr1a(this, paramZtew, (Zgpi)paramT));
    return paramT;
  }
  
  public <T extends Zgpi> void ZS(T paramT) {
    this.ZL.forEach(paramT::lambda$objectWalked$1);
  }
  
  private static void lambda$objectWalked$1(Zgpi paramZgpi, Consumer<Zgpi> paramConsumer) {
    paramConsumer.accept(paramZgpi);
  }
  
  private static Object lambda$new$0(Zgpi paramZgpi, Zekb paramZekb) {
    return paramZekb.ZS(paramZgpi);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk8q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */