package burp;

import java.util.Iterator;

public abstract class Zt7q extends Zt7u {
  private float ZZ;
  
  public void ZT(Ze3h paramZe3h) {
    this.ZZ = Zl(paramZe3h);
  }
  
  public float Zs(Zz_1 paramZz_1) {
    return ((Zxya)paramZz_1.Z_()).Zs / this.ZZ * 100.0F;
  }
  
  private float Zl(Ze3h paramZe3h) {
    int i = 0;
    Iterator<Zz_1> iterator = paramZe3h.iterator();
    int[] arrayOfInt = Zgxf.ZV();
    while (iterator.hasNext()) {
      Zz_1 zz_1 = iterator.next();
      i += ((Zxya)zz_1.Z_()).Zs;
      if (arrayOfInt != null)
        break; 
    } 
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt7q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */