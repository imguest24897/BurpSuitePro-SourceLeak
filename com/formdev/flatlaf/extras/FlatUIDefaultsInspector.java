/*      */ package com.formdev.flatlaf.extras;
/*      */ import com.formdev.flatlaf.extras.components.FlatTextField;
/*      */ import com.formdev.flatlaf.icons.FlatAbstractIcon;
/*      */ import com.formdev.flatlaf.ui.FlatLineBorder;
/*      */ import com.formdev.flatlaf.ui.FlatUIUtils;
/*      */ import com.formdev.flatlaf.util.GrayFilter;
/*      */ import com.formdev.flatlaf.util.HSLColor;
/*      */ import com.formdev.flatlaf.util.ScaledEmptyBorder;
/*      */ import com.formdev.flatlaf.util.UIScale;
/*      */ import java.awt.AWTEvent;
/*      */ import java.awt.BasicStroke;
/*      */ import java.awt.BorderLayout;
/*      */ import java.awt.Color;
/*      */ import java.awt.Component;
/*      */ import java.awt.Dimension;
/*      */ import java.awt.EventQueue;
/*      */ import java.awt.Font;
/*      */ import java.awt.FontMetrics;
/*      */ import java.awt.Graphics;
/*      */ import java.awt.Graphics2D;
/*      */ import java.awt.GraphicsConfiguration;
/*      */ import java.awt.GraphicsDevice;
/*      */ import java.awt.GraphicsEnvironment;
/*      */ import java.awt.GridBagConstraints;
/*      */ import java.awt.GridBagLayout;
/*      */ import java.awt.Insets;
/*      */ import java.awt.Rectangle;
/*      */ import java.awt.Toolkit;
/*      */ import java.awt.datatransfer.StringSelection;
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.KeyEvent;
/*      */ import java.awt.event.MouseAdapter;
/*      */ import java.awt.event.MouseEvent;
/*      */ import java.awt.event.WindowAdapter;
/*      */ import java.awt.event.WindowEvent;
/*      */ import java.beans.PropertyChangeEvent;
/*      */ import java.beans.PropertyChangeListener;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.HashSet;
/*      */ import java.util.Locale;
/*      */ import java.util.Map;
/*      */ import java.util.Properties;
/*      */ import java.util.Set;
/*      */ import java.util.function.Predicate;
/*      */ import java.util.prefs.Preferences;
/*      */ import java.util.regex.Pattern;
/*      */ import javax.swing.AbstractAction;
/*      */ import javax.swing.Action;
/*      */ import javax.swing.ActionMap;
/*      */ import javax.swing.Icon;
/*      */ import javax.swing.InputMap;
/*      */ import javax.swing.JComboBox;
/*      */ import javax.swing.JComponent;
/*      */ import javax.swing.JFrame;
/*      */ import javax.swing.JLabel;
/*      */ import javax.swing.JMenuItem;
/*      */ import javax.swing.JPanel;
/*      */ import javax.swing.JPopupMenu;
/*      */ import javax.swing.JScrollPane;
/*      */ import javax.swing.JTable;
/*      */ import javax.swing.KeyStroke;
/*      */ import javax.swing.SortOrder;
/*      */ import javax.swing.SwingUtilities;
/*      */ import javax.swing.UIDefaults;
/*      */ import javax.swing.UIManager;
/*      */ import javax.swing.border.Border;
/*      */ import javax.swing.event.DocumentEvent;
/*      */ import javax.swing.event.DocumentListener;
/*      */ import javax.swing.table.AbstractTableModel;
/*      */ import javax.swing.table.DefaultTableCellRenderer;
/*      */ import javax.swing.table.TableColumnModel;
/*      */ 
/*      */ public class FlatUIDefaultsInspector {
/*      */   private static final int KEY_MODIFIERS_MASK = 960;
/*      */   private static JFrame inspectorFrame;
/*   79 */   private final PropertyChangeListener lafListener = this::lafChanged;
/*   80 */   private final PropertyChangeListener lafDefaultsListener = this::lafDefaultsChanged; private boolean refreshPending; private Properties derivedColorKeys; private JPanel panel; private JPanel filterPanel; private JLabel flterLabel; private FlatTextField filterField;
/*      */   private JLabel valueTypeLabel;
/*      */   private JComboBox<String> valueTypeField;
/*      */   private JScrollPane scrollPane;
/*      */   private JTable table;
/*      */   private JPopupMenu tablePopupMenu;
/*      */   private JMenuItem copyKeyMenuItem;
/*      */   private JMenuItem copyValueMenuItem;
/*      */   private JMenuItem copyKeyAndValueMenuItem;
/*      */   
/*      */   public static void install(String activationKeys) {
/*   91 */     KeyStroke keyStroke = KeyStroke.getKeyStroke(activationKeys);
/*   92 */     Toolkit.getDefaultToolkit().addAWTEventListener(e -> { if (e.getID() == 402 && ((KeyEvent)e).getKeyCode() == keyStroke.getKeyCode() && (((KeyEvent)e).getModifiersEx() & 0x3C0) == (keyStroke.getModifiers() & 0x3C0)) show();  }8L);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void show() {
/*  103 */     if (inspectorFrame != null) {
/*  104 */       ensureOnScreen(inspectorFrame);
/*  105 */       inspectorFrame.toFront();
/*      */       
/*      */       return;
/*      */     } 
/*  109 */     inspectorFrame = (new FlatUIDefaultsInspector()).createFrame();
/*  110 */     inspectorFrame.setVisible(true);
/*      */   }
/*      */   
/*      */   public static void hide() {
/*  114 */     if (inspectorFrame != null) {
/*  115 */       inspectorFrame.dispose();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static JComponent createInspectorPanel() {
/*  122 */     return (new FlatUIDefaultsInspector()).panel;
/*      */   }
/*      */   
/*      */   private FlatUIDefaultsInspector() {
/*  126 */     initComponents();
/*      */     
/*  128 */     this.panel.setBorder((Border)new ScaledEmptyBorder(10, 10, 10, 10));
/*  129 */     this.filterPanel.setBorder((Border)new ScaledEmptyBorder(0, 0, 10, 0));
/*      */ 
/*      */     
/*  132 */     this.filterField.getDocument().addDocumentListener(new DocumentListener()
/*      */         {
/*      */           public void removeUpdate(DocumentEvent e) {
/*  135 */             FlatUIDefaultsInspector.this.filterChanged();
/*      */           }
/*      */           
/*      */           public void insertUpdate(DocumentEvent e) {
/*  139 */             FlatUIDefaultsInspector.this.filterChanged();
/*      */           }
/*      */           
/*      */           public void changedUpdate(DocumentEvent e) {
/*  143 */             FlatUIDefaultsInspector.this.filterChanged();
/*      */           }
/*      */         });
/*  146 */     delegateKey(38, "unitScrollUp");
/*  147 */     delegateKey(40, "unitScrollDown");
/*  148 */     delegateKey(33, "scrollUp");
/*  149 */     delegateKey(34, "scrollDown");
/*      */ 
/*      */     
/*  152 */     this.table.setModel(new ItemsTableModel(getUIDefaultsItems()));
/*  153 */     this.table.setDefaultRenderer(String.class, new KeyRenderer());
/*  154 */     this.table.setDefaultRenderer(Item.class, new ValueRenderer());
/*  155 */     this.table.getRowSorter().setSortKeys(Collections.singletonList(new RowSorter.SortKey(0, SortOrder.ASCENDING)));
/*      */ 
/*      */ 
/*      */     
/*  159 */     Preferences prefs = getPrefs();
/*  160 */     TableColumnModel columnModel = this.table.getColumnModel();
/*  161 */     columnModel.getColumn(0).setPreferredWidth(prefs.getInt("column1width", 100));
/*  162 */     columnModel.getColumn(1).setPreferredWidth(prefs.getInt("column2width", 100));
/*      */     
/*  164 */     PropertyChangeListener columnWidthListener = e -> {
/*      */         if ("width".equals(e.getPropertyName())) {
/*      */           prefs.putInt("column1width", columnModel.getColumn(0).getWidth());
/*      */           prefs.putInt("column2width", columnModel.getColumn(1).getWidth());
/*      */         } 
/*      */       };
/*  170 */     columnModel.getColumn(0).addPropertyChangeListener(columnWidthListener);
/*  171 */     columnModel.getColumn(1).addPropertyChangeListener(columnWidthListener);
/*      */ 
/*      */     
/*  174 */     String filter = prefs.get("filter", "");
/*  175 */     String valueType = prefs.get("valueType", null);
/*  176 */     if (filter != null && !filter.isEmpty())
/*  177 */       this.filterField.setText(filter); 
/*  178 */     if (valueType != null) {
/*  179 */       this.valueTypeField.setSelectedItem(valueType);
/*      */     }
/*  181 */     this.panel.addPropertyChangeListener("ancestor", e -> {
/*      */           if (e.getNewValue() != null) {
/*      */             UIManager.addPropertyChangeListener(this.lafListener);
/*      */             
/*      */             UIManager.getDefaults().addPropertyChangeListener(this.lafDefaultsListener);
/*      */           } else {
/*      */             UIManager.removePropertyChangeListener(this.lafListener);
/*      */             
/*      */             UIManager.getDefaults().removePropertyChangeListener(this.lafDefaultsListener);
/*      */           } 
/*      */         });
/*  192 */     this.panel.registerKeyboardAction(e -> refresh(), 
/*      */         
/*  194 */         KeyStroke.getKeyStroke(116, 0, false), 1);
/*      */   }
/*      */ 
/*      */   
/*      */   private JFrame createFrame() {
/*  199 */     final JFrame frame = new JFrame();
/*  200 */     frame.setTitle("UI Defaults Inspector");
/*  201 */     frame.setDefaultCloseOperation(2);
/*  202 */     frame.addWindowListener(new WindowAdapter()
/*      */         {
/*      */           public void windowClosed(WindowEvent e) {
/*  205 */             FlatUIDefaultsInspector.inspectorFrame = null;
/*      */           }
/*      */           
/*      */           public void windowClosing(WindowEvent e) {
/*  209 */             FlatUIDefaultsInspector.this.saveWindowBounds(frame);
/*      */           }
/*      */           
/*      */           public void windowDeactivated(WindowEvent e) {
/*  213 */             FlatUIDefaultsInspector.this.saveWindowBounds(frame);
/*      */           }
/*      */         });
/*      */     
/*  217 */     updateWindowTitle(frame);
/*      */     
/*  219 */     frame.getContentPane().add(this.panel, "Center");
/*      */ 
/*      */     
/*  222 */     Preferences prefs = getPrefs();
/*  223 */     int x = prefs.getInt("x", -1);
/*  224 */     int y = prefs.getInt("y", -1);
/*  225 */     int width = prefs.getInt("width", UIScale.scale(600));
/*  226 */     int height = prefs.getInt("height", UIScale.scale(800));
/*  227 */     frame.setSize(width, height);
/*  228 */     if (x != -1 && y != -1) {
/*  229 */       frame.setLocation(x, y);
/*  230 */       ensureOnScreen(frame);
/*      */     } else {
/*  232 */       frame.setLocationRelativeTo((Component)null);
/*      */     } 
/*      */     
/*  235 */     ((JComponent)frame.getContentPane()).registerKeyboardAction(e -> frame.dispose(), 
/*      */         
/*  237 */         KeyStroke.getKeyStroke(27, 0, false), 1);
/*      */ 
/*      */     
/*  240 */     return frame;
/*      */   }
/*      */   
/*      */   private void delegateKey(int keyCode, final String actionKey) {
/*  244 */     KeyStroke keyStroke = KeyStroke.getKeyStroke(keyCode, 0);
/*  245 */     String actionMapKey = "delegate-" + actionKey;
/*      */     
/*  247 */     this.filterField.getInputMap().put(keyStroke, actionMapKey);
/*  248 */     this.filterField.getActionMap().put(actionMapKey, new AbstractAction()
/*      */         {
/*      */           public void actionPerformed(ActionEvent e) {
/*  251 */             Action action = FlatUIDefaultsInspector.this.scrollPane.getActionMap().get(actionKey);
/*  252 */             if (action != null) {
/*  253 */               action.actionPerformed(new ActionEvent(FlatUIDefaultsInspector.this.scrollPane, e
/*  254 */                     .getID(), actionKey, e.getWhen(), e.getModifiers()));
/*      */             }
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   private static void ensureOnScreen(JFrame frame) {
/*  261 */     Rectangle frameBounds = frame.getBounds();
/*  262 */     boolean onScreen = false;
/*  263 */     for (GraphicsDevice screen : GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()) {
/*  264 */       GraphicsConfiguration gc = screen.getDefaultConfiguration();
/*  265 */       Rectangle screenBounds = FlatUIUtils.subtractInsets(gc.getBounds(), 
/*  266 */           Toolkit.getDefaultToolkit().getScreenInsets(gc));
/*  267 */       if (frameBounds.intersects(screenBounds)) {
/*  268 */         onScreen = true;
/*      */         
/*      */         break;
/*      */       } 
/*      */     } 
/*  273 */     if (!onScreen)
/*  274 */       frame.setLocationRelativeTo((Component)null); 
/*      */   }
/*      */   
/*      */   private void lafChanged(PropertyChangeEvent e) {
/*  278 */     if ("lookAndFeel".equals(e.getPropertyName()))
/*  279 */       refresh(); 
/*      */   }
/*      */   
/*      */   private void lafDefaultsChanged(PropertyChangeEvent e) {
/*  283 */     if (this.refreshPending) {
/*      */       return;
/*      */     }
/*  286 */     this.refreshPending = true;
/*  287 */     EventQueue.invokeLater(() -> {
/*      */           refresh();
/*      */           this.refreshPending = false;
/*      */         });
/*      */   }
/*      */   
/*      */   private void refresh() {
/*  294 */     ItemsTableModel model = (ItemsTableModel)this.table.getModel();
/*  295 */     model.setItems(getUIDefaultsItems());
/*      */     
/*  297 */     JFrame frame = (JFrame)SwingUtilities.getAncestorOfClass(JFrame.class, this.panel);
/*  298 */     if (frame != null)
/*  299 */       updateWindowTitle(frame); 
/*      */   }
/*      */   
/*      */   private Item[] getUIDefaultsItems() {
/*  303 */     UIDefaults defaults = UIManager.getDefaults();
/*  304 */     UIDefaults lafDefaults = UIManager.getLookAndFeelDefaults();
/*      */     
/*  306 */     Set<Map.Entry<Object, Object>> defaultsSet = defaults.entrySet();
/*  307 */     ArrayList<Item> items = new ArrayList<>(defaultsSet.size());
/*  308 */     HashSet<Object> keys = new HashSet(defaultsSet.size());
/*  309 */     Color[] pBaseColor = new Color[1];
/*  310 */     for (Map.Entry<Object, Object> e : defaultsSet) {
/*  311 */       Object key = e.getKey();
/*      */ 
/*      */       
/*  314 */       if (!(key instanceof String)) {
/*      */         continue;
/*      */       }
/*      */       
/*  318 */       if (((String)key).startsWith("FlatLaf.internal.")) {
/*      */         continue;
/*      */       }
/*      */       
/*  322 */       Object value = defaults.get(key);
/*  323 */       if (value instanceof Class) {
/*      */         continue;
/*      */       }
/*      */       
/*  327 */       if (!keys.add(key)) {
/*      */         continue;
/*      */       }
/*      */       
/*  331 */       Object info = null;
/*  332 */       if (value instanceof com.formdev.flatlaf.util.DerivedColor) {
/*  333 */         Color resolvedColor = resolveDerivedColor(defaults, (String)key, (Color)value, pBaseColor);
/*  334 */         if (resolvedColor != value) {
/*  335 */           info = new Color[] { resolvedColor, pBaseColor[0] };
/*      */         }
/*      */       } 
/*      */       
/*  339 */       Object lafValue = null;
/*  340 */       if (defaults.containsKey(key)) {
/*  341 */         lafValue = lafDefaults.get(key);
/*      */       }
/*      */       
/*  344 */       items.add(new Item(String.valueOf(key), value, lafValue, info));
/*      */     } 
/*      */     
/*  347 */     return items.<Item>toArray(new Item[items.size()]);
/*      */   }
/*      */   
/*      */   private Color resolveDerivedColor(UIDefaults defaults, String key, Color color, Color[] pBaseColor) {
/*  351 */     if (pBaseColor != null) {
/*  352 */       pBaseColor[0] = null;
/*      */     }
/*  354 */     if (!(color instanceof com.formdev.flatlaf.util.DerivedColor)) {
/*  355 */       return color;
/*      */     }
/*  357 */     if (this.derivedColorKeys == null) {
/*  358 */       this.derivedColorKeys = loadDerivedColorKeys();
/*      */     }
/*  360 */     Object baseKey = this.derivedColorKeys.get(key);
/*  361 */     if (baseKey == null) {
/*  362 */       return color;
/*      */     }
/*      */     
/*  365 */     if ("null".equals(baseKey)) {
/*  366 */       return color;
/*      */     }
/*  368 */     Color baseColor = defaults.getColor(baseKey);
/*  369 */     if (baseColor == null) {
/*  370 */       return color;
/*      */     }
/*  372 */     if (baseColor instanceof com.formdev.flatlaf.util.DerivedColor) {
/*  373 */       baseColor = resolveDerivedColor(defaults, (String)baseKey, baseColor, null);
/*      */     }
/*  375 */     if (pBaseColor != null) {
/*  376 */       pBaseColor[0] = baseColor;
/*      */     }
/*  378 */     Color newColor = FlatUIUtils.deriveColor(color, baseColor);
/*      */ 
/*      */ 
/*      */     
/*  382 */     return new Color(newColor.getRGB(), true);
/*      */   }
/*      */   
/*      */   private Properties loadDerivedColorKeys() {
/*  386 */     String name = "/com/formdev/flatlaf/extras/resources/DerivedColorKeys.properties";
/*  387 */     Properties properties = new Properties(); 
/*  388 */     try { InputStream in = getClass().getResourceAsStream(name); 
/*  389 */       try { if (in != null)
/*  390 */           properties.load(in); 
/*  391 */         if (in != null) in.close();  } catch (Throwable throwable) { if (in != null) try { in.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }   throw throwable; }  } catch (IOException ex)
/*  392 */     { LoggingFacade.INSTANCE.logSevere("FlatLaf: Failed to load '" + name + "'.", ex); }
/*      */     
/*  394 */     return properties;
/*      */   }
/*      */   
/*      */   private static void updateWindowTitle(JFrame frame) {
/*  398 */     String title = frame.getTitle();
/*  399 */     String sep = "  -  ";
/*  400 */     int sepIndex = title.indexOf(sep);
/*  401 */     if (sepIndex >= 0)
/*  402 */       title = title.substring(0, sepIndex); 
/*  403 */     frame.setTitle(title + sep + UIManager.getLookAndFeel().getName());
/*      */   }
/*      */   
/*      */   private void saveWindowBounds(JFrame frame) {
/*  407 */     Preferences prefs = getPrefs();
/*  408 */     prefs.putInt("x", frame.getX());
/*  409 */     prefs.putInt("y", frame.getY());
/*  410 */     prefs.putInt("width", frame.getWidth());
/*  411 */     prefs.putInt("height", frame.getHeight());
/*      */   }
/*      */   
/*      */   private Preferences getPrefs() {
/*  415 */     return Preferences.userRoot().node("flatlaf-uidefaults-inspector");
/*      */   }
/*      */   
/*      */   private void filterChanged() {
/*  419 */     String filter = this.filterField.getText().trim();
/*  420 */     String valueType = (String)this.valueTypeField.getSelectedItem();
/*      */ 
/*      */     
/*  423 */     String[] filters = !filter.isEmpty() ? filter.split(" +") : null;
/*  424 */     Pattern[] patterns = (filters != null) ? new Pattern[filters.length] : null;
/*  425 */     if (filters != null) {
/*  426 */       for (int i = 0; i < filters.length; i++) {
/*  427 */         filters[i] = filters[i].toLowerCase(Locale.ENGLISH);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  434 */         String f = filters[i];
/*  435 */         boolean matchBeginning = f.startsWith("^");
/*  436 */         boolean matchEnd = f.endsWith("$");
/*  437 */         if (f.indexOf('*') >= 0 || f.indexOf('?') >= 0 || matchBeginning || matchEnd) {
/*  438 */           if (matchBeginning)
/*  439 */             f = f.substring(1); 
/*  440 */           if (matchEnd) {
/*  441 */             f = f.substring(0, f.length() - 1);
/*      */           }
/*  443 */           String regex = ("\\Q" + f + "\\E").replace("*", "\\E.*\\Q").replace("?", "\\E.\\Q");
/*  444 */           if (!matchBeginning)
/*  445 */             regex = ".*" + regex; 
/*  446 */           if (!matchEnd)
/*  447 */             regex = regex + ".*"; 
/*  448 */           patterns[i] = Pattern.compile(regex);
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/*  453 */     ItemsTableModel model = (ItemsTableModel)this.table.getModel();
/*  454 */     model.setFilter(item -> {
/*      */           if (valueType != null && !valueType.equals("(any)") && !typeOfValue(item.value).startsWith(valueType)) {
/*      */             return false;
/*      */           }
/*      */           
/*      */           if (filters == null) {
/*      */             return true;
/*      */           }
/*      */           String lkey = item.key.toLowerCase(Locale.ENGLISH);
/*      */           String lvalue = item.getValueAsString().toLowerCase(Locale.ENGLISH);
/*      */           for (int i = 0; i < filters.length; i++) {
/*      */             Pattern p = patterns[i];
/*      */             if (p != null) {
/*      */               if (p.matcher(lkey).matches() || p.matcher(lvalue).matches()) {
/*      */                 return true;
/*      */               }
/*      */             } else {
/*      */               String f = filters[i];
/*      */               if (lkey.contains(f) || lvalue.contains(f)) {
/*      */                 return true;
/*      */               }
/*      */             } 
/*      */           } 
/*      */           return false;
/*      */         });
/*  479 */     Preferences prefs = getPrefs();
/*  480 */     prefs.put("filter", filter);
/*  481 */     prefs.put("valueType", valueType);
/*      */   }
/*      */   
/*      */   private String typeOfValue(Object value) {
/*  485 */     if (value instanceof Boolean)
/*  486 */       return "Boolean"; 
/*  487 */     if (value instanceof Border)
/*  488 */       return "Border"; 
/*  489 */     if (value instanceof Color) {
/*  490 */       if (((Color)value).getAlpha() != 255)
/*  491 */         return "Color (α)"; 
/*  492 */       if (value instanceof com.formdev.flatlaf.util.DerivedColor)
/*  493 */         return "Color (ƒ)"; 
/*  494 */       return "Color";
/*      */     } 
/*  496 */     if (value instanceof Dimension)
/*  497 */       return "Dimension"; 
/*  498 */     if (value instanceof Float)
/*  499 */       return "Float"; 
/*  500 */     if (value instanceof Font)
/*  501 */       return "Font"; 
/*  502 */     if (value instanceof Icon)
/*  503 */       return "Icon"; 
/*  504 */     if (value instanceof Insets)
/*  505 */       return "Insets"; 
/*  506 */     if (value instanceof Integer)
/*  507 */       return "Integer"; 
/*  508 */     if (value instanceof String)
/*  509 */       return "String"; 
/*  510 */     return "(other)";
/*      */   }
/*      */   
/*      */   private void tableMousePressed(MouseEvent e) {
/*  514 */     if (!SwingUtilities.isRightMouseButton(e)) {
/*      */       return;
/*      */     }
/*  517 */     int row = this.table.rowAtPoint(e.getPoint());
/*  518 */     if (row >= 0 && !this.table.isRowSelected(row))
/*  519 */       this.table.setRowSelectionInterval(row, row); 
/*      */   }
/*      */   
/*      */   private void copyKey() {
/*  523 */     copyToClipboard(0);
/*      */   }
/*      */   
/*      */   private void copyValue() {
/*  527 */     copyToClipboard(1);
/*      */   }
/*      */   
/*      */   private void copyKeyAndValue() {
/*  531 */     copyToClipboard(-1);
/*      */   }
/*      */   
/*      */   private void copyToClipboard(int column) {
/*  535 */     int[] rows = this.table.getSelectedRows();
/*  536 */     if (rows.length == 0) {
/*      */       return;
/*      */     }
/*  539 */     StringBuilder buf = new StringBuilder();
/*  540 */     for (int i = 0; i < rows.length; i++) {
/*  541 */       if (i > 0) {
/*  542 */         buf.append('\n');
/*      */       }
/*  544 */       if (column < 0 || column == 0)
/*  545 */         buf.append(this.table.getValueAt(rows[i], 0)); 
/*  546 */       if (column < 0)
/*  547 */         buf.append(" = "); 
/*  548 */       if (column < 0 || column == 1) {
/*  549 */         buf.append(this.table.getValueAt(rows[i], 1));
/*      */       }
/*      */     } 
/*  552 */     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(buf
/*  553 */           .toString()), null);
/*      */   }
/*      */ 
/*      */   
/*      */   private void initComponents() {
/*  558 */     this.panel = new JPanel();
/*  559 */     this.filterPanel = new JPanel();
/*  560 */     this.flterLabel = new JLabel();
/*  561 */     this.filterField = new FlatTextField();
/*  562 */     this.valueTypeLabel = new JLabel();
/*  563 */     this.valueTypeField = new JComboBox<>();
/*  564 */     this.scrollPane = new JScrollPane();
/*  565 */     this.table = new JTable();
/*  566 */     this.tablePopupMenu = new JPopupMenu();
/*  567 */     this.copyKeyMenuItem = new JMenuItem();
/*  568 */     this.copyValueMenuItem = new JMenuItem();
/*  569 */     this.copyKeyAndValueMenuItem = new JMenuItem();
/*      */ 
/*      */ 
/*      */     
/*  573 */     this.panel.setLayout(new BorderLayout());
/*      */ 
/*      */ 
/*      */     
/*  577 */     this.filterPanel.setLayout(new GridBagLayout());
/*  578 */     ((GridBagLayout)this.filterPanel.getLayout()).columnWidths = new int[] { 0, 0, 0, 0, 0 };
/*  579 */     ((GridBagLayout)this.filterPanel.getLayout()).rowHeights = new int[] { 0, 0 };
/*  580 */     ((GridBagLayout)this.filterPanel.getLayout()).columnWeights = new double[] { 0.0D, 1.0D, 0.0D, 0.0D, 1.0E-4D };
/*  581 */     ((GridBagLayout)this.filterPanel.getLayout()).rowWeights = new double[] { 0.0D, 1.0E-4D };
/*      */ 
/*      */     
/*  584 */     this.flterLabel.setText("Filter:");
/*  585 */     this.flterLabel.setLabelFor((Component)this.filterField);
/*  586 */     this.flterLabel.setDisplayedMnemonic('F');
/*  587 */     this.filterPanel.add(this.flterLabel, new GridBagConstraints(0, 0, 1, 1, 0.0D, 0.0D, 10, 1, new Insets(0, 0, 0, 10), 0, 0));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  592 */     this.filterField.setPlaceholderText("enter one or more filter strings, separated by space characters");
/*  593 */     this.filterField.setShowClearButton(true);
/*  594 */     this.filterPanel.add((Component)this.filterField, new GridBagConstraints(1, 0, 1, 1, 0.0D, 0.0D, 10, 1, new Insets(0, 0, 0, 10), 0, 0));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  599 */     this.valueTypeLabel.setText("Value Type:");
/*  600 */     this.valueTypeLabel.setLabelFor(this.valueTypeField);
/*  601 */     this.valueTypeLabel.setDisplayedMnemonic('T');
/*  602 */     this.filterPanel.add(this.valueTypeLabel, new GridBagConstraints(2, 0, 1, 1, 0.0D, 0.0D, 10, 1, new Insets(0, 0, 0, 10), 0, 0));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  607 */     this.valueTypeField.setModel(new DefaultComboBoxModel<>(new String[] { "(any)", "Boolean", "Border", "Color", "Color (α)", "Color (ƒ)", "Dimension", "Float", "Font", "Icon", "Insets", "Integer", "String", "(other)" }));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  623 */     this.valueTypeField.addActionListener(e -> filterChanged());
/*  624 */     this.filterPanel.add(this.valueTypeField, new GridBagConstraints(3, 0, 1, 1, 0.0D, 0.0D, 10, 1, new Insets(0, 0, 0, 0), 0, 0));
/*      */ 
/*      */ 
/*      */     
/*  628 */     this.panel.add(this.filterPanel, "North");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  634 */     this.table.setAutoCreateRowSorter(true);
/*  635 */     this.table.setComponentPopupMenu(this.tablePopupMenu);
/*  636 */     this.table.addMouseListener(new MouseAdapter()
/*      */         {
/*      */           public void mousePressed(MouseEvent e) {
/*  639 */             FlatUIDefaultsInspector.this.tableMousePressed(e);
/*      */           }
/*      */         });
/*  642 */     this.scrollPane.setViewportView(this.table);
/*      */     
/*  644 */     this.panel.add(this.scrollPane, "Center");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  651 */     this.copyKeyMenuItem.setText("Copy Key");
/*  652 */     this.copyKeyMenuItem.addActionListener(e -> copyKey());
/*  653 */     this.tablePopupMenu.add(this.copyKeyMenuItem);
/*      */ 
/*      */     
/*  656 */     this.copyValueMenuItem.setText("Copy Value");
/*  657 */     this.copyValueMenuItem.addActionListener(e -> copyValue());
/*  658 */     this.tablePopupMenu.add(this.copyValueMenuItem);
/*      */ 
/*      */     
/*  661 */     this.copyKeyAndValueMenuItem.setText("Copy Key and Value");
/*  662 */     this.copyKeyAndValueMenuItem.addActionListener(e -> copyKeyAndValue());
/*  663 */     this.tablePopupMenu.add(this.copyKeyAndValueMenuItem);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static class Item
/*      */   {
/*      */     final String key;
/*      */ 
/*      */ 
/*      */     
/*      */     final Object value;
/*      */ 
/*      */ 
/*      */     
/*      */     final Object lafValue;
/*      */ 
/*      */ 
/*      */     
/*      */     final Object info;
/*      */ 
/*      */ 
/*      */     
/*      */     private String valueStr;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     Item(String key, Object value, Object lafValue, Object info) {
/*  694 */       this.key = key;
/*  695 */       this.value = value;
/*  696 */       this.lafValue = lafValue;
/*  697 */       this.info = info;
/*      */     }
/*      */     
/*      */     String getValueAsString() {
/*  701 */       if (this.valueStr == null)
/*  702 */         this.valueStr = valueAsString(this.value, this.info); 
/*  703 */       return this.valueStr;
/*      */     }
/*      */     
/*      */     static String valueAsString(Object value, Object info) {
/*  707 */       if (value instanceof Color) {
/*  708 */         Color color = (info instanceof Color[]) ? ((Color[])info)[0] : (Color)value;
/*  709 */         HSLColor hslColor = new HSLColor(color);
/*  710 */         int hue = Math.round(hslColor.getHue());
/*  711 */         int saturation = Math.round(hslColor.getSaturation());
/*  712 */         int luminance = Math.round(hslColor.getLuminance());
/*  713 */         if (color.getAlpha() == 255)
/*  714 */           return String.format("%-9s HSL %3d %3d %3d", new Object[] {
/*  715 */                 color2hex(color), Integer.valueOf(hue), Integer.valueOf(saturation), Integer.valueOf(luminance)
/*      */               }); 
/*  717 */         int alpha = Math.round(hslColor.getAlpha() * 100.0F);
/*  718 */         return String.format("%-9s HSL %3d %3d %3d %2d", new Object[] {
/*  719 */               color2hex(color), Integer.valueOf(hue), Integer.valueOf(saturation), Integer.valueOf(luminance), Integer.valueOf(alpha) });
/*      */       } 
/*  721 */       if (value instanceof Insets) {
/*  722 */         Insets insets = (Insets)value;
/*  723 */         return insets.top + "," + insets.left + "," + insets.bottom + "," + insets.right;
/*  724 */       }  if (value instanceof Dimension) {
/*  725 */         Dimension dim = (Dimension)value;
/*  726 */         return dim.width + "," + dim.height;
/*  727 */       }  if (value instanceof Font) {
/*  728 */         Font font = (Font)value;
/*  729 */         String s = font.getFamily() + " " + font.getSize();
/*  730 */         if (font.isBold())
/*  731 */           s = s + " bold"; 
/*  732 */         if (font.isItalic())
/*  733 */           s = s + " italic"; 
/*  734 */         return s;
/*  735 */       }  if (value instanceof Icon) {
/*  736 */         Icon icon = (Icon)value;
/*  737 */         return icon.getIconWidth() + "x" + icon.getIconHeight() + "   " + icon.getClass().getName();
/*  738 */       }  if (value instanceof Border) {
/*  739 */         Border border = (Border)value;
/*  740 */         if (border instanceof FlatLineBorder) {
/*  741 */           FlatLineBorder lineBorder = (FlatLineBorder)border;
/*  742 */           return valueAsString(lineBorder.getUnscaledBorderInsets(), null) + "  " + 
/*  743 */             color2hex(lineBorder.getLineColor()) + "  " + lineBorder
/*  744 */             .getLineThickness() + "    " + border
/*  745 */             .getClass().getName();
/*  746 */         }  if (border instanceof EmptyBorder) {
/*      */ 
/*      */           
/*  749 */           Insets insets = (border instanceof FlatEmptyBorder) ? ((FlatEmptyBorder)border).getUnscaledBorderInsets() : ((EmptyBorder)border).getBorderInsets();
/*  750 */           return valueAsString(insets, null) + "    " + border.getClass().getName();
/*  751 */         }  if (border instanceof com.formdev.flatlaf.ui.FlatBorder || border instanceof com.formdev.flatlaf.ui.FlatMarginBorder) {
/*  752 */           return border.getClass().getName();
/*      */         }
/*  754 */         return String.valueOf(value);
/*  755 */       }  if (value instanceof GrayFilter) {
/*  756 */         GrayFilter grayFilter = (GrayFilter)value;
/*  757 */         return grayFilter.getBrightness() + "," + grayFilter.getContrast() + " " + grayFilter
/*  758 */           .getAlpha() + "    " + grayFilter.getClass().getName();
/*  759 */       }  if (value instanceof ActionMap) {
/*  760 */         ActionMap actionMap = (ActionMap)value;
/*  761 */         return "ActionMap (" + actionMap.size() + ")";
/*  762 */       }  if (value instanceof InputMap) {
/*  763 */         InputMap inputMap = (InputMap)value;
/*  764 */         return "InputMap (" + inputMap.size() + ")";
/*  765 */       }  if (value instanceof Object[])
/*  766 */         return Arrays.toString((Object[])value); 
/*  767 */       if (value instanceof int[]) {
/*  768 */         return Arrays.toString((int[])value);
/*      */       }
/*  770 */       return String.valueOf(value);
/*      */     }
/*      */ 
/*      */     
/*      */     private static String color2hex(Color color) {
/*  775 */       int rgb = color.getRGB();
/*  776 */       boolean hasAlpha = (color.getAlpha() != 255);
/*      */       
/*  778 */       boolean useShortFormat = ((rgb & 0xF0000000) == (rgb & 0xF000000) << 4 && (rgb & 0xF00000) == (rgb & 0xF0000) << 4 && (rgb & 0xF000) == (rgb & 0xF00) << 4 && (rgb & 0xF0) == (rgb & 0xF) << 4);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  784 */       if (useShortFormat) {
/*  785 */         int srgb = (rgb & 0xF0000) >> 8 | (rgb & 0xF00) >> 4 | rgb & 0xF;
/*  786 */         return String.format(hasAlpha ? "#%03X%X" : "#%03X", new Object[] { Integer.valueOf(srgb), Integer.valueOf(rgb >> 24 & 0xF) });
/*      */       } 
/*  788 */       return String.format(hasAlpha ? "#%06X%02X" : "#%06X", new Object[] { Integer.valueOf(rgb & 0xFFFFFF), Integer.valueOf(rgb >> 24 & 0xFF) });
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public String toString() {
/*  794 */       return getValueAsString();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private static class ItemsTableModel
/*      */     extends AbstractTableModel
/*      */   {
/*      */     private FlatUIDefaultsInspector.Item[] allItems;
/*      */     
/*      */     private FlatUIDefaultsInspector.Item[] items;
/*      */     private Predicate<FlatUIDefaultsInspector.Item> filter;
/*      */     
/*      */     ItemsTableModel(FlatUIDefaultsInspector.Item[] items) {
/*  808 */       this.allItems = this.items = items;
/*      */     }
/*      */     
/*      */     void setItems(FlatUIDefaultsInspector.Item[] items) {
/*  812 */       this.allItems = this.items = items;
/*  813 */       setFilter(this.filter);
/*      */     }
/*      */     
/*      */     void setFilter(Predicate<FlatUIDefaultsInspector.Item> filter) {
/*  817 */       this.filter = filter;
/*      */       
/*  819 */       if (filter != null) {
/*  820 */         ArrayList<FlatUIDefaultsInspector.Item> list = new ArrayList<>(this.allItems.length);
/*  821 */         for (FlatUIDefaultsInspector.Item item : this.allItems) {
/*  822 */           if (filter.test(item))
/*  823 */             list.add(item); 
/*      */         } 
/*  825 */         this.items = list.<FlatUIDefaultsInspector.Item>toArray(new FlatUIDefaultsInspector.Item[list.size()]);
/*      */       } else {
/*  827 */         this.items = this.allItems;
/*      */       } 
/*  829 */       fireTableDataChanged();
/*      */     }
/*      */ 
/*      */     
/*      */     public int getRowCount() {
/*  834 */       return this.items.length;
/*      */     }
/*      */ 
/*      */     
/*      */     public int getColumnCount() {
/*  839 */       return 2;
/*      */     }
/*      */ 
/*      */     
/*      */     public String getColumnName(int columnIndex) {
/*  844 */       switch (columnIndex) { case 0:
/*  845 */           return "Name";
/*  846 */         case 1: return "Value"; }
/*      */       
/*  848 */       return super.getColumnName(columnIndex);
/*      */     }
/*      */ 
/*      */     
/*      */     public Class<?> getColumnClass(int columnIndex) {
/*  853 */       switch (columnIndex) { case 0:
/*  854 */           return String.class;
/*  855 */         case 1: return FlatUIDefaultsInspector.Item.class; }
/*      */       
/*  857 */       return super.getColumnClass(columnIndex);
/*      */     }
/*      */ 
/*      */     
/*      */     public Object getValueAt(int rowIndex, int columnIndex) {
/*  862 */       FlatUIDefaultsInspector.Item item = this.items[rowIndex];
/*  863 */       switch (columnIndex) { case 0:
/*  864 */           return item.key;
/*  865 */         case 1: return item; }
/*      */       
/*  867 */       return null;
/*      */     }
/*      */   }
/*      */   
/*      */   private static class Renderer
/*      */     extends DefaultTableCellRenderer
/*      */   {
/*      */     protected boolean selected;
/*      */     protected boolean first;
/*      */     
/*      */     private Renderer() {}
/*      */     
/*      */     protected void init(JTable table, String key, boolean selected, int row) {
/*  880 */       this.selected = selected;
/*      */       
/*  882 */       this.first = false;
/*  883 */       if (row > 0) {
/*  884 */         String previousKey = (String)table.getValueAt(row - 1, 0);
/*  885 */         int dot = key.indexOf('.');
/*  886 */         if (dot > 0) {
/*  887 */           String prefix = key.substring(0, dot + 1);
/*  888 */           this.first = !previousKey.startsWith(prefix);
/*      */         } else {
/*  890 */           this.first = (previousKey.indexOf('.') > 0);
/*      */         } 
/*      */       } 
/*      */     }
/*      */     protected void paintSeparator(Graphics g) {
/*  895 */       if (this.first && !this.selected) {
/*  896 */         g.setColor(FlatLaf.isLafDark() ? Color.gray : Color.lightGray);
/*  897 */         g.fillRect(0, 0, getWidth() - 1, 1);
/*      */       } 
/*      */     }
/*      */     
/*      */     protected String layoutLabel(FontMetrics fm, String text, Rectangle textR) {
/*  902 */       int width = getWidth();
/*  903 */       int height = getHeight();
/*  904 */       Insets insets = getInsets();
/*      */       
/*  906 */       Rectangle viewR = new Rectangle(insets.left, insets.top, width - insets.left + insets.right, height - insets.top + insets.bottom);
/*      */ 
/*      */       
/*  909 */       Rectangle iconR = new Rectangle();
/*      */       
/*  911 */       return SwingUtilities.layoutCompoundLabel(this, fm, text, null, 
/*  912 */           getVerticalAlignment(), getHorizontalAlignment(), 
/*  913 */           getVerticalTextPosition(), getHorizontalTextPosition(), viewR, iconR, textR, 
/*  914 */           getIconTextGap());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private static class KeyRenderer
/*      */     extends Renderer
/*      */   {
/*      */     private String key;
/*      */     
/*      */     private boolean isOverridden;
/*      */     
/*      */     private Icon overriddenIcon;
/*      */     
/*      */     private KeyRenderer() {}
/*      */     
/*      */     public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
/*  931 */       this.key = (String)value;
/*  932 */       init(table, this.key, isSelected, row);
/*      */       
/*  934 */       FlatUIDefaultsInspector.Item item = (FlatUIDefaultsInspector.Item)table.getValueAt(row, 1);
/*  935 */       this.isOverridden = (item.lafValue != null);
/*      */ 
/*      */       
/*  938 */       String toolTipText = this.key;
/*  939 */       if (this.isOverridden)
/*  940 */         toolTipText = toolTipText + "    \n\nLaF UI default value was overridden with UIManager.put(key,value)."; 
/*  941 */       setToolTipText(toolTipText);
/*      */       
/*  943 */       return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void paintComponent(Graphics g) {
/*  948 */       g.setColor(getBackground());
/*  949 */       g.fillRect(0, 0, getWidth(), getHeight());
/*      */       
/*  951 */       FontMetrics fm = getFontMetrics(getFont());
/*  952 */       Rectangle textR = new Rectangle();
/*  953 */       String clippedText = layoutLabel(fm, this.key, textR);
/*  954 */       int x = textR.x;
/*  955 */       int y = textR.y + fm.getAscent();
/*      */       
/*  957 */       int dot = this.key.indexOf('.');
/*  958 */       if (dot > 0 && !this.selected) {
/*  959 */         g.setColor(FlatUIUtils.getUIColor("Label.disabledForeground", 
/*  960 */               FlatUIUtils.getUIColor("Label.disabledText", Color.gray)));
/*      */         
/*  962 */         if (dot >= clippedText.length()) {
/*  963 */           FlatUIUtils.drawString(this, g, clippedText, x, y);
/*      */         } else {
/*  965 */           String prefix = clippedText.substring(0, dot + 1);
/*  966 */           String subkey = clippedText.substring(dot + 1);
/*      */           
/*  968 */           FlatUIUtils.drawString(this, g, prefix, x, y);
/*      */           
/*  970 */           g.setColor(getForeground());
/*  971 */           FlatUIUtils.drawString(this, g, subkey, x + fm.stringWidth(prefix), y);
/*      */         } 
/*      */       } else {
/*  974 */         g.setColor(getForeground());
/*  975 */         FlatUIUtils.drawString(this, g, clippedText, x, y);
/*      */       } 
/*      */       
/*  978 */       if (this.isOverridden) {
/*  979 */         if (this.overriddenIcon == null) {
/*  980 */           this.overriddenIcon = (Icon)new FlatAbstractIcon(16, 16, null)
/*      */             {
/*      */               protected void paintIcon(Component c, Graphics2D g2) {
/*  983 */                 g2.setColor(FlatUIUtils.getUIColor("Actions.Red", Color.red));
/*  984 */                 g2.setStroke(new BasicStroke(2.0F));
/*  985 */                 g2.draw(FlatUIUtils.createPath(false, new double[] { 3.0D, 10.0D, 8.0D, 5.0D, 13.0D, 10.0D }));
/*      */               }
/*      */             };
/*      */         }
/*      */         
/*  990 */         this.overriddenIcon.paintIcon(this, g, 
/*  991 */             getWidth() - this.overriddenIcon.getIconWidth(), (
/*  992 */             getHeight() - this.overriddenIcon.getIconHeight()) / 2);
/*      */       } 
/*      */       
/*  995 */       paintSeparator(g);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static class ValueRenderer
/*      */     extends Renderer
/*      */   {
/*      */     private FlatUIDefaultsInspector.Item item;
/*      */     
/*      */     private Color valueColor;
/*      */ 
/*      */     
/*      */     private ValueRenderer() {}
/*      */ 
/*      */     
/*      */     public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
/* 1013 */       this.item = (FlatUIDefaultsInspector.Item)value;
/* 1014 */       init(table, this.item.key, isSelected, row);
/*      */ 
/*      */       
/* 1017 */       if (!(this.item.value instanceof Color)) {
/* 1018 */         setBackground((Color)null);
/* 1019 */         setForeground((Color)null);
/*      */       } 
/* 1021 */       if (!(this.item.value instanceof Icon)) {
/* 1022 */         setIcon((Icon)null);
/*      */       }
/*      */       
/* 1025 */       value = this.item.getValueAsString();
/*      */       
/* 1027 */       super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
/*      */       
/* 1029 */       if (this.item.value instanceof Color) {
/* 1030 */         Color color = (this.item.info instanceof Color[]) ? ((Color[])this.item.info)[0] : (Color)this.item.value;
/* 1031 */         boolean isDark = ((new HSLColor(color)).getLuminance() < 70.0F && color.getAlpha() >= 128);
/* 1032 */         this.valueColor = color;
/* 1033 */         setForeground(isDark ? Color.white : Color.black);
/* 1034 */       } else if (this.item.value instanceof Icon) {
/* 1035 */         Icon icon = (Icon)this.item.value;
/* 1036 */         setIcon(new FlatUIDefaultsInspector.SafeIcon(icon));
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1042 */       String toolTipText = (this.item.value instanceof Object[]) ? Arrays.toString((Object[])this.item.value).replace(", ", ",\n") : String.valueOf(this.item.value);
/* 1043 */       if (this.item.lafValue != null)
/*      */       {
/* 1045 */         toolTipText = toolTipText + "    \n\nLaF UI default value was overridden with UIManager.put(key,value):\n    " + FlatUIDefaultsInspector.Item.valueAsString(this.item.lafValue, null) + "\n    " + String.valueOf(this.item.lafValue);
/*      */       }
/* 1047 */       setToolTipText(toolTipText);
/*      */       
/* 1049 */       return this;
/*      */     }
/*      */ 
/*      */     
/*      */     protected void paintComponent(Graphics g) {
/* 1054 */       if (this.item.value instanceof Color)
/* 1055 */       { int width = getWidth();
/* 1056 */         int height = getHeight();
/* 1057 */         Color background = this.valueColor;
/*      */ 
/*      */         
/* 1060 */         fillRect(g, background, 0, 0, width, height);
/*      */         
/* 1062 */         if (this.item.info instanceof Color[]) {
/*      */           
/* 1064 */           int width2 = height * 2;
/* 1065 */           fillRect(g, ((Color[])this.item.info)[1], width - width2, 0, width2, height);
/*      */ 
/*      */           
/* 1068 */           Color defaultColor = (Color)this.item.value;
/* 1069 */           if (defaultColor != null && !defaultColor.equals(background)) {
/* 1070 */             int width3 = height / 2;
/* 1071 */             fillRect(g, defaultColor, width - width3, 0, width3, height);
/*      */           } 
/*      */ 
/*      */           
/* 1075 */           int width4 = height / 4;
/* 1076 */           g.setColor(Color.magenta);
/* 1077 */           g.fillRect(width - width4, 0, width4, height);
/*      */         } 
/*      */ 
/*      */         
/* 1081 */         FontMetrics fm = getFontMetrics(getFont());
/* 1082 */         String text = getText();
/* 1083 */         Rectangle textR = new Rectangle();
/* 1084 */         layoutLabel(fm, text, textR);
/* 1085 */         int x = textR.x;
/* 1086 */         int y = textR.y + fm.getAscent();
/*      */         
/* 1088 */         g.setColor(getForeground());
/*      */ 
/*      */         
/* 1091 */         int hslIndex = text.indexOf("HSL");
/* 1092 */         if (hslIndex > 0) {
/* 1093 */           String hexText = text.substring(0, hslIndex);
/* 1094 */           String hslText = text.substring(hslIndex);
/* 1095 */           int hexWidth = Math.max(fm.stringWidth(hexText), fm.stringWidth("#12345678  "));
/* 1096 */           FlatUIUtils.drawString(this, g, hexText, x, y);
/* 1097 */           FlatUIUtils.drawString(this, g, hslText, x + hexWidth, y);
/*      */         } else {
/* 1099 */           FlatUIUtils.drawString(this, g, text, x, y);
/*      */         }  }
/* 1101 */       else { super.paintComponent(g); }
/*      */       
/* 1103 */       paintSeparator(g);
/*      */     }
/*      */ 
/*      */     
/*      */     private void fillRect(Graphics g, Color color, int x, int y, int width, int height) {
/* 1108 */       if (color.getAlpha() != 255) {
/* 1109 */         g.setColor(Color.white);
/* 1110 */         g.fillRect(x, y, width, height);
/*      */       } 
/*      */       
/* 1113 */       g.setColor(color);
/* 1114 */       g.fillRect(x, y, width, height);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private static class SafeIcon
/*      */     implements Icon
/*      */   {
/*      */     private final Icon icon;
/*      */ 
/*      */     
/*      */     SafeIcon(Icon icon) {
/* 1126 */       this.icon = icon;
/*      */     }
/*      */ 
/*      */     
/*      */     public void paintIcon(Component c, Graphics g, int x, int y) {
/* 1131 */       int width = getIconWidth();
/* 1132 */       int height = getIconHeight();
/*      */       
/*      */       try {
/* 1135 */         g.setColor(UIManager.getColor("Panel.background"));
/* 1136 */         g.fillRect(x, y, width, height);
/*      */         
/* 1138 */         this.icon.paintIcon(c, g, x, y);
/* 1139 */       } catch (Exception ex) {
/* 1140 */         g.setColor(Color.red);
/* 1141 */         g.drawRect(x, y, width - 1, height - 1);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public int getIconWidth() {
/* 1147 */       return this.icon.getIconWidth();
/*      */     }
/*      */ 
/*      */     
/*      */     public int getIconHeight() {
/* 1152 */       return this.icon.getIconHeight();
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\extras\FlatUIDefaultsInspector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */