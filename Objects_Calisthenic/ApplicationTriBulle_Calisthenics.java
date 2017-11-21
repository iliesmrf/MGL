import java.util.logging.Logger;

class  ApplicationTriBulle_Calisthenics
{
  static Integer [] table = new Integer[10];  // le tableau à trier en attribut
  static Integer i;

  static Logger print = Logger.getLogger("print");

  static void TriBulle() {
    Integer n = table.length-1;

    for (i = n; i >= 1; i--)
      TestElements(table);
  }

  private static void TestElements(Integer [] table){
    for (Integer j = 2; j <= i ;j ++)
      TestElement(table,j);
  }

  private static void TestElement(Integer [] table, Integer index){
    if (table[index - 1] > table[index]){
     Integer temp = table [index-1];
     table[index-1] = table[index];
     table[index] = temp;
   }
  }

  static void Impression() {
    // Affichage du tableau
    Integer n = table.length-1;
   for (Integer i = 1; i <= n; i ++)
    print.info(table[i] + " , ");

  }

  static void Initialisation() {
    // remplissage aléatoire du tableau
    Integer n = table.length-1 ;
    for (Integer i =  1; i <= n;i ++)
      table[i] =(int)(Math.random()*100);
  }

  public static void  main ( String [ ] args )    {
    Initialisation();
    print.info("Tableau initial :");
    Impression();
    TriBulle();
    print.info("Tableau une fois trié :");
    Impression();
  }
 }
