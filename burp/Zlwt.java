package burp;

class Zlwt implements Zzyl {
  private final Zmgn Zh;
  
  private final Zb0h ZY;
  
  private final Zv8_ ZQ;
  
  Zlwt(Zmgn paramZmgn, Zb0h paramZb0h) {
    this.Zh = paramZmgn;
    this.ZQ = new Zv8_(paramZmgn);
    this.ZY = paramZb0h;
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return Zk(paramInt);
  }
  
  boolean Zk(int paramInt) {
    Boolean bool = ZY(paramInt);
    return (bool != null) ? bool.booleanValue() : false;
  }
  
  private Boolean ZY(int paramInt) {
    switch (paramInt) {
      case 400128:
        (new Zzf5(null, false)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 400384:
        (new Zzf5(null, true)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 401152:
        (new Zzfl(false)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 401408:
        (new Zzfl(true)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 400640:
        (new Zzft(null, false)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 400896:
        (new Zzft(null, true)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 401664:
        (new Zzfj(false)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 401920:
        (new Zzfj(true)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 403200:
        (new Zzfx(null, false)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 403456:
        (new Zzfx(null, true)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 403712:
        (new Zzf2(null, false)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 403968:
        (new Zzf2(null, true)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 402176:
        (new Zzfz(null, false)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 402432:
        (new Zzfz(null, true)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 402688:
        (new Zzf9(null, false)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 402944:
        (new Zzf9(null, true)).Zp(null, this.Zh);
        return Boolean.valueOf(true);
      case 394752:
        this.Zh.selectAll();
        return Boolean.valueOf(true);
      case 399360:
        (new Zzfu()).Zp(null, this.Zh);
        return Boolean.valueOf(this.Zh.isEditable());
      case 399616:
        (new Zzf8()).Zp(null, this.Zh);
        return Boolean.valueOf(this.Zh.isEditable());
      case 399872:
        (new Zzfp()).Zp(null, this.Zh);
        return Boolean.valueOf(this.Zh.isEditable());
      case 394496:
        this.Zh.Z_();
        return Boolean.valueOf(this.Zh.isEditable());
      case 394240:
        this.Zh.Zr();
        return Boolean.valueOf(this.Zh.isEditable());
      case 393472:
        if (this.Zh.isEditable()) {
          Zsn1.ZM(this.ZQ, this.ZY);
          return Boolean.valueOf(true);
        } 
        return Boolean.valueOf(false);
      case 393728:
        Zsn1.ZY(this.ZQ, this.ZY);
        return Boolean.valueOf(true);
      case 393984:
        if (this.Zh.isEditable()) {
          Zsn1.Zw(this.ZQ, false, this.ZY);
          return Boolean.valueOf(true);
        } 
        return Boolean.valueOf(false);
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlwt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */