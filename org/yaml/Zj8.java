package org.yaml;

import burp.Zbqc;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Zj8 {
  private List<Zl2> Zw;
  
  private final Queue<Zlv> Zs;
  
  private final Zto[] ZT;
  
  private static int[] Zq;
  
  public Zj8(Zjy paramZjy, Zto... paramVarArgs) {
    this.Zs = new Z_f(this, paramZjy);
    int[] arrayOfInt = Zr();
    this.ZT = paramVarArgs;
    this.Zw = new ArrayList<>();
    if (Zbqc.Zwu() == null)
      Zz(new int[1]); 
  }
  
  public Zj8(Queue<Zlv> paramQueue, Zto... paramVarArgs) {
    this.Zs = paramQueue;
    this.ZT = paramVarArgs;
    this.Zw = new ArrayList<>();
  }
  
  private boolean Zk(Zlv paramZlv) {
    int[] arrayOfInt = Zr();
    if (paramZlv == null || !paramZlv.Zz(Zj7.Comment))
      return false; 
    Zld zld = (Zld)paramZlv;
    Zto[] arrayOfZto = this.ZT;
    int i = arrayOfZto.length;
    byte b = 0;
    while (b < i) {
      Zto zto = arrayOfZto[b];
      if (zld.Zz() == zto)
        return true; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return false;
  }
  
  public Zj8 Zh() {
    ZF(null);
    return this;
  }
  
  public Zlv ZF(Zlv paramZlv) {
    int[] arrayOfInt = Zr();
    if (paramZlv != null)
      if (Zk(paramZlv)) {
        this.Zw.add(new Zl2((Zld)paramZlv));
        if (arrayOfInt == null)
          return paramZlv; 
      } else {
        return paramZlv;
      }  
    while (Zk(this.Zs.peek())) {
      this.Zw.add(new Zl2((Zld)this.Zs.poll()));
      if (arrayOfInt == null)
        break; 
    } 
    return null;
  }
  
  public Zlv ZY(Zlv paramZlv) {
    Zlv zlv = ZF(paramZlv);
    return (zlv != null) ? zlv : this.Zs.poll();
  }
  
  public List<Zl2> Zm() {
    try {
      return this.Zw;
    } finally {
      this.Zw = new ArrayList<>();
    } 
  }
  
  public boolean ZR() {
    return this.Zw.isEmpty();
  }
  
  public static void Zz(int[] paramArrayOfint) {
    Zq = paramArrayOfint;
  }
  
  public static int[] Zr() {
    return Zq;
  }
  
  static {
    if (Zr() == null)
      Zz(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zj8.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */