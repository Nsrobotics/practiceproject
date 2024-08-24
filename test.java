public class test{
    public static void main(String[]args){
        paperbeatsrock();
        rockbeatsscissors();
        scissorslosestorock();

    }
    public static void paperbeatsrock(){
        Rocket rocket;
        rocket = new Rocket();
        OutCome outcome = rocket.play(RpsThrow.PAPER,RpsThrow.ROCK);
        if (outcome == OutCome.P1WIN){
            System.out.println("test passses");
            
        } else{
            System.out.println("test fails");
        }
    }
    public static void rockbeatsscissors(){
        Rocket rocket;
        rocket = new Rocket();
        OutCome outcome = rocket.play(RpsThrow.ROCK,RpsThrow.SCISSORS);
        if (outcome == OutCome.P1WIN){
            System.out.println("test passses");
            
        } else{
            System.out.println("test fails");
        }
    }
    public static void scissorslosestorock(){
        Rocket rocket;
        rocket = new Rocket();
        OutCome outcome = rocket.play(RpsThrow.SCISSORS,RpsThrow.ROCK);
        if (outcome == OutCome.P2WIN){
            System.out.println("test passses");
            
        } else{
            System.out.println("test fails");
        }
    }
}
