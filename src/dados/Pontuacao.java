package dados;

import java.util.ArrayList;

public class Pontuacao {
	ArrayList<Integer> numResp = new ArrayList<Integer>();
	double pontuacao;
	int n = 0;
	
	public Pontuacao(){
		this.pontuacao = 0;
	}
	
	public void zeraPontuacao(){
		pontuacao = 0;
	}
	
	public void pont(double valor){
		this.pontuacao += valor;
	}
	
	public double valorTotal(){
		return pontuacao;
	}
	
	public void zeraQuestao(){
		n = 0;
	}
	
	public void setQuestaoRespondida(){
		n += 1;
	}
	
	public void setTiraQuestaoResp(){
		n -= 1;
	}
	
	public int getQuestaoRespondida(){
		return n;
	}
	
	public void setPerg(int numQuest){
		numResp.add(numQuest);
	}
	
	public void setDelPerg(int numQuest){
		int indice = 0;
		for(int i = 0; i < numResp.size(); i++){
			if(numResp.get(i) == numQuest){
				indice = i;
			}
		}
		numResp.remove(indice);
	}
	
	public void delPerg(){
		numResp.removeAll(numResp);
	}
	
	public ArrayList<Integer> getPerg(){
		return numResp;
	}
}
