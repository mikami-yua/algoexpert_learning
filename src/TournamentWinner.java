import java.util.ArrayList;
import java.util.HashMap;

public class TournamentWinner {
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        HashMap<String,Integer> score=new HashMap<>();
        for (int i=0;i<competitions.size();i++){
            if (results.get(i)==0){
                if (score.containsKey(competitions.get(i).get(1))){
                    score.put(competitions.get(i).get(1),score.get(competitions.get(i).get(1))+3);
                }else {
                    score.put(competitions.get(i).get(1),3);
                }
            }else {
                if (score.containsKey(competitions.get(i).get(0))){
                    score.put(competitions.get(i).get(0),score.get(competitions.get(i).get(0))+3);
                }else {
                    score.put(competitions.get(i).get(0),3);
                }
            }
        }

        String ans="";
        int maxNum=Integer.MIN_VALUE;
        for (String string:score.keySet()) {
            if (maxNum<score.get(string)){
                ans=string;
                maxNum=score.get(string);
            }
        }
        return ans;
    }
}
