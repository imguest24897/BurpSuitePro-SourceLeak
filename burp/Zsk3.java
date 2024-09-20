package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Zsk3 implements Zkrr {
  private final Ze3n ZS;
  
  private final Zbnt Zu;
  
  private static int[] ZN;
  
  public Zsk3(Ze3n paramZe3n, Zbnt paramZbnt) {
    this.ZS = paramZe3n;
    this.Zu = paramZbnt;
  }
  
  public Zbsl Zp() {
    return Zbsl.APR_PathRelativeStylesheetImport;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    int[] arrayOfInt = Zm();
    Zs68 zs68 = this.ZS.Zp();
    List list = (List)((zs68 != null && zs68.Zd != null) ? Zx6a.Zf(this.ZS.ZA().ZF(), zs68, this.Zu) : Collections.emptyList());
    Ze9t ze9t = (new Zb6f(this.ZS.Zp(), list)).Zj();
    if (ze9t.ZH()) {
      Zz47 zz47 = new Zz47();
      boolean bool = false;
      try {
        Zs7a zs7a = (new Zzhq(this.ZS, this.Zu, zz47, ze9t.Zx())).ZW();
        if (zs7a != null) {
          Zspw zspw = (new Zl3t(this.ZS, this.Zu, zz47, zs7a)).Zc();
          if (zspw != null) {
            zz47.ZF(this.ZS.ZI().Zp(this.ZS.ZA().ZD()).Zo(this.ZS.ZL()).Zf(new Zl1r(zs7a.ZA.ZJ, zs7a.ZA.Zv)));
            paramZz4_.Zz(zz47.ZE(this.ZS, zs7a.ZL.Zj()));
            bool = true;
          } 
        } 
      } finally {
        if (!bool)
          paramZz4_.Zz(Za(zz47, ze9t)); 
      } 
    } 
    if (Zbqc.Zwu() == null)
      Zl(new int[3]); 
  }
  
  private Zsqx<Zrdb> Za(Zz47 paramZz47, Ze9t paramZe9t) {
    ArrayList<Zl1r> arrayList = new ArrayList();
    Iterator<Zsq8> iterator = paramZe9t.Zx().iterator();
    int[] arrayOfInt = Zm();
    while (iterator.hasNext()) {
      Zsq8 zsq8 = iterator.next();
      arrayList.add(new Zl1r(zsq8.ZJ, zsq8.Zv));
      if (arrayOfInt == null)
        break; 
    } 
    paramZz47.ZF(this.ZS.ZI().Zp(this.ZS.ZA().ZD()).Zo(this.ZS.ZL()).Z_(arrayList));
    return paramZz47.ZE(this.ZS, paramZe9t.Zj());
  }
  
  public String toString() {
    return Zp().name();
  }
  
  public static void Zl(int[] paramArrayOfint) {
    ZN = paramArrayOfint;
  }
  
  public static int[] Zm() {
    return ZN;
  }
  
  static {
    if (Zm() == null)
      Zl(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsk3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */