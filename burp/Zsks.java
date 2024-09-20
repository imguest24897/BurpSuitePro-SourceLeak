package burp;

import java.util.Objects;

public class Zsks implements Zrw4 {
  private final Zr_4 Zr;
  
  public Zsks(Zr_4 paramZr_4) {
    this.Zr = paramZr_4;
  }
  
  public void ZK() {
    Zbqc[] arrayOfZbqc = Zk7u.Zq();
    Ztew ztew = new Ztew(this);
    ztew.ZT(this.Zr.<Zzir>Zj(Zzir.Zg));
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public <T extends Zgpi> boolean ZG(T paramT) {
    return false;
  }
  
  public <T extends Zgpi> Zz8x<T> Z_(T paramT) {
    return new Zz8x<>(false);
  }
  
  public <T extends Zgpi> T Zd(Ztew paramZtew, T paramT) {
    Zbqc[] arrayOfZbqc = Zk7u.Zq();
    if (paramT instanceof Zni) {
      Zni zni = (Zni)paramT;
      if (arrayOfZbqc == null) {
        if (zni.Zp8() != null) {
          zni.ZS(null);
          if (paramT instanceof Zw9) {
            Zw9 zw9 = (Zw9)paramT;
            return (T)ZQ(zw9, paramZtew);
          } 
          paramT.ZQ(paramT.ZF().Zc(), new Zk7u(paramZtew, (Zgpi)paramT));
        } 
        return paramT;
      } 
    } 
    return paramT;
  }
  
  private Zsy_ ZQ(Zw9 paramZw9, Ztew paramZtew) {
    Objects.requireNonNull(paramZw9);
    Objects.requireNonNull(paramZtew);
    paramZw9.Zoj().stream().map(paramZw9::Zm).forEach(paramZtew::ZT);
    Objects.requireNonNull(paramZw9);
    Objects.requireNonNull(paramZtew);
    paramZw9.Zot().stream().map(paramZw9::ZJ).forEach(paramZtew::ZT);
    Objects.requireNonNull(paramZw9);
    Objects.requireNonNull(paramZtew);
    paramZw9.Zoz().stream().map(paramZw9::ZH).forEach(paramZtew::ZT);
    Objects.requireNonNull(paramZw9);
    Objects.requireNonNull(paramZtew);
    paramZw9.ZoM().stream().map(paramZw9::ZU).forEach(paramZtew::ZT);
    Objects.requireNonNull(paramZw9);
    Objects.requireNonNull(paramZtew);
    paramZw9.ZoU().stream().map(paramZw9::ZZ).forEach(paramZtew::ZT);
    Objects.requireNonNull(paramZw9);
    Objects.requireNonNull(paramZtew);
    paramZw9.ZoW().stream().map(paramZw9::ZM).forEach(paramZtew::ZT);
    Objects.requireNonNull(paramZw9);
    Objects.requireNonNull(paramZtew);
    paramZw9.Zo9().stream().map(paramZw9::Zb).forEach(paramZtew::ZT);
    Objects.requireNonNull(paramZw9);
    Objects.requireNonNull(paramZtew);
    paramZw9.Zoq().stream().map(paramZw9::Zy).forEach(paramZtew::ZT);
    Objects.requireNonNull(paramZw9);
    Objects.requireNonNull(paramZtew);
    paramZw9.Zok().stream().map(paramZw9::ZPY).forEach(paramZtew::ZT);
    Objects.requireNonNull(paramZw9);
    Objects.requireNonNull(paramZtew);
    paramZw9.Zoa().stream().map(paramZw9::ZS).forEach(paramZtew::ZT);
    Objects.requireNonNull(paramZw9);
    Objects.requireNonNull(paramZtew);
    paramZw9.Zor().stream().map(paramZw9::ZR).forEach(paramZtew::ZT);
    Objects.requireNonNull(paramZw9);
    Objects.requireNonNull(paramZtew);
    paramZw9.Zow().stream().map(paramZw9::Zz).forEach(paramZtew::ZT);
    Objects.requireNonNull(paramZw9);
    Objects.requireNonNull(paramZtew);
    paramZw9.ZoL().stream().map(paramZw9::Zi).forEach(paramZtew::ZT);
    Objects.requireNonNull(paramZw9);
    Objects.requireNonNull(paramZtew);
    paramZw9.ZoP().stream().map(paramZw9::Zo).forEach(paramZtew::ZT);
    Objects.requireNonNull(paramZw9);
    Objects.requireNonNull(paramZtew);
    paramZw9.ZoD().stream().map(paramZw9::ZA).forEach(paramZtew::ZT);
    return paramZw9;
  }
  
  public Zsqo ZB(Ztew paramZtew, Zsqo paramZsqo) {
    return Zd(paramZsqo);
  }
  
  public Zstu ZR(Ztew paramZtew, Zstu paramZstu) {
    return Zd(paramZstu);
  }
  
  public Zmrq ZD(Ztew paramZtew, Zmrq paramZmrq) {
    if (!(paramZmrq instanceof Zni))
      return paramZmrq; 
    ((Zni)paramZmrq).ZS(null);
    return paramZmrq;
  }
  
  public Ze4r ZS(Ztew paramZtew, Ze4r paramZe4r) {
    return Zd(paramZe4r);
  }
  
  public Zghu Ze(Ztew paramZtew, Zghu paramZghu) {
    return Zd(paramZghu);
  }
  
  public Zmyi Zc(Ztew paramZtew, Zmyi paramZmyi) {
    return Zd(paramZmyi);
  }
  
  public Zrap Zj(Ztew paramZtew, Zrap paramZrap) {
    return Zd(paramZrap);
  }
  
  public <T extends Zgpi> Zrte<T> ZG(Ztew paramZtew, Zrte<T> paramZrte) {
    Zbqc[] arrayOfZbqc = Zk7u.Zq();
    if (paramZrte instanceof Zni) {
      Zni zni = (Zni)paramZrte;
      if (arrayOfZbqc == null) {
        if (zni.Zp8() != null) {
          zni.ZS(null);
          byte b = 0;
          while (b < paramZrte.Zpu()) {
            paramZtew.Zc((Zgpi)paramZrte.ZdF(b));
            b++;
            if (arrayOfZbqc != null)
              break; 
          } 
        } 
        return paramZrte;
      } 
    } 
    return paramZrte;
  }
  
  public Zsdr Zj(Zsdr paramZsdr) {
    return Zd(paramZsdr);
  }
  
  public Zzvg ZA(Zzvg paramZzvg) {
    if (!(paramZzvg instanceof Zni))
      return paramZzvg; 
    ((Zni)paramZzvg).ZS(null);
    return paramZzvg;
  }
  
  public Zl5u ZZ(Zl5u paramZl5u) {
    if (!(paramZl5u instanceof Zni))
      return paramZl5u; 
    ((Zni)paramZl5u).ZS(null);
    return paramZl5u;
  }
  
  public <T extends Zgpi> Zefg<T> Zx(Ztew paramZtew, Zefg<T> paramZefg, Zeu4 paramZeu4) {
    Zbqc[] arrayOfZbqc = Zk7u.Zq();
    if (paramZefg instanceof Zni) {
      Zni zni = (Zni)paramZefg;
      if (arrayOfZbqc == null) {
        if (zni.Zp8() != null) {
          zni.ZS(null);
          for (Zgpi zgpi : paramZefg) {
            paramZtew.Zc(zgpi);
            if (arrayOfZbqc != null)
              break; 
          } 
        } 
        return paramZefg;
      } 
    } 
    return paramZefg;
  }
  
  public <T extends Zgpi> Zefg<T> Zs(Ztew paramZtew, Zefg<T> paramZefg, int paramInt, Zeu4 paramZeu4) {
    Zbqc[] arrayOfZbqc = Zk7u.Zq();
    if (paramZefg instanceof Zni) {
      Zni zni = (Zni)paramZefg;
      if (arrayOfZbqc == null) {
        if (zni.Zp8() != null) {
          zni.ZS(null);
          for (Zgpi zgpi : paramZefg) {
            paramZtew.Zc(zgpi);
            if (arrayOfZbqc != null)
              break; 
          } 
        } 
        return paramZefg;
      } 
    } 
    return paramZefg;
  }
  
  public Zmfv ZO(Ztew paramZtew, Zmfv paramZmfv) {
    return Zd(paramZmfv);
  }
  
  public Zg06 ZR(Ztew paramZtew, Zg06 paramZg06) {
    return Zd(paramZg06);
  }
  
  public Zmg ZD(Zmg paramZmg) {
    return Zd(paramZmg);
  }
  
  public Zmg ZE(Zmg paramZmg, int paramInt) {
    return Zd(paramZmg);
  }
  
  public Zrpj Zr(Ztew paramZtew, Zrpj paramZrpj) {
    return Zd(paramZrpj);
  }
  
  public Zxsn ZD(Ztew paramZtew, Zxsn paramZxsn) {
    return Zd(paramZxsn);
  }
  
  public Ze68 Za(Ztew paramZtew, Ze68 paramZe68) {
    return Zd(paramZe68);
  }
  
  public <T extends Zgpi> Zrfx<T> ZI(Ztew paramZtew, Zrfx<T> paramZrfx, Zeu4 paramZeu4) {
    Zbqc[] arrayOfZbqc = Zk7u.Zq();
    if (paramZrfx instanceof Zni) {
      Zni zni = (Zni)paramZrfx;
      if (arrayOfZbqc == null) {
        if (zni.Zp8() != null) {
          zni.ZS(null);
          for (Zgpi zgpi : paramZrfx) {
            paramZtew.ZT(zgpi);
            if (arrayOfZbqc != null)
              break; 
          } 
        } 
        return paramZrfx;
      } 
    } 
    return paramZrfx;
  }
  
  public Zgpi ZG(Ztew paramZtew, Zzwo<? extends Zgpi, ? extends Zgpi> paramZzwo, Zeu4<? extends Zgpi> paramZeu41, Zeu4<? extends Zgpi> paramZeu42) {
    Zbqc[] arrayOfZbqc = Zk7u.Zq();
    if (paramZzwo instanceof Zni) {
      Zni zni = (Zni)paramZzwo;
      if (arrayOfZbqc == null) {
        if (zni.Zp8() != null) {
          zni.ZS(null);
          for (Zgpi zgpi : paramZzwo.ZlW()) {
            paramZtew.ZT(zgpi);
            if (arrayOfZbqc != null)
              break; 
          } 
          for (Zgpi zgpi : paramZzwo.ZlZ()) {
            paramZtew.Zc(zgpi);
            if (arrayOfZbqc != null)
              break; 
          } 
        } 
        return paramZzwo;
      } 
    } 
    return paramZzwo;
  }
  
  public Zgpi Zk(Ztew paramZtew, Zzwo<? extends Zgpi, ? extends Zgpi> paramZzwo, Zeu4<? extends Zgpi> paramZeu41, Zeu4<? extends Zgpi> paramZeu42) {
    Zbqc[] arrayOfZbqc = Zk7u.Zq();
    if (paramZzwo instanceof Zni) {
      Zni zni = (Zni)paramZzwo;
      if (arrayOfZbqc == null) {
        if (zni.Zp8() != null) {
          zni.ZS(null);
          for (Zgpi zgpi : paramZzwo.ZlW()) {
            paramZtew.ZT(zgpi);
            if (arrayOfZbqc != null)
              break; 
          } 
          for (Zgpi zgpi : paramZzwo.ZlZ()) {
            paramZtew.Zc(zgpi);
            if (arrayOfZbqc != null)
              break; 
          } 
        } 
        return paramZzwo;
      } 
    } 
    return paramZzwo;
  }
  
  public Zgpi ZR(Ztew paramZtew, Zg49<? extends Zgpi> paramZg49, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    Zbqc[] arrayOfZbqc = Zk7u.Zq();
    if (paramZg49 instanceof Zni) {
      Zni zni = (Zni)paramZg49;
      if (arrayOfZbqc == null) {
        if (zni.Zp8() != null) {
          zni.ZS(null);
          for (Zgpi zgpi : paramZg49.Zpb()) {
            paramZtew.ZT(zgpi);
            if (arrayOfZbqc != null)
              break; 
          } 
        } 
        return paramZg49;
      } 
    } 
    return paramZg49;
  }
  
  public Zgpi ZI(Ztew paramZtew, Zxsf<? extends Zgpi> paramZxsf, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    Zbqc[] arrayOfZbqc = Zk7u.Zq();
    if (paramZxsf instanceof Zni) {
      Zni zni = (Zni)paramZxsf;
      if (arrayOfZbqc == null) {
        if (zni.Zp8() != null) {
          zni.ZS(null);
          for (Zgpi zgpi : paramZxsf.Zim()) {
            paramZtew.ZT(zgpi);
            if (arrayOfZbqc != null)
              break; 
          } 
        } 
        return paramZxsf;
      } 
    } 
    return paramZxsf;
  }
  
  public Zgpi Zl(Ztew paramZtew, Zr5a<? extends Zgpi> paramZr5a, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    Zbqc[] arrayOfZbqc = Zk7u.Zq();
    if (paramZr5a instanceof Zni) {
      Zni zni = (Zni)paramZr5a;
      if (arrayOfZbqc == null) {
        if (zni.Zp8() != null) {
          zni.ZS(null);
          for (Zgpi zgpi : paramZr5a.ZfQ()) {
            paramZtew.ZT(zgpi);
            if (arrayOfZbqc != null)
              break; 
          } 
        } 
        return paramZr5a;
      } 
    } 
    return paramZr5a;
  }
  
  public Zgpi Zr(Ztew paramZtew, Zxlv<? extends Zgpi> paramZxlv, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    Zbqc[] arrayOfZbqc = Zk7u.Zq();
    if (paramZxlv instanceof Zni) {
      Zni zni = (Zni)paramZxlv;
      if (arrayOfZbqc == null) {
        if (zni.Zp8() != null) {
          zni.ZS(null);
          for (Zgpi zgpi : paramZxlv.ZqI()) {
            paramZtew.ZT(zgpi);
            if (arrayOfZbqc != null)
              break; 
          } 
        } 
        return paramZxlv;
      } 
    } 
    return paramZxlv;
  }
  
  public Zgpi Zx(Ztew paramZtew, Zmwp<? extends Zgpi> paramZmwp, Zeu4<? extends Zgpi> paramZeu4, Ztdo paramZtdo) {
    Zbqc[] arrayOfZbqc = Zk7u.Zq();
    if (paramZmwp instanceof Zni) {
      Zni zni = (Zni)paramZmwp;
      if (arrayOfZbqc == null) {
        if (zni.Zp8() != null) {
          zni.ZS(null);
          for (Zgpi zgpi : paramZmwp.ZMO()) {
            paramZtew.ZT(zgpi);
            if (arrayOfZbqc != null)
              break; 
          } 
        } 
        return paramZmwp;
      } 
    } 
    return paramZmwp;
  }
  
  public Zgpi Zz(Ztew paramZtew, Ze93<? extends Zgpi> paramZe93, Zeu4<? extends Zgpi> paramZeu4) {
    Zbqc[] arrayOfZbqc = Zk7u.Zq();
    if (paramZe93 instanceof Zni) {
      Zni zni = (Zni)paramZe93;
      if (arrayOfZbqc == null) {
        if (zni.Zp8() != null) {
          zni.ZS(null);
          for (Zgpi zgpi : paramZe93.ZjS()) {
            paramZtew.Zc(zgpi);
            if (arrayOfZbqc != null)
              break; 
          } 
        } 
        return paramZe93;
      } 
    } 
    return paramZe93;
  }
  
  public Zgpi Zh(Ztew paramZtew, Zt7v<? extends Zgpi> paramZt7v, Zeu4<? extends Zgpi> paramZeu4) {
    Zbqc[] arrayOfZbqc = Zk7u.Zq();
    if (paramZt7v instanceof Zni) {
      Zni zni = (Zni)paramZt7v;
      if (arrayOfZbqc == null) {
        if (zni.Zp8() != null) {
          zni.ZS(null);
          for (Zgpi zgpi : paramZt7v.ZPN()) {
            paramZtew.Zc(zgpi);
            if (arrayOfZbqc != null)
              break; 
          } 
        } 
        return paramZt7v;
      } 
    } 
    return paramZt7v;
  }
  
  public Zgpi ZS(Ztew paramZtew, Zltc paramZltc) {
    return Zd(paramZltc);
  }
  
  public <T extends Zgpi> void ZS(T paramT) {}
  
  private static <T extends Zgpi<T>> T Zd(T paramT) {
    if (!(paramT instanceof Zni))
      return paramT; 
    ((Zni)paramT).ZS(null);
    return paramT;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsks.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */