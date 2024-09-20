package burp;

import java.util.List;
import java.util.stream.Collectors;

class Zkvm implements Zgkx {
  private final Ztz9 ZN;
  
  private final Ztp8 ZV;
  
  private final Zb0h Zy;
  
  Zkvm(Ztz9 paramZtz9, Ztp8 paramZtp8, Zb0h paramZb0h) {
    this.ZN = paramZtz9;
    this.ZV = paramZtp8;
    this.Zy = paramZb0h;
  }
  
  public List<Zb6u> ZN() {
    return (List<Zb6u>)this.ZV.get().Zh().stream().map(Zb6w::Zc).collect(Collectors.toList());
  }
  
  public boolean ZS() {
    return this.ZV.get().ZD();
  }
  
  public void ZD(int paramInt) {
    this.ZN.ZL(paramInt);
  }
  
  public void ZT(String paramString1, String paramString2) {
    this.ZV.get().ZB(paramString1, Zeup.QUERY_PARAM.initialTranscoder.ZI(paramString2));
    this.ZN.ZS();
  }
  
  public void Zl(List<Integer> paramList) {
    this.ZV.get().ZL(paramList);
    this.ZN.ZS();
  }
  
  public void ZY(int paramInt) {
    this.ZV.get().ZO(paramInt);
    this.ZN.ZS();
  }
  
  public void ZO(int paramInt) {
    this.ZV.get().Zi(paramInt);
    this.ZN.ZS();
  }
  
  public void ZH(int paramInt1, int paramInt2) {
    Zb6w zb6w = this.ZV.get().Zh().get(paramInt1);
    this.Zy.ZR((paramInt2 == 0) ? zb6w.Zp() : zb6w.ZP());
  }
  
  public void Za(List<Integer> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    int[] arrayOfInt = Zmgw.Ze();
    while (b < paramList.size()) {
      int i = ((Integer)paramList.get(b)).intValue();
      Zb6w zb6w = this.ZV.get().Zh().get(i);
      stringBuilder.append(zb6w.Zp());
      stringBuilder.append('=');
      stringBuilder.append(zb6w.ZP());
      if (b < paramList.size() - 1)
        stringBuilder.append('&'); 
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    if (stringBuilder.length() > 0)
      this.Zy.ZR(stringBuilder.toString()); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkvm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */