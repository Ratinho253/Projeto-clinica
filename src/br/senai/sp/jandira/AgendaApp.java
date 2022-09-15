package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;

public class AgendaApp {

	public static void main(String[] args) {
		
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		especialidade.setDecricao(" O Cardiologista é aquele que cuida da saúde do coração."
				+ " Assim,\n os médicos que atuam nessa área são responsáveis pela consulta,\n diagnóstico,"
				+ " tratamento de doenças e disfunções ligadas ao sistema cardiovascular.");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("otorrinolaringologista");
		especialidade2.setDecricao("É importante se consultar com otorrinolaringologista quando ocorrem dores\n e incômodos nos "
				+ "ouvidos, nariz ou na garganta.\nEssa especialidade médica é capaz de promover um diagnóstico "
				+ "assertivo e\n indicar o tratamento adequado ao caso");
		
		JOptionPane.showMessageDialog(null, especialidade2.getNome());
		JOptionPane.showMessageDialog(null, especialidade2.getDescricao());
		
		JOptionPane.showMessageDialog(null, especialidade.getNome());
		JOptionPane.showMessageDialog(null, especialidade.getDescricao());
		
		

	}

}
