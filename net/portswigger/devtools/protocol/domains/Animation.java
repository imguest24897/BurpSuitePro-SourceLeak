package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.animation.AnimationCanceled;
import net.portswigger.devtools.protocol.events.animation.AnimationCreated;
import net.portswigger.devtools.protocol.events.animation.AnimationStarted;
import net.portswigger.devtools.protocol.events.animation.AnimationUpdated;
import net.portswigger.devtools.protocol.types.runtime.RemoteObject;

@Zy
public interface Animation {
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  @Zr("currentTime")
  CompletableFuture<Zf<Double>> getCurrentTime(@Zu("id") String paramString);
  
  @Zr("playbackRate")
  CompletableFuture<Zf<Double>> getPlaybackRate();
  
  CompletableFuture<Zf<Void>> releaseAnimations(@Zu("animations") List<String> paramList);
  
  @Zr("remoteObject")
  CompletableFuture<Zf<RemoteObject>> resolveAnimation(@Zu("animationId") String paramString);
  
  CompletableFuture<Zf<Void>> seekAnimations(@Zu("animations") List<String> paramList, @Zu("currentTime") Double paramDouble);
  
  CompletableFuture<Zf<Void>> setPaused(@Zu("animations") List<String> paramList, @Zu("paused") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setPlaybackRate(@Zu("playbackRate") Double paramDouble);
  
  CompletableFuture<Zf<Void>> setTiming(@Zu("animationId") String paramString, @Zu("duration") Double paramDouble1, @Zu("delay") Double paramDouble2);
  
  @Zb("animationCanceled")
  Zs onAnimationCanceled(Zp<AnimationCanceled> paramZp) throws Zp;
  
  @Zb("animationCreated")
  Zs onAnimationCreated(Zp<AnimationCreated> paramZp) throws Zp;
  
  @Zb("animationStarted")
  Zs onAnimationStarted(Zp<AnimationStarted> paramZp) throws Zp;
  
  @Zb("animationUpdated")
  Zs onAnimationUpdated(Zp<AnimationUpdated> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Animation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */