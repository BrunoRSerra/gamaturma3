package agendadentista;

public class Agenda {
	String nomePaciente;
	String horaConsulta;
	String nomeMedico;
	boolean confirmada;
	String nomeProcedimento;
	int quantidadeDeProcedimentos;
	
	void mostrarAgenda() {
		System.out.println("Paciente: "+this.nomePaciente);
		System.out.println("Hora: "+this.horaConsulta);
		System.out.println("Dentista: "+this.nomeMedico);
		System.out.println("Prcedimento "+this.nomeProcedimento);
		System.out.println("Quantidade "+this.quantidadeDeProcedimentos);
		
	}
	
	void agendado() {
		if(this.confirmada==true) {
			System.out.println("Consulta confirmada ");
		}else {
			System.out.println("Ainda n�o esta confirmada");
		}
		
	}
	
	void horaAgendamento() {
		this.agendado();
	}
	void procedimento() {
		if(this.quantidadeDeProcedimentos>=0 && this.quantidadeDeProcedimentos<=2) {
		System.out.println("Esta � sua primeia consulta ");
		}else {
		System.out.println("Voc� j� � paciente");	
		}
	}
	void cancelada() {
		if(this.confirmada==false) {
			System.out.println("Sua consulta foi cancelada");
		
	}

}
	}
