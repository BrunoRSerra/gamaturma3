package agendadentista;

public class ApiAgendarConsulta {

	public static void main(String[] args) {
		
		Agenda p1 = new Agenda();
		p1.confirmada= true;
		p1.horaConsulta="12h30";
		p1.nomePaciente="Bruno";
		p1.nomeMedico="Doutor Pedro";
		p1.nomeProcedimento="Extração";
		p1.quantidadeDeProcedimentos=1;
		
		p1.cancelada();
		p1.procedimento();
		p1.mostrarAgenda();
				
	}

}
