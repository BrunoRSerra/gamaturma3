package agendadentista;

public class Agenda {
	String nomePaciente;
	String horaConsulta;
	String nomeMedico;
	int dia;
	boolean confirmada;
	String nomeProcedimento;
	int quantidadeDeProcedimentos;
	
	void data() {
		if(dia>=1 && dia <31) {
			System.out.println("O dia da sua consutal esta marcado p/: "+dia);
		}else {
			System.out.println("A data esta incorreta ");
		}
	}
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
			System.out.println("Ainda não esta confirmada");
		}
		
	}
	
	void horaAgendamento() {
		this.agendado();
	}
	void procedimento() {
		if(this.quantidadeDeProcedimentos>=0 && this.quantidadeDeProcedimentos<=2) {
		System.out.println("Esta é sua primeia consulta ");
		}else {
		System.out.println("Você já é paciente");	
		}
	}
	void cancelada() {
		if(this.confirmada==false) {
			System.out.println("Sua consulta foi cancelada");
		
	}

}
	}
