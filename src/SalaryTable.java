
public class SalaryTable {

    public static void main(String[] args) {
        double oldsal = 0, raise=0, newsal=40000;

        System.out.format("%s%22s%18s%23s\n", "YEAR", "OLD SALARY", "RAISE", "NEW SALARY");
        System.out.format("%s%22s%18s%23s\n", "----", "----------", "-----", "----------");
        System.out.println(" 1\t\t   $---\t\t      $40000\t\t   $40000");
        
        for (int years = 2; years <= 10; years++) {
            raise = newsal*0.03;
            System.out.format("%2d%22.2f%20.2f%23.2f\n",years,oldsal,raise,newsal);
            newsal = raise+newsal;
            oldsal = newsal;
        }
        
    }
    
}
