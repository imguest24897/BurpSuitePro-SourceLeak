package burp;

import java.awt.Component;
import java.util.Map;
import java.util.function.Consumer;
import javax.swing.border.EmptyBorder;

public class Zm2_ extends Zm99 implements Zgmj {
  private static final Map<Zlt5, Consumer<Ze9n>> Zm = Zy();
  
  private final Ze9n ZK;
  
  public Zm2_(Ze9n paramZe9n) {
    this.ZK = paramZe9n;
    setIcon(paramZe9n);
    setBorder(new EmptyBorder(0, 3, 0, 3));
  }
  
  public Component Zn() {
    return this;
  }
  
  public void ZZ(Zlt5 paramZlt5) {
    ((Consumer<Ze9n>)Zm.get(paramZlt5)).accept(this.ZK);
  }
  
  private static Map<Zlt5, Consumer<Ze9n>> Zy() {
    return Map.of(Zlt5.DISABLED, Ze9n::ZH, Zlt5.ACTIVE, Ze9n::Zk, Zlt5.INACTIVE, Ze9n::Zm, Zlt5.INACTIVE_HOVER, Ze9n::Zx);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */