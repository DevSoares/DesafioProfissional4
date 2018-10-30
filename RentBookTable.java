package desafioprofissional.java;

import javax.swing.JTable;
import javax.swing.table.*;

//classe da tabela de empréstimos
public class RentBookTable {
	JTable rentBookTable = new JTable(new DefaultTableModel(new Object[] {"RentID", "ClientID", "BookID","StartDate","EndDate"}, 0));
	
//método para adicionar um novo registro de cliente da tabela
		public void addRow(String rentID, String clientID, String bookID, String startDate, String endDate) {
			DefaultTableModel model = (DefaultTableModel) rentBookTable.getModel();
			model.addRow(new Object [] {rentID,clientID,bookID,startDate,endDate});
		}
//método para remover um registro de cliente da tabela
		public void removeRow(int rowID) {
			DefaultTableModel model = (DefaultTableModel) rentBookTable.getModel();
			model.removeRow(rowID);
		}
//método para editar um registro de cliente da tabela	
		public void editRow(String rentID, String clientID, String bookID, String startDate, String endDate) {
			DefaultTableModel model = (DefaultTableModel) rentBookTable.getModel();
			model.removeRow(Integer.parseInt(rentID)-1);
			model.insertRow(Integer.parseInt(rentID)-1, new Object [] {rentID,clientID,bookID,startDate,endDate});
		}
}
