package burp;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class Zre6 implements Zgkx {
  private final Ztz9 ZH;
  
  private final Ztp8 ZV;
  
  private final Zb0h Zy;
  
  Zre6(Ztz9 paramZtz9, Ztp8 paramZtp8, Zb0h paramZb0h) {
    this.ZH = paramZtz9;
    this.ZV = paramZtp8;
    this.Zy = paramZb0h;
  }
  
  public List<Zb6u> ZN() {
    return (List<Zb6u>)this.ZV.get().ZM().stream().map(Zmv3::Zc).collect(Collectors.toList());
  }
  
  public boolean ZS() {
    return this.ZV.get().ZD();
  }
  
  public void ZD(int paramInt) {
    this.ZH.Zi(paramInt);
  }
  
  public void ZT(String paramString1, String paramString2) {
    this.ZV.get().Zf(paramString1, Zeup.BODY_PARAM.initialTranscoder.ZI(paramString2));
    this.ZH.ZS();
  }
  
  public void Zl(List<Integer> paramList) {
    this.ZV.get().ZX(paramList);
    this.ZH.ZS();
  }
  
  public void ZY(int paramInt) {
    this.ZV.get().ZN(paramInt);
    this.ZH.ZS();
  }
  
  public void ZO(int paramInt) {
    this.ZV.get().ZU(paramInt);
    this.ZH.ZS();
  }
  
  public void ZH(int paramInt1, int paramInt2) {
    Zmv3 zmv3 = this.ZV.get().ZM().get(paramInt1);
    this.Zy.ZR((paramInt2 == 0) ? zmv3.Zp() : zmv3.ZP());
  }
  
  public void Za(List<Integer> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<Integer> iterator = paramList.iterator();
    int[] arrayOfInt = Zmgw.Ze();
    while (iterator.hasNext()) {
      Integer integer = iterator.next();
      Zmv3 zmv3 = this.ZV.get().ZM().get(integer.intValue());
      stringBuilder.append(zmv3.Zp());
      stringBuilder.append('=');
      stringBuilder.append(zmv3.ZP());
      stringBuilder.append('\n');
      if (arrayOfInt != null)
        break; 
    } 
    if (stringBuilder.length() > 0)
      this.Zy.ZR(stringBuilder.toString()); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zre6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */