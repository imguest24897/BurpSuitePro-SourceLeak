package com.fasterxml.Zp;

import com.fasterxml.Zj.Zf;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zoz.Zia;
import com.fasterxml.Zoz.Ziz;
import java.util.Collection;

public abstract class Zq {
  public abstract void Zt(Zd... paramVarArgs);
  
  public Collection<Zd> ZP(Zf<?> paramZf, Ziz paramZiz, Zk paramZk) {
    return ZO(paramZiz, paramZf, paramZf.ZK(), paramZk);
  }
  
  public Collection<Zd> ZJ(Zf<?> paramZf, Zia paramZia) {
    return ZM(paramZia, paramZf, paramZf.ZK());
  }
  
  public Collection<Zd> Zw(Zf<?> paramZf, Ziz paramZiz, Zk paramZk) {
    return ZO(paramZiz, paramZf, paramZf.ZK(), paramZk);
  }
  
  public Collection<Zd> Zx(Zf<?> paramZf, Zia paramZia) {
    return ZM(paramZia, paramZf, paramZf.ZK());
  }
  
  @Deprecated
  public Collection<Zd> ZO(Ziz paramZiz, Zf<?> paramZf, Zt paramZt, Zk paramZk) {
    return ZP(paramZf, paramZiz, paramZk);
  }
  
  @Deprecated
  public Collection<Zd> ZM(Zia paramZia, Zf<?> paramZf, Zt paramZt) {
    return ZJ(paramZf, paramZia);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zp\Zq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */