package burp;

import java.util.function.Function;
import net.portswigger.Zip;
import net.portswigger.Zm2;

public class Zkgz implements Zbh {
  private final int ZY;
  
  private final Function<Zbph, Boolean> Zb;
  
  private final Zip ZB;
  
  public Zkgz(Zip paramZip, Function<Zbph, Boolean> paramFunction, int paramInt) {
    this.ZY = paramInt;
    this.Zb = paramFunction;
    this.ZB = paramZip;
  }
  
  public Zexx Ze(Zgh_ paramZgh_, Zbph paramZbph, int paramInt, boolean paramBoolean) {
    int i = Zrjd.ZG();
    if (paramZgh_ instanceof Zshh) {
      Zshh zshh = (Zshh)paramZgh_;
      if (i == 0) {
        if (zshh.ZM().ZEp() == this.ZY) {
          boolean bool = ((Boolean)this.Zb.apply(paramZbph)).booleanValue();
          if (bool && paramBoolean)
            Zm2.ZC(this.ZB); 
          return bool ? Zexx.ALLOWED : Zexx.VETOED_DUE_TO_RELOCATION_TYPE;
        } 
        return Zexx.ALLOWED;
      } 
    } 
    return Zexx.ALLOWED;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkgz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */