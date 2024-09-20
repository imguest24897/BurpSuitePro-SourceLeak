package burp;

import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Collectors;

public class Zler implements Zehc {
  private final Ze3n ZI;
  
  public Zler(Ze3n paramZe3n) {
    this.ZI = paramZe3n;
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_JwtPrivateKeyDisclosure;
  }
  
  public Ztk8 Zb() {
    Set set = (Set)Zttv.ZF(this.ZI).filter(Zsyq::ZR).map(Zler::lambda$doCheck$0).collect(Collectors.toSet());
    Zgq<Zgpi> zgq = new Zgq<>();
    int[] arrayOfInt = Ztyp.Zw();
    byte[] arrayOfByte = this.ZI.ZA().ZD();
    for (String str : set) {
      LinkedList<Zl1r> linkedList = new LinkedList();
      Zl8v.Zm(str, arrayOfByte, 0, arrayOfByte.length, linkedList, false);
      Zvow zvow = this.ZI.Zt().Zp(this.ZI.ZA().ZD()).ZK(linkedList).Zo(this.ZI.ZL());
      zgq.Zu((Zsqx)Zzhp.Zh(this.ZI.Za(), zvow, this.ZI.ZN(), str));
      if (arrayOfInt == null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Ztyp.ZJ(new int[4]); 
    return Ztk8.Zy((Zgq)zgq);
  }
  
  private static String lambda$doCheck$0(Zsyq paramZsyq) {
    return paramZsyq.Ze().ZP();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */