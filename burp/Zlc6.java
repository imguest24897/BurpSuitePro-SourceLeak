package burp;

public class Zlc6 {
  private final Zzz Zn;
  
  private final Zrd6 Zx;
  
  private static Zbqc[] Zg;
  
  public Zlc6(Zln paramZln, Zl3w paramZl3w, Zsil paramZsil, Zzen paramZzen, Zlhd paramZlhd, Zzxn paramZzxn, Zsxe paramZsxe, Zrgd paramZrgd, Zxy1 paramZxy1, Zrps paramZrps, Zst5 paramZst5, Zlfd paramZlfd) {
    this.Zn = new Zzz(paramZln, paramZl3w, paramZsil, paramZzen, paramZlhd, paramZsxe, paramZrgd, paramZxy1, paramZrps, paramZst5, paramZlfd);
    this.Zx = new Zrd6(paramZln, paramZl3w, paramZsil, paramZzen, paramZlhd, paramZxy1, paramZzxn, paramZrps, paramZst5);
  }
  
  public Zgph Zr(Zlvr paramZlvr, Zgzx paramZgzx, Zxtv paramZxtv, Zl7q paramZl7q, Zefx paramZefx, Zmzk paramZmzk, Zto5 paramZto5, Zm5u paramZm5u) {
    Zz2m zz2m = new Zz2m(this.Zn, this.Zx, paramZgzx, paramZxtv, paramZl7q, paramZefx, paramZmzk, paramZto5, paramZm5u);
    paramZlvr.Zo(zz2m);
    return zz2m.Zp;
  }
  
  public static void Zd(Zbqc[] paramArrayOfZbqc) {
    Zg = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zg() {
    return Zg;
  }
  
  static {
    if (Zg() == null)
      Zd(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlc6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */