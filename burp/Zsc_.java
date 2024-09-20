package burp;

import java.awt.EventQueue;
import java.util.Iterator;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zsc_ {
  private final Zeed Zx;
  
  private final ObservableList<Zrw9> Zc;
  
  private static int ZJ;
  
  public Zsc_(Zeed paramZeed) {
    this.Zx = paramZeed;
    this.Zc = FXCollections.observableArrayList();
    Iterator<Zraj> iterator = paramZeed.ZIW().iterator();
    int i = ZW();
    while (iterator.hasNext()) {
      Zraj zraj = iterator.next();
      this.Zc.add(new Zrw9(zraj, (BooleanProperty)new SimpleBooleanProperty(true)));
      if (i == 0)
        break; 
    } 
  }
  
  public Zrw9 Zm(int paramInt) {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    return (Zrw9)this.Zc.get(paramInt);
  }
  
  public void Ze(Zrw9 paramZrw9) {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    this.Zx.ZIW().addFirst(paramZrw9.ZS());
    this.Zc.addFirst(paramZrw9);
  }
  
  public int ZE() {
    return this.Zc.size();
  }
  
  public void Zf(ListChangeListener<Zrw9> paramListChangeListener) {
    this.Zc.addListener(paramListChangeListener);
  }
  
  public void Zv(ListChangeListener<Zrw9> paramListChangeListener) {
    this.Zc.removeListener(paramListChangeListener);
  }
  
  public static void ZE(int paramInt) {
    ZJ = paramInt;
  }
  
  public static int Zc() {
    return ZJ;
  }
  
  public static int ZW() {
    int i = Zc();
    return (i == 0) ? 30 : 0;
  }
  
  static {
    if (Zc() != 0)
      ZE(15); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsc_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */