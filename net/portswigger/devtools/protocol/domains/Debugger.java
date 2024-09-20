package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.debugger.BreakpointResolved;
import net.portswigger.devtools.protocol.events.debugger.Paused;
import net.portswigger.devtools.protocol.events.debugger.Resumed;
import net.portswigger.devtools.protocol.events.debugger.ScriptFailedToParse;
import net.portswigger.devtools.protocol.events.debugger.ScriptParsed;
import net.portswigger.devtools.protocol.types.debugger.BreakLocation;
import net.portswigger.devtools.protocol.types.debugger.ContinueToLocationTargetCallFrames;
import net.portswigger.devtools.protocol.types.debugger.DisassembleWasmModule;
import net.portswigger.devtools.protocol.types.debugger.EvaluateOnCallFrame;
import net.portswigger.devtools.protocol.types.debugger.Location;
import net.portswigger.devtools.protocol.types.debugger.LocationRange;
import net.portswigger.devtools.protocol.types.debugger.RestartFrame;
import net.portswigger.devtools.protocol.types.debugger.RestartFrameMode;
import net.portswigger.devtools.protocol.types.debugger.ScriptPosition;
import net.portswigger.devtools.protocol.types.debugger.ScriptSource;
import net.portswigger.devtools.protocol.types.debugger.SearchMatch;
import net.portswigger.devtools.protocol.types.debugger.SetBreakpoint;
import net.portswigger.devtools.protocol.types.debugger.SetBreakpointByUrl;
import net.portswigger.devtools.protocol.types.debugger.SetInstrumentationBreakpointInstrumentation;
import net.portswigger.devtools.protocol.types.debugger.SetPauseOnExceptionsState;
import net.portswigger.devtools.protocol.types.debugger.SetScriptSource;
import net.portswigger.devtools.protocol.types.debugger.WasmDisassemblyChunk;
import net.portswigger.devtools.protocol.types.runtime.CallArgument;
import net.portswigger.devtools.protocol.types.runtime.StackTrace;
import net.portswigger.devtools.protocol.types.runtime.StackTraceId;

public interface Debugger {
  CompletableFuture<Zf<Void>> continueToLocation(@Zu("location") Location paramLocation);
  
  CompletableFuture<Zf<Void>> continueToLocation(@Zu("location") Location paramLocation, @Zj @Zu("targetCallFrames") ContinueToLocationTargetCallFrames paramContinueToLocationTargetCallFrames);
  
  CompletableFuture<Zf<Void>> disable();
  
  @Zr("debuggerId")
  CompletableFuture<Zf<String>> enable();
  
  @Zr("debuggerId")
  CompletableFuture<Zf<String>> enable(@Zy @Zj @Zu("maxScriptsCacheSize") Double paramDouble);
  
  CompletableFuture<Zf<EvaluateOnCallFrame>> evaluateOnCallFrame(@Zu("callFrameId") String paramString1, @Zu("expression") String paramString2);
  
  CompletableFuture<Zf<EvaluateOnCallFrame>> evaluateOnCallFrame(@Zu("callFrameId") String paramString1, @Zu("expression") String paramString2, @Zj @Zu("objectGroup") String paramString3, @Zj @Zu("includeCommandLineAPI") Boolean paramBoolean1, @Zj @Zu("silent") Boolean paramBoolean2, @Zj @Zu("returnByValue") Boolean paramBoolean3, @Zy @Zj @Zu("generatePreview") Boolean paramBoolean4, @Zj @Zu("throwOnSideEffect") Boolean paramBoolean5, @Zy @Zj @Zu("timeout") Double paramDouble);
  
  @Zr("locations")
  CompletableFuture<Zf<List<BreakLocation>>> getPossibleBreakpoints(@Zu("start") Location paramLocation);
  
  @Zr("locations")
  CompletableFuture<Zf<List<BreakLocation>>> getPossibleBreakpoints(@Zu("start") Location paramLocation1, @Zj @Zu("end") Location paramLocation2, @Zj @Zu("restrictToFunction") Boolean paramBoolean);
  
  CompletableFuture<Zf<ScriptSource>> getScriptSource(@Zu("scriptId") String paramString);
  
  @Zy
  CompletableFuture<Zf<DisassembleWasmModule>> disassembleWasmModule(@Zu("scriptId") String paramString);
  
  @Zy
  @Zr("chunk")
  CompletableFuture<Zf<WasmDisassemblyChunk>> nextWasmDisassemblyChunk(@Zu("streamId") String paramString);
  
  @Deprecated
  @Zr("bytecode")
  CompletableFuture<Zf<String>> getWasmBytecode(@Zu("scriptId") String paramString);
  
  @Zy
  @Zr("stackTrace")
  CompletableFuture<Zf<StackTrace>> getStackTrace(@Zu("stackTraceId") StackTraceId paramStackTraceId);
  
  CompletableFuture<Zf<Void>> pause();
  
  @Deprecated
  @Zy
  CompletableFuture<Zf<Void>> pauseOnAsyncCall(@Zu("parentStackTraceId") StackTraceId paramStackTraceId);
  
  CompletableFuture<Zf<Void>> removeBreakpoint(@Zu("breakpointId") String paramString);
  
  CompletableFuture<Zf<RestartFrame>> restartFrame(@Zu("callFrameId") String paramString);
  
  CompletableFuture<Zf<RestartFrame>> restartFrame(@Zu("callFrameId") String paramString, @Zy @Zj @Zu("mode") RestartFrameMode paramRestartFrameMode);
  
  CompletableFuture<Zf<Void>> resume();
  
  CompletableFuture<Zf<Void>> resume(@Zj @Zu("terminateOnResume") Boolean paramBoolean);
  
  @Zr("result")
  CompletableFuture<Zf<List<SearchMatch>>> searchInContent(@Zu("scriptId") String paramString1, @Zu("query") String paramString2);
  
  @Zr("result")
  CompletableFuture<Zf<List<SearchMatch>>> searchInContent(@Zu("scriptId") String paramString1, @Zu("query") String paramString2, @Zj @Zu("caseSensitive") Boolean paramBoolean1, @Zj @Zu("isRegex") Boolean paramBoolean2);
  
  CompletableFuture<Zf<Void>> setAsyncCallStackDepth(@Zu("maxDepth") Integer paramInteger);
  
  @Zy
  CompletableFuture<Zf<Void>> setBlackboxPatterns(@Zu("patterns") List<String> paramList);
  
  @Zy
  CompletableFuture<Zf<Void>> setBlackboxedRanges(@Zu("scriptId") String paramString, @Zu("positions") List<ScriptPosition> paramList);
  
  CompletableFuture<Zf<SetBreakpoint>> setBreakpoint(@Zu("location") Location paramLocation);
  
  CompletableFuture<Zf<SetBreakpoint>> setBreakpoint(@Zu("location") Location paramLocation, @Zj @Zu("condition") String paramString);
  
  @Zr("breakpointId")
  CompletableFuture<Zf<String>> setInstrumentationBreakpoint(@Zu("instrumentation") SetInstrumentationBreakpointInstrumentation paramSetInstrumentationBreakpointInstrumentation);
  
  CompletableFuture<Zf<SetBreakpointByUrl>> setBreakpointByUrl(@Zu("lineNumber") Integer paramInteger);
  
  CompletableFuture<Zf<SetBreakpointByUrl>> setBreakpointByUrl(@Zu("lineNumber") Integer paramInteger1, @Zj @Zu("url") String paramString1, @Zj @Zu("urlRegex") String paramString2, @Zj @Zu("scriptHash") String paramString3, @Zj @Zu("columnNumber") Integer paramInteger2, @Zj @Zu("condition") String paramString4);
  
  @Zy
  @Zr("breakpointId")
  CompletableFuture<Zf<String>> setBreakpointOnFunctionCall(@Zu("objectId") String paramString);
  
  @Zy
  @Zr("breakpointId")
  CompletableFuture<Zf<String>> setBreakpointOnFunctionCall(@Zu("objectId") String paramString1, @Zj @Zu("condition") String paramString2);
  
  CompletableFuture<Zf<Void>> setBreakpointsActive(@Zu("active") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setPauseOnExceptions(@Zu("state") SetPauseOnExceptionsState paramSetPauseOnExceptionsState);
  
  @Zy
  CompletableFuture<Zf<Void>> setReturnValue(@Zu("newValue") CallArgument paramCallArgument);
  
  CompletableFuture<Zf<SetScriptSource>> setScriptSource(@Zu("scriptId") String paramString1, @Zu("scriptSource") String paramString2);
  
  CompletableFuture<Zf<SetScriptSource>> setScriptSource(@Zu("scriptId") String paramString1, @Zu("scriptSource") String paramString2, @Zj @Zu("dryRun") Boolean paramBoolean1, @Zy @Zj @Zu("allowTopFrameEditing") Boolean paramBoolean2);
  
  CompletableFuture<Zf<Void>> setSkipAllPauses(@Zu("skip") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setVariableValue(@Zu("scopeNumber") Integer paramInteger, @Zu("variableName") String paramString1, @Zu("newValue") CallArgument paramCallArgument, @Zu("callFrameId") String paramString2);
  
  CompletableFuture<Zf<Void>> stepInto();
  
  CompletableFuture<Zf<Void>> stepInto(@Zy @Zj @Zu("breakOnAsyncCall") Boolean paramBoolean, @Zy @Zj @Zu("skipList") List<LocationRange> paramList);
  
  CompletableFuture<Zf<Void>> stepOut();
  
  CompletableFuture<Zf<Void>> stepOver();
  
  CompletableFuture<Zf<Void>> stepOver(@Zy @Zj @Zu("skipList") List<LocationRange> paramList);
  
  @Zb("breakpointResolved")
  Zs onBreakpointResolved(Zp<BreakpointResolved> paramZp) throws Zp;
  
  @Zb("paused")
  Zs onPaused(Zp<Paused> paramZp) throws Zp;
  
  @Zb("resumed")
  Zs onResumed(Zp<Resumed> paramZp) throws Zp;
  
  @Zb("scriptFailedToParse")
  Zs onScriptFailedToParse(Zp<ScriptFailedToParse> paramZp) throws Zp;
  
  @Zb("scriptParsed")
  Zs onScriptParsed(Zp<ScriptParsed> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Debugger.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */