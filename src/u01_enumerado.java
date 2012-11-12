public class u01_enumerado{
  public enum m {enero, febrero, marzo, abril, mayo, junio, julio, 
                agosto, septiembre, octubre, noviembre, diciembre};
  public static void main(String[] args){
    m mes = m.marzo;
    System.out.println("La variable enumerada m tiene el valor: "+mes);
  }
}