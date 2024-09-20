package burp;

class Zzz implements Ze21<Zb43, Zgzx> {
  private final Zln Zz;
  
  private final Zl3w Zr;
  
  private final Zsil ZU;
  
  private final Zzen Zh;
  
  private final Zlhd Z_;
  
  private final Zsxe Zk;
  
  private final Zrgd Zw;
  
  private final Zxy1 Za;
  
  private final Zrps ZC;
  
  private final Zst5 ZS;
  
  private final Zlfd ZZ;
  
  public Zzz(Zln paramZln, Zl3w paramZl3w, Zsil paramZsil, Zzen paramZzen, Zlhd paramZlhd, Zsxe paramZsxe, Zrgd paramZrgd, Zxy1 paramZxy1, Zrps paramZrps, Zst5 paramZst5, Zlfd paramZlfd) {
    this.Zz = paramZln;
    this.Zr = paramZl3w;
    this.ZU = paramZsil;
    this.Zh = paramZzen;
    this.Z_ = paramZlhd;
    this.Zk = paramZsxe;
    this.Zw = paramZrgd;
    this.Za = paramZxy1;
    this.ZC = paramZrps;
    Zbqc[] arrayOfZbqc = Zlc6.Zg();
    this.ZS = paramZst5;
    this.ZZ = paramZlfd;
    if (Zbqc.Zwu() == null)
      Zlc6.Zd(new Zbqc[2]); 
  }
  
  public Zgph ZM(Zb43 paramZb43, Zgzx paramZgzx, Zl7q paramZl7q, Zefx paramZefx, Zmzk paramZmzk, Zto5 paramZto5, Zm5u paramZm5u) {
    Zbqc[] arrayOfZbqc = Zlc6.Zg();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[3]); 
    return new Zgp7(paramZb43, this.Zz, this.Zr.ZD(paramZmzk), paramZgzx, this.ZC, this.ZS, this.ZU, this.Zh, this.Z_, paramZto5, paramZefx, paramZmzk, this.Zk, this.Zw, this.Za, paramZm5u, Zu(paramZb43, paramZl7q, this.ZC), paramZl7q);
  }
  
  private Zr50 Zu(Zb43 paramZb43, Zl7q paramZl7q, Zrps paramZrps) {
    return (Zr50)(paramZl7q.Za() ? new Zesl(paramZb43.ZY(), paramZl7q, this.ZZ.Z_(paramZl7q, paramZrps.Zb())) : new Zee0(paramZb43.ZY()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */