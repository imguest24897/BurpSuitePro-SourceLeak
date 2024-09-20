package burp;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Zrnv {
  private final Zshb Zj;
  
  private final Supplier<Rectangle> Zv;
  
  private final List<Ztu> Z_;
  
  private static final String a;
  
  public Zrnv(Zshb paramZshb, Supplier<Rectangle> paramSupplier) {
    this.Zj = paramZshb.ZD(a);
    this.Zv = paramSupplier;
    this.Z_ = new ArrayList<>();
  }
  
  void ZF(List<? extends Zl04> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zj : Lburp/Zshb;
    //   4: invokeinterface ZB : ()V
    //   9: iconst_0
    //   10: aload_1
    //   11: invokeinterface size : ()I
    //   16: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   19: aload_0
    //   20: aload_1
    //   21: <illegal opcode> accept : (Lburp/Zrnv;Ljava/util/List;)Ljava/util/function/IntConsumer;
    //   26: invokeinterface forEach : (Ljava/util/function/IntConsumer;)V
    //   31: return
  }
  
  Ztu Zy(int paramInt) {
    return (paramInt < this.Z_.size()) ? this.Z_.get(paramInt) : ZO();
  }
  
  void ZZ(int paramInt) {
    if (paramInt < this.Z_.size())
      this.Z_.remove(paramInt); 
  }
  
  private void Zp(int paramInt, Zl04 paramZl04) {
    String str = String.valueOf(paramInt);
    Zshb zshb = this.Zj.ZD(str);
    Rectangle rectangle = paramZl04.Zo();
    zshb.ZV(Zm4m.X.ZH(), String.valueOf(rectangle.x));
    zshb.ZV(Zm4m.Y.ZH(), String.valueOf(rectangle.y));
    zshb.ZV(Zm4m.WIDTH.ZH(), String.valueOf(rectangle.width));
    zshb.ZV(Zm4m.HEIGHT.ZH(), String.valueOf(rectangle.height));
    zshb.ZV(Zm4m.EXPANDED_STATE.ZH(), String.valueOf(paramZl04.getExtendedState()));
  }
  
  void Zd(int paramInt) {
    this.Z_.clear();
    Objects.requireNonNull(this.Z_);
    IntStream.range(0, paramInt).mapToObj(this::lambda$loadFramePreferences$1).map(this::lambda$loadFramePreferences$2).forEach(this.Z_::add);
  }
  
  private Ztu ZO() {
    Rectangle rectangle = this.Zv.get();
    int i = (int)(rectangle.getX() + (rectangle.getWidth() - 1024.0D) / 2.0D);
    int j = (int)(rectangle.getY() + (rectangle.getHeight() - 768.0D) / 2.0D);
    return new Ztu(i, j, 1024, 768, 0);
  }
  
  private Ztu lambda$loadFramePreferences$2(Zshb paramZshb) {
    return Ztu.ZI(paramZshb, ZO());
  }
  
  private Zshb lambda$loadFramePreferences$1(int paramInt) {
    return this.Zj.ZD(String.valueOf(paramInt));
  }
  
  private void lambda$saveFramePreferences$0(List<Zl04> paramList, int paramInt) {
    Zp(paramInt, paramList.get(paramInt));
  }
  
  static {
    // Byte code:
    //   0: iconst_1
    //   1: ldc 'jBs$2|yj\\na70yy}'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zrnv.a : Ljava/lang/String;
    //   10: goto -> 154
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 128
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #15
    //   82: goto -> 112
    //   85: bipush #38
    //   87: goto -> 112
    //   90: bipush #6
    //   92: goto -> 112
    //   95: bipush #68
    //   97: goto -> 112
    //   100: bipush #80
    //   102: goto -> 112
    //   105: bipush #21
    //   107: goto -> 112
    //   110: bipush #29
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 34
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 31
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 7
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrnv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */