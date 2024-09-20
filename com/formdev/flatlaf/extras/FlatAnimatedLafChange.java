/*     */ package com.formdev.flatlaf.extras;
/*     */ 
/*     */ import com.formdev.flatlaf.FlatSystemProperties;
/*     */ import com.formdev.flatlaf.util.Animator;
/*     */ import java.awt.AlphaComposite;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.Window;
/*     */ import java.awt.image.VolatileImage;
/*     */ import java.util.Map;
/*     */ import java.util.WeakHashMap;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLayeredPane;
/*     */ import javax.swing.RootPaneContainer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlatAnimatedLafChange
/*     */ {
/*  52 */   public static int duration = 160;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  57 */   public static int resolution = 30;
/*     */   
/*     */   private static Animator animator;
/*  60 */   private static final Map<JLayeredPane, JComponent> oldUIsnapshots = new WeakHashMap<>();
/*  61 */   private static final Map<JLayeredPane, JComponent> newUIsnapshots = new WeakHashMap<>();
/*     */ 
/*     */   
/*     */   private static float alpha;
/*     */   
/*     */   private static boolean inShowSnapshot;
/*     */ 
/*     */   
/*     */   public static void showSnapshot() {
/*  70 */     if (!FlatSystemProperties.getBoolean("flatlaf.animatedLafChange", true)) {
/*     */       return;
/*     */     }
/*     */     
/*  74 */     if (animator != null) {
/*  75 */       animator.stop();
/*     */     }
/*  77 */     alpha = 1.0F;
/*     */ 
/*     */     
/*  80 */     showSnapshot(true, oldUIsnapshots);
/*     */   }
/*     */   
/*     */   private static void showSnapshot(final boolean useAlpha, Map<JLayeredPane, JComponent> map) {
/*  84 */     inShowSnapshot = true;
/*     */ 
/*     */     
/*  87 */     Window[] windows = Window.getWindows();
/*  88 */     for (Window window : windows) {
/*  89 */       if (window instanceof RootPaneContainer && window.isShowing()) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  94 */         final VolatileImage snapshot = window.createVolatileImage(window.getWidth(), window.getHeight());
/*  95 */         if (snapshot != null) {
/*     */ 
/*     */ 
/*     */           
/*  99 */           JLayeredPane layeredPane = ((RootPaneContainer)window).getLayeredPane();
/* 100 */           layeredPane.paint(snapshot.getGraphics());
/*     */ 
/*     */ 
/*     */           
/* 104 */           JComponent snapshotLayer = new JComponent()
/*     */             {
/*     */               public void paint(Graphics g) {
/* 107 */                 if (FlatAnimatedLafChange.inShowSnapshot || snapshot.contentsLost()) {
/*     */                   return;
/*     */                 }
/* 110 */                 if (useAlpha)
/* 111 */                   ((Graphics2D)g).setComposite(AlphaComposite.getInstance(3, FlatAnimatedLafChange.alpha)); 
/* 112 */                 g.drawImage(snapshot, 0, 0, null);
/*     */               }
/*     */ 
/*     */               
/*     */               public void removeNotify() {
/* 117 */                 super.removeNotify();
/*     */ 
/*     */                 
/* 120 */                 snapshot.flush();
/*     */               }
/*     */             };
/* 123 */           if (!useAlpha)
/* 124 */             snapshotLayer.setOpaque(true); 
/* 125 */           snapshotLayer.setSize(layeredPane.getSize());
/*     */ 
/*     */           
/* 128 */           layeredPane.add(snapshotLayer, Integer.valueOf(JLayeredPane.DRAG_LAYER.intValue() + (useAlpha ? 2 : 1)));
/* 129 */           map.put(layeredPane, snapshotLayer);
/*     */         } 
/*     */       } 
/* 132 */     }  inShowSnapshot = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void hideSnapshotWithAnimation() {
/* 141 */     if (!FlatSystemProperties.getBoolean("flatlaf.animatedLafChange", true)) {
/*     */       return;
/*     */     }
/* 144 */     if (oldUIsnapshots.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 148 */     showSnapshot(false, newUIsnapshots);
/*     */ 
/*     */     
/* 151 */     animator = new Animator(duration, fraction -> {
/*     */           if (fraction < 0.1D || fraction > 0.9D) {
/*     */             return;
/*     */           }
/*     */           
/*     */           alpha = 1.0F - fraction;
/*     */           
/*     */           for (Map.Entry<JLayeredPane, JComponent> e : oldUIsnapshots.entrySet()) {
/*     */             if (((JLayeredPane)e.getKey()).isShowing()) {
/*     */               ((JComponent)e.getValue()).repaint();
/*     */             }
/*     */           } 
/*     */           
/*     */           Toolkit.getDefaultToolkit().sync();
/*     */         }() -> {
/*     */           hideSnapshot();
/*     */           animator = null;
/*     */         });
/* 169 */     animator.setResolution(resolution);
/* 170 */     animator.start();
/*     */   }
/*     */   
/*     */   private static void hideSnapshot() {
/* 174 */     hideSnapshot(oldUIsnapshots);
/* 175 */     hideSnapshot(newUIsnapshots);
/*     */   }
/*     */ 
/*     */   
/*     */   private static void hideSnapshot(Map<JLayeredPane, JComponent> map) {
/* 180 */     for (Map.Entry<JLayeredPane, JComponent> e : map.entrySet()) {
/* 181 */       ((JLayeredPane)e.getKey()).remove(e.getValue());
/* 182 */       ((JLayeredPane)e.getKey()).repaint();
/*     */     } 
/*     */     
/* 185 */     map.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void stop() {
/* 192 */     if (animator != null) {
/* 193 */       animator.stop();
/*     */     } else {
/* 195 */       hideSnapshot();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\extras\FlatAnimatedLafChange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */