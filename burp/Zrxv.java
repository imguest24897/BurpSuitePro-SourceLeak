package burp;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.dnd.DragSource;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Zrxv {
  private boolean ZL;
  
  private boolean ZF;
  
  private boolean Zi;
  
  private boolean ZQ;
  
  private boolean ZM;
  
  private Predicate<Integer> Zm = Zrxv::lambda$new$0;
  
  private boolean Zv;
  
  private boolean Zr;
  
  private boolean Zz;
  
  private boolean Zo;
  
  private boolean Za;
  
  private boolean ZP;
  
  private boolean ZE;
  
  private Component Zu;
  
  private Zlkk Zl;
  
  private Ztca ZZ = Ztca.ZN;
  
  private Zzyl Ze;
  
  private Zgwj ZI = Zgwj.ZY;
  
  private Zzc2 ZW = Zzc2.Z_;
  
  private Zrsj<? extends Zr6e> ZA = Zrsj.Zv;
  
  private Ztuc Zx;
  
  private Zz9w Zw;
  
  private Consumer<Zlfz> Zk;
  
  private Cursor ZO;
  
  public static Zrxv Zp() {
    return new Zrxv();
  }
  
  public Zrxv ZD(boolean paramBoolean) {
    this.Zo = paramBoolean;
    return this;
  }
  
  public Zrxv ZP(Zzyl paramZzyl) {
    this.Ze = paramZzyl;
    return this;
  }
  
  public Zrxv ZQ() {
    this.ZL = true;
    return this;
  }
  
  public Zrxv ZP() {
    this.ZF = true;
    return this;
  }
  
  public Zrxv Ze(Zzc2 paramZzc2) {
    this.ZW = paramZzc2;
    return this;
  }
  
  public Zrxv Zv(Zrsj<? extends Zr6e> paramZrsj) {
    this.Zi = true;
    this.ZA = paramZrsj;
    this.Zz = true;
    return this;
  }
  
  public Zrxv Zh() {
    this.ZQ = true;
    return this;
  }
  
  public Zrxv Z_(Predicate<Integer> paramPredicate) {
    this.Zm = paramPredicate;
    return this;
  }
  
  public Zrxv ZX() {
    this.ZM = true;
    return this;
  }
  
  public Zrxv Z_() {
    this.Zv = true;
    return this;
  }
  
  public Zrxv Zs() {
    this.Zr = true;
    return this;
  }
  
  public Zrxv ZA() {
    this.Zz = true;
    return this;
  }
  
  public Zrxv ZV() {
    this.Za = true;
    return this;
  }
  
  public Zrxv ZI() {
    this.ZP = true;
    return this;
  }
  
  public Zrxv ZH(Ztca paramZtca) {
    this.ZZ = paramZtca;
    return this;
  }
  
  public Zrxv ZD(Zlkk paramZlkk) {
    this.Zl = paramZlkk;
    return this;
  }
  
  public Zrxv ZO(Zgwj paramZgwj) {
    this.ZI = paramZgwj;
    return this;
  }
  
  public Zrxv ZG() {
    this.ZE = true;
    return this;
  }
  
  public Zrxv Zl(Component paramComponent) {
    this.Zu = paramComponent;
    return this;
  }
  
  public Zrxv ZD(Ztuc paramZtuc) {
    this.Zx = paramZtuc;
    return this;
  }
  
  public Zrxv ZE(Zz9w paramZz9w) {
    this.Zw = paramZz9w;
    return this;
  }
  
  public Zrxv ZG(Consumer<Zlfz> paramConsumer) {
    this.Zk = paramConsumer;
    return this;
  }
  
  public Zrxv Zv(Cursor paramCursor) {
    this.ZO = paramCursor;
    return this;
  }
  
  public Zlte ZW() {
    AtomicReference<Zxer> atomicReference = new AtomicReference();
    if (this.Zx == null) {
      Objects.requireNonNull(atomicReference);
      this.Zx = new Ztim<>(atomicReference::get, this.ZA, this.ZZ, this.ZF, this.Zi, this.Zm, this.Zr, this.ZE);
    } 
    if (this.Zw == null)
      this.Zw = new Zl3r(); 
    if (this.Zk == null)
      this.Zk = Zrxv::lambda$build$1; 
    if (this.ZO == null)
      this.ZO = DragSource.DefaultMoveNoDrop; 
    Zxer zxer = new Zxer(this.ZL, this.ZF, this.Zi, this.ZQ, this.Zm, this.ZM, this.Zv, this.Zr, this.Zz, this.Zo, this.Za, this.ZP, this.ZE, this.Zu, this.Zl, this.ZZ, this.ZI, this.ZW, this.ZA, this.Ze, this.Zx, this.Zw, this.Zk, this.ZO);
    atomicReference.set(zxer);
    return zxer;
  }
  
  private static void lambda$build$1(Zlfz paramZlfz) {}
  
  private static boolean lambda$new$0(Integer paramInteger) {
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrxv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */