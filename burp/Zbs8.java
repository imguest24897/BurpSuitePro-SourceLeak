package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import net.portswigger.Z_j;
import net.portswigger.Zms;
import net.portswigger.Zrmr;
import net.portswigger.Zs7;
import net.portswigger.Zsy;
import net.portswigger.Zt0;
import net.portswigger.Zv2;
import net.portswigger.Zzz;

public class Zbs8 extends Z_j {
  private final String ZK;
  
  private final String ZF;
  
  private final boolean Zs;
  
  private final List<Zxr2> ZR = new ArrayList<>();
  
  public Zbs8(String paramString1, boolean paramBoolean, String paramString2) {
    this.ZK = paramString1;
    this.Zs = paramBoolean;
    this.ZF = paramString2;
  }
  
  public void ZY(Zs7 paramZs7) {
    ZS((Zv2<Number>)paramZs7);
  }
  
  public void ZC(Zrmr paramZrmr) {
    Zt((Zms)paramZrmr, paramZrmr.Zmk(), paramZrmr.Zm9());
  }
  
  public void Zz(Zzz paramZzz) {
    ZS((Zv2<Number>)paramZzz);
  }
  
  private <T extends Number> void ZS(Zv2<T> paramZv2) {
    ArrayList<Number> arrayList = new ArrayList();
    if (paramZv2.min() != null)
      arrayList.add(paramZv2.min()); 
    if (paramZv2.max() != null)
      arrayList.add(paramZv2.max()); 
    Zt((Zms)paramZv2, paramZv2.examples(), arrayList);
    if (paramZv2.examples().isEmpty() && arrayList.isEmpty()) {
      this.ZR.add(Zxr2.Za(Integer.valueOf(0)));
      this.ZR.add(Zxr2.Za(Integer.valueOf(1)));
    } 
  }
  
  public void Zr(Zt0 paramZt0) {
    Zt((Zms)paramZt0, paramZt0.Zgl(), Arrays.asList((Object[])new Boolean[] { Boolean.valueOf(false), Boolean.valueOf(true) }));
  }
  
  private void Zt(Zms paramZms, List<?> paramList1, List<?> paramList2) {
    Objects.requireNonNull(this.ZR);
    Stream.concat(paramList1.stream(), paramList2.stream()).distinct().map(Zxr2::Za).forEach(this.ZR::add);
    if (this.ZR.isEmpty()) {
      Zio zio = (new Zio()).Zn(this.ZK);
      paramZms.ZF(new Zrcz(zio));
      paramZms.ZF(new Zrc6(zio));
      paramZms.ZF(new Zrcf(zio));
      this.ZR.add(Zxr2.Za((new Ztvu(new Zsy(this.ZF + this.ZF))).Za(zio.Zb())));
    } 
  }
  
  protected void Zq(String paramString) {
    if (this.Zs)
      this.ZR.add(Zxr2.ZO(paramString)); 
  }
  
  List<Zxr2> Zq() {
    return this.ZR;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbs8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */