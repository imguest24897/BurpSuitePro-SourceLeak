package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.webaudio.AudioListenerCreated;
import net.portswigger.devtools.protocol.events.webaudio.AudioListenerWillBeDestroyed;
import net.portswigger.devtools.protocol.events.webaudio.AudioNodeCreated;
import net.portswigger.devtools.protocol.events.webaudio.AudioNodeWillBeDestroyed;
import net.portswigger.devtools.protocol.events.webaudio.AudioParamCreated;
import net.portswigger.devtools.protocol.events.webaudio.AudioParamWillBeDestroyed;
import net.portswigger.devtools.protocol.events.webaudio.ContextChanged;
import net.portswigger.devtools.protocol.events.webaudio.ContextCreated;
import net.portswigger.devtools.protocol.events.webaudio.ContextWillBeDestroyed;
import net.portswigger.devtools.protocol.events.webaudio.NodeParamConnected;
import net.portswigger.devtools.protocol.events.webaudio.NodeParamDisconnected;
import net.portswigger.devtools.protocol.events.webaudio.NodesConnected;
import net.portswigger.devtools.protocol.events.webaudio.NodesDisconnected;
import net.portswigger.devtools.protocol.types.webaudio.ContextRealtimeData;

@Zy
public interface WebAudio {
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<Void>> disable();
  
  @Zr("realtimeData")
  CompletableFuture<Zf<ContextRealtimeData>> getRealtimeData(@Zu("contextId") String paramString);
  
  @Zb("contextCreated")
  Zs onContextCreated(Zp<ContextCreated> paramZp) throws Zp;
  
  @Zb("contextWillBeDestroyed")
  Zs onContextWillBeDestroyed(Zp<ContextWillBeDestroyed> paramZp) throws Zp;
  
  @Zb("contextChanged")
  Zs onContextChanged(Zp<ContextChanged> paramZp) throws Zp;
  
  @Zb("audioListenerCreated")
  Zs onAudioListenerCreated(Zp<AudioListenerCreated> paramZp) throws Zp;
  
  @Zb("audioListenerWillBeDestroyed")
  Zs onAudioListenerWillBeDestroyed(Zp<AudioListenerWillBeDestroyed> paramZp) throws Zp;
  
  @Zb("audioNodeCreated")
  Zs onAudioNodeCreated(Zp<AudioNodeCreated> paramZp) throws Zp;
  
  @Zb("audioNodeWillBeDestroyed")
  Zs onAudioNodeWillBeDestroyed(Zp<AudioNodeWillBeDestroyed> paramZp) throws Zp;
  
  @Zb("audioParamCreated")
  Zs onAudioParamCreated(Zp<AudioParamCreated> paramZp) throws Zp;
  
  @Zb("audioParamWillBeDestroyed")
  Zs onAudioParamWillBeDestroyed(Zp<AudioParamWillBeDestroyed> paramZp) throws Zp;
  
  @Zb("nodesConnected")
  Zs onNodesConnected(Zp<NodesConnected> paramZp) throws Zp;
  
  @Zb("nodesDisconnected")
  Zs onNodesDisconnected(Zp<NodesDisconnected> paramZp) throws Zp;
  
  @Zb("nodeParamConnected")
  Zs onNodeParamConnected(Zp<NodeParamConnected> paramZp) throws Zp;
  
  @Zb("nodeParamDisconnected")
  Zs onNodeParamDisconnected(Zp<NodeParamDisconnected> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\WebAudio.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */