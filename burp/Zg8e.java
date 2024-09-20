package burp;

import java.util.EnumSet;

class Zg8e {
  private final Zxr5[] Ze;
  
  Zg8e(Zxr5... paramVarArgs) {
    this.Ze = paramVarArgs;
  }
  
  EnumSet<Zklf> Zo(boolean paramBoolean1, boolean paramBoolean2) {
    Zxr5[] arrayOfZxr5 = this.Ze;
    int i = arrayOfZxr5.length;
    byte b = 0;
    int[] arrayOfInt = Zgdy.ZW();
    while (b < i) {
      Zxr5 zxr5 = arrayOfZxr5[b];
      if (zxr5.Zf(paramBoolean2, paramBoolean1))
        return zxr5.Zt(); 
      b++;
      if (arrayOfInt != null) {
        Zbqc.Zr(new Zbqc[5]);
        break;
      } 
    } 
    return EnumSet.noneOf(Zklf.class);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg8e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */