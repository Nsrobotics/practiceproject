public class Rocket {
    public OutCome play(RpsThrow p1Throw,RpsThrow p2Throw){
        if(p1Throw == RpsThrow.SCISSORS)
            return OutCome.P2WIN;
        return OutCome.P1WIN;
    }

}