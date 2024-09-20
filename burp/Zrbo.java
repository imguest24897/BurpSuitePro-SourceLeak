package burp;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Zrbo implements Zsxd {
  private final List<Zg3d> ZA;
  
  private final String ZC;
  
  private final byte ZH;
  
  public Zrbo(Zg3d paramZg3d) {
    this(Collections.singletonList(paramZg3d));
  }
  
  public Zrbo(List<Zg3d> paramList) {
    this(paramList, null);
  }
  
  public Zrbo(List<Zg3d> paramList, Zlhj paramZlhj) {
    this(paramList, (paramZlhj == null) ? null : paramZlhj.ZO, (paramZlhj == null) ? null : paramZlhj.Zn);
  }
  
  Zrbo(List<Zg3d> paramList, String paramString1, String paramString2) {
    this(paramList, paramString1, Zmtd.ZN(paramString2));
  }
  
  private Zrbo(List<Zg3d> paramList, String paramString, byte paramByte) {
    this.ZA = paramList;
    this.ZC = paramString;
    this.ZH = paramByte;
  }
  
  public List<Zg3d> ZX() {
    return this.ZA;
  }
  
  public List<Zg3d> Zg() {
    return (this.ZA.size() == 1) ? Collections.<Zg3d>emptyList() : this.ZA.subList(0, this.ZA.size() - 1);
  }
  
  public Zg3d Zz() {
    return ZX().get(0);
  }
  
  public Zg3d ZG() {
    return ZX().get(this.ZA.size() - 1);
  }
  
  public Duration ZL() {
    return ZG().Zs();
  }
  
  public Duration ZE() {
    return ZG().ZS();
  }
  
  public String ZZ() {
    return this.ZC;
  }
  
  public byte Zn() {
    return this.ZH;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof Zsxd))
      return false; 
    Zsxd zsxd = (Zsxd)paramObject;
    return (this.ZA.equals(zsxd.ZX()) && this.ZH == zsxd.Zn() && ((this.ZC == null && zsxd.ZZ() == null) || (this.ZC != null && this.ZC.equals(zsxd.ZZ()))));
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.ZA });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrbo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */