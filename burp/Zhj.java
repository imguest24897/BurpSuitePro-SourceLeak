package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

class Zhj extends Zni implements Ztrm {
  @Zzvo(1)
  private final Zefg<Zgnc> Zf;
  
  private final Zxwm ZT;
  
  Zhj(Zefg<Zgnc> paramZefg, Zxwm paramZxwm) {
    this.Zf = paramZefg;
    this.ZT = paramZxwm;
  }
  
  public Iterator<Zgnc> iterator() {
    return this.Zf.iterator();
  }
  
  public void forEach(Consumer<? super Zgnc> paramConsumer) {
    this.Zf.forEach(paramConsumer);
  }
  
  public Spliterator<Zgnc> spliterator() {
    return this.Zf.spliterator();
  }
  
  public int Zb() {
    return this.Zf.size();
  }
  
  public Collection<Zgnc> ZzQ() {
    return Collections.unmodifiableCollection(this.Zf);
  }
  
  public Zgnc Zzh() {
    int i = Zkre.ZP();
    if (Zbqc.Zwu() == null)
      Zkre.ZE(++i); 
    return this.Zf.get(this.Zf.size() - 1);
  }
  
  public void Zy(Zgnc paramZgnc) {
    this.Zf.add(paramZgnc);
  }
  
  public Zxwm Zw() {
    return this.ZT;
  }
  
  @Zzvo(2)
  private int ZNi() {
    return this.ZT.permanentIndex;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zhj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */