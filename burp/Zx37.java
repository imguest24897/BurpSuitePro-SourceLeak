package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Zx37 extends Zxsr implements Ztrm {
  protected Zx37(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  private Zefg<Zgnc> Za8() {
    return (Zefg<Zgnc>)this.Za.ZJ(this, Zkly.Zu);
  }
  
  public Iterator<Zgnc> iterator() {
    return Za8().iterator();
  }
  
  public void forEach(Consumer<? super Zgnc> paramConsumer) {
    Za8().forEach(paramConsumer);
  }
  
  public Spliterator<Zgnc> spliterator() {
    return Za8().spliterator();
  }
  
  public int Zb() {
    return Za8().size();
  }
  
  public Collection<Zgnc> ZzQ() {
    return Collections.unmodifiableCollection(Za8());
  }
  
  public Zgnc Zzh() {
    return Za8().get(Za8().size() - 1);
  }
  
  public void Zy(Zgnc paramZgnc) {
    Za8().add(paramZgnc);
  }
  
  public Zxwm Zw() {
    return Zxwm.ZG(this.Za.Zx(this, Zkly.Ze));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx37.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */