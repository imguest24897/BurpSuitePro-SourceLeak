package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Zlvs {
  private static int[] ZD;
  
  public static <T extends Zgpi> Zefg<T> Ze(List<T> paramList, Zr_4 paramZr_4, Zeu4<T> paramZeu4) {
    if (paramList == null)
      return null; 
    Zefg<T> zefg = Zkk.Zl(paramZr_4, paramZeu4, paramList.size());
    zefg.addAll(paramList);
    return zefg;
  }
  
  public static Zm31[] ZW(Zekv paramZekv, Zm31[]... paramVarArgs) {
    ArrayList<Zekv> arrayList = new ArrayList();
    arrayList.add(paramZekv);
    for (Zm31[] arrayOfZm31 : paramVarArgs)
      arrayList.addAll((Collection)Arrays.asList(arrayOfZm31)); 
    return ZP(new Zm31[][] { arrayList.<Zm31>toArray(new Zm31[0]) });
  }
  
  public static Zm31[] ZP(Zm31[]... paramVarArgs) {
    Zm31[] arrayOfZm31 = new Zm31[Z_(paramVarArgs)];
    byte b = 0;
    for (Zm31[] arrayOfZm311 : paramVarArgs) {
      for (Zm31 zm31 : arrayOfZm311)
        arrayOfZm31[b++] = zm31; 
    } 
    return arrayOfZm31;
  }
  
  private static int Z_(Zm31[][] paramArrayOfZm31) {
    int i = 0;
    for (Zm31[] arrayOfZm31 : paramArrayOfZm31)
      i += arrayOfZm31.length; 
    return i;
  }
  
  public static void ZN(int[] paramArrayOfint) {
    ZD = paramArrayOfint;
  }
  
  public static int[] Zd() {
    return ZD;
  }
  
  static {
    if (Zd() == null)
      ZN(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlvs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */