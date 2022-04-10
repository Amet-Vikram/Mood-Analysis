

public class MoodAnalyser {
    private String msg;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String msg){
        this.msg = msg;
    }

    public String analyseMood() {
        try {
            if(msg.contains("sad")){
                return "Sad";
            }
            return "Happy";
        }
        catch (NullPointerException e){
            return "Message is empty.";
        }
    }

//    public static void main(String[] args) {
//        MoodAnalyser ma = new MoodAnalyser(null);
//        System.out.println(ma.analyseMood());
//    }
}