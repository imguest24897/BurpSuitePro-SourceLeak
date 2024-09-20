package burp;

import java.awt.Dimension;

public class Zexv extends Zexh {
  private final int Zc;
  
  public Zexv() {
    this(300);
  }
  
  public Zexv(int paramInt) {
    this.Zc = paramInt;
    ZB();
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.Zc > 0)
      ZB(); 
  }
  
  public void ZB() {
    int i = ((new Zexh()).getPreferredSize()).height;
    setMinimumSize(new Dimension(this.Zc, i));
    setPreferredSize(new Dimension(this.Zc, i));
  }
  
  private void lambda$setProgress$0(int paramInt) {
    boolean bool = Zm99.ZQ();
    if (paramInt < 0) {
      if (!isIndeterminate()) {
        setIndeterminate(true);
        if (bool) {
          if (isIndeterminate())
            setIndeterminate(false); 
          setValue(paramInt);
          return;
        } 
      } 
      return;
    } 
    if (isIndeterminate())
      setIndeterminate(false); 
    setValue(paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zexv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */