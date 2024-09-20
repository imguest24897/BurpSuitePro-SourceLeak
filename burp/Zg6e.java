package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Zg6e implements Zzes, Zz6 {
  private final List<Zbno> ZV;
  
  private final List<Zs0s> ZW;
  
  private final List<Zt3k> Zm;
  
  private final ReentrantReadWriteLock.ReadLock Z_;
  
  private final ReentrantReadWriteLock.WriteLock ZH;
  
  private final ReentrantReadWriteLock.ReadLock ZC;
  
  private final ReentrantReadWriteLock.WriteLock ZX;
  
  private long ZR;
  
  private static String[] Zn;
  
  public Zg6e(int paramInt) {
    this.ZR = Zl8b.Zt(paramInt);
    this.ZV = new CopyOnWriteArrayList<>();
    this.ZW = new LinkedList<>();
    String[] arrayOfString = ZV();
    this.Zm = new LinkedList<>();
    ReentrantReadWriteLock reentrantReadWriteLock1 = new ReentrantReadWriteLock();
    this.Z_ = reentrantReadWriteLock1.readLock();
    this.ZH = reentrantReadWriteLock1.writeLock();
    ReentrantReadWriteLock reentrantReadWriteLock2 = new ReentrantReadWriteLock();
    this.ZC = reentrantReadWriteLock2.readLock();
    this.ZX = reentrantReadWriteLock2.writeLock();
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public long ZU() {
    return this.ZR;
  }
  
  public boolean ZZ(Zesy paramZesy) {
    String[] arrayOfString = ZV();
    this.Z_.lock();
    try {
      for (Zs0s zs0s : this.ZW) {
        if (zs0s.ZX(paramZesy))
          return false; 
        if (arrayOfString == null)
          break; 
      } 
      return true;
    } finally {
      this.Z_.unlock();
    } 
  }
  
  public boolean ZN(Zto7 paramZto7) {
    String[] arrayOfString = ZV();
    this.ZC.lock();
    try {
      for (Zt3k zt3k : this.Zm) {
        if (zt3k.Zo(paramZto7))
          return false; 
        if (arrayOfString == null)
          break; 
      } 
      boolean bool = true;
      this.ZC.unlock();
      return bool;
    } finally {
      this.ZC.unlock();
    } 
  }
  
  public void Za(int paramInt) {
    this.ZR = Zl8b.Zt(paramInt);
    this.ZV.forEach(Zbno::ZW);
  }
  
  public void Zv(List<Zs0s> paramList) {
    this.ZH.lock();
    try {
      this.ZW.clear();
      this.ZW.addAll(paramList);
    } finally {
      this.ZH.unlock();
    } 
  }
  
  public void ZJ(List<Zt3k> paramList) {
    this.ZX.lock();
    try {
      this.Zm.clear();
      this.Zm.addAll(paramList);
    } finally {
      this.ZX.unlock();
    } 
  }
  
  public void Zb(Zbno paramZbno) {
    this.ZV.add(paramZbno);
  }
  
  public static void Zi(String[] paramArrayOfString) {
    Zn = paramArrayOfString;
  }
  
  public static String[] ZV() {
    return Zn;
  }
  
  static {
    if (ZV() == null)
      Zi(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg6e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */