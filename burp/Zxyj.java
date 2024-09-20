package burp;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Zxyj implements Ztc7 {
  private final List<ChangeListener> ZG = new CopyOnWriteArrayList<>();
  
  private String Zt;
  
  private String ZE;
  
  private Ze6b Zz;
  
  private Zln7<?> Zj;
  
  public String Zo() {
    return this.Zt;
  }
  
  public void ZJ(String paramString) {
    if (Objects.equals(this.Zt, paramString))
      return; 
    this.Zt = paramString;
    Zq();
  }
  
  public String ZL() {
    return this.ZE;
  }
  
  public void ZI(String paramString) {
    if (Objects.equals(this.ZE, paramString))
      return; 
    this.ZE = paramString;
    Zq();
  }
  
  public Ze6b Ze() {
    return this.Zz;
  }
  
  public void ZF(Ze6b paramZe6b) {
    if (this.Zz == paramZe6b)
      return; 
    this.Zz = paramZe6b;
    Zq();
  }
  
  public Zln7<?> Zn() {
    return this.Zj;
  }
  
  public void ZD(Zln7<?> paramZln7) {
    if (this.Zj == paramZln7)
      return; 
    this.Zj = paramZln7;
    Zq();
  }
  
  public void Zq(ChangeListener paramChangeListener) {
    this.ZG.add(0, paramChangeListener);
  }
  
  public void ZC(ChangeListener paramChangeListener) {
    this.ZG.remove(paramChangeListener);
  }
  
  protected void Zq() {
    ZC(new ChangeEvent(this));
  }
  
  protected void ZC(ChangeEvent paramChangeEvent) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zxyj;Ljavax/swing/event/ChangeEvent;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void lambda$fireStateChanged$1(ChangeEvent paramChangeEvent) {
    this.ZG.forEach(paramChangeEvent::lambda$fireStateChanged$0);
  }
  
  private static void lambda$fireStateChanged$0(ChangeEvent paramChangeEvent, ChangeListener paramChangeListener) {
    paramChangeListener.stateChanged(paramChangeEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxyj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */