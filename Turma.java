package faeterj;

public class Turma {
	private int id;
	private int idDisciplina;
	private String turno;
	private int idProfessor;
	private String semestre;
	
	public Turma(String turno, String semestre){
		this.turno = turno;
		this.semestre = semestre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdDisciplina() {
		return idDisciplina;
	}
	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public int getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
}
