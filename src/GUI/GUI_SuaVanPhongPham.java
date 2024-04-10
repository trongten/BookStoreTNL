package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import Others.MyButton;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JToolBar;
import javax.swing.JComboBox;


public class GUI_SuaVanPhongPham {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private MyButton btnChonAnh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_SuaVanPhongPham window = new GUI_SuaVanPhongPham();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_SuaVanPhongPham() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 899, 601);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		

		JLabel lblThemSP = new JLabel("SỬA THÔNG TIN VĂN PHÒNG PHẨM");
		lblThemSP.setForeground(new Color(0, 0, 128));
		lblThemSP.setHorizontalAlignment(SwingConstants.CENTER);
		lblThemSP.setFont(new Font("Cambria Math", Font.BOLD, 37));
		frame.getContentPane().add(lblThemSP, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnThemSP = new JButton("Thêm");
		btnThemSP.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		btnThemSP.setBounds(550, 402, 140, 40);
		panel.add(btnThemSP);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		btnThoat.setBounds(700, 402, 140, 40);
		panel.add(btnThoat);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(325, 57, 515, 340);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 15, 30));
		
		JLabel lblTenSP = new JLabel("Tên sản phẩm:");
		lblTenSP.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTenSP.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_1.add(lblTenSP);
		
		textField = new JTextField();
		textField.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		textField.setColumns(10);
		panel_1.add(textField);
		
		JLabel lblNCC = new JLabel("Nhà cung cấp:");
		lblNCC.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNCC.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_1.add(lblNCC);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		textField_1.setColumns(10);
		panel_1.add(textField_1);
		
		JLabel lblXutX = new JLabel("Xuất xứ:");
		lblXutX.setHorizontalAlignment(SwingConstants.RIGHT);
		lblXutX.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_1.add(lblXutX);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		textField_2.setColumns(10);
		panel_1.add(textField_2);
		
		JLabel lblChatlieu = new JLabel("Chất liệu:");
		lblChatlieu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChatlieu.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_1.add(lblChatlieu);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		textField_3.setColumns(10);
		panel_1.add(textField_3);
		
		JLabel lblGiaDonVi = new JLabel("Giá đơn vị:");
		lblGiaDonVi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGiaDonVi.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_1.add(lblGiaDonVi);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		textField_4.setColumns(10);
		panel_1.add(textField_4);
		
		JLabel lblGianhap = new JLabel("Giá nhập:");
		lblGianhap.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGianhap.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		panel_1.add(lblGianhap);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		textField_5.setColumns(10);
		panel_1.add(textField_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBounds(30, 322, 250, 75);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 15));
		
		JLabel lblAnhSanPham = new JLabel("");
		
		JLabel label = new JLabel("");
		panel_2.add(label);
		
		btnChonAnh = new MyButton("Chọn ảnh sp:");
		btnChonAnh.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnChonAnh) {
					JFileChooser chooser = new JFileChooser(new File(System.getProperty("user.home") + "\\Downloads")); // Downloads
																														// Directory
																														// as
																														// default
					chooser.setDialogTitle("Chọn ảnh");
					chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
					//FileDialog f = new FileDialog();
					chooser.setAcceptAllFileFilterUsed(true);
					FileNameExtensionFilter filter = new FileNameExtensionFilter("Ảnh sản phẩm (*.jpg,*.png,*.jpeg,*.gif)", "jpg","png","jpeg","gif");
					chooser.setFileFilter(filter);
					if (chooser.showOpenDialog(btnChonAnh) == JFileChooser.APPROVE_OPTION) {
						String fileID = chooser.getSelectedFile().getPath();//đường dẫn file ở đây
						lblAnhSanPham.setIcon(new ImageIcon(fileID));
					}
				}
			}
		});
	
		panel_2.add(btnChonAnh);
		btnChonAnh.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		
		JLabel lblSoLuong_1 = new JLabel("Số lượng:");
		panel_2.add(lblSoLuong_1);
		lblSoLuong_1.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		
		textField_6 = new JTextField();
		panel_2.add(textField_6);
		textField_6.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		textField_6.setColumns(10);
		
		
		lblAnhSanPham.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblAnhSanPham.setBounds(30, 57, 250, 250);
		panel.add(lblAnhSanPham);

	}
}
