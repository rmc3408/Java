package Database;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.sql.*;

public class FinalTest
{

	public static void main(String[] args)
	{
		
		GUI myGUI = new GUI();
		myGUI.create();

	}

}

class GUI extends JFrame
{
	
	private static final long serialVersionUID = 1L;
	private static final JButton     _create       = new JButton("Create");
	private static final JButton     _delete       = new JButton("Delete");
	private static final JPanel      _panelOne     = new JPanel();
	private static final JPanel      _panelTwo     = new JPanel();
	private static final JPanel      _panelThree   = new JPanel();
	private static final JPanel      _panelFour    = new JPanel();
	private static final JLabel      _title        = new JLabel("Select students by city:");
	private static final JTextField  _inputTextBox = new JTextField();
	private static final JButton     _display      = new JButton("Display");
	private static final JTextArea   _displayArea  = new JTextArea(20,500);
	private static final JScrollPane _dispScroll   = new JScrollPane(_displayArea);
	
	public void create()
	{
		JFrame frame = new JFrame();
		frame.setSize(700,200);
		_displayArea.setEditable(false);
		_dispScroll.setSize(new Dimension(20,500));
		_dispScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		_panelOne.setLayout(new GridLayout(2,1));
		_panelTwo.setLayout(new GridLayout(2,2));
		_panelThree.setLayout(new FlowLayout());
		_panelFour.setLayout(new GridLayout(1,2));
		_panelFour.add(_create);
		_panelFour.add(_delete);
		_panelTwo.add(_title);
		_panelTwo.add(_inputTextBox);
		_panelTwo.add(_panelFour);
		_panelTwo.add(_display);
		_panelOne.add(_panelTwo);
		_panelOne.add(_displayArea);
		
		CreateButtonHandler createBtnHandler = new CreateButtonHandler();
		DeleteButtonHandler deleteBtnHandler = new DeleteButtonHandler();
		DisplayButtonHandler displayBtnHandler = new DisplayButtonHandler();
		_display.addActionListener(displayBtnHandler);
		_create.addActionListener(createBtnHandler);
		_delete.addActionListener(deleteBtnHandler);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.add(_panelOne);
		frame.setVisible(true);
	}
	
	public Connection connect(String user, String password)
	{
		Connection c = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Change if required
			c = DriverManager.getConnection("jdbc:oracle:thin:@199.212.26.208:1521:SQLD", user, password);
			//jdbc:oracle:thin:@<servername>:<port(1521)>:<databasename>, user, password
		}
		catch(ClassNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return c;
	}
	
	public void disconnect(Connection c)
	{
		try
		{
			if(c != null)
				c.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public void createTable(Connection c)

	{
		try
		{
			int n;
			Statement st = c.createStatement();
			String selectStatement = "SELECT * FROM Students";
			try
			{
				ResultSet rs = st.executeQuery(selectStatement);
			}
			catch(SQLException sqle)
			{
				//if ORA-00942 error, the table does not exist; create the table
				if(sqle.getMessage().indexOf("ORA-00942") != -1)
				{
					String create = "CREATE TABLE Students ("
							+ "studentID varchar2(9) NOT NULL, "
							+ "firstName varchar2 (20) NOT NULL, "
							+ "lastName varchar2 (20) NOT NULL, "
							+ "address varchar2 (30) NOT NULL, "
							+ "city varchar2(30) NOT NULL, "
							+ "province varchar2(2) NOT NULL, "
							+ "postalCode varchar2(6) NOT NULL, "
							+ "CONSTRAINT stud_pk PRIMARY KEY (studentID)"
							+ ")";
					n = st.executeUpdate(create);
				}
			}
			n = st.executeUpdate("insert into Students values('300111222','Sam', 'Malone', '10 Somewhere Road', 'Toronto','ON','M1Y1H2')");
			n = st.executeUpdate("insert into Students values('300111223','Karl', 'Malone', '10 Somewhere Road', 'Toronto','ON','M2T3H4')");
			n = st.executeUpdate("insert into Students values('300111224','Moses', 'Malone', '10 Somewhere Road', 'Whitby','ON','M3Y5H6')");
			n = st.executeUpdate("insert into Students values('300111225','Michael', 'Malone', '10 Somewhere Road', 'Hamilton','ON','M4Y7H8')");
			n = st.executeUpdate("insert into Students values('300111226','Bert', 'Malone', '10 Somewhere Road', 'Montreal','ON','M5Y9H0')");
			n = st.executeUpdate("insert into Students values('300111227','Frank', 'Malone', '10 Somewhere Road', 'Montreal','ON','M6Y0H1')");
			
			ResultSet rs = st.executeQuery(selectStatement);
			ResultSetMetaData md = rs.getMetaData();
			int row = 0;
			String info = "";
			while(rs.next())
			{
				for(int i = 1; i <= md.getColumnCount(); i++)
				{
					info += rs.getString(i) + "\t";
				}
				info += "\n";
				row += 1;
			}
			//_displayArea.setText(info);
			_displayArea.setText("Students table created!");
			rs.close();
		}
		catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public void deleteTable(Connection c)
	{
		try
		{
			int n;
			Statement st = c.createStatement();
			String drop = "DROP TABLE Students";
			n = st.executeUpdate(drop);
			_displayArea.setText("Table STUDENTS has been dropped successfully!");
		}
		catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void searchTable(Connection c)
	{
		PreparedStatement searchStatement = null;
		String searchQuery = "SELECT * FROM STUDENTS WHERE CITY = ?";
		try 
		{
			c.setAutoCommit(false);
			searchStatement = c.prepareStatement(searchQuery);
			searchStatement.setString(1, _inputTextBox.getText());
			ResultSet rs = searchStatement.executeQuery();
			ResultSetMetaData md = rs.getMetaData();
			int row = 0;
			String info = "";
			while(rs.next())
			{
				for(int i = 1; i <= md.getColumnCount(); i++)
				{
					info += rs.getString(i) + "\t";
				}
				info += "\n";
				row += 1;
			}
			
			_displayArea.setText(info);
			c.commit();
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	private class CreateButtonHandler implements ActionListener 
	{		
		public void actionPerformed(ActionEvent e)
		{
			String user = "COMP214_M20_zor_63";
			String password = "password";
			
			Connection c = null;
			try
			{
				c = connect(user, password);
				if(c != null)
					createTable(c);
			}
			finally
			{
				disconnect(c);
			}
		}		
	}
	
	private class DeleteButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String user = "COMP214_M20_zor_63";
			String password = "password";
			Connection c =null;
			try
			{
				c = connect(user, password);
				if(c != null)
					deleteTable(c);
			}
			finally
			{
				disconnect(c);
			}
		}
	}
	
	private class DisplayButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String user = "COMP214_M20_zor_63";
			String password = "password";
			Connection c =null;
			try
			{
				c = connect(user, password);
				if(c != null)
					searchTable(c);
			}
			finally
			{
				disconnect(c);
			}
		}
	}
}

