package com.MAVENECLIPSEATP52.ATP52.view;

import java.util.function.Consumer;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Container;

import com.MAVENECLIPSEATP52.ATP52.dao.CategoriaDao;
import com.MAVENECLIPSEATP52.ATP52.model.Categoria;

public class View extends JFrame{
	
	private CategoriaDao dao;
	private Container container;
	private JLabel lbNome;
    private JTextField txtNome;
    private JButton btnSalvar, btnDelete, btnUpdate;
    private JTable table;
    private DefaultTableModel tableModel;
	
	
	public View(){
		super("Categorias");
        setLayout(null);
       
        inicializarComponentes();
        posicionamento();

        adicionarEventos();

        ler();
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
	
	}
	private void inicializarComponentes() {
		dao = new CategoriaDao();
		container = new Container();
		lbNome = new JLabel("Nome");
		txtNome = new JTextField();
		btnSalvar = new JButton("Salvar");
		btnDelete = new JButton("Deletar");
		btnUpdate = new JButton("Alterar");
		table = new JTable();
		tableModel.addColumn("Id");
		tableModel.addColumn("Nome");
	}
	private void posicionamento() {
		lbNome.setBounds(10,10,50,20);
		txtNome.setBounds(70,10,250,20);
		btnSalvar.setBounds(10,40,100,20);
		table.setBounds(10,80,100,20);
		btnDelete.setBounds(10,400,100,20);
		btnUpdate.setBounds(115,400,100,20);
		
		container.add(lbNome);
		container.add(txtNome);
		container.add(btnSalvar);
		container.add(table);
		container.add(btnDelete);
		container.add(btnUpdate);
	}
	private void adicionarEventos() {
		btnSalvar.addActionListener( new ActionListene(){   
			@Override
			public void actionPerfomed(ActionEvent e) {
				int id = (int)table.getValueAt(table.getSelectedRow(),0);
				Categoria model = new Categoria();
				model.setId(id);
				delete(model);
			}
		});
		btnUpdate.addActionListener( new ActionListene(){            
            @Override
            public void actionPerformed(Action e) {               
               int id = (int)table.getValueAt(table.getSelectedRow(), 0);
               String nome = (String)table.getValueAt(table.getSelectedRow(), 1);
               Categoria model = new Categoria();
               model.setId(id);
               model.setNome(nome);
               alterar(model);               
            }
        });
	}
	 private void salvar(Categoria model){
	        dao.insert(model);
	        JOptionPane.showMessageDialog(container, "Categoria:"+model.getNome()+ " Salva com sucesso!" ); 
	        ler();
	    }

	    private void ler(){
	        tableModel.setRowCount(0);
	        for (Categoria c : dao.read()) {
	            tableModel.addRow(new Object[]{c.getId(), c.getNome()});
	        }
	    }
	    private void delete(Categoria model){
	        dao.delete(model);
	        JOptionPane.showMessageDialog(container, "Categoria de id: "+model.getId() +" Deletada com sucesso!" );        
	        ler();
	    }
	    private void alterar(Categoria model) {
	        dao.update(model);
	        JOptionPane.showMessageDialog(container, "Categoria de id: "+model.getId() +" Alterada com sucesso!" );        
	        ler();
	    }

}
