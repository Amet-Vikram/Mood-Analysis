

public class MoodAnalyser {
    private String msg;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String msg){
        this.msg = msg;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if(msg.contains("sad")){
                return "Sad";
            }
            return "Happy";
        }
        catch (NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL, "Message is Empty.");
        }
    }

//    public static void main(String[] args) {
//        MoodAnalyser ma = new MoodAnalyser(null);
//        System.out.println(ma.analyseMood());
//    }
}