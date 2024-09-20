/*    */ package com.ejt.internal.gui;
/*    */ import java.awt.Window;
/*    */ import java.beans.PropertyChangeEvent;
/*    */ import java.beans.PropertyChangeListener;
/*    */ import java.util.Map;
/*    */ import java.util.WeakHashMap;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.SwingUtilities;
/*    */ import javax.swing.UIManager;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class LookAndFeelChangeUtil {
/* 13 */   private static WeakHashMap<Object, LookAndFeelChangeHandler<?>> lookAndFeelChangeHandlers = new WeakHashMap<Object, LookAndFeelChangeHandler<?>>();
/* 14 */   private static WeakHashMap<Window, Object> windows = new WeakHashMap<Window, Object>();
/*    */   private static boolean nextChangeIsExplicit;
/*    */   
/*    */   static {
/* 18 */     UIManager.addPropertyChangeListener(new PropertyChangeListener()
/*    */         {
/*    */           public void propertyChange(PropertyChangeEvent event) {
/* 21 */             if (event.getPropertyName().equals("lookAndFeel") && 
/* 22 */               !LookAndFeelChangeUtil.nextChangeIsExplicit) {
/* 23 */               LookAndFeelChangeUtil.fireChangeHandlers();
/*    */             }
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public static void nextChangeIsExplicit() {
/* 31 */     nextChangeIsExplicit = true;
/*    */   }
/*    */   
/*    */   public static void fireChangeHandlers() {
/* 35 */     nextChangeIsExplicit = false;
/* 36 */     for (Window window : windows.keySet()) {
/* 37 */       if (window != null) {
/*    */         try {
/* 39 */           SwingUtilities.updateComponentTreeUI(window);
/* 40 */         } catch (Exception e) {
/* 41 */           e.printStackTrace();
/*    */         } 
/*    */       }
/*    */     } 
/* 45 */     for (Map.Entry<Object, LookAndFeelChangeHandler<?>> entry : lookAndFeelChangeHandlers.entrySet()) {
/* 46 */       if (entry != null) {
/* 47 */         Object parent = entry.getKey();
/* 48 */         LookAndFeelChangeHandler handler = entry.getValue();
/* 49 */         if (handler != null) {
/* 50 */           invokeLookAndFeelHandler(parent, handler);
/*    */         }
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   private static void invokeLookAndFeelHandler(Object parent, LookAndFeelChangeHandler<Object> handler) {
/*    */     try {
/* 59 */       handler.lookAndFeelChanged(parent);
/* 60 */     } catch (Exception e) {
/* 61 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static <T> void onLookAndFeelChange(@NotNull T parent, @NotNull LookAndFeelChangeHandler<T> handler) {
/* 67 */     lookAndFeelChangeHandlers.put(parent, handler);
/*    */   }
/*    */ 
/*    */   
/*    */   public static <T> void onLookAndFeelChangeAndNow(@NotNull T parent, @NotNull LookAndFeelChangeHandler<T> handler) {
/* 72 */     invokeLookAndFeelHandler(parent, handler);
/* 73 */     onLookAndFeelChange(parent, handler);
/*    */   }
/*    */   
/*    */   public static void updateOnLookAndFeelChange(JComponent component) {
/* 77 */     onLookAndFeelChange(component, new LookAndFeelChangeHandler<JComponent>()
/*    */         {
/*    */           public void lookAndFeelChanged(JComponent parent) {
/* 80 */             SwingUtilities.updateComponentTreeUI(parent);
/*    */           }
/*    */         });
/*    */   }
/*    */   
/*    */   public static void registerWindow(Window window) {
/* 86 */     windows.put(window, null);
/*    */   }
/*    */   
/*    */   public static interface LookAndFeelChangeHandler<T> {
/*    */     void lookAndFeelChanged(T param1T);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\internal\gui\LookAndFeelChangeUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */