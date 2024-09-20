package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zmz_ extends Zmzn {
  private final Zbkv Zw;
  
  private final Runnable Z_;
  
  public Zmz_(Zbkv paramZbkv, Runnable paramRunnable) {
    this.Zw = paramZbkv;
    this.Z_ = paramRunnable;
  }
  
  protected String Ze() {
    return this.Zw.Zp();
  }
  
  protected int Zn() {
    return this.Zw.Zk();
  }
  
  protected List<Zbjz> ZI() {
    List<Zkv5> list = this.Zw.Zq();
    ArrayList<Zbjz> arrayList = new ArrayList();
    Iterator<Zkv5> iterator = list.iterator();
    String str = Zmzn.ZB();
    while (iterator.hasNext()) {
      Zkv5 zkv5 = iterator.next();
      if (zkv5 instanceof Zbjz) {
        Zbjz zbjz = (Zbjz)zkv5;
        arrayList.add(zbjz);
      } 
      if (str == null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zmzn.ZO("h34kMb"); 
    return arrayList;
  }
  
  protected void ZJ() {
    this.Zw.Zy(Zkv5.ZR((List)this.Zh));
    this.Z_.run();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmz_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */