package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.ui.Selection;
import burp.api.montoya.ui.editor.RawEditor;
import java.awt.Component;
import java.util.Optional;
import javax.swing.JComponent;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Ztq3 implements RawEditor {
  private final Zbkv Zw;
  
  private final boolean Ze;
  
  private final Zskl Zb;
  
  private static final String a;
  
  Ztq3(Zbkv paramZbkv, boolean paramBoolean, Zskl paramZskl) {
    this.Zw = paramZbkv;
    this.Ze = paramBoolean;
    this.Zb = paramZskl;
  }
  
  public JComponent Zp() {
    return this.Zw;
  }
  
  public void setEditable(boolean paramBoolean) {
    try {
      if (paramBoolean)
        try {
          if (this.Ze)
            throw new IllegalStateException(a); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zw.Zc(paramBoolean);
  }
  
  public void setContents(ByteArray paramByteArray) {
    try {
      if (paramByteArray == null)
        paramByteArray = this.Zb.ZI(new byte[0]); 
      this.Zw.Zx(paramByteArray.getBytes());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public ByteArray getContents() {
    return this.Zb.ZI(this.Zw.ZF());
  }
  
  public boolean isModified() {
    return this.Zw.Ze();
  }
  
  public int caretPosition() {
    return this.Zw.Zo();
  }
  
  public Optional<Selection> selection() {
    byte[] arrayOfByte = this.Zw.Z_();
    try {
      if (arrayOfByte != null)
        try {
          if (arrayOfByte.length != 0) {
            Selection selection = this.Zb.Zp(arrayOfByte, this.Zw.ZK());
            return Optional.of(selection);
          } 
          return Optional.empty();
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return Optional.empty();
  }
  
  public void setSearchExpression(String paramString) {
    try {
      if (paramString == null)
        paramString = ""; 
      this.Zw.Zt(paramString);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: ldc '9~FO\\b7@\L\y^'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Ztq3.a : Ljava/lang/String;
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
    //   80: bipush #121
    //   82: goto -> 112
    //   85: bipush #114
    //   87: goto -> 112
    //   90: bipush #18
    //   92: goto -> 112
    //   95: bipush #55
    //   97: goto -> 112
    //   100: bipush #123
    //   102: goto -> 112
    //   105: bipush #56
    //   107: goto -> 112
    //   110: bipush #45
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztq3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */