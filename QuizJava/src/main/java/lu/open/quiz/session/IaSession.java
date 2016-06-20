package lu.open.quiz.session;

import java.io.Serializable;

public class IaSession implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String nomCandidat;
	
	private String prenomCandidat;
	
	private double  scoreCandidat;

	public String getNomCandidat() {
		return nomCandidat;
	}

	public void setNomCandidat(String nomCandidat) {
		this.nomCandidat = nomCandidat;
	}

	public String getPrenomCandidat() {
		return prenomCandidat;
	}

	public void setPrenomCandidat(String prenomCandidat) {
		this.prenomCandidat = prenomCandidat;
	}

	public double getScoreCandidat() {
		return scoreCandidat;
	}

	public void setScoreCandidat(double scoreCandidat) {
		this.scoreCandidat = scoreCandidat;
	}

}
