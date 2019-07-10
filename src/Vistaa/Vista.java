package Vistaa;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.sun.javafx.tk.Toolkit;
import com.sun.prism.paint.Color;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ScrollPaneConstants;

public class Vista extends JFrame {

	public JPanel contentPane;
	public JTextField JtextCodigoProducto;
	public JTable table;
	public JScrollPane scrollcompras;
	public JPanel panel_3;
	public JTable table_1;
	public JTable tablacompras;
	public JTabbedPane tabbedPane;
	public JPanel panel;
	public JButton btnProv1;
	public JButton btnProv2;
	public JButton btnProv3;
	public JButton btnProv4;
	public JPanel panelcompras;
	public JButton btnEliminarProducto;
	public JButton btnAgregarProducto;
	public JButton btnInformacion;
	public JButton btnBuscar;
	public JButton btnOptimizacion;
	public JButton btnMontoDisponible;
	public JTextField JtextDescripcionProducto;
	public Dimension dim;
	public JPanel panelOptimizar;
	public JPanel panelVerificacion;
	public JPanel panelAcercade;
	private JLabel lblMontoDisponible;
	private JTextField JtextIngresaMonto;
	private JPanel panelTablaOptimizada;
	private JTable tablaoptimizada;
		
	

	public Vista() {
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setAutoRequestFocus(false);
				setTitle("Best Buy");
				dim=super.getToolkit().getScreenSize();
				super.setSize(dim);
				setLocationRelativeTo(null);
		

				this.setIconImage(new ImageIcon(getClass().getResource("/XIconos/BestBuysoloicono.jpg")).getImage());
		
		
		
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(new BorderLayout(0, 0));

				tabbedPane = new JTabbedPane(JTabbedPane.TOP);
				getContentPane().add(tabbedPane);
				tabbedPane.setFont(new Font("Optimización",Font.BOLD|Font.ITALIC,15));
		
				panel = new JPanel();
				tabbedPane.addTab("Optimización", null, panel, null);
				panel.setLayout(null);
		
				JtextCodigoProducto = new JTextField();
				JtextCodigoProducto.setBounds(236, 38, 125, 20);
				panel.add(JtextCodigoProducto);
				JtextCodigoProducto.setColumns(10);
				
				
				panelcompras = new JPanel();
				panelcompras.setBounds(155, 154, 431, 281);
				panel.add(panelcompras);
				panelcompras.setLayout(null);
				
				panelTablaOptimizada = new JPanel();
				panelTablaOptimizada.setBounds(638, 154, 431, 281);
				panel.add(panelTablaOptimizada);
				panelTablaOptimizada.setLayout(null);
				
				
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("Codigo Producto");
				model.addColumn("Descripción");
				
				
				scrollcompras = new JScrollPane();
				scrollcompras.setBounds(0, 0, 431, 281);
				panelcompras.add(scrollcompras);
				scrollcompras.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
				
				tablacompras = new JTable();
				tablacompras.setBounds(6, 275, 421, -269);
				panelcompras.add(tablacompras);
				tablacompras.setModel(model);
				//tablacompras.setModel(model1);

				
				
				
				DefaultTableModel model1 = new DefaultTableModel();
				
				model1.addColumn("Codigo Producto");
				model1.addColumn("Descripción");
				
				JScrollPane scrollPaneOptimizada = new JScrollPane();
				scrollPaneOptimizada.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				scrollPaneOptimizada.setBounds(0, 0, 431, 281);
				panelTablaOptimizada.add(scrollPaneOptimizada);
				
				tablaoptimizada = new JTable();
				tablaoptimizada.setBounds(6, 275, 421, -269);
				panelTablaOptimizada.add(tablaoptimizada);
				tablaoptimizada.setModel(model1);
				
				model1.addColumn("Codigo Producto");
				model1.addColumn("Descripción");
	
				
				btnEliminarProducto = new JButton("");
				btnEliminarProducto.setIcon(new ImageIcon(Vista.class.getResource("/XIconos/borrar.png")));
				btnEliminarProducto.setBounds(572, 38, 76, 66);
				panel.add(btnEliminarProducto);
				
				btnAgregarProducto = new JButton("");
				btnAgregarProducto.setIcon(new ImageIcon(Vista.class.getResource("/XIconos/agregar.png")));
				btnAgregarProducto.setBounds(400, 38, 76, 66);
				panel.add(btnAgregarProducto);
				
				btnInformacion = new JButton("");
				btnInformacion.setIcon(new ImageIcon(Vista.class.getResource("/XIconos/info.png")));
				btnInformacion.setBounds(1182, 555, 76, 66);
				panel.add(btnInformacion);
				
				btnBuscar = new JButton("");
				btnBuscar.setIcon(new ImageIcon(Vista.class.getResource("/XIconos/buscar.png")));
				btnBuscar.setBounds(486, 38, 76, 66);
				panel.add(btnBuscar);
				
				btnMontoDisponible = new JButton("");
				btnMontoDisponible.setIcon(new ImageIcon(Vista.class.getResource("/XIconos/monto.png")));
				btnMontoDisponible.setBounds(1030, 38, 76, 66);
				panel.add(btnMontoDisponible);
				
				JtextDescripcionProducto = new JTextField();
				JtextDescripcionProducto.setColumns(10);
				JtextDescripcionProducto.setBounds(236, 84, 125, 20);
				panel.add(JtextDescripcionProducto);
				
				JPanel panelbtnProv = new JPanel();
				panelbtnProv.setBorder(new LineBorder(new java.awt.Color(255, 255, 0), 3));
				panelbtnProv.setBounds(1125, 108, 187, 412);
				panel.add(panelbtnProv);
				panelbtnProv.setLayout(null);
				
				btnProv1 = new JButton("");
				btnProv1.setBounds(47, 62, 97, 73);
				panelbtnProv.add(btnProv1);
				btnProv1.setIcon(new ImageIcon(Vista.class.getResource("/XIconos/prov1.png")));
				
				btnProv2 = new JButton("");
				btnProv2.setBounds(47, 146, 97, 73);
				panelbtnProv.add(btnProv2);
				btnProv2.setIcon(new ImageIcon(Vista.class.getResource("/XIconos/prov2.png")));
				
				btnProv3 = new JButton("");
				btnProv3.setBounds(47, 230, 97, 73);
				panelbtnProv.add(btnProv3);
				btnProv3.setIcon(new ImageIcon(Vista.class.getResource("/XIconos/prov3.png")));
				
				btnProv4 = new JButton("");
				btnProv4.setBounds(47, 314, 97, 73);
				panelbtnProv.add(btnProv4);
				btnProv4.setIcon(new ImageIcon(Vista.class.getResource("/XIconos/prov4.png")));
				
				JLabel lblNewLabel_1 = new JLabel("<html><body>Actualizar Productos <br>    de Proveedores: </body></html>");
				lblNewLabel_1.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 15));
				lblNewLabel_1.setBounds(20, 11, 157, 40);
				panelbtnProv.add(lblNewLabel_1);
				
				panelOptimizar = new JPanel();
				panelOptimizar.setBorder(new LineBorder(java.awt.Color.RED, 3));
				panelOptimizar.setBounds(541, 477, 159, 152);
				panel.add(panelOptimizar);
				panelOptimizar.setLayout(null);
				
				btnOptimizacion = new JButton("");
				btnOptimizacion.setBounds(22, 48, 119, 93);
				panelOptimizar.add(btnOptimizacion);
				btnOptimizacion.setIcon(new ImageIcon(Vista.class.getResource("/XIconos/optimizar.png")));
				
				JLabel lblNewLabel = new JLabel("<html><body>Realizar <br> Optimizaci\u00F3n: </body></html>");
				lblNewLabel.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 15));
				lblNewLabel.setBounds(22, 11, 119, 36);
				panelOptimizar.add(lblNewLabel);
				
				JLabel lblCodigoProducto = new JLabel("Ingrese C\u00F3digo de Producto:");
				lblCodigoProducto.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 15));
				lblCodigoProducto.setBounds(10, 41, 216, 17);
				panel.add(lblCodigoProducto);
				
				JLabel lblDescripciondeProducto = new JLabel("Descripci\u00F3n del Produto:");
				lblDescripciondeProducto.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 15));
				lblDescripciondeProducto.setBounds(40, 89, 191, 15);
				panel.add(lblDescripciondeProducto);
				
				JLabel lblIconoBestBuy = new JLabel("");
				lblIconoBestBuy.setIcon(new ImageIcon(Vista.class.getResource("/XIconos/BestBuy.jpg")));
				lblIconoBestBuy.setBounds(22, 538, 167, 83);
				panel.add(lblIconoBestBuy);
				
				lblMontoDisponible = new JLabel("Ingrese Monto Disponible:\r\n");
				lblMontoDisponible.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 15));
				lblMontoDisponible.setBounds(696, 60, 199, 20);
				panel.add(lblMontoDisponible);
				
				JtextIngresaMonto = new JTextField();
				JtextIngresaMonto.setColumns(10);
				JtextIngresaMonto.setBounds(895, 61, 125, 20);
				panel.add(JtextIngresaMonto);
				
		
				panelVerificacion = new JPanel();
				tabbedPane.addTab("Verficación", null, panelVerificacion, null);
		
				panelAcercade = new JPanel();
				tabbedPane.addTab("Acerca de", null, panelAcercade, null);
		
		
		

				
		 
				
			
	}
}
