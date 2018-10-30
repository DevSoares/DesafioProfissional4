package desafioprofissional.java;

import javax.swing.JTable;
import javax.swing.table.*;

//classe da tabela  de clientes
public class TableClient {
	JTable clientTable = new JTable(new DefaultTableModel(new Object[] {"ClientID", "ClientName", "ClientLastName","QtdExemplar"}, 0));
	
//método para adicionar um novo registro de cliente da tabela
	public void addRow(String clientID, String clientName, String clientLastName, String qtdExemplar) {
		DefaultTableModel model = (DefaultTableModel) clientTable.getModel();
		model.addRow(new Object [] {clientID,clientName,clientLastName,qtdExemplar});
	}
//método para remover um registro de cliente da tabela
	public void removeRow(int rowID) {
		DefaultTableModel model = (DefaultTableModel) clientTable.getModel();
		model.removeRow(rowID);
	}
//método para editar um registro de cliente da tabela	
	public void editRow(String clientID, String clientName, String clientLastName, String qtdExemplar) {
		DefaultTableModel model = (DefaultTableModel) clientTable.getModel();
		model.removeRow(Integer.parseInt(clientID)-1);
		model.insertRow(Integer.parseInt(clientID)-1, new Object [] {clientID,clientName,clientLastName,qtdExemplar});
	}
}

