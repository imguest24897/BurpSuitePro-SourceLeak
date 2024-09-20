package com.fasterxml.Zor;

import com.fasterxml.Zb.Za;
import com.fasterxml.Zb.Zs;
import com.fasterxml.Zg.Zfr;
import com.fasterxml.Zg.Zy;
import com.fasterxml.Zm.Zx;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class Zb extends Zc implements Za, Iterable<Zb> {
  private static int[] Zl;
  
  public int Zv() {
    return 0;
  }
  
  public final boolean ZA() {
    switch (Zl.ZR[ZF().ordinal()]) {
      case 1:
      case 2:
      case 3:
        return false;
    } 
    return true;
  }
  
  public final boolean Zm() {
    Zfr zfr = ZF();
    return (zfr == Zfr.OBJECT || zfr == Zfr.ARRAY);
  }
  
  public boolean ZD() {
    return false;
  }
  
  public boolean ZJ() {
    return false;
  }
  
  public boolean ZB() {
    return false;
  }
  
  public abstract Zb ZC(int paramInt);
  
  public Zb ZL(String paramString) {
    return null;
  }
  
  public Iterator<String> ZM() {
    return Zx.Zd();
  }
  
  public final Zb Z_(Zs paramZs) {
    if (paramZs.Zb())
      return this; 
    Zb zb = Zu(paramZs);
    return (Zb)((zb == null) ? Zy.ZH() : zb.Z_(paramZs.ZC()));
  }
  
  public final Zb Z_(String paramString) {
    return Z_(Zs.Zl(paramString));
  }
  
  protected abstract Zb Zu(Zs paramZs);
  
  public abstract Zfr ZF();
  
  public final boolean Zy() {
    return (ZF() == Zfr.POJO);
  }
  
  public final boolean Zd() {
    return (ZF() == Zfr.NUMBER);
  }
  
  public boolean Za() {
    return false;
  }
  
  public final boolean ZL() {
    return (ZF() == Zfr.BOOLEAN);
  }
  
  public final boolean Zt() {
    return (ZF() == Zfr.NULL);
  }
  
  public final boolean Zl() {
    return (ZF() == Zfr.BINARY);
  }
  
  public boolean ZP() {
    return false;
  }
  
  public boolean ZQ() {
    return false;
  }
  
  public String Zz() {
    return null;
  }
  
  public byte[] Zw() throws IOException {
    return null;
  }
  
  public boolean ZY() {
    return false;
  }
  
  public Number Zu() {
    return null;
  }
  
  public int ZN() {
    return 0;
  }
  
  public long Zh() {
    return 0L;
  }
  
  public double Zg() {
    return 0.0D;
  }
  
  public BigDecimal Zq() {
    return BigDecimal.ZERO;
  }
  
  public BigInteger ZS() {
    return BigInteger.ZERO;
  }
  
  public abstract String Zp();
  
  @Deprecated
  public String ZR(String paramString) {
    String str = Zp();
    return (str == null) ? paramString : str;
  }
  
  public boolean Zf() {
    return ZA(false);
  }
  
  public boolean ZA(boolean paramBoolean) {
    return paramBoolean;
  }
  
  public final Iterator<Zb> iterator() {
    return Zn();
  }
  
  public Iterator<Zb> Zn() {
    return Zx.Zd();
  }
  
  public Iterator<Map.Entry<String, Zb>> Zj() {
    return Zx.Zd();
  }
  
  public final List<Zb> ZB(String paramString) {
    List<Zb> list = ZI(paramString, null);
    return (list == null) ? Collections.emptyList() : list;
  }
  
  public final List<Zb> ZS(String paramString) {
    List<Zb> list = ZM(paramString, null);
    return (list == null) ? Collections.emptyList() : list;
  }
  
  public abstract List<Zb> ZI(String paramString, List<Zb> paramList);
  
  public abstract List<Zb> ZM(String paramString, List<Zb> paramList);
  
  public abstract String toString();
  
  public abstract boolean equals(Object paramObject);
  
  public static void ZR(int[] paramArrayOfint) {
    Zl = paramArrayOfint;
  }
  
  public static int[] Zo() {
    return Zl;
  }
  
  static {
    if (Zo() != null)
      ZR(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */