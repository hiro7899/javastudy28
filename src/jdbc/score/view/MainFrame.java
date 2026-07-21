package jdbc.score.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import jdbc.score.ScoreDAO;
import jdbc.score.ScoreDTO;

public class MainFrame extends JFrame {
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

	private JTable table;
	private DefaultTableModel model;
	private JScrollPane scrollPane;

	private ScoreDAO dao;

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
		loadTable();
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
		tfIdx.setEditable(false);
		
		tfName = new JTextField(10);
		tfKor = new JTextField(5);
		tfEng = new JTextField(5);
		tfMat = new JTextField(5);

		btnInsert = new JButton("등록");
		btnSearch = new JButton("조회");
		btnUpdate = new JButton("수정");
		btnDelete = new JButton("삭제");

		dao = new ScoreDAO();

		String[] columnNames = { "학번", "이름", "국어", "영어", "수학", "총점", "평균", "학점" };

		//테이블을 읽기 전용으로 하기 위해 오버라이드 함
		model = new DefaultTableModel(columnNames, 0) {
	        private static final long serialVersionUID = 1L;

	        @Override
	        public boolean isCellEditable(int row, int column) {
	            return false; // 모든 셀을 읽기 전용으로 설정
	        }
	    };
	    
		table = new JTable(model);
		scrollPane = new JScrollPane(table);
	}

	private void addComponent() {
		northPanel.add(new JLabel("번호"));
		northPanel.add(tfIdx);
		tfIdx.setText(String.valueOf(dao.countIdx()));
		northPanel.add(new JLabel("이름"));
		northPanel.add(tfName);
		northPanel.add(new JLabel("국어"));
		northPanel.add(tfKor);
		northPanel.add(new JLabel("영어"));
		northPanel.add(tfEng);
		northPanel.add(new JLabel("수학"));
		northPanel.add(tfMat);

		centerPanel.setLayout(new BorderLayout());
		centerPanel.add(scrollPane);

		southPanel.add(btnInsert);
		southPanel.add(btnSearch);
		southPanel.add(btnUpdate);
		southPanel.add(btnDelete);
	}

	private void event() {
		btnInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("btnInsert clicked");
				dao.getCount();
				ScoreDTO dto = getInputData();
				boolean result = dao.setInsert(dto);
				if (result) {
					JOptionPane.showMessageDialog(null, "저장되었습니다");
					clarInput();
					loadTable();
				} else {
					JOptionPane.showMessageDialog(null, "저장실패");
				}
			}
		});

		table.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// 클릭한 행 번호 얻기
				int row = table.getSelectedRow();
				//번호
				tfIdx.setText(table.getValueAt(row, 0).toString());
				//이름
				tfName.setText(table.getValueAt(row, 1).toString());
				//국어
				tfKor.setText(table.getValueAt(row, 2).toString());
				//영어
				tfEng.setText(table.getValueAt(row, 3).toString());
				//수학
				tfMat.setText(table.getValueAt(row, 4).toString());
			}
		});
		
		btnUpdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ScoreDTO dto = getInputData();
				boolean result = dao.getUpdate(dto);
				
				if (result) {
					JOptionPane.showMessageDialog(null, "수정되었습니다");
					clarInput();
					loadTable();
				} else {
					JOptionPane.showMessageDialog(null, "수정실패");
				}
			}
		});
	}

	private ScoreDTO getInputData() {
		int idx = Integer.parseInt(tfIdx.getText());
		String name = tfName.getText();
		int kor = Integer.parseInt(tfKor.getText());
		int eng = Integer.parseInt(tfEng.getText());
		int mat = Integer.parseInt(tfMat.getText());

		ScoreDTO dto = new ScoreDTO();
		dto.setIdx(idx);
		dto.setName(name);
		dto.setKor(kor);
		dto.setEng(eng);
		dto.setMat(mat);

		return dto;
	}

	private void loadTable() {
		model.setRowCount(0);// 기존 데이터 삭제
		List<ScoreDTO> list = dao.getOracle();
		for (ScoreDTO dto : list) {
			model.addRow(new Object[] { dto.getIdx(), dto.getName(), dto.getKor(), dto.getEng(), dto.getMat(),
					dto.getTot(), dto.getAve(), dto.getGrade() });
		}
	}

	public void clarInput() {
		tfIdx.setText(String.valueOf(dao.countIdx()));
		tfName.setText("");
		tfKor.setText("");
		tfEng.setText("");
		tfMat.setText("");
		tfName.requestFocus();
	}

}
