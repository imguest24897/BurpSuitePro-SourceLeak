package net.portswigger.devtools.protocol.events.debugger;

import burp.Zbqc;
import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.debugger.DebugSymbols;
import net.portswigger.devtools.protocol.types.debugger.ScriptLanguage;
import net.portswigger.devtools.protocol.types.runtime.StackTrace;

@Zsi("net.portswigger.devtools.protocol.events.debugger.ScriptParsed")
public class ScriptParsed implements Zl {
  @Zvd(Zp = "scriptId")
  public final String scriptId;
  
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "startLine")
  public final Integer startLine;
  
  @Zvd(Zp = "startColumn")
  public final Integer startColumn;
  
  @Zvd(Zp = "endLine")
  public final Integer endLine;
  
  @Zvd(Zp = "endColumn")
  public final Integer endColumn;
  
  @Zvd(Zp = "executionContextId")
  public final Integer executionContextId;
  
  @Zvd(Zp = "hash")
  public final String hash;
  
  @Zvd(Zp = "executionContextAuxData")
  @Zj
  public final Map<String, Zi7> executionContextAuxData;
  
  @Zvd(Zp = "isLiveEdit")
  @Zy
  @Zj
  public final Boolean isLiveEdit;
  
  @Zvd(Zp = "sourceMapURL")
  @Zj
  public final String sourceMapURL;
  
  @Zvd(Zp = "hasSourceURL")
  @Zj
  public final Boolean hasSourceURL;
  
  @Zvd(Zp = "isModule")
  @Zj
  public final Boolean isModule;
  
  @Zvd(Zp = "length")
  @Zj
  public final Integer length;
  
  @Zvd(Zp = "stackTrace")
  @Zy
  @Zj
  public final StackTrace stackTrace;
  
  @Zvd(Zp = "codeOffset")
  @Zy
  @Zj
  public final Integer codeOffset;
  
  @Zvd(Zp = "scriptLanguage")
  @Zy
  @Zj
  public final ScriptLanguage scriptLanguage;
  
  @Zvd(Zp = "debugSymbols")
  @Zy
  @Zj
  public final DebugSymbols debugSymbols;
  
  @Zvd(Zp = "embedderName")
  @Zy
  @Zj
  public final String embedderName;
  
  private static boolean Ze;
  
  @Zox
  public ScriptParsed(@Zc5(Ze = "scriptId") String paramString1, @Zc5(Ze = "url") String paramString2, @Zc5(Ze = "startLine") Integer paramInteger1, @Zc5(Ze = "startColumn") Integer paramInteger2, @Zc5(Ze = "endLine") Integer paramInteger3, @Zc5(Ze = "endColumn") Integer paramInteger4, @Zc5(Ze = "executionContextId") Integer paramInteger5, @Zc5(Ze = "hash") String paramString3, @Zc5(Ze = "executionContextAuxData", ZS = "null") Map<String, Zi7> paramMap, @Zc5(Ze = "isLiveEdit", ZS = "null") Boolean paramBoolean1, @Zc5(Ze = "sourceMapURL", ZS = "null") String paramString4, @Zc5(Ze = "hasSourceURL", ZS = "null") Boolean paramBoolean2, @Zc5(Ze = "isModule", ZS = "null") Boolean paramBoolean3, @Zc5(Ze = "length", ZS = "null") Integer paramInteger6, @Zc5(Ze = "stackTrace", ZS = "null") StackTrace paramStackTrace, @Zc5(Ze = "codeOffset", ZS = "null") Integer paramInteger7, @Zc5(Ze = "scriptLanguage", ZS = "null") ScriptLanguage paramScriptLanguage, @Zc5(Ze = "debugSymbols", ZS = "null") DebugSymbols paramDebugSymbols, @Zc5(Ze = "embedderName", ZS = "null") String paramString5) {
    boolean bool = ZI();
    this.scriptId = paramString1;
    this.url = paramString2;
    this.startLine = paramInteger1;
    this.startColumn = paramInteger2;
    this.endLine = paramInteger3;
    this.endColumn = paramInteger4;
    this.executionContextId = paramInteger5;
    this.hash = paramString3;
    this.executionContextAuxData = paramMap;
    this.isLiveEdit = paramBoolean1;
    this.sourceMapURL = paramString4;
    this.hasSourceURL = paramBoolean2;
    this.isModule = paramBoolean3;
    this.length = paramInteger6;
    this.stackTrace = paramStackTrace;
    this.codeOffset = paramInteger7;
    this.scriptLanguage = paramScriptLanguage;
    this.debugSymbols = paramDebugSymbols;
    this.embedderName = paramString5;
    if (bool)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public static void Zb(boolean paramBoolean) {
    Ze = paramBoolean;
  }
  
  public static boolean ZN() {
    return Ze;
  }
  
  public static boolean ZI() {
    boolean bool = ZN();
    return !bool;
  }
  
  static {
    if (ZI())
      Zb(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\debugger\ScriptParsed.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */