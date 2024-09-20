package burp;

import javafx.beans.property.SimpleIntegerProperty;

class Zsfx extends SimpleIntegerProperty {
  Zsfx(Zbcu paramZbcu, int paramInt) {
    super(paramInt);
  }
  
  public void set(int paramInt) {
    super.set(Zbcu.Zn(paramInt));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsfx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */