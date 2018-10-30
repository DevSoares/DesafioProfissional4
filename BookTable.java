package desafioprofissional.java;

import javax.swing.JTable;
import javax.swing.table.*;

//classe da tabela de livros
public class BookTable {
	JTable bookTable = new JTable(new DefaultTableModel(new Object[] {"LivroID", "BookName", "AuthorName","Classification","QtdExemplar"}, 0));
	
//método para adicionar um novo registro de livro da tabela
		public void addRow(String bookID, String bookName, String authorName, String classification, String qtdExemplar) {
			DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
			model.addRow(new Object [] {bookID,bookName,authorName,classification,qtdExemplar});
		}
//método para remover um registro de livro da tabela
		public void removeRow(int rowID) {
			DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
			model.removeRow(rowID);
		}
//método para editar um registro de livro da tabela
		public void editRow(String bookID, String bookName, String authorName, String classification, String qtdExemplar) {
			DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
			model.removeRow(Integer.parseInt(bookID)-1);
			model.insertRow(Integer.parseInt(bookID)-1, new Object [] {bookID,bookName,authorName,classification,qtdExemplar});
		}
}
