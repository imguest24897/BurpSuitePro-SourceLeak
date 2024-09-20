package net.portswigger;

import burp.Zbqc;
import java.util.List;

@Zsi("FileUploadApiDefinitionConfiguration")
public class Zst {
  @Zvd(Zp = "parameters")
  public final List<Ziu> ZK;
  
  @Zvd(Zp = "endpoints")
  public final List<Zsf> ZH;
  
  @Zvd(Zp = "authentications")
  public final List<Zlf> Zc;
  
  @Zox
  public Zst(@Zc5(Ze = "parameters", ZS = "[]") List<Ziu> paramList, @Zc5(Ze = "endpoints", ZS = "[]") List<Zsf> paramList1, @Zc5(Ze = "authentications", ZS = "[]") List<Zlf> paramList2) {
    this.ZK = paramList;
    this.ZH = paramList1;
    this.Zc = paramList2;
    int[] arrayOfInt = Zm3.Zc();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public List<? extends Zim> ZJ() {
    return (List)this.ZH;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zst.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */