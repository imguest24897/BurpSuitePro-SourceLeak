package com.fasterxml.Zq;

import com.fasterxml.Zb.Zm;
import com.fasterxml.Zb.Zm5;
import com.fasterxml.Zb.Zmd;
import com.fasterxml.Zb.Zmm;
import com.fasterxml.Zb.Zq;
import com.fasterxml.Zc.Zz;
import com.fasterxml.Zv1;
import com.fasterxml.Zv9;
import com.fasterxml.Zx.Zo;
import java.io.IOException;

public abstract class Zg extends Zo {
  protected static final int Ze = Zm.ALLOW_TRAILING_COMMA.Zi();
  
  protected static final int Zej = Zm.ALLOW_NUMERIC_LEADING_ZEROS.Zi();
  
  protected static final int Ze7 = Zm.ALLOW_NON_NUMERIC_NUMBERS.Zi();
  
  protected static final int Zef = Zm.ALLOW_MISSING_VALUES.Zi();
  
  protected static final int ZZ = Zm.ALLOW_SINGLE_QUOTES.Zi();
  
  protected static final int ZeE = Zm.ALLOW_UNQUOTED_FIELD_NAMES.Zi();
  
  protected static final int ZK = Zm.ALLOW_COMMENTS.Zi();
  
  protected static final int ZeA = Zm.ALLOW_YAML_COMMENTS.Zi();
  
  protected static final int[] ZO = Zv1.Zd();
  
  protected static final int[] Zer = Zv1.Zq();
  
  protected Zmd Za;
  
  protected Zg(Zv9 paramZv9, int paramInt, Zmd paramZmd) {
    super(paramZv9, paramInt);
    this.Za = paramZmd;
  }
  
  public Zmd Zv() {
    return this.Za;
  }
  
  public final Zz<Zq> ZN() {
    return ZF;
  }
  
  public Zmm Z_() throws IOException {
    return Zmm.UNKNOWN;
  }
  
  public abstract Zm5 Zz();
  
  public abstract Zm5 ZQ();
  
  protected abstract Zm5 Z_h();
  
  @Deprecated
  public final Zm5 Zl() {
    return Zz();
  }
  
  @Deprecated
  public final Zm5 ZK() {
    return ZQ();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq\Zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */