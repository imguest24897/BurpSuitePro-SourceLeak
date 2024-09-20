package net.portswigger.devtools.protocol.types.debugger;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.debugger.DisassembleWasmModule")
public class DisassembleWasmModule {
  @Zvd(Zp = "streamId")
  @Zj
  public final String streamId;
  
  @Zvd(Zp = "totalNumberOfLines")
  public final Integer totalNumberOfLines;
  
  @Zvd(Zp = "functionBodyOffsets")
  public final List<Integer> functionBodyOffsets;
  
  @Zvd(Zp = "chunk")
  public final WasmDisassemblyChunk chunk;
  
  @Zox
  public DisassembleWasmModule(@Zc5(Ze = "streamId", ZS = "null") String paramString, @Zc5(Ze = "totalNumberOfLines") Integer paramInteger, @Zc5(Ze = "functionBodyOffsets") List<Integer> paramList, @Zc5(Ze = "chunk") WasmDisassemblyChunk paramWasmDisassemblyChunk) {
    this.streamId = paramString;
    this.totalNumberOfLines = paramInteger;
    this.functionBodyOffsets = paramList;
    this.chunk = paramWasmDisassemblyChunk;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\debugger\DisassembleWasmModule.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */