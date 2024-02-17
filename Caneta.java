/**
 * @author alair
 */

public class Caneta {

 public Caneta(String zul, String redonda, String quadrada) {
 }

 public static void main(String[] args) {

  Caneta minhaCaneta = new Caneta("zul","redonda","quadrada");
          minhaCaneta.informacao();
          minhaCaneta.aberta();
          minhaCaneta.tampada();
 }

 //Propriedades da caneta
private String cor;

private String modelo;

private String tampa;

 //Pripriedade para monta a caneta

 public String getCor() {
  return cor;
 }

 public void setCor(String cor) {
  this.cor = cor;
 }

 public String getModelo() {
  return modelo;
 }

 public void setModelo(String modelo) {
  this.modelo = modelo;
 }

 public String getTampa() {
  return tampa;
 }

 public void setTampa(String tampa) {
  this.tampa = tampa;
 }

 //Metodo caneta aberta
 public  void aberta () {
  System.out.println("caneta esta aberta");

 }
//metodo caneta tampada
public void tampada() {
  System.out.println("caneta tampada");
}

//Informacao do produto
public void informacao() {
 System.out.println("redonda");
 System.out.println("azul");
 System.out.println("quadrada");

}
}



