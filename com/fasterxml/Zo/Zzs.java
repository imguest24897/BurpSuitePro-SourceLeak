package com.fasterxml.Zo;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyk;

public final class Zzs extends Zzd {
  private static final long serialVersionUID = 1L;
  
  public Zzs(Zz paramZz) {
    super(paramZz, new Zzg());
  }
  
  private Zzs(Zzs paramZzs, Zyc paramZyc, Zg paramZg, Zyk paramZyk) {
    super(paramZzs, paramZyc, paramZg, paramZyk);
  }
  
  private Zzs(Zzs paramZzs, Zz paramZz) {
    super(paramZzs, paramZz);
  }
  
  private Zzs(Zzs paramZzs, Zyc paramZyc) {
    super(paramZzs, paramZyc);
  }
  
  public Zzd Zz(Zyc paramZyc, Zg paramZg, Zyk paramZyk) {
    return new Zzs(this, paramZyc, paramZg, paramZyk);
  }
  
  public Zzd Zk(Zyc paramZyc) {
    return new Zzs(this, paramZyc);
  }
  
  public Zzd ZS(Zz paramZz) {
    return new Zzs(this, paramZz);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo\Zzs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */