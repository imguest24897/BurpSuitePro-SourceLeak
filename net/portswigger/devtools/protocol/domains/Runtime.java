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
import net.portswigger.devtools.protocol.events.runtime.BindingCalled;
import net.portswigger.devtools.protocol.events.runtime.ConsoleAPICalled;
import net.portswigger.devtools.protocol.events.runtime.ExceptionRevoked;
import net.portswigger.devtools.protocol.events.runtime.ExceptionThrown;
import net.portswigger.devtools.protocol.events.runtime.ExecutionContextCreated;
import net.portswigger.devtools.protocol.events.runtime.ExecutionContextDestroyed;
import net.portswigger.devtools.protocol.events.runtime.ExecutionContextsCleared;
import net.portswigger.devtools.protocol.events.runtime.InspectRequested;
import net.portswigger.devtools.protocol.types.runtime.AwaitPromise;
import net.portswigger.devtools.protocol.types.runtime.CallArgument;
import net.portswigger.devtools.protocol.types.runtime.CallFunctionOn;
import net.portswigger.devtools.protocol.types.runtime.CompileScript;
import net.portswigger.devtools.protocol.types.runtime.Evaluate;
import net.portswigger.devtools.protocol.types.runtime.ExceptionDetails;
import net.portswigger.devtools.protocol.types.runtime.HeapUsage;
import net.portswigger.devtools.protocol.types.runtime.Properties;
import net.portswigger.devtools.protocol.types.runtime.RemoteObject;
import net.portswigger.devtools.protocol.types.runtime.RunScript;
import net.portswigger.devtools.protocol.types.runtime.SerializationOptions;

public interface Runtime {
  CompletableFuture<Zf<AwaitPromise>> awaitPromise(@Zu("promiseObjectId") String paramString);
  
  CompletableFuture<Zf<AwaitPromise>> awaitPromise(@Zu("promiseObjectId") String paramString, @Zj @Zu("returnByValue") Boolean paramBoolean1, @Zj @Zu("generatePreview") Boolean paramBoolean2);
  
  CompletableFuture<Zf<CallFunctionOn>> callFunctionOn(@Zu("functionDeclaration") String paramString);
  
  CompletableFuture<Zf<CallFunctionOn>> callFunctionOn(@Zu("functionDeclaration") String paramString1, @Zj @Zu("objectId") String paramString2, @Zj @Zu("arguments") List<CallArgument> paramList, @Zj @Zu("silent") Boolean paramBoolean1, @Zj @Zu("returnByValue") Boolean paramBoolean2, @Zy @Zj @Zu("generatePreview") Boolean paramBoolean3, @Zj @Zu("userGesture") Boolean paramBoolean4, @Zj @Zu("awaitPromise") Boolean paramBoolean5, @Zj @Zu("executionContextId") Integer paramInteger, @Zj @Zu("objectGroup") String paramString3, @Zy @Zj @Zu("throwOnSideEffect") Boolean paramBoolean6, @Zy @Zj @Zu("uniqueContextId") String paramString4, @Zy @Zj @Zu("serializationOptions") SerializationOptions paramSerializationOptions);
  
  CompletableFuture<Zf<CompileScript>> compileScript(@Zu("expression") String paramString1, @Zu("sourceURL") String paramString2, @Zu("persistScript") Boolean paramBoolean);
  
  CompletableFuture<Zf<CompileScript>> compileScript(@Zu("expression") String paramString1, @Zu("sourceURL") String paramString2, @Zu("persistScript") Boolean paramBoolean, @Zj @Zu("executionContextId") Integer paramInteger);
  
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> discardConsoleEntries();
  
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<Evaluate>> evaluate(@Zu("expression") String paramString);
  
  CompletableFuture<Zf<Evaluate>> evaluate(@Zu("expression") String paramString1, @Zj @Zu("objectGroup") String paramString2, @Zj @Zu("includeCommandLineAPI") Boolean paramBoolean1, @Zj @Zu("silent") Boolean paramBoolean2, @Zj @Zu("contextId") Integer paramInteger, @Zj @Zu("returnByValue") Boolean paramBoolean3, @Zy @Zj @Zu("generatePreview") Boolean paramBoolean4, @Zj @Zu("userGesture") Boolean paramBoolean5, @Zj @Zu("awaitPromise") Boolean paramBoolean6, @Zy @Zj @Zu("throwOnSideEffect") Boolean paramBoolean7, @Zy @Zj @Zu("timeout") Double paramDouble, @Zy @Zj @Zu("disableBreaks") Boolean paramBoolean8, @Zy @Zj @Zu("replMode") Boolean paramBoolean9, @Zy @Zj @Zu("allowUnsafeEvalBlockedByCSP") Boolean paramBoolean10, @Zy @Zj @Zu("uniqueContextId") String paramString3, @Zy @Zj @Zu("serializationOptions") SerializationOptions paramSerializationOptions);
  
  @Zy
  @Zr("id")
  CompletableFuture<Zf<String>> getIsolateId();
  
  @Zy
  CompletableFuture<Zf<HeapUsage>> getHeapUsage();
  
  CompletableFuture<Zf<Properties>> getProperties(@Zu("objectId") String paramString);
  
  CompletableFuture<Zf<Properties>> getProperties(@Zu("objectId") String paramString, @Zj @Zu("ownProperties") Boolean paramBoolean1, @Zy @Zj @Zu("accessorPropertiesOnly") Boolean paramBoolean2, @Zy @Zj @Zu("generatePreview") Boolean paramBoolean3, @Zy @Zj @Zu("nonIndexedPropertiesOnly") Boolean paramBoolean4);
  
  @Zr("names")
  CompletableFuture<Zf<List<String>>> globalLexicalScopeNames();
  
  @Zr("names")
  CompletableFuture<Zf<List<String>>> globalLexicalScopeNames(@Zj @Zu("executionContextId") Integer paramInteger);
  
  @Zr("objects")
  CompletableFuture<Zf<RemoteObject>> queryObjects(@Zu("prototypeObjectId") String paramString);
  
  @Zr("objects")
  CompletableFuture<Zf<RemoteObject>> queryObjects(@Zu("prototypeObjectId") String paramString1, @Zj @Zu("objectGroup") String paramString2);
  
  CompletableFuture<Zf<Void>> releaseObject(@Zu("objectId") String paramString);
  
  CompletableFuture<Zf<Void>> releaseObjectGroup(@Zu("objectGroup") String paramString);
  
  CompletableFuture<Zf<Void>> runIfWaitingForDebugger();
  
  CompletableFuture<Zf<RunScript>> runScript(@Zu("scriptId") String paramString);
  
  CompletableFuture<Zf<RunScript>> runScript(@Zu("scriptId") String paramString1, @Zj @Zu("executionContextId") Integer paramInteger, @Zj @Zu("objectGroup") String paramString2, @Zj @Zu("silent") Boolean paramBoolean1, @Zj @Zu("includeCommandLineAPI") Boolean paramBoolean2, @Zj @Zu("returnByValue") Boolean paramBoolean3, @Zj @Zu("generatePreview") Boolean paramBoolean4, @Zj @Zu("awaitPromise") Boolean paramBoolean5);
  
  @Zy
  CompletableFuture<Zf<Void>> setCustomObjectFormatterEnabled(@Zu("enabled") Boolean paramBoolean);
  
  @Zy
  CompletableFuture<Zf<Void>> setMaxCallStackSizeToCapture(@Zu("size") Integer paramInteger);
  
  @Zy
  CompletableFuture<Zf<Void>> terminateExecution();
  
  CompletableFuture<Zf<Void>> addBinding(@Zu("name") String paramString);
  
  CompletableFuture<Zf<Void>> addBinding(@Zu("name") String paramString1, @Deprecated @Zy @Zj @Zu("executionContextId") Integer paramInteger, @Zj @Zu("executionContextName") String paramString2);
  
  CompletableFuture<Zf<Void>> removeBinding(@Zu("name") String paramString);
  
  @Zy
  @Zr("exceptionDetails")
  CompletableFuture<Zf<ExceptionDetails>> getExceptionDetails(@Zu("errorObjectId") String paramString);
  
  @Zb("bindingCalled")
  @Zy
  Zs onBindingCalled(Zp<BindingCalled> paramZp) throws Zp;
  
  @Zb("consoleAPICalled")
  Zs onConsoleAPICalled(Zp<ConsoleAPICalled> paramZp) throws Zp;
  
  @Zb("exceptionRevoked")
  Zs onExceptionRevoked(Zp<ExceptionRevoked> paramZp) throws Zp;
  
  @Zb("exceptionThrown")
  Zs onExceptionThrown(Zp<ExceptionThrown> paramZp) throws Zp;
  
  @Zb("executionContextCreated")
  Zs onExecutionContextCreated(Zp<ExecutionContextCreated> paramZp) throws Zp;
  
  @Zb("executionContextDestroyed")
  Zs onExecutionContextDestroyed(Zp<ExecutionContextDestroyed> paramZp) throws Zp;
  
  @Zb("executionContextsCleared")
  Zs onExecutionContextsCleared(Zp<ExecutionContextsCleared> paramZp) throws Zp;
  
  @Zb("inspectRequested")
  Zs onInspectRequested(Zp<InspectRequested> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Runtime.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */