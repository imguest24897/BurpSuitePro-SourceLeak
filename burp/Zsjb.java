package burp;

import java.util.Arrays;
import java.util.function.Function;
import net.portswigger.Zip;
import net.portswigger.Zm2;

public class Zsjb implements Zbh {
  private final Zs66[] Zi;
  
  private final Function<Zbph, Boolean> Zb;
  
  private final Zip ZI;
  
  public Zsjb(Zip paramZip, Function<Zbph, Boolean> paramFunction, Zs66... paramVarArgs) {
    this.ZI = paramZip;
    this.Zi = paramVarArgs;
    this.Zb = paramFunction;
  }
  
  public Zexx Ze(Zgh_ paramZgh_, Zbph paramZbph, int paramInt, boolean paramBoolean) {
    if (paramZgh_ instanceof Zt4_)
      return Zexx.ALLOWED; 
    if (Arrays.<Zs66>asList(this.Zi).contains(paramZgh_.ZG())) {
      boolean bool = !((Boolean)this.Zb.apply(paramZbph)).booleanValue() ? true : false;
      if (bool && paramBoolean)
        Zm2.ZC(this.ZI); 
      return bool ? Zexx.VETOED_DUE_TO_INSERTION_POINT_TYPE : Zexx.ALLOWED;
    } 
    return Zexx.ALLOWED;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsjb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */