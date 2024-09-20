package burp;

import java.util.Collection;
import java.util.Iterator;

public class Zkj2 extends Zkj9 {
  private final Zl4a ZY;
  
  public Zkj2(Collection<Zmln> paramCollection, Zl4a paramZl4a) {
    this.ZY = paramZl4a;
    Iterator<Zmln> iterator = paramCollection.iterator();
    int[] arrayOfInt = Zmln.Za();
    while (iterator.hasNext()) {
      Zmln zmln = iterator.next();
      Zepe zepe = new Zepe(zmln.displayString);
      zepe.setName(zmln.componentName);
      zepe.addActionListener(new Zzej(this, zmln));
      add(zepe);
      if (arrayOfInt != null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkj2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */