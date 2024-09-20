package burp;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Zzpo {
  private final List<Zmk7<Zb2e>> ZK = new ArrayList<>();
  
  private Component ZV;
  
  private Integer ZA;
  
  private boolean Zk = false;
  
  private Comparator<Zb2e> Zn;
  
  private Consumer<Zb2e> Zm;
  
  private boolean ZI;
  
  private Zlkk Zf;
  
  private int ZC = 0;
  
  private boolean ZQ = true;
  
  private int Zw = 0;
  
  private boolean ZM = false;
  
  private boolean Zp;
  
  private Zz28 Zq;
  
  private int ZR = -1;
  
  private String Zc;
  
  private String Zl;
  
  private Ze9n Zo;
  
  @SafeVarargs
  public final Zzpo ZG(Zmk7<Zb2e>... paramVarArgs) {
    this.ZK.addAll(Arrays.asList(paramVarArgs));
    return this;
  }
  
  public Zzpo Zw(Component paramComponent) {
    this.ZV = paramComponent;
    return this;
  }
  
  public Zzpo Zz(Integer paramInteger) {
    this.ZA = paramInteger;
    return this;
  }
  
  public Zzpo Zv() {
    this.Zk = true;
    return this;
  }
  
  public Zzpo Zt(Comparator<Zb2e> paramComparator) {
    this.Zn = paramComparator;
    return this;
  }
  
  public Zzpo ZN(Consumer<Zb2e> paramConsumer) {
    this.Zm = paramConsumer;
    return this;
  }
  
  public Zzpo ZA() {
    this.ZI = true;
    return this;
  }
  
  public Zzpo Zs(Zlkk paramZlkk) {
    this.Zf = paramZlkk;
    return this;
  }
  
  public Zzpo Zj(int paramInt) {
    this.ZC = paramInt;
    return this;
  }
  
  public Zzpo Zm(boolean paramBoolean) {
    this.ZQ = paramBoolean;
    return this;
  }
  
  public Zzpo ZD(int paramInt) {
    this.Zw = paramInt;
    return this;
  }
  
  public Zzpo Zd(boolean paramBoolean) {
    this.ZM = paramBoolean;
    return this;
  }
  
  public Zzpo Z_(String paramString1, String paramString2, Ze9n paramZe9n) {
    this.Zc = paramString1;
    this.Zl = paramString2;
    this.Zo = paramZe9n;
    this.Zp = true;
    return this;
  }
  
  public Zzpo ZZ(Zz28 paramZz28) {
    this.Zq = paramZz28;
    return this;
  }
  
  public Zzpo Zk(int paramInt) {
    this.ZR = paramInt;
    return this;
  }
  
  Zmjx<Zb2e> Zw() {
    return new Zgjg<>(this.ZK);
  }
  
  Component ZX() {
    return this.ZV;
  }
  
  public Integer Zx() {
    return this.ZA;
  }
  
  public boolean Zq() {
    return this.Zk;
  }
  
  Comparator<Zb2e> Zc() {
    return this.Zn;
  }
  
  Consumer<Zb2e> Zn() {
    return this.Zm;
  }
  
  boolean ZJ() {
    return this.ZI;
  }
  
  Zlkk ZN() {
    return this.Zf;
  }
  
  int Zk() {
    return this.ZC;
  }
  
  boolean ZB() {
    return this.ZQ;
  }
  
  int ZT() {
    return this.Zw;
  }
  
  public boolean Zh() {
    return this.ZM;
  }
  
  public boolean ZY() {
    return this.Zp;
  }
  
  public boolean Zl() {
    return (this.ZR != -1);
  }
  
  public Zz28 ZW() {
    return this.Zq;
  }
  
  public int Za() {
    return this.ZR;
  }
  
  public String Zp() {
    return this.Zc;
  }
  
  public Ze9n ZR() {
    return this.Zo;
  }
  
  public String Zs() {
    return this.Zl;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzpo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */