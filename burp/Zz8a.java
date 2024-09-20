package burp;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import net.portswigger.Zl0;

public class Zz8a {
  private final List<Zrve> ZZ;
  
  private final Ze06 Ze;
  
  private List<Zrve> Zs = Collections.emptyList();
  
  public Zz8a(File paramFile, Zxts paramZxts, Zl0 paramZl0) {
    this.ZZ = (new Zr7(paramZxts, paramZl0)).ZV();
    this.Ze = new Ze06(paramFile, paramZxts, paramZl0);
  }
  
  public void ZR() {
    this.Zs = this.Ze.ZT();
  }
  
  public Optional<Zrve> Zt(String paramString) {
    Zrve zrve = Zt(this.ZZ, paramString);
    return (zrve != null) ? Optional.<Zrve>of(zrve) : Optional.<Zrve>ofNullable(Zt(this.Zs, paramString));
  }
  
  public List<Zrve> Zg(Zdb paramZdb) {
    ArrayList<Zrve> arrayList = new ArrayList();
    null = this.ZZ.iterator();
    int[] arrayOfInt = Zmln.Za();
    while (null.hasNext()) {
      Zrve zrve = null.next();
      if (paramZdb.Zh(zrve))
        arrayList.add(zrve); 
      if (arrayOfInt != null)
        break; 
    } 
    for (Zrve zrve : this.Zs) {
      if (paramZdb.Zh(zrve))
        arrayList.add(zrve); 
      if (arrayOfInt != null)
        break; 
    } 
    arrayList.sort(null);
    return arrayList;
  }
  
  private Zrve Zt(List<Zrve> paramList, String paramString) {
    int[] arrayOfInt = Zmln.Za();
    for (Zrve zrve : paramList) {
      if (Objects.equals(zrve.Zd(), paramString))
        return zrve; 
      if (arrayOfInt != null)
        break; 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz8a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */