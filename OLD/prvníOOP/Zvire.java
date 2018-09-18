/*******************************************************************************
 * Instance třídy {@code Zvire} představují ...
 *
 * @author    jméno autora
 * @version   0.00.000
 */
public class Zvire
{
   private String druhZvirete;
   private int rokNarozeni;
   private String jmeno;
   private String zvuk;
   private float hmotnost;

   /***************************************************************************
     *konstruktor
     */
    public Zvire(String druhZvirete, int rokNarozeni, String jmeno, String zvuk, float hmotnost)
    {
        this.druhZvirete= druhZvirete;
        this.rokNarozeni=rokNarozeni;
        this.jmeno=jmeno;
        this.zvuk=zvuk;
        this.hmotnost=hmotnost;
    }
   public int vek(int aktualniRok){
    return aktualniRok - this.rokNarozeni;
    }
  public void ozviSe(){
    System.out.println(this.zvuk);
}
 public void zeru(float hmotnostZradla){
     this.hmotnost += hmotnostZradla;
    }
    public String getJmeno(){
    return this.jmeno;
}
}
