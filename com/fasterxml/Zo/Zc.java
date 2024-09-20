package com.fasterxml.Zo;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zoz.Zv;
import com.fasterxml.Zp.Zt;
import java.io.IOException;

public abstract class Zc extends Zv {
  protected final Zv ZM;
  
  protected Zc(Zv paramZv) {
    super(paramZv);
    this.ZM = paramZv;
  }
  
  protected abstract Zv Zc(Zv paramZv);
  
  protected Zv Zq(Zv paramZv) {
    return (paramZv == this.ZM) ? this : Zc(paramZv);
  }
  
  public Zv Zt(Zyo<?> paramZyo) {
    return Zq(this.ZM.Zt(paramZyo));
  }
  
  public Zv ZU(Zr paramZr) {
    return Zq(this.ZM.ZU(paramZr));
  }
  
  public Zv ZC(Zzb paramZzb) {
    return Zq(this.ZM.ZC(paramZzb));
  }
  
  public void Za(int paramInt) {
    this.ZM.Za(paramInt);
  }
  
  public void ZL(Zyc paramZyc) {
    this.ZM.ZL(paramZyc);
  }
  
  protected Class<?> ZY() {
    return this.ZM.ZY();
  }
  
  public String Zs() {
    return this.ZM.Zs();
  }
  
  public Zv ZM() {
    return this.ZM.ZM();
  }
  
  public boolean ZN() {
    return this.ZM.ZN();
  }
  
  public boolean Zz() {
    return this.ZM.Zz();
  }
  
  public Zyo<Object> ZD() {
    return this.ZM.ZD();
  }
  
  public Zt Zc() {
    return this.ZM.Zc();
  }
  
  public boolean Zj(Class<?> paramClass) {
    return this.ZM.Zj(paramClass);
  }
  
  public boolean Zk() {
    return this.ZM.Zk();
  }
  
  public int Zt() {
    return this.ZM.Zt();
  }
  
  public Object ZP() {
    return this.ZM.ZP();
  }
  
  public boolean Zv() {
    return this.ZM.Zv();
  }
  
  public Ziz ZQ() {
    return this.ZM.ZQ();
  }
  
  public void ZP(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    this.ZM.ZP(paramZg, paramZyg, paramObject);
  }
  
  public Object ZR(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    return this.ZM.ZR(paramZg, paramZyg, paramObject);
  }
  
  public void Zj(Object paramObject1, Object paramObject2) throws IOException {
    this.ZM.Zj(paramObject1, paramObject2);
  }
  
  public Object ZN(Object paramObject1, Object paramObject2) throws IOException {
    return this.ZM.ZN(paramObject1, paramObject2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo\Zc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */