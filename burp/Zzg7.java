package burp;

import java.util.Collections;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;

public class Zzg7 implements Iterable<Zmnm> {
  private final Zefg<Zmnm> Zg;
  
  public Zzg7(Zefg<Zmnm> paramZefg) {
    this.Zg = paramZefg;
  }
  
  public void Zm(Zmnm paramZmnm) {
    if (this.Zg == null)
      return; 
    this.Zg.add(paramZmnm);
  }
  
  public Iterator<Zmnm> iterator() {
    return (this.Zg == null) ? Collections.<Zmnm>emptyIterator() : this.Zg.iterator();
  }
  
  public void forEach(Consumer<? super Zmnm> paramConsumer) {
    if (this.Zg == null)
      return; 
    this.Zg.forEach(paramConsumer);
  }
  
  public Spliterator<Zmnm> spliterator() {
    return (this.Zg == null) ? Spliterators.<Zmnm>emptySpliterator() : this.Zg.spliterator();
  }
  
  public boolean ZM() {
    return (this.Zg != null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzg7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */