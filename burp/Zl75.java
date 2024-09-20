package burp;

import java.util.Map;

class Zl75 {
  private final Zgpw ZZ;
  
  private final Map<Integer, Integer> ZW;
  
  private final Zzkh ZQ;
  
  Zl75(Zgpw paramZgpw, Zzkh paramZzkh) {
    this(paramZgpw, null, paramZzkh);
  }
  
  Zl75(Zgpw paramZgpw, Map<Integer, Integer> paramMap, Zzkh paramZzkh) {
    this.ZZ = paramZgpw;
    this.ZW = paramMap;
    this.ZQ = paramZzkh;
  }
  
  Zm1s ZQ(Ze7g paramZe7g, int paramInt1, float paramFloat1, int paramInt2, float paramFloat2) {
    int[] arrayOfInt = Zgpw.ZW();
    byte b = 0;
    while (b < paramInt2) {
      paramZe7g = paramZe7g.ZW(paramInt1);
      paramInt1 = ZG(paramZe7g, paramInt1);
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    if (paramInt2 > 0) {
      paramFloat1 += paramFloat2 * paramInt2;
      paramZe7g = paramZe7g.ZW(paramInt1);
    } 
    return new Zm1s(paramZe7g, paramInt1, paramFloat1);
  }
  
  private int ZG(Ze7g paramZe7g, int paramInt) {
    if (this.ZW != null) {
      Integer integer = this.ZW.get(Integer.valueOf(paramInt));
      if (integer == null) {
        int i = this.ZZ.Zc(paramInt, paramZe7g, this.ZQ);
        this.ZW.put(Integer.valueOf(paramInt), Integer.valueOf(i));
        return i;
      } 
      return integer.intValue();
    } 
    return this.ZZ.Zc(paramInt, paramZe7g, this.ZQ);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl75.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */