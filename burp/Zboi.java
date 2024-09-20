package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zsy;

public class Zboi implements Zm9n {
  private final Zmhe ZB;
  
  private final Ze3n ZC;
  
  private final Zxs7 ZE;
  
  private final Zsy Zg;
  
  private final Ztai ZO;
  
  private final Zgfe Zk;
  
  public Zboi(Ztai paramZtai, Zmhe paramZmhe, Ze3n paramZe3n, Zxs7 paramZxs7, Zsy paramZsy, Zgfe paramZgfe) {
    this.ZO = paramZtai;
    this.ZB = paramZmhe;
    this.ZC = paramZe3n;
    this.ZE = paramZxs7;
    this.Zg = paramZsy;
    this.Zk = paramZgfe;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    Zbxv zbxv = new Zbxv(this.ZO);
    List<Zxzq> list = ZK();
    String str = Zgit.ZA();
    if (!list.isEmpty())
      for (Zxzq zxzq : list) {
        for (Zgit zgit : Zxdf.Zd(this.Zk, this.ZE, zxzq.Zc)) {
          ZN(zxzq, zgit, zbxv).Z_(paramZz4_, zgit);
          if (str == null)
            break; 
        } 
        if (str == null)
          break; 
      }  
  }
  
  private List<Zxzq> ZK() {
    ArrayList<Zxzq> arrayList = new ArrayList();
    Zvs zvs1 = this.ZB.<Zvs>Zq(Zzu2.CLIENT_SIDE_HTTP_PARAMETER_POLLUTION_REFLECTED, Zzu2.CLIENT_SIDE_HTTP_PARAMETER_POLLUTION_STORED);
    Zvs zvs2 = this.ZB.<Zvs>Zq(Zzu2.LINK_MANIPULATION_REFLECTED, Zzu2.LINK_MANIPULATION_STORED);
    Zvs zvs3 = this.ZB.<Zvs>Zq(Zzu2.FORM_ACTION_HIJACKING_REFLECTED, Zzu2.FORM_ACTION_HIJACKING_STORED);
    Zvs zvs4 = this.ZB.<Zvs>Zq(Zzu2.CSS_INJECTION_REFLECTED, Zzu2.CSS_INJECTION_STORED);
    Zvs zvs5 = this.ZB.<Zvs>Zq(Zzu2.XSS_REFLECTED, Zzu2.XSS_STORED);
    try {
      if (this.ZO.ZN(new Zvs[] { zvs2, zvs1 }))
        arrayList.add(new Zxzq(zvs2, zvs2, zvs1, Zbni.Zg)); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (this.ZO.ZN(new Zvs[] { zvs3, zvs1 }))
        arrayList.add(new Zxzq(zvs3, zvs3, zvs1, Zbni.ZY)); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (this.ZO.ZN(new Zvs[] { zvs4, zvs2, zvs1 }))
        arrayList.add(new Zxzq(zvs4, zvs2, zvs1, Zbni.ZR)); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (!this.ZO.ZN(new Zvs[] { zvs2, zvs1 })) {
        try {
          if (((Boolean)this.ZB.<Boolean>Zq(Boolean.valueOf(this.ZO.ZS(Zzu2.XSS_REFLECTED, Zr3z.CLIENT_SIDE_BREAKOUT)), Boolean.valueOf(this.ZO.ZS(Zzu2.XSS_STORED, Zr3z.IN_BAND)))).booleanValue()) {
            arrayList.add(new Zxzq(zvs5, zvs2, zvs1, Zbni.Zt));
            return arrayList;
          } 
        } catch (MatchException matchException) {
          throw a(null);
        } 
        return arrayList;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    arrayList.add(new Zxzq(zvs5, zvs2, zvs1, Zbni.Zt));
    return arrayList;
  }
  
  private Zlxc ZN(Zxzq paramZxzq, Zgit paramZgit, Zbxv paramZbxv) {
    try {
      if (!ZF(paramZxzq.Zc, paramZgit))
        return Zlxc.Zr; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      switch (Zkb2.ZQ[paramZgit.Zo.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
          try {
          
          } catch (MatchException matchException) {
            throw a(null);
          } 
          return Zq() ? new Zrg2(paramZbxv, this.Zg, this.ZC, this.ZE, this.ZB, paramZxzq, true) : new Zrg9(paramZbxv, this.Zg, this.ZC, this.ZE, this.ZB, paramZxzq);
        case 3:
        
        case 4:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return Zlxc.Zr;
  }
  
  private boolean ZF(Zm80 paramZm80, Zgit paramZgit) {
    try {
      if (paramZgit.Zo == Ze8e.HOST)
        try {
          if (paramZgit.ZI())
            return false; 
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    Zvs zvs1 = this.ZB.<Zvs>Zq(Zzu2.CSS_INJECTION_REFLECTED, Zzu2.CSS_INJECTION_STORED);
    Zvs zvs2 = this.ZB.<Zvs>Zq(Zzu2.LINK_MANIPULATION_REFLECTED, Zzu2.LINK_MANIPULATION_STORED);
    Zvs zvs3 = this.ZB.<Zvs>Zq(Zzu2.FORM_ACTION_HIJACKING_REFLECTED, Zzu2.FORM_ACTION_HIJACKING_STORED);
    Zvs zvs4 = this.ZB.<Zvs>Zq(Zzu2.CLIENT_SIDE_HTTP_PARAMETER_POLLUTION_REFLECTED, Zzu2.CLIENT_SIDE_HTTP_PARAMETER_POLLUTION_STORED);
    try {
      if (paramZgit.Zo == Ze8e.HOST) {
        try {
          if (paramZm80 == Zbni.Zt) {
            try {
              if (!this.ZO.ZN(new Zvs[] { zvs2, zvs4 })) {
                try {
                  if (((Boolean)this.ZB.<Boolean>Zq(Boolean.valueOf(this.ZO.ZS(Zzu2.XSS_REFLECTED, Zr3z.CLIENT_SIDE_BREAKOUT)), Boolean.valueOf(this.ZO.ZS(Zzu2.XSS_STORED, Zr3z.IN_BAND)))).booleanValue());
                } catch (MatchException matchException) {
                  throw a(null);
                } 
                return false;
              } 
            } catch (MatchException matchException) {
              throw a(null);
            } 
          } else {
            return this.ZO.ZN(new Zvs[] { zvs2, zvs1, zvs3, zvs4 });
          } 
        } catch (MatchException matchException) {
          throw a(null);
        } 
      } else {
        return this.ZO.ZN(new Zvs[] { zvs2, zvs1, zvs3, zvs4 });
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  private boolean Zq() {
    try {
      if (this.ZE.Z_() != Zs66.PATH_FILENAME_PARAM) {
        try {
          if (this.ZE.Z_() == Zs66.PATH_FOLDER_PARAM);
        } catch (MatchException matchException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  public Zbsl Zp() {
    return Zbsl.APIP_LinkManipulation;
  }
  
  public String toString() {
    return Zp().name();
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zboi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */