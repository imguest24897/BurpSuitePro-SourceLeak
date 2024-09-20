package net.portswigger.devtools.protocol.types.debugger;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.debugger.WasmDisassemblyChunk")
public class WasmDisassemblyChunk {
  @Zvd(Zp = "lines")
  public final List<String> lines;
  
  @Zvd(Zp = "bytecodeOffsets")
  public final List<Integer> bytecodeOffsets;
  
  private static String Zw;
  
  @Zox
  public WasmDisassemblyChunk(@Zc5(Ze = "lines") List<String> paramList, @Zc5(Ze = "bytecodeOffsets") List<Integer> paramList1) {
    this.lines = paramList;
    this.bytecodeOffsets = paramList1;
  }
  
  public static void Ze(String paramString) {
    Zw = paramString;
  }
  
  public static String ZA() {
    return Zw;
  }
  
  static {
    if (ZA() == null)
      Ze("aE4rLc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\debugger\WasmDisassemblyChunk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */