package jdbc.score.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JPanel northPanel;
	private JPanel centerPanel;
	private JPanel southPanel;
	
	private JTextField tfIdx;
	private JTextField tfName;
	private JTextField tfKor;
	private JTextField tfEng;
	private JTextField tfMat;
	
	private JButton btnInsert;
	private JButton btnSearch;
	private JButton btnUpdate;
	private JButton btnDelete;
	
	public MainFrame() {
		initUI();
	}
	
	private void initUI() {
		setTitle("성적관리 프로그램");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createPanel();
		createComponent();
		addComponent();
		event();
		setVisible(true);
	}

	private void createPanel() {
		northPanel = new JPanel();
		centerPanel = new JPanel();
		southPanel = new JPanel();
		
		add(northPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
	}
	
	private void createComponent() {
		tfIdx = new JTextField(5);
		tfName = new JTextField(10);
		tfKor = new JTextField(5);
		tfEng = new JTextField(5);
		tfMat = new JTextField(5);
		
		btnInsert = new JButton("등록");
		btnSearch = new JButton("조회");
		btnUpdate = new JButton("수정");
		btnDelete = new JButton("삭제");
	}
	
	private void addComponent() {
		northPanel.add(new JLabel("번호"));
		northPanel.add(tfIdx);
		northPanel.add(new JLabel("이름"));
		northPanel.add(tfName);
		northPanel.add(new JLabel("국어"));
		northPanel.add(tfKor);
		northPanel.add(new JLabel("영어"));
		northPanel.add(tfEng);
		northPanel.add(new JLabel("수학"));
		northPanel.add(tfMat);
		
		southPanel.add(btnInsert);
		southPanel.add(btnSearch);
		southPanel.add(btnUpdate);
		southPanel.add(btnDelete);
	}
	
	private void event() {
		
	}
}
