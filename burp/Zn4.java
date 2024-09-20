package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.portswigger.Zsy;

public class Zn4 {
  private final List<Zsf8> Zz = new ArrayList<>();
  
  public Zn4(Ztai paramZtai, Zsy paramZsy, Zmhe paramZmhe, int paramInt, Ze3n paramZe3n, Zxs7 paramZxs7, Zbnt paramZbnt, Zbjl paramZbjl, Zr_4 paramZr_4) {
    Zbqc[] arrayOfZbqc = Zldj.ZL();
    int i = paramZe3n.ZM().Zgv();
    if (paramZtai.Zr(Zzu2.OUT_OF_BAND_RESOURCE_LOAD_HTTP) || paramZtai.ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_DNS, Zr3z.COLLABORATOR_BASED) || paramZtai.ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_HTTP, Zr3z.COLLABORATOR_BASED))
      this.Zz.addAll(Arrays.asList((Zsf8[])new Zrax[] { new Zrax(paramZbnt, paramZtai, paramZe3n, paramZmhe, paramZxs7, paramZbjl, new Zs28(Zk7g.OUT_BAND_RESOURCE_LOAD, paramZsy, paramInt, i, paramZbjl, paramZxs7)), new Zrax(paramZbnt, paramZtai, paramZe3n, paramZmhe, paramZxs7, paramZbjl, new Zmzu(Zk7g.OUT_BAND_RESOURCE_LOAD, paramZsy, paramInt, i, paramZxs7, paramZbjl)), new Zrax(paramZbnt, paramZtai, paramZe3n, paramZmhe, paramZxs7, paramZbjl, new Ztg0(Zk7g.OUT_BAND_RESOURCE_LOAD, paramZsy, paramInt, i, paramZbjl, paramZxs7)), new Zrax(paramZbnt, paramZtai, paramZe3n, paramZmhe, paramZxs7, paramZbjl, new Zkm1(Zk7g.OUT_BAND_RESOURCE_LOAD, paramZsy, paramInt, i, paramZbjl, paramZxs7)), new Zrax(paramZbnt, paramZtai, paramZe3n, paramZmhe, paramZxs7, paramZbjl, new Zxo1(Zk7g.OUT_BAND_RESOURCE_LOAD, paramZsy, paramInt, i, paramZbjl, paramZxs7)) })); 
    if (paramZtai.ZS(Zzu2.XML_EXTERNAL_ENTITY_INJECTION, Zr3z.XXE_FILE_RETRIEVAL) || paramZtai.ZS(Zzu2.XML_EXTERNAL_ENTITY_INJECTION, Zr3z.COLLABORATOR_BASED))
      this.Zz.add(new Zzjb(paramInt, paramZe3n, paramZmhe, paramZxs7, paramZbjl, paramZtai, paramZsy, paramZbnt, paramZr_4)); 
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public void ZO(Zz4_ paramZz4_) {
    Zbqc[] arrayOfZbqc = Zldj.ZL();
    for (Zsf8 zsf8 : this.Zz) {
      zsf8.Zs(paramZz4_);
      if (arrayOfZbqc == null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zn4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */