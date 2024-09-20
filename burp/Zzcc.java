package burp;

import java.util.ArrayList;
import java.util.List;

public class Zzcc {
  private final List<Zgh_> Zl;
  
  public boolean ZS;
  
  public Zzcc(List<Zgh_> paramList) {
    this.Zl = paramList;
  }
  
  public Zzcc Zq(boolean paramBoolean) {
    this.ZS = paramBoolean;
    return this;
  }
  
  public Zsmx ZQ(Zbph paramZbph, Zbnt paramZbnt) {
    return ZT(paramZbph, paramZbnt, Zzcc::lambda$filteredBy$0);
  }
  
  public Zsmx ZT(Zbph paramZbph, Zbnt paramZbnt, Zlfl paramZlfl) {
    Zm03 zm03 = new Zm03();
    ArrayList<Zgh_> arrayList = new ArrayList();
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    for (Zgh_ zgh_ : this.Zl) {
      Zexx zexx = Zbh.ZE(zgh_, paramZbph, arrayList.size(), this.ZS);
      switch (Zey7.Zl[zexx.ordinal()]) {
        case 1:
          arrayList.add(zgh_);
        case 2:
        case 3:
          zm03.Zc(zgh_.ZG());
        case 4:
          zm03.ZO(zgh_.ZG());
        case 5:
          zm03.ZK(zgh_.ZG());
        case 6:
          zm03.ZU(zgh_.ZG());
          break;
      } 
      paramZlfl.ZW(zgh_, zexx);
      continue;
      if (arrayOfZbqc != null)
        break; 
    } 
    return new Zsmx(arrayList, zm03, paramZbph, paramZbnt);
  }
  
  public List<Zgh_> ZA() {
    return this.Zl;
  }
  
  public Zsmx Z_(Zbnt paramZbnt) {
    return new Zsmx(this.Zl, new Zm03(), null, paramZbnt);
  }
  
  private static void lambda$filteredBy$0(Zgh_ paramZgh_, Zexx paramZexx) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzcc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */