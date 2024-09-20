package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.input.DragIntercepted;
import net.portswigger.devtools.protocol.types.input.DispatchDragEventType;
import net.portswigger.devtools.protocol.types.input.DispatchKeyEventType;
import net.portswigger.devtools.protocol.types.input.DispatchMouseEventPointerType;
import net.portswigger.devtools.protocol.types.input.DispatchMouseEventType;
import net.portswigger.devtools.protocol.types.input.DispatchTouchEventType;
import net.portswigger.devtools.protocol.types.input.DragData;
import net.portswigger.devtools.protocol.types.input.EmulateTouchFromMouseEventType;
import net.portswigger.devtools.protocol.types.input.GestureSourceType;
import net.portswigger.devtools.protocol.types.input.MouseButton;
import net.portswigger.devtools.protocol.types.input.TouchPoint;

public interface Input {
  @Zy
  CompletableFuture<Zf<Void>> dispatchDragEvent(@Zu("type") DispatchDragEventType paramDispatchDragEventType, @Zu("x") Double paramDouble1, @Zu("y") Double paramDouble2, @Zu("data") DragData paramDragData);
  
  @Zy
  CompletableFuture<Zf<Void>> dispatchDragEvent(@Zu("type") DispatchDragEventType paramDispatchDragEventType, @Zu("x") Double paramDouble1, @Zu("y") Double paramDouble2, @Zu("data") DragData paramDragData, @Zj @Zu("modifiers") Integer paramInteger);
  
  CompletableFuture<Zf<Void>> dispatchKeyEvent(@Zu("type") DispatchKeyEventType paramDispatchKeyEventType);
  
  CompletableFuture<Zf<Void>> dispatchKeyEvent(@Zu("type") DispatchKeyEventType paramDispatchKeyEventType, @Zj @Zu("modifiers") Integer paramInteger1, @Zj @Zu("timestamp") Double paramDouble, @Zj @Zu("text") String paramString1, @Zj @Zu("unmodifiedText") String paramString2, @Zj @Zu("keyIdentifier") String paramString3, @Zj @Zu("code") String paramString4, @Zj @Zu("key") String paramString5, @Zj @Zu("windowsVirtualKeyCode") Integer paramInteger2, @Zj @Zu("nativeVirtualKeyCode") Integer paramInteger3, @Zj @Zu("autoRepeat") Boolean paramBoolean1, @Zj @Zu("isKeypad") Boolean paramBoolean2, @Zj @Zu("isSystemKey") Boolean paramBoolean3, @Zj @Zu("location") Integer paramInteger4, @Zy @Zj @Zu("commands") List<String> paramList);
  
  @Zy
  CompletableFuture<Zf<Void>> insertText(@Zu("text") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> imeSetComposition(@Zu("text") String paramString, @Zu("selectionStart") Integer paramInteger1, @Zu("selectionEnd") Integer paramInteger2);
  
  @Zy
  CompletableFuture<Zf<Void>> imeSetComposition(@Zu("text") String paramString, @Zu("selectionStart") Integer paramInteger1, @Zu("selectionEnd") Integer paramInteger2, @Zj @Zu("replacementStart") Integer paramInteger3, @Zj @Zu("replacementEnd") Integer paramInteger4);
  
  CompletableFuture<Zf<Void>> dispatchMouseEvent(@Zu("type") DispatchMouseEventType paramDispatchMouseEventType, @Zu("x") Double paramDouble1, @Zu("y") Double paramDouble2);
  
  CompletableFuture<Zf<Void>> dispatchMouseEvent(@Zu("type") DispatchMouseEventType paramDispatchMouseEventType, @Zu("x") Double paramDouble1, @Zu("y") Double paramDouble2, @Zj @Zu("modifiers") Integer paramInteger1, @Zj @Zu("timestamp") Double paramDouble3, @Zj @Zu("button") MouseButton paramMouseButton, @Zj @Zu("buttons") Integer paramInteger2, @Zj @Zu("clickCount") Integer paramInteger3, @Zy @Zj @Zu("force") Double paramDouble4, @Zy @Zj @Zu("tangentialPressure") Double paramDouble5, @Zj @Zu("tiltX") Double paramDouble6, @Zj @Zu("tiltY") Double paramDouble7, @Zy @Zj @Zu("twist") Integer paramInteger4, @Zj @Zu("deltaX") Double paramDouble8, @Zj @Zu("deltaY") Double paramDouble9, @Zj @Zu("pointerType") DispatchMouseEventPointerType paramDispatchMouseEventPointerType);
  
  CompletableFuture<Zf<Void>> dispatchTouchEvent(@Zu("type") DispatchTouchEventType paramDispatchTouchEventType, @Zu("touchPoints") List<TouchPoint> paramList);
  
  CompletableFuture<Zf<Void>> dispatchTouchEvent(@Zu("type") DispatchTouchEventType paramDispatchTouchEventType, @Zu("touchPoints") List<TouchPoint> paramList, @Zj @Zu("modifiers") Integer paramInteger, @Zj @Zu("timestamp") Double paramDouble);
  
  CompletableFuture<Zf<Void>> cancelDragging();
  
  @Zy
  CompletableFuture<Zf<Void>> emulateTouchFromMouseEvent(@Zu("type") EmulateTouchFromMouseEventType paramEmulateTouchFromMouseEventType, @Zu("x") Integer paramInteger1, @Zu("y") Integer paramInteger2, @Zu("button") MouseButton paramMouseButton);
  
  @Zy
  CompletableFuture<Zf<Void>> emulateTouchFromMouseEvent(@Zu("type") EmulateTouchFromMouseEventType paramEmulateTouchFromMouseEventType, @Zu("x") Integer paramInteger1, @Zu("y") Integer paramInteger2, @Zu("button") MouseButton paramMouseButton, @Zj @Zu("timestamp") Double paramDouble1, @Zj @Zu("deltaX") Double paramDouble2, @Zj @Zu("deltaY") Double paramDouble3, @Zj @Zu("modifiers") Integer paramInteger3, @Zj @Zu("clickCount") Integer paramInteger4);
  
  CompletableFuture<Zf<Void>> setIgnoreInputEvents(@Zu("ignore") Boolean paramBoolean);
  
  @Zy
  CompletableFuture<Zf<Void>> setInterceptDrags(@Zu("enabled") Boolean paramBoolean);
  
  @Zy
  CompletableFuture<Zf<Void>> synthesizePinchGesture(@Zu("x") Double paramDouble1, @Zu("y") Double paramDouble2, @Zu("scaleFactor") Double paramDouble3);
  
  @Zy
  CompletableFuture<Zf<Void>> synthesizePinchGesture(@Zu("x") Double paramDouble1, @Zu("y") Double paramDouble2, @Zu("scaleFactor") Double paramDouble3, @Zj @Zu("relativeSpeed") Integer paramInteger, @Zj @Zu("gestureSourceType") GestureSourceType paramGestureSourceType);
  
  @Zy
  CompletableFuture<Zf<Void>> synthesizeScrollGesture(@Zu("x") Double paramDouble1, @Zu("y") Double paramDouble2);
  
  @Zy
  CompletableFuture<Zf<Void>> synthesizeScrollGesture(@Zu("x") Double paramDouble1, @Zu("y") Double paramDouble2, @Zj @Zu("xDistance") Double paramDouble3, @Zj @Zu("yDistance") Double paramDouble4, @Zj @Zu("xOverscroll") Double paramDouble5, @Zj @Zu("yOverscroll") Double paramDouble6, @Zj @Zu("preventFling") Boolean paramBoolean, @Zj @Zu("speed") Integer paramInteger1, @Zj @Zu("gestureSourceType") GestureSourceType paramGestureSourceType, @Zj @Zu("repeatCount") Integer paramInteger2, @Zj @Zu("repeatDelayMs") Integer paramInteger3, @Zj @Zu("interactionMarkerName") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> synthesizeTapGesture(@Zu("x") Double paramDouble1, @Zu("y") Double paramDouble2);
  
  @Zy
  CompletableFuture<Zf<Void>> synthesizeTapGesture(@Zu("x") Double paramDouble1, @Zu("y") Double paramDouble2, @Zj @Zu("duration") Integer paramInteger1, @Zj @Zu("tapCount") Integer paramInteger2, @Zj @Zu("gestureSourceType") GestureSourceType paramGestureSourceType);
  
  @Zb("dragIntercepted")
  @Zy
  Zs onDragIntercepted(Zp<DragIntercepted> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Input.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */