public class Main {
    public static void main(String[] args) {
        double summerCost= 250.00;
        double fallCost= 150.00;
        double winterCost= 300.00;
        double springCost= 380.00;

        //Calculate total yearly maintenance cost
        double totalYearlyCost= summerCost+fallCost+winterCost+springCost;
        //Display seasonal cost
        System.out.println("The summer cost was: "+summerCost);
        System.out.println("The fall cost was: "+fallCost);
        System.out.println("The winter cost was: "+winterCost);
        System.out.println("The spring cost was: "+springCost);
        System.out.println("The yearly maintenance cost is:" +totalYearlyCost);

    }
}