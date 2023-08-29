public class LogicalOR{
    public static void main(String[] args) {
        String org = "Scaler";
        if(org == "Scaler" | org == "Scalers")
        {
            System.out.println("User is permitted");
        }
        else
        {
            System.out.println("User is not permitted");
        }
    }
}