package net.portswigger;

import burp.Zbqc;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.openapi4j.Z_;
import org.openapi4j.Zi;
import org.openapi4j.Zp9;

public class Zsn {
  private final Z_ ZU;
  
  private List<Zp9> Zy;
  
  private String ZC;
  
  private Zi Zm;
  
  private String Zx;
  
  private Zmf Zd;
  
  private URL Zr;
  
  private final List<Zi5> ZK = new ArrayList<>();
  
  private final List<Zi5> ZX = new ArrayList<>();
  
  private final List<Zi5> Zs = new ArrayList<>();
  
  private final List<Zi5> ZJ = new ArrayList<>();
  
  public Zsn(Z_ paramZ_) {
    this.ZU = paramZ_;
  }
  
  public Zsn(Z_ paramZ_, Ztb paramZtb) {
    this(paramZ_);
    this.Zy = paramZtb.Zz;
    this.ZC = paramZtb.ZN;
    this.Zm = paramZtb.Zx;
    this.Zx = paramZtb.ZC;
    this.Zd = paramZtb.Zr;
    this.ZK.addAll(paramZtb.ZH);
    this.ZX.addAll(paramZtb.ZD);
    this.Zs.addAll(paramZtb.Zt);
    String[] arrayOfString = Zfe.ZG();
    this.ZJ.addAll(paramZtb.ZX);
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  Zsn Zu(List<Zp9> paramList) {
    this.Zy = paramList;
    return this;
  }
  
  public Zsn Ze(String paramString) {
    this.ZC = paramString;
    return this;
  }
  
  public Zsn ZZ(Zi paramZi) {
    this.Zm = paramZi;
    return this;
  }
  
  Zsn Za(String paramString) {
    this.Zx = paramString;
    return this;
  }
  
  Zsn ZJ(Zmf paramZmf) {
    this.Zd = paramZmf;
    return this;
  }
  
  Zsn ZO(Collection<Zi5> paramCollection) {
    this.ZK.addAll(paramCollection);
    return this;
  }
  
  Zsn ZQ(Collection<Zi5> paramCollection) {
    this.ZX.addAll(paramCollection);
    return this;
  }
  
  Zsn Zc(Collection<Zi5> paramCollection) {
    this.Zs.addAll(paramCollection);
    return this;
  }
  
  Zsn ZB(Collection<Zi5> paramCollection) {
    this.ZJ.addAll(paramCollection);
    return this;
  }
  
  Zsn ZZ(URL paramURL) {
    this.Zr = paramURL;
    return this;
  }
  
  Ztb Zd() {
    return new Ztb(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zsn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */