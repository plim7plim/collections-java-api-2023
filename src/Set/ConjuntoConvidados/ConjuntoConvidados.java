package SetInterface;
import java.util.HashSet;
import  java.util.Set;
public class ConjuntoConvidados {
  private Set<Convidados>convidadosSet;


    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

   public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidados(nome, codigoConvite));
   }

   public void removerConvidadosPorCodigoConvite(int codigoConvite){
        Convidados convidadoParaRemover = null;
        for (Convidados c : convidadosSet){
            if (c.getCodigoConvite() ==codigoConvite){
                break;
            }
        } convidadosSet.remove(convidadoParaRemover);
   }



   public int contarConvidados(){
        return convidadosSet.size();
   }
   public void exibirConvidados(){
       System.out.println(convidadosSet);
   }




}
