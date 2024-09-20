package burp;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.portswigger.Zsy;

public class Zb45 implements Zs9w {
  private final Ztpf Zy;
  
  private final Consumer<Zmxc> Zo;
  
  public Zb45(Zmhe paramZmhe, Zxs7 paramZxs7, Zbnt paramZbnt, Zsy paramZsy, Zgfe paramZgfe, Zspd paramZspd, BiConsumer<Byte, Zsov> paramBiConsumer, Consumer<Zmxc> paramConsumer) {
    this.Zo = paramConsumer;
    this.Zy = new Ztpf(paramZmhe, paramZxs7, paramZbnt, new Zep7(), paramZsy, paramZgfe, paramZspd, paramBiConsumer);
  }
  
  public void Zs(Zz4_ paramZz4_) {
    this.Zo.accept(new Zmxc());
    this.Zy.ZX();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb45.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */